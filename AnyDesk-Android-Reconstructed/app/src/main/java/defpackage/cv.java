package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class cv extends Drawable implements Animatable {
    public static final zj m = new zj(Float.class, "growFraction", 7);
    public final Context c;
    public final eg d;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public ArrayList h;
    public boolean i;
    public float j;
    public int l;
    public final Paint k = new Paint();
    public y8 e = new y8();

    public cv(Context context, eg egVar) {
        this.c = context;
        this.d = egVar;
        setAlpha(255);
    }

    public final float b() {
        eg egVar = this.d;
        if (egVar.e == 0 && egVar.f == 0) {
            return 1.0f;
        }
        return this.j;
    }

    public final boolean c(boolean z, boolean z2, boolean z3) {
        y8 y8Var = this.e;
        ContentResolver contentResolver = this.c.getContentResolver();
        y8Var.getClass();
        return d(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f;
        int i = 0;
        zj zjVar = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, zjVar, 0.0f, 1.0f);
            this.f = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f.setInterpolator(x8.b);
            ObjectAnimator objectAnimator2 = this.f;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                id.q("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f = objectAnimator2;
            objectAnimator2.addListener(new bv(this, i));
        }
        int i2 = 1;
        if (this.g == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, zjVar, 1.0f, 0.0f);
            this.g = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.g.setInterpolator(x8.b);
            ObjectAnimator objectAnimator3 = this.g;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                id.q("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.g = objectAnimator3;
            objectAnimator3.addListener(new bv(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f : this.g;
            ObjectAnimator objectAnimator5 = z ? this.g : this.f;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.i;
                    this.i = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.i = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.i;
                    this.i = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.i = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                eg egVar = this.d;
                if (!z ? egVar.f != 0 : egVar.e != 0) {
                    boolean z7 = this.i;
                    this.i = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.i = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void e(cg cgVar) {
        ArrayList arrayList = this.h;
        if (arrayList == null || !arrayList.contains(cgVar)) {
            return;
        }
        this.h.remove(cgVar);
        if (this.h.isEmpty()) {
            this.h = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.g;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return c(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
