# AnyDesk Reverse-Engineered & Reconstructed

Complete clean-room reverse-engineering, decompilation, architectural reconstruction, and build toolchains for **AnyDesk Windows** and **AnyDesk Android**, including native **DeskRT video codec hooks**, in-memory relocations, and standalone packager pipelines.

---

## Releases & Downloads

Pre-built and signed release binaries are available under [Releases](https://github.com/Shashankinfernape/Anydesk-reverse-engineered/releases):

* **Android Package**: [`AnyDesk.apk`](https://github.com/Shashankinfernape/Anydesk-reverse-engineered/releases/latest/download/AnyDesk.apk) (48.0 MB, signed with debug keystore, v1 + v2 scheme)
* **Windows Executable**: [`AnyDesk.exe`](https://github.com/Shashankinfernape/Anydesk-reverse-engineered/releases/latest/download/AnyDesk.exe) (8.53 MB standalone binary with genuine AnyDesk GUI)

---

## Repository Structure

```
Anydesk-reverse-engineered/
├── AnyDesk-Android-Reconstructed/     # Android Reconstruction
│   ├── app/                           # Gradle project with 3,094 Java source files
│   │   ├── src/main/java/             # Clean JADX decompiled sources
│   │   ├── src/main/jniLibs/          # Native arm64-v8a, armeabi-v7a, x86, x86_64
│   │   ├── src/main/res/              # XML layouts, drawables, localized strings
│   │   └── src/main/AndroidManifest.xml
│   ├── apktool_src/                   # Apktool Smali & resource reconstruction
│   ├── build.gradle.kts               # Android Gradle build script
│   ├── build_apk.bat                  # 1-click APK build & sign script
│   └── README.md                      # DeskRTCaptureBridge documentation
│
└── AnyDesk-Windows-Reconstructed/     # Windows Reconstruction
    ├── src/                           # C++ loader, PE mapper, and codec hooks
    │   ├── core/win_app.dll           # Unpacked AnyDesk core engine (30.9 MB)
    │   ├── hooks/                     # DeskRT & Relay in-memory hooking engines
    │   └── loader/                    # PE manual mapper, LCG cipher, BCJ filter
    ├── include/                       # DeskRT packet headers, tile engine constants
    ├── resources/                     # Authenticode-ready manifest and RC version info
    ├── scripts/                       # Repacker, BCJ filter, and verification suite
    ├── CMakeLists.txt                 # MSVC 32-bit Win32 CMake build definition
    ├── build_exe.bat                  # 1-click standalone executable repacker
    └── README.md                      # Windows hooks and CLI usage
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
