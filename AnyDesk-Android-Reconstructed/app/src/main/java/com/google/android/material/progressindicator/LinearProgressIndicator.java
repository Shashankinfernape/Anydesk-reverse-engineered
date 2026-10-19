package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.c90;
import defpackage.dg;
import defpackage.eg;
import defpackage.lf0;
import defpackage.mf0;
import defpackage.nh0;
import defpackage.nt;
import defpackage.oe1;
import defpackage.of0;
import defpackage.ov0;
import defpackage.th1;
import defpackage.vf0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends dg {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        vf0 vf0Var = (vf0) this.c;
        lf0 lf0Var = new lf0(vf0Var);
        lf0Var.b = 300.0f;
        Context context2 = getContext();
        setIndeterminateDrawable(new c90(context2, vf0Var, lf0Var, vf0Var.h == 0 ? new mf0(vf0Var) : new of0(context2, vf0Var)));
        setProgressDrawable(new nt(getContext(), vf0Var, lf0Var));
    }

    @Override // defpackage.dg
    public final eg a(Context context, AttributeSet attributeSet) {
        vf0 vf0Var = new vf0(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        th1.b(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = ov0.p;
        th1.e(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        vf0Var.h = typedArrayObtainStyledAttributes.getInt(0, 1);
        vf0Var.i = typedArrayObtainStyledAttributes.getInt(1, 0);
        vf0Var.k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), vf0Var.a);
        typedArrayObtainStyledAttributes.recycle();
        vf0Var.a();
        vf0Var.j = vf0Var.i == 1;
        return vf0Var;
    }

    @Override // defpackage.dg
    public final void b(int i) {
        eg egVar = this.c;
        if (egVar != null && ((vf0) egVar).h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i);
    }

    public int getIndeterminateAnimationType() {
        return ((vf0) this.c).h;
    }

    public int getIndicatorDirection() {
        return ((vf0) this.c).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((vf0) this.c).k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        eg egVar = this.c;
        vf0 vf0Var = (vf0) egVar;
        boolean z2 = true;
        if (((vf0) egVar).i != 1) {
            WeakHashMap weakHashMap = oe1.a;
            if ((getLayoutDirection() != 1 || ((vf0) egVar).i != 2) && (getLayoutDirection() != 0 || ((vf0) egVar).i != 3)) {
                z2 = false;
            }
        }
        vf0Var.j = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        c90 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        nt progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        eg egVar = this.c;
        if (((vf0) egVar).h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            nh0.j("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((vf0) egVar).h = i;
        ((vf0) egVar).a();
        if (i == 0) {
            c90 indeterminateDrawable = getIndeterminateDrawable();
            mf0 mf0Var = new mf0((vf0) egVar);
            indeterminateDrawable.o = mf0Var;
            mf0Var.a = indeterminateDrawable;
        } else {
            c90 indeterminateDrawable2 = getIndeterminateDrawable();
            of0 of0Var = new of0(getContext(), (vf0) egVar);
            indeterminateDrawable2.o = of0Var;
            of0Var.a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // defpackage.dg
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((vf0) this.c).a();
    }

    public void setIndicatorDirection(int i) {
        eg egVar = this.c;
        ((vf0) egVar).i = i;
        vf0 vf0Var = (vf0) egVar;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = oe1.a;
            if ((getLayoutDirection() != 1 || ((vf0) egVar).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        vf0Var.j = z;
        invalidate();
    }

    @Override // defpackage.dg
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((vf0) this.c).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        eg egVar = this.c;
        if (((vf0) egVar).k != i) {
            ((vf0) egVar).k = Math.min(i, ((vf0) egVar).a);
            ((vf0) egVar).a();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
