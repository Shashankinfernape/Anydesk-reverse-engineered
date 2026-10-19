package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class gl0 extends kg0 implements uk0 {
    public static final Method G;
    public af1 F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                G = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.kg0
    public final uv a(Context context, boolean z) {
        fl0 fl0Var = new fl0(context, z);
        fl0Var.setHoverListener(this);
        return fl0Var;
    }

    @Override // defpackage.uk0
    public final void g(rk0 rk0Var, MenuItem menuItem) {
        af1 af1Var = this.F;
        if (af1Var != null) {
            af1Var.g(rk0Var, menuItem);
        }
    }

    @Override // defpackage.uk0
    public final void j(rk0 rk0Var, vk0 vk0Var) {
        af1 af1Var = this.F;
        if (af1Var != null) {
            af1Var.j(rk0Var, vk0Var);
        }
    }
}
