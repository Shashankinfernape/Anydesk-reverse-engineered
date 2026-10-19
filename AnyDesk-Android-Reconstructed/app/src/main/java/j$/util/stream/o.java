package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends g5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        n5 n5Var = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                n5Var.accept(((DoubleFunction) ((q) aVar).m).apply(d));
                break;
            default:
                ((DoubleConsumer) ((w) aVar).m).accept(d);
                n5Var.accept(d);
                break;
        }
    }
}
