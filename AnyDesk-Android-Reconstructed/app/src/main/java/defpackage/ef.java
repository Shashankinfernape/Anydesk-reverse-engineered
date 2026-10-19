package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.os.ParcelFileDescriptor;
import com.anydesk.jnilib.Logging;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class ef extends AudioDeviceCallback {
    public boolean a = false;
    public final ParcelFileDescriptor b;

    public ef(int i) {
        this.b = ParcelFileDescriptor.fromFd(i);
    }

    public final void a() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.b.getFileDescriptor());
            try {
                fileOutputStream.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(1L).array());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            new Logging("AudioDeviceHelper").b("error when notifying event fd for device callback", e);
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (this.a) {
            a();
        } else {
            this.a = true;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }
}
