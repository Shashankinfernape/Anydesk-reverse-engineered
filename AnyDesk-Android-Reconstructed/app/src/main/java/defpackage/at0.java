package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class at0 extends th1 {
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public at0(int i, int i2, int i3, int i4) {
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof at0)) {
            return false;
        }
        at0 at0Var = (at0) obj;
        return this.j == at0Var.j && this.k == at0Var.k && this.l == at0Var.l && this.m == at0Var.m;
    }

    public final int hashCode() {
        return this.j + this.k + this.l + this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i = this.k;
        sb.append(i);
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.j);
        sb.append("\n                    |   dropCount: ");
        sb.append(i);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.l);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.m);
        sb.append("\n                    |)\n                    |");
        return j71.M(sb.toString());
    }
}
