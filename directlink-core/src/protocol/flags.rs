//! Wire Packet Flags

use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, Copy, PartialEq, Eq, Hash, Serialize, Deserialize)]
pub struct PacketFlags(pub u16);

impl PacketFlags {
    pub const NONE: u16 = 0x0000;
    pub const SYN: u16 = 0x0001;
    pub const ACK: u16 = 0x0002;
    pub const FIN: u16 = 0x0004;
    pub const KEYFRAME: u16 = 0x0008;
    pub const COMPRESSED: u16 = 0x0010;
    pub const FRAGMENT: u16 = 0x0020;
    pub const ENCRYPTED: u16 = 0x0040;
    pub const RESEND: u16 = 0x0080;

    pub const fn empty() -> Self {
        Self(0)
    }

    pub const fn has(&self, flag: u16) -> bool {
        (self.0 & flag) == flag
    }

    pub fn set(&mut self, flag: u16) {
        self.0 |= flag;
    }

    pub fn clear(&mut self, flag: u16) {
        self.0 &= !flag;
    }
}
