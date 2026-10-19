package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg0 extends vg0 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0(Throwable th) {
        super(false);
        th.getClass();
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sg0)) {
            return false;
        }
        sg0 sg0Var = (sg0) obj;
        return this.a == sg0Var.a && y90.e(this.b, sg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a ? 1231 : 1237);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.a + ", error=" + this.b + ')';
    }
}
