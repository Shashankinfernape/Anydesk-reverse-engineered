package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ mr0 d;

    public /* synthetic */ lr0(mr0 mr0Var, int i) {
        this.c = i;
        this.d = mr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        mr0 mr0Var = this.d;
        switch (i) {
            case 0:
                mr0Var.b();
                break;
            default:
                mr0Var.c();
                su0 su0Var = mr0Var.d;
                if (su0Var != null) {
                    su0Var.a();
                }
                break;
        }
    }
}
