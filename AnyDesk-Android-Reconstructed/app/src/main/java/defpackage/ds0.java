package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ds0 extends f81 implements e60 {
    public int g;
    public /* synthetic */ v10 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ns0 j;
    public final /* synthetic */ xg0 k;
    public xm0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(rq rqVar, ns0 ns0Var, xg0 xg0Var) {
        super(3, rqVar);
        this.j = ns0Var;
        this.k = xg0Var;
    }

    @Override // defpackage.e60
    public final Object c(Object obj, Object obj2, Object obj3) {
        ds0 ds0Var = new ds0((rq) obj3, this.j, this.k);
        ds0Var.h = (v10) obj;
        ds0Var.i = obj2;
        return ds0Var.m(uc1.a);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) throws Throwable {
        v10 v10Var;
        int iIntValue;
        os0 os0Var;
        xm0 xm0Var;
        t10 j20Var;
        xg0 xg0Var = this.k;
        int i = this.g;
        uc1 uc1Var = uc1.a;
        ns0 ns0Var = this.j;
        lr lrVar = lr.c;
        try {
            if (i == 0) {
                y90.V(obj);
                v10Var = this.h;
                iIntValue = ((Number) this.i).intValue();
                os0Var = ns0Var.i;
                xm0Var = os0Var.a;
                this.h = v10Var;
                this.i = os0Var;
                this.l = xm0Var;
                this.m = iIntValue;
                this.g = 1;
                if (xm0Var.d(this) != lrVar) {
                }
            }
            if (i != 1) {
                if (i == 2) {
                    y90.V(obj);
                    return uc1Var;
                }
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iIntValue = this.m;
            xm0Var = this.l;
            os0Var = (os0) this.i;
            v10Var = this.h;
            y90.V(obj);
            y6 y6Var = os0Var.b.l;
            if (y6Var.q(xg0Var).equals(ug0.b)) {
                j20Var = new ji(2, new t60[0]);
                xm0Var.f(null);
            } else {
                if (!(y6Var.q(xg0Var) instanceof sg0)) {
                    y6Var.L(xg0Var, ug0.c);
                }
                xm0Var.f(null);
                j20Var = new j20(new j20(ns0Var.f.m(xg0Var), iIntValue == 0 ? 0 : 1, 0), iIntValue, 1);
            }
            this.h = null;
            this.i = null;
            this.l = null;
            this.g = 2;
            if (v10Var instanceof aa1) {
                throw ((aa1) v10Var).c;
            }
            Object objA = j20Var.a(v10Var, this);
            if (objA != lrVar) {
                objA = uc1Var;
            }
            return objA == lrVar ? lrVar : uc1Var;
        } catch (Throwable th) {
            xm0Var.f(null);
            throw th;
        }
    }
}
