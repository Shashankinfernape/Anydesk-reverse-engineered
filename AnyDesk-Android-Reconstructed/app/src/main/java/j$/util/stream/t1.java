package j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends b {
    public final j$.util.concurrent.t j;

    public t1(t1 t1Var, j$.util.e1 e1Var) {
        super(t1Var, e1Var);
        this.j = t1Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        r1 r1Var = (r1) ((Supplier) this.j.c).get();
        aVar.N(this.b, r1Var);
        boolean z = r1Var.b;
        if (z == ((s1) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d c(j$.util.e1 e1Var) {
        return new t1(this, e1Var);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((s1) this.j.b).b);
    }

    public t1(j$.util.concurrent.t tVar, a aVar, j$.util.e1 e1Var) {
        super(aVar, e1Var);
        this.j = tVar;
    }
}
