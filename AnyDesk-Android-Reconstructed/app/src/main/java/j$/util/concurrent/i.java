package j$.util.concurrent;

import j$.util.Objects;
import j$.util.d1;
import j$.util.e1;
import j$.util.stream.z6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends b implements Set, j$.util.d {
    private static final long serialVersionUID = 7249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set != this) {
            return containsAll(set) && set.containsAll(this);
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.d
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.a.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                consumer.o(lVarA.b);
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object it = iterator();
        int iHashCode = 0;
        while (((a) it).hasNext()) {
            iHashCode += ((h) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return z6.g(j$.util.c.f(this));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.g(obj, null, null) != null;
    }

    @Override // java.util.Collection, j$.util.d
    public final boolean removeIf(Predicate predicate) {
        Objects.requireNonNull(predicate);
        Object it = iterator();
        boolean z = false;
        while (true) {
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return z;
            }
            if (predicate.test(((h) it).next())) {
                aVar.remove();
                z = true;
            }
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.d
    public final e1 spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j < 0 ? 0L : j, 0);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return z6.g(j$.util.c.g(this));
    }

    @Override // java.util.Collection, j$.util.d
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return j$.util.c.h(this, intFunction);
    }

    @Override // java.util.Collection, j$.util.d
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.c.f(this);
    }

    @Override // java.util.Collection, j$.util.d
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.c.g(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return d1.a(spliterator());
    }
}
