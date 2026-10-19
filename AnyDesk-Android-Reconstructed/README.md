# AnyDesk Android — DeskRT Codec Integration

## What Was Added

| File | Purpose |
|------|---------|
| `com/anydesk/jni/DeskRTCaptureBridge.java` | Frame interception wrapper around `JniAdExt.jniCaptureFrame` |
| `defpackage/lj.java` *(modified)* | Screen capture service — now routes frames through `DeskRTCaptureBridge` |

---

## DeskRT Codec Architecture (Reverse-Engineered from `libadext.so`)

```
Android MediaProjection
    └── ImageReader.OnImageAvailable → lj.java
            └── DeskRTCaptureBridge.captureFrame()      ← interception point
                    ├── [FPS throttle]
                    ├── [FrameListener callback]         ← your watermark / modify hook
                    └── JniAdExt.jniCaptureFrame()       VA 0x00EBE2AC
                            └── deskrt_jni_capture_frame_dispatcher  VA 0x00FD7634
                                    └── vtable[36] (offset 0x120) of video session object
                                            └── DeskRT compressor in libadext.so
```

### Tile Engine
- Screen dirty-rect divided into **32 × 32 pixel tiles**.
- Each tile gets a **64-bit spatial hash** (`deskrt_tile_hash_calculator`, VA `0x01125490`).
- Unchanged tiles (hash match in `capture.hash_map`) set bit = 0 in `base.change_map` → **0 bytes transmitted**.

### Wire Packets (AnyNet Channel 3)
| Opcode | Meaning |
|--------|---------|
| `0x0E` | Frame envelope — sequence, timestamp, dirty rect bounds |
| `0x7D` | Compressed tile — coords (tx, ty, 32, 32) + compressed stream |

### Capability Bitmask
| Bit | Mask | Effect |
|-----|------|--------|
| 33 | `0x0000000200000000` | **Lossless** — disables DCT, uses RLE + LZ dictionary |
| 37 | `0x0000002000000000` | Adaptive quality — scales quantization with RTT/loss |

---

## How to Use the Interception API

### Force Lossless Video
```java
DeskRTCaptureBridge.getInstance().setLossless(true);
```
Patches capability bit 33 at session negotiation time — disables all lossy compression artefacts.

### Cap FPS
```java
DeskRTCaptureBridge.getInstance().setFpsLimit(15);
```
Drops frames to stay at or below the specified rate before they enter `libadext.so`.

### Watermark / Modify Frames
```java
DeskRTCaptureBridge.getInstance().setFrameListener((buf, w, h, stride) -> {
    // Stamp a white 8×8 pixel block in the bottom-right corner
    for (int y = h - 8; y < h; y++) {
        for (int x = w - 8; x < w; x++) {
            int offset = y * stride + x * 4;
            buf.put(offset,     (byte) 0xFF); // B
            buf.put(offset + 1, (byte) 0xFF); // G
            buf.put(offset + 2, (byte) 0xFF); // R
            buf.put(offset + 3, (byte) 0xFF); // A
        }
    }
    return true; // return false to drop the frame
});
```

### Tile Hash Utility
```java
long hash = DeskRTCaptureBridge.tileHash(frameBuffer, tileX, tileY, stride);
```
Mirrors the `deskrt_tile_hash_calculator` (VA `0x01125490`) FNV-1a spatial fingerprint.

---

## Build
```bash
./gradlew assembleDebug
```
No new dependencies required — `DeskRTCaptureBridge` uses only standard Java/Android APIs and calls existing `JniAdExt` native methods. `libadext.so` is bundled automatically from `jniLibs/arm64-v8a/`.
