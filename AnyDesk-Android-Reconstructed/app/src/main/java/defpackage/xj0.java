package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xj0 {
    public static final boolean u;
    public final MaterialButton a;
    public d41 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public hk0 m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    static {
        u = Build.VERSION.SDK_INT <= 22;
    }

    public xj0(MaterialButton materialButton, d41 d41Var) {
        this.a = materialButton;
        this.b = d41Var;
    }

    public final m41 a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.s;
        return numberOfLayers > 2 ? (m41) rippleDrawable2.getDrawable(2) : (m41) rippleDrawable2.getDrawable(1);
    }

    public final hk0 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (hk0) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(d41 d41Var) {
        this.b = d41Var;
        if (!u || this.o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(d41Var);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(d41Var);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(d41Var);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = oe1.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = oe1.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        hk0 hk0Var = new hk0(this.b);
        MaterialButton materialButton = this.a;
        hk0Var.j(materialButton.getContext());
        hk0Var.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            hk0Var.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        hk0Var.c.j = f;
        hk0Var.invalidateSelf();
        gk0 gk0Var = hk0Var.c;
        if (gk0Var.d != colorStateList) {
            gk0Var.d = colorStateList;
            hk0Var.onStateChange(hk0Var.getState());
        }
        hk0 hk0Var2 = new hk0(this.b);
        hk0Var2.setTint(0);
        float f2 = this.h;
        int iU = this.n ? r71.u(materialButton, R.attr.colorSurface) : 0;
        hk0Var2.c.j = f2;
        hk0Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iU);
        gk0 gk0Var2 = hk0Var2.c;
        if (gk0Var2.d != colorStateListValueOf) {
            gk0Var2.d = colorStateListValueOf;
            hk0Var2.onStateChange(hk0Var2.getState());
        }
        hk0 hk0Var3 = new hk0(this.b);
        this.m = hk0Var3;
        hk0Var3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(zy0.a(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hk0Var2, hk0Var}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        hk0 hk0VarB = b(false);
        if (hk0VarB != null) {
            hk0VarB.l(this.t);
            hk0VarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        hk0 hk0VarB = b(false);
        hk0 hk0VarB2 = b(true);
        if (hk0VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            hk0VarB.c.j = f;
            hk0VarB.invalidateSelf();
            gk0 gk0Var = hk0VarB.c;
            if (gk0Var.d != colorStateList) {
                gk0Var.d = colorStateList;
                hk0VarB.onStateChange(hk0VarB.getState());
            }
            if (hk0VarB2 != null) {
                float f2 = this.h;
                int iU = this.n ? r71.u(this.a, R.attr.colorSurface) : 0;
                hk0VarB2.c.j = f2;
                hk0VarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iU);
                gk0 gk0Var2 = hk0VarB2.c;
                if (gk0Var2.d != colorStateListValueOf) {
                    gk0Var2.d = colorStateListValueOf;
                    hk0VarB2.onStateChange(hk0VarB2.getState());
                }
            }
        }
    }
}
