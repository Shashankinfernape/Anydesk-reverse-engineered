package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 {
    public static final gh1 b;
    public final dh1 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = ch1.s;
        } else if (i >= 30) {
            b = ah1.r;
        } else {
            b = dh1.b;
        }
    }

    public gh1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new ch1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new bh1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new ah1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new zg1(this, windowInsets);
        } else if (i >= 28) {
            this.a = new yg1(this, windowInsets);
        } else {
            this.a = new xg1(this, windowInsets);
        }
    }

    public static s90 e(s90 s90Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, s90Var.a - i);
        int iMax2 = Math.max(0, s90Var.b - i2);
        int iMax3 = Math.max(0, s90Var.c - i3);
        int iMax4 = Math.max(0, s90Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? s90Var : s90.a(iMax, iMax2, iMax3, iMax4);
    }

    public static gh1 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        gh1 gh1Var = new gh1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = oe1.a;
            gh1 gh1VarA = Build.VERSION.SDK_INT >= 23 ? he1.a(view) : ge1.f(view);
            dh1 dh1Var = gh1Var.a;
            dh1Var.q(gh1VarA);
            dh1Var.d(view.getRootView());
            dh1Var.s(view.getWindowSystemUiVisibility());
        }
        return gh1Var;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gh1) {
            return Objects.equals(this.a, ((gh1) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        dh1 dh1Var = this.a;
        if (dh1Var instanceof wg1) {
            return ((wg1) dh1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        dh1 dh1Var = this.a;
        if (dh1Var == null) {
            return 0;
        }
        return dh1Var.hashCode();
    }

    public gh1() {
        this.a = new dh1(this);
    }
}
