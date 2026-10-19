package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.anydesk.jnilib.Logging;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class er0 {
    public static WindowManager b;
    public static final Method c;
    public static final boolean d;
    public static y6 e;
    public static final Logging a = new Logging("Oracle");
    public static boolean f = false;
    public static boolean g = false;

    static {
        Method method;
        try {
            method = Display.class.getMethod("getRealSize", Point.class);
        } catch (Throwable th) {
            a.h("cannot find method for getRealSize: " + th.getMessage());
            method = null;
        }
        c = method;
        d = e("samsung");
        if (e("samsung")) {
            String str = Build.DEVICE;
            for (dr0 dr0Var : dr0.values()) {
                for (String str2 : dr0Var.c) {
                    if (str2.equals(str)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Point a() {
        Method method;
        if (Build.VERSION.SDK_INT >= 30) {
            Point point = new Point();
            Rect bounds = b.getMaximumWindowMetrics().getBounds();
            point.x = bounds.width();
            point.y = bounds.height();
            return point;
        }
        Point point2 = new Point();
        Display defaultDisplay = b.getDefaultDisplay();
        y6 y6Var = e;
        Logging logging = (Logging) y6Var.d;
        if (((y6) y6Var.f) == null) {
            IInterface iInterface = null;
            try {
                iInterface = (IInterface) Class.forName("android.hardware.display.IDisplayManager$Stub").getMethod("asInterface", IBinder.class).invoke(null, (IBinder) ((Method) y6Var.e).invoke(null, "display"));
            } catch (Throwable unused) {
                logging.h("cannot get service display");
            }
            if (iInterface != null) {
                y6Var.f = new y6(logging, iInterface);
            }
        }
        y6 y6Var2 = (y6) y6Var.f;
        if (y6Var2 != null) {
            try {
                Object objInvoke = ((Method) y6Var2.f).invoke((IInterface) y6Var2.e, 0);
                Class<?> cls = objInvoke.getClass();
                int i = cls.getDeclaredField("logicalWidth").getInt(objInvoke);
                int i2 = cls.getDeclaredField("logicalHeight").getInt(objInvoke);
                point2.x = i;
                point2.y = i2;
            } catch (Exception e2) {
                ((Logging) y6Var2.d).i("cannot init getDisplayInfo: " + e2.getMessage(), e2);
                method = c;
                if (method != null) {
                    try {
                        method.invoke(defaultDisplay, point2);
                    } catch (Throwable th) {
                        a.h("cannot get real display size: " + th.getMessage());
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        point2.x = displayMetrics.widthPixels;
                        point2.y = displayMetrics.heightPixels;
                    }
                } else {
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics2);
                    point2.x = displayMetrics2.widthPixels;
                    point2.y = displayMetrics2.heightPixels;
                }
            }
        } else {
            method = c;
            if (method != null) {
                method.invoke(defaultDisplay, point2);
            } else {
                DisplayMetrics displayMetrics3 = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics3);
                point2.x = displayMetrics3.widthPixels;
                point2.y = displayMetrics3.heightPixels;
            }
        }
        return point2;
    }

    public static int b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Resources.getSystem().getConfiguration().densityDpi;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        b.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static float c() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Resources.getSystem().getConfiguration().densityDpi;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        b.getDefaultDisplay().getMetrics(displayMetrics);
        float f2 = displayMetrics.xdpi;
        return displayMetrics.densityDpi * (f2 / ((displayMetrics.ydpi + f2) / 2.0f));
    }

    public static float d() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Resources.getSystem().getConfiguration().densityDpi;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        b.getDefaultDisplay().getMetrics(displayMetrics);
        float f2 = displayMetrics.xdpi;
        float f3 = displayMetrics.ydpi;
        return displayMetrics.densityDpi * (f3 / ((f2 + f3) / 2.0f));
    }

    public static boolean e(String str) {
        String str2;
        String str3 = Build.MANUFACTURER;
        if (str == str3) {
            return true;
        }
        if ((str3 != null && str.equals(str3.toLowerCase())) || str == (str2 = Build.BRAND)) {
            return true;
        }
        return str2 != null && str.equals(str2.toLowerCase());
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
