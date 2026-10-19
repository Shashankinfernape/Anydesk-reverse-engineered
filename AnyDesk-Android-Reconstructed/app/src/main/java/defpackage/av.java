package defpackage;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class av {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = a;
        int[] iArr2 = b;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }

    public static PorterDuff.Mode b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
