package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class y7 extends a8 implements j$.util.v0, IntConsumer {
    public int f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.d8
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        return new y7((j$.util.v0) e1Var, this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.stream.a8
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.a8
    public final h7 j(int i) {
        return new f7(i);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.j(this, consumer);
    }
}
