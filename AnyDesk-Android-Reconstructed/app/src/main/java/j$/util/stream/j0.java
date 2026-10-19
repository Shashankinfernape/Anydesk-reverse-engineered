package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends k0 {
    public static final e0 c;
    public static final e0 d;

    static {
        c7 c7Var = c7.REFERENCE;
        c = new e0(true, c7Var, Optional.empty(), new g0(4), new g0(5));
        d = new e0(false, c7Var, Optional.empty(), new g0(4), new g0(5));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
