//! Multi-Channel Priority Packet Scheduler
//!
//! Enforces AnyNet's proven channel priority hierarchy:
//! Channel 0 (Input) > Channel 1 (Control) > Channel 2 (Audio) > Channel 3 (Video) > Channel 4 (FileTransfer).
//! Guarantees that keyboard and mouse input events are dispatched immediately without
//! being stalled behind multi-megabyte video keyframes or large file chunks.

use std::collections::VecDeque;
use bytes::Bytes;
use crate::protocol::channels::Channel;
use crate::protocol::flags::PacketFlags;
use crate::protocol::header::WirePacket;

pub const DEFAULT_MAX_QUEUE_ITEMS: usize = 128;
pub const MAX_VIDEO_QUEUE_ITEMS: usize = 3; // Bounded video ring buffer (drops intermediate frames)

pub struct PriorityScheduler {
    queues: [VecDeque<WirePacket>; 5],
    max_queue_size: usize,
    seq_counter: u32,
}

impl PriorityScheduler {
    pub fn new() -> Self {
        Self {
            queues: [
                VecDeque::with_capacity(DEFAULT_MAX_QUEUE_ITEMS), // Input
                VecDeque::with_capacity(DEFAULT_MAX_QUEUE_ITEMS), // Control
                VecDeque::with_capacity(DEFAULT_MAX_QUEUE_ITEMS), // Audio
                VecDeque::with_capacity(MAX_VIDEO_QUEUE_ITEMS),   // Video
                VecDeque::with_capacity(DEFAULT_MAX_QUEUE_ITEMS), // FileTransfer
            ],
            max_queue_size: DEFAULT_MAX_QUEUE_ITEMS,
            seq_counter: 0,
        }
    }

    /// Enqueue a packet for transmission.
    /// Assigns sequential sequence numbers and respects priority queues.
    pub fn enqueue(&mut self, channel: Channel, flags: PacketFlags, payload: Bytes) -> u32 {
        let seq = self.seq_counter;
        self.seq_counter = self.seq_counter.wrapping_add(1);

        let packet = WirePacket::new(channel, flags, seq, payload);
        let q_idx = channel.as_u16() as usize;

        if channel == Channel::Video {
            // Drop oldest frame if video queue is saturated (backpressure frame dropping)
            if self.queues[q_idx].len() >= MAX_VIDEO_QUEUE_ITEMS {
                self.queues[q_idx].pop_front();
            }
        } else if self.queues[q_idx].len() >= self.max_queue_size {
            // Drop oldest non-critical packet
            self.queues[q_idx].pop_front();
        }

        self.queues[q_idx].push_back(packet);
        seq
    }

    /// Dequeue the highest-priority packet available.
    /// Strictly prioritizes Channel::Input over all other channels.
    pub fn dequeue(&mut self) -> Option<WirePacket> {
        for channel in Channel::ALL {
            let q_idx = channel.as_u16() as usize;
            if let Some(packet) = self.queues[q_idx].pop_front() {
                return Some(packet);
            }
        }
        None
    }

    /// Check if all queues are empty.
    pub fn is_empty(&self) -> bool {
        self.queues.iter().all(|q| q.is_empty())
    }

    /// Total pending packet count across all channels.
    pub fn total_pending(&self) -> usize {
        self.queues.iter().map(|q| q.len()).sum()
    }
}

impl Default for PriorityScheduler {
    fn default() -> Self {
        Self::new()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_priority_scheduling_preempts_video() {
        let mut scheduler = PriorityScheduler::new();

        // Enqueue 3 video frames first
        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"FRAME_1"));
        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"FRAME_2"));
        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"FRAME_3"));

        // Enqueue 1 file transfer packet
        scheduler.enqueue(Channel::FileTransfer, PacketFlags::empty(), Bytes::from_static(b"FILE_CHUNK"));

        // Enqueue an urgent mouse motion event
        scheduler.enqueue(Channel::Input, PacketFlags::empty(), Bytes::from_static(b"MOUSE_MOVE_URGENT"));

        // Enqueue a heartbeat ping
        scheduler.enqueue(Channel::Control, PacketFlags::empty(), Bytes::from_static(b"PING"));

        // Dequeue order MUST be:
        // 1. Channel::Input
        let p1 = scheduler.dequeue().expect("p1");
        assert_eq!(p1.header.channel, Channel::Input);
        assert_eq!(&p1.payload[..], b"MOUSE_MOVE_URGENT");

        // 2. Channel::Control
        let p2 = scheduler.dequeue().expect("p2");
        assert_eq!(p2.header.channel, Channel::Control);
        assert_eq!(&p2.payload[..], b"PING");

        // 3. Channel::Video (FRAME_1)
        let p3 = scheduler.dequeue().expect("p3");
        assert_eq!(p3.header.channel, Channel::Video);
        assert_eq!(&p3.payload[..], b"FRAME_1");

        // 4. Channel::Video (FRAME_2)
        let p4 = scheduler.dequeue().expect("p4");
        assert_eq!(p4.header.channel, Channel::Video);
        assert_eq!(&p4.payload[..], b"FRAME_2");

        // 5. Channel::Video (FRAME_3)
        let p5 = scheduler.dequeue().expect("p5");
        assert_eq!(p5.header.channel, Channel::Video);
        assert_eq!(&p5.payload[..], b"FRAME_3");

        // 6. Channel::FileTransfer
        let p6 = scheduler.dequeue().expect("p6");
        assert_eq!(p6.header.channel, Channel::FileTransfer);
        assert_eq!(&p6.payload[..], b"FILE_CHUNK");

        assert!(scheduler.is_empty());
    }

    #[test]
    fn test_video_queue_saturation_drops_intermediate_frames() {
        let mut scheduler = PriorityScheduler::new();

        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"F1"));
        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"F2"));
        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"F3"));
        // 4th frame should cause F1 to be dropped
        scheduler.enqueue(Channel::Video, PacketFlags::empty(), Bytes::from_static(b"F4"));

        assert_eq!(scheduler.total_pending(), 3);
        let p = scheduler.dequeue().unwrap();
        assert_eq!(&p.payload[..], b"F2");
    }
}
