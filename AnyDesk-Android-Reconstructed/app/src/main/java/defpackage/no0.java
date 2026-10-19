package defpackage;

import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class no0 extends rk0 {
    @Override // defpackage.rk0, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        vk0 vk0VarA = a(i, i2, i3, charSequence);
        zo0 zo0Var = new zo0(this.a, this, vk0VarA);
        vk0VarA.o = zo0Var;
        zo0Var.setHeaderTitle(vk0VarA.e);
        return zo0Var;
    }
}
