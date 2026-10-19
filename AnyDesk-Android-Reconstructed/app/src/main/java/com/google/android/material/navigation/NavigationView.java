package com.google.android.material.navigation;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import defpackage.ap0;
import defpackage.b3;
import defpackage.bp0;
import defpackage.c41;
import defpackage.c81;
import defpackage.cp0;
import defpackage.d41;
import defpackage.dp0;
import defpackage.e2;
import defpackage.ec1;
import defpackage.ge1;
import defpackage.hk0;
import defpackage.id;
import defpackage.ik0;
import defpackage.il0;
import defpackage.iv;
import defpackage.jk0;
import defpackage.kv;
import defpackage.ld;
import defpackage.lk0;
import defpackage.lv;
import defpackage.mv;
import defpackage.n01;
import defpackage.n41;
import defpackage.nh0;
import defpackage.no0;
import defpackage.o41;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.p41;
import defpackage.qo0;
import defpackage.qy;
import defpackage.r41;
import defpackage.rf;
import defpackage.rj0;
import defpackage.sj0;
import defpackage.th1;
import defpackage.uj;
import defpackage.vk0;
import defpackage.vo0;
import defpackage.x8;
import defpackage.y6;
import defpackage.yo0;
import defpackage.zy0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends n01 implements rj0 {
    public final no0 j;
    public final yo0 k;
    public cp0 l;
    public final int m;
    public final int[] n;
    public c81 o;
    public final b3 p;
    public boolean q;
    public boolean r;
    public int s;
    public final boolean t;
    public final int u;
    public final n41 v;
    public final jk0 w;
    public final y6 x;
    public final ap0 y;
    public static final int[] z = {R.attr.state_checked};
    public static final int[] A = {-16842910};

    /* JADX WARN: Code duplicated, block: B:65:0x01d1 A[PHI: r8
  0x01d1: PHI (r8v3 android.graphics.drawable.Drawable) = 
  (r8v2 android.graphics.drawable.Drawable)
  (r8v7 android.graphics.drawable.Drawable)
  (r8v2 android.graphics.drawable.Drawable)
 binds: [B:57:0x0194, B:63:0x01ba, B:61:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Context contextN = lk0.N(context, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_NavigationView);
        super(contextN, attributeSet, i);
        this.e = new Rect();
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        th1.b(contextN, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_ScrimInsetsFrameLayout);
        int[] iArr = ov0.A;
        th1.e(contextN, attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextN.obtainStyledAttributes(attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.c = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        bp0 bp0Var = new bp0(this);
        WeakHashMap weakHashMap = oe1.a;
        ge1.k(this, bp0Var);
        yo0 yo0Var = new yo0();
        this.k = yo0Var;
        this.n = new int[2];
        this.q = true;
        this.r = true;
        this.s = 0;
        int i3 = Build.VERSION.SDK_INT;
        this.v = i3 >= 33 ? new r41(this) : i3 >= 22 ? new p41(this) : new o41();
        this.w = new jk0(this);
        this.x = new y6(this);
        this.y = new ap0(this);
        Context context2 = getContext();
        no0 no0Var = new no0(context2);
        this.j = no0Var;
        th1.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_NavigationView);
        int[] iArr2 = ov0.z;
        th1.e(context2, attributeSet, iArr2, i, com.anydesk.anydeskandroid.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, com.anydesk.anydeskandroid.R.style.Widget_Design_NavigationView);
        y6 y6Var = new y6(context2, typedArrayObtainStyledAttributes2);
        if (typedArrayObtainStyledAttributes2.hasValue(1)) {
            setBackground(y6Var.t(1));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(7, 0);
        this.s = dimensionPixelSize;
        this.t = dimensionPixelSize == 0;
        this.u = getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListD = ld.d(background);
        if (background == null || colorStateListD != null) {
            hk0 hk0Var = new hk0(d41.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_NavigationView).a());
            if (colorStateListD != null) {
                hk0Var.m(colorStateListD);
            }
            hk0Var.j(context2);
            setBackground(hk0Var);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(8)) {
            setElevation(typedArrayObtainStyledAttributes2.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        this.m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListS = typedArrayObtainStyledAttributes2.hasValue(31) ? y6Var.s(31) : null;
        int resourceId = typedArrayObtainStyledAttributes2.hasValue(34) ? typedArrayObtainStyledAttributes2.getResourceId(34, 0) : 0;
        if (resourceId == 0 && colorStateListS == null) {
            colorStateListS = e(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListS2 = typedArrayObtainStyledAttributes2.hasValue(14) ? y6Var.s(14) : e(R.attr.textColorSecondary);
        int resourceId2 = typedArrayObtainStyledAttributes2.hasValue(24) ? typedArrayObtainStyledAttributes2.getResourceId(24, 0) : 0;
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(25, true);
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            setItemIconSize(typedArrayObtainStyledAttributes2.getDimensionPixelSize(13, 0));
        }
        ColorStateList colorStateListS3 = typedArrayObtainStyledAttributes2.hasValue(26) ? y6Var.s(26) : null;
        if (resourceId2 == 0 && colorStateListS3 == null) {
            colorStateListS3 = e(R.attr.textColorPrimary);
        }
        Drawable drawableT = y6Var.t(10);
        if (drawableT == null && (typedArrayObtainStyledAttributes2.hasValue(17) || typedArrayObtainStyledAttributes2.hasValue(18))) {
            drawableT = f(y6Var, ec1.m(getContext(), y6Var, 19));
            ColorStateList colorStateListM = ec1.m(context2, y6Var, 16);
            if (colorStateListM != null) {
                yo0Var.p = new RippleDrawable(zy0.a(colorStateListM), null, f(y6Var, null));
                yo0Var.h();
            }
        }
        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
            i2 = 0;
            setItemHorizontalPadding(typedArrayObtainStyledAttributes2.getDimensionPixelSize(11, 0));
        } else {
            i2 = 0;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(27)) {
            setItemVerticalPadding(typedArrayObtainStyledAttributes2.getDimensionPixelSize(27, i2));
        }
        setDividerInsetStart(typedArrayObtainStyledAttributes2.getDimensionPixelSize(6, i2));
        int i4 = 5;
        setDividerInsetEnd(typedArrayObtainStyledAttributes2.getDimensionPixelSize(5, i2));
        setSubheaderInsetStart(typedArrayObtainStyledAttributes2.getDimensionPixelSize(33, i2));
        setSubheaderInsetEnd(typedArrayObtainStyledAttributes2.getDimensionPixelSize(32, i2));
        setTopInsetScrimEnabled(typedArrayObtainStyledAttributes2.getBoolean(35, this.q));
        setBottomInsetScrimEnabled(typedArrayObtainStyledAttributes2.getBoolean(4, this.r));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(12, i2);
        setItemMaxLines(typedArrayObtainStyledAttributes2.getInt(15, 1));
        no0Var.e = new bp0(this);
        yo0Var.f = 1;
        yo0Var.j(context2, no0Var);
        if (resourceId != 0) {
            yo0Var.i = resourceId;
            yo0Var.h();
        }
        yo0Var.j = colorStateListS;
        yo0Var.h();
        yo0Var.n = colorStateListS2;
        yo0Var.h();
        int overScrollMode = getOverScrollMode();
        yo0Var.D = overScrollMode;
        NavigationMenuView navigationMenuView = yo0Var.c;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            yo0Var.k = resourceId2;
            yo0Var.h();
        }
        yo0Var.l = z2;
        yo0Var.h();
        yo0Var.m = colorStateListS3;
        yo0Var.h();
        yo0Var.o = drawableT;
        yo0Var.h();
        yo0Var.s = dimensionPixelSize2;
        yo0Var.h();
        no0Var.b(yo0Var, no0Var.a);
        if (yo0Var.c == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) yo0Var.h.inflate(com.anydesk.anydeskandroid.R.layout.design_navigation_menu, (ViewGroup) this, false);
            yo0Var.c = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new vo0(yo0Var, yo0Var.c));
            if (yo0Var.g == null) {
                qo0 qo0Var = new qo0(yo0Var);
                yo0Var.g = qo0Var;
                qo0Var.h();
            }
            int i5 = yo0Var.D;
            if (i5 != -1) {
                yo0Var.c.setOverScrollMode(i5);
            }
            LinearLayout linearLayout = (LinearLayout) yo0Var.h.inflate(com.anydesk.anydeskandroid.R.layout.design_navigation_item_header, (ViewGroup) yo0Var.c, false);
            yo0Var.d = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            yo0Var.c.setAdapter(yo0Var.g);
        }
        addView(yo0Var.c);
        if (typedArrayObtainStyledAttributes2.hasValue(28)) {
            int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(28, 0);
            qo0 qo0Var2 = yo0Var.g;
            if (qo0Var2 != null) {
                qo0Var2.f = true;
            }
            getMenuInflater().inflate(resourceId3, no0Var);
            qo0 qo0Var3 = yo0Var.g;
            if (qo0Var3 != null) {
                qo0Var3.f = false;
            }
            yo0Var.h();
        }
        if (typedArrayObtainStyledAttributes2.hasValue(9)) {
            yo0Var.d.addView(yo0Var.h.inflate(typedArrayObtainStyledAttributes2.getResourceId(9, 0), (ViewGroup) yo0Var.d, false));
            NavigationMenuView navigationMenuView3 = yo0Var.c;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        y6Var.F();
        this.p = new b3(i4, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.p);
    }

    private MenuInflater getMenuInflater() {
        if (this.o == null) {
            this.o = new c81(getContext());
        }
        return this.o;
    }

    @Override // defpackage.rj0
    public final void a() {
        int i;
        Pair pairH = h();
        DrawerLayout drawerLayout = (DrawerLayout) pairH.first;
        jk0 jk0Var = this.w;
        rf rfVar = jk0Var.f;
        jk0Var.f = null;
        if (rfVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i2 = ((iv) pairH.second).a;
        int i3 = mv.a;
        lv lvVar = new lv(drawerLayout, this);
        kv kvVar = new kv(0, drawerLayout);
        NavigationView navigationView = jk0Var.b;
        boolean z2 = rfVar.d == 0;
        WeakHashMap weakHashMap = oe1.a;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, navigationView.getLayoutDirection()) & 3) == 3;
        float scaleX = navigationView.getScaleX() * navigationView.getWidth();
        ViewGroup.LayoutParams layoutParams = navigationView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        if (z3) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(navigationView, (Property<NavigationView, Float>) View.TRANSLATION_X, f);
        objectAnimatorOfFloat.addUpdateListener(kvVar);
        objectAnimatorOfFloat.setInterpolator(new qy());
        objectAnimatorOfFloat.setDuration(x8.c(jk0Var.c, jk0Var.d, rfVar.c));
        objectAnimatorOfFloat.addListener(new ik0(jk0Var, z2, i2));
        objectAnimatorOfFloat.addListener(lvVar);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.rj0
    public final void b(rf rfVar) {
        float f = rfVar.c;
        int i = ((iv) h().second).a;
        jk0 jk0Var = this.w;
        if (jk0Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        rf rfVar2 = jk0Var.f;
        jk0Var.f = rfVar;
        if (rfVar2 != null) {
            jk0Var.a(f, rfVar.d == 0, i);
        }
        if (this.t) {
            this.s = x8.c(0, this.u, jk0Var.a.getInterpolation(f));
            g(getWidth(), getHeight());
        }
    }

    @Override // defpackage.rj0
    public final void c(rf rfVar) {
        h();
        this.w.f = rfVar;
    }

    @Override // defpackage.rj0
    public final void d() {
        h();
        jk0 jk0Var = this.w;
        NavigationView navigationView = jk0Var.b;
        if (jk0Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        rf rfVar = jk0Var.f;
        jk0Var.f = null;
        if (rfVar != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(navigationView, (Property<NavigationView, Float>) View.SCALE_X, 1.0f);
            Property property = View.SCALE_Y;
            animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(navigationView, (Property<NavigationView, Float>) property, 1.0f));
            for (int i = 0; i < navigationView.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(navigationView.getChildAt(i), (Property<View, Float>) property, 1.0f));
            }
            animatorSet.setDuration(jk0Var.e);
            animatorSet.start();
        }
        if (!this.t || this.s == 0) {
            return;
        }
        this.s = 0;
        g(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n41 n41Var = this.v;
        Path path = n41Var.e;
        if (!n41Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final ColorStateList e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM = uj.m(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.anydesk.anydeskandroid.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM.getDefaultColor();
        int[] iArr = A;
        return new ColorStateList(new int[][]{iArr, z, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final InsetDrawable f(y6 y6Var, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) y6Var.e;
        hk0 hk0Var = new hk0(d41.a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0), new e2(0.0f)).a());
        hk0Var.m(colorStateList);
        return new InsetDrawable((Drawable) hk0Var, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    public final void g(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof iv)) {
            if ((this.s > 0 || this.t) && (getBackground() instanceof hk0)) {
                int i3 = ((iv) getLayoutParams()).a;
                WeakHashMap weakHashMap = oe1.a;
                boolean z2 = Gravity.getAbsoluteGravity(i3, getLayoutDirection()) == 3;
                hk0 hk0Var = (hk0) getBackground();
                c41 c41VarE = hk0Var.c.a.e();
                float f = this.s;
                c41VarE.e = new e2(f);
                c41VarE.f = new e2(f);
                c41VarE.g = new e2(f);
                c41VarE.h = new e2(f);
                if (z2) {
                    c41VarE.e = new e2(0.0f);
                    c41VarE.h = new e2(0.0f);
                } else {
                    c41VarE.f = new e2(0.0f);
                    c41VarE.g = new e2(0.0f);
                }
                d41 d41VarA = c41VarE.a();
                hk0Var.setShapeAppearanceModel(d41VarA);
                n41 n41Var = this.v;
                n41Var.c = d41VarA;
                n41Var.c();
                n41Var.a(this);
                n41Var.d = new RectF(0.0f, 0.0f, i, i2);
                n41Var.c();
                n41Var.a(this);
                n41Var.b = true;
                n41Var.a(this);
            }
        }
    }

    public jk0 getBackHelper() {
        return this.w;
    }

    public MenuItem getCheckedItem() {
        return this.k.g.e;
    }

    public int getDividerInsetEnd() {
        return this.k.v;
    }

    public int getDividerInsetStart() {
        return this.k.u;
    }

    public int getHeaderCount() {
        return this.k.d.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.k.o;
    }

    public int getItemHorizontalPadding() {
        return this.k.q;
    }

    public int getItemIconPadding() {
        return this.k.s;
    }

    public ColorStateList getItemIconTintList() {
        return this.k.n;
    }

    public int getItemMaxLines() {
        return this.k.A;
    }

    public ColorStateList getItemTextColor() {
        return this.k.m;
    }

    public int getItemVerticalPadding() {
        return this.k.r;
    }

    public Menu getMenu() {
        return this.j;
    }

    public int getSubheaderInsetEnd() {
        return this.k.x;
    }

    public int getSubheaderInsetStart() {
        return this.k.w;
    }

    public final Pair h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof iv)) {
            return new Pair((DrawerLayout) parent, (iv) layoutParams);
        }
        nh0.j("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    @Override // defpackage.n01, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        sj0 sj0Var;
        ArrayList arrayList;
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof hk0) {
            th1.S(this, (hk0) background);
        }
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            y6 y6Var = this.x;
            if (((sj0) y6Var.d) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                ap0 ap0Var = this.y;
                if (ap0Var != null && (arrayList = drawerLayout.u) != null) {
                    arrayList.remove(ap0Var);
                }
                drawerLayout.a(ap0Var);
                if (!DrawerLayout.l(this) || (sj0Var = (sj0) y6Var.d) == null) {
                    return;
                }
                sj0Var.b((NavigationView) y6Var.e, (NavigationView) y6Var.f, true);
            }
        }
    }

    @Override // defpackage.n01, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.p);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            ap0 ap0Var = this.y;
            if (ap0Var == null || (arrayList = drawerLayout.u) == null) {
                return;
            }
            arrayList.remove(ap0Var);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.m;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof dp0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dp0 dp0Var = (dp0) parcelable;
        super.onRestoreInstanceState(dp0Var.c);
        Bundle bundle = dp0Var.e;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.j.u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            il0 il0Var = (il0) weakReference.get();
            if (il0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = il0Var.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    il0Var.e(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableM;
        dp0 dp0Var = new dp0(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dp0Var.e = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.j.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return dp0Var;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            il0 il0Var = (il0) weakReference.get();
            if (il0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = il0Var.getId();
                if (id > 0 && (parcelableM = il0Var.m()) != null) {
                    sparseArray.put(id, parcelableM);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return dp0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        g(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.r = z2;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.j.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            id.q("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.k.g.j((vk0) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        yo0 yo0Var = this.k;
        yo0Var.v = i;
        yo0Var.h();
    }

    public void setDividerInsetStart(int i) {
        yo0 yo0Var = this.k;
        yo0Var.u = i;
        yo0Var.h();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof hk0) {
            ((hk0) background).l(f);
        }
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        n41 n41Var = this.v;
        if (z2 != n41Var.a) {
            n41Var.a = z2;
            n41Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        yo0 yo0Var = this.k;
        yo0Var.o = drawable;
        yo0Var.h();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        yo0 yo0Var = this.k;
        yo0Var.q = i;
        yo0Var.h();
    }

    public void setItemHorizontalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        yo0 yo0Var = this.k;
        yo0Var.q = dimensionPixelSize;
        yo0Var.h();
    }

    public void setItemIconPadding(int i) {
        yo0 yo0Var = this.k;
        yo0Var.s = i;
        yo0Var.h();
    }

    public void setItemIconPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        yo0 yo0Var = this.k;
        yo0Var.s = dimensionPixelSize;
        yo0Var.h();
    }

    public void setItemIconSize(int i) {
        yo0 yo0Var = this.k;
        if (yo0Var.t != i) {
            yo0Var.t = i;
            yo0Var.y = true;
            yo0Var.h();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        yo0 yo0Var = this.k;
        yo0Var.n = colorStateList;
        yo0Var.h();
    }

    public void setItemMaxLines(int i) {
        yo0 yo0Var = this.k;
        yo0Var.A = i;
        yo0Var.h();
    }

    public void setItemTextAppearance(int i) {
        yo0 yo0Var = this.k;
        yo0Var.k = i;
        yo0Var.h();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        yo0 yo0Var = this.k;
        yo0Var.l = z2;
        yo0Var.h();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        yo0 yo0Var = this.k;
        yo0Var.m = colorStateList;
        yo0Var.h();
    }

    public void setItemVerticalPadding(int i) {
        yo0 yo0Var = this.k;
        yo0Var.r = i;
        yo0Var.h();
    }

    public void setItemVerticalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        yo0 yo0Var = this.k;
        yo0Var.r = dimensionPixelSize;
        yo0Var.h();
    }

    public void setNavigationItemSelectedListener(cp0 cp0Var) {
        this.l = cp0Var;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        yo0 yo0Var = this.k;
        if (yo0Var != null) {
            yo0Var.D = i;
            NavigationMenuView navigationMenuView = yo0Var.c;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(int i) {
        yo0 yo0Var = this.k;
        yo0Var.x = i;
        yo0Var.h();
    }

    public void setSubheaderInsetStart(int i) {
        yo0 yo0Var = this.k;
        yo0Var.w = i;
        yo0Var.h();
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.q = z2;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.j.findItem(i);
        if (menuItemFindItem != null) {
            this.k.g.j((vk0) menuItemFindItem);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.navigationViewStyle);
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
