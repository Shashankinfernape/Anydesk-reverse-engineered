# AnyDesk Reverse-Engineered — Decentralized P2P Remote Desktop (Tailscale + LAN)

Complete clean-room reverse-engineering, decompilation, and architectural reconstruction for **AnyDesk Windows** and **AnyDesk Android**, featuring native **DeskRT 32×32 tile video differential compression** and **zero-relay peer-to-peer remote access over Tailscale Mesh (`100.64.0.0/10`) and Local LAN (`192.168.x.x` / `10.x.x.x`)**.

Official AnyDesk cloud rendezvous servers (`boot.net.anydesk.com`, `relay.net.anydesk.com`) are intercepted and neutralized at the binary and socket level, eliminating cloud tracking, commercial license banners, and session timeouts.

---

## Supported Connection Topologies

Because both Windows (`win_app.dll`) and Android (`libadext.so`) run full bidirectional AnyDesk engines, every node operates simultaneously as a **Host (Server)** and **Client (Viewer)**:

| Mode | Host (Server) | Client (Viewer) | How to Connect |
|:---:|:---:|:---:|---|
| **PC to PC** | Windows PC #1 | Windows PC #2 | PC #2 enters PC #1's Tailscale IP (`100.x.y.z:7070`) in the address bar. Full mouse, keyboard, and DeskRT video stream. |
| **Phone to PC** | Android Phone | Windows PC | PC enters Android phone's Tailscale IP (`100.x.y.z:7070`). Android grants MediaProjection + Accessibility; PC views and controls phone with mouse. |
| **PC to Phone** | Windows PC | Android Phone | Android phone enters PC's Tailscale IP (`100.x.y.z:7070`). Android views and touches PC desktop. |
| **Phone to Phone**| Android Phone #1 | Android Phone #2 | Direct Android-to-Android remote assistance over Tailscale mesh. |

---

## Releases & Downloads

