package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.am;
import defpackage.c90;
import defpackage.cm;
import defpackage.dg;
import defpackage.dm;
import defpackage.ec1;
import defpackage.eg;
import defpackage.nt;
import defpackage.ov0;
import defpackage.qd1;
import defpackage.th1;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends dg {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        dm dmVar = (dm) this.c;
        am amVar = new am(dmVar);
        Context context2 = getContext();
        c90 c90Var = new c90(context2, dmVar, amVar, new cm(dmVar));
        c90Var.p = qd1.a(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(c90Var);
        setProgressDrawable(new nt(getContext(), dmVar, amVar));
    }

    @Override // defpackage.dg
    public final eg a(Context context, AttributeSet attributeSet) {
        dm dmVar = new dm(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        th1.b(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = ov0.j;
        th1.e(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        dmVar.h = Math.max(ec1.p(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), dmVar.a * 2);
        dmVar.i = ec1.p(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        dmVar.j = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        dmVar.a();
        return dmVar;
    }

    public int getIndicatorDirection() {
        return ((dm) this.c).j;
    }

    public int getIndicatorInset() {
        return ((dm) this.c).i;
    }

    public int getIndicatorSize() {
        return ((dm) this.c).h;
    }

    public void setIndicatorDirection(int i) {
        ((dm) this.c).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        eg egVar = this.c;
        if (((dm) egVar).i != i) {
            ((dm) egVar).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        eg egVar = this.c;
        if (((dm) egVar).h != iMax) {
            ((dm) egVar).h = iMax;
            ((dm) egVar).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.dg
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((dm) this.c).a();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
