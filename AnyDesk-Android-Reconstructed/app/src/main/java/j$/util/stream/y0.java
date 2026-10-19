package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends b1 {
    @Override // j$.util.stream.a
    public final boolean I() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b1, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEach(intConsumer);
        } else {
            b1.Q(L()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.b1, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEachOrdered(intConsumer);
        } else {
            b1.Q(L()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ j$.util.e1 spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !b7.ORDERED.d(this.f) ? this : new t(this, b7.r, 1);
    }
}
