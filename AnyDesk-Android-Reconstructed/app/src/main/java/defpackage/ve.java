package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ve extends f81 implements d60 {
    public /* synthetic */ boolean g;

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ve) j((rq) obj2, bool)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        ve veVar = new ve(2, rqVar);
        veVar.g = ((Boolean) obj).booleanValue();
        return veVar;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        y90.V(obj);
        return Boolean.valueOf(!this.g);
    }
}
