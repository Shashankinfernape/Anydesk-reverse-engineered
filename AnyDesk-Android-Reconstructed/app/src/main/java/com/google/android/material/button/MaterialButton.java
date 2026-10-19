package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.c41;
import defpackage.d41;
import defpackage.ds;
import defpackage.e2;
import defpackage.ec1;
import defpackage.hk0;
import defpackage.id;
import defpackage.lk0;
import defpackage.m41;
import defpackage.nh0;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.th1;
import defpackage.uj;
import defpackage.vj0;
import defpackage.wj0;
import defpackage.xj0;
import defpackage.zy0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, m41 {
    public static final int[] s = {R.attr.state_checkable};
    public static final int[] t = {R.attr.state_checked};
    public final xj0 f;
    public final LinkedHashSet g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public Drawable j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(lk0.N(context, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.g = new LinkedHashSet();
        this.p = false;
        this.q = false;
        Context context2 = getContext();
        TypedArray typedArrayE = th1.E(context2, attributeSet, ov0.r, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.o = typedArrayE.getDimensionPixelSize(12, 0);
        int i2 = typedArrayE.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.h = ds.z(i2, mode);
        this.i = ec1.n(getContext(), typedArrayE, 14);
        this.j = ec1.s(getContext(), typedArrayE, 10);
        this.r = typedArrayE.getInteger(11, 1);
        this.l = typedArrayE.getDimensionPixelSize(13, 0);
        xj0 xj0Var = new xj0(this, d41.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Button).a());
        this.f = xj0Var;
        xj0Var.c = typedArrayE.getDimensionPixelOffset(1, 0);
        xj0Var.d = typedArrayE.getDimensionPixelOffset(2, 0);
        xj0Var.e = typedArrayE.getDimensionPixelOffset(3, 0);
        xj0Var.f = typedArrayE.getDimensionPixelOffset(4, 0);
        if (typedArrayE.hasValue(8)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(8, -1);
            xj0Var.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            c41 c41VarE = xj0Var.b.e();
            c41VarE.e = new e2(f);
            c41VarE.f = new e2(f);
            c41VarE.g = new e2(f);
            c41VarE.h = new e2(f);
            xj0Var.c(c41VarE.a());
            xj0Var.p = true;
        }
        xj0Var.h = typedArrayE.getDimensionPixelSize(20, 0);
        xj0Var.i = ds.z(typedArrayE.getInt(7, -1), mode);
        xj0Var.j = ec1.n(getContext(), typedArrayE, 6);
        xj0Var.k = ec1.n(getContext(), typedArrayE, 19);
        xj0Var.l = ec1.n(getContext(), typedArrayE, 16);
        xj0Var.q = typedArrayE.getBoolean(5, false);
        xj0Var.t = typedArrayE.getDimensionPixelSize(9, 0);
        xj0Var.r = typedArrayE.getBoolean(21, true);
        WeakHashMap weakHashMap = oe1.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            xj0Var.o = true;
            setSupportBackgroundTintList(xj0Var.j);
            setSupportBackgroundTintMode(xj0Var.i);
        } else {
            xj0Var.e();
        }
        setPaddingRelative(paddingStart + xj0Var.c, paddingTop + xj0Var.e, paddingEnd + xj0Var.d, paddingBottom + xj0Var.f);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.o);
        c(this.j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        xj0 xj0Var = this.f;
        return (xj0Var == null || xj0Var.o) ? false : true;
    }

    public final void b() {
        int i = this.r;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.j, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.j, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.j, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            Drawable drawableMutate = uj.K(drawable).mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                this.j.setTintMode(mode);
            }
            int intrinsicWidth = this.l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.j;
            int i = this.m;
            int i2 = this.n;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.j.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.r;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.j) || (((i3 == 3 || i3 == 4) && drawable5 != this.j) || ((i3 == 16 || i3 == 32) && drawable4 != this.j))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.j == null || getLayout() == null) {
            return;
        }
        int i3 = this.r;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.m = 0;
                if (i3 == 16) {
                    this.n = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.o) - getPaddingBottom()) / 2);
                if (this.n != iMax) {
                    this.n = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.r;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.m = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.j.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = oe1.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.o) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.r == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.m != paddingEnd) {
            this.m = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        xj0 xj0Var = this.f;
        return ((xj0Var == null || !xj0Var.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.j;
    }

    public int getIconGravity() {
        return this.r;
    }

    public int getIconPadding() {
        return this.o;
    }

    public int getIconSize() {
        return this.l;
    }

    public ColorStateList getIconTint() {
        return this.i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.h;
    }

    public int getInsetBottom() {
        return this.f.f;
    }

    public int getInsetTop() {
        return this.f.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f.l;
        }
        return null;
    }

    public d41 getShapeAppearanceModel() {
        if (a()) {
            return this.f.b;
        }
        nh0.j("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            th1.S(this, this.f.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        xj0 xj0Var = this.f;
        if (xj0Var != null && xj0Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        if (this.p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.p);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        xj0 xj0Var = this.f;
        accessibilityNodeInfo.setCheckable(xj0Var != null && xj0Var.q);
        accessibilityNodeInfo.setChecked(this.p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xj0 xj0Var;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (xj0Var = this.f) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            hk0 hk0Var = xj0Var.m;
            if (hk0Var != null) {
                hk0Var.setBounds(xj0Var.c, xj0Var.e, i6 - xj0Var.d, i5 - xj0Var.f);
            }
        }
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wj0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wj0 wj0Var = (wj0) parcelable;
        super.onRestoreInstanceState(wj0Var.c);
        setChecked(wj0Var.e);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        wj0 wj0Var = new wj0(super.onSaveInstanceState());
        wj0Var.e = this.p;
        return wj0Var;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.j != null) {
            if (this.j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        xj0 xj0Var = this.f;
        if (xj0Var.b(false) != null) {
            xj0Var.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        xj0 xj0Var = this.f;
        xj0Var.o = true;
        MaterialButton materialButton = xj0Var.a;
        materialButton.setSupportBackgroundTintList(xj0Var.j);
        materialButton.setSupportBackgroundTintMode(xj0Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ec1.r(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.f.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        xj0 xj0Var = this.f;
        if (xj0Var == null || !xj0Var.q || !isEnabled() || this.p == z) {
            return;
        }
        this.p = z;
        refreshDrawableState();
        getParent();
        if (this.q) {
            return;
        }
        this.q = true;
        Iterator it = this.g.iterator();
        if (!it.hasNext()) {
            this.q = false;
        } else {
            it.next().getClass();
            id.c();
        }
    }

    public void setCornerRadius(int i) {
        if (a()) {
            xj0 xj0Var = this.f;
            if (xj0Var.p && xj0Var.g == i) {
                return;
            }
            xj0Var.g = i;
            xj0Var.p = true;
            float f = i;
            c41 c41VarE = xj0Var.b.e();
            c41VarE.e = new e2(f);
            c41VarE.f = new e2(f);
            c41VarE.g = new e2(f);
            c41VarE.h = new e2(f);
            xj0Var.c(c41VarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.f.b(false).l(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.j != drawable) {
            this.j = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.r != i) {
            this.r = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.o != i) {
            this.o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? ec1.r(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            id.q("iconSize cannot be less than 0");
        } else if (this.l != i) {
            this.l = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(uj.m(getContext(), i));
    }

    public void setInsetBottom(int i) {
        xj0 xj0Var = this.f;
        xj0Var.d(xj0Var.e, i);
    }

    public void setInsetTop(int i) {
        xj0 xj0Var = this.f;
        xj0Var.d(i, xj0Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            xj0 xj0Var = this.f;
            MaterialButton materialButton = xj0Var.a;
            if (xj0Var.l != colorStateList) {
                xj0Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(zy0.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(uj.m(getContext(), i));
        }
    }

    @Override // defpackage.m41
    public void setShapeAppearanceModel(d41 d41Var) {
        if (a()) {
            this.f.c(d41Var);
        } else {
            nh0.j("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            xj0 xj0Var = this.f;
            xj0Var.n = z;
            xj0Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            xj0 xj0Var = this.f;
            if (xj0Var.k != colorStateList) {
                xj0Var.k = colorStateList;
                xj0Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(uj.m(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            xj0 xj0Var = this.f;
            if (xj0Var.h != i) {
                xj0Var.h = i;
                xj0Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        xj0 xj0Var = this.f;
        if (xj0Var.j != colorStateList) {
            xj0Var.j = colorStateList;
            if (xj0Var.b(false) != null) {
                xj0Var.b(false).setTintList(xj0Var.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        xj0 xj0Var = this.f;
        if (xj0Var.i != mode) {
            xj0Var.i = mode;
            if (xj0Var.b(false) == null || xj0Var.i == null) {
                return;
            }
            xj0Var.b(false).setTintMode(xj0Var.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.p);
    }

    public void setOnPressedChangeListenerInternal(vj0 vj0Var) {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
