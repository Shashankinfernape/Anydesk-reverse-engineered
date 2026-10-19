package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nk extends ik {
    public final ki g;

    public nk(ki kiVar, t10 t10Var, br brVar, int i, oh ohVar) {
        super(i, ohVar, brVar, t10Var);
        this.g = kiVar;
    }

    @Override // defpackage.hk
    public final hk e(br brVar, int i, oh ohVar) {
        return new nk(this.g, this.f, brVar, i, ohVar);
    }

    @Override // defpackage.ik
    public final Object h(v10 v10Var, rq rqVar) {
        Object objL = hq.l(new kk(this, v10Var, null), rqVar);
        return objL == lr.c ? objL : uc1.a;
    }
}
