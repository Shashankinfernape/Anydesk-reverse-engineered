package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class vb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ byte[] e;

    public /* synthetic */ vb0(byte[] bArr, byte[] bArr2, int i) {
        this.c = i;
        this.d = bArr;
        this.e = bArr2;
    }

    private final void a() {
        MainApplication mainApplication = JniAdExt.O;
        if (mainApplication != null) {
            String strT = nd0.t(this.d);
            String strT2 = nd0.t(this.e);
            if (!"android.samsung.license".equals(strT)) {
                if ("android.samsung.license_legacy".equals(strT)) {
                    mainApplication.U.p(strT2);
                }
            } else {
                yw0 yw0Var = mainApplication.U;
                synchronized (yw0Var) {
                    yw0Var.g = strT2;
                    yw0Var.j();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                a();
                return;
            default:
                String strT = nd0.t(this.d);
                nd0.t(this.e);
                h5 h5Var = MainApplication.v().w;
                if (h5Var != null) {
                    h5Var.b0(2);
                    h5Var.Q(strT);
                    h5Var.P();
                    h5Var.N(false);
                }
                zd zdVar = JniAdExt.X;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            xc0 xc0Var = (xc0) tdVar.next();
                            if (xc0Var != null) {
                                xc0Var.L();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
