package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ long g;
    public final /* synthetic */ byte[] h;

    public ob0(int i, int i2, long j, byte[] bArr, long j2, byte[] bArr2) {
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = bArr;
        this.g = j2;
        this.h = bArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.o0.s(this.c, this.d, this.e, nd0.t(this.f), this.g, nd0.t(this.h));
    }
}
