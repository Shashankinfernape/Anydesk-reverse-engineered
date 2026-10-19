package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ long g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ byte[] k;

    public pb0(int i, int i2, long j, byte[] bArr, long j2, byte[] bArr2, long j3, long j4, byte[] bArr3) {
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = bArr;
        this.g = j2;
        this.h = bArr2;
        this.i = j3;
        this.j = j4;
        this.k = bArr3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.o0.l(this.c, this.d, this.e, nd0.t(this.f), this.g, nd0.t(this.h), this.i, this.j, nd0.t(this.k));
    }
}
