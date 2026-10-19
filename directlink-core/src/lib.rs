//! # DirectLink Engine Core
//!
//! Clean-room, high-performance remote desktop foundation replicating and modernizing
//! AnyDesk's AnyNet protocol, 5-channel multiplexer, DeskRT capability negotiation,
//! and candidate connection racing engine.

pub mod capabilities;
pub mod crypto;
pub mod messages;
pub mod mux;
pub mod protocol;
pub mod transport;

pub use capabilities::SessionCapabilities;
pub use crypto::{ClientId, DeviceIdentity, SessionCipher, SessionKeys};
pub use messages::{
    ConnectMessage, ConnectResponseMessage, ConnectStatus, ControlMessage, DirtyRect, DisconnectCode,
    InputEvent, MouseButton, TouchAction, VideoFormat, VideoFrameMetadata,
};
pub use mux::PriorityScheduler;
pub use protocol::{
    Channel, FragmentHeader, PacketFlags, ProtocolError, ReassemblyBuffer, WireHeader, WirePacket,
    HEADER_SIZE, WIRE_MAGIC,
};
pub use transport::{CandidateRacer, DirectLinkSession, RacedConnection, SessionState};

/// Canonical DirectLink engine version
pub const ENGINE_VERSION: &str = "0.1.0";
