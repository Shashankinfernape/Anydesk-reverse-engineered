//! Logical Transport Channels
//!
//! Mirrors AnyNet's 5-channel multiplexing hierarchy. Channel 0 (Input) strictly
//! preempts Channel 3 (Video) to ensure zero input lag under high network load.

use serde::{Deserialize, Serialize};

#[repr(u16)]
#[derive(Debug, Clone, Copy, PartialEq, Eq, PartialOrd, Ord, Hash, Serialize, Deserialize)]
pub enum Channel {
    /// Priority 0: Keyboard, Mouse, Touch, Stylus, IME String inputs (Immediate delivery, TCP_NODELAY)
    Input = 0,
    /// Priority 1: Handshake, Heartbeat (Ping/Pong), Session Control, Permissions
    Control = 1,
    /// Priority 2: Opus Real-Time Audio (Microphone & System Audio)
    Audio = 2,
    /// Priority 3: DeskRT Screen Video Tiles (Differential dirty-rect tiles, rate-limited)
    Video = 3,
    /// Priority 4: Chunked File Transfer & Background Clipboard Sync
    FileTransfer = 4,
}

impl Channel {
    pub const ALL: [Channel; 5] = [
        Channel::Input,
        Channel::Control,
        Channel::Audio,
        Channel::Video,
        Channel::FileTransfer,
    ];

    pub const fn from_u16(val: u16) -> Option<Self> {
        match val {
            0 => Some(Channel::Input),
            1 => Some(Channel::Control),
            2 => Some(Channel::Audio),
            3 => Some(Channel::Video),
            4 => Some(Channel::FileTransfer),
            _ => None,
        }
    }

    pub const fn as_u16(&self) -> u16 {
        *self as u16
    }

    /// Returns the priority order: lower number means higher scheduling priority.
    pub const fn priority(&self) -> u8 {
        *self as u8
    }
}
