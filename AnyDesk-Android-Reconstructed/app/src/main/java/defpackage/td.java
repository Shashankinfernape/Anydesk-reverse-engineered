package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class td implements Iterator, yd0 {
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public td(xd xdVar, int i) {
        this(xdVar.e);
        this.f = i;
        switch (i) {
            case 1:
                this.g = xdVar;
                this(xdVar.e);
                break;
            default:
                this.g = xdVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                objF = ((xd) obj).f(i);
                break;
            case 1:
                objF = ((xd) obj).i(i);
                break;
            default:
                objF = ((zd) obj).d[i];
                break;
        }
        this.d++;
        this.e = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            nh0.j("Call next() before removing an element.");
            return;
        }
        int i = this.d - 1;
        this.d = i;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                ((xd) obj).g(i);
                break;
            case 1:
                ((xd) obj).g(i);
                break;
            default:
                ((zd) obj).a(i);
                break;
        }
        this.c--;
        this.e = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public td(zd zdVar) {
        this(zdVar.e);
        this.f = 2;
        this.g = zdVar;
    }

    public td(int i) {
        this.c = i;
    }
}
