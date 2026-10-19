package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ t01 d;
    public final /* synthetic */ t01 e;

    public /* synthetic */ rc0(t01 t01Var, t01 t01Var2, int i) {
        this.c = i;
        this.d = t01Var;
        this.e = t01Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        t01 t01Var = this.e;
        t01 t01Var2 = this.d;
        switch (i) {
            case 0:
                byte[] bArrC = nd0.c(t01Var2.c);
                byte[] bArrC2 = nd0.c(t01Var.c);
                t01Var2.b();
                t01Var.b();
                JniAdExt.jniOnRemoteRestartWithCredentials(bArrC, bArrC2);
                t70.a0(bArrC);
                t70.a0(bArrC2);
                break;
            default:
                byte[] bArrC3 = nd0.c(t01Var2.c);
                byte[] bArrC4 = nd0.c(t01Var.c);
                t01Var2.b();
                t01Var.b();
                JniAdExt.jniOnRequestElevationWithCredentials(bArrC3, bArrC4);
                t70.a0(bArrC3);
                t70.a0(bArrC4);
                break;
        }
    }
}
