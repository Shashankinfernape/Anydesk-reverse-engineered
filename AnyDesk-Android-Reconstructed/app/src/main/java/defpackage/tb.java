package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static tb c;
    public jy0 a;

    public static synchronized tb a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return jy0.h(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            tb tbVar = new tb();
            c = tbVar;
            tbVar.a = jy0.d();
            c.a.m(new sb());
        }
    }

    public static void e(Drawable drawable, fa1 fa1Var, int[] iArr) {
        PorterDuff.Mode mode = jy0.h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = fa1Var.d;
        if (z || fa1Var.c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z ? fa1Var.a : null;
            PorterDuff.Mode mode2 = fa1Var.c ? fa1Var.b : jy0.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = jy0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
