package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l20 implements v10 {
    public final /* synthetic */ lx0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v10 e;

    public l20(lx0 lx0Var, int i, v10 v10Var) {
        this.c = lx0Var;
        this.d = i;
        this.e = v10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        k20 k20Var;
        if (rqVar instanceof k20) {
            k20Var = (k20) rqVar;
            int i = k20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                k20Var.h = i - Integer.MIN_VALUE;
            } else {
                k20Var = new k20(this, rqVar);
            }
        } else {
            k20Var = new k20(this, rqVar);
        }
        Object obj2 = k20Var.f;
        int i2 = k20Var.h;
        uc1 uc1Var = uc1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                y90.V(obj2);
                return uc1Var;
            }
            nh0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y90.V(obj2);
        lx0 lx0Var = this.c;
        int i3 = lx0Var.c;
        if (i3 < this.d) {
            lx0Var.c = i3 + 1;
            return uc1Var;
        }
        k20Var.h = 1;
        Object objI = this.e.i(obj, k20Var);
        lr lrVar = lr.c;
        return objI == lrVar ? lrVar : uc1Var;
    }
}
