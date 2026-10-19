package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xo implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ nu0 d;

    public /* synthetic */ xo(nu0 nu0Var, int i) {
        this.c = i;
        this.d = nu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        nu0 nu0Var = this.d;
        switch (i) {
            case 0:
                if (nu0Var.i) {
                    lu0 lu0Var = nu0Var.l;
                    lu0 lu0Var2 = nu0Var.m;
                    if (lu0Var != lu0Var2) {
                        nu0Var.b(lu0Var, lu0Var2);
                    }
                    lu0 lu0Var3 = nu0Var.l;
                    if (lu0Var3 != null) {
                        lu0Var3.c();
                        if (lu0Var3.i) {
                            lu0Var3.a();
                        }
                    }
                }
                break;
            default:
                if (nu0Var.i) {
                    nu0Var.i = false;
                    nu0Var.postInvalidate();
                }
                break;
        }
    }
}
