package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class x5 extends b {
    public final a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public x5(x5 x5Var, j$.util.e1 e1Var) {
        super(x5Var, e1Var);
        this.j = x5Var.j;
        this.k = x5Var.k;
        this.l = x5Var.l;
        this.m = x5Var.m;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            b7 b7Var = b7.SIZED;
            a aVar = this.j;
            int i = aVar.c;
            int i2 = b7Var.e;
            x1 x1VarF = this.j.F((i & i2) == i2 ? aVar.C(this.b) : -1L, this.k);
            n5 n5VarJ = this.j.J(this.a.f, x1VarF);
            a aVar2 = this.a;
            aVar2.x(this.b, aVar2.O(n5VarJ));
            return x1VarF.build();
        }
        x1 x1VarF2 = this.j.F(-1L, this.k);
        if (this.l == 0) {
            n5 n5VarJ2 = this.j.J(this.a.f, x1VarF2);
            a aVar3 = this.a;
            aVar3.x(this.b, aVar3.O(n5VarJ2));
        } else {
            this.a.N(this.b, x1VarF2);
        }
        f2 f2VarBuild = x1VarF2.build();
        this.n = f2VarBuild.count();
        this.o = true;
        this.b = null;
        return f2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d c(j$.util.e1 e1Var) {
        return new x5(this, e1Var);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(w3.H(this.j.E()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return w3.H(this.j.E());
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        x5 x5Var = (x5) this.d;
        x5 x5Var2 = (x5) this.e;
        if (x5Var == null || x5Var2 == null) {
            return this.n;
        }
        long j2 = x5Var.j(j);
        return j2 >= j ? j2 : x5Var2.j(j) + j2;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        x5 x5Var;
        f2 f2VarF;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((x5) dVar).n + ((x5) this.e).n;
            if (this.i) {
                this.n = 0L;
                f2VarF = w3.H(this.j.E());
            } else if (this.n == 0) {
                f2VarF = w3.H(this.j.E());
            } else {
                f2VarF = ((x5) this.d).n == 0 ? (f2) ((x5) this.e).i() : w3.F(this.j.E(), (f2) ((x5) this.d).i(), (f2) ((x5) this.e).i());
            }
            f2 f2VarJ = f2VarF;
            if (b()) {
                f2VarJ = f2VarJ.j(this.l, this.m >= 0 ? Math.min(f2VarJ.count(), this.l + this.m) : this.n, this.k);
            }
            d(f2VarJ);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                x5 x5Var2 = (x5) ((d) getCompleter());
                Object obj = this;
                while (true) {
                    if (x5Var2 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (obj == x5Var2.e && (x5Var = (x5) x5Var2.d) != null) {
                            long j3 = x5Var.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        obj = x5Var2;
                        x5Var2 = (x5) ((d) x5Var2.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public x5(a aVar, a aVar2, j$.util.e1 e1Var, IntFunction intFunction, long j, long j2) {
        super(aVar2, e1Var);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }
}
