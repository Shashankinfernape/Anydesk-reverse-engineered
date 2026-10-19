package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends j1 {
    @Override // j$.util.stream.a
    public final boolean I() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.j1, j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            j1.Q(L()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.j1, j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            j1.Q(L()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final LongStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final LongStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ j$.util.e1 spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !b7.ORDERED.d(this.f) ? this : new u(this, b7.r, 4);
    }
}
