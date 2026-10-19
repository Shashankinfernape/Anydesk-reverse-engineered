package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends e5 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f5 f5Var, Consumer consumer) {
        super(f5Var, 0);
        this.l = 3;
        this.m = consumer;
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new o(this, n5Var, 0);
            case 1:
                return new u0(this, n5Var, 0);
            case 2:
                return new c1(this, n5Var, 0);
            case 3:
                return new m(this, n5Var, 1);
            default:
                return new m(this, n5Var, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.l = i2;
        this.m = obj;
    }
}
