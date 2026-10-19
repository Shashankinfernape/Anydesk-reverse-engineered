package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.anydesk.anydeskandroid.R;
import defpackage.ad;
import defpackage.b;
import defpackage.bc0;
import defpackage.bu0;
import defpackage.c81;
import defpackage.dj;
import defpackage.ec1;
import defpackage.es;
import defpackage.ja1;
import defpackage.jl0;
import defpackage.jz0;
import defpackage.ka1;
import defpackage.kf1;
import defpackage.la1;
import defpackage.ma1;
import defpackage.na1;
import defpackage.oa1;
import defpackage.oe1;
import defpackage.pa1;
import defpackage.qa1;
import defpackage.rk0;
import defpackage.va1;
import defpackage.vk0;
import defpackage.w5;
import defpackage.y6;
import defpackage.yb;
import defpackage.yv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public CharSequence A;
    public ColorStateList B;
    public ColorStateList C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final int[] H;
    public final y6 I;
    public ArrayList J;
    public oa1 K;
    public final ka1 L;
    public va1 M;
    public w5 N;
    public ma1 O;
    public dj P;
    public qa1 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final bc0 V;
    public ActionMenuView c;
    public ad d;
    public ad e;
    public AppCompatImageButton f;
    public yb g;
    public final Drawable h;
    public final CharSequence i;
    public AppCompatImageButton j;
    public View k;
    public Context l;
    public int m;
    public int n;
    public int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public jz0 v;
    public int w;
    public int x;
    public final int y;
    public CharSequence z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = 8388627;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new int[2];
        this.I = new y6(new ja1(this, 1));
        this.J = new ArrayList();
        this.L = new ka1(this);
        this.V = new bc0(21, this);
        Context context2 = getContext();
        int[] iArr = yv0.x;
        y6 y6VarC = y6.C(context2, attributeSet, iArr, i);
        oe1.m(this, context, iArr, attributeSet, (TypedArray) y6VarC.e, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        this.n = typedArray.getResourceId(28, 0);
        this.o = typedArray.getResourceId(19, 0);
        this.y = typedArray.getInteger(0, 8388627);
        this.p = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.r = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.s = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.t = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.u = dimensionPixelOffset5;
        }
        this.q = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        jz0 jz0Var = this.v;
        jz0Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            jz0Var.e = dimensionPixelSize;
            jz0Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            jz0Var.f = dimensionPixelSize2;
            jz0Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            jz0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.w = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.x = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.h = y6VarC.t(4);
        this.i = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.l = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableT = y6VarC.t(16);
        if (drawableT != null) {
            setNavigationIcon(drawableT);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableT2 = y6VarC.t(11);
        if (drawableT2 != null) {
            setLogo(drawableT2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(y6VarC.s(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(y6VarC.s(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        y6VarC.F();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new c81(getContext());
    }

    public static na1 h() {
        na1 na1Var = new na1(-2, -2);
        na1Var.b = 0;
        na1Var.a = 8388627;
        return na1Var;
    }

    public static na1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof na1;
        if (z) {
            na1 na1Var = (na1) layoutParams;
            na1 na1Var2 = new na1(na1Var);
            na1Var2.b = 0;
            na1Var2.b = na1Var.b;
            return na1Var2;
        }
        if (z) {
            na1 na1Var3 = new na1((na1) layoutParams);
            na1Var3.b = 0;
            return na1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            na1 na1Var4 = new na1(layoutParams);
            na1Var4.b = 0;
            return na1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        na1 na1Var5 = new na1(marginLayoutParams);
        na1Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) na1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) na1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) na1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) na1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return na1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                na1 na1Var = (na1) childAt.getLayoutParams();
                if (na1Var.b == 0 && u(childAt)) {
                    int i3 = na1Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            na1 na1Var2 = (na1) childAt2.getLayoutParams();
            if (na1Var2.b == 0 && u(childAt2)) {
                int i5 = na1Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        na1 na1VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            na1VarI = h();
        } else {
            na1VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (na1) layoutParams;
        }
        na1VarI.b = 1;
        if (!z || this.k == null) {
            addView(view, na1VarI);
        } else {
            view.setLayoutParams(na1VarI);
            this.G.add(view);
        }
    }

    public final void c() {
        if (this.j == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.j = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.h);
            this.j.setContentDescription(this.i);
            na1 na1VarH = h();
            na1VarH.a = (this.p & 112) | 8388611;
            na1VarH.b = 2;
            this.j.setLayoutParams(na1VarH);
            this.j.setOnClickListener(new b(28, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof na1);
    }

    public final void d() {
        if (this.v == null) {
            jz0 jz0Var = new jz0();
            jz0Var.a = 0;
            jz0Var.b = 0;
            jz0Var.c = Integer.MIN_VALUE;
            jz0Var.d = Integer.MIN_VALUE;
            jz0Var.e = 0;
            jz0Var.f = 0;
            jz0Var.g = false;
            jz0Var.h = false;
            this.v = jz0Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView.r == null) {
            rk0 rk0Var = (rk0) actionMenuView.getMenu();
            if (this.O == null) {
                this.O = new ma1(this);
            }
            this.c.setExpandedActionViewsExclusive(true);
            rk0Var.b(this.O, this.l);
            w();
        }
    }

    public final void f() {
        if (this.c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.c = actionMenuView;
            actionMenuView.setPopupTheme(this.m);
            this.c.setOnMenuItemClickListener(this.L);
            ActionMenuView actionMenuView2 = this.c;
            dj djVar = this.P;
            ka1 ka1Var = new ka1(this);
            actionMenuView2.w = djVar;
            actionMenuView2.x = ka1Var;
            na1 na1VarH = h();
            na1VarH.a = (this.p & 112) | 8388613;
            this.c.setLayoutParams(na1VarH);
            b(this.c, false);
        }
    }

    public final void g() {
        if (this.f == null) {
            this.f = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            na1 na1VarH = h();
            na1VarH.a = (this.p & 112) | 8388611;
            this.f.setLayoutParams(na1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        na1 na1Var = new na1(context, attributeSet);
        na1Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yv0.b);
        na1Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        na1Var.b = 0;
        return na1Var;
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.j;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.j;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        jz0 jz0Var = this.v;
        if (jz0Var != null) {
            return jz0Var.g ? jz0Var.a : jz0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.x;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        jz0 jz0Var = this.v;
        if (jz0Var != null) {
            return jz0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        jz0 jz0Var = this.v;
        if (jz0Var != null) {
            return jz0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        jz0 jz0Var = this.v;
        if (jz0Var != null) {
            return jz0Var.g ? jz0Var.b : jz0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        rk0 rk0Var;
        ActionMenuView actionMenuView = this.c;
        return (actionMenuView == null || (rk0Var = actionMenuView.r) == null || !rk0Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.x, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        yb ybVar = this.g;
        if (ybVar != null) {
            return ybVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        yb ybVar = this.g;
        if (ybVar != null) {
            return ybVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.c.getMenu();
    }

    public View getNavButtonView() {
        return this.f;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public w5 getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.l;
    }

    public int getPopupTheme() {
        return this.m;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    public final TextView getSubtitleTextView() {
        return this.e;
    }

    public CharSequence getTitle() {
        return this.z;
    }

    public int getTitleMarginBottom() {
        return this.u;
    }

    public int getTitleMarginEnd() {
        return this.s;
    }

    public int getTitleMarginStart() {
        return this.r;
    }

    public int getTitleMarginTop() {
        return this.t;
    }

    public final TextView getTitleTextView() {
        return this.d;
    }

    public es getWrapper() {
        if (this.M == null) {
            this.M = new va1(this, true);
        }
        return this.M;
    }

    public final int j(View view, int i) {
        na1 na1Var = (na1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = na1Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.y & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) na1Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) na1Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) na1Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.I.e).iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).v(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.J = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.G.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bc A[LOOP:2: B:113:0x02ba->B:114:0x02bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0302 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0304  */
    /* JADX WARN: Code duplicated, block: B:120:0x0308  */
    /* JADX WARN: Code duplicated, block: B:123:0x030f A[LOOP:3: B:122:0x030d->B:123:0x030f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        ad adVar;
        ad adVar2;
        na1 na1Var;
        na1 na1Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        yb ybVar;
        View view;
        ActionMenuView actionMenuView;
        AppCompatImageButton appCompatImageButton;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.H;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = oe1.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (u(this.f)) {
            AppCompatImageButton appCompatImageButton2 = this.f;
            if (z3) {
                iR = r(appCompatImageButton2, i26, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(appCompatImageButton2, paddingLeft, iMin2, iArr);
            }
            if (u(this.j)) {
                appCompatImageButton = this.j;
                if (z3) {
                    iR = r(appCompatImageButton, iR, iMin2, iArr);
                } else {
                    iQ = q(appCompatImageButton, iQ, iMin2, iArr);
                }
            }
            if (u(this.c)) {
                actionMenuView = this.c;
                if (z3) {
                    iQ = q(actionMenuView, iQ, iMin2, iArr);
                } else {
                    iR = r(actionMenuView, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i26 - currentContentInsetRight);
            if (u(this.k)) {
                view = this.k;
                if (z3) {
                    iMin = r(view, iMin, iMin2, iArr);
                } else {
                    iMax = q(view, iMax, iMin2, iArr);
                }
            }
            if (u(this.g)) {
                ybVar = this.g;
                if (z3) {
                    iMin = r(ybVar, iMin, iMin2, iArr);
                } else {
                    iMax = q(ybVar, iMax, iMin2, iArr);
                }
            }
            zU = u(this.d);
            zU2 = u(this.e);
            if (zU) {
                na1 na1Var3 = (na1) this.d.getLayoutParams();
                measuredHeight = this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) na1Var3).topMargin + ((ViewGroup.MarginLayoutParams) na1Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                na1 na1Var4 = (na1) this.e.getLayoutParams();
                measuredHeight = this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) na1Var4).topMargin + ((ViewGroup.MarginLayoutParams) na1Var4).bottomMargin + measuredHeight;
            }
            if (zU || zU2) {
                if (zU) {
                    adVar = this.d;
                } else {
                    adVar = this.e;
                }
                if (zU2) {
                    adVar2 = this.e;
                } else {
                    adVar2 = this.d;
                }
                na1Var = (na1) adVar.getLayoutParams();
                na1Var2 = (na1) adVar2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zU && this.d.getMeasuredWidth() > 0) || (zU2 && this.e.getMeasuredWidth() > 0);
                i6 = this.y & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) na1Var).topMargin + this.t;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) na1Var).topMargin + this.t;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) na1Var).bottomMargin;
                        i17 = this.u;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) na1Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) na1Var2).bottomMargin) - this.u) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.r;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zU) {
                        na1 na1Var5 = (na1) this.d.getLayoutParams();
                        int measuredWidth2 = iMin - this.d.getMeasuredWidth();
                        int measuredHeight2 = this.d.getMeasuredHeight() + paddingTop;
                        this.d.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.s;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) na1Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zU2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((na1) this.e.getLayoutParams())).topMargin;
                        this.e.layout(iMin - this.e.getMeasuredWidth(), i28, iMin, this.e.getMeasuredHeight() + i28);
                        i13 = iMin - this.s;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.r;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zU) {
                        na1 na1Var6 = (na1) this.d.getLayoutParams();
                        int measuredWidth3 = this.d.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.d.getMeasuredHeight() + paddingTop;
                        this.d.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.s;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) na1Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zU2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((na1) this.e.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.e.getMeasuredWidth() + iMax;
                        this.e.layout(iMax, i30, measuredWidth4, this.e.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.s;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.F;
            a(3, arrayList);
            size = arrayList.size();
            iQ2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iQ2 = q((View) arrayList.get(i18), iQ2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = r((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                na1 na1Var7 = (na1) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) na1Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) na1Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iQ2) {
                if (i25 > iMin) {
                    iQ2 = i24 - (i25 - iMin);
                } else {
                    iQ2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iQ2 = q((View) arrayList.get(i23), iQ2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i26;
        if (u(this.j)) {
            appCompatImageButton = this.j;
            if (z3) {
                iR = r(appCompatImageButton, iR, iMin2, iArr);
            } else {
                iQ = q(appCompatImageButton, iQ, iMin2, iArr);
            }
        }
        if (u(this.c)) {
            actionMenuView = this.c;
            if (z3) {
                iQ = q(actionMenuView, iQ, iMin2, iArr);
            } else {
                iR = r(actionMenuView, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i26 - currentContentInsetRight2);
        if (u(this.k)) {
            view = this.k;
            if (z3) {
                iMin = r(view, iMin, iMin2, iArr);
            } else {
                iMax = q(view, iMax, iMin2, iArr);
            }
        }
        if (u(this.g)) {
            ybVar = this.g;
            if (z3) {
                iMin = r(ybVar, iMin, iMin2, iArr);
            } else {
                iMax = q(ybVar, iMax, iMin2, iArr);
            }
        }
        zU = u(this.d);
        zU2 = u(this.e);
        if (zU) {
            na1 na1Var8 = (na1) this.d.getLayoutParams();
            measuredHeight = this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) na1Var8).topMargin + ((ViewGroup.MarginLayoutParams) na1Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            na1 na1Var9 = (na1) this.e.getLayoutParams();
            measuredHeight = this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) na1Var9).topMargin + ((ViewGroup.MarginLayoutParams) na1Var9).bottomMargin + measuredHeight;
        }
        if (zU) {
            if (zU) {
                adVar = this.d;
            } else {
                adVar = this.e;
            }
            if (zU2) {
                adVar2 = this.e;
            } else {
                adVar2 = this.d;
            }
            na1Var = (na1) adVar.getLayoutParams();
            na1Var2 = (na1) adVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zU) {
            }
            i6 = this.y & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) na1Var).topMargin + this.t;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) na1Var).topMargin + this.t;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) na1Var).bottomMargin;
                    i17 = this.u;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) na1Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) na1Var2).bottomMargin) - this.u) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.r;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zU) {
                    na1 na1Var10 = (na1) this.d.getLayoutParams();
                    int measuredWidth5 = iMin - this.d.getMeasuredWidth();
                    int measuredHeight4 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.s;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) na1Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zU2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((na1) this.e.getLayoutParams())).topMargin;
                    this.e.layout(iMin - this.e.getMeasuredWidth(), i211, iMin, this.e.getMeasuredHeight() + i211);
                    i13 = iMin - this.s;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.r;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zU) {
                    na1 na1Var11 = (na1) this.d.getLayoutParams();
                    int measuredWidth6 = this.d.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.s;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) na1Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zU2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((na1) this.e.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.e.getMeasuredWidth() + iMax;
                    this.e.layout(iMax, i35, measuredWidth7, this.e.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.s;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zU) {
                adVar = this.d;
            } else {
                adVar = this.e;
            }
            if (zU2) {
                adVar2 = this.e;
            } else {
                adVar2 = this.d;
            }
            na1Var = (na1) adVar.getLayoutParams();
            na1Var2 = (na1) adVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zU) {
            }
            i6 = this.y & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) na1Var).topMargin + this.t;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) na1Var).topMargin + this.t;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) na1Var).bottomMargin;
                    i17 = this.u;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) na1Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) na1Var2).bottomMargin) - this.u) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.r;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zU) {
                    na1 na1Var12 = (na1) this.d.getLayoutParams();
                    int measuredWidth8 = iMin - this.d.getMeasuredWidth();
                    int measuredHeight6 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.s;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) na1Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zU2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((na1) this.e.getLayoutParams())).topMargin;
                    this.e.layout(iMin - this.e.getMeasuredWidth(), i214, iMin, this.e.getMeasuredHeight() + i214);
                    i13 = iMin - this.s;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.r;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zU) {
                    na1 na1Var13 = (na1) this.d.getLayoutParams();
                    int measuredWidth9 = this.d.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.s;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) na1Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zU2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((na1) this.e.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.e.getMeasuredWidth() + iMax;
                    this.e.layout(iMax, i36, measuredWidth10, this.e.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.s;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.F;
        a(3, arrayList);
        size = arrayList.size();
        iQ2 = iMax;
        while (i18 < size) {
            iQ2 = q((View) arrayList.get(i18), iQ2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = r((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            na1 na1Var14 = (na1) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) na1Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) na1Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iQ2) {
            if (i25 > iMin) {
                iQ2 = i24 - (i25 - iMin);
            } else {
                iQ2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iQ2 = q((View) arrayList.get(i23), iQ2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        char c;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iL;
        boolean z2 = kf1.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            z = true;
            c = 0;
        } else {
            z = false;
            c = 1;
        }
        if (u(this.f)) {
            t(this.f, i, 0, i2, this.q);
            iK = k(this.f) + this.f.getMeasuredWidth();
            iMax = Math.max(0, l(this.f) + this.f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.j)) {
            t(this.j, i, 0, i2, this.q);
            iK = k(this.j) + this.j.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.j) + this.j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        boolean z3 = z;
        int[] iArr = this.H;
        iArr[z3 ? 1 : 0] = iMax4;
        if (u(this.c)) {
            t(this.c, i, iMax3, i2, this.q);
            iK2 = k(this.c) + this.c.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.c) + this.c.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.k)) {
            iMax5 += s(this.k, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.k) + this.k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.k.getMeasuredState());
        }
        if (u(this.g)) {
            iMax5 += s(this.g, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.g) + this.g.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((na1) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                iMax5 += s(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.t + this.u;
        int i7 = this.r + this.s;
        if (u(this.d)) {
            s(this.d, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.d) + this.d.getMeasuredWidth();
            iL = l(this.d) + this.d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
            iMax2 = iK3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iL = 0;
        }
        if (u(this.e)) {
            iMax2 = Math.max(iMax2, s(this.e, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.e) + this.e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.e.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.R) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof pa1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pa1 pa1Var = (pa1) parcelable;
        super.onRestoreInstanceState(pa1Var.c);
        ActionMenuView actionMenuView = this.c;
        rk0 rk0Var = actionMenuView != null ? actionMenuView.r : null;
        int i = pa1Var.e;
        if (i != 0 && this.O != null && rk0Var != null && (menuItemFindItem = rk0Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (pa1Var.f) {
            bc0 bc0Var = this.V;
            removeCallbacks(bc0Var);
            post(bc0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        jz0 jz0Var = this.v;
        boolean z = i == 1;
        if (z == jz0Var.g) {
            return;
        }
        jz0Var.g = z;
        if (!jz0Var.h) {
            jz0Var.a = jz0Var.e;
            jz0Var.b = jz0Var.f;
            return;
        }
        if (z) {
            int i2 = jz0Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = jz0Var.e;
            }
            jz0Var.a = i2;
            int i3 = jz0Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = jz0Var.f;
            }
            jz0Var.b = i3;
            return;
        }
        int i4 = jz0Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = jz0Var.e;
        }
        jz0Var.a = i4;
        int i5 = jz0Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = jz0Var.f;
        }
        jz0Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        vk0 vk0Var;
        pa1 pa1Var = new pa1(super.onSaveInstanceState());
        ma1 ma1Var = this.O;
        if (ma1Var != null && (vk0Var = ma1Var.d) != null) {
            pa1Var.e = vk0Var.a;
        }
        pa1Var.f = p();
        return pa1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    public final boolean p() {
        w5 w5Var;
        ActionMenuView actionMenuView = this.c;
        return (actionMenuView == null || (w5Var = actionMenuView.v) == null || !w5Var.i()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        na1 na1Var = (na1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) na1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) na1Var).rightMargin + iMax;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        na1 na1Var = (na1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) na1Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) na1Var).leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.U != z) {
            this.U = z;
            w();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.j;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.j.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.j;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.h);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.x) {
            this.x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        yb ybVar = this.g;
        if (drawable != null) {
            if (ybVar == null) {
                this.g = new yb(getContext());
            }
            if (!o(this.g)) {
                b(this.g, true);
            }
        } else if (ybVar != null && o(ybVar)) {
            removeView(this.g);
            this.G.remove(this.g);
        }
        yb ybVar2 = this.g;
        if (ybVar2 != null) {
            ybVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.g == null) {
            this.g = new yb(getContext());
        }
        yb ybVar = this.g;
        if (ybVar != null) {
            ybVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            bu0.D(this.f, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f)) {
                b(this.f, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f);
                this.G.remove(this.f);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(oa1 oa1Var) {
        this.K = oa1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.m != i) {
            this.m = i;
            if (i == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ad adVar = this.e;
        if (!zIsEmpty) {
            if (adVar == null) {
                Context context = getContext();
                ad adVar2 = new ad(context, null);
                this.e = adVar2;
                adVar2.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.o;
                if (i != 0) {
                    this.e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!o(this.e)) {
                b(this.e, true);
            }
        } else if (adVar != null && o(adVar)) {
            removeView(this.e);
            this.G.remove(this.e);
        }
        ad adVar3 = this.e;
        if (adVar3 != null) {
            adVar3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        ad adVar = this.e;
        if (adVar != null) {
            adVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ad adVar = this.d;
        if (!zIsEmpty) {
            if (adVar == null) {
                Context context = getContext();
                ad adVar2 = new ad(context, null);
                this.d = adVar2;
                adVar2.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else if (adVar != null && o(adVar)) {
            removeView(this.d);
            this.G.remove(this.d);
        }
        ad adVar3 = this.d;
        if (adVar3 != null) {
            adVar3.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        ad adVar = this.d;
        if (adVar != null) {
            adVar.setTextColor(colorStateList);
        }
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        w5 w5Var;
        ActionMenuView actionMenuView = this.c;
        return (actionMenuView == null || (w5Var = actionMenuView.v) == null || !w5Var.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = la1.a(this);
            ma1 ma1Var = this.O;
            int i = 0;
            boolean z = (ma1Var == null || ma1Var.d == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z && this.T == null) {
                if (this.S == null) {
                    this.S = la1.b(new ja1(this, i));
                }
                la1.c(onBackInvokedDispatcherA, this.S);
                this.T = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            la1.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(ec1.r(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ec1.r(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(ec1.r(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
