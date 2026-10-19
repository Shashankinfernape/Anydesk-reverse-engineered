package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class x8 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final qy b = new qy();
    public static final qy c = new qy(qy.c);
    public static final qy d = new qy(qy.e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
