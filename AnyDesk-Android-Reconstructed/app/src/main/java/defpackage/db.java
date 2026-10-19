package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.anydesk.anydeskandroid.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class db implements nq0, gq, hl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ qb d;

    public /* synthetic */ db(qb qbVar, int i) {
        this.c = i;
        this.d = qbVar;
    }

    @Override // defpackage.hl0
    public void a(rk0 rk0Var, boolean z) {
        pb pbVar;
        int i = this.c;
        qb qbVar = this.d;
        switch (i) {
            case 2:
                qbVar.r(rk0Var);
                break;
            default:
                rk0 rk0VarK = rk0Var.k();
                int i2 = 0;
                boolean z2 = rk0VarK != rk0Var;
                if (z2) {
                    rk0Var = rk0VarK;
                }
                pb[] pbVarArr = qbVar.M;
                int length = pbVarArr != null ? pbVarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        pbVar = null;
                    } else {
                        pbVar = pbVarArr[i2];
                        if (pbVar == null || pbVar.h != rk0Var) {
                            i2++;
                        }
                    }
                }
                if (pbVar != null) {
                    if (!z2) {
                        qbVar.s(pbVar, z);
                    } else {
                        qbVar.q(pbVar.a, pbVar, rk0VarK);
                        qbVar.s(pbVar, true);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0168  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.nq0
    public gh1 l(View view, gh1 gh1Var) {
        int i;
        boolean z;
        gh1 gh1VarB;
        vg1 rg1Var;
        boolean z2;
        Rect rect;
        int i2;
        int i3;
        int i4;
        ViewGroup viewGroup;
        gh1 gh1VarF;
        int iB;
        int iC;
        boolean z3;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        View view3;
        boolean z4;
        View view4;
        int iL;
        int iD = gh1Var.d();
        qb qbVar = this.d;
        Context context = qbVar.m;
        int iD2 = gh1Var.d();
        ActionBarContextView actionBarContextView = qbVar.w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) qbVar.w.getLayoutParams();
            if (qbVar.w.isShown()) {
                if (qbVar.d0 == null) {
                    qbVar.d0 = new Rect();
                    qbVar.e0 = new Rect();
                }
                Rect rect2 = qbVar.d0;
                Rect rect3 = qbVar.e0;
                rect2.set(gh1Var.b(), gh1Var.d(), gh1Var.c(), gh1Var.a());
                ViewGroup viewGroup2 = qbVar.B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = kf1.a;
                    if1.a(viewGroup2, rect2, rect3);
                } else {
                    if (kf1.a) {
                        rect = rect3;
                    } else {
                        kf1.a = true;
                        rect = rect3;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            kf1.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                kf1.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = kf1.b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[0] = rect2;
                            try {
                                objArr[1] = rect;
                                method.invoke(viewGroup2, objArr);
                            } catch (Exception e) {
                                e = e;
                                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                    i2 = rect2.top;
                    i3 = rect2.left;
                    i4 = rect2.right;
                    viewGroup = qbVar.B;
                    WeakHashMap weakHashMap = oe1.a;
                    if (Build.VERSION.SDK_INT >= 23) {
                        gh1VarF = he1.a(viewGroup);
                    } else {
                        gh1VarF = ge1.f(viewGroup);
                    }
                    if (gh1VarF == null) {
                        iB = 0;
                    } else {
                        iB = gh1VarF.b();
                    }
                    if (gh1VarF == null) {
                        iC = 0;
                    } else {
                        iC = gh1VarF.c();
                    }
                    if (marginLayoutParams2.topMargin != i2 && marginLayoutParams2.leftMargin == i3 && marginLayoutParams2.rightMargin == i4) {
                        z3 = false;
                    } else {
                        marginLayoutParams2.topMargin = i2;
                        marginLayoutParams2.leftMargin = i3;
                        marginLayoutParams2.rightMargin = i4;
                        z3 = true;
                    }
                    if (i2 > 0 || qbVar.D != null) {
                        i = 8;
                        view2 = qbVar.D;
                        if (view2 != null) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            i5 = marginLayoutParams.height;
                            i6 = marginLayoutParams2.topMargin;
                            if (i5 == i6 || marginLayoutParams.leftMargin != iB || marginLayoutParams.rightMargin != iC) {
                                marginLayoutParams.height = i6;
                                marginLayoutParams.leftMargin = iB;
                                marginLayoutParams.rightMargin = iC;
                                qbVar.D.setLayoutParams(marginLayoutParams);
                            }
                        }
                    } else {
                        View view5 = new View(context);
                        qbVar.D = view5;
                        i = 8;
                        view5.setVisibility(8);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                        layoutParams.leftMargin = iB;
                        layoutParams.rightMargin = iC;
                        qbVar.B.addView(qbVar.D, -1, layoutParams);
                    }
                    view3 = qbVar.D;
                    if (view3 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && view3.getVisibility() != 0) {
                        view4 = qbVar.D;
                        if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                            iL = uj.l(context, R.color.abc_decor_view_status_guard_light);
                        } else {
                            iL = uj.l(context, R.color.abc_decor_view_status_guard);
                        }
                        view4.setBackgroundColor(iL);
                    }
                    if (!qbVar.I && z4) {
                        iD2 = 0;
                    }
                    z2 = z3;
                    z = z4;
                }
                i2 = rect2.top;
                i3 = rect2.left;
                i4 = rect2.right;
                viewGroup = qbVar.B;
                WeakHashMap weakHashMap2 = oe1.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    gh1VarF = he1.a(viewGroup);
                } else {
                    gh1VarF = ge1.f(viewGroup);
                }
                if (gh1VarF == null) {
                    iB = 0;
                } else {
                    iB = gh1VarF.b();
                }
                if (gh1VarF == null) {
                    iC = 0;
                } else {
                    iC = gh1VarF.c();
                }
                if (marginLayoutParams2.topMargin != i2) {
                    marginLayoutParams2.topMargin = i2;
                    marginLayoutParams2.leftMargin = i3;
                    marginLayoutParams2.rightMargin = i4;
                    z3 = true;
                } else {
                    marginLayoutParams2.topMargin = i2;
                    marginLayoutParams2.leftMargin = i3;
                    marginLayoutParams2.rightMargin = i4;
                    z3 = true;
                }
                if (i2 > 0) {
                    i = 8;
                    view2 = qbVar.D;
                    if (view2 != null) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        i5 = marginLayoutParams.height;
                        i6 = marginLayoutParams2.topMargin;
                        if (i5 == i6) {
                            marginLayoutParams.height = i6;
                            marginLayoutParams.leftMargin = iB;
                            marginLayoutParams.rightMargin = iC;
                            qbVar.D.setLayoutParams(marginLayoutParams);
                        } else {
                            marginLayoutParams.height = i6;
                            marginLayoutParams.leftMargin = iB;
                            marginLayoutParams.rightMargin = iC;
                            qbVar.D.setLayoutParams(marginLayoutParams);
                        }
                    }
                } else {
                    i = 8;
                    view2 = qbVar.D;
                    if (view2 != null) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        i5 = marginLayoutParams.height;
                        i6 = marginLayoutParams2.topMargin;
                        if (i5 == i6) {
                            marginLayoutParams.height = i6;
                            marginLayoutParams.leftMargin = iB;
                            marginLayoutParams.rightMargin = iC;
                            qbVar.D.setLayoutParams(marginLayoutParams);
                        } else {
                            marginLayoutParams.height = i6;
                            marginLayoutParams.leftMargin = iB;
                            marginLayoutParams.rightMargin = iC;
                            qbVar.D.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
                view3 = qbVar.D;
                if (view3 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    view4 = qbVar.D;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        iL = uj.l(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        iL = uj.l(context, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(iL);
                }
                if (!qbVar.I) {
                    iD2 = 0;
                }
                z2 = z3;
                z = z4;
            } else {
                i = 8;
                z2 = true;
                if (marginLayoutParams2.topMargin != 0) {
                    marginLayoutParams2.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                qbVar.w.setLayoutParams(marginLayoutParams2);
            }
        }
        View view6 = qbVar.D;
        if (view6 != null) {
            if (z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (iD != iD2) {
            int iB2 = gh1Var.b();
            int iC2 = gh1Var.c();
            int iA = gh1Var.a();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                rg1Var = new ug1(gh1Var);
            } else if (i7 >= 31) {
                rg1Var = new tg1(gh1Var);
            } else if (i7 >= 30) {
                rg1Var = new sg1(gh1Var);
            } else {
                rg1Var = i7 >= 29 ? new rg1(gh1Var) : new pg1(gh1Var);
            }
            rg1Var.d(s90.a(iB2, iD2, iC2, iA));
            gh1VarB = rg1Var.b();
        } else {
            gh1VarB = gh1Var;
        }
        WeakHashMap weakHashMap3 = oe1.a;
        WindowInsets windowInsetsF = gh1VarB.f();
        if (windowInsetsF == null) {
            return gh1VarB;
        }
        WindowInsets windowInsetsB = ee1.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? gh1.g(windowInsetsB, view) : gh1VarB;
    }

    @Override // defpackage.hl0
    public boolean v(rk0 rk0Var) {
        Window.Callback callback;
        int i = this.c;
        qb qbVar = this.d;
        switch (i) {
            case 2:
                Window.Callback callback2 = qbVar.n.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, rk0Var);
                }
                break;
            default:
                if (rk0Var == rk0Var.k() && qbVar.G && (callback = qbVar.n.getCallback()) != null && !qbVar.R) {
                    callback.onMenuOpened(108, rk0Var);
                }
                break;
        }
        return true;
    }
}
