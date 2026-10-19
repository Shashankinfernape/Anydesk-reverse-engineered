package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a3 implements f2 {
    @Override // j$.util.stream.f2
    public f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final Object[] n(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    public final void g(Object obj) {
    }

    public final void f(int i, Object obj) {
    }
}
