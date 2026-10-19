package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v20 extends f81 implements d60 {
    public /* synthetic */ int g;

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((v20) j((rq) obj2, Integer.valueOf(((Number) obj).intValue()))).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        v20 v20Var = new v20(2, rqVar);
        v20Var.g = ((Number) obj).intValue();
        return v20Var;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        y90.V(obj);
        return Boolean.valueOf(this.g > 0);
    }
}
