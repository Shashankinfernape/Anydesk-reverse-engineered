package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends i1 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(j1 j1Var, LongConsumer longConsumer) {
        super(j1Var, 0);
        this.l = 1;
        this.m = longConsumer;
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new e1(this, n5Var);
            case 1:
                return new c1(this, n5Var, 1);
            case 2:
                return new z4(this, n5Var);
            default:
                return new m(this, n5Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.l = i2;
        this.m = obj;
    }
}
