package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mk implements v10 {
    public final /* synthetic */ mx0 c;
    public final /* synthetic */ kr d;
    public final /* synthetic */ nk e;
    public final /* synthetic */ v10 f;

    public mk(mx0 mx0Var, kr krVar, nk nkVar, v10 v10Var) {
        this.c = mx0Var;
        this.d = krVar;
        this.e = nkVar;
        this.f = v10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        lk lkVar;
        mk mkVar;
        if (rqVar instanceof lk) {
            lkVar = (lk) rqVar;
            int i = lkVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkVar.j = i - Integer.MIN_VALUE;
            } else {
                lkVar = new lk(this, rqVar);
            }
        } else {
            lkVar = new lk(this, rqVar);
        }
        Object obj2 = lkVar.h;
        int i2 = lkVar.j;
        if (i2 == 0) {
            y90.V(obj2);
            pd0 pd0Var = (pd0) this.c.c;
            if (pd0Var != null) {
                pd0Var.b(new kl("Child of the scoped flow was cancelled"));
                lkVar.f = this;
                lkVar.g = obj;
                lkVar.j = 1;
                Object objS = pd0Var.s(lkVar);
                lr lrVar = lr.c;
                if (objS == lrVar) {
                    return lrVar;
                }
            }
            mkVar = this;
        } else {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = lkVar.g;
            mkVar = lkVar.f;
            y90.V(obj2);
        }
        mkVar.c.c = th1.B(mkVar.d, null, nr.f, new kk(mkVar.e, mkVar.f, obj, null), 1);
        return uc1.a;
    }
}
