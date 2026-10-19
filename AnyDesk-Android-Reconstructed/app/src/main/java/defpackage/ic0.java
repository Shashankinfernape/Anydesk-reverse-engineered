package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 implements Runnable {
    public final /* synthetic */ float c;

    public ic0(float f) {
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniSetPlaybackSpeed(this.c);
    }
}
