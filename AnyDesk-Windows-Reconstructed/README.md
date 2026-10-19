# AnyDesk Windows — DeskRT Codec Integration

## What Was Added

| File | Purpose |
|------|---------|
| `include/deskrt_codec.h` | Tile constants, wire packet structs, capability bitmask definitions |
| `src/hooks/deskrt_hook.h` | DeskRT hook interface (install, forceLossless, setFrameCallback, setMaxFps) |
| `src/hooks/deskrt_hook.cpp` | JMP-trampoline patches into win_deskrt_encoder_init & win_deskrt_caller |
| `src/loader/main.cpp` *(modified)* | Added `--lossless` and `--fps` CLI flags, calls `DeskRTHook::install()` |
| `CMakeLists.txt` *(modified)* | Added `include/` dir and `deskrt_hook.cpp` to build |

---

## DeskRT Codec Architecture (Reverse-Engineered from `win_app.dll`)

```
Loader (main.cpp)
    └── PeMapper::loadFromFile(win_app.dll)
            └── RelayHook::applyInMemoryPatches()
            └── DeskRTHook::install()            ← JMP trampoline installed
                    ├── win_deskrt_encoder_init  VA 0x109EC4D0  ← session init hook
                    └── win_deskrt_caller        VA 0x109EC1DD  ← per-frame hook

Per-frame pipeline:
    DXGI/GDI capture → circular SHM pool (capture_pool_%u_shm)
        └── win_deskrt_caller  ← [DeskRTHook intercept]
                ├── [FPS throttle]
                ├── [FrameCallback — watermark / modify]
                └── DeskRT compressor in win_app.dll
```

### Tile Engine
- Dirty rect partitioned into **32 × 32 pixel tiles**.
- Each tile spatial-hashed with `deskrt_tile_hash_calculator` (VA `0x01125490`).  
- Unchanged tiles → bit cleared in `base.change_map` → **0 bytes on wire**.

### Wire Packets (AnyNet Channel 3)
| Opcode | Struct | Meaning |
|--------|--------|---------|
| `0x0E` | `DeskRTFrameHeader` | Sequence, timestamp, dirty rect bounds |
| `0x7D` | `DeskRTTilePacket` | Tile coords (tx, ty, 32, 32) + compressed stream |

### Capability Bitmask
| Bit | Mask | Effect |
|-----|------|--------|
| 33 | `0x0000000200000000` | **Lossless** — bypasses DCT, uses RLE + LZ |
| 37 | `0x0000002000000000` | Adaptive quality — scales with RTT / packet loss |

---

## CLI Usage

```bat
AnyDesk_Reconstructed.exe [flags]

  --relay <host>    Redirect AnyNet relay (e.g. --relay custom.server.com)
  --lossless        Force DeskRT capability bit 33 (lossless codec)
  --fps <n>         Cap frame delivery to N fps before encoding
```

### Examples

```bat
# Force lossless video (bypasses DCT lossy compression)
AnyDesk_Reconstructed.exe --lossless

# Cap to 30 fps + custom relay
AnyDesk_Reconstructed.exe --fps 30 --relay 192.168.1.100

# Lossless + 15 fps for high-latency WAN
AnyDesk_Reconstructed.exe --lossless --fps 15
```

---

## Frame Watermarking (Code)

Uncomment and edit the callback block in `src/loader/main.cpp`:

```cpp
DeskRTHook::setFrameCallback([](uint8_t* px, int w, int h, int stride) -> bool {
    // Stamp a white 8×8 block in the bottom-right corner
    for (int y = h - 8; y < h; ++y)
        for (int x = w - 8; x < w; ++x)
            *reinterpret_cast<uint32_t*>(px + y * stride + x * 4) = 0xFFFFFFFF;
    return true; // return false to drop this frame
});
```

---

## Build

```bat
cmake -B build -S . -G "Visual Studio 17 2022"
cmake --build build --config Release
```

Output binary: `build/bin/Release/AnyDesk_Reconstructed.exe`  
Core engine: `win_app.dll` is copied next to the `.exe` automatically via CMake post-build step.
