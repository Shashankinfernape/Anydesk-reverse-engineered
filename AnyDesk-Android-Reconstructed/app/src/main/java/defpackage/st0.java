package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class st0 implements Serializable {
    public final Object c;
    public final Object d;

    public st0(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st0)) {
            return false;
        }
        st0 st0Var = (st0) obj;
        return y90.e(this.c, st0Var.c) && y90.e(this.d, st0Var.d);
    }

    public final int hashCode() {
        Object obj = this.c;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.c + ", " + this.d + ')';
    }
}
