package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ la0(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniNotifyScreenCaptureStateChanged(this.c, q51.r(this.d));
    }
}
