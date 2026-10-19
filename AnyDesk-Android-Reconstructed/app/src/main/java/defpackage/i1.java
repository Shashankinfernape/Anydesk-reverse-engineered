package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements k1 {
    public final ba1 a;

    public i1(ba1 ba1Var) {
        this.a = ba1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && this.a == ((i1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Timeout(cause=" + this.a + ")";
    }
}
