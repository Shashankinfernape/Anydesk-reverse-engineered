package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r20 implements v10 {
    public final /* synthetic */ int c;
    public final /* synthetic */ d60 d;
    public final /* synthetic */ mx0 e;

    public /* synthetic */ r20(d60 d60Var, mx0 mx0Var, int i) {
        this.c = i;
        this.d = d60Var;
        this.e = mx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        q20 q20Var;
        r20 r20Var;
        t20 t20Var;
        r20 r20Var2;
        int i = this.c;
        uc1 uc1Var = uc1.a;
        d60 d60Var = this.d;
        lr lrVar = lr.c;
        switch (i) {
            case 0:
                if (rqVar instanceof q20) {
                    q20Var = (q20) rqVar;
                    int i2 = q20Var.h;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        q20Var.h = i2 - Integer.MIN_VALUE;
                    } else {
                        q20Var = new q20(this, rqVar);
                    }
                } else {
                    q20Var = new q20(this, rqVar);
                }
                Object objF = q20Var.g;
                int i3 = q20Var.h;
                if (i3 == 0) {
                    y90.V(objF);
                    q20Var.f = this;
                    q20Var.j = obj;
                    q20Var.h = 1;
                    objF = d60Var.f(obj, q20Var);
                    if (objF == lrVar) {
                        return lrVar;
                    }
                    r20Var = this;
                } else {
                    if (i3 != 1) {
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = q20Var.j;
                    r20Var = q20Var.f;
                    y90.V(objF);
                }
                if (!((Boolean) objF).booleanValue()) {
                    return uc1Var;
                }
                r20Var.e.c = obj;
                throw new x1(r20Var);
            default:
                if (rqVar instanceof t20) {
                    t20Var = (t20) rqVar;
                    int i4 = t20Var.h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        t20Var.h = i4 - Integer.MIN_VALUE;
                    } else {
                        t20Var = new t20(this, rqVar);
                    }
                } else {
                    t20Var = new t20(this, rqVar);
                }
                Object objF2 = t20Var.g;
                int i5 = t20Var.h;
                if (i5 == 0) {
                    y90.V(objF2);
                    t20Var.f = this;
                    t20Var.j = obj;
                    t20Var.h = 1;
                    objF2 = d60Var.f(obj, t20Var);
                    if (objF2 == lrVar) {
                        return lrVar;
                    }
                    r20Var2 = this;
                } else {
                    if (i5 != 1) {
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = t20Var.j;
                    r20Var2 = t20Var.f;
                    y90.V(objF2);
                }
                if (!((Boolean) objF2).booleanValue()) {
                    return uc1Var;
                }
                r20Var2.e.c = obj;
                throw new x1(r20Var2);
        }
    }
}
