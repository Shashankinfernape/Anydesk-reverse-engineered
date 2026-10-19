package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o5 extends j5 {
    public long b;
    public long c;
    public final /* synthetic */ p5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, n5 n5Var) {
        super(n5Var);
        this.d = p5Var;
        this.b = p5Var.l;
        long j = p5Var.m;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.o(obj);
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(w3.x(j, this.d.l, this.c));
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
