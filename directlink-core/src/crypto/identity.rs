//! Peer Identity & 9-Digit Client ID Generation
//!
//! Generates a canonical 9-digit AnyDesk-style client ID from the peer's public key
//! and provides formatting (e.g. "123 456 789").

use serde::{Deserialize, Serialize};
use x25519_dalek::{PublicKey, StaticSecret};

#[derive(Debug, Clone, Copy, PartialEq, Eq, Hash, Serialize, Deserialize)]
pub struct ClientId(pub u32);

impl ClientId {
    /// Derives a consistent 9-digit numeric client ID from an X25519 public key.
    pub fn from_public_key(pubkey: &PublicKey) -> Self {
        let crc = crc32fast::hash(pubkey.as_bytes());
        // Map into range [100_000_000 .. 999_999_999]
        let id = (crc % 900_000_000) + 100_000_000;
        Self(id)
    }

    /// Formats as 3 groups of 3 digits: "XXX XXX XXX" (e.g. "123 456 789")
    pub fn formatted(&self) -> String {
        let s = format!("{:09}", self.0);
        format!("{} {} {}", &s[0..3], &s[3..6], &s[6..9])
    }

    /// Parse from either raw numeric string "123456789" or formatted "123 456 789"
    pub fn parse(input: &str) -> Option<Self> {
        let clean: String = input.chars().filter(|c| c.is_ascii_digit()).collect();
        if clean.len() == 9 {
            clean.parse::<u32>().ok().map(Self)
        } else {
            None
        }
    }
}

/// Long-term device identity holding static secrets
#[derive(Clone)]
pub struct DeviceIdentity {
    pub secret: StaticSecret,
    pub public_key: PublicKey,
    pub client_id: ClientId,
}

impl DeviceIdentity {
    /// Generate a fresh random identity using system CSPRNG
    pub fn generate() -> Self {
        let secret = StaticSecret::random_from_rng(rand::rngs::OsRng);
        let public_key = PublicKey::from(&secret);
        let client_id = ClientId::from_public_key(&public_key);
        Self {
            secret,
            public_key,
            client_id,
        }
    }

    /// Instantiate from 32-byte raw secret scalar
    pub fn from_secret_bytes(bytes: [u8; 32]) -> Self {
        let secret = StaticSecret::from(bytes);
        let public_key = PublicKey::from(&secret);
        let client_id = ClientId::from_public_key(&public_key);
        Self {
            secret,
            public_key,
            client_id,
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_client_id_formatting_and_parsing() {
        let id = ClientId(548123987);
        assert_eq!(id.formatted(), "548 123 987");

        let parsed = ClientId::parse("548 123 987").unwrap();
        assert_eq!(parsed, id);

        let parsed_raw = ClientId::parse("548123987").unwrap();
        assert_eq!(parsed_raw, id);
    }

    #[test]
    fn test_identity_generation_consistency() {
        let id = DeviceIdentity::generate();
        assert!(id.client_id.0 >= 100_000_000 && id.client_id.0 <= 999_999_999);
    }
}
