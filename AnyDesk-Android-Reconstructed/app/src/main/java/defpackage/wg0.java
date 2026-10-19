package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 {
    public static final wg0 d;
    public final vg0 a;
    public final vg0 b;
    public final vg0 c;

    static {
        ug0 ug0Var = ug0.c;
        d = new wg0(ug0Var, ug0Var, ug0Var);
    }

    public wg0(vg0 vg0Var, vg0 vg0Var2, vg0 vg0Var3) {
        this.a = vg0Var;
        this.b = vg0Var2;
        this.c = vg0Var3;
    }

    public static wg0 a(wg0 wg0Var, int i) {
        int i2 = i & 1;
        vg0 vg0Var = ug0.c;
        vg0 vg0Var2 = i2 != 0 ? wg0Var.a : vg0Var;
        vg0 vg0Var3 = (i & 2) != 0 ? wg0Var.b : vg0Var;
        if ((i & 4) != 0) {
            vg0Var = wg0Var.c;
        }
        return new wg0(vg0Var2, vg0Var3, vg0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return this.a.equals(wg0Var.a) && this.b.equals(wg0Var.b) && this.c.equals(wg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
