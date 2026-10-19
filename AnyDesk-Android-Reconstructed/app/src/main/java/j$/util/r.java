package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements e1 {
    public final e1 a;

    public r(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.a.forEachRemaining(new p(0, consumer));
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.e1
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.e1
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.a.tryAdvance(new p(0, consumer));
    }

    @Override // j$.util.e1
    public final e1 trySplit() {
        e1 e1VarTrySplit = this.a.trySplit();
        if (e1VarTrySplit == null) {
            return null;
        }
        return new r(e1VarTrySplit);
    }
}
