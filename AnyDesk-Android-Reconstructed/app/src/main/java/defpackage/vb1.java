package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 extends rb1 {
    public final /* synthetic */ int a = 1;
    public qb1 b;

    public vb1(qb1 qb1Var) {
        this.b = qb1Var;
    }

    @Override // defpackage.rb1, defpackage.pb1
    public void b(qb1 qb1Var) {
        switch (this.a) {
            case 1:
                pf pfVar = (pf) this.b;
                if (!pfVar.F) {
                    pfVar.G();
                    pfVar.F = true;
                }
                break;
        }
    }

    @Override // defpackage.pb1
    public final void e(qb1 qb1Var) {
        switch (this.a) {
            case 0:
                this.b.z();
                qb1Var.x(this);
                break;
            default:
                pf pfVar = (pf) this.b;
                int i = pfVar.E - 1;
                pfVar.E = i;
                if (i == 0) {
                    pfVar.F = false;
                    pfVar.m();
                }
                qb1Var.x(this);
                break;
        }
    }

    public /* synthetic */ vb1() {
    }
}
