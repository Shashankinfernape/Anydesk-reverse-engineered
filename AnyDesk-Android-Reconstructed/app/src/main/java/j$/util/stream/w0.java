package j$.util.stream;

import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends h5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i, n5 n5Var) {
        super(n5Var);
        this.b = i;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            case 1:
                this.a.accept(i);
                return;
            case 2:
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            default:
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
    }
}
