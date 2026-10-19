package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph0 extends pi implements o50, xd0 {
    public final boolean i;

    public ph0(qh0 qh0Var) {
        super(qh0Var, ds.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.i = false;
    }

    @Override // defpackage.o50
    public final Object a() {
        return this.d.getClass().getSimpleName();
    }

    public final xd0 e() {
        if (this.i) {
            return this;
        }
        xd0 xd0Var = this.c;
        if (xd0Var != null) {
            return xd0Var;
        }
        nx0.a.getClass();
        this.c = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ph0) {
            ph0 ph0Var = (ph0) obj;
            return d().equals(ph0Var.d()) && this.f.equals(ph0Var.f) && this.g.equals(ph0Var.g) && y90.e(this.d, ph0Var.d);
        }
        if (obj instanceof ph0) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xd0 xd0VarE = e();
        return xd0VarE != this ? xd0VarE.toString() : q51.m(new StringBuilder("property "), this.f, " (Kotlin reflection is not available)");
    }
}
