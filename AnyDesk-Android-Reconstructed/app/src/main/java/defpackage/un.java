package defpackage;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class un implements ef0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ un(y6 y6Var, jl0 jl0Var) {
        this.c = 2;
        this.d = y6Var;
        this.e = jl0Var;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        int i = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                wq0 wq0Var = (wq0) obj2;
                qa qaVar = (qa) obj;
                if (ze0Var == ze0.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = vn.a.a(qaVar);
                    onBackInvokedDispatcherA.getClass();
                    wq0Var.e = onBackInvokedDispatcherA;
                    wq0Var.d(wq0Var.g);
                }
                break;
            case 1:
                b50 b50Var = (b50) obj2;
                an0 an0Var = (an0) obj;
                if (ze0Var == ze0.ON_RESUME && ((List) b50Var.b().e.c.getValue()).contains(an0Var)) {
                    if (b50.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + an0Var + " due to fragment " + gf0Var + " view lifecycle reaching RESUMED");
                    }
                    b50Var.b().c(an0Var);
                }
                if (ze0Var == ze0.ON_DESTROY) {
                    if (b50.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + an0Var + " due to fragment " + gf0Var + " view lifecycle reaching DESTROYED");
                    }
                    b50Var.b().c(an0Var);
                }
                break;
            default:
                y6 y6Var = (y6) obj2;
                jl0 jl0Var = (jl0) obj;
                y6Var.getClass();
                Runnable runnable = (Runnable) y6Var.d;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) y6Var.e;
                ze0.Companion.getClass();
                if (ze0Var == ze0.ON_START) {
                    copyOnWriteArrayList.add(jl0Var);
                    runnable.run();
                } else if (ze0Var == ze0.ON_DESTROY) {
                    y6Var.H(jl0Var);
                } else if (ze0Var == ze0.ON_STOP) {
                    copyOnWriteArrayList.remove(jl0Var);
                    runnable.run();
                }
                break;
        }
    }

    public /* synthetic */ un(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }
}
