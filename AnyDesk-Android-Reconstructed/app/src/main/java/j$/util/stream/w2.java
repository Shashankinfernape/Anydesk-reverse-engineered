package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class w2 extends a3 implements z1 {
    @Override // j$.util.stream.a3, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ Object b() {
        return w3.g;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.q(this, consumer);
    }

    @Override // j$.util.stream.a3, j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.t(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        w3.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ j$.util.b1 spliterator() {
        return j$.util.s1.d;
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ j$.util.e1 spliterator() {
        return j$.util.s1.d;
    }

    @Override // j$.util.stream.a3, j$.util.stream.f2
    public final /* bridge */ /* synthetic */ f2 a(int i) {
        a(i);
        throw null;
    }
}
