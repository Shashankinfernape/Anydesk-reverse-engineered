package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ak0 {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;
    public final MaterialCardView a;
    public final hk0 c;
    public final hk0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public d41 m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public hk0 q;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public ak0(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.a = materialCardView;
        hk0 hk0Var = new hk0(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.c = hk0Var;
        hk0Var.j(materialCardView.getContext());
        hk0Var.o();
        c41 c41VarE = hk0Var.c.a.e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ov0.f, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            c41VarE.e = new e2(dimension);
            c41VarE.f = new e2(dimension);
            c41VarE.g = new e2(dimension);
            c41VarE.h = new e2(dimension);
        }
        this.d = new hk0();
        h(c41VarE.a());
        this.u = lk0.H(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, x8.a);
        this.v = lk0.G(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.w = lk0.G(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(r71 r71Var, float f) {
        if (r71Var instanceof iz0) {
            return (float) ((1.0d - y) * ((double) f));
        }
        if (r71Var instanceof wr) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        r71 r71Var = this.m.a;
        hk0 hk0Var = this.c;
        return Math.max(Math.max(b(r71Var, hk0Var.h()), b(this.m.b, hk0Var.c.a.f.a(hk0Var.g()))), Math.max(b(this.m.c, hk0Var.c.a.g.a(hk0Var.g())), b(this.m.d, hk0Var.c.a.h.a(hk0Var.g()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            int[] iArr = zy0.a;
            this.q = new hk0(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final zj0 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new zj0(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.g;
            boolean z2 = (i5 & 8388613) == 8388613;
            int i6 = this.e;
            int i7 = z2 ? ((i - i6) - this.f) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.f) - iCeil;
            }
            int i10 = i6;
            WeakHashMap weakHashMap = oe1.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.p.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.x;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new kv(2, this));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = uj.K(drawable).mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.l);
            f(this.a.k, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(d41 d41Var) {
        this.m = d41Var;
        hk0 hk0Var = this.c;
        hk0Var.setShapeAppearanceModel(d41Var);
        hk0Var.x = !hk0Var.k();
        hk0 hk0Var2 = this.d;
        if (hk0Var2 != null) {
            hk0Var2.setShapeAppearanceModel(d41Var);
        }
        hk0 hk0Var3 = this.q;
        if (hk0Var3 != null) {
            hk0Var3.setShapeAppearanceModel(d41Var);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.k() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable drawableC = j() ? c() : this.d;
        this.i = drawableC;
        if (drawable != drawableC) {
            int i = Build.VERSION.SDK_INT;
            MaterialCardView materialCardView = this.a;
            if (i < 23 || !(materialCardView.getForeground() instanceof InsetDrawable)) {
                materialCardView.setForeground(d(drawableC));
            } else {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.k()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.e.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        bc bcVar = materialCardView.g;
        CardView cardView = (CardView) bcVar.e;
        if (!cardView.getUseCompatPadding()) {
            bcVar.i0(0, 0, 0, 0);
            return;
        }
        gz0 gz0Var = (gz0) bcVar.d;
        float f = gz0Var.e;
        float f2 = gz0Var.a;
        int iCeil = (int) Math.ceil(hz0.a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(hz0.b(f, f2, cardView.getPreventCornerOverlap()));
        bcVar.i0(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
