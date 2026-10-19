package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements Map.Entry, yd0 {
    public final jj0 c;
    public final int d;
    public final int e;

    public hj0(jj0 jj0Var, int i) {
        jj0Var.getClass();
        this.c = jj0Var;
        this.d = i;
        this.e = jj0Var.j;
    }

    public final void a() {
        if (this.c.j != this.e) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return y90.e(entry.getKey(), getKey()) && y90.e(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.c.c[this.d];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.c.d;
        objArr.getClass();
        return objArr[this.d];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        jj0 jj0Var = this.c;
        jj0Var.b();
        Object[] objArr = jj0Var.d;
        if (objArr == null) {
            int length = jj0Var.c.length;
            if (length < 0) {
                id.q("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            jj0Var.d = objArr;
        }
        int i = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
