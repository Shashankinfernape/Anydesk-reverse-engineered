package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class p10 {
    public d41 a;
    public q10 b;
    public RippleDrawable c;
    public mh d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public im0 l;
    public im0 m;
    public int n;
    public final FloatingActionButton o;
    public final ev p;
    public static final qy u = x8.c;
    public static final int[] v = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] w = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] x = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] y = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] z = {R.attr.state_enabled};
    public static final int[] A = new int[0];
    public boolean g = true;
    public final Rect q = new Rect();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final Matrix t = new Matrix();

    public p10(FloatingActionButton floatingActionButton, ev evVar) {
        this.o = floatingActionButton;
        this.p = evVar;
        ui0 ui0Var = new ui0(13);
        r10 r10Var = (r10) this;
        ui0Var.b(a(new n10(r10Var, 1)));
        int i = 0;
        ui0Var.b(a(new n10(r10Var, i)));
        ui0Var.b(a(new n10(r10Var, i)));
        ui0Var.b(a(new n10(r10Var, i)));
        ui0Var.b(a(new n10(r10Var, 2)));
        ui0Var.b(a(new m10(r10Var)));
        floatingActionButton.getRotation();
    }

    public static ValueAnimator a(o10 o10Var) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(u);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(o10Var);
        valueAnimator.addUpdateListener(o10Var);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public abstract void b(float f, float f2, float f3);

    public final void c(d41 d41Var) {
        this.a = d41Var;
        q10 q10Var = this.b;
        if (q10Var != null) {
            q10Var.setShapeAppearanceModel(d41Var);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof m41) {
            ((m41) callback).setShapeAppearanceModel(d41Var);
        }
        mh mhVar = this.d;
        if (mhVar != null) {
            mhVar.o = d41Var;
            mhVar.invalidateSelf();
        }
    }

    public final void d() {
        Matrix matrix = this.t;
        matrix.reset();
        FloatingActionButton floatingActionButton = this.o;
        Drawable drawable = floatingActionButton.getDrawable();
        if (drawable != null && this.n != 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float f = this.n;
            RectF rectF2 = this.s;
            rectF2.set(0.0f, 0.0f, f, f);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f2 = this.n / 2.0f;
            matrix.postScale(1.0f, 1.0f, f2, f2);
        }
        floatingActionButton.setImageMatrix(matrix);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final void e() {
        r10 r10Var = (r10) this;
        ev evVar = r10Var.p;
        boolean z2 = ((FloatingActionButton) evVar.d).m;
        boolean z3 = r10Var.f;
        Rect rect = this.q;
        FloatingActionButton floatingActionButton = r10Var.o;
        if (z2) {
            int iMax = z3 ? Math.max((r10Var.k - floatingActionButton.getSizeDimension()) / 2, 0) : 0;
            float elevation = r10Var.g ? floatingActionButton.getElevation() + r10Var.j : 0.0f;
            int iMax2 = Math.max(iMax, (int) Math.ceil(elevation));
            int iMax3 = Math.max(iMax, (int) Math.ceil(elevation * 1.5f));
            rect.set(iMax2, iMax3, iMax2, iMax3);
        } else if (z3) {
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = r10Var.k;
            if (sizeDimension >= i) {
                rect.set(0, 0, 0, 0);
            } else {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        r71.i(this.e, "Didn't initialize content background");
        boolean z4 = ((FloatingActionButton) evVar.d).m;
        ev evVar2 = this.p;
        if (z4 || (r10Var.f && floatingActionButton.getSizeDimension() < r10Var.k)) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(rippleDrawable);
            } else {
                evVar2.getClass();
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) evVar2.d;
        floatingActionButton2.n.set(i2, i3, i4, i5);
        int i6 = floatingActionButton2.k;
        floatingActionButton2.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }
}
