package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q81 implements View.OnKeyListener {
    public final /* synthetic */ t81 c;

    public q81(t81 t81Var) {
        this.c = t81Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        t81 t81Var = this.c;
        xt0 xt0Var = t81Var.h0;
        if (xt0Var == null || t81Var.S == null || !t81Var.e || !(i == 23 || i == 62 || i == 66 || i == 160)) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            t81Var.e = false;
            xt0Var.g(t81Var);
        }
        return true;
    }
}
