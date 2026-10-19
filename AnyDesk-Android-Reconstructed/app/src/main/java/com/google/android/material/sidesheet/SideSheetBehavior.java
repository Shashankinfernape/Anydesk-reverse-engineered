package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.anydesk.anydeskandroid.R;
import defpackage.d41;
import defpackage.ec1;
import defpackage.hk0;
import defpackage.ov0;
import defpackage.rf;
import defpackage.rj0;
import defpackage.vq;
import defpackage.xt0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends vq implements rj0 {
    public final hk0 c;
    public final ColorStateList d;
    public final d41 e;
    public int f;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new xt0(this);
        this.f = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.D);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.d = ec1.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.e = d41.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        d41 d41Var = this.e;
        if (d41Var != null) {
            hk0 hk0Var = new hk0(d41Var);
            this.c = hk0Var;
            hk0Var.j(context);
            ColorStateList colorStateList = this.d;
            if (colorStateList != null) {
                this.c.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.c.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.rj0
    public final void a() {
    }

    @Override // defpackage.rj0
    public final void d() {
    }

    @Override // defpackage.rj0
    public final void b(rf rfVar) {
    }

    @Override // defpackage.rj0
    public final void c(rf rfVar) {
    }

    public SideSheetBehavior() {
        new xt0(this);
        this.f = 5;
        new LinkedHashSet();
    }
}
