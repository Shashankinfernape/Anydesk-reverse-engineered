//! ChaCha20-Poly1305 AEAD Symmetric Packet Encryption
//!
//! Provides authenticated encryption and decryption for wire payloads.
//! Utilizes monotonic 64-bit counter nonces to protect against packet replays.

use chacha20poly1305::aead::{Aead, KeyInit, Payload};
use chacha20poly1305::{ChaCha20Poly1305, Key, Nonce};
use bytes::Bytes;
use crate::protocol::header::ProtocolError;

pub struct SessionCipher {
    tx_cipher: ChaCha20Poly1305,
    rx_cipher: ChaCha20Poly1305,
    tx_nonce: u64,
    rx_nonce: u64,
}

impl SessionCipher {
    pub fn new(tx_key: [u8; 32], rx_key: [u8; 32]) -> Self {
        Self {
            tx_cipher: ChaCha20Poly1305::new(Key::from_slice(&tx_key)),
            rx_cipher: ChaCha20Poly1305::new(Key::from_slice(&rx_key)),
            tx_nonce: 0,
            rx_nonce: 0,
        }
    }

    /// Construct a 12-byte Nonce from a 64-bit counter and direction prefix.
    fn make_nonce(counter: u64, prefix: u32) -> Nonce {
        let mut n = [0u8; 12];
        n[0..4].copy_from_slice(&prefix.to_le_bytes());
        n[4..12].copy_from_slice(&counter.to_le_bytes());
        *Nonce::from_slice(&n)
    }

    /// Encrypt a payload with Associated Data (the 16-byte wire header).
    /// Increments monotonic TX nonce.
    pub fn encrypt(&mut self, aad_header: &[u8], plaintext: &[u8]) -> Result<Bytes, ProtocolError> {
        let nonce = Self::make_nonce(self.tx_nonce, 0x54584C4E); // 'TXLN'
        self.tx_nonce += 1;

        let payload = Payload {
            msg: plaintext,
            aad: aad_header,
        };

        let ciphertext = self.tx_cipher.encrypt(&nonce, payload).map_err(|_| ProtocolError::DecryptionFailed)?;
        Ok(Bytes::from(ciphertext))
    }

    /// Decrypt a ciphertext payload with Associated Data (the 16-byte wire header).
    /// Increments monotonic RX nonce.
    pub fn decrypt(&mut self, aad_header: &[u8], ciphertext: &[u8]) -> Result<Bytes, ProtocolError> {
        let nonce = Self::make_nonce(self.rx_nonce, 0x54584C4E); // matches sender's TX prefix
        self.rx_nonce += 1;

        let payload = Payload {
            msg: ciphertext,
            aad: aad_header,
        };

        let plaintext = self.rx_cipher.decrypt(&nonce, payload).map_err(|_| ProtocolError::DecryptionFailed)?;
        Ok(Bytes::from(plaintext))
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_cipher_roundtrip() {
        let key_a = [0x42u8; 32];
        let key_b = [0x24u8; 32];

        let mut client_cipher = SessionCipher::new(key_a, key_b);
        let mut host_cipher = SessionCipher::new(key_b, key_a);

        let aad = b"16_BYTE_HEADER__";
        let plaintext = b"Zero-latency DeskRT video frame payload";

        // Client encrypts at seq 0
        let ciphertext = client_cipher.encrypt(aad, plaintext).unwrap();

        // Host decrypts at seq 0
        let decrypted = host_cipher.decrypt(aad, &ciphertext).unwrap();
        assert_eq!(&decrypted[..], plaintext);

        // Host encrypts reply at seq 0
        let reply_plaintext = b"Host acknowledgement";
        let reply_ciphertext = host_cipher.encrypt(aad, reply_plaintext).unwrap();

        // Client decrypts at seq 0
        let client_decrypted = client_cipher.decrypt(aad, &reply_ciphertext).unwrap();
        assert_eq!(&client_decrypted[..], reply_plaintext);
    }
}
