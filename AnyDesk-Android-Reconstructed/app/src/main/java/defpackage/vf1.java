package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vf1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vf1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(xg0 xg0Var) {
        xg0Var.getClass();
        int iOrdinal = xg0Var.ordinal();
        if (iOrdinal == 0) {
            id.q("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (iOrdinal == 1) {
            return this.a;
        }
        if (iOrdinal == 2) {
            return this.b;
        }
        throw new pn();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf1)) {
            return false;
        }
        vf1 vf1Var = (vf1) obj;
        return this.a == vf1Var.a && this.b == vf1Var.b && this.c == vf1Var.c && this.d == vf1Var.d;
    }

    public int hashCode() {
        return this.a + this.b + this.c + this.d;
    }
}
