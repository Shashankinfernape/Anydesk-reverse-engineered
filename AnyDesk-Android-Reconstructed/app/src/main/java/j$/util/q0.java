package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q0 implements s0 {
    public final /* synthetic */ Spliterator.OfDouble a;

    public /* synthetic */ q0(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ s0 a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof r0 ? ((r0) ofDouble).a : new q0(ofDouble);
    }

    @Override // j$.util.e1
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.a;
        if (obj instanceof q0) {
            obj = ((q0) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.e1
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.b1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // j$.util.e1
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.b1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // j$.util.s0, j$.util.b1, j$.util.e1
    public final /* synthetic */ s0 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.s0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.s0
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.b1, j$.util.e1
    public final /* synthetic */ b1 trySplit() {
        return z0.a(this.a.trySplit());
    }

    @Override // j$.util.e1
    public final /* synthetic */ e1 trySplit() {
        return c1.a(this.a.trySplit());
    }
}
