package j$.util;

import j$.util.stream.z6;
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
public class m implements Collection, Serializable, d {
    private static final long serialVersionUID = 1820017752578914078L;
    public final Collection a;

    public m(Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.lang.Iterable, j$.util.d
    public void forEach(Consumer consumer) {
        Collection$EL.a(this.a, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new l(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return z6.g(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.d
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return d1.a(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return z6.g(stream());
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Collection, j$.util.d
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return c.h(this, intFunction);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    @Override // java.util.Collection, j$.util.d
    public j$.util.stream.Stream parallelStream() {
        return Collection$EL.b(this.a);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.d, java.util.Set
    public e1 spliterator() {
        return Collection$EL.c(this.a);
    }

    @Override // java.util.Collection, j$.util.d
    public j$.util.stream.Stream stream() {
        return Collection$EL.stream(this.a);
    }
}
