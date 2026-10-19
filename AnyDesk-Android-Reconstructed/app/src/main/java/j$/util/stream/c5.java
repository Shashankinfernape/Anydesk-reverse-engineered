package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class c5 extends f5 {
    @Override // j$.util.stream.a
    public final boolean I() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.f5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.k) {
            super.forEach(consumer);
        } else {
            L().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.k) {
            super.forEachOrdered(consumer);
        } else {
            L().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !b7.ORDERED.d(this.f) ? this : new a5(this, b7.r);
    }
}
