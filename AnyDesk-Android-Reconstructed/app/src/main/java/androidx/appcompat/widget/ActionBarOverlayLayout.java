package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.anydesk.anydeskandroid.R;
import defpackage.dh1;
import defpackage.ec1;
import defpackage.ee1;
import defpackage.ef1;
import defpackage.es;
import defpackage.ge1;
import defpackage.gh1;
import defpackage.h0;
import defpackage.hl0;
import defpackage.k5;
import defpackage.l5;
import defpackage.lp0;
import defpackage.m5;
import defpackage.ma1;
import defpackage.mp0;
import defpackage.n5;
import defpackage.ng1;
import defpackage.nh0;
import defpackage.oe1;
import defpackage.pg1;
import defpackage.rg1;
import defpackage.rk0;
import defpackage.s90;
import defpackage.sg1;
import defpackage.tg1;
import defpackage.ug1;
import defpackage.va1;
import defpackage.vg1;
import defpackage.vl0;
import defpackage.w5;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements lp0, mp0 {
    public static final int[] E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final gh1 F;
    public static final Rect G;
    public final k5 A;
    public final k5 B;
    public final vl0 C;
    public final n5 D;
    public int c;
    public int d;
    public ContentFrameLayout e;
    public ActionBarContainer f;
    public es g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public gh1 s;
    public gh1 t;
    public gh1 u;
    public gh1 v;
    public l5 w;
    public OverScroller x;
    public ViewPropertyAnimator y;
    public final h0 z;

    static {
        vg1 rg1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            rg1Var = new ug1();
        } else if (i >= 31) {
            rg1Var = new tg1();
        } else if (i >= 30) {
            rg1Var = new sg1();
        } else {
            rg1Var = i >= 29 ? new rg1() : new pg1();
        }
        rg1Var.d(s90.a(0, 1, 0, 1));
        F = rg1Var.b();
        G = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        gh1 gh1Var = gh1.b;
        this.s = gh1Var;
        this.t = gh1Var;
        this.u = gh1Var;
        this.v = gh1Var;
        this.z = new h0(1, this);
        this.A = new k5(this, 0);
        this.B = new k5(this, 1);
        i(context);
        this.C = new vl0();
        n5 n5Var = new n5(context);
        n5Var.setWillNotDraw(true);
        this.D = n5Var;
        addView(n5Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        m5 m5Var = (m5) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) m5Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) m5Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) m5Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) m5Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) m5Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) m5Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) m5Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) m5Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.lp0
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.lp0
    public final void b(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(viewGroup, i, i2, i3, i4);
        }
    }

    @Override // defpackage.lp0
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m5;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.h != null) {
            if (this.f.getVisibility() == 0) {
                translationY = (int) (this.f.getTranslationY() + this.f.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.h.setBounds(0, translationY, getWidth(), this.h.getIntrinsicHeight() + translationY);
            this.h.draw(canvas);
        }
    }

    @Override // defpackage.mp0
    public final void e(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(viewGroup, i, i2, i3, i4, i5);
    }

    @Override // defpackage.lp0
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new m5(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m5(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vl0 vl0Var = this.C;
        return vl0Var.b | vl0Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((va1) this.g).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.h = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.x = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((va1) this.g).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((va1) this.g).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        es wrapper;
        if (this.e == null) {
            this.e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof es) {
                wrapper = (es) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    nh0.j("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.g = wrapper;
        }
    }

    public final void l(Menu menu, hl0 hl0Var) {
        k();
        va1 va1Var = (va1) this.g;
        Toolbar toolbar = va1Var.a;
        if (va1Var.m == null) {
            w5 w5Var = new w5(toolbar.getContext());
            va1Var.m = w5Var;
            w5Var.k = R.id.action_menu_presenter;
        }
        w5 w5Var2 = va1Var.m;
        w5Var2.g = hl0Var;
        rk0 rk0Var = (rk0) menu;
        if (rk0Var == null && toolbar.c == null) {
            return;
        }
        toolbar.f();
        rk0 rk0Var2 = toolbar.c.r;
        if (rk0Var2 == rk0Var) {
            return;
        }
        if (rk0Var2 != null) {
            rk0Var2.r(toolbar.N);
            rk0Var2.r(toolbar.O);
        }
        if (toolbar.O == null) {
            toolbar.O = new ma1(toolbar);
        }
        w5Var2.t = true;
        Context context = toolbar.l;
        if (rk0Var != null) {
            rk0Var.b(w5Var2, context);
            rk0Var.b(toolbar.O, toolbar.l);
        } else {
            w5Var2.j(context, null);
            toolbar.O.j(toolbar.l, null);
            w5Var2.h();
            toolbar.O.h();
        }
        toolbar.c.setPopupTheme(toolbar.m);
        toolbar.c.setPresenter(w5Var2);
        toolbar.N = w5Var2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        gh1 gh1VarG = gh1.g(windowInsets, this);
        boolean zG = g(this.f, new Rect(gh1VarG.b(), gh1VarG.d(), gh1VarG.c(), gh1VarG.a()), false);
        WeakHashMap weakHashMap = oe1.a;
        Rect rect = this.o;
        ge1.b(this, gh1VarG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        dh1 dh1Var = gh1VarG.a;
        gh1 gh1VarL = dh1Var.l(i, i2, i3, i4);
        this.s = gh1VarL;
        boolean z = true;
        if (!this.t.equals(gh1VarL)) {
            this.t = this.s;
            zG = true;
        }
        Rect rect2 = this.p;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return dh1Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = oe1.a;
        ee1.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                m5 m5Var = (m5) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) m5Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) m5Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        gh1 gh1Var;
        int i3;
        vg1 pg1Var;
        k();
        measureChildWithMargins(this.f, i, 0, i2, 0);
        m5 m5Var = (m5) this.f.getLayoutParams();
        int iMax = Math.max(0, this.f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) m5Var).leftMargin + ((ViewGroup.MarginLayoutParams) m5Var).rightMargin);
        int iMax2 = Math.max(0, this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) m5Var).topMargin + ((ViewGroup.MarginLayoutParams) m5Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f.getMeasuredState());
        WeakHashMap weakHashMap = oe1.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.c;
            if (this.j && this.f.getTabContainer() != null) {
                measuredHeight += this.c;
            }
        } else {
            measuredHeight = this.f.getVisibility() != 8 ? this.f.getMeasuredHeight() : 0;
        }
        Rect rect = this.o;
        Rect rect2 = this.q;
        rect2.set(rect);
        this.u = this.s;
        if (this.i || z) {
            s90 s90VarA = s90.a(this.u.b(), this.u.d() + measuredHeight, this.u.c(), this.u.a());
            gh1Var = this.u;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                pg1Var = new ug1(gh1Var);
            } else if (i3 >= 31) {
                pg1Var = new tg1(gh1Var);
            } else if (i3 >= 30) {
                pg1Var = new sg1(gh1Var);
            } else if (i3 >= 29) {
                pg1Var = new rg1(gh1Var);
            } else {
                pg1Var = new pg1(gh1Var);
            }
            pg1Var.d(s90VarA);
            this.u = pg1Var.b();
        } else {
            n5 n5Var = this.D;
            gh1 gh1Var2 = F;
            Rect rect3 = this.r;
            ge1.b(n5Var, gh1Var2, rect3);
            if (rect3.equals(G)) {
                s90 s90VarA2 = s90.a(this.u.b(), this.u.d() + measuredHeight, this.u.c(), this.u.a());
                gh1Var = this.u;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    pg1Var = new ug1(gh1Var);
                } else if (i3 >= 31) {
                    pg1Var = new tg1(gh1Var);
                } else if (i3 >= 30) {
                    pg1Var = new sg1(gh1Var);
                } else if (i3 >= 29) {
                    pg1Var = new rg1(gh1Var);
                } else {
                    pg1Var = new pg1(gh1Var);
                }
                pg1Var.d(s90VarA2);
                this.u = pg1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.u = this.u.a.l(0, measuredHeight, 0, 0);
            }
        }
        g(this.e, rect2, true);
        if (!this.v.equals(this.u)) {
            gh1 gh1Var3 = this.u;
            this.v = gh1Var3;
            oe1.b(this.e, gh1Var3);
        }
        measureChildWithMargins(this.e, i, 0, i2, 0);
        m5 m5Var2 = (m5) this.e.getLayoutParams();
        int iMax3 = Math.max(iMax, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) m5Var2).leftMargin + ((ViewGroup.MarginLayoutParams) m5Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) m5Var2).topMargin + ((ViewGroup.MarginLayoutParams) m5Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.f.getHeight()) {
            h();
            this.B.run();
        } else {
            h();
            this.A.run();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ng1 ng1Var;
        ef1 ef1Var;
        this.C.a = i;
        this.m = getActionBarHideOffset();
        h();
        l5 l5Var = this.w;
        if (l5Var == null || (ef1Var = (ng1Var = (ng1) l5Var).C) == null) {
            return;
        }
        ef1Var.a();
        ng1Var.C = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.k || this.l) {
            return;
        }
        if (this.m <= this.f.getHeight()) {
            h();
            postDelayed(this.A, 600L);
        } else {
            h();
            postDelayed(this.B, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        l5 l5Var = this.w;
        if (l5Var != null) {
            ng1 ng1Var = (ng1) l5Var;
            ng1Var.x = !z2;
            if (z || !z2) {
                if (ng1Var.z) {
                    ng1Var.z = false;
                    ng1Var.i0(true);
                }
            } else if (!ng1Var.z) {
                ng1Var.z = true;
                ng1Var.i0(true);
            }
        }
        if ((i2 & 256) == 0 || this.w == null) {
            return;
        }
        WeakHashMap weakHashMap = oe1.a;
        ee1.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.d = i;
        l5 l5Var = this.w;
        if (l5Var != null) {
            ((ng1) l5Var).w = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f.setTranslationY(-Math.max(0, Math.min(i, this.f.getHeight())));
    }

    public void setActionBarVisibilityCallback(l5 l5Var) {
        this.w = l5Var;
        if (getWindowToken() != null) {
            ((ng1) this.w).w = this.d;
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = oe1.a;
                ee1.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        va1 va1Var = (va1) this.g;
        va1Var.d = i != 0 ? ec1.r(va1Var.a.getContext(), i) : null;
        va1Var.c();
    }

    public void setLogo(int i) {
        k();
        va1 va1Var = (va1) this.g;
        va1Var.e = i != 0 ? ec1.r(va1Var.a.getContext(), i) : null;
        va1Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((va1) this.g).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        va1 va1Var = (va1) this.g;
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

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m5(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        va1 va1Var = (va1) this.g;
        va1Var.d = drawable;
        va1Var.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.lp0
    public final void d(int[] iArr, int i, int i2, int i3) {
    }
}
