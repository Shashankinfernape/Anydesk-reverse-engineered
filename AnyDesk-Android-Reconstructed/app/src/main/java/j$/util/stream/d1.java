package j$.util.stream;

import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends i5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(n5 n5Var) {
        super(n5Var);
        this.b = 0;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(j);
                return;
            case 1:
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            default:
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public void c(long j) {
        switch (this.b) {
            case 4:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
    }
}
