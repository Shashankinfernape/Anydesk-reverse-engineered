package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kk extends f81 implements d60 {
    public final /* synthetic */ int g = 0;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ nk j;
    public final /* synthetic */ v10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(nk nkVar, v10 v10Var, Object obj, rq rqVar) {
        super(2, rqVar);
        this.j = nkVar;
        this.k = v10Var;
        this.i = obj;
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
        return ((kk) j(rqVar, krVar)).m(uc1Var);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        int i = this.g;
        v10 v10Var = this.k;
        nk nkVar = this.j;
        switch (i) {
            case 0:
                return new kk(nkVar, v10Var, this.i, rqVar);
            default:
                kk kkVar = new kk(nkVar, v10Var, rqVar);
                kkVar.i = obj;
                return kkVar;
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        v10 v10Var = this.k;
        nk nkVar = this.j;
        lr lrVar = lr.c;
        switch (i) {
            case 0:
                int i2 = this.h;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
                ki kiVar = nkVar.g;
                Object obj2 = this.i;
                this.h = 1;
                return kiVar.c(v10Var, obj2, this) == lrVar ? lrVar : uc1Var;
            default:
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
                kr krVar = (kr) this.i;
                mx0 mx0Var = new mx0();
                t10 t10Var = nkVar.f;
                mk mkVar = new mk(mx0Var, krVar, nkVar, v10Var);
                this.h = 1;
                return t10Var.a(mkVar, this) == lrVar ? lrVar : uc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(nk nkVar, v10 v10Var, rq rqVar) {
        super(2, rqVar);
        this.j = nkVar;
        this.k = v10Var;
    }
}
