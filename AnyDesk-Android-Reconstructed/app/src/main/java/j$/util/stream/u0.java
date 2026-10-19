package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends h5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        int i2 = this.b;
        n5 n5Var = this.a;
        a aVar = this.c;
        switch (i2) {
            case 0:
                n5Var.accept(((IntFunction) ((q) aVar).m).apply(i));
                break;
            case 1:
                ((IntConsumer) ((v0) aVar).m).accept(i);
                n5Var.accept(i);
                break;
            case 2:
                n5Var.accept(((IntUnaryOperator) ((v0) aVar).m).applyAsInt(i));
                break;
            default:
                if (((IntPredicate) ((v0) aVar).m).test(i)) {
                    n5Var.accept(i);
                }
                break;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public void c(long j) {
        switch (this.b) {
            case 3:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }
}
