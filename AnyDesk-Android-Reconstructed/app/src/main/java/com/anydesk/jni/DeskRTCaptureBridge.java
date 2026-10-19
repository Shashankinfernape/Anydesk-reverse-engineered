package com.anydesk.jni;

// =============================================================================
// DeskRTCaptureBridge.java
// =============================================================================
// Wraps JniAdExt.jniCaptureFrame (VA 0x00EBE2AC in libadext.so) to provide:
//   - Per-frame interception via FrameListener callbacks
//   - Optional forced lossless mode (capability bit 33)
//   - FPS throttle before frames hit the native compressor
//   - Watermark / overlay injection
//
// Usage (from your capture service):
//   DeskRTCaptureBridge bridge = DeskRTCaptureBridge.getInstance();
//   bridge.setFpsLimit(15);
//   bridge.setLossless(true);
//   bridge.setFrameListener((buf, w, h, stride) -> { /* modify buf */ return true; });
//
//   // Replace direct JniAdExt.jniCaptureFrame() call:
//   bridge.captureFrame(sessionId, pixelBuffer, width, height, stride, pixelFormat, isDirty);
// =============================================================================

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DeskRTCaptureBridge {

    // -------------------------------------------------------------------------
    // Singleton
    // -------------------------------------------------------------------------
    private static volatile DeskRTCaptureBridge sInstance;

    public static DeskRTCaptureBridge getInstance() {
        if (sInstance == null) {
            synchronized (DeskRTCaptureBridge.class) {
                if (sInstance == null) sInstance = new DeskRTCaptureBridge();
            }
        }
        return sInstance;
    }

    private DeskRTCaptureBridge() {}

    // -------------------------------------------------------------------------
    // DeskRT Constants (from reverse-engineering of libadext.so)
    // -------------------------------------------------------------------------
    /** Tile width in pixels – partitions each dirty rect into 32×32 cells */
    public static final int TILE_W = 32;
    /** Tile height in pixels */
    public static final int TILE_H = 32;

    /** Wire packet opcode: frame damage envelope (dirty rect + metadata) */
    public static final int PKT_FRAME_HEADER = 0x0E;
    /** Wire packet opcode: compressed tile payload */
    public static final int PKT_TILE_PAYLOAD = 0x7D;

    /**
     * Capability bitmask bit 33 (0x0000000200000000).
     * When set during session negotiation, DeskRT bypasses DCT quantization
     * and uses byte-level RLE + LZ dictionary compression (lossless mode).
     */
    public static final long CAP_LOSSLESS         = 1L << 33;
    /** Capability bit 37: adaptive quality driven by RTT / packet loss */
    public static final long CAP_ADAPTIVE_QUALITY = 1L << 37;

    // -------------------------------------------------------------------------
    // Frame Listener Interface
    // -------------------------------------------------------------------------
    public interface FrameListener {
        /**
         * Called before every frame enters libadext.so.
         *
         * @param frameBuffer Direct ByteBuffer containing raw BGRA pixels
         * @param width       Frame width in pixels
         * @param height      Frame height in pixels
         * @param stride      Row stride in bytes (width * 4 for BGRA)
         * @return {@code true} to pass the (possibly modified) frame to native,
         *         {@code false} to drop this frame entirely.
         */
        boolean onFrame(ByteBuffer frameBuffer, int width, int height, int stride);
    }

    // -------------------------------------------------------------------------
    // Configuration
    // -------------------------------------------------------------------------
    private volatile FrameListener mFrameListener  = null;
    private final AtomicBoolean    mLossless        = new AtomicBoolean(false);
    private final AtomicInteger    mFpsLimit        = new AtomicInteger(0);
    private volatile long          mLastFrameNs     = 0;

    /** Register a listener to intercept / modify frames before encoding. */
    public void setFrameListener(FrameListener listener) { mFrameListener = listener; }

    /**
     * Force lossless mode by patching the capability bitmask inside libadext.so
     * at session negotiation time (deskrt_codec_capability_dispatch, VA 0x010DAA44).
     * Note: JNI-level patching is done via setCapabilityOverride().
     */
    public void setLossless(boolean lossless) {
        mLossless.set(lossless);
        JniAdExt.setCapabilityOverride(lossless ? CAP_LOSSLESS : 0L);
    }

    /** Throttle frame dispatch to at most {@code fps} frames per second (0 = unlimited). */
    public void setFpsLimit(int fps) { mFpsLimit.set(fps); }

    // -------------------------------------------------------------------------
    // Main Entry Point
    // -------------------------------------------------------------------------
    /**
     * Drop-in replacement for {@link JniAdExt#jniCaptureFrame}.
     * Call this from your capture service instead of JniAdExt directly.
     *
     * <p>Pipeline:
     * <pre>
     *   Android MediaProjection → lj.java → DeskRTCaptureBridge.captureFrame()
     *       → [FPS throttle] → [FrameListener callback]
     *       → JniAdExt.jniCaptureFrame()
     *           → deskrt_jni_capture_frame_dispatcher (0x00FD7634)
     *               → vtable[36] of video session object → libadext.so compressor
     * </pre>
     */
    public void captureFrame(
            int        sessionId,
            ByteBuffer pixelBuffer,
            int        width,
            int        height,
            int        stride,
            int        pixelFormat,
            boolean    isDirty)
    {
        // 1. FPS throttle
        int limit = mFpsLimit.get();
        if (limit > 0) {
            long nowNs   = System.nanoTime();
            long minNs   = 1_000_000_000L / limit;
            if (nowNs - mLastFrameNs < minNs) return; // drop frame
            mLastFrameNs = nowNs;
        }

        // 2. Frame listener (watermark / modify / drop)
        FrameListener listener = mFrameListener;
        if (listener != null) {
            boolean proceed = listener.onFrame(pixelBuffer, width, height, stride);
            if (!proceed) return;
        }

        // 3. Forward to native – uses zero-copy DirectByteBuffer path
        JniAdExt.jniCaptureFrame(sessionId, pixelBuffer, width, height, stride, pixelFormat, isDirty ? 1 : 0);
    }

    // -------------------------------------------------------------------------
    // Tile Utility Helpers
    // -------------------------------------------------------------------------
    /**
     * Returns the number of 32×32 tiles needed to cover the given dirty rect.
     * Mirrors deskrt_dirty_rect_calculator logic (VA 0x01024BC8).
     */
    public static int tileCount(int dirtyW, int dirtyH) {
        int cols = (dirtyW + TILE_W - 1) / TILE_W;
        int rows = (dirtyH + TILE_H - 1) / TILE_H;
        return cols * rows;
    }

    /**
     * Compute a 64-bit spatial hash for a single 32×32 BGRA tile,
     * mirroring deskrt_tile_hash_calculator (VA 0x01125490).
     *
     * @param buf    Direct ByteBuffer of the full frame (BGRA)
     * @param tileX  Tile left edge in pixels (multiple of 32)
     * @param tileY  Tile top edge in pixels  (multiple of 32)
     * @param stride Frame row stride in bytes
     * @return 64-bit spatial fingerprint
     */
    public static long tileHash(ByteBuffer buf, int tileX, int tileY, int stride) {
        long hash = 0xcbf29ce484222325L; // FNV-1a offset basis
        final long PRIME = 0x100000001b3L;

        for (int dy = 0; dy < TILE_H; dy++) {
            int rowOff = (tileY + dy) * stride + tileX * 4;
            for (int dx = 0; dx < TILE_W; dx++) {
                int pxOff = rowOff + dx * 4;
                // BGRA channels
                hash ^= (buf.get(pxOff)     & 0xFFL); hash *= PRIME;
                hash ^= (buf.get(pxOff + 1) & 0xFFL); hash *= PRIME;
                hash ^= (buf.get(pxOff + 2) & 0xFFL); hash *= PRIME;
            }
        }
        return hash;
    }
}
