package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class u4 extends x4 implements l5 {
    @Override // j$.util.stream.x4, j$.util.stream.n5
    public final void accept(int i) {
        this.b++;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.s4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        this.b += ((x4) r4Var).b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }
}
