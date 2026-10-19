package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends d {
    public final AtomicReference h;
    public volatile boolean i;

    public b(a aVar, j$.util.e1 e1Var) {
        super(aVar, e1Var);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        j$.util.e1 e1VarTrySplit;
        j$.util.e1 e1Var = this.b;
        long jEstimateSize = e1Var.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        b bVar = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = bVar.i;
            if (!z2) {
                CountedCompleter<?> completer = bVar.getCompleter();
                while (true) {
                    b bVar2 = (b) ((d) completer);
                    if (z2 || bVar2 == null) {
                        break;
                    }
                    z2 = bVar2.i;
                    completer = bVar2.getCompleter();
                }
            }
            if (z2) {
                objH = bVar.h();
                break;
            }
            if (jEstimateSize <= jE || (e1VarTrySplit = e1Var.trySplit()) == null) {
                objH = bVar.a();
                break;
            }
            b bVar3 = (b) bVar.c(e1VarTrySplit);
            bVar.d = bVar3;
            b bVar4 = (b) bVar.c(e1Var);
            bVar.e = bVar4;
            bVar.setPendingCount(1);
            if (z) {
                e1Var = e1VarTrySplit;
                bVar = bVar3;
                bVar3 = bVar4;
            } else {
                bVar = bVar4;
            }
            z = !z;
            bVar3.fork();
            jEstimateSize = e1Var.estimateSize();
        }
        bVar.d(objH);
        bVar.tryComplete();
    }

    @Override // j$.util.stream.d
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        b bVar = this;
        for (b bVar2 = (b) ((d) getCompleter()); bVar2 != null; bVar2 = (b) ((d) bVar2.getCompleter())) {
            if (bVar2.d == bVar) {
                b bVar3 = (b) bVar2.e;
                if (!bVar3.i) {
                    bVar3.f();
                }
            }
            bVar = bVar2;
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public abstract Object h();

    public final Object i() {
        if (!b()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? h() : obj;
    }

    public b(b bVar, j$.util.e1 e1Var) {
        super(bVar, e1Var);
        this.h = bVar.h;
    }
}
