//! 16-Byte Fixed Wire Framing Header
//!
//! Binary Layout:
//! [0..4]   Magic Bytes (0x444C494E = 'DLIN')
//! [4..6]   Channel ID (u16, little-endian: 0=Input, 1=Control, 2=Audio, 3=Video, 4=File)
//! [6..8]   Packet Flags (u16, little-endian: SYN, ACK, FIN, KEYFRAME, COMPRESSED, FRAGMENT)
//! [8..12]  Sequence Number (u32, little-endian)
//! [12..16] Payload Length (u32, little-endian)

use bytes::{Buf, BufMut, Bytes, BytesMut};
use thiserror::Error;

use super::channels::Channel;
use super::flags::PacketFlags;

pub const WIRE_MAGIC: u32 = 0x444C494E; // 'DLIN'
pub const HEADER_SIZE: usize = 16;
pub const MAX_PAYLOAD_SIZE: usize = 16 * 1024 * 1024; // 16 MB max frame packet

#[derive(Debug, Error, PartialEq, Eq)]
pub enum ProtocolError {
    #[error("Invalid magic: expected 0x{expected:08X}, got 0x{actual:08X}")]
    InvalidMagic { expected: u32, actual: u32 },
    #[error("Unknown channel ID: {0}")]
    UnknownChannel(u16),
    #[error("Payload length {0} exceeds maximum allowed {MAX_PAYLOAD_SIZE}")]
    PayloadTooLarge(usize),
    #[error("Buffer underflow: needed {needed} bytes, had {available}")]
    BufferUnderflow { needed: usize, available: usize },
    #[error("Packet integrity checksum failed")]
    ChecksumMismatch,
    #[error("Decryption failed")]
    DecryptionFailed,
    #[error("Connection closed gracefully")]
    ConnectionClosed,
}

#[derive(Debug, Clone, Copy, PartialEq, Eq)]
pub struct WireHeader {
    pub magic: u32,
    pub channel: Channel,
    pub flags: PacketFlags,
    pub seq: u32,
    pub length: u32,
}

impl WireHeader {
    pub const fn new(channel: Channel, flags: PacketFlags, seq: u32, length: u32) -> Self {
        Self {
            magic: WIRE_MAGIC,
            channel,
            flags,
            seq,
            length,
        }
    }

    /// Serialize header into a 16-byte fixed buffer.
    pub fn write_to<B: BufMut>(&self, buf: &mut B) {
        buf.put_u32_le(self.magic);
        buf.put_u16_le(self.channel.as_u16());
        buf.put_u16_le(self.flags.0);
        buf.put_u32_le(self.seq);
        buf.put_u32_le(self.length);
    }

    /// Serialize header into a new 16-byte array.
    pub fn to_bytes(&self) -> [u8; HEADER_SIZE] {
        let mut buf = [0u8; HEADER_SIZE];
        buf[0..4].copy_from_slice(&self.magic.to_le_bytes());
        buf[4..6].copy_from_slice(&self.channel.as_u16().to_le_bytes());
        buf[6..8].copy_from_slice(&self.flags.0.to_le_bytes());
        buf[8..12].copy_from_slice(&self.seq.to_le_bytes());
        buf[12..16].copy_from_slice(&self.length.to_le_bytes());
        buf
    }

