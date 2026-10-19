package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o8 extends h5 {
    public boolean b;
    public final /* synthetic */ p8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(p8 p8Var, n5 n5Var) {
        super(n5Var);
        this.c = p8Var;
        this.b = true;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        if (this.b) {
            boolean zTest = this.c.m.test(i);
            this.b = zTest;
            if (zTest) {
                this.a.accept(i);
            }
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean e() {
        return !this.b || this.a.e();
    }
}
