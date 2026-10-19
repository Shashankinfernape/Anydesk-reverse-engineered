package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import defpackage.ec1;
import defpackage.hk0;
import defpackage.lk0;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.th1;
import defpackage.uj;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public final hk0 c;
    public int d;
    public int e;
    public int f;
    public int g;

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(lk0.N(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.c = new hk0();
        TypedArray typedArrayE = th1.E(context2, attributeSet, ov0.u, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.d = typedArrayE.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f = typedArrayE.getDimensionPixelOffset(2, 0);
        this.g = typedArrayE.getDimensionPixelOffset(1, 0);
        setDividerColor(ec1.n(context2, typedArrayE, 0).getDefaultColor());
        typedArrayE.recycle();
    }

    public int getDividerColor() {
        return this.e;
    }

    public int getDividerInsetEnd() {
        return this.g;
    }

    public int getDividerInsetStart() {
        return this.f;
    }

    public int getDividerThickness() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = oe1.a;
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.g : this.f;
        if (z) {
            width = getWidth();
            i = this.f;
        } else {
            width = getWidth();
            i = this.g;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        hk0 hk0Var = this.c;
        hk0Var.setBounds(i2, 0, i3, bottom);
        hk0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.d;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.e != i) {
            this.e = i;
            this.c.m(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(uj.l(getContext(), i));
    }

    public void setDividerInsetEnd(int i) {
        this.g = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
