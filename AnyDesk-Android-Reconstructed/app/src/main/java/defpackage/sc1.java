package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sc1 extends m01 {
    public final ThreadLocal i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public sc1(rq rqVar, br brVar) {
        tc1 tc1Var = tc1.c;
        super(rqVar, brVar.l(tc1Var) == null ? brVar.j(tc1Var) : brVar);
        this.i = new ThreadLocal();
        if (rqVar.e().l(fw.d) instanceof dr) {
            return;
        }
        Object objJ = uj.J(brVar, null);
        uj.B(brVar, objJ);
        m0(brVar, objJ);
    }

    @Override // defpackage.m01
    public final void j0() {
        l0();
    }

    public final boolean k0() {
        boolean z = this.threadLocalIsSet && this.i.get() == null;
        this.i.remove();
        return !z;
    }

    public final void l0() {
        if (this.threadLocalIsSet) {
            st0 st0Var = (st0) this.i.get();
            if (st0Var != null) {
                uj.B((br) st0Var.c, st0Var.d);
            }
            this.i.remove();
        }
    }

    public final void m0(br brVar, Object obj) {
        this.threadLocalIsSet = true;
        this.i.set(new st0(brVar, obj));
    }

    @Override // defpackage.m01, defpackage.wd0
    public final void v(Object obj) {
        l0();
        Object objF = lk0.F(obj);
        rq rqVar = this.h;
        br brVarE = rqVar.e();
        Object objJ = uj.J(brVarE, null);
        sc1 sc1VarJ = objJ != uj.e ? ec1.J(rqVar, brVarE, objJ) : null;
        try {
            rqVar.g(objF);
        } finally {
            if (sc1VarJ == null || sc1VarJ.k0()) {
                uj.B(brVarE, objJ);
            }
        }
    }
}
