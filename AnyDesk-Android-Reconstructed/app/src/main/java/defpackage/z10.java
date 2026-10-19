package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z10 extends f81 implements d60 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ t10 j;
    public final /* synthetic */ e60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(t10 t10Var, e60 e60Var, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.j = t10Var;
        this.k = e60Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                return ((z10) j((rq) obj2, (v10) obj)).m(uc1Var);
            default:
                return ((z10) j((rq) obj2, (j51) obj)).m(uc1Var);
        }
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        int i = this.g;
        e60 e60Var = this.k;
        t10 t10Var = this.j;
        switch (i) {
            case 0:
                z10 z10Var = new z10(t10Var, e60Var, rqVar, 0);
                z10Var.i = obj;
                return z10Var;
            default:
                z10 z10Var2 = new z10(t10Var, e60Var, rqVar, 1);
                z10Var2.i = obj;
                return z10Var2;
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        e60 e60Var = this.k;
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        int i2 = 1;
        rq rqVar = null;
        switch (i) {
            case 0:
                int i3 = this.h;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
                v10 v10Var = (v10) this.i;
                mx0 mx0Var = new mx0();
                mx0Var.c = uj.c;
                y10 y10Var = new y10(mx0Var, e60Var, v10Var, 0);
                this.h = 1;
                return this.j.a(y10Var, this) == lrVar ? lrVar : uc1Var;
            default:
                int i4 = this.h;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
                af afVar = new af(e60Var, new fi((j51) this.i), rqVar, 4);
                this.h = 1;
                int i5 = p20.a;
                Object objA = y90.h(new nk(new ki((Object) afVar, rqVar, i2), this.j, kx.c, -2, oh.c), 0).a(yp0.c, this);
                if (objA != lrVar) {
                    objA = uc1Var;
                }
                if (objA != lrVar) {
                    objA = uc1Var;
                }
                return objA == lrVar ? lrVar : uc1Var;
        }
    }
}
