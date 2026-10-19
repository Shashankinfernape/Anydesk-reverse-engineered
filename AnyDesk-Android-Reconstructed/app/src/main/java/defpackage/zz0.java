package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zz0 implements ef0, AutoCloseable {
    public final String c;
    public final yz0 d;
    public boolean e;

    public zz0(String str, yz0 yz0Var) {
        this.c = str;
        this.d = yz0Var;
    }

    public final void b(if0 if0Var, ui0 ui0Var) {
        ui0Var.getClass();
        if0Var.getClass();
        if (this.e) {
            nh0.j("Already attached to lifecycleOwner");
            return;
        }
        this.e = true;
        if0Var.a(this);
        ui0Var.s(this.c, (k40) this.d.b.e);
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        if (ze0Var == ze0.ON_DESTROY) {
            this.e = false;
            gf0Var.R().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
