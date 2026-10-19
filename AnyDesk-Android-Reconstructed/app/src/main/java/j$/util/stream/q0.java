package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends r0 {
    public final Consumer b;

    public q0(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // j$.util.stream.j8
    public final Object a(a aVar, j$.util.e1 e1Var) {
        aVar.N(e1Var, this);
        return null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
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
}
