package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class vd implements Iterator, Map.Entry {
    public int c;
    public int d = -1;
    public boolean e;
    public final /* synthetic */ xd f;

    public vd(xd xdVar) {
        this.f = xdVar;
        this.c = xdVar.e - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.e) {
            nh0.j("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.d;
            xd xdVar = this.f;
            if (y90.e(key, xdVar.f(i)) && y90.e(entry.getValue(), xdVar.i(this.d))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.e) {
            return this.f.f(this.d);
        }
        nh0.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.e) {
            return this.f.i(this.d);
        }
        nh0.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.e) {
            nh0.j("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.d;
        xd xdVar = this.f;
        Object objF = xdVar.f(i);
        Object objI = xdVar.i(this.d);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d++;
        this.e = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException();
        }
        this.f.g(this.d);
        this.d--;
        this.c--;
        this.e = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.e) {
            return this.f.h(this.d, obj);
        }
        nh0.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
