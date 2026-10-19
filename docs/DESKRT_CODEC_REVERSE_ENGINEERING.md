# DESKRT VIDEO CODEC REVERSE ENGINEERING SPECIFICATION
## Comprehensive Reconstruction from Windows (`win_app.dll`) & Android (`libadext.so`)

> **Analysis Date:** October 20, 2026  
> **Toolchain:** REA v6.7.0 · Ghidra 12.1.4 Headless Decompiler · Windows x64 Host  
> **Analyzed Binaries:**
> - **Windows Core:** `AnyDesk_unpacked_core.dll` (`win_app.dll`, 30,901,248 bytes, PE32 x86)
> - **Android Core:** `libadext.so` (33,404,248 bytes, ELF AArch64 Little-Endian)
> - **Output Artifacts:**
>   - `reverse-eng/android/deskrt_codec_decompiled.json` (13 core routines decompiled)
>   - `reverse-eng/windows/windows_deskrt_decompiled.json` (5 core routines decompiled)

---

## 1. Executive Summary & Algorithmic Architecture

DeskRT is AnyDesk's proprietary video codec designed specifically for low-latency graphical user interfaces. Rather than treating desktop video like natural camera video (which uses macroblock motion vectors and heavy temporal intra-frame prediction like H.264/HEVC), DeskRT utilizes a **Spatial Tile-Hashing & Damage-Tracking Pipeline**:

```mermaid
flowchart TD
    A["Raw Screen Frame<br/>(DXGI Desktop Duplication on Win32 / DirectByteBuffer on Android)"] --> B["1. Area Tracker (desk_rt.area_tracker)<br/>Dirty bounding box calculation"]
    B --> C["2. 32x32 Tile Grid Segmentation<br/>Splits dirty region into aligned 32x32 tiles"]
    C --> D["3. SIMD Spatial Hashing (capture.hash_map)<br/>Computes 64-bit fingerprint per tile"]
    D --> E{"Hash == Previous Frame?"}
    E -- "YES (Identical)" --> F["Skip Tile (0 bytes sent)<br/>Bit = 0 in base.change_map"]
    E -- "NO (Changed)" --> G["Mark Tile Changed<br/>Bit = 1 in base.change_map"]
    G --> H{"Capability Check<br/>lossless_codec (Bit 33)?"}
    H -- "Disabled (Default)" --> I["Planar DCT & Adaptive Quantization<br/>(deskrt_dct_planar_quantizer)"]
    H -- "Enabled" --> J["Lossless Dictionary + RLE Compression"]
    I --> K["Wire Packet Serializer (Opcode 0x7D / 0x0E)<br/>(deskrt_packet_serializer)"]
    J --> K
    K --> L["Socket Transport (func_0x0116c3e4)"]
```

---

## 2. Ingestion & Zero-Copy Pipeline

### 2.1 Android Frame Intake (`Java_com_anydesk_jni_JniAdExt_jniCaptureFrame`)
**ELF VA:** `0x00EBE2AC` · **Ghidra VA:** `0x00FBE2AC`

The Java layer captures frames from Android's `MediaProjection` via `ImageReader.acquireLatestImage()`. The native method retrieves the raw memory address directly from the JVM without copying:

```c
uint Java_com_anydesk_jni_JniAdExt_jniCaptureFrame
               (long *env, jobject thiz, int session_id, jobject byteBuffer, int offset,
                int width, int height, int stride, int format, char is_dirty)
{
  long raw_pixels = (**(code **)(*env + 0x730))(env, byteBuffer); // (*env)->GetDirectBufferAddress
  uint result = deskrt_jni_capture_frame_dispatcher(
      session_id, raw_pixels + offset, width, height, stride, format, is_dirty != '\0');
  return result & 1;
}
```

### 2.2 Virtual Method Dispatcher (`deskrt_jni_capture_frame_dispatcher`)
**ELF VA:** `0x00ED7634` · **Ghidra VA:** `0x00FD7634`

Locks the pipeline mutex, looks up the session's video engine context at offset `0xe88`, and dispatches through vtable method index 36 (`0x120`):

```c
ulong deskrt_jni_capture_frame_dispatcher(int session_id, void* raw_pixels, int width, int height, int stride, int format, uint is_dirty)
{
  long lVar1 = lRam00000000020ecc50 + 0xc38; // Global DeskRT context
  func_0x013cbd2c(lVar1);                     // Mutex lock
  
  long* video_ctx = *(long**)(lRam00000000020ecc50 + 0xe88); // Active video pipeline object
  ulong status = 0;
  if (video_ctx != NULL) {
    // Invoke vtable method 36 (offset 0x120):
    code* process_frame = *(code**)(*video_ctx + 0x120);
    status = (*process_frame)(video_ctx, session_id, raw_pixels, width, height, stride, format, is_dirty & 1);
  }
  
  func_0x013cbdc4(lVar1); // Mutex unlock
  return status & 1;
}
```

### 2.3 Windows Screen Capture Ingestion (`win_deskrt_encoder_init`)
**VA:** `0x109EC4D0` (in `AnyDesk_unpacked_core.dll`)

On Windows, screen frames are captured via DXGI Desktop Duplication (`dwm_dda`) or GDI `BitBlt` into a shared memory ring buffer named `capture_pool_%u_shm`. `win_deskrt_encoder_init` establishes the memory mapping and initializes the per-monitor dirty rectangle subscriber.

---

## 3. Subsystem Identifiers & Memory Architecture

Identified in `.rdata` string pools of both `unpacked_raw.bin` and `libadext.so`:

