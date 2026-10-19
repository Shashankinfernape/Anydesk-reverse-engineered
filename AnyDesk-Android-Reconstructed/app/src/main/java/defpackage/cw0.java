package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw0 implements c71, t10, o60 {
    public final /* synthetic */ e71 c;

    public cw0(e71 e71Var) {
        this.c = e71Var;
    }

    @Override // defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) throws Throwable {
        this.c.a(v10Var, rqVar);
        return lr.c;
    }

    @Override // defpackage.o60
    public final t10 b(br brVar, int i, oh ohVar) {
        return (((i < 0 || i >= 2) && i != -2) || ohVar != oh.d) ? bu0.n(this, brVar, i, ohVar) : this;
    }

    @Override // defpackage.c71
    public final Object getValue() {
        return this.c.getValue();
    }
}
