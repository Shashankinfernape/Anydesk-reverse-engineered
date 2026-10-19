package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g11 implements Iterator, rq, yd0 {
    public int c;
    public Object d;
    public Iterator e;
    public rq f;

    public final RuntimeException a() {
        int i = this.c;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.c);
    }

    @Override // defpackage.rq
    public final br e() {
        return kx.c;
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        y90.V(obj);
        this.c = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.e;
                it.getClass();
                if (it.hasNext()) {
                    this.c = 2;
                    return true;
                }
                this.e = null;
            }
            this.c = 5;
            rq rqVar = this.f;
            rqVar.getClass();
            this.f = null;
            rqVar.g(uc1.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.c = 1;
            Iterator it = this.e;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.c = 0;
        Object obj = this.d;
        this.d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
