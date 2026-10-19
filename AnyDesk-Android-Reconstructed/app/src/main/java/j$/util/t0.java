package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t0 implements v0 {
    public final /* synthetic */ Spliterator.OfInt a;

    public /* synthetic */ t0(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ v0 a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof u0 ? ((u0) ofInt).a : new t0(ofInt);
    }

    @Override // j$.util.e1
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof t0) {
            obj = ((t0) obj).a;
        }
        return ofInt.equals(obj);
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

    @Override // j$.util.v0, j$.util.b1, j$.util.e1
    public final /* synthetic */ v0 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.v0
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.v0
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.a.tryAdvance(intConsumer);
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
