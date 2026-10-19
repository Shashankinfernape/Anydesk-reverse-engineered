package j$.util.stream;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b5 extends e5 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Function m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5(f5 f5Var, int i, Function function, int i2) {
        super(f5Var, i);
        this.l = i2;
        this.m = function;
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new m(this, n5Var, 3);
            default:
                return new l(this, n5Var);
        }
    }
}
