package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends h5 {
    public boolean b;
    public final j$.util.g0 c;
    public final /* synthetic */ v0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(v0 v0Var, n5 n5Var) {
        super(n5Var);
        this.d = v0Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.c = new j$.util.g0(n5Var2, 1);
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((m0) this.d.m).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.g0 g0Var = this.c;
                if (z) {
                    j$.util.v0 v0VarSpliterator = intStream.sequential().spliterator();
                    while (!this.a.e() && v0VarSpliterator.tryAdvance((IntConsumer) g0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(g0Var);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}
