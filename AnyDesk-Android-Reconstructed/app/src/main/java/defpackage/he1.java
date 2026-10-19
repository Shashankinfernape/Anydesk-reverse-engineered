package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class he1 {
    public static gh1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        gh1 gh1VarG = gh1.g(rootWindowInsets, null);
        dh1 dh1Var = gh1VarG.a;
        dh1Var.q(gh1VarG);
        dh1Var.d(view.getRootView());
        return gh1VarG;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
