package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class k50 {
    public static final j50 a = j50.a;

    public static j50 a(c40 c40Var) {
        while (c40Var != null) {
            if (c40Var.k0()) {
                c40Var.e0();
            }
            c40Var = c40Var.x;
        }
        return a;
    }

    public static void b(g50 g50Var) {
        if (t40.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(g50Var.c.getClass().getName()), g50Var);
        }
    }

    public static final void c(c40 c40Var, String str) {
        c40Var.getClass();
        str.getClass();
        b(new g50(c40Var, "Attempting to reuse fragment " + c40Var + " with previous ID " + str));
        a(c40Var).getClass();
    }
}
