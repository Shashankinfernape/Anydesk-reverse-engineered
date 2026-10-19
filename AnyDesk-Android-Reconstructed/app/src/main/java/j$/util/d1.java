package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d1 implements Spliterator {
    public final /* synthetic */ e1 a;

    public /* synthetic */ d1(e1 e1Var) {
        this.a = e1Var;
    }

    public static /* synthetic */ Spliterator a(e1 e1Var) {
        if (e1Var == null) {
            return null;
        }
        if (e1Var instanceof c1) {
            return ((c1) e1Var).a;
        }
        return e1Var instanceof b1 ? a1.a((b1) e1Var) : new d1(e1Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        e1 e1Var = this.a;
        if (obj instanceof d1) {
            obj = ((d1) obj).a;
        }
        return e1Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return a(this.a.trySplit());
    }
}
