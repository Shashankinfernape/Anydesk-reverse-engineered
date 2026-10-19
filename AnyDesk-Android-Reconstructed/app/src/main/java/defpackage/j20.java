package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j20 implements t10 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t10 e;

    public /* synthetic */ j20(t10 t10Var, int i, int i2) {
        this.c = i2;
        this.e = t10Var;
        this.d = i;
    }

    @Override // defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) {
        int i = this.c;
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        int i2 = this.d;
        t10 t10Var = this.e;
        switch (i) {
            case 0:
                Object objA = t10Var.a(new l20(new lx0(), i2, v10Var), rqVar);
                return objA == lrVar ? objA : uc1Var;
            default:
                Object objA2 = ((j20) t10Var).a(new en(v10Var, i2, 1), rqVar);
                return objA2 == lrVar ? objA2 : uc1Var;
        }
    }
}
