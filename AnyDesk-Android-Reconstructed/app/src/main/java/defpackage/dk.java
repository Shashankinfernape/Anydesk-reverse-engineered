package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dk extends qb1 {
    public static final String[] C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final zj D = new zj(PointF.class, "topLeft", 0);
    public static final zj E = new zj(PointF.class, "bottomRight", 1);
    public static final zj F = new zj(PointF.class, "bottomRight", 2);
    public static final zj G = new zj(PointF.class, "topLeft", 3);
    public static final zj H = new zj(PointF.class, "position", 4);

    public static void I(yb1 yb1Var) {
        View view = yb1Var.b;
        HashMap map = yb1Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.qb1
    public final void d(yb1 yb1Var) {
        I(yb1Var);
    }

    @Override // defpackage.qb1
    public final void g(yb1 yb1Var) {
        I(yb1Var);
    }

    @Override // defpackage.qb1
    public final Animator k(ViewGroup viewGroup, yb1 yb1Var, yb1 yb1Var2) {
        int i;
        dk dkVar;
        Animator animatorA;
        if (yb1Var != null) {
            HashMap map = yb1Var.a;
            if (yb1Var2 != null) {
                HashMap map2 = yb1Var2.a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = yb1Var2.b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        jf1.a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            dkVar = this;
                            if (i2 == i3 && i4 == i5) {
                                dkVar.x.getClass();
                                animatorA = lq0.a(view, F, us0.n(i6, i8, i7, i9));
                            } else {
                                dkVar.x.getClass();
                                animatorA = lq0.a(view, G, us0.n(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            dkVar = this;
                            dkVar.x.getClass();
                            animatorA = lq0.a(view, H, us0.n(i2, i4, i3, i5));
                        } else {
                            dkVar = this;
                            ck ckVar = new ck(view);
                            dkVar.x.getClass();
                            ObjectAnimator objectAnimatorA = lq0.a(ckVar, D, us0.n(i2, i4, i3, i5));
                            dkVar.x.getClass();
                            ObjectAnimator objectAnimatorA2 = lq0.a(ckVar, E, us0.n(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                            animatorSet.addListener(new ak(ckVar));
                            animatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            uj.G(viewGroup4, true);
                            dkVar.o().a(new bk(viewGroup4));
                        }
                        return animatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.qb1
    public final String[] q() {
        return C;
    }
}
