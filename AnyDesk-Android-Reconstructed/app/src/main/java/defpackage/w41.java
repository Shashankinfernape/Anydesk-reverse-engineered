package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w41 extends w2 {
    public long a;
    public xi b;

    @Override // defpackage.w2
    public final boolean a(v2 v2Var) {
        v41 v41Var = (v41) v2Var;
        if (this.a >= 0) {
            return false;
        }
        long j = v41Var.k;
        if (j < v41Var.l) {
            v41Var.l = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.w2
    public final rq[] b(v2 v2Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((v41) v2Var).u(j);
    }
}
