//! X25519 Ephemeral Key Exchange & Key Derivation
//!
//! Generates ephemeral keypairs for session forward secrecy and derives
//! directional 256-bit symmetric keys for ChaCha20-Poly1305.

use sha2::{Digest, Sha256};
use x25519_dalek::{EphemeralSecret, PublicKey};

#[derive(Debug, Clone, Copy, PartialEq, Eq)]
pub struct SessionKeys {
    pub tx_key: [u8; 32],
    pub rx_key: [u8; 32],
}

/// Client-side handshake state
pub struct ClientHandshake {
    secret: EphemeralSecret,
    pub public_key: PublicKey,
}

impl ClientHandshake {
    pub fn new() -> Self {
        let secret = EphemeralSecret::random_from_rng(rand::rngs::OsRng);
        let public_key = PublicKey::from(&secret);
        Self { secret, public_key }
    }

    /// Complete handshake with host's public key, deriving directional keys.
    pub fn complete(self, host_public: &PublicKey) -> SessionKeys {
        let shared = self.secret.diffie_hellman(host_public);
        derive_keys(shared.as_bytes(), self.public_key.as_bytes(), host_public.as_bytes(), true)
    }
}

/// Host-side handshake state
pub struct HostHandshake {
    secret: EphemeralSecret,
    pub public_key: PublicKey,
}

impl HostHandshake {
    pub fn new() -> Self {
        let secret = EphemeralSecret::random_from_rng(rand::rngs::OsRng);
        let public_key = PublicKey::from(&secret);
        Self { secret, public_key }
    }

    /// Complete handshake with client's public key, deriving directional keys.
    pub fn complete(self, client_public: &PublicKey) -> SessionKeys {
        let shared = self.secret.diffie_hellman(client_public);
        derive_keys(shared.as_bytes(), client_public.as_bytes(), self.public_key.as_bytes(), false)
    }
}

/// Derives symmetric keys using SHA-256 expansion:
/// Client TX = Host RX, and Client RX = Host TX.
fn derive_keys(shared: &[u8; 32], client_pub: &[u8; 32], host_pub: &[u8; 32], is_client: bool) -> SessionKeys {
    let mut h1 = Sha256::new();
    h1.update(shared);
    h1.update(b"DIRECTLINK_C2S_KEY");
    h1.update(client_pub);
    h1.update(host_pub);
    let c2s_key: [u8; 32] = h1.finalize().into();

    let mut h2 = Sha256::new();
    h2.update(shared);
    h2.update(b"DIRECTLINK_S2C_KEY");
    h2.update(client_pub);
    h2.update(host_pub);
    let s2c_key: [u8; 32] = h2.finalize().into();

    if is_client {
        SessionKeys {
            tx_key: c2s_key,
            rx_key: s2c_key,
        }
    } else {
        SessionKeys {
            tx_key: s2c_key,
            rx_key: c2s_key,
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_handshake_agreement() {
        let client = ClientHandshake::new();
        let host = HostHandshake::new();

        let client_pub = client.public_key;
        let host_pub = host.public_key;

        let client_keys = client.complete(&host_pub);
        let host_keys = host.complete(&client_pub);

        // Client TX must equal Host RX
        assert_eq!(client_keys.tx_key, host_keys.rx_key);
        // Client RX must equal Host TX
        assert_eq!(client_keys.rx_key, host_keys.tx_key);
    }
}
