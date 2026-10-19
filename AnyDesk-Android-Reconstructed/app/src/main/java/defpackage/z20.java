package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z20 implements t10 {
    public final /* synthetic */ bw0 c;
    public final /* synthetic */ e71 d;
    public final /* synthetic */ t1 e;

    public z20(bw0 bw0Var, e71 e71Var, t1 t1Var) {
        this.c = bw0Var;
        this.d = e71Var;
        this.e = t1Var;
    }

    @Override // defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) throws Throwable {
        gn gnVar = new gn(new t10[]{this.c, this.d}, new ki((Object) this.e, (rq) null, 2), v10Var, null);
        w10 w10Var = new w10(rqVar, rqVar.e());
        Object objL = bu0.L(w10Var, true, w10Var, gnVar);
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        if (objL != lrVar) {
            objL = uc1Var;
        }
        return objL == lrVar ? objL : uc1Var;
    }
}
