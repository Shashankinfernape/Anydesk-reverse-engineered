package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class y8 extends b {
    public final a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public y8(a aVar, a aVar2, j$.util.e1 e1Var, IntFunction intFunction) {
        super(aVar2, e1Var);
        this.j = aVar;
        this.k = intFunction;
        this.l = b7.ORDERED.d(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        x1 x1VarF = this.a.F(-1L, this.k);
        n5 n5VarJ = this.j.J(this.a.f, x1VarF);
        a aVar = this.a;
        boolean zX = aVar.x(this.b, aVar.O(n5VarJ));
        this.n = zX;
        if (zX) {
            g();
        }
        f2 f2VarBuild = x1VarF.build();
        this.m = f2VarBuild.count();
        return f2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d c(j$.util.e1 e1Var) {
        return new y8(this, e1Var);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(w3.H(this.j.E()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return w3.H(this.j.E());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        y8 y8Var;
        y8 y8Var2;
        Object objF;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((y8) dVar).n | ((y8) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                objF = w3.H(this.j.E());
            } else if (this.l) {
                y8 y8Var3 = (y8) this.d;
                if (y8Var3.n) {
                    this.m = y8Var3.m;
                    objF = (f2) y8Var3.i();
                } else {
                    y8Var = (y8) this.d;
                    long j = y8Var.m;
                    y8Var2 = (y8) this.e;
                    this.m = j + y8Var2.m;
                    if (y8Var.m == 0) {
                        objF = (f2) y8Var2.i();
                    } else if (y8Var2.m == 0) {
                        objF = (f2) y8Var.i();
                    } else {
                        objF = w3.F(this.j.E(), (f2) ((y8) this.d).i(), (f2) ((y8) this.e).i());
                    }
                }
            } else {
                y8Var = (y8) this.d;
                long j2 = y8Var.m;
                y8Var2 = (y8) this.e;
                this.m = j2 + y8Var2.m;
                if (y8Var.m == 0) {
                    objF = (f2) y8Var2.i();
                } else if (y8Var2.m == 0) {
                    objF = (f2) y8Var.i();
                } else {
                    objF = w3.F(this.j.E(), (f2) ((y8) this.d).i(), (f2) ((y8) this.e).i());
                }
            }
            d(objF);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public y8(y8 y8Var, j$.util.e1 e1Var) {
        super(y8Var, e1Var);
        this.j = y8Var.j;
        this.k = y8Var.k;
        this.l = y8Var.l;
    }
}