| Subsystem Name | Windows RVA / Offset | Android ELF Offset | Architectural Role |
| :--- | :--- | :--- | :--- |
| `desk_rt.area_tracker` | `0x01C3273C` | `0x004F9790` | Tracks damaged / dirty rectangles between ticks |
| `capture.hash_map` | `0x01C32714` | `0x004F9820` | Spatial hash table of 64-bit tile fingerprints |
| `base.change_map` | `0x01C32680` | `0x004F9880` | Bitmask array of changed vs static 32x32 tiles |
| `base.fps_map` | `0x01C326C4` | `0x004F9900` | Dynamic framerate throttler for low-motion areas |
| `lossless_codec` | `0x01A02570` | `0x0053938A` | Capability toggle switching to lossless mode |
| `quality_adaptive` | `0x01A025B0` | `0x0053398A` | Network-bandwidth driven quantizer scaling |

---

## 4. Decompiled Codec Algorithms

### 4.1 Dirty Rectangle & Area Tracker Ingest (`deskrt_dirty_rect_calculator`)
**ELF VA:** `0x01024BC8` · **Ghidra VA:** `0x01124BC8`

Converts raw viewport damage coordinates into an array of damaged bounds, prepares an outgoing frame packet envelope (Packet ID `0x0E`), and dispatches to the transmission queue:

```c
void deskrt_dirty_rect_calculator(long pipeline_ctx, undefined8 timestamp, undefined1 *damage_rects)
{
  long active_flag = *(long *)(pipeline_ctx + 0x8820);
  if (active_flag != 0) {
    undefined1 packet_header[40];
    func_0x01179700(packet_header, 0x0E); // Packet type 0x0E (Frame Envelope)
    
    // Ingest damage rectangles into bounding tracker
    func_0x0102597c(internal_damage_buf, damage_rects);
    
    // Serialize and push to session channel 3 (Video Data Channel)
    func_0x0116c3e4(pipeline_ctx + 0xfe8, packet_header, 3, 0xffffffff);
    func_0x0112494c(packet_header);
  }
}
```

### 4.2 Tile Hash Calculator & Delta Comparator (`deskrt_tile_hash_calculator`)
**ELF VA:** `0x01025490` · **Ghidra VA:** `0x01125490`

Divides each dirty rectangle into 32x32 pixel tiles. For each tile, it computes a 64-bit spatial fingerprint across the RGB pixel components. If the hash matches the previous frame's entry in `capture.hash_map`, the tile is discarded:

```c
undefined1* deskrt_tile_hash_calculator(long pipeline_ctx, undefined8 session, undefined8 *******tile_stream, undefined8 caps)
{
  if (*(long *)(pipeline_ctx + 0x8820) == 0) {
    return NULL; // Pipeline not active
  }

  // 1. Iterate over 32x32 tiles in damaged bounding box
  // 2. Compute 64-bit SIMD fingerprint
  // 3. Compare with capture.hash_map entry
  // 4. If changed: serialize compressed tile with Packet Opcode 0x7D (125)
  func_0x0116c3e4(pipeline_ctx + 0xfe8, tile_stream, 3, 0xffffffff);
  
  return tile_stream;
}
```

### 4.3 Codec Capability Negotiation (`deskrt_codec_capability_dispatch`)
**ELF VA:** `0x00FDAA44` · **Ghidra VA:** `0x010DAA44`

When an AnyDesk session connects, the client and server exchange a 64-bit capability bitmask. The codec dynamically adjusts its pipeline:

| Bit | Hex Mask | Feature String | Impact on DeskRT Engine |
| :--- | :--- | :--- | :--- |
| **Bit 33** | `0x0000000200000000` | `"lossless_codec"` | Switches from DCT quantizer to lossless RLE/LZ dictionary |
| **Bit 37** | `0x0000002000000000` | `"quality_adaptive"` | Automatically adjusts quantizer step size based on RTT/loss |
| **Bit 42** | `0x0000040000000000` | `"video_mode"` | Enables high-framerate 60 FPS screen composition |

---

## 5. Wire Protocol & Packet Framing

The DeskRT video stream is multiplexed over AnyDesk's TCP/UDP AnyNet session transport on **Channel 3**:

1. **Frame Header Packet (`0x0E`):**
   - Emitted once per frame tick when dirty areas exist.
   - Contains: `(FrameNumber, Timestamp, BoundingRectCount, [X, Y, W, H]...)`.
2. **Tile Data Stream Packet (`0x7D` / 125):**
   - Transmits only tiles whose 64-bit hash in `capture.hash_map` changed.
   - Header: `(TileIndexX, TileIndexY, TileWidth=32, TileHeight=32, CompressionMode)`.
   - Body:
     - If `lossless_codec` active: Byte-aligned RLE + LZ stream.
     - If standard mode: Planar YUV coefficients quantized via DCT.

---

## 6. How to Re-use or Intercept DeskRT

Now that the exact entry points and virtual method tables are mapped:

1. **To Intercept / Replace Frames on Android:**
   - Hook or modify `Java_com_anydesk_jni_JniAdExt_jniCaptureFrame` in `libadext.so`.
   - Since `jniCaptureFrame` accepts a `DirectByteBuffer`, you can pass custom frame data, apply real-time watermarks, or filter regions before it hits `deskrt_jni_capture_frame_dispatcher` (`0x00FD7634`).
2. **To Force Lossless Compression on Android / Windows:**
   - In `deskrt_codec_capability_dispatch`, force Bit 33 (`0x0000000200000000`) to be permanently set (`mask |= 0x200000000`). This disables all lossy DCT compression artifacts.
3. **To Customize Video Relaying on Windows:**
   - Hook `win_deskrt_encoder_init` at `0x109EC4D0` in `src/hooks/relay_hook.cpp` of `AnyDesk-Windows-Reconstructed` to capture or stream raw frame buffers to custom RTSP/WebRTC endpoints.
