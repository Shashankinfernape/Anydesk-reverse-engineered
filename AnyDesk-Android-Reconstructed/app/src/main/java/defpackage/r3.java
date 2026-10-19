package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class r3 {
    public static void A(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public static void B(Checkable checkable, boolean z) {
        if (checkable != null) {
            checkable.setChecked(z);
        }
    }

    public static void C(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    public static void D(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public static void E(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void F(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static void G(TextView textView, int i) {
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public static void H(View view, String str) {
        if (view != null) {
            bu0.D(view, str);
        }
    }

    public static void I(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void J(vf vfVar, int i) {
        if (vfVar == null || i < 0) {
            return;
        }
        if (i == 0) {
            vfVar.n(false);
        } else {
            vfVar.n(true);
            vfVar.l(i);
        }
    }

    public static ty a(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        Resources resources = context.getResources();
        Looper looper = t70.a;
        return new ty(recyclerView, (StateListDrawable) context.getDrawable(R.drawable.scrollbar_thumb), context.getDrawable(R.drawable.scrollbar_line), (StateListDrawable) context.getDrawable(R.drawable.scrollbar_thumb), context.getDrawable(R.drawable.scrollbar_line), resources.getDimensionPixelSize(R.dimen.scrollbar_min_thickness), resources.getDimensionPixelSize(R.dimen.scrollbar_min_scroll_range), resources.getDimensionPixelSize(R.dimen.scrollbar_min_thumb_size));
    }

    public static boolean b(Collection collection) {
        return (collection == null || collection.isEmpty() || collection.contains(Boolean.FALSE)) ? false : true;
    }

    public static boolean c(Context context, String[] strArr) {
        for (String str : strArr) {
            if (uj.d(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Context context) {
        return Build.VERSION.SDK_INT < 30 ? c(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}) : Environment.isExternalStorageManager();
    }

    public static void e(ImageView imageView) {
        if (imageView != null) {
            imageView.clearColorFilter();
        }
    }

    public static Icon f(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void g(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            View decorView = window.getDecorView();
            if (z) {
                window.addFlags(1536);
                window.clearFlags(2048);
                decorView.setSystemUiVisibility(5895);
                return;
            } else {
                window.clearFlags(1536);
                window.addFlags(2048);
                decorView.setSystemUiVisibility((i < 23 || !window.getContext().getResources().getBoolean(R.bool.is_windowLightStatusBar)) ? 256 : 8448);
                return;
            }
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if (!t70.I()) {
            window.setDecorFitsSystemWindows(!z);
        }
        if (!z) {
            insetsController.show(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        } else {
            insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
            insetsController.setSystemBarsBehavior(2);
        }
    }

    public static Rect h(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static boolean j(qa qaVar) {
        return t70.K() && !c(qaVar, nd0.e);
    }

    public static void k(c40 c40Var, bc bcVar, w30 w30Var, int i) {
        qa qaVarG0 = c40Var.G0();
        String[] strArr = nd0.e;
        if (!uj.F(qaVarG0, strArr[0])) {
            m(c40Var, strArr, w30Var);
        } else if (bcVar != null) {
            bcVar.p0(z31.V0(a41.h, i), "SetupInfoDialog", true);
        }
    }

    public static boolean l(qa qaVar, String[] strArr, k6 k6Var) {
        if (c(qaVar, strArr)) {
            return true;
        }
        k6Var.a(strArr);
        return false;
    }

    public static boolean m(c40 c40Var, String[] strArr, k6 k6Var) {
        if (c(c40Var.a0(), strArr)) {
            return true;
        }
        k6Var.a(strArr);
        return false;
    }

    public static boolean n(qa qaVar, k6 k6Var, Logging logging) {
        boolean zL;
        if (Build.VERSION.SDK_INT < 30) {
            zL = l(qaVar, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, k6Var);
        } else if (d(qaVar)) {
            zL = true;
        } else {
            Looper looper = t70.a;
            if (!t70.S(qaVar, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION", qaVar.getPackageName(), logging)) {
                t70.g0(qaVar, JniAdExt.n1("ad.msg.all_files.permission.android"), 1);
                t70.T(qaVar, logging, new Intent("android.settings.SETTINGS").addFlags(268435456));
            }
            zL = false;
        }
        if (zL) {
            JniAdExt.M4();
        }
        return zL;
    }

    public static boolean o(c40 c40Var, k6 k6Var, Logging logging) {
        boolean zM;
        if (Build.VERSION.SDK_INT < 30) {
            zM = m(c40Var, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, k6Var);
        } else {
            Context contextI0 = c40Var.I0();
            if (d(contextI0)) {
                zM = true;
            } else {
                Looper looper = t70.a;
                if (!t70.S(contextI0, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION", contextI0.getPackageName(), logging)) {
                    t70.g0(contextI0, JniAdExt.n1("ad.msg.all_files.permission.android"), 1);
                    t70.T(contextI0, logging, new Intent("android.settings.SETTINGS").addFlags(268435456));
                }
                zM = false;
            }
        }
        if (zM) {
            JniAdExt.M4();
        }
        return zM;
    }

    public static void p(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    public static void q(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static void r(View view, View view2) {
        view.setOnFocusChangeListener(new a9(1, view2));
    }

    public static void s(TextView textView, String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!z) {
            Looper looper = t70.a;
            sb.append(" (");
            sb.append(JniAdExt.n1("ad.menu.unsupported"));
            sb.append(")");
        } else if (!z2) {
            Looper looper2 = t70.a;
            sb.append(" (");
            sb.append(JniAdExt.n1("ad.menu.disallowed"));
            sb.append(")");
        }
        F(textView, sb);
    }

    public static void t(Drawable drawable, int i) {
        if (drawable != null) {
            ColorFilter porterDuffColorFilter = null;
            if (Build.VERSION.SDK_INT >= 29) {
                Object objH = ld.h();
                if (objH != null) {
                    porterDuffColorFilter = ld.b(i, objH);
                }
            } else {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                if (mode != null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                }
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public static void u(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setColorFilter(i);
        }
    }

    public static void v(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void w(MenuItem menuItem, String str, int i) {
        if (menuItem == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }

    public static void x(fu0 fu0Var, boolean z) {
        if (fu0Var != null) {
            fu0Var.setPermissionGranted(z);
        }
    }

    public static void y(fu0 fu0Var, boolean z) {
        if (fu0Var != null) {
            fu0Var.setPermissionLocked(z);
        }
    }

    public static void z(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