Pre-built and signed release binaries are available under [Releases](https://github.com/Shashankinfernape/Anydesk-reverse-engineered/releases):

* **Android Package**: [`AnyHandesk.apk`](https://github.com/Shashankinfernape/Anydesk-reverse-engineered/releases/latest/download/AnyHandesk.apk) (48 MB, signed with debug keystore, v1 + v2 scheme)
* **Windows Executable**: [`AnyHandesk.exe`](https://github.com/Shashankinfernape/Anydesk-reverse-engineered/releases/latest/download/AnyHandesk.exe) (8.53 MB standalone binary with genuine AnyDesk GUI and Tailscale hooks)

---

## Repository Structure

```
Anydesk-reverse-engineered/
├── AnyDesk-Android-Reconstructed/     # Android Reconstruction (Client & Host)
│   ├── app/                           # Gradle project with 3,094 Java source files
│   │   ├── src/main/java/com/anydesk/jni/
│   │   │   ├── P2PConnectionBridge.java # Tailscale/LAN Auto-discovery & Direct Connect
│   │   │   └── DeskRTCaptureBridge.java # 32x32 Tile Differential Interceptor
│   │   ├── src/main/jniLibs/          # Native arm64-v8a, armeabi-v7a, x86, x86_64 libadext.so
│   │   └── src/main/AndroidManifest.xml
│   ├── apktool_src/                   # Apktool Smali & resource reconstruction
│   ├── build.gradle.kts               # Android Gradle build script
│   ├── build_apk.bat                  # 1-click APK build & sign script
│   └── README.md                      # Android interception & capture docs
│
├── AnyDesk-Windows-Reconstructed/     # Windows Reconstruction (Client & Host)
│   ├── src/                           # C++ loader, PE mapper, and codec hooks
│   │   ├── core/win_app.dll           # Unpacked AnyDesk core engine (30.9 MB)
│   │   ├── hooks/                     # Tailscale, DeskRT & Relay in-memory hooking engines
│   │   │   ├── tailscale_hook.cpp     # Auto-detects 100.x.x.x, removes banners & timeouts
│   │   │   ├── deskrt_hook.cpp        # Intercepts win_deskrt_encoder_init & caller
│   │   │   └── relay_hook.cpp         # In-memory relay redirector
│   │   └── loader/                    # PE manual mapper, LCG cipher, BCJ filter
│   ├── include/                       # DeskRT packet headers, tile engine constants
│   ├── resources/                     # Authenticode-ready manifest and RC version info
│   ├── scripts/                       # Repacker, BCJ filter, and verification suite
│   ├── CMakeLists.txt                 # MSVC 32-bit Win32 CMake build definition
│   ├── build_exe.bat                  # 1-click standalone executable repacker
│   ├── start_anyhandesk.bat           # 1-click launcher with status banner
│   └── README.md                      # Windows hooks and CLI usage
│
├── directlink-core/                   # Clean-room Rust Core Engine
│   ├── src/                           # Transport, mux, crypto, messages, capabilities
│   └── Cargo.toml                     # Native 5-channel multiplexer & candidate racer
│
├── docs/                              # REA Reverse Engineering Blueprint
│   ├── ANYDESK_REPLICATION_MASTER_PLAN.md # Architectural specification & roadmap
│   └── DECOMPILED_CORE_EVIDENCE.md        # Ghidra pseudocode, crypto constants, memory layouts
│
├── reverse-eng/                       # REA Analysis & Ghidra Snapshot Artifacts
│   ├── android/                       # ARM64 ELF libadext.so exports, JNI class graphs
│   └── windows/                       # Windows x86 unpacker evidence, PE snapshots
│
└── scripts/                           # Reverse Engineering & Repack Suite
    ├── repack_anydesk.py              # Injects and compresses raw core into PE stub
    ├── apply_bcj.py / bcj_filter.py   # x86 Branch / Call / Jump normalization
    └── LzmaDec.c / verify_decoder.c   # LZMA raw stream decompressor
```

---

## DeskRT Codec Architecture

Both Windows (`win_app.dll`) and Android (`libadext.so`) share the core **DeskRT** tile-based video streaming engine:

### 1. 32×32 Spatial Tile Engine
* Frame dirty rects are segmented into uniform **32 × 32 pixel tiles**.
* Each tile is fingerprinted via an **FNV-1a 64-bit spatial hash** (`deskrt_tile_hash_calculator`, VA `0x01125490`).
* Unchanged tiles match existing entries in `capture.hash_map` and clear bit 0 in `base.change_map` → **0 bytes transmitted over the network**.

### 2. Wire Packets (AnyNet Channel 3)
| Opcode | Structure | Description |
|:---:|---|---|
| `0x0E` | `DeskRTFrameHeader` | Frame sequence, millisecond timestamp, bounding rect |
| `0x7D` | `DeskRTTilePacket` | Tile grid coordinates `(tx, ty, 32, 32)` + compressed stream |

### 3. Capability Bitmask
* **Bit 33** (`0x0000000200000000`): **Lossless mode** — completely bypasses DCT lossy quantization; enforces RLE + LZ dictionary compression.
* **Bit 37** (`0x0000002000000000`): **Adaptive quality** — dynamically scales quantization matrices based on round-trip latency and packet loss.

---

## Usage Guide

### 1. Windows Host / Client
```bat
cd AnyDesk-Windows-Reconstructed

# View detected Tailscale (100.x.x.x) and LAN (192.168.x.x) endpoints:
AnyHandesk.exe --p2p-info

# Launch with status console and listen on port 7070:
AnyHandesk.exe --console --port 7070

# Optional: Force lossless video mode:
AnyHandesk.exe --console --port 7070 --lossless
```

### 2. Android Client / Host
1. Install `AnyHandesk.apk` on your Android device.
2. Ensure Tailscale VPN is connected (or both devices are on the same Wi-Fi / hotspot).
3. **To control PC from Phone:** Enter the PC's Tailscale IP (`100.x.y.z:7070`) and tap Connect.
4. **To control Phone from PC:** Enter the phone's Tailscale IP in `AnyHandesk.exe` on Windows and tap Connect. Accept the prompt on Android to begin streaming.

---

## Building from Source

### Android APK
Ensure Android SDK build-tools and Java 17+ are installed:
```bat
cd AnyDesk-Android-Reconstructed
build_apk.bat
```
Or build using Gradle:
```bash
./gradlew assembleDebug
```

### Windows Executable
Requires Visual Studio 2022 (MSVC x86 / Win32) and Python 3:
```bat
cd AnyDesk-Windows-Reconstructed
build_exe.bat
```
Or build the C++ manual-mapping loader via CMake:
```bat
cmake -B build_msvc32 -S . -G "Visual Studio 17 2022" -A Win32
cmake --build build_msvc32 --config Release
```

---

## License & Disclaimer
This project is for reverse engineering, research, interoperability, and educational purposes only. AnyDesk is a registered trademark of AnyDesk Software GmbH.
