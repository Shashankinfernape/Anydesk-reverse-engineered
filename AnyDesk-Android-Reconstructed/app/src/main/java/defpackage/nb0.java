package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class nb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public nb0(int i, boolean z) {
        this.c = 2;
        this.e = i;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.d;
        int i2 = this.e;
        switch (i) {
            case 0:
                JniAdExt.m0.c(z, new gf(i2));
                break;
            case 1:
                x00 x00Var = MainApplication.v().s;
                if (x00Var != null) {
                    x00Var.E(q51.b(i2), z);
                    i00 i00Var = JniAdExt.h0;
                    if (i00Var != null) {
                        t70.Y(new h00(i00Var, z, 0));
                    }
                    break;
                }
                break;
            default:
                JniAdExt.jniOnVpnPrepareResult(i2, z);
                break;
        }
    }

    public /* synthetic */ nb0(int i, int i2, boolean z) {
        this.c = i2;
        this.d = z;
        this.e = i;
    }
}
