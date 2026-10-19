package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends k0 implements m5 {
    public static final e0 c;
    public static final e0 d;

    static {
        c7 c7Var = c7.LONG_VALUE;
        g0 g0Var = new g0(2);
        g0 g0Var2 = new g0(3);
        j$.util.b0 b0Var = j$.util.b0.c;
        c = new e0(true, c7Var, b0Var, g0Var, g0Var2);
        d = new e0(false, c7Var, b0Var, new g0(2), new g0(3));
    }

    @Override // j$.util.stream.k0, j$.util.stream.n5
    public final void accept(long j) {
        o(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.b0(((Long) this.b).longValue());
        }
        return null;
    }
}
