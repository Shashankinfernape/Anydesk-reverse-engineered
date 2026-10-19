package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class m7 extends d7 implements j$.util.s0 {
    @Override // j$.util.stream.d7
    public final void d() {
        q6 q6Var = new q6();
        this.h = q6Var;
        Objects.requireNonNull(q6Var);
        this.e = this.b.O(new l7(q6Var, 1));
        this.f = new j$.util.p(12, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(j$.util.e1 e1Var) {
        return new m7(this.b, e1Var, this.a);
    }

    @Override // j$.util.b1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        l7 l7Var = new l7(doubleConsumer, 0);
        this.b.N(this.d, l7Var);
        this.i = true;
    }

    @Override // j$.util.b1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            q6 q6Var = (q6) this.h;
            long j = this.g;
            int iS = q6Var.s(j);
            doubleConsumer.accept((q6Var.c == 0 && iS == 0) ? ((double[]) q6Var.e)[(int) j] : ((double[][]) q6Var.f)[iS][(int) (j - q6Var.d[iS])]);
        }
        return zA;
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.s0 trySplit() {
        return (j$.util.s0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.b1 trySplit() {
        return (j$.util.s0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.e1
    public final j$.util.e1 trySplit() {
        return (j$.util.s0) super.trySplit();
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.i(this, consumer);
    }
}
