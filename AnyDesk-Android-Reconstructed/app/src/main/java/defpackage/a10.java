package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a10 implements Iterator, yd0 {
    public final Iterator d;
    public Object f;
    public final /* synthetic */ f11 g;
    public final /* synthetic */ int c = 0;
    public int e = -1;

    public a10(b10 b10Var) {
        this.g = b10Var;
        this.d = new nb1((o81) b10Var.b);
    }

    public void a() {
        Object next;
        b10 b10Var = (b10) this.g;
        do {
            Iterator it = this.d;
            if (!it.hasNext()) {
                this.e = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((a0) b10Var.c).h(next)).booleanValue());
        this.f = next;
        this.e = 1;
    }

    public void b() {
        Iterator it = this.d;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((o81) this.g).c.h(next)).booleanValue()) {
                this.e = 1;
                this.f = next;
                return;
            }
        }
        this.e = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                if (this.e == -1) {
                    a();
                }
                return this.e == 1;
            default:
                if (this.e == -1) {
                    b();
                }
                return this.e == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                if (this.e == -1) {
                    a();
                }
                if (this.e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f;
                this.f = null;
                this.e = -1;
                return obj;
            default:
                if (this.e == -1) {
                    b();
                }
                if (this.e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f;
                this.f = null;
                this.e = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a10(o81 o81Var) {
        this.g = o81Var;
        this.d = o81Var.b.iterator();
    }
}
