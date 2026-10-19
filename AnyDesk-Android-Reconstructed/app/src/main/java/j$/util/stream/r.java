package j$.util.stream;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends g5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d);
                throw null;
            case 1:
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 2:
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            default:
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public void c(long j) {
        switch (this.b) {
            case 3:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }
}
