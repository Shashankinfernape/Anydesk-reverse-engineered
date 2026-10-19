package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ua1 extends hq {
    public final /* synthetic */ int s;
    public boolean t;
    public int u;
    public final /* synthetic */ Object v;

    public ua1(ef1 ef1Var) {
        this.s = 1;
        this.v = ef1Var;
        this.t = false;
        this.u = 0;
    }

    @Override // defpackage.ff1
    public final void a() {
        int i = this.s;
        Object obj = this.v;
        switch (i) {
            case 0:
                if (!this.t) {
                    ((va1) obj).a.setVisibility(this.u);
                }
                break;
            default:
                int i2 = this.u + 1;
                this.u = i2;
                ef1 ef1Var = (ef1) obj;
                if (i2 == ef1Var.a.size()) {
                    ff1 ff1Var = ef1Var.d;
                    if (ff1Var != null) {
                        ff1Var.a();
                    }
                    this.u = 0;
                    this.t = false;
                    ef1Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.hq, defpackage.ff1
    public void c() {
        switch (this.s) {
            case 0:
                this.t = true;
                break;
        }
    }

    @Override // defpackage.hq, defpackage.ff1
    public final void e() {
        int i = this.s;
        Object obj = this.v;
        switch (i) {
            case 0:
                ((va1) obj).a.setVisibility(0);
                break;
            default:
                if (!this.t) {
                    this.t = true;
                    ff1 ff1Var = ((ef1) obj).d;
                    if (ff1Var != null) {
                        ff1Var.e();
                    }
                    break;
                }
                break;
        }
    }

    public ua1(va1 va1Var, int i) {
        this.s = 0;
        this.v = va1Var;
        this.u = i;
        this.t = false;
    }
}
