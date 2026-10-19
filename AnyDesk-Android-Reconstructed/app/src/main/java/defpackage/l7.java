package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l7 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof l7)) {
                return false;
            }
            l7 l7Var = (l7) obj;
            int i = this.a;
            if (i != l7Var.a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != l7Var.b || this.b != l7Var.d) {
                if (this.d != l7Var.d || this.b != l7Var.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = l7Var.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
