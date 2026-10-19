package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zs0 extends th1 {
    public final int j;
    public final ArrayList k;
    public final int l;
    public final int m;

    public zs0(int i, ArrayList arrayList, int i2, int i3) {
        this.j = i;
        this.k = arrayList;
        this.l = i2;
        this.m = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zs0)) {
            return false;
        }
        zs0 zs0Var = (zs0) obj;
        return this.j == zs0Var.j && this.k.equals(zs0Var.k) && this.l == zs0Var.l && this.m == zs0Var.m;
    }

    public final int hashCode() {
        return this.k.hashCode() + this.j + this.l + this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.k;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.j);
        sb.append("\n                    |   first item: ");
        sb.append(tm.j0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(tm.p0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.l);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.m);
        sb.append("\n                    |)\n                    |");
        return j71.M(sb.toString());
    }
}
