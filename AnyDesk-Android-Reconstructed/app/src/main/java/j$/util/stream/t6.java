package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class t6 extends v6 implements j$.util.y0 {
    public final /* synthetic */ u6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(u6 u6Var, int i, int i2, int i3, int i4) {
        super(u6Var, i, i2, i3, i4);
        this.g = u6Var;
    }

    @Override // j$.util.stream.v6
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.v6
    public final j$.util.b1 b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        j$.util.s1.a(((long[]) Objects.requireNonNull(jArr)).length, i, i3);
        return new j$.util.r1(jArr, i, i3, 1040);
    }

    @Override // j$.util.stream.v6
    public final j$.util.b1 c(int i, int i2, int i3, int i4) {
        return new t6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.k(this, consumer);
    }
}
