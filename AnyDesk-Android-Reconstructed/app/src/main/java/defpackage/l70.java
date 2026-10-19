package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l70 extends hg1 {
    @Override // defpackage.ht
    public final void a(ht htVar) {
        kt ktVar = this.h;
        if (ktVar.c && !ktVar.j) {
            ktVar.d((int) ((((kt) ktVar.l.get(0)).g * ((k70) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.hg1
    public final void d() {
        bq bqVar = this.b;
        k70 k70Var = (k70) bqVar;
        int i = k70Var.r0;
        int i2 = k70Var.s0;
        int i3 = k70Var.u0;
        kt ktVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                ktVar.l.add(bqVar.T.d.h);
                this.b.T.d.h.k.add(ktVar);
                ktVar.f = i;
            } else if (i2 != -1) {
                ktVar.l.add(bqVar.T.d.i);
                this.b.T.d.i.k.add(ktVar);
                ktVar.f = -i2;
            } else {
                ktVar.b = true;
                ktVar.l.add(bqVar.T.d.i);
                this.b.T.d.i.k.add(ktVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            ktVar.l.add(bqVar.T.e.h);
            this.b.T.e.h.k.add(ktVar);
            ktVar.f = i;
        } else if (i2 != -1) {
            ktVar.l.add(bqVar.T.e.i);
            this.b.T.e.i.k.add(ktVar);
            ktVar.f = -i2;
        } else {
            ktVar.b = true;
            ktVar.l.add(bqVar.T.e.i);
            this.b.T.e.i.k.add(ktVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.hg1
    public final void e() {
        bq bqVar = this.b;
        int i = ((k70) bqVar).u0;
        kt ktVar = this.h;
        if (i == 1) {
            bqVar.Y = ktVar.g;
        } else {
            bqVar.Z = ktVar.g;
        }
    }

    @Override // defpackage.hg1
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.hg1
    public final boolean k() {
        return false;
    }

    public final void m(kt ktVar) {
        kt ktVar2 = this.h;
        ktVar2.k.add(ktVar);
        ktVar.l.add(ktVar2);
    }
}
