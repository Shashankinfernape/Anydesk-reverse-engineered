package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends r1 implements k5 {
    @Override // j$.util.stream.r1, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Double d) {
        w3.d(this, d);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Double) obj);
    }
}
