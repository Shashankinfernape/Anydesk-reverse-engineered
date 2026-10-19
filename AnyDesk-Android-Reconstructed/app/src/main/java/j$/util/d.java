package j$.util;

import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public interface d {
    void forEach(Consumer consumer);

    Stream parallelStream();

    boolean removeIf(Predicate predicate);

    e1 spliterator();

    Stream stream();

    Object[] toArray(IntFunction intFunction);
}
