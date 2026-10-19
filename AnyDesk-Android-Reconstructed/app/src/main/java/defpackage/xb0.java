package defpackage;

import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 implements Runnable {
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ byte[] i;
    public final /* synthetic */ byte[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;

    public xb0(int i, boolean z, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2, int i3) {
        this.c = bArr;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = bArr2;
        this.h = bArr3;
        this.i = bArr4;
        this.j = bArr5;
        this.k = i2;
        this.l = i3;
        this.m = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            byte[] bArr = this.c;
            Bitmap bitmapDecodeBitmap = bArr != null ? JniAdExt.decodeBitmap(bArr) : null;
            if (bitmapDecodeBitmap == null) {
                JniAdExt.b.a("cannot load motd image: image is null");
            } else {
                JniAdExt.l1(new yl0(this.d, new bm0((int) this.e), new xl0((int) this.f), nd0.t(this.g), nd0.t(this.h), nd0.t(this.i), nd0.t(this.j), bitmapDecodeBitmap, this.k, this.l), this.m);
            }
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("cannot load motd image: "), JniAdExt.b);
        }
    }
}
