package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bt0 extends th1 {
    public final int j;
    public final int k;
    public final int l;

    public bt0(int i, int i2, int i3) {
        this.j = i;
        this.k = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        return this.j == bt0Var.j && this.k == bt0Var.k && this.l == bt0Var.l;
    }

    public final int hashCode() {
        return this.j + this.k + this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.j;
        sb.append(i);
        sb.append(" items (\n                    |   dropCount: ");
        sb.append(i);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.k);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.l);
        sb.append("\n                    |)\n                    |");
        return j71.M(sb.toString());
    }
}
