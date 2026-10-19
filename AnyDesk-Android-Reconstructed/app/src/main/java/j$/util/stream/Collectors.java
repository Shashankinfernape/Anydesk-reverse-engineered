package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;

    static {
        h hVar = h.CONCURRENT;
        h hVar2 = h.UNORDERED;
        h hVar3 = h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(hVar, hVar2, hVar3));
        Collections.unmodifiableSet(EnumSet.of(hVar, hVar2));
        a = Collections.unmodifiableSet(EnumSet.of(hVar3));
        Collections.unmodifiableSet(EnumSet.of(hVar2, hVar3));
        b = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(hVar2));
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new k(new j$.util.p(5, charSequence), new j$.util.function.c(9), new j$.util.function.c(10), new j$.util.function.c(11), b);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new k(new j$.util.function.c(3), new j$.util.function.c(4), new j$.util.function.c(7), new j$.util.function.c(8), a);
    }
}
