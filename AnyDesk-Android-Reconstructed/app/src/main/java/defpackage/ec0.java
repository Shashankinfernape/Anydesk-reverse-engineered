package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 implements Runnable {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ int g;

    public ec0(boolean z, int i, int i2, byte[] bArr, int i3) {
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = bArr;
        this.g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x00 x00Var = MainApplication.v().s;
        if (x00Var == null) {
            return;
        }
        x00Var.H(this.c, this.d, this.e, nd0.t(this.f), 0L);
        int iB = q51.b(this.g);
        boolean z = this.c;
        x00Var.E(iB, z);
        i00 i00Var = JniAdExt.h0;
        if (i00Var != null) {
            t70.Y(new h00(i00Var, z, 1));
        }
    }
}
