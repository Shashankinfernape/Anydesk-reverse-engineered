package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class wg1 extends dh1 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public s90[] d;
    public s90 e;
    public gh1 f;
    public s90 g;
    public int h;

    public wg1(gh1 gh1Var, WindowInsets windowInsets) {
        super(gh1Var);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean A(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private s90 t(int i2, boolean z) {
        s90 s90VarA = s90.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                s90 s90VarU = u(i3, z);
                s90VarA = s90.a(Math.max(s90VarA.a, s90VarU.a), Math.max(s90VarA.b, s90VarU.b), Math.max(s90VarA.c, s90VarU.c), Math.max(s90VarA.d, s90VarU.d));
            }
        }
        return s90VarA;
    }

    private s90 v() {
        gh1 gh1Var = this.f;
        return gh1Var != null ? gh1Var.a.h() : s90.e;
    }

    private s90 w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            id.m("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            y();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return s90.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void y() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    @Override // defpackage.dh1
    public void d(View view) {
        s90 s90VarW = w(view);
        if (s90VarW == null) {
            s90VarW = s90.e;
        }
        z(s90VarW);
    }

    @Override // defpackage.dh1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        wg1 wg1Var = (wg1) obj;
        return Objects.equals(this.g, wg1Var.g) && A(this.h, wg1Var.h);
    }

    @Override // defpackage.dh1
    public s90 f(int i2) {
        return t(i2, false);
    }

    @Override // defpackage.dh1
    public final s90 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = s90.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.dh1
    public gh1 l(int i2, int i3, int i4, int i5) {
        vg1 rg1Var;
        gh1 gh1VarG = gh1.g(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            rg1Var = new ug1(gh1VarG);
        } else if (i6 >= 31) {
            rg1Var = new tg1(gh1VarG);
        } else if (i6 >= 30) {
            rg1Var = new sg1(gh1VarG);
        } else {
            rg1Var = i6 >= 29 ? new rg1(gh1VarG) : new pg1(gh1VarG);
        }
        rg1Var.d(gh1.e(j(), i2, i3, i4, i5));
        rg1Var.c(gh1.e(h(), i2, i3, i4, i5));
        return rg1Var.b();
    }

    @Override // defpackage.dh1
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.dh1
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !x(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dh1
    public void p(s90[] s90VarArr) {
        this.d = s90VarArr;
    }

    @Override // defpackage.dh1
    public void q(gh1 gh1Var) {
        this.f = gh1Var;
    }

    @Override // defpackage.dh1
    public void s(int i2) {
        this.h = i2;
    }

    public s90 u(int i2, boolean z) {
        s90 s90VarH;
        int i3;
        s90 s90Var = s90.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    s90[] s90VarArr = this.d;
                    s90VarH = s90VarArr != null ? s90VarArr[3] : null;
                    if (s90VarH != null) {
                        return s90VarH;
                    }
                    s90 s90VarJ = j();
                    s90 s90VarV = v();
                    int i4 = s90VarJ.d;
                    if (i4 > s90VarV.d) {
                        return s90.a(0, 0, 0, i4);
                    }
                    s90 s90Var2 = this.g;
                    if (s90Var2 != null && !s90Var2.equals(s90Var) && (i3 = this.g.d) > s90VarV.d) {
                        return s90.a(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return i();
                    }
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 == 128) {
                        gh1 gh1Var = this.f;
                        tu tuVarE = gh1Var != null ? gh1Var.a.e() : e();
                        if (tuVarE != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return s90.a(i5 >= 28 ? d6.n(tuVarE.a) : 0, i5 >= 28 ? d6.p(tuVarE.a) : 0, i5 >= 28 ? d6.o(tuVarE.a) : 0, i5 >= 28 ? d6.m(tuVarE.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    s90 s90VarV2 = v();
                    s90 s90VarH2 = h();
                    return s90.a(Math.max(s90VarV2.a, s90VarH2.a), 0, Math.max(s90VarV2.c, s90VarH2.c), Math.max(s90VarV2.d, s90VarH2.d));
                }
                if ((this.h & 2) == 0) {
                    s90 s90VarJ2 = j();
                    gh1 gh1Var2 = this.f;
                    s90VarH = gh1Var2 != null ? gh1Var2.a.h() : null;
                    int iMin = s90VarJ2.d;
                    if (s90VarH != null) {
                        iMin = Math.min(iMin, s90VarH.d);
                    }
                    return s90.a(s90VarJ2.a, 0, s90VarJ2.c, iMin);
                }
            }
        } else {
            if (z) {
                return s90.a(0, Math.max(v().b, j().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return s90.a(0, j().b, 0, 0);
            }
        }
        return s90Var;
    }

    public boolean x(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !u(i2, false).equals(s90.e);
    }

    public void z(s90 s90Var) {
        this.g = s90Var;
    }
}
