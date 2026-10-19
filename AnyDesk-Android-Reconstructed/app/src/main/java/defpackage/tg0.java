package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tg0 extends vg0 {
    public static final tg0 b = new tg0(false);

    public final boolean equals(Object obj) {
        if (obj instanceof tg0) {
            return this.a == ((tg0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.a + ')';
    }
}
