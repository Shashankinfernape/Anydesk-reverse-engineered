package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class nh1 extends Drawable implements Drawable.Callback, da1 {
    public static final PorterDuff.Mode i = PorterDuff.Mode.SRC_IN;
    public static Method j;
    public int c;
    public PorterDuff.Mode d;
    public boolean e;
    public oh1 f;
    public boolean g;
    public Drawable h;

    public static void a() {
        if (j == null) {
            try {
                j = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.h;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final oh1 c() {
        oh1 oh1Var = this.f;
        oh1 oh1Var2 = new oh1();
        oh1Var2.c = null;
        oh1Var2.d = i;
        if (oh1Var != null) {
            oh1Var2.a = oh1Var.a;
            oh1Var2.b = oh1Var.b;
            oh1Var2.c = oh1Var.c;
            oh1Var2.d = oh1Var.d;
        }
        return oh1Var2;
    }

    public final boolean d(int[] iArr) {
        return i(iArr) || this.h.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.h.draw(canvas);
    }

    public final void e(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final void f(ColorStateList colorStateList) {
        this.f.c = colorStateList;
        i(this.h.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f.d = mode;
        i(this.h.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        oh1 oh1Var = this.f;
        return changingConfigurations | (oh1Var != null ? oh1Var.getChangingConfigurations() : 0) | this.h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        oh1 oh1Var = this.f;
        if (oh1Var == null || oh1Var.b == null) {
            return null;
        }
        oh1Var.a = getChangingConfigurations();
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.h.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.h.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return uj.o(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.h.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.h.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.h.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.h.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.h.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.h.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            oh1 oh1Var = this.f;
            if (oh1Var != null) {
                oh1Var.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (b()) {
            oh1 oh1Var = this.f;
            ColorStateList colorStateList = oh1Var.c;
            PorterDuff.Mode mode = oh1Var.d;
            if (colorStateList == null || mode == null) {
                this.e = false;
                clearColorFilter();
                return false;
            }
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.e || colorForState != this.c || mode != this.d) {
                setColorFilter(colorForState, mode);
                this.c = colorForState;
                this.d = mode;
                this.e = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.h.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.h;
        if (drawable == null || (method = j) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        oh1 oh1Var;
        ColorStateList colorStateList = (!b() || (oh1Var = this.f) == null) ? null : oh1Var.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.h.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.f = c();
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.mutate();
            }
            oh1 oh1Var = this.f;
            if (oh1Var != null) {
                Drawable drawable2 = this.h;
                oh1Var.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        return uj.D(this.h, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.h.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.h.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.h.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.h.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.h.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.h.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.h.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.h.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        if (b()) {
            e(i2);
        } else {
            this.h.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.h.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.h.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.h.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
