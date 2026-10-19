package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts0 extends f81 implements z50 {
    public final /* synthetic */ y g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(y yVar, rq rqVar) {
        super(1, rqVar);
        this.g = yVar;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        return new ts0(this.g, (rq) obj).m(uc1.a);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        y90.V(obj);
        return this.g.a();
    }
}
