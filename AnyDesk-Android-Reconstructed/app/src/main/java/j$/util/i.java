package j$.util;

import j$.util.stream.z6;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class i implements Collection, Serializable, d {
    private static final long serialVersionUID = 3053995032091335093L;
    public final Collection a;
    public final Object b;

    public i(Collection collection, Object obj) {
        this.a = (Collection) Objects.requireNonNull(collection);
        this.b = Objects.requireNonNull(obj);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.b) {
            zAdd = this.a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.b) {
            zAddAll = this.a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.b) {
            zContains = this.a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.b) {
            zContainsAll = this.a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.lang.Iterable, j$.util.d
    public final void forEach(Consumer consumer) {
        synchronized (this.b) {
            Collection$EL.a(this.a, consumer);
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = this.a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return z6.g(Collection$EL.b(this.a));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = this.a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.b) {
            zRemoveAll = this.a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection, j$.util.d
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.b) {
            Collection collection = this.a;
            if (collection instanceof d) {
                zRemoveIf = ((d) collection).removeIf(predicate);
            } else {
                Objects.requireNonNull(predicate);
                Iterator it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (predicate.test(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                zRemoveIf = z;
            }
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.b) {
            zRetainAll = this.a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return d1.a(Collection$EL.c(this.a));
    }

    @Override // java.util.Collection
    public final Stream stream() {
        return z6.g(Collection$EL.stream(this.a));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.b) {
            array = this.a.toArray();
        }
        return array;
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }

    @Override // java.util.Collection, j$.util.d
    public final j$.util.stream.Stream parallelStream() {
        return Collection$EL.b(this.a);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.d, java.util.Set
    public final e1 spliterator() {
        return Collection$EL.c(this.a);
    }

    @Override // java.util.Collection, j$.util.d
    public final j$.util.stream.Stream stream() {
        return Collection$EL.stream(this.a);
    }

    @Override // java.util.Collection, j$.util.d
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return c.h(this, intFunction);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.b) {
            array = this.a.toArray(objArr);
        }
        return array;
    }
}
