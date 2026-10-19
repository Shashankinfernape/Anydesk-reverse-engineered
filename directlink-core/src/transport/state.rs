//! Session State Machine
//!
//! Replicates AnyNet's connection lifecycle states from `ad_anynet_direct_state_handler` (ELF VA `0x011E3614`).

use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, PartialEq, Eq, Serialize, Deserialize)]
pub enum SessionState {
    /// Initial dormant state before connection is requested
    Idle,
    /// Querying signaling / discovery service for target peer endpoints
    ResolvingPeer,
    /// Concurrently racing direct P2P candidates vs relay fallback
    RacingCandidates {
        direct_endpoints: usize,
        relay_attempted: bool,
    },
    /// Performing X25519 Diffie-Hellman cryptographic handshake & authentication
    Handshaking,
    /// Waiting for remote host user consent (if unattended access is not configured)
    WaitingForConsent,
    /// Fully established, bidirectional encrypted streaming session
    ActiveStreaming {
        session_id: u64,
        is_direct: bool,
    },
    /// Temporary network disruption; attempting stateful reconnection
    Reconnecting {
        attempt: u32,
        backoff_ms: u64,
    },
    /// Terminal state; sockets and resources released
    Terminated {
        reason: String,
    },
}

impl SessionState {
    pub fn is_active(&self) -> bool {
        matches!(self, SessionState::ActiveStreaming { .. })
    }

    pub fn is_terminated(&self) -> bool {
        matches!(self, SessionState::Terminated { .. })
    }
}
