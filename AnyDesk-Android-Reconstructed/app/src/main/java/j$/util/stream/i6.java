package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class i6 extends d5 {
    public final boolean l;
    public final Comparator m;

    public i6(f5 f5Var, Comparator comparator) {
        super(f5Var, b7.q | b7.p);
        this.l = false;
        this.m = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        if (b7.SORTED.d(aVar.f) && this.l) {
            return aVar.y(e1Var, false, intFunction);
        }
        Object[] objArrN = aVar.y(e1Var, true, intFunction).n(intFunction);
        Arrays.sort(objArrN, this.m);
        return new k2(objArrN);
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (b7.SORTED.d(i) && this.l) {
            return n5Var;
        }
        boolean zD = b7.SIZED.d(i);
        Comparator comparator = this.m;
        return zD ? new n6(n5Var, comparator) : new j6(n5Var, comparator);
    }

    public i6(f5 f5Var) {
        super(f5Var, b7.q | b7.o);
        this.l = true;
        this.m = j$.util.g.INSTANCE;
    }
}