    /// Parse header from a byte slice.
    pub fn from_bytes(slice: &[u8]) -> Result<Self, ProtocolError> {
        if slice.len() < HEADER_SIZE {
            return Err(ProtocolError::BufferUnderflow {
                needed: HEADER_SIZE,
                available: slice.len(),
            });
        }

        let magic = u32::from_le_bytes([slice[0], slice[1], slice[2], slice[3]]);
        if magic != WIRE_MAGIC {
            return Err(ProtocolError::InvalidMagic {
                expected: WIRE_MAGIC,
                actual: magic,
            });
        }

        let channel_raw = u16::from_le_bytes([slice[4], slice[5]]);
        let channel = Channel::from_u16(channel_raw).ok_or(ProtocolError::UnknownChannel(channel_raw))?;

        let flags = PacketFlags(u16::from_le_bytes([slice[6], slice[7]]));
        let seq = u32::from_le_bytes([slice[8], slice[9], slice[10], slice[11]]);
        let length = u32::from_le_bytes([slice[12], slice[13], slice[14], slice[15]]);

        if length as usize > MAX_PAYLOAD_SIZE {
            return Err(ProtocolError::PayloadTooLarge(length as usize));
        }

        Ok(Self {
            magic,
            channel,
            flags,
            seq,
            length,
        })
    }
}

/// A complete wire packet comprising header and payload bytes.
#[derive(Debug, Clone, PartialEq, Eq)]
pub struct WirePacket {
    pub header: WireHeader,
    pub payload: Bytes,
}

impl WirePacket {
    pub fn new(channel: Channel, flags: PacketFlags, seq: u32, payload: Bytes) -> Self {
        let length = payload.len() as u32;
        Self {
            header: WireHeader::new(channel, flags, seq, length),
            payload,
        }
    }

    /// Serialize entire packet (header + payload) into a continuous buffer.
    pub fn serialize(&self) -> Bytes {
        let mut buf = BytesMut::with_capacity(HEADER_SIZE + self.payload.len());
        self.header.write_to(&mut buf);
        buf.extend_from_slice(&self.payload);
        buf.freeze()
    }

    /// Parse a wire packet from a buffer if full packet is present.
    /// Returns Ok(None) if more data is needed (partial packet received).
    pub fn parse(buf: &mut BytesMut) -> Result<Option<Self>, ProtocolError> {
        if buf.len() < HEADER_SIZE {
            return Ok(None);
        }

        let header = WireHeader::from_bytes(&buf[..HEADER_SIZE])?;
        let total_size = HEADER_SIZE + header.length as usize;

        if buf.len() < total_size {
            return Ok(None); // Need more bytes from socket
        }

        buf.advance(HEADER_SIZE);
        let payload = buf.split_to(header.length as usize).freeze();

        Ok(Some(Self { header, payload }))
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_header_roundtrip() {
        let original = WireHeader::new(Channel::Input, PacketFlags(PacketFlags::KEYFRAME | PacketFlags::SYN), 42, 1024);
        let bytes = original.to_bytes();
        let parsed = WireHeader::from_bytes(&bytes).unwrap();
        assert_eq!(original, parsed);
    }

    #[test]
    fn test_packet_streaming_parse() {
        let mut buffer = BytesMut::new();
        let payload = Bytes::from_static(b"HELLO DIRECTLINK WIRE TRANSPORT");
        let packet = WirePacket::new(Channel::Control, PacketFlags::empty(), 1, payload.clone());

        let serialized = packet.serialize();

        // Feed partial bytes (less than header)
        buffer.extend_from_slice(&serialized[..8]);
        assert_eq!(WirePacket::parse(&mut buffer).unwrap(), None);

        // Feed rest of header but partial payload
        buffer.extend_from_slice(&serialized[8..20]);
        assert_eq!(WirePacket::parse(&mut buffer).unwrap(), None);

        // Feed remainder
        buffer.extend_from_slice(&serialized[20..]);
        let parsed = WirePacket::parse(&mut buffer).unwrap().expect("Packet should be complete");

        assert_eq!(parsed.header.channel, Channel::Control);
        assert_eq!(parsed.header.seq, 1);
        assert_eq!(parsed.payload, payload);
        assert!(buffer.is_empty());
    }

    #[test]
    fn test_invalid_magic() {
        let mut raw = [0u8; HEADER_SIZE];
        raw[0..4].copy_from_slice(&0xDEADBEEFu32.to_le_bytes());
        assert!(matches!(WireHeader::from_bytes(&raw), Err(ProtocolError::InvalidMagic { .. })));
    }
}
