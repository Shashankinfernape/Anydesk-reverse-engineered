package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends f81 implements d60 {
    public int g;
    public final /* synthetic */ cf h;
    public final /* synthetic */ int i;
    public final /* synthetic */ vs0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(cf cfVar, int i, vs0 vs0Var, rq rqVar) {
        super(2, rqVar);
        this.h = cfVar;
        this.i = i;
        this.j = vs0Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((bf) j((rq) obj2, (kr) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        return new bf(this.h, this.i, this.j, rqVar);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        if (i != 0) {
            if (i == 1) {
                y90.V(obj);
                return uc1Var;
            }
            nh0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y90.V(obj);
        cf cfVar = this.h;
        if (cfVar.h.get() == this.i) {
            xe xeVar = cfVar.g;
            this.g = 1;
            Object objS = xeVar.g.s(new ft0(xeVar, this.j, null), this);
            lr lrVar = lr.c;
            if (objS != lrVar) {
                objS = uc1Var;
            }
            if (objS == lrVar) {
                return lrVar;
            }
        }
        return uc1Var;
    }
}
