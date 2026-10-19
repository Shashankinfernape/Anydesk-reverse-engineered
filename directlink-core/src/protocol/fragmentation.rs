//! Sub-MTU Packet Fragmentation Engine
//!
//! Mirrors AnyNet's `fragment_data_t` (recovered from `.rodata` at ELF VA `0x00422262`).
//! Handles splitting large video frames and file payloads into MTU-safe fragments
//! and robustly reassembling them in memory.

use std::collections::HashMap;
use bytes::{Bytes, BytesMut};
use super::channels::Channel;
use super::flags::PacketFlags;
use super::header::{ProtocolError, WirePacket};

pub const DEFAULT_MTU_FRAGMENT_SIZE: usize = 1350; // Safe for UDP IPv4/IPv6 networks

/// 8-byte Fragment Header prepended to fragmented payloads
#[derive(Debug, Clone, Copy, PartialEq, Eq)]
pub struct FragmentHeader {
    pub original_seq: u32,
    pub fragment_index: u16,
    pub total_fragments: u16,
}

impl FragmentHeader {
    pub const SIZE: usize = 8;

    pub fn to_bytes(&self) -> [u8; Self::SIZE] {
        let mut buf = [0u8; Self::SIZE];
        buf[0..4].copy_from_slice(&self.original_seq.to_le_bytes());
        buf[4..6].copy_from_slice(&self.fragment_index.to_le_bytes());
        buf[6..8].copy_from_slice(&self.total_fragments.to_le_bytes());
        buf
    }

    pub fn from_slice(slice: &[u8]) -> Option<Self> {
        if slice.len() < Self::SIZE {
            return None;
        }
        let original_seq = u32::from_le_bytes([slice[0], slice[1], slice[2], slice[3]]);
        let fragment_index = u16::from_le_bytes([slice[4], slice[5]]);
        let total_fragments = u16::from_le_bytes([slice[6], slice[7]]);
        Some(Self {
            original_seq,
            fragment_index,
            total_fragments,
        })
    }
}

/// Splits a large WirePacket into an array of MTU-sized fragment WirePackets.
pub fn fragment_packet(packet: &WirePacket, max_fragment_size: usize) -> Vec<WirePacket> {
    if packet.payload.len() <= max_fragment_size {
        return vec![packet.clone()];
    }

    let payload_chunk_size = max_fragment_size - FragmentHeader::SIZE;
    let total_fragments = ((packet.payload.len() + payload_chunk_size - 1) / payload_chunk_size) as u16;
    let mut fragments = Vec::with_capacity(total_fragments as usize);

    for idx in 0..total_fragments {
        let start = idx as usize * payload_chunk_size;
        let end = (start + payload_chunk_size).min(packet.payload.len());
        let chunk = &packet.payload[start..end];

        let frag_hdr = FragmentHeader {
            original_seq: packet.header.seq,
            fragment_index: idx,
            total_fragments,
        };

        let mut frag_payload = BytesMut::with_capacity(FragmentHeader::SIZE + chunk.len());
        frag_payload.extend_from_slice(&frag_hdr.to_bytes());
        frag_payload.extend_from_slice(chunk);

        let mut flags = packet.header.flags;
        flags.set(PacketFlags::FRAGMENT);

        fragments.push(WirePacket::new(
            packet.header.channel,
            flags,
            packet.header.seq,
            frag_payload.freeze(),
        ));
    }

    fragments
}

/// In-flight reassembly tracker for an individual packet sequence
struct InFlightReassembly {
    channel: Channel,
    flags: PacketFlags,
    total_fragments: u16,
    received_count: u16,
    chunks: Vec<Option<Bytes>>,
}

/// Reassembly buffer that reconstructs fragmented packets as they arrive out of order
pub struct ReassemblyBuffer {
    in_flight: HashMap<u32, InFlightReassembly>,
    max_in_flight: usize,
}

