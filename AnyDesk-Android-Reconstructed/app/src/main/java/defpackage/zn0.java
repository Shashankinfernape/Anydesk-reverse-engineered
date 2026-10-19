package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ep0("navigation")
public class zn0 extends fp0 {
    public final gp0 c;

    public zn0(gp0 gp0Var) {
        gp0Var.getClass();
        this.c = gp0Var;
    }

    @Override // defpackage.fp0
    public final vn0 a() {
        return new xn0(this);
    }

    @Override // defpackage.fp0
    public final void d(List list, eo0 eo0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            an0 an0Var = (an0) it.next();
            vn0 vn0Var = an0Var.d;
            vn0Var.getClass();
            xn0 xn0Var = (xn0) vn0Var;
            Bundle bundleB = an0Var.j.b();
            xb xbVar = xn0Var.i;
            int i = xbVar.c;
            if (i == 0) {
                m7 m7Var = xn0Var.d;
                String strValueOf = (String) m7Var.d;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(m7Var.a);
                }
                strValueOf.getClass();
                if (((xn0) xbVar.d).d.a == 0) {
                    strValueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf).toString());
            }
            vn0 vn0Var2 = (vn0) ((x51) xbVar.e).c(i);
            if (vn0Var2 == null) {
                if (((String) xbVar.f) == null) {
                    xbVar.f = String.valueOf(xbVar.c);
                }
                String str = (String) xbVar.f;
                str.getClass();
                id.q(gr0.f("navigation destination ", str, " is not a direct child of this NavGraph"));
                return;
            }
            this.c.b(vn0Var2.c).d(y90.J(b().b(vn0Var2, vn0Var2.a(bundleB))), eo0Var);
        }
    }
}
