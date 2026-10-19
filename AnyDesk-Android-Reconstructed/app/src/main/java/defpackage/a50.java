package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a50 implements o50 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ gn0 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a50(an0 an0Var, gn0 gn0Var, b50 b50Var, c40 c40Var) {
        this.d = gn0Var;
        this.e = c40Var;
    }

    @Override // defpackage.o50
    public final Object a() {
        switch (this.c) {
            case 0:
                gn0 gn0Var = this.d;
                c40 c40Var = (c40) this.e;
                for (an0 an0Var : (Iterable) gn0Var.f.c.getValue()) {
                    if (b50.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + an0Var + " due to fragment " + c40Var + " viewmodel being cleared");
                    }
                    gn0Var.c(an0Var);
                }
                return uc1.a;
            default:
                gn0 gn0Var2 = this.d;
                an0 an0Var2 = (an0) this.e;
                synchronized (gn0Var2.a) {
                    try {
                        e71 e71Var = gn0Var2.b;
                        Iterable iterable = (Iterable) e71Var.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (y90.e((an0) obj, an0Var2)) {
                                e71Var.j(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        e71Var.j(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return uc1.a;
        }
    }

    public /* synthetic */ a50(gn0 gn0Var, an0 an0Var, boolean z) {
        this.d = gn0Var;
        this.e = an0Var;
    }
}
