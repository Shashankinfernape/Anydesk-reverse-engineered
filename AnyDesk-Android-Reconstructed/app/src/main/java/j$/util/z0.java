package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0 implements b1 {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ z0(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ b1 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof a1) {
            return ((a1) ofPrimitive).a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            return q0.a((Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            return t0.a((Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof Spliterator.OfLong ? w0.a((Spliterator.OfLong) ofPrimitive) : new z0(ofPrimitive);
    }

    @Override // j$.util.e1
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof z0) {
            obj = ((z0) obj).a;
        }
        return ofPrimitive.equals(obj);
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

    @Override // j$.util.b1, j$.util.e1
    public final /* synthetic */ b1 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ e1 trySplit() {
        return c1.a(this.a.trySplit());
    }
}
