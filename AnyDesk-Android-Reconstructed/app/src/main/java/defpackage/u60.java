package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class u60 implements Iterator, yd0 {
    public Object c;
    public int d = -2;
    public final /* synthetic */ b10 e;

    public u60(b10 b10Var) {
        this.e = b10Var;
    }

    public final void a() {
        Object objH;
        int i = this.d;
        b10 b10Var = this.e;
        if (i == -2) {
            objH = ((o50) b10Var.b).a();
        } else {
            z50 z50Var = b10Var.c;
            Object obj = this.c;
            obj.getClass();
            objH = z50Var.h(obj);
        }
        this.c = objH;
        this.d = objH == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < 0) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d < 0) {
            a();
        }
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.c;
        obj.getClass();
        this.d = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
