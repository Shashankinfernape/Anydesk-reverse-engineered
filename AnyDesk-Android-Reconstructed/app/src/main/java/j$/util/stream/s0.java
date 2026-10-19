package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends CountedCompleter {
    public final a a;
    public j$.util.e1 b;
    public final long c;
    public final ConcurrentHashMap d;
    public final r0 e;
    public final s0 f;
    public f2 g;

    public s0(a aVar, j$.util.e1 e1Var, r0 r0Var) {
        super(null);
        this.a = aVar;
        this.b = e1Var;
        this.c = d.e(e1Var.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = r0Var;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.e1 e1VarTrySplit;
        j$.util.e1 e1Var = this.b;
        long j = this.c;
        boolean z = false;
        s0 s0Var = this;
        while (e1Var.estimateSize() > j && (e1VarTrySplit = e1Var.trySplit()) != null) {
            s0 s0Var2 = new s0(s0Var, e1VarTrySplit, s0Var.f);
            s0 s0Var3 = new s0(s0Var, e1Var, s0Var2);
            s0Var.addToPendingCount(1);
            s0Var3.addToPendingCount(1);
            s0Var.d.put(s0Var2, s0Var3);
            if (s0Var.f != null) {
                s0Var2.addToPendingCount(1);
                if (s0Var.d.replace(s0Var.f, s0Var, s0Var2)) {
                    s0Var.addToPendingCount(-1);
                } else {
                    s0Var2.addToPendingCount(-1);
                }
            }
            if (z) {
                e1Var = e1VarTrySplit;
                s0Var = s0Var2;
                s0Var2 = s0Var3;
            } else {
                s0Var = s0Var3;
            }
            z = !z;
            s0Var2.fork();
        }
        if (s0Var.getPendingCount() > 0) {
            g0 g0Var = new g0(6);
            a aVar = s0Var.a;
            x1 x1VarF = aVar.F(aVar.C(e1Var), g0Var);
            s0Var.a.N(e1Var, x1VarF);
            s0Var.g = x1VarF.build();
            s0Var.b = null;
        }
        s0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.forEach(this.e);
            this.g = null;
        } else {
            j$.util.e1 e1Var = this.b;
            if (e1Var != null) {
                this.a.N(e1Var, this.e);
                this.b = null;
            }
        }
        s0 s0Var = (s0) this.d.g(this, null, null);
        if (s0Var != null) {
            s0Var.tryComplete();
        }
    }

    public s0(s0 s0Var, j$.util.e1 e1Var, s0 s0Var2) {
        super(s0Var);
        this.a = s0Var.a;
        this.b = e1Var;
        this.c = s0Var.c;
        this.d = s0Var.d;
        this.e = s0Var.e;
        this.f = s0Var2;
    }
}
