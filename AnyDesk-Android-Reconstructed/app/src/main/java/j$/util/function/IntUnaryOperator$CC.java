package j$.util.function;

import j$.util.Objects;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.IntUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class IntUnaryOperator$CC {
    public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        Objects.requireNonNull(intUnaryOperator2);
        return new g(intUnaryOperator, intUnaryOperator2, 0);
    }

    public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        Objects.requireNonNull(intUnaryOperator2);
        return new g(intUnaryOperator, intUnaryOperator2, 1);
    }
}
