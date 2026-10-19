package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class gk0 extends Drawable.ConstantState {
    public d41 a;
    public lw b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final Paint.Style p;

    public gk0(gk0 gk0Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = gk0Var.a;
        this.b = gk0Var.b;
        this.j = gk0Var.j;
        this.c = gk0Var.c;
        this.d = gk0Var.d;
        this.f = gk0Var.f;
        this.e = gk0Var.e;
        this.k = gk0Var.k;
        this.h = gk0Var.h;
        this.o = gk0Var.o;
        this.i = gk0Var.i;
        this.l = gk0Var.l;
        this.m = gk0Var.m;
        this.n = gk0Var.n;
        this.p = gk0Var.p;
        if (gk0Var.g != null) {
            this.g = new Rect(gk0Var.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        hk0 hk0Var = new hk0(this);
        hk0Var.g = true;
        return hk0Var;
    }

    public gk0(d41 d41Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = d41Var;
        this.b = null;
    }
}
