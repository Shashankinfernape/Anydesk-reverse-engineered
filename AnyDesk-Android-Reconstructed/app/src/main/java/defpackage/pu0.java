package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends r71 {
    public final /* synthetic */ ss0 j;
    public final /* synthetic */ ss0 k;
    public final /* synthetic */ k0 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public pu0(ss0 ss0Var, ss0 ss0Var2, k0 k0Var, int i, int i2) {
        this.j = ss0Var;
        this.k = ss0Var2;
        this.l = k0Var;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.r71
    public final boolean c(int i, int i2) {
        Object objB = this.j.b(i);
        Object objB2 = this.k.b(i2);
        if (objB == objB2) {
            return true;
        }
        return this.l.L(objB, objB2);
    }

    @Override // defpackage.r71
    public final boolean d(int i, int i2) {
        Object objB = this.j.b(i);
        Object objB2 = this.k.b(i2);
        if (objB == objB2) {
            return true;
        }
        return this.l.M(objB, objB2);
    }

    @Override // defpackage.r71
    public final Object s(int i, int i2) {
        if (this.j.b(i) == this.k.b(i2)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // defpackage.r71
    public final int x() {
        return this.n;
    }

    @Override // defpackage.r71
    public final int y() {
        return this.m;
    }
}
