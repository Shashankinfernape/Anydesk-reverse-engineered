package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n81 {
    public final String a;
    public final boolean b;

    public n81(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n81)) {
            return false;
        }
        n81 n81Var = (n81) obj;
        return y90.e(this.a, n81Var.a) && this.b == n81Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "TagUiModel(name=" + this.a + ", activated=" + this.b + ")";
    }
}
