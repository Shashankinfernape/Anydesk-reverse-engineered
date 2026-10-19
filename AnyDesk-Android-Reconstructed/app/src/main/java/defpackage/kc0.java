package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 implements Runnable {
    public final /* synthetic */ double c;

    public kc0(double d) {
        this.c = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniSeekPlayback(this.c);
    }
}
