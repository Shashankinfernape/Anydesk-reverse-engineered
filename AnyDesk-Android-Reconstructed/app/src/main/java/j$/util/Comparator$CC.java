package j$.util;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Comparator$CC {
    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        return new e(2, function);
    }

    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new e(0, toIntFunction);
    }
}
