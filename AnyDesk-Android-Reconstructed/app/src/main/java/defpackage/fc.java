package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class fc extends bc {
    public final ec g;
    public Drawable h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public boolean k;
    public boolean l;

    public fc(ec ecVar) {
        super(ecVar);
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.g = ecVar;
    }

    public final void A0(Canvas canvas) {
        if (this.h != null) {
            ec ecVar = this.g;
            int max = ecVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.h.getIntrinsicWidth();
                int intrinsicHeight = this.h.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.h.setBounds(-i, -i2, i, i2);
                float width = ((ecVar.getWidth() - ecVar.getPaddingLeft()) - ecVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(ecVar.getPaddingLeft(), ecVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.h.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.bc
    public final void Z(AttributeSet attributeSet, int i) {
        super.Z(attributeSet, R.attr.seekBarStyle);
        ec ecVar = this.g;
        Context context = ecVar.getContext();
        int[] iArr = yv0.g;
        y6 y6VarC = y6.C(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        oe1.m(ecVar, ecVar.getContext(), iArr, attributeSet, (TypedArray) y6VarC.e, R.attr.seekBarStyle);
        Drawable drawableU = y6VarC.u(0);
        if (drawableU != null) {
            ecVar.setThumb(drawableU);
        }
        Drawable drawableT = y6VarC.t(1);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.h = drawableT;
        if (drawableT != null) {
            drawableT.setCallback(ecVar);
            uj.D(drawableT, ecVar.getLayoutDirection());
            if (drawableT.isStateful()) {
                drawableT.setState(ecVar.getDrawableState());
            }
            z0();
        }
        ecVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.j = av.b(typedArray.getInt(3, -1), this.j);
            this.l = true;
        }
        if (typedArray.hasValue(2)) {
            this.i = y6VarC.s(2);
            this.k = true;
        }
        y6VarC.F();
        z0();
    }

    public final void z0() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.k || this.l) {
                Drawable drawableK = uj.K(drawable.mutate());
                this.h = drawableK;
                if (this.k) {
                    drawableK.setTintList(this.i);
                }
                if (this.l) {
                    this.h.setTintMode(this.j);
                }
                if (this.h.isStateful()) {
                    this.h.setState(this.g.getDrawableState());
                }
            }
        }
    }
}
