package j$.util;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new o(this.b);
    }

    @Override // j$.util.o, java.util.List
    public final List subList(int i, int i2) {
        return new u(this.b.subList(i, i2));
    }
}
