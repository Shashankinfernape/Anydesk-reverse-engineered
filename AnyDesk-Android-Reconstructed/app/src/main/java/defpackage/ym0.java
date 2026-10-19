package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 {
    public final int a;
    public eo0 b = null;
    public Bundle c = null;

    public ym0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym0)) {
            return false;
        }
        ym0 ym0Var = (ym0) obj;
        if (this.a != ym0Var.a || !y90.e(this.b, ym0Var.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = ym0Var.c;
        if (y90.e(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !r71.l(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        eo0 eo0Var = this.b;
        int iHashCode = i + (eo0Var != null ? eo0Var.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null) {
            return r71.m(bundle) + (iHashCode * 31);
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ym0.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
