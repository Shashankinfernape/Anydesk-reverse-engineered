package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ca1 extends m01 implements Runnable {
    public final long i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ca1(long j, p1 p1Var) {
        br brVar = p1Var.d;
        brVar.getClass();
        super(p1Var, brVar);
        this.i = j;
    }

    @Override // defpackage.wd0
    public final String R() {
        return super.R() + "(timeMillis=" + this.i + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        bu0.p(this.g);
        w(new ba1("Timed out waiting for " + this.i + " ms", this));
    }
}
