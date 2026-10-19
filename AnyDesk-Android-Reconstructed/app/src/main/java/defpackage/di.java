package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di implements v10 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ v10 d;
    public final /* synthetic */ lx0 e;

    public di(v10 v10Var, lx0 lx0Var) {
        this.d = v10Var;
        this.e = lx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(d90 d90Var, rq rqVar) {
        ci ciVar;
        di diVar;
        if (rqVar instanceof ci) {
            ciVar = (ci) rqVar;
            int i = ciVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ciVar.j = i - Integer.MIN_VALUE;
            } else {
                ciVar = new ci(this, rqVar);
            }
        } else {
            ciVar = new ci(this, rqVar);
        }
        Object obj = ciVar.h;
        int i2 = ciVar.j;
        if (i2 == 0) {
            y90.V(obj);
            d90Var.getClass();
            if (d90Var.a > this.e.c) {
                Object obj2 = d90Var.b;
                ciVar.f = this;
                ciVar.g = d90Var;
                ciVar.j = 1;
                Object objI = this.d.i(obj2, ciVar);
                lr lrVar = lr.c;
                if (objI == lrVar) {
                    return lrVar;
                }
                diVar = this;
            }
            return uc1.a;
        }
        if (i2 != 1) {
            nh0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d90Var = ciVar.g;
        diVar = ciVar.f;
        y90.V(obj);
        diVar.e.c = d90Var.a;
        return uc1.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        y20 y20Var;
        switch (this.c) {
            case 0:
                return a((d90) obj, rqVar);
            default:
                if (rqVar instanceof y20) {
                    y20Var = (y20) rqVar;
                    int i = y20Var.h;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y20Var.h = i - Integer.MIN_VALUE;
                    } else {
                        y20Var = new y20(this, rqVar);
                    }
                } else {
                    y20Var = new y20(this, rqVar);
                }
                Object obj2 = y20Var.f;
                int i2 = y20Var.h;
                if (i2 == 0) {
                    y90.V(obj2);
                    lx0 lx0Var = this.e;
                    int i3 = lx0Var.c;
                    lx0Var.c = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    d90 d90Var = new d90(i3, obj);
                    y20Var.h = 1;
                    Object objI = this.d.i(d90Var, y20Var);
                    lr lrVar = lr.c;
                    if (objI == lrVar) {
                        return lrVar;
                    }
                } else {
                    if (i2 != 1) {
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y90.V(obj2);
                }
                return uc1.a;
        }
    }

    public di(lx0 lx0Var, v10 v10Var) {
        this.e = lx0Var;
        this.d = v10Var;
    }
}
