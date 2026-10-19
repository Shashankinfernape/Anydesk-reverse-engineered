package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends a1 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(b1 b1Var, IntConsumer intConsumer) {
        super(b1Var, 0);
        this.l = 0;
        this.m = intConsumer;
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new u0(this, n5Var, 1);
            case 1:
                return new u0(this, n5Var, 2);
            case 2:
                return new x0(this, n5Var);
            case 3:
                return new u0(this, n5Var, 3);
            case 4:
                return new m(this, n5Var, 4);
            default:
                return new z4(this, n5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.l = i2;
        this.m = obj;
    }
}
