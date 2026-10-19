package defpackage;

import com.anydesk.anydeskandroid.MainApplication;

/* JADX INFO: loaded from: classes.dex */
public final class n21 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ r21 d;

    public /* synthetic */ n21(r21 r21Var, int i) {
        this.c = i;
        this.d = r21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        r21 r21Var = this.d;
        switch (i) {
            case 0:
                r21Var.Y0();
                MainApplication.v().o();
                break;
            default:
                r21Var.T0();
                r21Var.X0();
                break;
        }
    }
}
