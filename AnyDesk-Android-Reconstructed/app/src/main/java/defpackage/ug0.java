package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug0 extends vg0 {
    public static final ug0 b = new ug0(true);
    public static final ug0 c = new ug0(false);

    public final boolean equals(Object obj) {
        if (obj instanceof ug0) {
            return this.a == ((ug0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.a + ')';
    }
}
