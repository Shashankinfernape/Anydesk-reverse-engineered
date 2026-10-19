package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bc;
import defpackage.gz0;
import defpackage.lk0;
import defpackage.qv0;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] h = {R.attr.colorBackground};
    public boolean c;
    public boolean d;
    public final Rect e;
    public final Rect f;
    public final bc g;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        bc bcVar = new bc(this);
        this.g = bcVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv0.a, i, com.anydesk.anydeskandroid.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.anydesk.anydeskandroid.R.color.cardview_light_background) : getResources().getColor(com.anydesk.anydeskandroid.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.c = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.d = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        gz0 gz0Var = new gz0(colorStateListValueOf, dimension);
        bcVar.d = gz0Var;
        setBackgroundDrawable(gz0Var);
        setClipToOutline(true);
        setElevation(dimension2);
        lk0.I(bcVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((gz0) this.g.d).h;
    }

    public float getCardElevation() {
        return ((CardView) this.g.e).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return ((gz0) this.g.d).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.d;
    }

    public float getRadius() {
        return ((gz0) this.g.d).a;
    }

    public boolean getUseCompatPadding() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        gz0 gz0Var = (gz0) this.g.d;
        if (colorStateListValueOf == null) {
            gz0Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        gz0Var.h = colorStateListValueOf;
        gz0Var.b.setColor(colorStateListValueOf.getColorForState(gz0Var.getState(), gz0Var.h.getDefaultColor()));
        gz0Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.g.e).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        lk0.I(this.g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.d) {
            this.d = z;
            bc bcVar = this.g;
            lk0.I(bcVar, ((gz0) bcVar.d).e);
        }
    }

    public void setRadius(float f) {
        gz0 gz0Var = (gz0) this.g.d;
        if (f == gz0Var.a) {
            return;
        }
        gz0Var.a = f;
        gz0Var.b(null);
        gz0Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.c != z) {
            this.c = z;
            bc bcVar = this.g;
            lk0.I(bcVar, ((gz0) bcVar.d).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        gz0 gz0Var = (gz0) this.g.d;
        if (colorStateList == null) {
            gz0Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        gz0Var.h = colorStateList;
        gz0Var.b.setColor(colorStateList.getColorForState(gz0Var.getState(), gz0Var.h.getDefaultColor()));
        gz0Var.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
