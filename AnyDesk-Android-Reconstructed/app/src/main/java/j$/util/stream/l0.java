package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends b {
    public final e0 j;
    public final boolean k;

    public l0(l0 l0Var, j$.util.e1 e1Var) {
        super(l0Var, e1Var);
        this.k = l0Var.k;
        this.j = l0Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        k8 k8Var = (k8) this.j.d.get();
        aVar.N(this.b, k8Var);
        Object obj = k8Var.get();
        if (this.k) {
            if (obj != null) {
                d dVar = this;
                while (dVar != null) {
                    d dVar2 = (d) dVar.getCompleter();
                    if (dVar2 != null && dVar2.d != dVar) {
                        g();
                        return obj;
                    }
                    dVar = dVar2;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d c(j$.util.e1 e1Var) {
        return new l0(this, e1Var);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            l0 l0Var = (l0) this.d;
            l0 l0Var2 = null;
            while (l0Var != l0Var2) {
                Object objI = l0Var.i();
                if (objI != null && this.j.c.test(objI)) {
                    d(objI);
                    d dVar = this;
                    while (dVar != null) {
                        d dVar2 = (d) dVar.getCompleter();
                        if (dVar2 != null && dVar2.d != dVar) {
                            g();
                            break;
                        }
                        dVar = dVar2;
                    }
                    AtomicReference atomicReference = this.h;
                    while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                    }
                    break;
                }
                l0Var2 = l0Var;
                l0Var = (l0) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }

    public l0(e0 e0Var, boolean z, a aVar, j$.util.e1 e1Var) {
        super(aVar, e1Var);
        this.k = z;
        this.j = e0Var;
    }
}
