package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class hh1 extends y90 {
    public final Window i;
    public final xt0 j;

    public hh1(Window window, xt0 xt0Var) {
        this.i = window;
        this.j = xt0Var;
    }

    @Override // defpackage.y90
    public final void D() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((8 & i) != 0) {
                if (i == 1) {
                    Z(4);
                } else if (i == 2) {
                    Z(2);
                } else if (i == 8) {
                    ((xt0) this.j.d).b();
                }
            }
        }
    }

    public final void Z(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }
}
