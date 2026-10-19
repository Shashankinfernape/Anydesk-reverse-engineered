package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ny extends qb1 {
    public static final String[] D = {"android:visibility:visibility", "android:visibility:parent"};
    public final int C;

    public ny() {
        this.C = 3;
    }

    public static void I(yb1 yb1Var) {
        View view = yb1Var.b;
        int visibility = view.getVisibility();
        HashMap map = yb1Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float K(yb1 yb1Var, float f) {
        Float f2;
        return (yb1Var == null || (f2 = (Float) yb1Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static zf1 L(yb1 yb1Var, yb1 yb1Var2) {
        zf1 zf1Var = new zf1();
        zf1Var.a = false;
        zf1Var.b = false;
        if (yb1Var != null) {
            HashMap map = yb1Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                zf1Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                zf1Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                zf1Var.c = -1;
                zf1Var.e = null;
            }
        } else {
            zf1Var.c = -1;
            zf1Var.e = null;
        }
        if (yb1Var2 != null) {
            HashMap map2 = yb1Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                zf1Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                zf1Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                zf1Var.d = -1;
                zf1Var.f = null;
            }
        } else {
            zf1Var.d = -1;
            zf1Var.f = null;
        }
        if (yb1Var != null && yb1Var2 != null) {
            int i = zf1Var.c;
            int i2 = zf1Var.d;
            if (i != i2 || zf1Var.e != zf1Var.f) {
                if (i != i2) {
                    if (i == 0) {
                        zf1Var.b = false;
                        zf1Var.a = true;
                        return zf1Var;
                    }
                    if (i2 == 0) {
                        zf1Var.b = true;
                        zf1Var.a = true;
                        return zf1Var;
                    }
                } else {
                    if (zf1Var.f == null) {
                        zf1Var.b = false;
                        zf1Var.a = true;
                        return zf1Var;
                    }
                    if (zf1Var.e == null) {
                        zf1Var.b = true;
                        zf1Var.a = true;
                        return zf1Var;
                    }
                }
            }
        } else {
            if (yb1Var == null && zf1Var.d == 0) {
                zf1Var.b = true;
                zf1Var.a = true;
                return zf1Var;
            }
            if (yb1Var2 == null && zf1Var.c == 0) {
                zf1Var.b = false;
                zf1Var.a = true;
            }
        }
        return zf1Var;
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        jf1.a.t(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, jf1.b, f2);
        my myVar = new my(view);
        objectAnimatorOfFloat.addListener(myVar);
        o().a(myVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.qb1
    public final void d(yb1 yb1Var) {
        I(yb1Var);
    }

    @Override // defpackage.qb1
    public final void g(yb1 yb1Var) {
        I(yb1Var);
        View view = yb1Var.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(jf1.a.o(view)) : Float.valueOf(0.0f);
        }
        yb1Var.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (L(n(r3, false), r(r3, false)).a != false) goto L9;
     */
    @Override // defpackage.qb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, defpackage.yb1 r25, defpackage.yb1 r26) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny.k(android.view.ViewGroup, yb1, yb1):android.animation.Animator");
    }

    @Override // defpackage.qb1
    public final String[] q() {
        return D;
    }

    @Override // defpackage.qb1
    public final boolean s(yb1 yb1Var, yb1 yb1Var2) {
        if (yb1Var == null && yb1Var2 == null) {
            return false;
        }
        if (yb1Var != null && yb1Var2 != null && yb1Var2.a.containsKey("android:visibility:visibility") != yb1Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        zf1 zf1VarL = L(yb1Var, yb1Var2);
        if (zf1VarL.a) {
            return zf1VarL.c == 0 || zf1VarL.d == 0;
        }
        return false;
    }

    public ny(int i) {
        this();
        this.C = i;
    }
}
