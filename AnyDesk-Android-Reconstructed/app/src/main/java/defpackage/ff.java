package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ff {
    public static final int[] l = {0, 1, 3, 4, 5, 6, 10, 11, 12, 13, 14, 16};
    public final Logging a = new Logging("AudioPlaybackCaptureTool");
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final AtomicBoolean g;
    public final Object h;
    public Thread i;
    public AudioRecord j;
    public ByteBuffer k;

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public ff(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int iR = q51.r(i);
        if (iR == 0) {
            i6 = 0;
        } else if (iR == 1) {
            i6 = 4;
        } else {
            if (iR != 2) {
                throw new IncompatibleClassChangeError();
            }
            if (i3 == 8) {
                i6 = 3;
            } else if (i3 == 16) {
                i6 = 2;
            } else if (i3 == 24) {
                i6 = 21;
            } else if (i3 != 32) {
                i6 = 0;
            } else {
                i6 = 22;
            }
        }
        this.b = i6;
        this.c = i2 != 1 ? i2 != 2 ? 0 : 12 : 16;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = new AtomicBoolean(false);
        this.h = new Object();
    }

    public final void a(Context context, MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT < 29) {
            this.a.a("audio playback capture not supported before API level 29");
            return;
        }
        synchronized (this.h) {
            if (this.g.get()) {
                this.a.a("audio playback capture already started");
                return;
            }
            try {
                b(context, mediaProjection);
            } catch (Throwable th) {
                this.a.b("failed to start audio capture", th);
                this.g.set(false);
            }
            if (!this.g.get()) {
                t70.g0(context, JniAdExt.n1("ad.cfg.audio.transmission.access_fail"), 0);
            }
        }
    }

    public final void b(Context context, MediaProjection mediaProjection) {
        int i = this.e;
        int i2 = this.c;
        int i3 = this.b;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i2, i3);
        Logging logging = this.a;
        if (minBufferSize == -2 || minBufferSize == -1) {
            logging.a(String.format("AudioRecord.getMinBufferSize failed: error %d", Integer.valueOf(minBufferSize)));
            return;
        }
        int iBitCount = (this.d / 8) * ((this.f * i) / 1000) * Integer.bitCount(i2);
        int iMax = Math.max(minBufferSize, iBitCount);
        AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
        for (int i4 = 0; i4 < 12; i4++) {
            builder.addMatchingUsage(l[i4]);
        }
        AudioRecord.Builder bufferSizeInBytes = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setChannelMask(i2).setEncoding(i3).setSampleRate(i).build()).setAudioPlaybackCaptureConfig(builder.build()).setBufferSizeInBytes(iMax);
        if (Build.VERSION.SDK_INT >= 31) {
            bufferSizeInBytes.setContext(context);
        }
        AudioRecord audioRecordBuild = bufferSizeInBytes.build();
        this.j = audioRecordBuild;
        if (audioRecordBuild.getState() != 1) {
            logging.a("failed to initialize AudioRecord instance");
            return;
        }
        this.k = ByteBuffer.allocateDirect(iBitCount);
        this.i = new Thread(new l(3, this), "AudioCaptureThread");
        this.g.set(true);
        this.i.start();
    }

    public final void c() {
        synchronized (this.h) {
            try {
                if (this.g.get()) {
                    this.g.set(false);
                    try {
                        Thread thread = this.i;
                        if (thread != null) {
                            thread.join();
                        }
                    } catch (Throwable th) {
                        this.a.b("failed to stop audio capture", th);
                    }
                    AudioRecord audioRecord = this.j;
                    if (audioRecord != null) {
                        audioRecord.release();
                        this.j = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
