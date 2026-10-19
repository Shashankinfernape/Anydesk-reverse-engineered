//! Session Control & Signaling Messages
//!
//! Mirrors AnyNet control descriptors:
//! - `offline_msg_t`
//! - `disconnect_msg_t`
//! - `request_send_msg_t`
//! - `resume_connections_msg_t`
//! - `suspend_connections_msg_t`

use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, PartialEq, Eq, Serialize, Deserialize)]
pub enum ControlMessage {
    Ping {
        client_timestamp_ms: u64,
    },
    Pong {
        client_timestamp_ms: u64,
        server_timestamp_ms: u64,
    },
    Disconnect {
        code: DisconnectCode,
        reason: String,
    },
    FlowControl {
        window_size_bytes: u32,
        acked_sequence: u32,
    },
    Suspend,
    Resume,
}

#[derive(Debug, Clone, Copy, PartialEq, Eq, Serialize, Deserialize)]
pub enum DisconnectCode {
    UserClosed = 0,
    Timeout = 1,
    AuthFailed = 2,
    NetworkError = 3,
    SessionReplaced = 4,
    InternalError = 5,
}
