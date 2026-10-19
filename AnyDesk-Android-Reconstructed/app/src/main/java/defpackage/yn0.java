package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class yn0 implements Iterator, yd0 {
    public int c = -1;
    public boolean d;
    public final /* synthetic */ xb e;

    public yn0(xb xbVar) {
        this.e = xbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c + 1 < ((x51) this.e.e).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d = true;
        x51 x51Var = (x51) this.e.e;
        int i = this.c + 1;
        this.c = i;
        return (vn0) x51Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            nh0.j("You must call next() before you can remove an element");
            return;
        }
        x51 x51Var = (x51) this.e.e;
        ((vn0) x51Var.g(this.c)).e = null;
        int i = this.c;
        Object[] objArr = x51Var.e;
        Object obj = objArr[i];
        Object obj2 = r71.e;
        if (obj != obj2) {
            objArr[i] = obj2;
            x51Var.c = true;
        }
        this.c = i - 1;
        this.d = false;
    }
}
