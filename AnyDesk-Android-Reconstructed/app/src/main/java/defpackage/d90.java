package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d90 {
    public final int a;
    public final Object b;

    public d90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90Var = (d90) obj;
        return this.a == d90Var.a && y90.e(this.b, d90Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
