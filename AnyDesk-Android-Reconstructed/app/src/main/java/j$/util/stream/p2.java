package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends r2 implements b2 {
    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.r(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.u(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        w3.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.e2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.f2
    public final j$.util.b1 spliterator() {
        return new g3(this);
    }

    @Override // j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        return new g3(this);
    }
}
