package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class hh extends f81 implements d60 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh(Object obj, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.i = obj;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                return ((hh) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 1:
                return ((hh) j((rq) obj2, (v10) obj)).m(uc1Var);
            default:
                return ((hh) j((rq) obj2, (kr) obj)).m(uc1Var);
        }
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        switch (this.g) {
            case 0:
                return new hh((sb) this.i, rqVar, 0);
            case 1:
                hh hhVar = new hh(2, rqVar);
                hhVar.i = obj;
                return hhVar;
            default:
                return new hh((ns0) this.i, rqVar, 2);
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        v10 v10Var;
        ux0 ux0Var;
        int i = this.g;
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        rq rqVar = null;
        switch (i) {
            case 0:
                sb sbVar = (sb) this.i;
                int i2 = this.h;
                if (i2 == 0) {
                    y90.V(obj);
                    sbVar.getClass();
                    this.h = 1;
                    if (bu0.i(5000L, this) == lrVar) {
                        return lrVar;
                    }
                } else {
                    if (i2 != 1) {
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y90.V(obj);
                }
                if (((gr) sbVar.a).c > 0) {
                    return uc1Var;
                }
                z61 z61Var = (z61) sbVar.e;
                if (z61Var != null) {
                    z61Var.b(null);
                }
                sbVar.e = null;
                return uc1Var;
            case 1:
                int i3 = this.h;
                if (i3 == 0) {
                    y90.V(obj);
                    v10Var = (v10) this.i;
                    ux0Var = null;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y90.V(obj);
                            return uc1Var;
                        }
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v10Var = (v10) this.i;
                    y90.V(obj);
                    ux0Var = (ux0) obj;
                }
                Boolean boolValueOf = Boolean.valueOf(ux0Var == ux0.c);
                this.i = null;
                this.h = 2;
                return v10Var.i(boolValueOf, this) == lrVar ? lrVar : uc1Var;
            default:
                ns0 ns0Var = (ns0) this.i;
                int i4 = this.h;
                int i5 = 3;
                if (i4 == 0) {
                    y90.V(obj);
                    t10[] t10VarArr = {ns0Var.f.m(xg0.e), ns0Var.f.m(xg0.d)};
                    int i6 = p20.a;
                    ok okVar = new ok(new be(t10VarArr), kx.c, -2, oh.c);
                    s1 s1Var = new s1(ns0Var, rqVar, i5);
                    this.h = 1;
                    obj = y90.r(okVar, s1Var, this);
                    if (obj == lrVar) {
                        return lrVar;
                    }
                } else {
                    if (i4 != 1) {
                        nh0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y90.V(obj);
                }
                vf1 vf1Var = (vf1) obj;
                if (vf1Var == null) {
                    return uc1Var;
                }
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    Log.d("Paging", "Jump triggered on PagingSource " + ns0Var.b + " by " + vf1Var, null);
                }
                ns0Var.e.a();
                return uc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh(int i, rq rqVar) {
        super(i, rqVar);
        this.g = 1;
    }
}
