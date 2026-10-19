package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements k1 {
    public final List a;
    public final int b;

    public j1(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a.equals(j1Var.a) && this.b == j1Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Success(items=" + this.a + ", totalItemCount=" + this.b + ")";
    }
}
