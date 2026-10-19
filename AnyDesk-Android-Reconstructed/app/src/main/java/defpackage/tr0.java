package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tr0 extends wr0 {
    public final wg0 a;
    public final wg0 b;

    public tr0(wg0 wg0Var, wg0 wg0Var2) {
        this.a = wg0Var;
        this.b = wg0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return this.a.equals(tr0Var.a) && y90.e(this.b, tr0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wg0 wg0Var = this.b;
        return iHashCode + (wg0Var == null ? 0 : wg0Var.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
        wg0 wg0Var = this.b;
        if (wg0Var != null) {
            str = str + "|   mediatorLoadStates: " + wg0Var + '\n';
        }
        return j71.M(str.concat("|)"));
    }
}
