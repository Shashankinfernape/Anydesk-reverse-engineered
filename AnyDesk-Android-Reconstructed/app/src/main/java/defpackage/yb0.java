package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 implements Runnable {
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ byte[] i;
    public final /* synthetic */ byte[] j;
    public final /* synthetic */ byte[] k;
    public final /* synthetic */ byte[] l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ boolean q;

    public yb0(int i, boolean z, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2, int i3, int i4, int i5) {
        this.c = bArr;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = bArr2;
        this.h = bArr3;
        this.i = bArr4;
        this.j = bArr5;
        this.k = bArr6;
        this.l = bArr7;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            byte[] bArr = this.c;
            JniAdExt.l1(new wl0(this.d, new bm0((int) this.e), new xl0((int) this.f), nd0.t(this.g), nd0.t(this.h), nd0.t(this.i), nd0.t(this.j), bArr != null ? JniAdExt.decodeBitmap(bArr) : null, nd0.t(this.k), nd0.t(this.l), this.m, this.n, this.o, this.p), this.q);
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("cannot load motd image: "), JniAdExt.b);
        }
    }
}
