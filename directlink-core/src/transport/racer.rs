//! Transport Candidate Racer (Direct P2P vs Relay Fallback)
//!
//! Replicates `ad_anynet_direct_connect_racer` (ELF VA `0x00F05670`) and `relay_connector_connect` (ELF VA `0x00F87158`).
//! Concurrently initiates direct LAN/WAN socket probes alongside relay fallback paths,
//! establishing connections with minimum possible latency while guaranteeing connectivity.

use std::net::SocketAddr;
use std::time::{Duration, Instant};
use tokio::net::TcpStream;
use tokio::time::sleep;
use tracing::{debug, info, warn};

pub const DEFAULT_DIRECT_STAGGER_MS: u64 = 250;
pub const DEFAULT_CONNECT_TIMEOUT_MS: u64 = 5000;

#[derive(Debug)]
pub struct RacedConnection {
    pub stream: TcpStream,
    pub is_direct: bool,
    pub remote_addr: SocketAddr,
    pub elapsed_ms: u64,
}

pub struct CandidateRacer {
    direct_candidates: Vec<SocketAddr>,
    relay_candidates: Vec<SocketAddr>,
    stagger_delay: Duration,
    timeout: Duration,
}

impl CandidateRacer {
    pub fn new(direct_candidates: Vec<SocketAddr>, relay_candidates: Vec<SocketAddr>) -> Self {
        Self {
            direct_candidates,
            relay_candidates,
            stagger_delay: Duration::from_millis(DEFAULT_DIRECT_STAGGER_MS),
            timeout: Duration::from_millis(DEFAULT_CONNECT_TIMEOUT_MS),
        }
    }

    /// Set staggered delay before attempting relay fallback
    pub fn with_stagger_delay(mut self, delay: Duration) -> Self {
        self.stagger_delay = delay;
        self
    }

    /// Set total connect timeout
    pub fn with_timeout(mut self, timeout: Duration) -> Self {
        self.timeout = timeout;
        self
    }

    /// Race candidates concurrently.
    /// Direct candidates are probed immediately. If none succeed within `stagger_delay`,
    /// relay candidates are launched concurrently. First successful connect wins.
    pub async fn race(self) -> Option<RacedConnection> {
        let start = Instant::now();

        let direct_addrs = self.direct_candidates.clone();
        let relay_addrs = self.relay_candidates.clone();
        let stagger = self.stagger_delay;
        let timeout_dur = self.timeout;

        tokio::select! {
            result = Self::race_direct_then_relay(direct_addrs, relay_addrs, stagger, start) => {
                result
            }
            _ = sleep(timeout_dur) => {
                warn!("Transport candidate race timed out after {:?}", timeout_dur);
                None
            }
        }
    }

    async fn race_direct_then_relay(
        direct_addrs: Vec<SocketAddr>,
        relay_addrs: Vec<SocketAddr>,
        stagger: Duration,
        start_time: Instant,
    ) -> Option<RacedConnection> {
        // Direct probes
        let direct_future = async {
            if direct_addrs.is_empty() {
                // Never resolve if no direct candidates
                std::future::pending::<Option<RacedConnection>>().await
            } else {
                Self::race_pool(direct_addrs, true, start_time).await
            }
        };

        // Relay probes with initial stagger delay
        let relay_future = async {
            if relay_addrs.is_empty() {
                std::future::pending::<Option<RacedConnection>>().await
            } else {
                sleep(stagger).await;
                debug!("Stagger elapsed; initiating parallel relay candidate race...");
                Self::race_pool(relay_addrs, false, start_time).await
            }
        };

        tokio::select! {
            Some(direct_conn) = direct_future => {
                info!("Direct P2P path won race: {} ({} ms)", direct_conn.remote_addr, direct_conn.elapsed_ms);
                Some(direct_conn)
            }
            Some(relay_conn) = relay_future => {
                info!("Relay path won race: {} ({} ms)", relay_conn.remote_addr, relay_conn.elapsed_ms);
                Some(relay_conn)
            }
            else => None,
        }
    }

    async fn race_pool(
        addrs: Vec<SocketAddr>,
        is_direct: bool,
        start_time: Instant,
    ) -> Option<RacedConnection> {
        let mut set = tokio::task::JoinSet::new();

        for addr in addrs {
            set.spawn(async move {
                match TcpStream::connect(addr).await {
                    Ok(stream) => {
                        let _ = stream.set_nodelay(true);
                        Some(RacedConnection {
                            stream,
                            is_direct,
                            remote_addr: addr,
                            elapsed_ms: start_time.elapsed().as_millis() as u64,
                        })
                    }
                    Err(_) => None,
                }
            });
        }

        while let Some(res) = set.join_next().await {
            if let Ok(Some(conn)) = res {
                // Abort all remaining pending connection attempts immediately
                set.abort_all();
                return Some(conn);
            }
        }

        None
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use tokio::net::TcpListener;

    #[tokio::test]
    async fn test_candidate_racer_selects_first_available() {
        let listener_direct = TcpListener::bind("127.0.0.1:0").await.unwrap();
        let direct_addr = listener_direct.local_addr().unwrap();

        let listener_relay = TcpListener::bind("127.0.0.1:0").await.unwrap();
        let relay_addr = listener_relay.local_addr().unwrap();

        let racer = CandidateRacer::new(vec![direct_addr], vec![relay_addr])
            .with_stagger_delay(Duration::from_millis(50));

        let won = racer.race().await.expect("Should win connection");
        assert_eq!(won.remote_addr, direct_addr);
        assert!(won.is_direct);
    }
}
