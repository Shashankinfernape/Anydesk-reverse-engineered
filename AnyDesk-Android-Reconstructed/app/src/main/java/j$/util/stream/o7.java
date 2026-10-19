package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o7 extends d7 implements j$.util.v0 {
    @Override // j$.util.stream.d7
    public final void d() {
        s6 s6Var = new s6();
        this.h = s6Var;
        Objects.requireNonNull(s6Var);
        this.e = this.b.O(new n7(s6Var, 1));
        this.f = new j$.util.p(13, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(j$.util.e1 e1Var) {
        return new o7(this.b, e1Var, this.a);
    }

    @Override // j$.util.b1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        n7 n7Var = new n7(intConsumer, 0);
        this.b.N(this.d, n7Var);
        this.i = true;
    }

    @Override // j$.util.b1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            s6 s6Var = (s6) this.h;
            long j = this.g;
            int iS = s6Var.s(j);
            intConsumer.accept((s6Var.c == 0 && iS == 0) ? ((int[]) s6Var.e)[(int) j] : ((int[][]) s6Var.f)[iS][(int) (j - s6Var.d[iS])]);
        }
        return zA;
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.v0 trySplit() {
        return (j$.util.v0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.b1 trySplit() {
        return (j$.util.v0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.e1 trySplit() {
        return (j$.util.v0) super.trySplit();
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.j(this, consumer);
    }
}
