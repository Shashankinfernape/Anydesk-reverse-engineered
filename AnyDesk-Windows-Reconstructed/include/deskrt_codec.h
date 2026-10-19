#pragma once
// =============================================================================
// deskrt_codec.h - DeskRT Video Codec Reverse-Engineered Definitions
// =============================================================================
// Derived from static analysis of win_app.dll (AnyDesk_unpacked_core.dll).
// Documents the tile format, wire packets, and capability bitmask for DeskRT.
// =============================================================================

#include <cstdint>
#include <cstddef>

// ---------------------------------------------------------------------------
// Tile Constants
// ---------------------------------------------------------------------------
#define DESKRT_TILE_W       32          // Tile width in pixels
#define DESKRT_TILE_H       32          // Tile height in pixels
#define DESKRT_TILE_PIXELS  1024        // TILE_W * TILE_H

// ---------------------------------------------------------------------------
// Wire Packet Opcodes (AnyNet channel 3)
// ---------------------------------------------------------------------------
#define DESKRT_PKT_FRAME_HEADER    0x0E   // 14: frame envelope (seq, ts, dirty rect)
#define DESKRT_PKT_TILE_PAYLOAD    0x7D   // 125: compressed tile payload

// ---------------------------------------------------------------------------
// Capability Bitmask (64-bit, negotiated at session open)
// Patched by DeskRTHook::forceCapability() at win_deskrt_codec_capability_dispatch
// VA: 0x010DAA44 within win_app.dll image
// ---------------------------------------------------------------------------
#define DESKRT_CAP_LOSSLESS         (UINT64_C(1) << 33)   // Bit 33: bypass DCT, use RLE+LZ
#define DESKRT_CAP_ADAPTIVE_QUALITY (UINT64_C(1) << 37)   // Bit 37: RTT-driven quantization

// ---------------------------------------------------------------------------
// Known DeskRT Virtual Addresses (relative to win_app.dll load base)
// ---------------------------------------------------------------------------
static const uint32_t VA_WIN_DESKRT_CALLER          = 0x109EC1DDu;
static const uint32_t VA_WIN_DESKRT_NEGOTIATE       = 0x109EC420u;
static const uint32_t VA_WIN_DESKRT_ENCODER_INIT    = 0x109EC4D0u;
static const uint32_t VA_WIN_CAPABILITY_DISPATCH    = 0x010DAA44u;
static const uint32_t VA_LOADER_ENTRY_THUNK         = 0x10FF9810u;
static const uint32_t VA_LOADER_MAIN_THUNK          = 0x108B7CD0u;

// ---------------------------------------------------------------------------
// Frame Header Packet (Opcode 0x0E)
// Carries the bounding box of the dirty region for the current frame.
// ---------------------------------------------------------------------------
#pragma pack(push, 1)
struct DeskRTFrameHeader {
    uint8_t  opcode;        // 0x0E
    uint32_t seq;           // frame sequence counter
    uint64_t timestamp_us;  // microseconds since session start
    uint16_t dirty_x;       // damage rect left
    uint16_t dirty_y;       // damage rect top
    uint16_t dirty_w;       // damage rect width
    uint16_t dirty_h;       // damage rect height
};

// ---------------------------------------------------------------------------
// Tile Payload Packet (Opcode 0x7D)
// Followed by `compressed_size` bytes of compressed tile data.
// ---------------------------------------------------------------------------
struct DeskRTTilePacket {
    uint8_t  opcode;            // 0x7D
    uint16_t tile_x;            // tile column  (pixels, multiple of 32)
    uint16_t tile_y;            // tile row     (pixels, multiple of 32)
    uint16_t tile_w;            // always 32 (DESKRT_TILE_W)
    uint16_t tile_h;            // always 32 (DESKRT_TILE_H)
    uint32_t compressed_size;   // byte length of payload that follows
    // uint8_t data[compressed_size];
};
#pragma pack(pop)

// ---------------------------------------------------------------------------
// Shared-Memory Pool Names (Windows capture pipeline)
// Printf-format: use session ID as the %u argument.
// ---------------------------------------------------------------------------
#define DESKRT_SHM_NAME_FMT "capture_pool_%u_shm"

// ---------------------------------------------------------------------------
// Capture Sources (win_deskrt_encoder_init initialises both)
// ---------------------------------------------------------------------------
enum class DeskRTCaptureSource : uint8_t {
    DXGI_DESKTOP_DUP = 0,   // dwm_dda – GPU zero-copy path
    GDI_BITBLT       = 1,   // GDI fallback
};
