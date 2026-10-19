package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends hk0 implements Drawable.Callback, n91 {
    public static final int[] H0 = {R.attr.state_enabled};
    public static final ShapeDrawable I0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public int[] A0;
    public float B;
    public ColorStateList B0;
    public float C;
    public WeakReference C0;
    public ColorStateList D;
    public TextUtils.TruncateAt D0;
    public float E;
    public boolean E0;
    public ColorStateList F;
    public int F0;
    public CharSequence G;
    public boolean G0;
    public boolean H;
    public Drawable I;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public RippleDrawable O;
    public ColorStateList P;
    public float Q;
    public SpannableStringBuilder R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public im0 W;
    public im0 X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final Context g0;
    public final Paint h0;
    public final Paint.FontMetrics i0;
    public final RectF j0;
    public final PointF k0;
    public final Path l0;
    public final o91 m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public ColorFilter w0;
    public PorterDuffColorFilter x0;
    public ColorStateList y0;
    public ColorStateList z;
    public PorterDuff.Mode z0;

    public tl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action);
        this.C = -1.0f;
        this.h0 = new Paint(1);
        this.i0 = new Paint.FontMetrics();
        this.j0 = new RectF();
        this.k0 = new PointF();
        this.l0 = new Path();
        this.v0 = 255;
        this.z0 = PorterDuff.Mode.SRC_IN;
        this.C0 = new WeakReference(null);
        j(context);
        this.g0 = context;
        o91 o91Var = new o91(this);
        this.m0 = o91Var;
        this.G = "";
        o91Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = H0;
        setState(iArr);
        if (!Arrays.equals(this.A0, iArr)) {
            this.A0 = iArr;
            if (X()) {
                A(getState(), iArr);
            }
        }
        this.E0 = true;
        int[] iArr2 = zy0.a;
        I0.setTint(-1);
    }

    public static void Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean x(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final boolean A(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.z;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.n0) : 0);
        boolean state = true;
        if (this.n0 != iC) {
            this.n0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.A;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.o0) : 0);
        if (this.o0 != iC2) {
            this.o0 = iC2;
            zOnStateChange = true;
        }
        int iB = cn.b(iC2, iC);
        if ((this.p0 != iB) | (this.c.c == null)) {
            this.p0 = iB;
            m(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.D;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.q0) : 0;
        if (this.q0 != colorForState) {
            this.q0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.B0 == null || !zy0.b(iArr)) ? 0 : this.B0.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState2) {
            this.r0 = colorForState2;
        }
        l91 l91Var = this.m0.g;
        int colorForState3 = (l91Var == null || (colorStateList = l91Var.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState3) {
            this.s0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.S) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.t0 == z || this.U == null) {
            z2 = false;
        } else {
            float fU = u();
            this.t0 = z;
            if (fU != u()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.y0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.u0) : 0;
        if (this.u0 != colorForState4) {
            this.u0 = colorForState4;
            ColorStateList colorStateList6 = this.y0;
            PorterDuff.Mode mode = this.z0;
            this.x0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (y(this.I)) {
            state |= this.I.setState(iArr);
        }
        if (y(this.U)) {
            state |= this.U.setState(iArr);
        }
        if (y(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.N.setState(iArr3);
        }
        int[] iArr4 = zy0.a;
        if (y(this.O)) {
            state |= this.O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            z();
        }
        return state;
    }

    public final void B(boolean z) {
        if (this.S != z) {
            this.S = z;
            float fU = u();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void C(Drawable drawable) {
        if (this.U != drawable) {
            float fU = u();
            this.U = drawable;
            float fU2 = u();
            Y(this.U);
            s(this.U);
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T && (drawable = this.U) != null && this.S) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.T != z) {
            boolean zV = V();
            this.T = z;
            boolean zV2 = V();
            if (zV != zV2) {
                Drawable drawable = this.U;
                if (zV2) {
                    s(drawable);
                } else {
                    Y(drawable);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void F(float f) {
        if (this.C != f) {
            this.C = f;
            c41 c41VarE = this.c.a.e();
            c41VarE.e = new e2(f);
            c41VarE.f = new e2(f);
            c41VarE.g = new e2(f);
            c41VarE.h = new e2(f);
            setShapeAppearanceModel(c41VarE.a());
        }
    }

    public final void G(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof nh1) {
            drawable2 = ((nh1) drawable2).h;
        }
        if (drawable2 != drawable) {
            float fU = u();
            this.I = drawable != null ? uj.K(drawable).mutate() : null;
            float fU2 = u();
            Y(drawable2);
            if (W()) {
                s(this.I);
            }
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void H(float f) {
        if (this.K != f) {
            float fU = u();
            this.K = f;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (W()) {
                this.I.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z) {
        if (this.H != z) {
            boolean zW = W();
            this.H = z;
            boolean zW2 = W();
            if (zW != zW2) {
                Drawable drawable = this.I;
                if (zW2) {
                    s(drawable);
                } else {
                    Y(drawable);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.G0) {
                gk0 gk0Var = this.c;
                if (gk0Var.d != colorStateList) {
                    gk0Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void L(float f) {
        if (this.E != f) {
            this.E = f;
            this.h0.setStrokeWidth(f);
            if (this.G0) {
                this.c.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void M(Drawable drawable) {
        Drawable drawable2 = this.N;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof nh1) {
            drawable2 = ((nh1) drawable2).h;
        }
        if (drawable2 != drawable) {
            float fV = v();
            this.N = drawable != null ? uj.K(drawable).mutate() : null;
            int[] iArr = zy0.a;
            this.O = new RippleDrawable(zy0.a(this.F), this.N, I0);
            float fV2 = v();
            Y(drawable2);
            if (X()) {
                s(this.N);
            }
            invalidateSelf();
            if (fV != fV2) {
                z();
            }
        }
    }

    public final void N(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void O(float f) {
        if (this.Q != f) {
            this.Q = f;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void P(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (X()) {
                this.N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z) {
        if (this.M != z) {
            boolean zX = X();
            this.M = z;
            boolean zX2 = X();
            if (zX != zX2) {
                Drawable drawable = this.N;
                if (zX2) {
                    s(drawable);
                } else {
                    Y(drawable);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void S(float f) {
        if (this.a0 != f) {
            float fU = u();
            this.a0 = f;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void T(float f) {
        if (this.Z != f) {
            float fU = u();
            this.Z = f;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            this.B0 = null;
            onStateChange(getState());
        }
    }

    public final boolean V() {
        return this.T && this.U != null && this.t0;
    }

    public final boolean W() {
        return this.H && this.I != null;
    }

    public final boolean X() {
        return this.M && this.N != null;
    }

    @Override // defpackage.n91
    public final void a() {
        z();
        invalidateSelf();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7311. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fU = u() + this.Y + this.b0;
        String string = this.G.toString();
        o91 o91Var = this.m0;
        if (o91Var.e) {
            o91Var.a(string);
        }
        return Math.min(Math.round(v() + o91Var.c + fU + this.c0 + this.f0), this.F0);
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.G0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
            outline2 = outline;
        }
        outline2.setAlpha(this.v0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (x(this.z) || x(this.A) || x(this.D)) {
            return true;
        }
        l91 l91Var = this.m0.g;
        if (l91Var == null || (colorStateList = l91Var.j) == null || !colorStateList.isStateful()) {
            return (this.T && this.U != null && this.S) || y(this.I) || y(this.U) || x(this.y0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (W()) {
            zOnLayoutDirectionChanged |= uj.D(this.I, i);
        }
        if (V()) {
            zOnLayoutDirectionChanged |= uj.D(this.U, i);
        }
        if (X()) {
            zOnLayoutDirectionChanged |= uj.D(this.N, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (W()) {
            zOnLevelChange |= this.I.setLevel(i);
        }
        if (V()) {
            zOnLevelChange |= this.U.setLevel(i);
        }
        if (X()) {
            zOnLevelChange |= this.N.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.G0) {
            super.onStateChange(iArr);
        }
        return A(iArr, this.A0);
    }

    public final void s(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        uj.D(drawable, uj.o(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.A0);
            }
            drawable.setTintList(this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            drawable2.setTintList(this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.z0 != mode) {
            this.z0 = mode;
            ColorStateList colorStateList = this.y0;
            this.x0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (W()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (V()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (X()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (W() || V()) {
            float f = this.Y + this.Z;
            Drawable drawable = this.t0 ? this.U : this.I;
            float intrinsicWidth = this.K;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (uj.o(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.t0 ? this.U : this.I;
            float fCeil = this.K;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.g0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float u() {
        if (!W() && !V()) {
            return 0.0f;
        }
        float f = this.Z;
        Drawable drawable = this.t0 ? this.U : this.I;
        float intrinsicWidth = this.K;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.a0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (X()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public final float w() {
        return this.G0 ? h() : this.C;
    }

    public final void z() {
        sl slVar = (sl) this.C0.get();
        if (slVar != null) {
            Chip chip = (Chip) slVar;
            chip.b(chip.s);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }
}
