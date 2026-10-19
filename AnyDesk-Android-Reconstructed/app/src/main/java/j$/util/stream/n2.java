package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class n2 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public n2(n2 n2Var, j$.util.e1 e1Var) {
        super(n2Var, e1Var);
        this.h = n2Var.h;
        this.i = n2Var.i;
        this.j = n2Var.j;
    }

    @Override // j$.util.stream.d
    public d c(j$.util.e1 e1Var) {
        return new n2(this, e1Var);
    }

    @Override // j$.util.stream.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f2 a() {
        x1 x1Var = (x1) this.i.apply(this.h.C(this.b));
        this.h.N(this.b, x1Var);
        return x1Var.build();
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (f2) this.j.apply((f2) ((n2) dVar).f, (f2) ((n2) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public n2(a aVar, j$.util.e1 e1Var, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, e1Var);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}
