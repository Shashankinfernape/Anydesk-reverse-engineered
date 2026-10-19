package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends c implements v0 {
    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.b(this, consumer);
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
        return c.j(this, consumer);
    }

    @Override // j$.util.c, j$.util.b1, j$.util.e1
    public final /* bridge */ /* synthetic */ v0 trySplit() {
        return null;
    }

    @Override // j$.util.c, j$.util.b1, j$.util.e1
    public final /* bridge */ /* synthetic */ b1 trySplit() {
        return null;
    }

    @Override // j$.util.v0
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.v0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }
}
