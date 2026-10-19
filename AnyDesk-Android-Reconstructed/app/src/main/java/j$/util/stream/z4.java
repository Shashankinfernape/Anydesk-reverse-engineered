package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class z4 extends j5 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(w wVar, n5 n5Var) {
        super(n5Var);
        this.e = wVar;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.d = new j$.util.c0(n5Var2, 1);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) throws Exception {
        int i = this.b;
        n5 n5Var = this.a;
        a aVar = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                j$.util.k0 k0Var = (j$.util.k0) obj2;
                LongStream longStream = (LongStream) ((j$.util.p) ((f1) aVar).m).apply(obj);
                if (longStream != null) {
                    try {
                        if (this.c) {
                            j$.util.y0 y0VarSpliterator = longStream.sequential().spliterator();
                            while (!n5Var.e() && y0VarSpliterator.tryAdvance((LongConsumer) k0Var)) {
                            }
                        } else {
                            longStream.sequential().forEach(k0Var);
                        }
                    } catch (Throwable th) {
                        try {
                            longStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (longStream != null) {
                    longStream.close();
                    return;
                }
                return;
            case 1:
                j$.util.g0 g0Var = (j$.util.g0) obj2;
                IntStream intStream = (IntStream) ((j$.util.p) ((v0) aVar).m).apply(obj);
                if (intStream != null) {
                    try {
                        if (this.c) {
                            j$.util.v0 v0VarSpliterator = intStream.sequential().spliterator();
                            while (!n5Var.e() && v0VarSpliterator.tryAdvance((IntConsumer) g0Var)) {
                            }
                        } else {
                            intStream.sequential().forEach(g0Var);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.c0 c0Var = (j$.util.c0) obj2;
                d0 d0Var = (d0) ((j$.util.p) ((w) aVar).m).apply(obj);
                if (d0Var != null) {
                    try {
                        if (this.c) {
                            j$.util.s0 s0VarSpliterator = d0Var.sequential().spliterator();
                            while (!n5Var.e() && s0VarSpliterator.tryAdvance((DoubleConsumer) c0Var)) {
                            }
                        } else {
                            d0Var.sequential().forEach(c0Var);
                        }
                    } catch (Throwable th5) {
                        try {
                            d0Var.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (d0Var != null) {
                    d0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean e() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(v0 v0Var, n5 n5Var) {
        super(n5Var);
        this.e = v0Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.d = new j$.util.g0(n5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(f1 f1Var, n5 n5Var) {
        super(n5Var);
        this.e = f1Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.d = new j$.util.k0(n5Var2, 1);
    }
}
