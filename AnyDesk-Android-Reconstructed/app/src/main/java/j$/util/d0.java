package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements f0, y {
    public final /* synthetic */ PrimitiveIterator.OfDouble a;

    public /* synthetic */ d0(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.o0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.f0, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // j$.util.f0
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }

    @Override // j$.util.f0, java.util.Iterator, j$.util.y
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }
}
