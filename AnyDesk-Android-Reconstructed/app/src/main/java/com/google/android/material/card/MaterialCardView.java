package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.ak0;
import defpackage.c41;
import defpackage.d41;
import defpackage.e2;
import defpackage.ec1;
import defpackage.gk0;
import defpackage.hk0;
import defpackage.lk0;
import defpackage.m41;
import defpackage.ov0;
import defpackage.r71;
import defpackage.th1;
import defpackage.uj;
import defpackage.yj0;
import defpackage.zy0;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, m41 {
    public static final int[] m = {R.attr.state_checkable};
    public static final int[] n = {R.attr.state_checked};
    public static final int[] o = {com.anydesk.anydeskandroid.R.attr.state_dragged};
    public final ak0 i;
    public final boolean j;
    public boolean k;
    public boolean l;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(lk0.N(context, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.k = false;
        this.l = false;
        this.j = true;
        TypedArray typedArrayE = th1.E(getContext(), attributeSet, ov0.s, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ak0 ak0Var = new ak0(this, attributeSet, i);
        this.i = ak0Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        hk0 hk0Var = ak0Var.c;
        hk0Var.m(cardBackgroundColor);
        ak0Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        ak0Var.l();
        MaterialCardView materialCardView = ak0Var.a;
        ColorStateList colorStateListN = ec1.n(materialCardView.getContext(), typedArrayE, 11);
        ak0Var.n = colorStateListN;
        if (colorStateListN == null) {
            ak0Var.n = ColorStateList.valueOf(-1);
        }
        ak0Var.h = typedArrayE.getDimensionPixelSize(12, 0);
        boolean z = typedArrayE.getBoolean(0, false);
        ak0Var.s = z;
        materialCardView.setLongClickable(z);
        ak0Var.l = ec1.n(materialCardView.getContext(), typedArrayE, 6);
        ak0Var.g(ec1.s(materialCardView.getContext(), typedArrayE, 2));
        ak0Var.f = typedArrayE.getDimensionPixelSize(5, 0);
        ak0Var.e = typedArrayE.getDimensionPixelSize(4, 0);
        ak0Var.g = typedArrayE.getInteger(3, 8388661);
        ColorStateList colorStateListN2 = ec1.n(materialCardView.getContext(), typedArrayE, 7);
        ak0Var.k = colorStateListN2;
        if (colorStateListN2 == null) {
            ak0Var.k = ColorStateList.valueOf(r71.u(materialCardView, com.anydesk.anydeskandroid.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListN3 = ec1.n(materialCardView.getContext(), typedArrayE, 1);
        colorStateListN3 = colorStateListN3 == null ? ColorStateList.valueOf(0) : colorStateListN3;
        hk0 hk0Var2 = ak0Var.d;
        hk0Var2.m(colorStateListN3);
        int[] iArr = zy0.a;
        RippleDrawable rippleDrawable = ak0Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ak0Var.k);
        }
        hk0Var.l(materialCardView.getCardElevation());
        float f = ak0Var.h;
        ColorStateList colorStateList = ak0Var.n;
        hk0Var2.c.j = f;
        hk0Var2.invalidateSelf();
        gk0 gk0Var = hk0Var2.c;
        if (gk0Var.d != colorStateList) {
            gk0Var.d = colorStateList;
            hk0Var2.onStateChange(hk0Var2.getState());
        }
        materialCardView.setBackgroundInternal(ak0Var.d(hk0Var));
        Drawable drawableC = ak0Var.j() ? ak0Var.c() : hk0Var2;
        ak0Var.i = drawableC;
        materialCardView.setForeground(ak0Var.d(drawableC));
        typedArrayE.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.i.c.getBounds());
        return rectF;
    }

    public final void b() {
        ak0 ak0Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (ak0Var = this.i).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        ak0Var.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        ak0Var.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.i.c.c.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.i.d.c.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.i.j;
    }

    public int getCheckedIconGravity() {
        return this.i.g;
    }

    public int getCheckedIconMargin() {
        return this.i.e;
    }

    public int getCheckedIconSize() {
        return this.i.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.i.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.i.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.i.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.i.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.i.b.top;
    }

    public float getProgress() {
        return this.i.c.c.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.i.c.h();
    }

    public ColorStateList getRippleColor() {
        return this.i.k;
    }

    public d41 getShapeAppearanceModel() {
        return this.i.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.i.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.i.n;
    }

    public int getStrokeWidth() {
        return this.i.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ak0 ak0Var = this.i;
        ak0Var.k();
        th1.S(this, ak0Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        ak0 ak0Var = this.i;
        if (ak0Var != null && ak0Var.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        if (this.k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        if (this.l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, o);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.k);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        ak0 ak0Var = this.i;
        accessibilityNodeInfo.setCheckable(ak0Var != null && ak0Var.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.k);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.j) {
            ak0 ak0Var = this.i;
            if (!ak0Var.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                ak0Var.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.i.c.m(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        ak0 ak0Var = this.i;
        ak0Var.c.l(ak0Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        hk0 hk0Var = this.i.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hk0Var.m(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.i.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.k != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.i.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        ak0 ak0Var = this.i;
        if (ak0Var.g != i) {
            ak0Var.g = i;
            MaterialCardView materialCardView = ak0Var.a;
            ak0Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.i.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.i.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.i.g(ec1.r(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.i.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.i.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ak0 ak0Var = this.i;
        ak0Var.l = colorStateList;
        Drawable drawable = ak0Var.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        ak0 ak0Var = this.i;
        if (ak0Var != null) {
            ak0Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.i.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        ak0 ak0Var = this.i;
        ak0Var.m();
        ak0Var.l();
    }

    public void setProgress(float f) {
        ak0 ak0Var = this.i;
        ak0Var.c.n(f);
        hk0 hk0Var = ak0Var.d;
        if (hk0Var != null) {
            hk0Var.n(f);
        }
        hk0 hk0Var2 = ak0Var.q;
        if (hk0Var2 != null) {
            hk0Var2.n(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        ak0 ak0Var = this.i;
        c41 c41VarE = ak0Var.m.e();
        c41VarE.e = new e2(f);
        c41VarE.f = new e2(f);
        c41VarE.g = new e2(f);
        c41VarE.h = new e2(f);
        ak0Var.h(c41VarE.a());
        ak0Var.i.invalidateSelf();
        if (ak0Var.i() || (ak0Var.a.getPreventCornerOverlap() && !ak0Var.c.k())) {
            ak0Var.l();
        }
        if (ak0Var.i()) {
            ak0Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ak0 ak0Var = this.i;
        ak0Var.k = colorStateList;
        int[] iArr = zy0.a;
        RippleDrawable rippleDrawable = ak0Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM = uj.m(getContext(), i);
        ak0 ak0Var = this.i;
        ak0Var.k = colorStateListM;
        int[] iArr = zy0.a;
        RippleDrawable rippleDrawable = ak0Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM);
        }
    }

    @Override // defpackage.m41
    public void setShapeAppearanceModel(d41 d41Var) {
        setClipToOutline(d41Var.d(getBoundsAsRectF()));
        this.i.h(d41Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ak0 ak0Var = this.i;
        if (ak0Var.n != colorStateList) {
            ak0Var.n = colorStateList;
            hk0 hk0Var = ak0Var.d;
            hk0Var.c.j = ak0Var.h;
            hk0Var.invalidateSelf();
            gk0 gk0Var = hk0Var.c;
            if (gk0Var.d != colorStateList) {
                gk0Var.d = colorStateList;
                hk0Var.onStateChange(hk0Var.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        ak0 ak0Var = this.i;
        if (i != ak0Var.h) {
            ak0Var.h = i;
            hk0 hk0Var = ak0Var.d;
            ColorStateList colorStateList = ak0Var.n;
            hk0Var.c.j = i;
            hk0Var.invalidateSelf();
            gk0 gk0Var = hk0Var.c;
            if (gk0Var.d != colorStateList) {
                gk0Var.d = colorStateList;
                hk0Var.onStateChange(hk0Var.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        ak0 ak0Var = this.i;
        ak0Var.m();
        ak0Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ak0 ak0Var = this.i;
        if (ak0Var != null && ak0Var.s && isEnabled()) {
            this.k = !this.k;
            refreshDrawableState();
            b();
            ak0Var.f(this.k, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.i.c.m(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(yj0 yj0Var) {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
