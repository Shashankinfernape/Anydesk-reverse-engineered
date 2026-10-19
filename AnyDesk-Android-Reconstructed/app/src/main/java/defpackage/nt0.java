package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends ot0 implements Iterable, yd0 {
    public final List c;
    public final Object d;
    public final Object e;
    public final int f;
    public final int g;

    static {
        new nt0(mx.c, null, null, 0, 0);
    }

    public nt0(List list, Integer num, Integer num2, int i, int i2) {
        this.c = list;
        this.d = num;
        this.e = num2;
        this.f = i;
        this.g = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            id.q("itemsBefore cannot be negative");
            throw null;
        }
        if (i2 == Integer.MIN_VALUE || i2 >= 0) {
            return;
        }
        id.q("itemsAfter cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt0)) {
            return false;
        }
        nt0 nt0Var = (nt0) obj;
        return this.c.equals(nt0Var.c) && y90.e(this.d, nt0Var.d) && y90.e(this.e, nt0Var.e) && this.f == nt0Var.f && this.g == nt0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.e;
        return ((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f) * 31) + this.g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.c.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.c;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(tm.j0(list));
        sb.append("\n                    |   last Item: ");
        sb.append(tm.p0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.e);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.d);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.f);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.g);
        sb.append("\n                    |) ");
        return j71.M(sb.toString());
    }
}
