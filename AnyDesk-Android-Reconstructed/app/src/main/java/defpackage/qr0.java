package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends wr0 {
    public final xg0 a;
    public final int b;
    public final int c;
    public final int d;

    public qr0(xg0 xg0Var, int i, int i2, int i3) {
        xg0Var.getClass();
        this.a = xg0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (xg0Var == xg0.c) {
            id.q("Drop load type must be PREPEND or APPEND");
            throw null;
        }
        if (b() > 0) {
            if (i3 >= 0) {
                return;
            }
            nh0.e(gr0.e(i3, "Invalid placeholdersRemaining "));
            throw null;
        }
        throw new IllegalArgumentException(("Drop count must be > 0, but was " + b()).toString());
    }

    public final int b() {
        return (this.c - this.b) + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr0)) {
            return false;
        }
        qr0 qr0Var = (qr0) obj;
        return this.a == qr0Var.a && this.b == qr0Var.b && this.c == qr0Var.c && this.d == qr0Var.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 1) {
            str = "front";
        } else {
            if (iOrdinal != 2) {
                id.q("Drop load type must be PREPEND or APPEND");
                return null;
            }
            str = "end";
        }
        StringBuilder sbN = q51.n("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
        sbN.append(this.b);
        sbN.append("\n                    |   maxPageOffset: ");
        sbN.append(this.c);
        sbN.append("\n                    |   placeholdersRemaining: ");
        sbN.append(this.d);
        sbN.append("\n                    |)");
        return j71.M(sbN.toString());
    }
}
