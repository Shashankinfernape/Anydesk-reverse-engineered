package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements Map.Entry {
    public final Object c;
    public final Object d;
    public sz0 e;
    public sz0 f;

    public sz0(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return this.c.equals(sz0Var.c) && this.d.equals(sz0Var.d);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.c.hashCode() ^ this.d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.c + "=" + this.d;
    }
}
