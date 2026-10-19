package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class t8 extends g5 {
    public final boolean b;

    public t8(f6 f6Var, n5 n5Var) {
        super(n5Var);
        this.b = true;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean e() {
        return !this.b || this.a.e();
    }
}
