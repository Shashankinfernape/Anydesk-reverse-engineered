package j$.util.stream;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements j8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public e0(boolean z, c7 c7Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : b7.r) | b7.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.j8
    public final Object a(a aVar, j$.util.e1 e1Var) {
        k8 k8Var = (k8) this.d.get();
        aVar.N(e1Var, k8Var);
        Object obj = k8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.j8
    public final Object b(a aVar, j$.util.e1 e1Var) {
        return new l0(this, b7.ORDERED.d(aVar.f), aVar, e1Var).invoke();
    }

    @Override // j$.util.stream.j8
    public final int f() {
        return this.a;
    }
}
