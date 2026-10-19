package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class jd1 extends md1 {
    public y7 d;
    public float e;
    public y7 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // defpackage.ld1
    public final boolean a() {
        return this.f.f() || this.d.f();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.ld1
    public final boolean b(int[] iArr) {
        boolean z;
        y7 y7Var = this.f;
        boolean z2 = true;
        if (y7Var.f()) {
            ColorStateList colorStateList = (ColorStateList) y7Var.e;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != y7Var.c) {
                y7Var.c = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        y7 y7Var2 = this.d;
        if (y7Var2.f()) {
            ColorStateList colorStateList2 = (ColorStateList) y7Var2.e;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != y7Var2.c) {
                y7Var2.c = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.c;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.c;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.c = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.c = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
