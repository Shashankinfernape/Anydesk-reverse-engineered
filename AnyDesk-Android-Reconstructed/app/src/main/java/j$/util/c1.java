package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements e1 {
    public final /* synthetic */ Spliterator a;

    public /* synthetic */ c1(Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ e1 a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof d1) {
            return ((d1) spliterator).a;
        }
        return spliterator instanceof Spliterator.OfPrimitive ? z0.a((Spliterator.OfPrimitive) spliterator) : new c1(spliterator);
    }

    @Override // j$.util.e1
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.a;
        if (obj instanceof c1) {
            obj = ((c1) obj).a;
        }
        return spliterator.equals(obj);
    }

    @Override // j$.util.e1
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
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

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ e1 trySplit() {
        return a(this.a.trySplit());
    }
}
