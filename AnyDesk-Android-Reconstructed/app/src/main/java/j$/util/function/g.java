package j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements IntUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntUnaryOperator b;
    public final /* synthetic */ IntUnaryOperator c;

    public /* synthetic */ g(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i) {
        this.a = i;
        this.b = intUnaryOperator;
        this.c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.a) {
            case 0:
                return this.c.applyAsInt(this.b.applyAsInt(i));
            default:
                return this.b.applyAsInt(this.c.applyAsInt(i));
        }
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
