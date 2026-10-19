package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt0 extends th1 {
    public final ss0 j;
    public final ss0 k;

    public dt0(ss0 ss0Var, ss0 ss0Var2) {
        ss0Var2.getClass();
        this.j = ss0Var;
        this.k = ss0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dt0)) {
            return false;
        }
        ss0 ss0Var = this.j;
        int i = ss0Var.c;
        dt0 dt0Var = (dt0) obj;
        ss0 ss0Var2 = dt0Var.k;
        ss0 ss0Var3 = dt0Var.j;
        if (i != ss0Var3.c || ss0Var.d != ss0Var3.d || ss0Var.e() != ss0Var3.e() || ss0Var.b != ss0Var3.b) {
            return false;
        }
        ss0 ss0Var4 = this.k;
        return ss0Var4.c == ss0Var2.c && ss0Var4.d == ss0Var2.d && ss0Var4.e() == ss0Var2.e() && ss0Var4.b == ss0Var2.b;
    }

    public final int hashCode() {
        return this.k.hashCode() + this.j.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        ss0 ss0Var = this.j;
        sb.append(ss0Var.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(ss0Var.d);
        sb.append("\n                    |       size: ");
        sb.append(ss0Var.e());
        sb.append("\n                    |       dataCount: ");
        sb.append(ss0Var.b);
        sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        ss0 ss0Var2 = this.k;
        sb.append(ss0Var2.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(ss0Var2.d);
        sb.append("\n                    |       size: ");
        sb.append(ss0Var2.e());
        sb.append("\n                    |       dataCount: ");
        sb.append(ss0Var2.b);
        sb.append("\n                    |   )\n                    |");
        return j71.M(sb.toString());
    }
}
