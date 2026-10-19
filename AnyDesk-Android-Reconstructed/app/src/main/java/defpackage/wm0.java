package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements vi, bg1 {
    public final xi c;
    public final /* synthetic */ xm0 d;

    public wm0(xm0 xm0Var, xi xiVar) {
        this.d = xm0Var;
        this.c = xiVar;
    }

    @Override // defpackage.bg1
    public final void a(w01 w01Var, int i) {
        this.c.a(w01Var, i);
    }

    @Override // defpackage.rq
    public final br e() {
        return this.c.g;
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        this.c.g(obj);
    }

    @Override // defpackage.vi
    public final bx k(Object obj, e60 e60Var) {
        xm0 xm0Var = this.d;
        wi wiVar = new wi(xm0Var, this);
        bx bxVarH = this.c.H((uc1) obj, wiVar);
        if (bxVarH != null) {
            xm0.i.set(xm0Var, null);
        }
        return bxVarH;
    }

    @Override // defpackage.vi
    public final void t(Object obj) {
        this.c.t(obj);
    }
}
