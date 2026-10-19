package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge1 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static gh1 b(View view, gh1 gh1Var, Rect rect) {
        WindowInsets windowInsetsF = gh1Var.f();
        if (windowInsetsF != null) {
            return gh1.g(view.computeSystemWindowInsets(windowInsetsF, rect), view);
        }
        rect.setEmpty();
        return gh1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static gh1 f(View view) {
        vg1 rg1Var;
        if (og1.d && view.isAttachedToWindow()) {
            try {
                Object obj = og1.a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) og1.b.get(obj);
                    Rect rect2 = (Rect) og1.c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 34) {
                            rg1Var = new ug1();
                        } else if (i >= 31) {
                            rg1Var = new tg1();
                        } else if (i >= 30) {
                            rg1Var = new sg1();
                        } else {
                            rg1Var = i >= 29 ? new rg1() : new pg1();
                        }
                        rg1Var.c(s90.a(rect.left, rect.top, rect.right, rect.bottom));
                        rg1Var.d(s90.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        gh1 gh1VarB = rg1Var.b();
                        gh1VarB.a.q(gh1VarB);
                        gh1VarB.a.d(view.getRootView());
                        return gh1VarB;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    public static String g(View view) {
        return view.getTransitionName();
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f) {
        view.setElevation(f);
    }

    public static void k(View view, nq0 nq0Var) {
        fe1 fe1Var = nq0Var != null ? new fe1(view, nq0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, fe1Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (fe1Var != null) {
            view.setOnApplyWindowInsetsListener(fe1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void l(View view) {
        view.stopNestedScroll();
    }
}
