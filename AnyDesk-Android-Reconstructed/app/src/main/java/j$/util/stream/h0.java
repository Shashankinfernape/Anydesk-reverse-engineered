package j$.util.stream;

import j$.util.OptionalInt;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends k0 implements l5 {
    public static final e0 c;
    public static final e0 d;

    static {
        c7 c7Var = c7.INT_VALUE;
        c = new e0(true, c7Var, OptionalInt.empty(), new g0(0), new g0(1));
        d = new e0(false, c7Var, OptionalInt.empty(), new g0(0), new g0(1));
    }

    @Override // j$.util.stream.k0, j$.util.stream.n5
    public final void accept(int i) {
        o(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
