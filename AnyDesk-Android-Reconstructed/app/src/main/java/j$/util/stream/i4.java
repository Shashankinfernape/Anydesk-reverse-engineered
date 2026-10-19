package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class i4 extends w3 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    public i4(c7 c7Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.w3
    public final r4 a0() {
        return new j4(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.w3, j$.util.stream.j8
    public final int f() {
        if (this.k.characteristics().contains(h.UNORDERED)) {
            return b7.r;
        }
        return 0;
    }
}
