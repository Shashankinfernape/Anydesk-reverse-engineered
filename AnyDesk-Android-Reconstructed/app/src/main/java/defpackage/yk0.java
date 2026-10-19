package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ zk0 b;

    public yk0(zk0 zk0Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = zk0Var;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.i(menuItem));
    }
}
