package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t41 implements uu {
    public final v41 c;
    public final long d;
    public final Object e;
    public final xi f;

    public t41(v41 v41Var, long j, Object obj, xi xiVar) {
        this.c = v41Var;
        this.d = j;
        this.e = obj;
        this.f = xiVar;
    }

    @Override // defpackage.uu
    public final void b() {
        v41 v41Var = this.c;
        synchronized (v41Var) {
            if (this.d < v41Var.n()) {
                return;
            }
            Object[] objArr = v41Var.j;
            objArr.getClass();
            long j = this.d;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            bu0.c(objArr, j, bu0.f);
            v41Var.h();
        }
    }
}