impl ReassemblyBuffer {
    pub fn new(max_in_flight: usize) -> Self {
        Self {
            in_flight: HashMap::new(),
            max_in_flight,
        }
    }

    /// Feed a received packet. If it's not fragmented, returns Some(packet).
    /// If it is a fragment, buffers it and returns Some(reassembled_packet) once all fragments arrive.
    pub fn process_incoming(&mut self, packet: WirePacket) -> Result<Option<WirePacket>, ProtocolError> {
        if !packet.header.flags.has(PacketFlags::FRAGMENT) {
            return Ok(Some(packet));
        }

        let frag_hdr = FragmentHeader::from_slice(&packet.payload)
            .ok_or(ProtocolError::BufferUnderflow {
                needed: FragmentHeader::SIZE,
                available: packet.payload.len(),
            })?;

        let chunk = packet.payload.slice(FragmentHeader::SIZE..);
        let seq = frag_hdr.original_seq;

        if !self.in_flight.contains_key(&seq) {
            if self.in_flight.len() >= self.max_in_flight {
                // Drop oldest entry to prevent memory exhaustion
                if let Some(&oldest_seq) = self.in_flight.keys().next() {
                    self.in_flight.remove(&oldest_seq);
                }
            }
            self.in_flight.insert(
                seq,
                InFlightReassembly {
                    channel: packet.header.channel,
                    flags: packet.header.flags,
                    total_fragments: frag_hdr.total_fragments,
                    received_count: 0,
                    chunks: vec![None; frag_hdr.total_fragments as usize],
                },
            );
        }

        let reassembly = self.in_flight.get_mut(&seq).unwrap();
        let idx = frag_hdr.fragment_index as usize;

        if idx < reassembly.chunks.len() && reassembly.chunks[idx].is_none() {
            reassembly.chunks[idx] = Some(chunk);
            reassembly.received_count += 1;
        }

        if reassembly.received_count == reassembly.total_fragments {
            let reassembly = self.in_flight.remove(&seq).unwrap();
            let total_bytes: usize = reassembly.chunks.iter().filter_map(|c| c.as_ref().map(|b| b.len())).sum();
            let mut full_payload = BytesMut::with_capacity(total_bytes);

            for chunk_opt in reassembly.chunks {
                if let Some(c) = chunk_opt {
                    full_payload.extend_from_slice(&c);
                }
            }

            let mut final_flags = reassembly.flags;
            final_flags.clear(PacketFlags::FRAGMENT);

            Ok(Some(WirePacket::new(
                reassembly.channel,
                final_flags,
                seq,
                full_payload.freeze(),
            )))
        } else {
            Ok(None)
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_fragmentation_and_reassembly() {
        // Create 10 KB video frame payload
        let mut big_data = Vec::with_capacity(10000);
        for i in 0..10000 {
            big_data.push((i % 256) as u8);
        }
        let original_payload = Bytes::from(big_data);
        let original_packet = WirePacket::new(
            Channel::Video,
            PacketFlags(PacketFlags::KEYFRAME),
            101,
            original_payload.clone(),
        );

        let fragments = fragment_packet(&original_packet, 1000);
        assert!(fragments.len() > 10);

        let mut reassembly = ReassemblyBuffer::new(32);
        let mut result = None;

        // Feed fragments out of order
        let mut reordered = fragments.clone();
        reordered.reverse();

        for frag in reordered {
            if let Some(reassembled) = reassembly.process_incoming(frag).unwrap() {
                result = Some(reassembled);
            }
        }

        let final_packet = result.expect("Should have reassembled full packet");
        assert_eq!(final_packet.header.channel, Channel::Video);
        assert_eq!(final_packet.header.seq, 101);
        assert!(!final_packet.header.flags.has(PacketFlags::FRAGMENT));
        assert!(final_packet.header.flags.has(PacketFlags::KEYFRAME));
        assert_eq!(final_packet.payload, original_payload);
    }
}
