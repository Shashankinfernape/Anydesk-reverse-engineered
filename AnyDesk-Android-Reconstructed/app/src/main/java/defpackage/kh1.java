package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class kh1 extends y90 {
    public final WindowInsetsController i;
    public final xt0 j;
    public final Window k;

    public kh1(Window window, xt0 xt0Var) {
        this.i = window.getInsetsController();
        this.j = xt0Var;
        this.k = window;
    }

    @Override // defpackage.y90
    public final void D() {
        ((xt0) this.j.d).b();
        this.i.hide(0);
    }

    @Override // defpackage.y90
    public final void T() {
        Window window = this.k;
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        }
        this.i.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.y90
    public final void U() {
        Window window = this.k;
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        this.i.setSystemBarsAppearance(0, 8);
    }
}
