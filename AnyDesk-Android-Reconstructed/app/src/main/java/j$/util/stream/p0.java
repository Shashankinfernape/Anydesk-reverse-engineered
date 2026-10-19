package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends r0 implements m5 {
    public final LongConsumer b;

    public p0(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.j8
    public final Object a(a aVar, j$.util.e1 e1Var) {
        aVar.N(e1Var, this);
        return null;
    }

    @Override // j$.util.stream.r0, j$.util.stream.n5
    public final void accept(long j) {
        this.b.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.j8
    public final /* bridge */ /* synthetic */ Object b(a aVar, j$.util.e1 e1Var) {
        g(aVar, e1Var);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l) {
        w3.i(this, l);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }
}
