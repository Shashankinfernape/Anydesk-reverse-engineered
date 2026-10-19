package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends i5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        int i = this.b;
        n5 n5Var = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                n5Var.accept(((LongFunction) ((q) aVar).m).apply(j));
                break;
            default:
                ((LongConsumer) ((f1) aVar).m).accept(j);
                n5Var.accept(j);
                break;
        }
    }
}
