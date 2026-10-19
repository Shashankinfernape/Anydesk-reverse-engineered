package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends td0 {
    public final wd0 j;
    public final vd0 k;
    public final nl l;
    public final Object m;

    public ud0(wd0 wd0Var, vd0 vd0Var, nl nlVar, Object obj) {
        this.j = wd0Var;
        this.k = vd0Var;
        this.l = nlVar;
        this.m = obj;
    }

    @Override // defpackage.td0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.td0
    public final void s(Throwable th) {
        nl nlVar = this.l;
        nl nlVarS = wd0.S(nlVar);
        wd0 wd0Var = this.j;
        vd0 vd0Var = this.k;
        Object obj = this.m;
        if (nlVarS == null || !wd0Var.f0(vd0Var, nlVarS, obj)) {
            vd0Var.c.e(new ag0(2), 2);
            nl nlVarS2 = wd0.S(nlVar);
            if (nlVarS2 == null || !wd0Var.f0(vd0Var, nlVarS2, obj)) {
                wd0Var.u(wd0Var.D(vd0Var, obj));
            }
        }
    }
}
