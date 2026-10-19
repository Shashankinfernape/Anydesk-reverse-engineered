package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends j2 implements ListIterator {
    public final /* synthetic */ m2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m2 m2Var, int i) {
        super(0, m2Var);
        this.f = m2Var;
        int iA = m2Var.a();
        if (i < 0 || i > iA) {
            id.h("index: ", i, ", size: ", iA);
            throw null;
        }
        this.d = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d - 1;
        this.d = i;
        return this.f.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
