package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements ef0, ui {
    public final if0 c;
    public final l40 d;
    public uq0 e;
    public final /* synthetic */ wq0 f;

    public tq0(wq0 wq0Var, if0 if0Var, l40 l40Var) {
        l40Var.getClass();
        this.f = wq0Var;
        this.c = if0Var;
        this.d = l40Var;
        if0Var.a(this);
    }

    @Override // defpackage.ui
    public final void cancel() {
        this.c.f(this);
        l40 l40Var = this.d;
        l40Var.getClass();
        l40Var.b.remove(this);
        uq0 uq0Var = this.e;
        if (uq0Var != null) {
            uq0Var.cancel();
        }
        this.e = null;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        if (ze0Var != ze0.ON_START) {
            if (ze0Var != ze0.ON_STOP) {
                if (ze0Var == ze0.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                uq0 uq0Var = this.e;
                if (uq0Var != null) {
                    uq0Var.cancel();
                    return;
                }
                return;
            }
        }
        wq0 wq0Var = this.f;
        wq0Var.getClass();
        l40 l40Var = this.d;
        l40Var.getClass();
        wq0Var.b.addLast(l40Var);
        uq0 uq0Var2 = new uq0(wq0Var, l40Var);
        l40Var.b.add(uq0Var2);
        wq0Var.e();
        l40Var.c = new vq0(0, wq0Var, wq0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.e = uq0Var2;
    }
}
