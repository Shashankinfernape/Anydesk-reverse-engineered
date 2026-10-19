package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b6 extends j5 {
    public final Comparator b;
    public boolean c;

    public b6(n5 n5Var, Comparator comparator) {
        super(n5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean e() {
        this.c = true;
        return false;
    }
}
