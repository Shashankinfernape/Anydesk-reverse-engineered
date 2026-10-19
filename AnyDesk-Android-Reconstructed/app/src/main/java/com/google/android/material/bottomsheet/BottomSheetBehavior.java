package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.anydesk.anydeskandroid.R;
import defpackage.af1;
import defpackage.d41;
import defpackage.ec1;
import defpackage.hk0;
import defpackage.id;
import defpackage.nh;
import defpackage.ov0;
import defpackage.rf;
import defpackage.rj0;
import defpackage.vq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends vq implements rj0 {
    public final boolean c;
    public int d;
    public boolean e;
    public final hk0 f;
    public final ColorStateList g;
    public final boolean h;
    public final d41 i;
    public boolean j;
    public final ValueAnimator k;
    public final int l;
    public final boolean m;
    public int n;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.c = true;
        new af1(this);
        this.n = 4;
        new ArrayList();
        new SparseIntArray();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.g = ec1.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.i = d41.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        d41 d41Var = this.i;
        if (d41Var != null) {
            hk0 hk0Var = new hk0(d41Var);
            this.f = hk0Var;
            hk0Var.j(context);
            ColorStateList colorStateList = this.g;
            if (colorStateList != null) {
                this.f.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.k.addUpdateListener(new nh(0, this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            e(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            e(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.m != z) {
            this.m = z;
            if (!z && this.n == 5 && this.n != 4) {
                this.n = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.c != z2) {
            this.c = z2;
            int i2 = (z2 && this.n == 6) ? 3 : this.n;
            if (this.n != i2) {
                this.n = i2;
            }
            f(this.n);
        }
        typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            id.q("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                id.q("offset must be greater than or equal to 0");
                throw null;
            }
            this.l = dimensionPixelOffset;
            f(this.n);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                id.q("offset must be greater than or equal to 0");
                throw null;
            }
            this.l = i3;
            f(this.n);
        }
        typedArrayObtainStyledAttributes.getInt(11, 500);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        typedArrayObtainStyledAttributes.getBoolean(20, true);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.h = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.rj0
    public final void a() {
    }

    @Override // defpackage.rj0
    public final void d() {
    }

    public final void e(int i) {
        boolean z = this.e;
        if (i == -1) {
            if (z) {
                return;
            }
            this.e = true;
        } else if (z || this.d != i) {
            this.e = false;
            this.d = Math.max(0, i);
        }
    }

    public final void f(int i) {
        hk0 hk0Var;
        if (i == 2) {
            return;
        }
        boolean z = this.n == 3 && this.h;
        if (this.j == z || (hk0Var = this.f) == null) {
            return;
        }
        this.j = z;
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            hk0Var.n(this.j ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(hk0Var.c.i, z ? 0.0f : 1.0f);
            valueAnimator.start();
        }
    }

    @Override // defpackage.rj0
    public final void b(rf rfVar) {
    }

    @Override // defpackage.rj0
    public final void c(rf rfVar) {
    }

    public BottomSheetBehavior() {
        this.c = true;
        new af1(this);
        this.n = 4;
        new ArrayList();
        new SparseIntArray();
    }
}
