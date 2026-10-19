package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class r6 extends v6 implements j$.util.v0 {
    public final /* synthetic */ s6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(s6 s6Var, int i, int i2, int i3, int i4) {
        super(s6Var, i, i2, i3, i4);
        this.g = s6Var;
    }

    @Override // j$.util.stream.v6
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.v6
    public final j$.util.b1 b(Object obj, int i, int i2) {
        int[] iArr = (int[]) obj;
        int i3 = i2 + i;
        j$.util.s1.a(((int[]) Objects.requireNonNull(iArr)).length, i, i3);
        return new j$.util.p1(iArr, i, i3, 1040);
    }

    @Override // j$.util.stream.v6
    public final j$.util.b1 c(int i, int i2, int i3, int i4) {
        return new r6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.j(this, consumer);
    }
}
