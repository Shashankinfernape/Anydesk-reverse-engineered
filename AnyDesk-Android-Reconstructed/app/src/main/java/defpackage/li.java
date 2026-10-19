package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class li extends f81 implements e60 {
    public int g;
    public /* synthetic */ tm0 h;
    public /* synthetic */ tm0 i;

    @Override // defpackage.e60
    public final Object c(Object obj, Object obj2, Object obj3) {
        li liVar = new li(3, (rq) obj3);
        liVar.h = (tm0) obj;
        liVar.i = (tm0) obj2;
        return liVar.m(uc1.a);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tm0 tm0Var = this.h;
            y90.V(obj);
            return tm0Var;
        }
        y90.V(obj);
        tm0 tm0Var2 = this.h;
        tm0 tm0Var3 = this.i;
        this.h = tm0Var3;
        this.g = 1;
        ((z61) tm0Var2.b.d).b(null);
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        return uc1Var == lrVar ? lrVar : tm0Var3;
    }
}
