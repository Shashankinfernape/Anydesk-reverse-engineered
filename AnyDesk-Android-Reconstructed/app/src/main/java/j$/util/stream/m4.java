package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class m4 extends w3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public m4(c7 c7Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.w3
    public final r4 a0() {
        return new l4(this.i, this.h);
    }
}
