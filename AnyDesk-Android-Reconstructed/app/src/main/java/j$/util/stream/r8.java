package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class r8 extends i5 {
    public final boolean b;

    public r8(h6 h6Var, n5 n5Var) {
        super(n5Var);
        this.b = true;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean e() {
        return !this.b || this.a.e();
    }
}
