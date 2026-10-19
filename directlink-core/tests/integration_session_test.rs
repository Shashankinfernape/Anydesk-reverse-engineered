use bytes::Bytes;
use directlink_core::crypto::{ClientHandshake, DeviceIdentity, HostHandshake, SessionCipher};
use directlink_core::messages::{
    DirtyRect, InputEvent, MouseButton, VideoFormat, VideoFrameMetadata,
};
use directlink_core::protocol::{Channel, PacketFlags};
use directlink_core::transport::{CandidateRacer, DirectLinkSession};
use std::time::Duration;
use tokio::net::TcpListener;
use tokio::sync::oneshot;

#[tokio::test]
async fn test_end_to_end_session_lifecycle() {
    let host_listener = TcpListener::bind("127.0.0.1:0").await.unwrap();
    let host_addr = host_listener.local_addr().unwrap();

    let host_identity = DeviceIdentity::generate();
    let client_identity = DeviceIdentity::generate();

    println!("Host Client ID: {}", host_identity.client_id.formatted());
    println!("Client ID: {}", client_identity.client_id.formatted());

    // Channels to exchange ephemeral public keys (simulating Connect/ConnectResponse handshake)
    let (c2h_tx, c2h_rx) = oneshot::channel();
    let (h2c_tx, h2c_rx) = oneshot::channel();

    // 2. Spawn Host accept & session task
    let host_task = tokio::spawn(async move {
        let (stream, peer_addr) = host_listener.accept().await.unwrap();
        println!("Host accepted connection from: {}", peer_addr);

        let host_handshake = HostHandshake::new();
        let host_pub = host_handshake.public_key;

        // Send host public key to client
        h2c_tx.send(host_pub).unwrap();

        // Receive client public key
        let client_pub = c2h_rx.await.unwrap();

        // Complete Diffie-Hellman key exchange
        let host_keys = host_handshake.complete(&client_pub);
        let mut session = DirectLinkSession::new(
            stream,
            SessionCipher::new(host_keys.tx_key, host_keys.rx_key),
            987654321,
            true,
        );

        // Receive input packet from client
        let in_pkt = session.receive_next().await.unwrap();
        assert_eq!(in_pkt.header.channel, Channel::Input);
        let event: InputEvent = serde_json::from_slice(&in_pkt.payload).unwrap();
        match event {
            InputEvent::KeyDown { scancode, keycode, modifiers } => {
                assert_eq!(scancode, 30);
                assert_eq!(keycode, 65); // 'A'
                assert_eq!(modifiers, 0);
            }
            _ => panic!("Expected KeyDown event"),
        }

        // Host sends a DeskRT video frame with dirty rects
        let frame_meta = VideoFrameMetadata {
            width: 1920,
            height: 1080,
            stride: 1920 * 4,
            format: VideoFormat::Rgba8888,
            is_keyframe: true,
            frame_index: 1,
            timestamp_ms: 1000,
            dirty_rects: vec![
                DirtyRect::new(0, 0, 1920, 1080),
                DirtyRect::new(100, 100, 200, 200),
            ],
        };
        let frame_bytes = Bytes::from(serde_json::to_vec(&frame_meta).unwrap());
        session.send(Channel::Video, PacketFlags(PacketFlags::KEYFRAME), frame_bytes);
        session.flush_outbound().await.unwrap();

        // Host receives mouse motion
        let in_pkt2 = session.receive_next().await.unwrap();
        assert_eq!(in_pkt2.header.channel, Channel::Input);
        let event2: InputEvent = serde_json::from_slice(&in_pkt2.payload).unwrap();
        match event2 {
            InputEvent::MouseButton { button, down } => {
                assert_eq!(button, MouseButton::Left);
                assert!(down);
            }
            _ => panic!("Expected MouseButton event"),
        }
    });

    // 3. Client runs CandidateRacer to connect to Host
    let racer = CandidateRacer::new(vec![host_addr], vec![])
        .with_timeout(Duration::from_millis(2000));
    let raced_conn = racer.race().await.expect("Client candidate race must succeed");
    assert!(raced_conn.is_direct);

    // Client creates ephemeral handshake
    let client_handshake = ClientHandshake::new();
    let client_pub = client_handshake.public_key;

    // Send client public key to host
    c2h_tx.send(client_pub).unwrap();

    // Receive host public key
    let host_pub = h2c_rx.await.unwrap();

    // Complete Diffie-Hellman key exchange
    let client_keys = client_handshake.complete(&host_pub);

    let mut client_session = DirectLinkSession::new(
        raced_conn.stream,
        SessionCipher::new(client_keys.tx_key, client_keys.rx_key),
        987654321,
        true,
    );

    // Client sends KeyDown event
    let key_event = InputEvent::KeyDown {
        scancode: 30,
        keycode: 65,
        modifiers: 0,
    };
    let key_bytes = Bytes::from(serde_json::to_vec(&key_event).unwrap());
    client_session.send(Channel::Input, PacketFlags::empty(), key_bytes);
    client_session.flush_outbound().await.unwrap();

    // Client receives Video frame from Host
    let video_pkt = client_session.receive_next().await.unwrap();
    assert_eq!(video_pkt.header.channel, Channel::Video);
    assert!(video_pkt.header.flags.has(PacketFlags::KEYFRAME));
    let received_frame: VideoFrameMetadata = serde_json::from_slice(&video_pkt.payload).unwrap();
    assert_eq!(received_frame.width, 1920);
    assert_eq!(received_frame.height, 1080);
    assert_eq!(received_frame.dirty_rects.len(), 2);

    // Client sends MouseButton event
    let mouse_event = InputEvent::MouseButton {
        button: MouseButton::Left,
        down: true,
    };
    let mouse_bytes = Bytes::from(serde_json::to_vec(&mouse_event).unwrap());
    client_session.send(Channel::Input, PacketFlags::empty(), mouse_bytes);
    client_session.flush_outbound().await.unwrap();

    // Await host task completion
    host_task.await.unwrap();
    println!("End-to-end integration test completed successfully!");
}
