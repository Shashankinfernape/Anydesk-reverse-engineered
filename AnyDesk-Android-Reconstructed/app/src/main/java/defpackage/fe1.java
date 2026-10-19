package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fe1 implements View.OnApplyWindowInsetsListener {
    public gh1 c = null;
    public final /* synthetic */ View d;
    public final /* synthetic */ nq0 e;

    public fe1(View view, nq0 nq0Var) {
        this.d = view;
        this.e = nq0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        gh1 gh1VarG = gh1.g(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        nq0 nq0Var = this.e;
        if (i < 30) {
            ge1.a(windowInsets, this.d);
            if (gh1VarG.equals(this.c)) {
                return nq0Var.l(view, gh1VarG).f();
            }
        }
        this.c = gh1VarG;
        gh1 gh1VarL = nq0Var.l(view, gh1VarG);
        if (i >= 30) {
            return gh1VarL.f();
        }
        WeakHashMap weakHashMap = oe1.a;
        ee1.c(view);
        return gh1VarL.f();
    }
}
