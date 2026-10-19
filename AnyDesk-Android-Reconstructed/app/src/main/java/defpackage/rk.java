package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk {
    public static final qk b = new qk();
    public final Object a;

    public /* synthetic */ rk(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rk) {
            return y90.e(this.a, ((rk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof pk) {
            return ((pk) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
