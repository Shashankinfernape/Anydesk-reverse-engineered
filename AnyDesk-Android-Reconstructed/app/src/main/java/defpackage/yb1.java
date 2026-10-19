package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yb1 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public yb1(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yb1)) {
            return false;
        }
        yb1 yb1Var = (yb1) obj;
        return this.b == yb1Var.b && this.a.equals(yb1Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
