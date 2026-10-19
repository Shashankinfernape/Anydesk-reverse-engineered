package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s61 implements rq, mr {
    public final rq c;
    public final br d;

    public s61(rq rqVar, br brVar) {
        this.c = rqVar;
        this.d = brVar;
    }

    @Override // defpackage.mr
    public final mr d() {
        rq rqVar = this.c;
        if (rqVar instanceof mr) {
            return (mr) rqVar;
        }
        return null;
    }

    @Override // defpackage.rq
    public final br e() {
        return this.d;
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        this.c.g(obj);
    }
}
