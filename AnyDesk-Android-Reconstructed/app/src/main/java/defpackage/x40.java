package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x40 implements ef0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x40(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        int i = this.c;
        int i2 = 0;
        Object obj = this.d;
        switch (i) {
            case 0:
                b50 b50Var = (b50) obj;
                if (ze0Var == ze0.ON_DESTROY) {
                    c40 c40Var = (c40) gf0Var;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) b50Var.b().f.c.getValue()) {
                        if (y90.e(((an0) obj3).h, c40Var.A)) {
                            obj2 = obj3;
                        }
                    }
                    an0 an0Var = (an0) obj2;
                    if (an0Var != null) {
                        if (b50.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + an0Var + " due to fragment " + gf0Var + " lifecycle reaching DESTROYED");
                        }
                        b50Var.b().c(an0Var);
                    }
                }
                break;
            case 1:
                mn0 mn0Var = (mn0) obj;
                mn0Var.p = ze0Var.a();
                if (mn0Var.c != null) {
                    ArrayList arrayListX0 = tm.x0(mn0Var.f);
                    int size = arrayListX0.size();
                    while (i2 < size) {
                        Object obj4 = arrayListX0.get(i2);
                        i2++;
                        an0 an0Var2 = (an0) obj4;
                        an0Var2.getClass();
                        dn0 dn0Var = an0Var2.j;
                        dn0Var.getClass();
                        ((an0) dn0Var.c).f = ze0Var.a();
                        dn0Var.g = ze0Var.a();
                        dn0Var.d();
                    }
                }
                break;
            default:
                f01 f01Var = (f01) obj;
                if (ze0Var == ze0.ON_START) {
                    f01Var.h = true;
                } else if (ze0Var == ze0.ON_STOP) {
                    f01Var.h = false;
                }
                break;
        }
    }
}
