package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends c implements y0 {
    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.c(this, consumer);
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return c.e(this, i);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return c.k(this, consumer);
    }

    @Override // j$.util.c, j$.util.b1, j$.util.e1
    public final /* bridge */ /* synthetic */ y0 trySplit() {
        return null;
    }

    @Override // j$.util.c, j$.util.b1, j$.util.e1
    public final /* bridge */ /* synthetic */ b1 trySplit() {
        return null;
    }

    @Override // j$.util.y0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
    }

    @Override // j$.util.y0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return false;
    }
}
