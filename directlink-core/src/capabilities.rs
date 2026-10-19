//! 64-Bit Session Capability Bitmask
//!
//! Replicated directly from AnyDesk `deskrt_codec_capability_dispatch` (ELF VA `0x00FDAA44`).
//! Controls negotiated feature support across viewer and host instances.

use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, Copy, PartialEq, Eq, Hash, Serialize, Deserialize)]
pub struct SessionCapabilities(pub u64);

impl SessionCapabilities {
    pub const SOUND_SRC: u64 = 1 << 0;
    pub const SOUND_SINK: u64 = 1 << 1;
    pub const KEYBOARD_SINK: u64 = 1 << 2;
    pub const KEYBOARD2: u64 = 1 << 3;
    pub const SWITCH_SIDES: u64 = 1 << 4;
    pub const REQUEST_ELEVATION: u64 = 1 << 5;
    pub const REQUEST_ELEVATION_PW: u64 = 1 << 6;
    pub const CLIP_PASTE_FILES: u64 = 1 << 7;
    pub const CLIP_SRC_FILES: u64 = 1 << 8;
    pub const SEND_SAS: u64 = 1 << 9;
    pub const BLOCK_INPUT: u64 = 1 << 10;
    pub const REQUEST_VP_DIMENSIONS: u64 = 1 << 11;
    pub const KEYBOARD_UNICODE: u64 = 1 << 12;
    pub const SYSINFO: u64 = 1 << 13;
    pub const VOLATILE_TOKEN: u64 = 1 << 15;
    pub const KEYB_HINT_SINK: u64 = 1 << 16;
    pub const FILETRANSFER_SERVER: u64 = 1 << 18;
    pub const FILETRANSFER_CLIENT: u64 = 1 << 19;
    pub const REMOTE_PRINTING: u64 = 1 << 22;
    pub const TCP_TUNNEL: u64 = 1 << 24;
    pub const VPN: u64 = 1 << 26;
    pub const MOTION_INPUT: u64 = 1 << 27;
    pub const TWO_FACTOR_AUTH: u64 = 1 << 29;
    pub const REVERSE_REMOTE_PRINTING: u64 = 1 << 30;
    pub const LOSSLESS_CODEC: u64 = 1 << 33;
    pub const REPORT_KBD_FOCUS: u64 = 1 << 34;
    pub const STRING_INPUT: u64 = 1 << 36;
    pub const QUALITY_ADAPTIVE: u64 = 1 << 37;
    pub const CLIPBOARD_SPLIT: u64 = 1 << 38;
    pub const RELATIVE_MOUSE_INPUT: u64 = 1 << 41;
    pub const VIDEO_MODE: u64 = 1 << 42;
    pub const REMOTE_RESTART_PW: u64 = 1 << 44;
    pub const KEYB_HINT_SINK_EXT: u64 = 1 << 45;
    pub const SWITCH_USER: u64 = 1 << 47;
    pub const LOGOFF_SESSION: u64 = 1 << 48;
    pub const NO_CHAT_FEATURE: u64 = 1 << 50;
    pub const REMOTE_SHELL: u64 = 1 << 53;

    /// Create an empty capabilities mask.
    pub const fn empty() -> Self {
        Self(0)
    }

    /// Create standard default capabilities for modern desktop viewer/host.
    pub const fn default_desktop() -> Self {
        Self(
            Self::SOUND_SRC
                | Self::SOUND_SINK
                | Self::KEYBOARD2
                | Self::KEYBOARD_UNICODE
                | Self::CLIP_PASTE_FILES
                | Self::CLIP_SRC_FILES
                | Self::SEND_SAS
                | Self::BLOCK_INPUT
                | Self::REQUEST_VP_DIMENSIONS
                | Self::SYSINFO
                | Self::FILETRANSFER_SERVER
                | Self::FILETRANSFER_CLIENT
                | Self::MOTION_INPUT
                | Self::LOSSLESS_CODEC
                | Self::STRING_INPUT
                | Self::QUALITY_ADAPTIVE
                | Self::CLIPBOARD_SPLIT
                | Self::RELATIVE_MOUSE_INPUT
                | Self::VIDEO_MODE,
        )
    }

    /// Check if a specific capability flag is enabled.
    pub const fn has(&self, flag: u64) -> bool {
        (self.0 & flag) == flag
    }

    /// Enable a capability flag.
    pub fn enable(&mut self, flag: u64) {
        self.0 |= flag;
    }

    /// Disable a capability flag.
    pub fn disable(&mut self, flag: u64) {
        self.0 &= !flag;
    }

