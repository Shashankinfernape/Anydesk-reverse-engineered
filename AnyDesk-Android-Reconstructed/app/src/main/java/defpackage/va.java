package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class va {
    public ColorStateList a = null;
    public PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public final TextView f;

    public /* synthetic */ va(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableO = bu0.o(compoundButton);
        if (drawableO != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = uj.K(drawableO).mutate();
                if (this.c) {
                    drawableMutate.setTintList(this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode(this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        ua uaVar = (ua) this.f;
        Drawable checkMarkDrawable = uaVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = uj.K(checkMarkDrawable).mutate();
                if (this.c) {
                    drawableMutate.setTintList(this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode(this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(uaVar.getDrawableState());
                }
                uaVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = yv0.m;
        y6 y6VarC = y6.C(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        oe1.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) y6VarC.e, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ec1.r(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(ec1.r(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(ec1.r(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(y6VarC.s(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(av.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            y6VarC.F();
        }
    }
}
