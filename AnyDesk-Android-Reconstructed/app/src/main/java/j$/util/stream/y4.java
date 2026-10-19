package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends d {
    public final w3 h;

    public y4(y4 y4Var, j$.util.e1 e1Var) {
        super(y4Var, e1Var);
        this.h = y4Var.h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        r4 r4VarA0 = this.h.a0();
        aVar.N(this.b, r4VarA0);
        return r4VarA0;
    }

    @Override // j$.util.stream.d
    public final d c(j$.util.e1 e1Var) {
        return new y4(this, e1Var);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            r4 r4Var = (r4) ((y4) dVar).f;
            r4Var.i((r4) ((y4) this.e).f);
            this.f = r4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public y4(w3 w3Var, a aVar, j$.util.e1 e1Var) {
        super(aVar, e1Var);
        this.h = w3Var;
    }
}
