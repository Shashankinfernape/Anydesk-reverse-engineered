package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class jf1 {
    public static final us0 a;
    public static final zj b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new rf1(24);
        } else if (i >= 23) {
            a = new qf1(24);
        } else if (i >= 22) {
            a = new of1(24);
        } else {
            a = new us0(24);
        }
        b = new zj(Float.class, "translationAlpha", 10);
        new zj(Rect.class, "clipBounds", 11);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.s(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.u(view, i);
    }
}
