package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.jni.JniAdExt;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class us0 implements w70, oc1, o80, gv0, p01, j6, ar {
    public static us0 d = null;
    public static boolean e = true;
    public static Method f = null;
    public static boolean g = false;
    public static Field h = null;
    public static boolean i = false;
    public static boolean j = true;
    public static boolean k = true;
    public final /* synthetic */ int c;

    public /* synthetic */ us0(int i2) {
        this.c = i2;
    }

    public static af1 m(cf1 cf1Var, ze1 ze1Var) {
        qr qrVarT = cf1Var instanceof q70 ? ((q70) cf1Var).t() : pr.b;
        ze1Var.getClass();
        qrVarT.getClass();
        return new af1(cf1Var.K(), ze1Var, qrVarT);
    }

    public static Path n(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    @Override // defpackage.o80
    public boolean b(String str) {
        return false;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        JniAdExt.M4();
    }

    @Override // defpackage.o80
    public boolean d(String str) {
        return false;
    }

    @Override // defpackage.gv0
    public void e() {
        switch (this.c) {
            case 3:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.o80
    public boolean g(String str) {
        return false;
    }

    @Override // defpackage.o80
    public boolean h(String str) {
        return false;
    }

    @Override // defpackage.gv0
    public void i(int i2, Object obj) {
        String str;
        switch (this.c) {
            case 3:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // defpackage.o80
    public boolean j(String str) {
        return false;
    }

    @Override // defpackage.o80
    public boolean k(String str) {
        return false;
    }

    public float o(View view) {
        if (e) {
            try {
                return lf1.a(view);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    public boolean p(CharSequence charSequence) {
        return false;
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        if (!g) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e2);
            }
            g = true;
        }
        Method method = f;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public void t(View view, float f2) {
        if (e) {
            try {
                lf1.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f2);
    }

    public String toString() {
        switch (this.c) {
            case 12:
                return "SharingStarted.Eagerly";
            case 13:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public void u(View view, int i2) {
        if (!i) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            i = true;
        }
        Field field = h;
        if (field != null) {
            try {
                h.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (j) {
            try {
                mf1.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void w(ViewGroup viewGroup, Matrix matrix) {
        if (k) {
            try {
                mf1.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    @Override // defpackage.w70
    public void l(vf1 vf1Var) {
    }

    private final void q() {
    }

    @Override // defpackage.oc1
    public void a() {
    }

    @Override // defpackage.oc1
    public void f() {
    }

    private final void r(int i2, Object obj) {
    }

    @Override // defpackage.p01
    public void onScrollLimit(int i2, int i3, int i4, boolean z) {
    }

    @Override // defpackage.p01
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
