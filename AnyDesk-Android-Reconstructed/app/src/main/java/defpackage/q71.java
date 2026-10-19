package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class q71 extends rk0 implements SubMenu {
    public final vk0 A;
    public final rk0 z;

    public q71(Context context, rk0 rk0Var, vk0 vk0Var) {
        super(context);
        this.z = rk0Var;
        this.A = vk0Var;
    }

    @Override // defpackage.rk0
    public final boolean d(vk0 vk0Var) {
        return this.z.d(vk0Var);
    }

    @Override // defpackage.rk0
    public final boolean e(rk0 rk0Var, MenuItem menuItem) {
        return super.e(rk0Var, menuItem) || this.z.e(rk0Var, menuItem);
    }

    @Override // defpackage.rk0
    public final boolean f(vk0 vk0Var) {
        return this.z.f(vk0Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.rk0
    public final String j() {
        vk0 vk0Var = this.A;
        int i = vk0Var != null ? vk0Var.a : 0;
        if (i == 0) {
            return null;
        }
        return gr0.e(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.rk0
    public final rk0 k() {
        return this.z.k();
    }

    @Override // defpackage.rk0
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.rk0
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.rk0
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.rk0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.rk0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
