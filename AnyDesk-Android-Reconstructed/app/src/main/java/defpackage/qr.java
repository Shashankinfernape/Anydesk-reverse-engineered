package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(us0 us0Var);

    public final boolean equals(Object obj) {
        if (obj instanceof qr) {
            return y90.e(this.a, ((qr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
