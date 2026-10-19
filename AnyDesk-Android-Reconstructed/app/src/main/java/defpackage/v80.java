package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class v80 implements ef0 {
    public static final g81 d = new g81(o6.g);
    public final qa c;

    public v80(qa qaVar) {
        this.c = qaVar;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        if (ze0Var != ze0.ON_DESTROY) {
            return;
        }
        Object systemService = this.c.getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        s80 s80Var = (s80) d.getValue();
        Object objB = s80Var.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = s80Var.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = s80Var.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
