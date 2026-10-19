package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Comparator {
    public static final g INSTANCE;
    public static final /* synthetic */ g[] a;

    static {
        g gVar = new g("INSTANCE", 0);
        INSTANCE = gVar;
        a = new g[]{gVar};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return Comparator$EL.a(this, new f(comparator, function, 1));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return Comparator$EL.a(this, new e(1, toDoubleFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$EL.a(this, Comparator$CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return Comparator$EL.a(this, new e(3, toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        return Comparator$EL.a(this, Comparator$CC.comparing(function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new f(this, comparator, 0);
    }
}
