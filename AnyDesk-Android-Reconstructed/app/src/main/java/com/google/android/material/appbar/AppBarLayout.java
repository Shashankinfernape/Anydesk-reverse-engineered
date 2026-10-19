package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.R;
import defpackage.af1;
import defpackage.bu0;
import defpackage.d2;
import defpackage.ds;
import defpackage.ec1;
import defpackage.ge1;
import defpackage.gh1;
import defpackage.hk0;
import defpackage.id;
import defpackage.ld;
import defpackage.lk0;
import defpackage.na;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.r70;
import defpackage.th1;
import defpackage.uj;
import defpackage.vq;
import defpackage.x8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {
    public int c;
    public int d;
    public int e;
    public int f;
    public gh1 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public WeakReference l;
    public int[] m;
    public Drawable n;
    public Behavior o;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(lk0.N(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = 0;
        new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayE = th1.E(context3, attributeSet, ds.q, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayE.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayE.getResourceId(0, 0)));
            }
            typedArrayE.recycle();
            TypedArray typedArrayE2 = th1.E(context2, attributeSet, ov0.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayE2.getDrawable(0);
            WeakHashMap weakHashMap = oe1.a;
            setBackground(drawable);
            ColorStateList colorStateListN = ec1.n(context2, typedArrayE2, 6);
            ColorStateList colorStateListD = ld.d(getBackground());
            if (colorStateListD != null) {
                hk0 hk0Var = new hk0();
                hk0Var.m(colorStateListD);
                if (colorStateListN != null) {
                    Context context4 = getContext();
                    TypedValue typedValueY = bu0.y(context4, R.attr.colorSurface);
                    if (typedValueY != null && (i2 = typedValueY.resourceId) != 0) {
                        uj.l(context4, i2);
                    }
                    setBackground(hk0Var);
                } else {
                    hk0Var.j(context2);
                    setBackground(hk0Var);
                }
            }
            lk0.G(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            lk0.H(context2, R.attr.motionEasingStandardInterpolator, x8.a);
            if (typedArrayE2.hasValue(4)) {
                this.f = typedArrayE2.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (typedArrayE2.hasValue(3)) {
                ds.C(this, typedArrayE2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayE2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayE2.getBoolean(2, false));
                }
                if (typedArrayE2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayE2.getBoolean(1, false));
                }
            }
            getResources().getDimension(R.dimen.design_appbar_elevation);
            this.j = typedArrayE2.getBoolean(5, false);
            this.k = typedArrayE2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayE2.getDrawable(8));
            typedArrayE2.recycle();
            ge1.k(this, new af1(19, this));
        } catch (Throwable th) {
            typedArrayE.recycle();
            throw th;
        }
    }

    public static na b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            na naVar = new na((LinearLayout.LayoutParams) layoutParams);
            naVar.a = 1;
            return naVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            na naVar2 = new na((ViewGroup.MarginLayoutParams) layoutParams);
            naVar2.a = 1;
            return naVar2;
        }
        na naVar3 = new na(layoutParams);
        naVar3.a = 1;
        return naVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final na generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        na naVar = new na(context, attributeSet);
        naVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.b);
        naVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (typedArrayObtainStyledAttributes.getInt(0, 0) == 1) {
            new Rect();
            new Rect();
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            naVar.b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return naVar;
    }

    public final void c() {
        b bVar = null;
        if (this.o != null && this.c != -1 && this.f == 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int bottom = childAt.getBottom();
                if (childAt.getTop() <= 0 && bottom >= 0) {
                    bVar = new b(d2.d);
                    bVar.f = true;
                    bVar.e = false;
                    bVar.g = i;
                    WeakHashMap weakHashMap = oe1.a;
                    bVar.i = bottom == getTopInset() + childAt.getMinimumHeight();
                    bVar.h = bottom / childAt.getHeight();
                    break;
                }
            }
        }
        this.c = -1;
        this.d = -1;
        this.e = -1;
        if (bVar != null) {
            Behavior behavior = this.o;
            if (behavior.c != null) {
                return;
            }
            behavior.c = bVar;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof na;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.n == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, 0.0f);
        this.n.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        na naVar = new na(-1, -2);
        naVar.a = 1;
        return naVar;
    }

    public vq getBehavior() {
        Behavior behavior = new Behavior();
        this.o = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                na naVar = (na) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = naVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) naVar).topMargin + ((LinearLayout.LayoutParams) naVar).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap weakHashMap = oe1.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap weakHashMap2 = oe1.a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = oe1.a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = oe1.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.d = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                na naVar = (na) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) naVar).topMargin + ((LinearLayout.LayoutParams) naVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = naVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = oe1.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.e = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.k;
    }

    public hk0 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof hk0) {
            return (hk0) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = oe1.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.n;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        gh1 gh1Var = this.g;
        if (gh1Var != null) {
            return gh1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                na naVar = (na) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = naVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) naVar).topMargin + ((LinearLayout.LayoutParams) naVar).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = oe1.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = oe1.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof hk0) {
            th1.S(this, (hk0) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.m == null) {
            this.m = new int[4];
        }
        int[] iArr = this.m;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.i;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        iArr[1] = -R.attr.state_lifted;
        int i3 = R.attr.state_collapsible;
        if (!z) {
            i3 = -R.attr.state_collapsible;
        }
        iArr[2] = i3;
        iArr[3] = -R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = oe1.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    oe1.j(getChildAt(childCount), topInset);
                }
            }
        }
        c();
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2 && ((na) getChildAt(i5).getLayoutParams()).b == null; i5++) {
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.h) {
            return;
        }
        if (!this.j) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((na) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = oe1.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = uj.f(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof hk0) {
            ((hk0) background).l(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = oe1.a;
        this.f = (z ? 1 : 2) | (isLaidOut() ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.j = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.k = -1;
        if (view != null) {
            this.l = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.k = i;
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.h = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            id.q("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        ColorStateList colorStateListD;
        Drawable drawable2 = this.n;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.n = drawableMutate;
            if (!(drawableMutate instanceof hk0) && (colorStateListD = ld.d(drawableMutate)) != null) {
                colorStateListD.getDefaultColor();
            }
            Drawable drawable3 = this.n;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.n.setState(getDrawableState());
                }
                Drawable drawable4 = this.n;
                WeakHashMap weakHashMap = oe1.a;
                uj.D(drawable4, getLayoutDirection());
                this.n.setVisible(getVisibility() == 0, false);
                this.n.setCallback(this);
            }
            if (this.n != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = oe1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(ec1.r(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ds.C(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends r70 {
        public b c;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        na naVar = new na(-1, -2);
        naVar.a = 1;
        return naVar;
    }

    public static class ScrollingViewBehavior extends r70 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            new Rect();
            new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.B);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public ScrollingViewBehavior() {
            new Rect();
            new Rect();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
