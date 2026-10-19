package j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p8 extends z0 implements v8 {
    public final /* synthetic */ int l;
    public final /* synthetic */ IntPredicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8(b1 b1Var, int i, IntPredicate intPredicate, int i2) {
        super(b1Var, i);
        this.l = i2;
        this.m = intPredicate;
    }

    @Override // j$.util.stream.a
    public final f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                return (f2) new y8(this, aVar, e1Var, intFunction).invoke();
            default:
                return (f2) new x8(this, aVar, e1Var, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 H(a aVar, j$.util.e1 e1Var) {
        switch (this.l) {
            case 0:
                return b7.ORDERED.d(aVar.f) ? G(aVar, e1Var, new g2(14)).spliterator() : new a9((j$.util.v0) aVar.P(e1Var), this.m, 1);
            default:
                return b7.ORDERED.d(aVar.f) ? G(aVar, e1Var, new g2(15)).spliterator() : new a9((j$.util.v0) aVar.P(e1Var), this.m, 0);
        }
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new o8(this, n5Var);
            default:
                return new q8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.v8
    public w8 g(x1 x1Var, boolean z) {
        return new q8(this, x1Var, z);
    }
}
