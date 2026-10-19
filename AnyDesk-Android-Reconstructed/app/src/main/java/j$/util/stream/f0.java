package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends k0 implements k5 {
    public static final e0 c;
    public static final e0 d;

    static {
        c7 c7Var = c7.DOUBLE_VALUE;
        j$.util.function.c cVar = new j$.util.function.c(28);
        j$.util.function.c cVar2 = new j$.util.function.c(29);
        j$.util.a0 a0Var = j$.util.a0.c;
        c = new e0(true, c7Var, a0Var, cVar, cVar2);
        d = new e0(false, c7Var, a0Var, new j$.util.function.c(28), new j$.util.function.c(29));
    }

    @Override // j$.util.stream.k0, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        o(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.a0(((Double) this.b).doubleValue());
        }
        return null;
    }
}
