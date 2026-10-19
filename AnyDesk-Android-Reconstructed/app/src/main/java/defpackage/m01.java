package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class m01 extends g2 implements mr {
    public final rq h;

    public m01(rq rqVar, br brVar) {
        super(brVar, true);
        this.h = rqVar;
    }

    @Override // defpackage.wd0
    public final boolean P() {
        return true;
    }

    @Override // defpackage.mr
    public final mr d() {
        rq rqVar = this.h;
        if (rqVar instanceof mr) {
            return (mr) rqVar;
        }
        return null;
    }

    @Override // defpackage.wd0
    public void u(Object obj) throws ou {
        r71.K(ds.u(this.h), lk0.F(obj));
    }

    @Override // defpackage.wd0
    public void v(Object obj) {
        this.h.g(lk0.F(obj));
    }

    public void j0() {
    }
}
