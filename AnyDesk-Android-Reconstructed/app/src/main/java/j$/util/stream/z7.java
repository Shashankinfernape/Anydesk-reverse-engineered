package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class z7 extends a8 implements j$.util.y0, LongConsumer {
    public long f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.d8
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        return new z7((j$.util.y0) e1Var, this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.stream.a8
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.a8
    public final h7 j(int i) {
        return new g7(i);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.k(this, consumer);
    }
}
