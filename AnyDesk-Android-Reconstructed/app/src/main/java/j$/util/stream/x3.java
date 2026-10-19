package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class x3 extends w3 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    public x3(c7 c7Var, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.w3
    public final r4 a0() {
        return new p4(this.i, this.h);
    }
}
