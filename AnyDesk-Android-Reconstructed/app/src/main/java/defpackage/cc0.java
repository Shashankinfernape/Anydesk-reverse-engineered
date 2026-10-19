package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 implements Runnable {
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public cc0(int i, int i2, byte b, byte[] bArr, byte[] bArr2) {
        this.c = b;
        this.d = bArr;
        this.e = bArr2;
        this.f = i;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b;
        byte b2 = this.c;
        int[] iArrS = q51.s(8);
        int length = iArrS.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                i = iArrS[i2];
                switch (i) {
                    case 1:
                        b = 0;
                        break;
                    case 2:
                        b = 1;
                        break;
                    case 3:
                        b = 2;
                        break;
                    case 4:
                        b = 3;
                        break;
                    case 5:
                        b = 11;
                        break;
                    case 6:
                        b = 21;
                        break;
                    case 7:
                        b = 22;
                        break;
                    case 8:
                        b = 23;
                        break;
                    default:
                        throw null;
                }
                if (b != b2) {
                    i2++;
                }
            } else {
                i = 1;
            }
        }
        String strT = nd0.t(this.d);
        String strT2 = nd0.t(this.e);
        String strI = h5.i(this.f, this.g);
        h5 h5Var = MainApplication.v().w;
        if (h5Var != null && h5Var.D()) {
            h5Var.X(true);
            h5Var.Z(strI);
            synchronized (h5Var) {
                h5Var.C = i;
            }
            h5Var.R(strT2);
            h5Var.O(strT);
        }
        c5 c5Var = JniAdExt.Z;
        if (c5Var != null) {
            t70.Y(new c(9, c5Var));
        }
    }
}
