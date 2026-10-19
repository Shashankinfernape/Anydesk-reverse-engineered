package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d5 extends f5 {
    @Override // j$.util.stream.a
    public final boolean I() {
        return true;
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !b7.ORDERED.d(this.f) ? this : new a5(this, b7.r);
    }
}
