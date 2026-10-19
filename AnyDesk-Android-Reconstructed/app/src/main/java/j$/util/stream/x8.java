package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class x8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public x8(a aVar, a aVar2, j$.util.e1 e1Var, IntFunction intFunction) {
        super(aVar2, e1Var);
        this.h = aVar;
        this.i = intFunction;
        this.j = b7.ORDERED.d(aVar2.f);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // j$.util.stream.d
    public final Object a() {
        long jC;
        boolean zB = b();
        if (zB || !this.j) {
            jC = -1;
        } else {
            b7 b7Var = b7.SIZED;
            a aVar = this.h;
            int i = aVar.c;
            int i2 = b7Var.e;
            if ((i & i2) == i2) {
                jC = aVar.C(this.b);
            } else {
                jC = -1;
            }
        }
        x1 x1VarF = this.a.F(jC, this.i);
        w8 w8VarG = ((v8) this.h).g(x1VarF, this.j && !zB);
        this.a.N(this.b, w8VarG);
        f2 f2VarBuild = x1VarF.build();
        this.k = f2VarBuild.count();
        this.l = w8VarG.h();
        return f2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d c(j$.util.e1 e1Var) {
        return new x8(this, e1Var);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        f2 f2VarF;
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                x8 x8Var = (x8) dVar;
                long j = x8Var.l;
                this.l = j;
                if (j == x8Var.k) {
                    this.l = j + ((x8) this.e).l;
                }
            }
            x8 x8Var2 = (x8) dVar;
            long j2 = x8Var2.k;
            x8 x8Var3 = (x8) this.e;
            this.k = j2 + x8Var3.k;
            if (x8Var2.k == 0) {
                f2VarF = (f2) x8Var3.f;
            } else {
                f2VarF = x8Var3.k == 0 ? (f2) x8Var2.f : w3.F(this.h.E(), (f2) ((x8) this.d).f, (f2) ((x8) this.e).f);
            }
            f2 f2VarJ = f2VarF;
            if (b() && this.j) {
                f2VarJ = f2VarJ.j(this.l, f2VarJ.count(), this.i);
            }
            this.f = f2VarJ;
        }
        super.onCompletion(countedCompleter);
    }

    public x8(x8 x8Var, j$.util.e1 e1Var) {
        super(x8Var, e1Var);
        this.h = x8Var.h;
        this.i = x8Var.i;
        this.j = x8Var.j;
    }
}
