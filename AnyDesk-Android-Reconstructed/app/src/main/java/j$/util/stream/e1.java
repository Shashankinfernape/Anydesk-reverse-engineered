package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends i5 {
    public boolean b;
    public final j$.util.k0 c;
    public final /* synthetic */ f1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, n5 n5Var) {
        super(n5Var);
        this.d = f1Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.c = new j$.util.k0(n5Var2, 1);
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) throws Exception {
        LongStream longStream = (LongStream) ((j$.util.p) this.d.m).apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                j$.util.k0 k0Var = this.c;
                if (z) {
                    j$.util.y0 y0VarSpliterator = longStream.sequential().spliterator();
                    while (!this.a.e() && y0VarSpliterator.tryAdvance((LongConsumer) k0Var)) {
                    }
                } else {
                    longStream.sequential().forEach(k0Var);
                }
            } catch (Throwable th) {
                try {
                    longStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}
