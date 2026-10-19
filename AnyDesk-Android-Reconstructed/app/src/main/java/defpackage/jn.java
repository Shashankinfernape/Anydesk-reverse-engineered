package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jn {
    public final vg0 a;
    public final vg0 b;
    public final vg0 c;
    public final wg0 d;
    public final wg0 e;

    public jn(vg0 vg0Var, vg0 vg0Var2, vg0 vg0Var3, wg0 wg0Var, wg0 wg0Var2) {
        vg0Var.getClass();
        vg0Var2.getClass();
        vg0Var3.getClass();
        wg0Var.getClass();
        this.a = vg0Var;
        this.b = vg0Var2;
        this.c = vg0Var3;
        this.d = wg0Var;
        this.e = wg0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jn.class != obj.getClass()) {
            return false;
        }
        jn jnVar = (jn) obj;
        return y90.e(this.a, jnVar.a) && y90.e(this.b, jnVar.b) && y90.e(this.c, jnVar.c) && y90.e(this.d, jnVar.d) && y90.e(this.e, jnVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        wg0 wg0Var = this.e;
        return iHashCode + (wg0Var != null ? wg0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
