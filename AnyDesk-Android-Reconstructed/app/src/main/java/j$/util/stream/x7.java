package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class x7 extends a8 implements j$.util.s0, DoubleConsumer {
    public double f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.d8
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        return new x7((j$.util.s0) e1Var, this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.stream.a8
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.a8
    public final h7 j(int i) {
        return new e7(i);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.i(this, consumer);
    }
}
