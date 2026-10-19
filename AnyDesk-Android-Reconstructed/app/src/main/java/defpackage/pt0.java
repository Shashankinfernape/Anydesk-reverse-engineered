package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pt0 {
    public final List a;
    public final Integer b;
    public final fw c;
    public final int d;

    public pt0(List list, Integer num, fw fwVar, int i) {
        this.a = list;
        this.b = num;
        this.c = fwVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pt0)) {
            return false;
        }
        pt0 pt0Var = (pt0) obj;
        return this.a.equals(pt0Var.a) && y90.e(this.b, pt0Var.b) && this.c == pt0Var.c && this.d == pt0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Integer num = this.b;
        return this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0) + this.d;
    }

    public final String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.c + ", leadingPlaceholderCount=" + this.d + ')';
    }
}
