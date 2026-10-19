package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends g5 {
    public boolean b;
    public final j$.util.c0 c;
    public final /* synthetic */ w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, n5 n5Var) {
        super(n5Var);
        this.d = wVar;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.c = new j$.util.c0(n5Var2, 1);
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) throws Exception {
        d0 d0Var = (d0) ((j$.util.p) this.d.m).apply(d);
        if (d0Var != null) {
            try {
                boolean z = this.b;
                j$.util.c0 c0Var = this.c;
                if (z) {
                    j$.util.s0 s0VarSpliterator = d0Var.sequential().spliterator();
                    while (!this.a.e() && s0VarSpliterator.tryAdvance((DoubleConsumer) c0Var)) {
                    }
                } else {
                    d0Var.sequential().forEach(c0Var);
                }
            } catch (Throwable th) {
                try {
                    d0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (d0Var != null) {
            d0Var.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}
