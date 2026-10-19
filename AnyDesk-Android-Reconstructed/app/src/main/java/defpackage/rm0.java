package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rm0 extends f81 implements e60 {
    public final /* synthetic */ tm0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm0(tm0 tm0Var, rq rqVar) {
        super(3, rqVar);
        this.g = tm0Var;
    }

    @Override // defpackage.e60
    public final Object c(Object obj, Object obj2, Object obj3) {
        rm0 rm0Var = new rm0(this.g, (rq) obj3);
        uc1 uc1Var = uc1.a;
        rm0Var.m(uc1Var);
        return uc1Var;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        y90.V(obj);
        this.g.getClass();
        return uc1.a;
    }
}
