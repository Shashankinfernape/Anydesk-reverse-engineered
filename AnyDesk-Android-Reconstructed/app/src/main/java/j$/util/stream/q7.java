package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q7 extends d7 implements j$.util.y0 {
    @Override // j$.util.stream.d7
    public final void d() {
        u6 u6Var = new u6();
        this.h = u6Var;
        Objects.requireNonNull(u6Var);
        this.e = this.b.O(new p7(u6Var, 1));
        this.f = new j$.util.p(14, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(j$.util.e1 e1Var) {
        return new q7(this.b, e1Var, this.a);
    }

    @Override // j$.util.b1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        p7 p7Var = new p7(longConsumer, 0);
        this.b.N(this.d, p7Var);
        this.i = true;
    }

    @Override // j$.util.b1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            u6 u6Var = (u6) this.h;
            long j = this.g;
            int iS = u6Var.s(j);
            longConsumer.accept((u6Var.c == 0 && iS == 0) ? ((long[]) u6Var.e)[(int) j] : ((long[][]) u6Var.f)[iS][(int) (j - u6Var.d[iS])]);
        }
        return zA;
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.y0 trySplit() {
        return (j$.util.y0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.b1 trySplit() {
        return (j$.util.y0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.e1 trySplit() {
        return (j$.util.y0) super.trySplit();
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.k(this, consumer);
    }
}
