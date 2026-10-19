package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class s7 extends u7 implements j$.util.v0 {
    @Override // j$.util.stream.w7
    public final j$.util.e1 a(j$.util.e1 e1Var, long j, long j2, long j3, long j4) {
        return new s7((j$.util.v0) e1Var, j, j2, j3, j4);
    }

    @Override // j$.util.stream.u7
    public final Object b() {
        return new a2(1);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.j(this, consumer);
    }
}
