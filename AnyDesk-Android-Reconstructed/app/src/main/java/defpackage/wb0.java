package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ byte[] i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ byte[] l;
    public final /* synthetic */ byte[] m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;

    public wb0(int i, boolean z, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2, int i3, byte[] bArr5, byte[] bArr6, int i4, int i5, int i6, int i7) {
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = bArr;
        this.g = bArr2;
        this.h = bArr3;
        this.i = bArr4;
        this.j = i2;
        this.k = i3;
        this.l = bArr5;
        this.m = bArr6;
        this.n = i4;
        this.o = i5;
        this.p = i6;
        this.q = i7;
        this.r = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.l1(new am0(this.c, new bm0((int) this.d), new xl0((int) this.e), nd0.t(this.f), nd0.t(this.g), nd0.t(this.h), nd0.t(this.i), this.j, this.k, nd0.t(this.l), nd0.t(this.m), this.n, this.o, this.p, this.q), this.r);
    }
}
