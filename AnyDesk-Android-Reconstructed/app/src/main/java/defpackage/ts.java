package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ts implements ef0 {
    public final /* synthetic */ int c = 2;
    public final Object d;
    public final Object e;

    public ts(ff0 ff0Var) {
        this.d = ff0Var;
        im imVar = im.c;
        Class<?> cls = ff0Var.getClass();
        gm gmVar = (gm) imVar.a.get(cls);
        this.e = gmVar == null ? imVar.a(cls, null) : gmVar;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                rs rsVar = (rs) obj;
                switch (ss.a[ze0Var.ordinal()]) {
                    case 1:
                        rsVar.h(gf0Var);
                        break;
                    case 2:
                        rsVar.d(gf0Var);
                        break;
                    case 3:
                        rsVar.g(gf0Var);
                        break;
                    case 4:
                        rsVar.a(gf0Var);
                        break;
                    case 5:
                        rsVar.c(gf0Var);
                        break;
                    case 6:
                        rsVar.e(gf0Var);
                        break;
                    case 7:
                        id.q("ON_ANY must not been send by anybody");
                        return;
                    default:
                        throw new pn();
                }
                ef0 ef0Var = (ef0) obj2;
                if (ef0Var != null) {
                    ef0Var.i(gf0Var, ze0Var);
                    return;
                }
                return;
            case 1:
                if (ze0Var == ze0.ON_START) {
                    ((if0) obj).f(this);
                    ((ui0) obj2).y();
                    return;
                }
                return;
            default:
                HashMap map = ((gm) obj2).a;
                gm.a((List) map.get(ze0Var), gf0Var, ze0Var, obj);
                gm.a((List) map.get(ze0.ON_ANY), gf0Var, ze0Var, obj);
                return;
        }
    }

    public ts(rs rsVar, ef0 ef0Var) {
        rsVar.getClass();
        this.d = rsVar;
        this.e = ef0Var;
    }

    public ts(if0 if0Var, ui0 ui0Var) {
        this.d = if0Var;
        this.e = ui0Var;
    }
}
