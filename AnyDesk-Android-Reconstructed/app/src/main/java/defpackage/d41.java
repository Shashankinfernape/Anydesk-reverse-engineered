package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class d41 {
    public static final rx0 m = new rx0(0.5f);
    public r71 a = new iz0();
    public r71 b = new iz0();
    public r71 c = new iz0();
    public r71 d = new iz0();
    public yq e = new e2(0.0f);
    public yq f = new e2(0.0f);
    public yq g = new e2(0.0f);
    public yq h = new e2(0.0f);
    public fw i;
    public fw j;
    public fw k;
    public fw l;

    public d41() {
        int i = 0;
        this.i = new fw(i);
        this.j = new fw(i);
        this.k = new fw(i);
        this.l = new fw(i);
    }

    public static c41 a(Context context, int i, int i2, yq yqVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ov0.C);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            yq yqVarC = c(typedArrayObtainStyledAttributes, 5, yqVar);
            yq yqVarC2 = c(typedArrayObtainStyledAttributes, 8, yqVarC);
            yq yqVarC3 = c(typedArrayObtainStyledAttributes, 9, yqVarC);
            yq yqVarC4 = c(typedArrayObtainStyledAttributes, 7, yqVarC);
            yq yqVarC5 = c(typedArrayObtainStyledAttributes, 6, yqVarC);
            c41 c41Var = new c41();
            c41Var.a = th1.n(i4);
            c41Var.e = yqVarC2;
            c41Var.b = th1.n(i5);
            c41Var.f = yqVarC3;
            c41Var.c = th1.n(i6);
            c41Var.g = yqVarC4;
            c41Var.d = th1.n(i7);
            c41Var.h = yqVarC5;
            return c41Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static c41 b(Context context, AttributeSet attributeSet, int i, int i2) {
        e2 e2Var = new e2(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.w, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, e2Var);
    }

    public static yq c(TypedArray typedArray, int i, yq yqVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new e2(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new rx0(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return yqVar;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(fw.class) && this.j.getClass().equals(fw.class) && this.i.getClass().equals(fw.class) && this.k.getClass().equals(fw.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof iz0) && (this.a instanceof iz0) && (this.c instanceof iz0) && (this.d instanceof iz0));
    }

    public final c41 e() {
        c41 c41Var = new c41();
        c41Var.a = this.a;
        c41Var.b = this.b;
        c41Var.c = this.c;
        c41Var.d = this.d;
        c41Var.e = this.e;
        c41Var.f = this.f;
        c41Var.g = this.g;
        c41Var.h = this.h;
        c41Var.i = this.i;
        c41Var.j = this.j;
        c41Var.k = this.k;
        c41Var.l = this.l;
        return c41Var;
    }
}
