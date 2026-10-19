package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import defpackage.a2;
import defpackage.ag1;
import defpackage.d41;
import defpackage.ds;
import defpackage.ec1;
import defpackage.ev;
import defpackage.id;
import defpackage.im0;
import defpackage.lk0;
import defpackage.ly;
import defpackage.m41;
import defpackage.mh;
import defpackage.ov0;
import defpackage.p10;
import defpackage.q10;
import defpackage.r10;
import defpackage.tb;
import defpackage.th1;
import defpackage.uj;
import defpackage.vq;
import defpackage.xb;
import defpackage.zy0;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends ag1 implements m41 {
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public final Rect n;
    public final Rect o;
    public final xb p;
    public final a2 q;
    public r10 r;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        super(lk0.N(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = getVisibility();
        this.n = new Rect();
        this.o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = th1.E(context2, attributeSet, ov0.l, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.d = ec1.n(context2, typedArrayE, 1);
        this.e = ds.z(typedArrayE.getInt(2, -1), null);
        this.h = ec1.n(context2, typedArrayE, 12);
        this.i = typedArrayE.getInt(7, -1);
        this.j = typedArrayE.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayE.getDimensionPixelSize(3, 0);
        float dimension = typedArrayE.getDimension(4, 0.0f);
        float dimension2 = typedArrayE.getDimension(9, 0.0f);
        float dimension3 = typedArrayE.getDimension(11, 0.0f);
        this.m = typedArrayE.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayE.getDimensionPixelSize(10, 0));
        im0 im0VarA = im0.a(context2, typedArrayE, 15);
        im0 im0VarA2 = im0.a(context2, typedArrayE, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ov0.w, i, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        d41 d41VarA = d41.a(context2, resourceId, resourceId2, d41.m).a();
        boolean z = typedArrayE.getBoolean(5, false);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        xb xbVar = new xb(this);
        this.p = xbVar;
        xbVar.d(attributeSet, i);
        this.q = new a2(this);
        getImpl().c(d41VarA);
        p10 impl = getImpl();
        ColorStateList colorStateList = this.d;
        PorterDuff.Mode mode = this.e;
        ColorStateList colorStateList2 = this.h;
        r10 r10Var = (r10) impl;
        FloatingActionButton floatingActionButton = r10Var.o;
        d41 d41Var = r10Var.a;
        d41Var.getClass();
        q10 q10Var = new q10(d41Var);
        r10Var.b = q10Var;
        q10Var.setTintList(colorStateList);
        if (mode != null) {
            r10Var.b.setTintMode(mode);
        }
        r10Var.b.j(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            d41 d41Var2 = r10Var.a;
            d41Var2.getClass();
            mh mhVar = new mh(d41Var2);
            int iL = uj.l(context3, R.color.design_fab_stroke_top_outer_color);
            int iL2 = uj.l(context3, R.color.design_fab_stroke_top_inner_color);
            int iL3 = uj.l(context3, R.color.design_fab_stroke_end_inner_color);
            int iL4 = uj.l(context3, R.color.design_fab_stroke_end_outer_color);
            mhVar.i = iL;
            mhVar.j = iL2;
            mhVar.k = iL3;
            mhVar.l = iL4;
            float f = dimensionPixelSize;
            if (mhVar.h != f) {
                mhVar.h = f;
                mhVar.b.setStrokeWidth(f * 1.3333f);
                mhVar.n = true;
                mhVar.invalidateSelf();
            }
            if (colorStateList != null) {
                mhVar.m = colorStateList.getColorForState(mhVar.getState(), mhVar.m);
            }
            mhVar.p = colorStateList;
            mhVar.n = true;
            mhVar.invalidateSelf();
            r10Var.d = mhVar;
            mh mhVar2 = r10Var.d;
            mhVar2.getClass();
            q10 q10Var2 = r10Var.b;
            q10Var2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{mhVar2, q10Var2});
            drawable = null;
        } else {
            drawable = null;
            r10Var.d = null;
            layerDrawable = r10Var.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(zy0.a(colorStateList2), layerDrawable, drawable);
        r10Var.c = rippleDrawable;
        r10Var.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        p10 impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.b(dimension, impl2.i, impl2.j);
        }
        p10 impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.b(impl3.h, dimension2, impl3.j);
        }
        p10 impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.b(impl4.h, impl4.i, dimension3);
        }
        getImpl().l = im0VarA;
        getImpl().m = im0VarA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private p10 getImpl() {
        if (this.r == null) {
            this.r = new r10(this, new ev(8, this));
        }
        return this.r;
    }

    public final int b(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? b(1) : b(0);
    }

    public final void c() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f;
        if (colorStateList == null) {
            uj.g(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.g;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(tb.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p10 impl = getImpl();
        getDrawableState();
        r10 r10Var = (r10) impl;
        FloatingActionButton floatingActionButton = r10Var.o;
        if (Build.VERSION.SDK_INT == 21) {
            if (!floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(0.0f);
                floatingActionButton.setTranslationZ(0.0f);
                return;
            }
            floatingActionButton.setElevation(r10Var.h);
            if (floatingActionButton.isPressed()) {
                floatingActionButton.setTranslationZ(r10Var.j);
            } else if (floatingActionButton.isFocused() || floatingActionButton.isHovered()) {
                floatingActionButton.setTranslationZ(r10Var.i);
            } else {
                floatingActionButton.setTranslationZ(0.0f);
            }
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.d;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.e;
    }

    public vq getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return ((r10) getImpl()).o.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.j;
    }

    public int getExpandedComponentIdHint() {
        return this.q.d;
    }

    public im0 getHideMotionSpec() {
        return getImpl().m;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.h;
    }

    public d41 getShapeAppearanceModel() {
        d41 d41Var = getImpl().a;
        d41Var.getClass();
        return d41Var;
    }

    public im0 getShowMotionSpec() {
        return getImpl().l;
    }

    public int getSize() {
        return this.i;
    }

    public int getSizeDimension() {
        return b(this.i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.g;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p10 impl = getImpl();
        q10 q10Var = impl.b;
        if (q10Var != null) {
            th1.S(impl.o, q10Var);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().o.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.k = (sizeDimension - this.l) / 2;
        getImpl().e();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ly)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ly lyVar = (ly) parcelable;
        super.onRestoreInstanceState(lyVar.c);
        Bundle bundle = (Bundle) lyVar.e.get("expandableWidgetHelper");
        bundle.getClass();
        a2 a2Var = this.q;
        a2Var.getClass();
        a2Var.c = bundle.getBoolean("expanded", false);
        a2Var.d = bundle.getInt("expandedComponentIdHint", 0);
        if (a2Var.c) {
            ((FloatingActionButton) a2Var.e).getParent();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ly lyVar = new ly(parcelableOnSaveInstanceState);
        a2 a2Var = this.q;
        a2Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", a2Var.c);
        bundle.putInt("expandedComponentIdHint", a2Var.d);
        lyVar.e.put("expandableWidgetHelper", bundle);
        return lyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.o;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.n;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            r10 r10Var = this.r;
            int i2 = -(r10Var.f ? Math.max((r10Var.k - r10Var.o.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            p10 impl = getImpl();
            q10 q10Var = impl.b;
            if (q10Var != null) {
                q10Var.setTintList(colorStateList);
            }
            mh mhVar = impl.d;
            if (mhVar != null) {
                if (colorStateList != null) {
                    mhVar.m = colorStateList.getColorForState(mhVar.getState(), mhVar.m);
                }
                mhVar.p = colorStateList;
                mhVar.n = true;
                mhVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            q10 q10Var = getImpl().b;
            if (q10Var != null) {
                q10Var.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        p10 impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.b(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        p10 impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.b(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        p10 impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.b(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            id.q("Custom size must be non-negative");
        } else if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        q10 q10Var = getImpl().b;
        if (q10Var != null) {
            q10Var.l(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.q.d = i;
    }

    public void setHideMotionSpec(im0 im0Var) {
        getImpl().m = im0Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(im0.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().d();
            if (this.f != null) {
                c();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.p.g(i);
        c();
    }

    public void setMaxImageSize(int i) {
        this.l = i;
        p10 impl = getImpl();
        if (impl.n != i) {
            impl.n = i;
            impl.d();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            p10 impl = getImpl();
            ColorStateList colorStateList2 = this.h;
            RippleDrawable rippleDrawable = ((r10) impl).c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(zy0.a(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(zy0.a(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        p10 impl = getImpl();
        impl.g = z;
        impl.e();
    }

    @Override // defpackage.m41
    public void setShapeAppearanceModel(d41 d41Var) {
        getImpl().c(d41Var);
    }

    public void setShowMotionSpec(im0 im0Var) {
        getImpl().l = im0Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(im0.b(getContext(), i));
    }

    public void setSize(int i) {
        this.j = 0;
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            c();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().getClass();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            ((r10) getImpl()).e();
        }
    }

    @Override // defpackage.ag1, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends vq {
        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.m);
            typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public BaseBehavior() {
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
