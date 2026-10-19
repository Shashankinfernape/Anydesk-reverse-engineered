package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends m2 {
    public final List c;

    public xy0(List list) {
        this.c = list;
    }

    @Override // defpackage.f2
    public final int a() {
        return this.c.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= size() - 1) {
            return this.c.get((size() - 1) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new w90(0, size() - 1, 1) + "].");
    }

    @Override // defpackage.m2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new wy0(this, 0);
    }

    @Override // defpackage.m2, java.util.List
    public final ListIterator listIterator() {
        return new wy0(this, 0);
    }

    @Override // defpackage.m2, java.util.List
    public final ListIterator listIterator(int i) {
        return new wy0(this, i);
    }
}
