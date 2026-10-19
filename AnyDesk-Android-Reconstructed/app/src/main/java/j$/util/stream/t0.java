package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends CountedCompleter {
    public j$.util.e1 a;
    public final n5 b;
    public final a c;
    public long d;

    public t0(t0 t0Var, j$.util.e1 e1Var) {
        super(t0Var);
        this.a = e1Var;
        this.b = t0Var.b;
        this.d = t0Var.d;
        this.c = t0Var.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.e1 e1VarTrySplit;
        j$.util.e1 e1Var = this.a;
        long jEstimateSize = e1Var.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.d = jE;
        }
        boolean zD = b7.SHORT_CIRCUIT.d(this.c.f);
        n5 n5Var = this.b;
        boolean z = false;
        t0 t0Var = this;
        while (true) {
            if (zD && n5Var.e()) {
                break;
            }
            if (jEstimateSize <= jE || (e1VarTrySplit = e1Var.trySplit()) == null) {
                t0Var.c.w(e1Var, n5Var);
                break;
            }
            t0 t0Var2 = new t0(t0Var, e1VarTrySplit);
            t0Var.addToPendingCount(1);
            if (z) {
                e1Var = e1VarTrySplit;
            } else {
                t0 t0Var3 = t0Var;
                t0Var = t0Var2;
                t0Var2 = t0Var3;
            }
            z = !z;
            t0Var.fork();
            t0Var = t0Var2;
            jEstimateSize = e1Var.estimateSize();
        }
        t0Var.a = null;
        t0Var.propagateCompletion();
    }

    public t0(a aVar, j$.util.e1 e1Var, n5 n5Var) {
        super(null);
        this.b = n5Var;
        this.c = aVar;
        this.a = e1Var;
        this.d = 0L;
    }
}
