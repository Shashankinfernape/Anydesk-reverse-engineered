package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms0 extends f81 implements d60 {
    public final /* synthetic */ int g;
    public os0 h;
    public xm0 i;
    public ns0 j;
    public int k;
    public final /* synthetic */ ns0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms0(ns0 ns0Var, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.l = ns0Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        kr krVar = (kr) obj;
        rq rqVar = (rq) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ms0) j(rqVar, krVar)).m(uc1Var);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        switch (this.g) {
            case 0:
                return new ms0(this.l, rqVar, 0);
            default:
                return new ms0(this.l, rqVar, 1);
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        os0 os0Var;
        xm0 xm0Var;
        os0 os0Var2;
        xm0 xm0Var2;
        int i = this.g;
        uc1 uc1Var = uc1.a;
        ns0 ns0Var = this.l;
        lr lrVar = lr.c;
        int i2 = 1;
        rq rqVar = null;
        switch (i) {
            case 0:
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        y90.V(obj);
                        os0Var = ns0Var.i;
                        xm0Var = os0Var.a;
                        this.h = os0Var;
                        this.i = xm0Var;
                        this.j = ns0Var;
                        this.k = 1;
                        if (xm0Var.d(this) != lrVar) {
                        }
                        return lrVar;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y90.V(obj);
                            return uc1Var;
                        }
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ns0Var = this.j;
                    xm0Var = this.i;
                    os0Var = this.h;
                    y90.V(obj);
                    rs0 rs0Var = os0Var.b;
                    i20 i20Var = new i20(new qs0(rs0Var, rqVar, i2), y90.i(rs0Var.i));
                    xm0Var.f(null);
                    this.h = null;
                    this.i = null;
                    this.j = null;
                    this.k = 2;
                    if (ns0.a(ns0Var, i20Var, xg0.d, this) != lrVar) {
                        return uc1Var;
                    }
                    return lrVar;
                } catch (Throwable th) {
                    xm0Var.f(null);
                    throw th;
                }
            default:
                int i4 = this.k;
                try {
                    if (i4 == 0) {
                        y90.V(obj);
                        os0Var2 = ns0Var.i;
                        xm0Var2 = os0Var2.a;
                        this.h = os0Var2;
                        this.i = xm0Var2;
                        this.j = ns0Var;
                        this.k = 1;
                        if (xm0Var2.d(this) != lrVar) {
                        }
                        return lrVar;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y90.V(obj);
                            return uc1Var;
                        }
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ns0Var = this.j;
                    xm0Var2 = this.i;
                    os0Var2 = this.h;
                    y90.V(obj);
                    rs0 rs0Var2 = os0Var2.b;
                    i20 i20Var2 = new i20(new qs0(rs0Var2, rqVar, 0), y90.i(rs0Var2.j));
                    xm0Var2.f(null);
                    this.h = null;
                    this.i = null;
                    this.j = null;
                    this.k = 2;
                    if (ns0.a(ns0Var, i20Var2, xg0.e, this) != lrVar) {
                        return uc1Var;
                    }
                    return lrVar;
                } catch (Throwable th2) {
                    xm0Var2.f(null);
                    throw th2;
                }
        }
    }
}
