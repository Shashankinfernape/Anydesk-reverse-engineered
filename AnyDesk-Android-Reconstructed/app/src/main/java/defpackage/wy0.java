package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wy0 implements ListIterator, yd0 {
    public final ListIterator c;
    public final /* synthetic */ xy0 d;

    public wy0(xy0 xy0Var, int i) {
        this.d = xy0Var;
        List list = xy0Var.c;
        if (i >= 0 && i <= xy0Var.a()) {
            this.c = list.listIterator(xy0Var.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new w90(0, xy0Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.c.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.d.size() - 1) - this.c.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.c.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.d.size() - 1) - this.c.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
