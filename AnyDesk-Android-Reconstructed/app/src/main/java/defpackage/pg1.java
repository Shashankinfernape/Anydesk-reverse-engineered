package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 extends vg1 {
    public static Field c = null;
    public static boolean d = false;
    public static Constructor e = null;
    public static boolean f = false;
    public WindowInsets a;
    public s90 b;

    public pg1() {
        this.a = e();
    }

    private static WindowInsets e() {
        if (!d) {
            try {
                c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f) {
            try {
                e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f = true;
        }
        Constructor constructor = e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.vg1
    public gh1 b() {
        a();
        gh1 gh1VarG = gh1.g(this.a, null);
        dh1 dh1Var = gh1VarG.a;
        dh1Var.p(null);
        dh1Var.r(this.b);
        return gh1VarG;
    }

    @Override // defpackage.vg1
    public void c(s90 s90Var) {
        this.b = s90Var;
    }

    @Override // defpackage.vg1
    public void d(s90 s90Var) {
        WindowInsets windowInsets = this.a;
        if (windowInsets != null) {
            this.a = windowInsets.replaceSystemWindowInsets(s90Var.a, s90Var.b, s90Var.c, s90Var.d);
        }
    }

    public pg1(gh1 gh1Var) {
        super(gh1Var);
        this.a = gh1Var.f();
    }
}
