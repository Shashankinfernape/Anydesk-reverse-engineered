package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ru extends u81 {
    public int e;

    public ru(int i) {
        super(0L, false);
        this.e = i;
    }

    public abstract rq c();

    public Throwable f(Object obj) {
        on onVar = obj instanceof on ? (on) obj : null;
        if (onVar != null) {
            return onVar.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        uj.s(c().e(), new or("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            rq rqVarC = c();
            rqVarC.getClass();
            pu puVar = (pu) rqVarC;
            sq sqVar = puVar.g;
            Object obj = puVar.i;
            br brVarE = sqVar.e();
            Object objJ = uj.J(brVarE, obj);
            pd0 pd0Var = null;
            sc1 sc1VarJ = objJ != uj.e ? ec1.J(sqVar, brVarE, objJ) : null;
            try {
                br brVarE2 = sqVar.e();
                Object objJ2 = j();
                Throwable thF = f(objJ2);
                if (thF == null) {
                    int i = this.e;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        pd0Var = (pd0) brVarE2.l(fw.f);
                    }
                }
                if (pd0Var != null && !pd0Var.a()) {
                    CancellationException cancellationExceptionN = pd0Var.n();
                    b(cancellationExceptionN);
                    sqVar.g(y90.m(cancellationExceptionN));
                } else if (thF != null) {
                    sqVar.g(new py0(thF));
                } else {
                    sqVar.g(h(objJ2));
                }
            } finally {
                if (sc1VarJ == null || sc1VarJ.k0()) {
                    uj.B(brVarE, objJ);
                }
            }
        } catch (ou e) {
            uj.s(c().e(), e.c);
        } catch (Throwable th) {
            i(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
