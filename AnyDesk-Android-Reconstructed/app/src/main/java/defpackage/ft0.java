package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends f81 implements z50 {
    public int g;
    public final /* synthetic */ xe h;
    public final /* synthetic */ vs0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(xe xeVar, vs0 vs0Var, rq rqVar) {
        super(1, rqVar);
        this.h = xeVar;
        this.i = vs0Var;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        return new ft0(this.h, this.i, (rq) obj).m(uc1.a);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        if (i == 0) {
            y90.V(obj);
            vs0 vs0Var = this.i;
            oc1 oc1Var = vs0Var.b;
            xe xeVar = this.h;
            oc1 oc1Var2 = xeVar.c;
            xeVar.c = oc1Var;
            if (oc1Var2 instanceof et0) {
                et0 et0Var = (et0) oc1Var2;
                if (et0Var.c) {
                    oc1Var.a();
                }
                if (et0Var.d) {
                    oc1Var.f();
                }
            }
            t10 t10Var = vs0Var.a;
            o20 o20Var = new o20(xeVar, 3, vs0Var);
            this.g = 1;
            Object objA = t10Var.a(o20Var, this);
            lr lrVar = lr.c;
            if (objA == lrVar) {
                return lrVar;
            }
        } else {
            if (i != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y90.V(obj);
        }
        return uc1.a;
    }
}
