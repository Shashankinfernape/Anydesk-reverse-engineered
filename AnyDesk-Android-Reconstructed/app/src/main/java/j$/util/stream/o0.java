package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends r0 implements l5 {
    public final IntConsumer b;

    public o0(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.j8
    public final Object a(a aVar, j$.util.e1 e1Var) {
        aVar.N(e1Var, this);
        return null;
    }

    @Override // j$.util.stream.r0, j$.util.stream.n5
    public final void accept(int i) {
        this.b.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.j8
    public final /* bridge */ /* synthetic */ Object b(a aVar, j$.util.e1 e1Var) {
        g(aVar, e1Var);
        return null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }
}
