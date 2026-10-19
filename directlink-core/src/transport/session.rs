//! Active DirectLink Encrypted Session
//!
//! Orchestrates the multi-channel priority scheduler, ChaCha20-Poly1305 AEAD cipher,
//! and socket transmission loop with keepalive heartbeats.

use std::time::{Duration, Instant};
use bytes::BytesMut;
use tokio::io::{AsyncReadExt, AsyncWriteExt};
use tokio::net::TcpStream;

use crate::crypto::cipher::SessionCipher;
use crate::protocol::channels::Channel;
use crate::protocol::flags::PacketFlags;
use crate::protocol::fragmentation::{fragment_packet, ReassemblyBuffer, DEFAULT_MTU_FRAGMENT_SIZE};
use crate::protocol::header::{ProtocolError, WireHeader, WirePacket, HEADER_SIZE};
use crate::mux::scheduler::PriorityScheduler;

pub const PING_INTERVAL: Duration = Duration::from_millis(2000);
pub const TIMEOUT_THRESHOLD: Duration = Duration::from_millis(6000);

pub struct DirectLinkSession {
    stream: TcpStream,
    cipher: SessionCipher,
    scheduler: PriorityScheduler,
    reassembly: ReassemblyBuffer,
    rx_buffer: BytesMut,
    last_rx_time: Instant,
    last_tx_time: Instant,
    pub session_id: u64,
    pub is_direct: bool,
}

impl DirectLinkSession {
    pub fn new(
        stream: TcpStream,
        cipher: SessionCipher,
        session_id: u64,
        is_direct: bool,
    ) -> Self {
        let _ = stream.set_nodelay(true);
        Self {
            stream,
            cipher,
            scheduler: PriorityScheduler::new(),
            reassembly: ReassemblyBuffer::new(64),
            rx_buffer: BytesMut::with_capacity(64 * 1024),
            last_rx_time: Instant::now(),
            last_tx_time: Instant::now(),
            session_id,
            is_direct,
        }
    }

    /// Enqueue an unencrypted packet payload into the multi-channel scheduler.
    pub fn send(&mut self, channel: Channel, flags: PacketFlags, payload: bytes::Bytes) -> u32 {
        self.scheduler.enqueue(channel, flags, payload)
    }

    /// Flush all pending prioritized packets through encryption and onto the wire.
    pub async fn flush_outbound(&mut self) -> Result<usize, ProtocolError> {
        let mut total_sent = 0;

        while let Some(packet) = self.scheduler.dequeue() {
            // Fragment large packets if exceeding MTU
            let fragments = fragment_packet(&packet, DEFAULT_MTU_FRAGMENT_SIZE);

            for frag in fragments {
                // Header with ciphertext length (payload + 16-byte Poly1305 tag)
                let ciphertext_len = (frag.payload.len() + 16) as u32;
                let encrypted_header = WireHeader::new(
                    frag.header.channel,
                    frag.header.flags,
                    frag.header.seq,
                    ciphertext_len,
                );
                let header_bytes = encrypted_header.to_bytes();

                // Encrypt payload with the EXACT 16-byte wire header as Associated Data (AEAD)
                let ciphertext = self.cipher.encrypt(&header_bytes, &frag.payload)?;

                let mut out_buf = BytesMut::with_capacity(HEADER_SIZE + ciphertext.len());
                encrypted_header.write_to(&mut out_buf);
                out_buf.extend_from_slice(&ciphertext);

                self.stream
                    .write_all(&out_buf)
                    .await
                    .map_err(|_| ProtocolError::ConnectionClosed)?;

                total_sent += out_buf.len();
            }
        }

        if total_sent > 0 {
            let _ = self.stream.flush().await;
            self.last_tx_time = Instant::now();
        }

        Ok(total_sent)
    }

    /// Read next incoming plaintext packet from wire, handling decryption and reassembly.
    pub async fn receive_next(&mut self) -> Result<WirePacket, ProtocolError> {
        loop {
            // Check if buffer contains a full wire packet
            if let Some(enc_packet) = WirePacket::parse(&mut self.rx_buffer)? {
                self.last_rx_time = Instant::now();

                let header_bytes = enc_packet.header.to_bytes();
                let plaintext = self.cipher.decrypt(&header_bytes, &enc_packet.payload)?;

                let plain_packet = WirePacket::new(
                    enc_packet.header.channel,
                    enc_packet.header.flags,
                    enc_packet.header.seq,
                    plaintext,
                );

                // Handle reassembly if packet is fragmented
                if let Some(reassembled) = self.reassembly.process_incoming(plain_packet)? {
                    return Ok(reassembled);
                }
                // Fragment buffered, continue reading
                continue;
            }

            // Need more data from socket
            let mut temp_buf = [0u8; 8192];
            let n = self
                .stream
                .read(&mut temp_buf)
                .await
                .map_err(|_| ProtocolError::ConnectionClosed)?;

            if n == 0 {
                return Err(ProtocolError::ConnectionClosed);
            }

            self.rx_buffer.extend_from_slice(&temp_buf[..n]);
        }
    }

    /// Check if session has exceeded heartbeat timeout threshold (6000 ms).
    pub fn is_timed_out(&self) -> bool {
        self.last_rx_time.elapsed() >= TIMEOUT_THRESHOLD
    }
}
