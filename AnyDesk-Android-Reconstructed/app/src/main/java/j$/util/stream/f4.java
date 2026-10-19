package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class f4 extends w3 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    public f4(c7 c7Var, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.w3
    public final r4 a0() {
        return new a4(this.i, this.h);
    }
}
