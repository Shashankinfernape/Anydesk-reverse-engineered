#pragma once
// =============================================================================
// deskrt_hook.h - DeskRT Codec In-Memory Hook Interface (Windows)
// =============================================================================
// Intercepts win_deskrt_encoder_init and win_deskrt_caller at runtime to allow:
//   - Frame watermarking / custom video injection
//   - Forced lossless mode (capability bit 33)
//   - FPS throttling
// =============================================================================

#include <string>
#include <cstdint>
#include <functional>

// ---------------------------------------------------------------------------
// Frame callback type
// Called BEFORE each frame is handed to the DeskRT compressor.
// Returning false drops the frame entirely.
// ---------------------------------------------------------------------------
using FrameCallback = std::function<bool(
    uint8_t* pixels,    // pointer into mapped frame buffer (BGRA)
    int      width,
    int      height,
    int      stride_bytes
)>;

class DeskRTHook {
public:
    // -----------------------------------------------------------------------
    // Install all DeskRT hooks into the already-mapped win_app.dll image.
    // Call this after PeMapper::loadFromFile() and before jumping to entry.
    // imageBase : base address returned by PeMapper::getBaseAddress()
    // imageSize : byte size of the mapped image (e.g. 30901248)
    // -----------------------------------------------------------------------
    static bool install(void* imageBase, size_t imageSize);

    // -----------------------------------------------------------------------
    // Capability Patching
    // Forces capability bit 33 (lossless_codec) on or off in the negotiated
    // 64-bit bitmask at win_deskrt_codec_capability_dispatch (VA 0x010DAA44).
    // Must be called after install().
    // -----------------------------------------------------------------------
    static void forceLossless(bool enable);

    // -----------------------------------------------------------------------
    // Frame Interception
    // Register a callback that runs before every frame enters the compressor.
    // Use to watermark pixels, inject synthetic frames, or drop frames.
    // -----------------------------------------------------------------------
    static void setFrameCallback(FrameCallback cb);

    // -----------------------------------------------------------------------
    // FPS Throttle
    // Drop frames to stay at or below `maxFps` (0 = no throttle).
    // -----------------------------------------------------------------------
    static void setMaxFps(int maxFps);

    // -----------------------------------------------------------------------
    // Query / state
    // -----------------------------------------------------------------------
    static bool isInstalled();
    static bool isLosslessForced();

private:
    static void*        s_imageBase;
    static size_t       s_imageSize;
    static bool         s_installed;
    static bool         s_losslessForced;
    static FrameCallback s_frameCallback;
    static int          s_maxFps;

    // Trampoline bytes saved during hook installation
    static uint8_t s_encoderInitTrampoline[16];
    static uint8_t s_callerTrampoline[16];

    // Internal helpers
    static bool hookFunction(uintptr_t va, void* hookFn, uint8_t* savedBytes, size_t nBytes);
    static void* resolveVA(uint32_t va);

    // Hook implementations (called by the trampoline)
    static void __stdcall onEncoderInit(void* context, uint32_t sessionId, uint32_t width, uint32_t height, uint32_t fps);
    static void __stdcall onCallerDispatch(void* videoSession, uint8_t* pixels, int w, int h, int stride, int format);
};
