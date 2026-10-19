package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class n60 extends pi implements m60, xd0, k60 {
    public final int i;
    public final int j;

    public n60(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.i = i;
        this.j = 0;
    }

    @Override // defpackage.m60
    public final int b() {
        return this.i;
    }

    public final xd0 e() {
        nx0.a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n60) {
            n60 n60Var = (n60) obj;
            return this.f.equals(n60Var.f) && this.g.equals(n60Var.g) && this.j == n60Var.j && this.i == n60Var.i && y90.e(this.d, n60Var.d) && d().equals(n60Var.d());
        }
        if (!(obj instanceof n60)) {
            return false;
        }
        xd0 xd0Var = this.c;
        if (xd0Var == null) {
            e();
            this.c = this;
            xd0Var = this;
        }
        return obj.equals(xd0Var);
    }

    public final int hashCode() {
        d();
        return this.g.hashCode() + ((this.f.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xd0 xd0Var = this.c;
        if (xd0Var == null) {
            e();
            this.c = this;
            xd0Var = this;
        }
        if (xd0Var != this) {
            return xd0Var.toString();
        }
        String str = this.f;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : gr0.f("function ", str, " (Kotlin reflection is not available)");
    }

    public n60(int i, int i2, Class cls, String str, String str2) {
        this(i, oi.c, cls, str, str2, i2, 0);
    }
}
