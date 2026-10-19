package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj0 {
    public final String a;
    public final w90 b;

    public nj0(String str, w90 w90Var) {
        this.a = str;
        this.b = w90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj0)) {
            return false;
        }
        nj0 nj0Var = (nj0) obj;
        return this.a.equals(nj0Var.a) && this.b.equals(nj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
