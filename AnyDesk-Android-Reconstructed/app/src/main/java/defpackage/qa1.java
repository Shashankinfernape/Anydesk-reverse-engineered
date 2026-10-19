package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class qa1 implements oa1, pk0 {
    public final /* synthetic */ ra1 c;

    @Override // defpackage.pk0
    public boolean f(rk0 rk0Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.pk0
    public void o(rk0 rk0Var) {
        ra1 ra1Var = this.c;
        boolean zP = ra1Var.j.a.p();
        Window.Callback callback = ra1Var.k;
        if (zP) {
            callback.onPanelClosed(108, rk0Var);
        } else if (callback.onPreparePanel(0, null, rk0Var)) {
            callback.onMenuOpened(108, rk0Var);
        }
    }
}
