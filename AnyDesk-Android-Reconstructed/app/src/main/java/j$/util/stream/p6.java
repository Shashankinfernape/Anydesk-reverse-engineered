package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p6 extends v6 implements j$.util.s0 {
    public final /* synthetic */ q6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(q6 q6Var, int i, int i2, int i3, int i4) {
        super(q6Var, i, i2, i3, i4);
        this.g = q6Var;
    }

    @Override // j$.util.stream.v6
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.v6
    public final j$.util.b1 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        j$.util.s1.a(((double[]) Objects.requireNonNull(dArr)).length, i, i3);
        return new j$.util.k1(dArr, i, i3, 1040);
    }

    @Override // j$.util.stream.v6
    public final j$.util.b1 c(int i, int i2, int i3, int i4) {
        return new p6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.i(this, consumer);
    }
}
