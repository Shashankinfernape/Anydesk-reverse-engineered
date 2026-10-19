package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nt extends cv {
    public static final mt s = new mt();
    public final ov n;
    public final r61 o;
    public final q61 p;
    public final nv q;
    public boolean r;

    public nt(Context context, eg egVar, ov ovVar) {
        super(context, egVar);
        this.r = false;
        this.n = ovVar;
        this.q = new nv();
        r61 r61Var = new r61();
        this.o = r61Var;
        r61Var.b = 1.0d;
        r61Var.c = false;
        r61Var.a = Math.sqrt(50.0d);
        r61Var.c = false;
        q61 q61Var = new q61(this);
        this.p = q61Var;
        q61Var.k = r61Var;
        if (this.j != 1.0f) {
            this.j = 1.0f;
            invalidateSelf();
        }
    }

    @Override // defpackage.cv
    public final boolean d(boolean z, boolean z2, boolean z3) {
        boolean zD = super.d(z, z2, z3);
        y8 y8Var = this.e;
        ContentResolver contentResolver = this.c.getContentResolver();
        y8Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.r = true;
            return zD;
        }
        this.r = false;
        float f2 = 50.0f / f;
        r61 r61Var = this.o;
        r61Var.getClass();
        if (f2 <= 0.0f) {
            id.q("Spring stiffness constant must be positive.");
            return false;
        }
        r61Var.a = Math.sqrt(f2);
        r61Var.c = false;
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.g;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            ov ovVar = this.n;
            ovVar.a.a();
            ovVar.a(canvas, bounds, fB, z, z2);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.k;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            eg egVar = this.d;
            int i = egVar.c[0];
            nv nvVar = this.q;
            nvVar.c = i;
            int iE = egVar.g;
            ov ovVar2 = this.n;
            if (iE > 0) {
                if (!(ovVar2 instanceof lf0)) {
                    iE = (int) ((uj.e(nvVar.b, 0.0f, 0.01f) * iE) / 0.01f);
                }
                this.n.d(canvas, paint, nvVar.b, 1.0f, egVar.d, this.l, iE);
            } else {
                ovVar2.d(canvas, paint, 0.0f, 1.0f, egVar.d, this.l, 0);
            }
            int i2 = this.l;
            ov ovVar3 = this.n;
            ovVar3.c(canvas, paint, nvVar, i2);
            ovVar3.b(canvas, paint, egVar.c[0], this.l);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.p.b();
        this.q.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.r;
        nv nvVar = this.q;
        q61 q61Var = this.p;
        if (z) {
            q61Var.b();
            nvVar.b = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        q61Var.b = nvVar.b * 10000.0f;
        q61Var.c = true;
        float f = i;
        if (q61Var.f) {
            q61Var.l = f;
            return true;
        }
        if (q61Var.k == null) {
            q61Var.k = new r61(f);
        }
        r61 r61Var = q61Var.k;
        double d = f;
        r61Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            id.m("Final position of the spring cannot be greater than the max value.");
            return false;
        }
        if (d2 < -3.4028234663852886E38d) {
            id.m("Final position of the spring cannot be less than the min value.");
            return false;
        }
        double dAbs = Math.abs(q61Var.h * 0.75f);
        r61Var.d = dAbs;
        r61Var.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = q61Var.f;
        if (!z2 && !z2) {
            q61Var.f = true;
            if (!q61Var.c) {
                mt mtVar = q61Var.e;
                nt ntVar = q61Var.d;
                mtVar.getClass();
                q61Var.b = ntVar.q.b * 10000.0f;
            }
            float f2 = q61Var.b;
            if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
                id.q("Starting value need to be in between min value and max value");
                return false;
            }
            ThreadLocal threadLocal = w8.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new w8());
            }
            w8 w8Var = (w8) threadLocal.get();
            ArrayList arrayList = w8Var.b;
            if (arrayList.size() == 0) {
                if (w8Var.d == null) {
                    w8Var.d = new y6(w8Var.c);
                }
                y6 y6Var = w8Var.d;
                ((Choreographer) y6Var.e).postFrameCallback((v8) y6Var.f);
            }
            if (!arrayList.contains(q61Var)) {
                arrayList.add(q61Var);
                return true;
            }
        }
        return true;
    }
}
