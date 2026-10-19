package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sq extends ag {
    public final br d;
    public transient rq e;

    public sq(rq rqVar) {
        this(rqVar, rqVar != null ? rqVar.e() : null);
    }

    @Override // defpackage.rq
    public br e() {
        br brVar = this.d;
        brVar.getClass();
        return brVar;
    }

    @Override // defpackage.ag
    public void n() {
        rq rqVar = this.e;
        if (rqVar != null && rqVar != this) {
            zq zqVarL = e().l(fw.d);
            zqVarL.getClass();
            pu puVar = (pu) rqVar;
            puVar.l();
            xi xiVarN = puVar.n();
            if (xiVarN != null) {
                xiVarN.p();
            }
        }
        this.e = nn.d;
    }

    public sq(rq rqVar, br brVar) {
        super(rqVar);
        this.d = brVar;
    }
}
