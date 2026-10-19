package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.Comparator$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Comparator$EL {
    public static f a(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof g) {
            Objects.requireNonNull(comparator2);
            return new f((g) comparator, comparator2, 0);
        }
        Objects.requireNonNull(comparator2);
        return new f(comparator, comparator2, 0);
    }

    public static Comparator reversed(Comparator comparator) {
        if (!(comparator instanceof g)) {
            return Collections.reverseOrder(comparator);
        }
        return Collections.reverseOrder();
    }

    public static Comparator thenComparing(Comparator comparator, Function function, Comparator comparator2) {
        if (comparator instanceof g) {
            Objects.requireNonNull(function);
            Objects.requireNonNull(comparator2);
            return a((g) comparator, new f(comparator2, function, 1));
        }
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator2);
        return a(comparator, new f(comparator2, function, 1));
    }
}
