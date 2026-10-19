package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class fp0 {
    public gn0 a;
    public boolean b;

    public abstract vn0 a();

    public final gn0 b() {
        gn0 gn0Var = this.a;
        if (gn0Var != null) {
            return gn0Var;
        }
        nh0.j("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public vn0 c(vn0 vn0Var, Bundle bundle, eo0 eo0Var) {
        return vn0Var;
    }

    public void d(List list, eo0 eo0Var) {
        a10 a10Var = new a10(new b10(new o81(new an(0, list), new m70(this, 2, eo0Var), 1), new a0(20), 0));
        while (a10Var.hasNext()) {
            b().g((an0) a10Var.next());
        }
    }

    public void e(gn0 gn0Var) {
        this.a = gn0Var;
        this.b = true;
    }

    public void f(an0 an0Var) {
        vn0 vn0Var = an0Var.d;
        if (vn0Var == null) {
            vn0Var = null;
        }
        if (vn0Var == null) {
            return;
        }
        do0 do0Var = new do0();
        do0Var.a = true;
        do0Var.b = false;
        do0Var.c = -1;
        do0Var.d = false;
        c(vn0Var, null, do0Var.a());
        b().d(an0Var);
    }

    public Bundle h() {
        return null;
    }

    public void i(an0 an0Var, boolean z) {
        List list = (List) b().e.c.getValue();
        if (!list.contains(an0Var)) {
            nh0.r("popBackStack was called with ", an0Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        an0 an0Var2 = null;
        while (j()) {
            an0Var2 = (an0) listIterator.previous();
            if (y90.e(an0Var2, an0Var)) {
                break;
            }
        }
        if (an0Var2 != null) {
            b().e(an0Var2, z);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }
}
