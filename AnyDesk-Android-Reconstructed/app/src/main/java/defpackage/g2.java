package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 extends wd0 implements rq, kr {
    public final br g;

    public g2(br brVar, boolean z) {
        super(z);
        M((pd0) brVar.l(fw.f));
        this.g = brVar.j(this);
    }

    @Override // defpackage.wd0
    public final void L(pn pnVar) {
        uj.s(this.g, pnVar);
    }

    @Override // defpackage.wd0
    public final void U(Object obj) {
        if (!(obj instanceof on)) {
            h0(obj);
        } else {
            on onVar = (on) obj;
            g0(onVar.a, on.b.get(onVar) == 1);
        }
    }

    @Override // defpackage.rq
    public final br e() {
        return this.g;
    }

    @Override // defpackage.kr
    public final br f() {
        return this.g;
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        Throwable thA = qy0.a(obj);
        if (thA != null) {
            obj = new on(thA, false);
        }
        Object objQ = Q(obj);
        if (objQ == ds.d) {
            return;
        }
        v(objQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(nr nrVar, g2 g2Var, d60 d60Var) {
        int iOrdinal = nrVar.ordinal();
        uc1 uc1Var = uc1.a;
        if (iOrdinal == 0) {
            try {
                r71.K(ds.u(((ag) d60Var).j(this, g2Var)), uc1Var);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof ou) {
                    th = ((ou) th).c;
                }
                g(y90.m(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ds.u(((ag) d60Var).j(this, g2Var)).g(uc1Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new pn();
            }
            try {
                br brVar = this.g;
                Object objJ = uj.J(brVar, null);
                try {
                    ec1.g(2, d60Var);
                    Object objF = d60Var.f(g2Var, this);
                    uj.B(brVar, objJ);
                    if (objF != lr.c) {
                        g(objF);
                    }
                } catch (Throwable th2) {
                    uj.B(brVar, objJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof ou) {
                    th = ((ou) th).c;
                }
                g(y90.m(th));
            }
        }
    }

    @Override // defpackage.wd0
    public final String z() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th, boolean z) {
    }
}
