package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends r71 {
    @Override // defpackage.r71
    public final void E(t2 t2Var, t2 t2Var2) {
        t2Var.b = t2Var2;
    }

    @Override // defpackage.r71
    public final void F(t2 t2Var, Thread thread) {
        t2Var.a = thread;
    }

    @Override // defpackage.r71
    public final boolean f(u2 u2Var, q2 q2Var) {
        q2 q2Var2 = q2.b;
        synchronized (u2Var) {
            try {
                if (u2Var.d != q2Var) {
                    return false;
                }
                u2Var.d = q2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r71
    public final boolean g(u2 u2Var, Object obj, Object obj2) {
        synchronized (u2Var) {
            try {
                if (u2Var.c != obj) {
                    return false;
                }
                u2Var.c = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r71
    public final boolean h(u2 u2Var, t2 t2Var, t2 t2Var2) {
        synchronized (u2Var) {
            try {
                if (u2Var.e != t2Var) {
                    return false;
                }
                u2Var.e = t2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
