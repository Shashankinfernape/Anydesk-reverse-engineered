package j$.util;

import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Collection$EL {
    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof d) {
            ((d) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.o(it.next());
        }
    }

    public static /* synthetic */ Stream b(Collection collection) {
        return collection instanceof d ? ((d) collection).parallelStream() : c.f(collection);
    }

    public static e1 c(Collection collection) {
        if (collection instanceof d) {
            return ((d) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return new q1(17, (Collection) Objects.requireNonNull((LinkedHashSet) collection));
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new p0(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return new q1(1, (Collection) Objects.requireNonNull((Set) collection));
        }
        if (!(collection instanceof List)) {
            return new q1(0, (Collection) Objects.requireNonNull(collection));
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new a(list) : new q1(16, (Collection) Objects.requireNonNull(list));
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof d ? ((d) collection).stream() : c.g(collection);
    }

    public static /* synthetic */ Object[] toArray(Collection collection, IntFunction intFunction) {
        return collection instanceof d ? ((d) collection).toArray(intFunction) : c.h(collection, intFunction);
    }
}