    /// Intersect (negotiate) capabilities between client and host.
    pub const fn negotiate(&self, other: &Self) -> Self {
        Self(self.0 & other.0)
    }

    /// Returns a list of human-readable feature string names active in this bitmask.
    pub fn active_feature_names(&self) -> Vec<&'static str> {
        let mut list = Vec::new();
        let mappings: &[(u64, &'static str)] = &[
            (Self::SOUND_SRC, "sound_src"),
            (Self::SOUND_SINK, "sound_sink"),
            (Self::KEYBOARD_SINK, "keyboard_sink"),
            (Self::KEYBOARD2, "keyboard2"),
            (Self::SWITCH_SIDES, "switch_sides"),
            (Self::REQUEST_ELEVATION, "request_elevation"),
            (Self::REQUEST_ELEVATION_PW, "request_elevation_pw"),
            (Self::CLIP_PASTE_FILES, "clip_paste_files"),
            (Self::CLIP_SRC_FILES, "clip_src_files"),
            (Self::SEND_SAS, "send_sas"),
            (Self::BLOCK_INPUT, "block_input"),
            (Self::REQUEST_VP_DIMENSIONS, "request_vp_dimensions"),
            (Self::KEYBOARD_UNICODE, "keyboard_unicode"),
            (Self::SYSINFO, "sysinfo"),
            (Self::VOLATILE_TOKEN, "volatile_token"),
            (Self::KEYB_HINT_SINK, "keyb_hint_sink"),
            (Self::FILETRANSFER_SERVER, "filetransfer_server"),
            (Self::FILETRANSFER_CLIENT, "filetransfer_client"),
            (Self::REMOTE_PRINTING, "remote_printing"),
            (Self::TCP_TUNNEL, "tcp_tunnel"),
            (Self::VPN, "vpn"),
            (Self::MOTION_INPUT, "motion_input"),
            (Self::TWO_FACTOR_AUTH, "two_factor_auth"),
            (Self::REVERSE_REMOTE_PRINTING, "reverse_remote_printing"),
            (Self::LOSSLESS_CODEC, "lossless_codec"),
            (Self::REPORT_KBD_FOCUS, "report_kbd_focus"),
            (Self::STRING_INPUT, "string_input"),
            (Self::QUALITY_ADAPTIVE, "quality_adaptive"),
            (Self::CLIPBOARD_SPLIT, "clipboard_split"),
            (Self::RELATIVE_MOUSE_INPUT, "relative_mouse_input"),
            (Self::VIDEO_MODE, "video_mode"),
            (Self::REMOTE_RESTART_PW, "remote_restart_pw"),
            (Self::KEYB_HINT_SINK_EXT, "keyb_hint_sink_ext"),
            (Self::SWITCH_USER, "switch_user"),
            (Self::LOGOFF_SESSION, "logoff_session"),
            (Self::NO_CHAT_FEATURE, "no_chat_feature"),
            (Self::REMOTE_SHELL, "remote_shell"),
        ];

        for &(flag, name) in mappings {
            if self.has(flag) {
                list.push(name);
            }
        }
        list
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_capability_bitmask_operations() {
        let mut caps = SessionCapabilities::empty();
        assert!(!caps.has(SessionCapabilities::SOUND_SRC));

        caps.enable(SessionCapabilities::SOUND_SRC | SessionCapabilities::LOSSLESS_CODEC);
        assert!(caps.has(SessionCapabilities::SOUND_SRC));
        assert!(caps.has(SessionCapabilities::LOSSLESS_CODEC));
        assert!(!caps.has(SessionCapabilities::KEYBOARD2));

        caps.disable(SessionCapabilities::SOUND_SRC);
        assert!(!caps.has(SessionCapabilities::SOUND_SRC));
        assert!(caps.has(SessionCapabilities::LOSSLESS_CODEC));
    }

    #[test]
    fn test_negotiation() {
        let client = SessionCapabilities(SessionCapabilities::KEYBOARD2 | SessionCapabilities::LOSSLESS_CODEC | SessionCapabilities::SOUND_SRC);
        let host = SessionCapabilities(SessionCapabilities::KEYBOARD2 | SessionCapabilities::LOSSLESS_CODEC | SessionCapabilities::FILETRANSFER_SERVER);
        let agreed = client.negotiate(&host);

        assert!(agreed.has(SessionCapabilities::KEYBOARD2));
        assert!(agreed.has(SessionCapabilities::LOSSLESS_CODEC));
        assert!(!agreed.has(SessionCapabilities::SOUND_SRC));
        assert!(!agreed.has(SessionCapabilities::FILETRANSFER_SERVER));
    }
}
