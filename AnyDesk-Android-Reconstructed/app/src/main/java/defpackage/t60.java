package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t60 {
    public final int a;
    public final vf1 b;

    public t60(int i, vf1 vf1Var) {
        vf1Var.getClass();
        this.a = i;
        this.b = vf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t60)) {
            return false;
        }
        t60 t60Var = (t60) obj;
        return this.a == t60Var.a && y90.e(this.b, t60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
