package defpackage;

import android.graphics.Bitmap;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class zb0 implements Runnable {
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ byte[] i;
    public final /* synthetic */ byte[] j;

    public zb0(int i, int i2, long j, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = i3;
        this.h = bArr2;
        this.i = bArr3;
        this.j = bArr4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmapDecodeBitmap;
        boolean z;
        byte[] bArr = this.c;
        if (bArr != null) {
            try {
                bitmapDecodeBitmap = JniAdExt.decodeBitmap(bArr);
            } catch (Throwable th) {
                q51.o(th, new StringBuilder("cannot load discovery user image: "), JniAdExt.b);
                bitmapDecodeBitmap = null;
            }
        } else {
            bitmapDecodeBitmap = null;
        }
        if (bitmapDecodeBitmap == null) {
            bitmapDecodeBitmap = t70.i0(JniAdExt.d, R.drawable.unknown_user);
        }
        int i = this.d;
        int i2 = this.e;
        long j = this.f;
        nu nuVar = new nu(i, i2, j, ec1.l(this.g), nd0.t(this.h), nd0.t(this.i), nd0.t(this.j), bitmapDecodeBitmap);
        synchronized (JniAdExt.t0) {
            try {
                br0 br0Var = (br0) JniAdExt.u0.get(Long.valueOf(this.f));
                if (br0Var != null) {
                    nuVar.g = br0Var;
                }
                if (JniAdExt.v0.add(Long.valueOf(j))) {
                    z = true;
                    JniAdExt.i = true;
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (JniAdExt.z0) {
            JniAdExt.A0.put(Long.valueOf(this.f), nuVar);
        }
        MainFragment mainFragment = JniAdExt.Q;
        if (mainFragment != null) {
            t70.Y(new xi0(8, mainFragment));
        }
        if (z) {
            JniAdExt.U1();
        }
    }
}
