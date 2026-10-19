package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public interface f2 {
    f2 a(int i);

    long count();

    void forEach(Consumer consumer);

    f2 j(long j, long j2, IntFunction intFunction);

    void k(Object[] objArr, int i);

    Object[] n(IntFunction intFunction);

    int p();

    j$.util.e1 spliterator();
}
