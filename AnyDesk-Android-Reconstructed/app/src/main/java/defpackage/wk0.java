package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class wk0 implements ActionProvider.VisibilityListener {
    public ev a;
    public final ActionProvider b;

    public wk0(zk0 zk0Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ev evVar = this.a;
        if (evVar != null) {
            rk0 rk0Var = ((vk0) evVar.d).n;
            rk0Var.h = true;
            rk0Var.p(true);
        }
    }
}
