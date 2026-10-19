package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class s5 extends i5 {
    public long b;
    public long c;
    public final /* synthetic */ t5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t5 t5Var, n5 n5Var) {
        super(n5Var);
        this.d = t5Var;
        this.b = t5Var.l;
        long j = t5Var.m;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(w3.x(j, this.d.l, this.c));
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
