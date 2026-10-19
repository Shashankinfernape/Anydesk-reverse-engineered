package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Trace;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ld {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        if (intrinsicWidth == -1) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight == -1) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (intrinsicWidth > drawable.getIntrinsicWidth() || intrinsicHeight > drawable.getIntrinsicHeight()) {
            float f = intrinsicWidth / intrinsicHeight;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                intrinsicHeight = (int) (intrinsicWidth2 / f);
                intrinsicWidth = intrinsicWidth2;
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (f * intrinsicHeight);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable, drawable2});
        int iMax = Math.max((drawable.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
        int iMax2 = Math.max((drawable.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
        layerDrawable2.setLayerInset(1, iMax, iMax2, iMax, iMax2);
        return layerDrawable2;
    }

    public static ColorFilter b(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z = Build.VERSION.SDK_INT < 23;
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = uj.K(drawable).mutate();
        if (mode != null) {
            drawableMutate.setTintMode(mode);
        }
        return drawableMutate;
    }

    public static ColorStateList d(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static String e(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager f(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static boolean g() {
        return Trace.isEnabled();
    }

    public static Object h() {
        switch (q51.r(10)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return BlendMode.SCREEN;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return BlendMode.OVERLAY;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return BlendMode.DARKEN;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return BlendMode.LIGHTEN;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return BlendMode.COLOR_DODGE;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return BlendMode.COLOR_BURN;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets i(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void j(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void k(Activity activity, cv0.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void l(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void m(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void n(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void o(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void p(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            zu.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                yu.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            yu.a(outline, path);
        }
    }
}
