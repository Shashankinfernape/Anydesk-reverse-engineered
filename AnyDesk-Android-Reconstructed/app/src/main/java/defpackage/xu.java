package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int o = 0;
    public n8 c;
    public Rect d;
    public Drawable e;
    public Drawable f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public c k;
    public long l;
    public long m;
    public r8 n;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.h = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            long j2 = this.l;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.g);
                    this.l = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.c.y)) * this.g) / 255);
                    z2 = true;
                }
            }
            drawable = this.f;
            if (drawable != null) {
                j = this.m;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f = null;
                        this.m = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.c.z) * this.g) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.k, jUptimeMillis + 16);
                return;
            }
            this.m = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.l = 0L;
        z2 = false;
        drawable = this.f;
        if (drawable != null) {
            j = this.m;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f = null;
                    this.m = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.c.z) * this.g) / 255);
                }
            }
            if (z) {
            }
        }
        this.m = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        n8 n8Var = this.c;
        if (theme == null) {
            n8Var.getClass();
            return;
        }
        n8Var.c();
        int i = n8Var.h;
        Drawable[] drawableArr = n8Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                n8Var.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            n8Var.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = n8Var.c;
            n8Var.c = i3;
            if (i4 != i3) {
                n8Var.m = false;
                n8Var.j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.n == null) {
            this.n = new r8();
        }
        r8 r8Var = this.n;
        r8Var.d = drawable.getCallback();
        drawable.setCallback(r8Var);
        try {
            if (this.c.y <= 0 && this.h) {
                drawable.setAlpha(this.g);
            }
            n8 n8Var = this.c;
            if (n8Var.C) {
                drawable.setColorFilter(n8Var.B);
            } else {
                if (n8Var.F) {
                    drawable.setTintList(n8Var.D);
                }
                n8 n8Var2 = this.c;
                if (n8Var2.G) {
                    drawable.setTintMode(n8Var2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.c.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                uj.D(drawable, uj.o(this));
            }
            drawable.setAutoMirrored(this.c.A);
            Rect rect = this.d;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            r8 r8Var2 = this.n;
            Drawable.Callback callback = (Drawable.Callback) r8Var2.d;
            r8Var2.d = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean c(int i) {
        if (i == this.i) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.c.z > 0) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                this.f = drawable2;
                this.m = ((long) this.c.z) + jUptimeMillis;
            } else {
                this.f = null;
                this.m = 0L;
            }
        } else {
            Drawable drawable3 = this.e;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            n8 n8Var = this.c;
            if (i < n8Var.h) {
                Drawable drawableD = n8Var.d(i);
                this.e = drawableD;
                this.i = i;
                if (drawableD != null) {
                    int i2 = this.c.y;
                    if (i2 > 0) {
                        this.l = jUptimeMillis + ((long) i2);
                    }
                    b(drawableD);
                }
            } else {
                this.e = null;
                this.i = -1;
            }
        } else {
            this.e = null;
            this.i = -1;
        }
        if (this.l != 0 || this.m != 0) {
            c cVar = this.k;
            if (cVar == null) {
                this.k = new c(16, (q8) this);
            } else {
                unscheduleSelf(cVar);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.c.canApplyTheme();
    }

    public abstract void d(n8 n8Var);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        n8 n8Var = this.c;
        if (!n8Var.u) {
            n8Var.c();
            n8Var.u = true;
            int i = n8Var.h;
            Drawable[] drawableArr = n8Var.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    n8Var.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    n8Var.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = n8Var.v;
        }
        if (!z) {
            return null;
        }
        this.c.d = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        n8 n8Var = this.c;
        if (n8Var.l) {
            if (!n8Var.m) {
                n8Var.b();
            }
            return n8Var.o;
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        n8 n8Var = this.c;
        if (n8Var.l) {
            if (!n8Var.m) {
                n8Var.b();
            }
            return n8Var.n;
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        n8 n8Var = this.c;
        if (n8Var.l) {
            if (!n8Var.m) {
                n8Var.b();
            }
            return n8Var.q;
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        n8 n8Var = this.c;
        if (n8Var.l) {
            if (!n8Var.m) {
                n8Var.b();
            }
            return n8Var.p;
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            n8 n8Var = this.c;
            if (n8Var.r) {
                return n8Var.s;
            }
            n8Var.c();
            int i = n8Var.h;
            Drawable[] drawableArr = n8Var.g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            n8Var.s = opacity;
            n8Var.r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        n8 n8Var = this.c;
        Rect rect2 = null;
        boolean padding = false;
        if (!n8Var.i) {
            Rect rect3 = n8Var.k;
            if (rect3 != null || n8Var.j) {
                rect2 = rect3;
            } else {
                n8Var.c();
                Rect rect4 = new Rect();
                int i = n8Var.h;
                Drawable[] drawableArr = n8Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                n8Var.j = true;
                n8Var.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.e;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.c.A && uj.o(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        n8 n8Var = this.c;
        if (n8Var != null) {
            n8Var.r = false;
            n8Var.t = false;
        }
        if (drawable != this.e || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.c.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.h) {
                this.e.setAlpha(this.g);
            }
        }
        if (this.m != 0) {
            this.m = 0L;
            z = true;
        }
        if (this.l != 0) {
            this.l = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.j && super.mutate() == this) {
            q8 q8Var = (q8) this;
            n8 n8Var = new n8(q8Var.r, q8Var, null);
            n8Var.I = n8Var.I.clone();
            n8Var.J = n8Var.J.clone();
            d(n8Var);
            this.j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        n8 n8Var = this.c;
        int i2 = this.i;
        int i3 = n8Var.h;
        Drawable[] drawableArr = n8Var.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zD = Build.VERSION.SDK_INT >= 23 ? uj.D(drawable, i) : false;
                if (i4 == i2) {
                    z = zD;
                }
            }
        }
        n8Var.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.e || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.h && this.g == i) {
            return;
        }
        this.h = true;
        this.g = i;
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.l == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        n8 n8Var = this.c;
        if (n8Var.A != z) {
            n8Var.A = z;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        n8 n8Var = this.c;
        n8Var.C = true;
        if (n8Var.B != colorFilter) {
            n8Var.B = colorFilter;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        n8 n8Var = this.c;
        if (n8Var.w != z) {
            n8Var.w = z;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.d;
        if (rect == null) {
            this.d = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        n8 n8Var = this.c;
        n8Var.F = true;
        if (n8Var.D != colorStateList) {
            n8Var.D = colorStateList;
            this.e.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        n8 n8Var = this.c;
        n8Var.G = true;
        if (n8Var.E != mode) {
            n8Var.E = mode;
            this.e.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.e || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
