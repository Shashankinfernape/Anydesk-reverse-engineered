//! Connection Handshake Messages
//!
//! Replicates `relay_connect_msg_t` and AnyNet direct handshake structures.

use serde::{Deserialize, Serialize};
use crate::capabilities::SessionCapabilities;
use crate::crypto::identity::ClientId;

pub const CURRENT_PROTOCOL_VERSION: &str = "directlink/1.0 (compatible AnyNet/9.8.2)";

/// Initial connection request packet sent by viewer to host (or to relay).
#[derive(Debug, Clone, PartialEq, Eq, Serialize, Deserialize)]
pub struct ConnectMessage {
    pub client_id: ClientId,
    pub target_id: ClientId,
    pub ephemeral_public: [u8; 32],
    pub capabilities: SessionCapabilities,
    pub version: String,
    pub auth_salt: [u8; 16],
    pub auth_token_hash: Option<[u8; 32]>,
}

#[derive(Debug, Clone, Copy, PartialEq, Eq, Serialize, Deserialize)]
pub enum ConnectStatus {
    Accepted = 0,
    WaitingForUserApproval = 1,
    RejectedByUser = 2,
    InvalidCredentials = 3,
    IncompatibleCapabilities = 4,
    HostBusy = 5,
}

/// Host response to connection request.
#[derive(Debug, Clone, PartialEq, Eq, Serialize, Deserialize)]
pub struct ConnectResponseMessage {
    pub status: ConnectStatus,
    pub session_id: u64,
    pub host_ephemeral_public: [u8; 32],
    pub agreed_capabilities: SessionCapabilities,
    pub server_version: String,
}
