package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tt0 {
    public final Object a;
    public final Object b;

    public tt0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tt0)) {
            return false;
        }
        tt0 tt0Var = (tt0) obj;
        return Objects.equals(tt0Var.a, this.a) && Objects.equals(tt0Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
