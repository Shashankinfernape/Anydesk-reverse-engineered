package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ng1 extends th1 implements l5 {
    public static final AccelerateInterpolator I = new AccelerateInterpolator();
    public static final DecelerateInterpolator J = new DecelerateInterpolator();
    public boolean A;
    public boolean B;
    public ef1 C;
    public boolean D;
    public boolean E;
    public final lg1 F;
    public final lg1 G;
    public final xt0 H;
    public Context j;
    public Context k;
    public ActionBarOverlayLayout l;
    public ActionBarContainer m;
    public es n;
    public ActionBarContextView o;
    public final View p;
    public boolean q;
    public mg1 r;
    public mg1 s;
    public bc t;
    public boolean u;
    public final ArrayList v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ng1(Activity activity, boolean z) {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.x = true;
        this.B = true;
        this.F = new lg1(this, 0);
        this.G = new lg1(this, 1);
        this.H = new xt0(24, this);
        View decorView = activity.getWindow().getDecorView();
        f0(decorView);
        if (z) {
            return;
        }
        this.p = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.th1
    public final void F() {
        h0(this.j.getResources().getBoolean(com.anydesk.anydeskandroid.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.th1
    public final boolean H(int i, KeyEvent keyEvent) {
        rk0 rk0Var;
        mg1 mg1Var = this.r;
        if (mg1Var == null || (rk0Var = mg1Var.f) == null) {
            return false;
        }
        rk0Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return rk0Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.th1
    public final void P(boolean z) {
        if (this.q) {
            return;
        }
        g0(z ? 4 : 0, 4);
    }

    @Override // defpackage.th1
    public final void Q(boolean z) {
        g0(z ? 2 : 0, 2);
    }

    @Override // defpackage.th1
    public final void R(boolean z) {
        g0(z ? 8 : 0, 8);
    }

    @Override // defpackage.th1
    public final void T(boolean z) {
        ef1 ef1Var;
        this.D = z;
        if (z || (ef1Var = this.C) == null) {
            return;
        }
        ef1Var.a();
    }

    @Override // defpackage.th1
    public final void U(CharSequence charSequence) {
        va1 va1Var = (va1) this.n;
        if (va1Var.g) {
            return;
        }
        Toolbar toolbar = va1Var.a;
        va1Var.h = charSequence;
        if ((va1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (va1Var.g) {
                oe1.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.th1
    public final void V() {
        if (this.y) {
            this.y = false;
            i0(false);
        }
    }

    @Override // defpackage.th1
    public final a6 X(bc bcVar) {
        mg1 mg1Var = this.r;
        if (mg1Var != null) {
            mg1Var.a();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.o.e();
        mg1 mg1Var2 = new mg1(this, this.o.getContext(), bcVar);
        rk0 rk0Var = mg1Var2.f;
        rk0Var.w();
        try {
            boolean zU = ((ah) mg1Var2.g.d).u(mg1Var2, rk0Var);
            rk0Var.v();
            if (!zU) {
                return null;
            }
            this.r = mg1Var2;
            mg1Var2.h();
            this.o.c(mg1Var2);
            e0(true);
            return mg1Var2;
        } catch (Throwable th) {
            rk0Var.v();
            throw th;
        }
    }

    public final void e0(boolean z) {
        df1 df1VarA;
        df1 df1VarI;
        boolean z2 = this.A;
        if (z) {
            if (!z2) {
                this.A = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.l;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                i0(false);
            }
        } else if (z2) {
            this.A = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            i0(false);
        }
        boolean zIsLaidOut = this.m.isLaidOut();
        es esVar = this.n;
        if (!zIsLaidOut) {
            if (z) {
                ((va1) esVar).a.setVisibility(4);
                this.o.setVisibility(0);
                return;
            } else {
                ((va1) esVar).a.setVisibility(0);
                this.o.setVisibility(8);
                return;
            }
        }
        if (z) {
            va1 va1Var = (va1) esVar;
            df1VarI = oe1.a(va1Var.a);
            df1VarI.a(0.0f);
            df1VarI.c(100L);
            df1VarI.d(new ua1(va1Var, 4));
            df1VarA = this.o.i(0, 200L);
        } else {
            va1 va1Var2 = (va1) esVar;
            df1VarA = oe1.a(va1Var2.a);
            df1VarA.a(1.0f);
            df1VarA.c(200L);
            df1VarA.d(new ua1(va1Var2, 0));
            df1VarI = this.o.i(8, 100L);
        }
        ef1 ef1Var = new ef1();
        ArrayList arrayList = ef1Var.a;
        arrayList.add(df1VarI);
        View view = (View) df1VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) df1VarA.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(df1VarA);
        ef1Var.b();
    }

    public final void f0(View view) {
        es wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.anydesk.anydeskandroid.R.id.decor_content_parent);
        this.l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.anydesk.anydeskandroid.R.id.action_bar);
        if (callbackFindViewById instanceof es) {
            wrapper = (es) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.n = wrapper;
        this.o = (ActionBarContextView) view.findViewById(com.anydesk.anydeskandroid.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.anydesk.anydeskandroid.R.id.action_bar_container);
        this.m = actionBarContainer;
        es esVar = this.n;
        if (esVar == null || this.o == null || actionBarContainer == null) {
            nh0.j(ng1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((va1) esVar).a.getContext();
        this.j = context;
        if ((((va1) this.n).b & 4) != 0) {
            this.q = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.n.getClass();
        h0(context.getResources().getBoolean(com.anydesk.anydeskandroid.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.j.obtainStyledAttributes(null, yv0.a, com.anydesk.anydeskandroid.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
            if (!actionBarOverlayLayout2.i) {
                nh0.j("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.E = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.m;
            WeakHashMap weakHashMap = oe1.a;
            ge1.j(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g0(int i, int i2) {
        va1 va1Var = (va1) this.n;
        int i3 = va1Var.b;
        if ((i2 & 4) != 0) {
            this.q = true;
        }
        va1Var.a((i & i2) | ((~i2) & i3));
    }

    public final void h0(boolean z) {
        if (z) {
            this.m.setTabContainer(null);
            ((va1) this.n).getClass();
        } else {
            ((va1) this.n).getClass();
            this.m.setTabContainer(null);
        }
        this.n.getClass();
        ((va1) this.n).a.setCollapsible(false);
        this.l.setHasNonEmbeddedTabs(false);
    }

    public final void i0(boolean z) {
        boolean z2 = this.A || !(this.y || this.z);
        boolean z3 = this.B;
        xt0 xt0Var = this.H;
        View view = this.p;
        if (!z2) {
            if (z3) {
                this.B = false;
                ef1 ef1Var = this.C;
                if (ef1Var != null) {
                    ef1Var.a();
                }
                int i = this.w;
                lg1 lg1Var = this.F;
                if (i != 0 || (!this.D && !z)) {
                    lg1Var.a();
                    return;
                }
                this.m.setAlpha(1.0f);
                this.m.setTransitioning(true);
                ef1 ef1Var2 = new ef1();
                float f = -this.m.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.m.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                df1 df1VarA = oe1.a(this.m);
                df1VarA.e(f);
                View view2 = (View) df1VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(xt0Var != null ? new kv(xt0Var, view2) : null);
                }
                boolean z4 = ef1Var2.e;
                ArrayList arrayList = ef1Var2.a;
                if (!z4) {
                    arrayList.add(df1VarA);
                }
                if (this.x && view != null) {
                    df1 df1VarA2 = oe1.a(view);
                    df1VarA2.e(f);
                    if (!ef1Var2.e) {
                        arrayList.add(df1VarA2);
                    }
                }
                boolean z5 = ef1Var2.e;
                if (!z5) {
                    ef1Var2.c = I;
                }
                if (!z5) {
                    ef1Var2.b = 250L;
                }
                if (!z5) {
                    ef1Var2.d = lg1Var;
                }
                this.C = ef1Var2;
                ef1Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.B = true;
        ef1 ef1Var3 = this.C;
        if (ef1Var3 != null) {
            ef1Var3.a();
        }
        this.m.setVisibility(0);
        int i2 = this.w;
        lg1 lg1Var2 = this.G;
        if (i2 == 0 && (this.D || z)) {
            this.m.setTranslationY(0.0f);
            float f2 = -this.m.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.m.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.m.setTranslationY(f2);
            ef1 ef1Var4 = new ef1();
            df1 df1VarA3 = oe1.a(this.m);
            df1VarA3.e(0.0f);
            View view3 = (View) df1VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(xt0Var != null ? new kv(xt0Var, view3) : null);
            }
            boolean z6 = ef1Var4.e;
            ArrayList arrayList2 = ef1Var4.a;
            if (!z6) {
                arrayList2.add(df1VarA3);
            }
            if (this.x && view != null) {
                view.setTranslationY(f2);
                df1 df1VarA4 = oe1.a(view);
                df1VarA4.e(0.0f);
                if (!ef1Var4.e) {
                    arrayList2.add(df1VarA4);
                }
            }
            boolean z7 = ef1Var4.e;
            if (!z7) {
                ef1Var4.c = J;
            }
            if (!z7) {
                ef1Var4.b = 250L;
            }
            if (!z7) {
                ef1Var4.d = lg1Var2;
            }
            this.C = ef1Var4;
            ef1Var4.b();
        } else {
            this.m.setAlpha(1.0f);
            this.m.setTranslationY(0.0f);
            if (this.x && view != null) {
                view.setTranslationY(0.0f);
            }
            lg1Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.l;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = oe1.a;
            ee1.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.th1
    public final boolean j() {
        ma1 ma1Var;
        es esVar = this.n;
        if (esVar == null || (ma1Var = ((va1) esVar).a.O) == null || ma1Var.d == null) {
            return false;
        }
        ma1 ma1Var2 = ((va1) esVar).a.O;
        vk0 vk0Var = ma1Var2 == null ? null : ma1Var2.d;
        if (vk0Var == null) {
            return true;
        }
        vk0Var.collapseActionView();
        return true;
    }

    @Override // defpackage.th1
    public final void o(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        ArrayList arrayList = this.v;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        id.c();
    }

    @Override // defpackage.th1
    public final int r() {
        return ((va1) this.n).b;
    }

    @Override // defpackage.th1
    public final Context u() {
        if (this.k == null) {
            TypedValue typedValue = new TypedValue();
            this.j.getTheme().resolveAttribute(com.anydesk.anydeskandroid.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.k = new ContextThemeWrapper(this.j, i);
            } else {
                this.k = this.j;
            }
        }
        return this.k;
    }

    @Override // defpackage.th1
    public final void w() {
        if (this.y) {
            return;
        }
        this.y = true;
        i0(false);
    }

    public ng1(Dialog dialog) {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.x = true;
        this.B = true;
        this.F = new lg1(this, 0);
        this.G = new lg1(this, 1);
        this.H = new xt0(24, this);
        f0(dialog.getWindow().getDecorView());
    }
}
