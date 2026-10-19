package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy extends gy {
    public final ca1 e;

    public fy(long j, ca1 ca1Var) {
        super(j);
        this.e = ca1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.run();
    }

    @Override // defpackage.gy
    public final String toString() {
        return super.toString() + this.e;
    }
}
