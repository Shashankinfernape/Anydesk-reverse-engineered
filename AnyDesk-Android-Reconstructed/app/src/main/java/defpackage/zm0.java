package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm0 {
    public final lo0 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public zm0(lo0 lo0Var, boolean z, Object obj, boolean z2) {
        if (!lo0Var.a && z) {
            nh0.e(lo0Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            nh0.h(lo0Var.b(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.a = lo0Var;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zm0.class != obj.getClass()) {
            return false;
        }
        zm0 zm0Var = (zm0) obj;
        if (this.b != zm0Var.b || this.c != zm0Var.c || !this.a.equals(zm0Var.a)) {
            return false;
        }
        Object obj2 = zm0Var.d;
        Object obj3 = this.d;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nx0.a(zm0.class).a());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        return sb.toString();
    }
}
