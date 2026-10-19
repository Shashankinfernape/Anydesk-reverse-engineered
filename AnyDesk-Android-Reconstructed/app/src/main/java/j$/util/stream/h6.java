package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class h6 extends h1 implements v8 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(a aVar, int i, int i2) {
        super(aVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.a
    public final f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                if (b7.SORTED.d(aVar.f)) {
                    return aVar.y(e1Var, false, intFunction);
                }
                long[] jArr = (long[]) ((d2) aVar.y(e1Var, true, intFunction)).b();
                Arrays.sort(jArr);
                return new l3(jArr);
            case 1:
                return (f2) new y8(this, aVar, e1Var, intFunction).invoke();
            default:
                return (f2) new x8(this, aVar, e1Var, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public j$.util.e1 H(a aVar, j$.util.e1 e1Var) {
        switch (this.l) {
            case 1:
                return b7.ORDERED.d(aVar.f) ? G(aVar, e1Var, new g2(16)).spliterator() : new b9((j$.util.y0) aVar.P(e1Var), 1);
            case 2:
                return b7.ORDERED.d(aVar.f) ? G(aVar, e1Var, new g2(17)).spliterator() : new b9((j$.util.y0) aVar.P(e1Var), 0);
            default:
                return super.H(aVar, e1Var);
        }
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                Objects.requireNonNull(n5Var);
                if (b7.SORTED.d(i)) {
                    return n5Var;
                }
                return b7.SIZED.d(i) ? new m6(n5Var) : new e6(n5Var);
            case 1:
                return new r8(this, n5Var);
            default:
                return new s8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.v8
    public w8 g(x1 x1Var, boolean z) {
        return new s8(this, x1Var, z);
    }
}
