package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public hc0(int i, int i2, int i3, boolean z) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniFileManagerConflictDialogResolve(this.c, this.d, q51.r(this.e), this.f);
    }
}
