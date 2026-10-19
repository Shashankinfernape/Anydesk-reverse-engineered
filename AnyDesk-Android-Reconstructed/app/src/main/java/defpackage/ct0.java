package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ct0 extends th1 {
    public final ArrayList j;
    public final int k;
    public final int l;

    public ct0(ArrayList arrayList, int i, int i2) {
        this.j = arrayList;
        this.k = i;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ct0)) {
            return false;
        }
        ct0 ct0Var = (ct0) obj;
        return this.j.equals(ct0Var.j) && this.k == ct0Var.k && this.l == ct0Var.l;
    }

    public final int hashCode() {
        return this.j.hashCode() + this.k + this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.j;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(tm.j0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(tm.p0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.k);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.l);
        sb.append("\n                    |)\n                    |");
        return j71.M(sb.toString());
    }
}
