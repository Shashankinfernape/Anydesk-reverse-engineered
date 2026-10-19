package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0 implements y0 {
    public final /* synthetic */ Spliterator.OfLong a;

    public /* synthetic */ w0(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ y0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof x0 ? ((x0) ofLong).a : new w0(ofLong);
    }

    @Override // j$.util.e1
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.a;
        if (obj instanceof w0) {
            obj = ((w0) obj).a;
        }
        return ofLong.equals(obj);
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

    @Override // j$.util.y0, j$.util.b1, j$.util.e1
    public final /* synthetic */ y0 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.y0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.y0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.a.tryAdvance(longConsumer);
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
