package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends a0 {
    @Override // j$.util.stream.a
    public final boolean I() {
        return true;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final d0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final d0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ j$.util.e1 spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !b7.ORDERED.d(this.f) ? this : new s(this, b7.r, 1);
    }
}
