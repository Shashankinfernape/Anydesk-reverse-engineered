package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class me0 implements le0 {
    public boolean c;
    public int d;
    public final int e;
    public final af1 f;

    public me0(int i, af1 af1Var) {
        this.c = false;
        this.e = i;
        this.f = af1Var;
        if (i == 0) {
            this.c = true;
            af1Var.u(0, null);
        }
    }

    @Override // defpackage.le0
    public final void u(int i, Throwable th) {
        if (this.c) {
            return;
        }
        if (i == 0) {
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 < this.e) {
                return;
            }
        }
        this.c = true;
        this.f.u(i, th);
    }
}
