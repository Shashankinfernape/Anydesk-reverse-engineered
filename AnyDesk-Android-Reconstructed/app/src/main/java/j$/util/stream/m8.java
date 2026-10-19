package j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class m8 extends d5 implements v8 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8(f5 f5Var, int i, Predicate predicate, int i2) {
        super(f5Var, i);
        this.l = i2;
        this.m = predicate;
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
        int i = 0;
        switch (this.l) {
            case 0:
                return b7.ORDERED.d(aVar.f) ? G(aVar, e1Var, new g2(i)).spliterator() : new c9(aVar.P(e1Var), this.m, 1);
            default:
                return b7.ORDERED.d(aVar.f) ? G(aVar, e1Var, new g2(i)).spliterator() : new c9(aVar.P(e1Var), this.m, 0);
        }
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new l(this, n5Var);
            default:
                return new n8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.v8
    public w8 g(x1 x1Var, boolean z) {
        return new n8(this, x1Var, z);
    }
}
