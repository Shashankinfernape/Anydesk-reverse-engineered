package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final a a;
    public j$.util.e1 b;
    public long c;
    public d d;
    public d e;
    public Object f;

    public d(d dVar, j$.util.e1 e1Var) {
        super(dVar);
        this.b = e1Var;
        this.a = dVar.a;
        this.c = dVar.c;
    }

    public static long e(long j) {
        long j2 = j / ((long) g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public final boolean b() {
        return ((d) getCompleter()) == null;
    }

    public abstract d c(j$.util.e1 e1Var);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.e1 e1VarTrySplit;
        j$.util.e1 e1Var = this.b;
        long jEstimateSize = e1Var.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        d dVar = this;
        while (jEstimateSize > jE && (e1VarTrySplit = e1Var.trySplit()) != null) {
            d dVarC = dVar.c(e1VarTrySplit);
            dVar.d = dVarC;
            d dVarC2 = dVar.c(e1Var);
            dVar.e = dVarC2;
            dVar.setPendingCount(1);
            if (z) {
                e1Var = e1VarTrySplit;
                dVar = dVarC;
                dVarC = dVarC2;
            } else {
                dVar = dVarC2;
            }
            z = !z;
            dVarC.fork();
            jEstimateSize = e1Var.estimateSize();
        }
        dVar.d(dVar.a());
        dVar.tryComplete();
    }

    public void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public d(a aVar, j$.util.e1 e1Var) {
        super(null);
        this.a = aVar;
        this.b = e1Var;
        this.c = 0L;
    }
}
