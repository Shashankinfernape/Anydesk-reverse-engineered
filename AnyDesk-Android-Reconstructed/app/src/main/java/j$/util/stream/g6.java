package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class g6 extends z0 {
    @Override // j$.util.stream.a
    public final f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        if (b7.SORTED.d(aVar.f)) {
            return aVar.y(e1Var, false, intFunction);
        }
        int[] iArr = (int[]) ((b2) aVar.y(e1Var, true, intFunction)).b();
        Arrays.sort(iArr);
        return new c3(iArr);
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (b7.SORTED.d(i)) {
            return n5Var;
        }
        return b7.SIZED.d(i) ? new l6(n5Var) : new d6(n5Var);
    }
}
