package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class u8 extends g5 implements w8 {
    public u8(f6 f6Var, n5 n5Var, boolean z) {
        super(n5Var);
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // j$.util.stream.w8
    public final long h() {
        return 0L;
    }
}
