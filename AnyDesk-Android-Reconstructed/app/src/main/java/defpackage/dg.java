package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg extends ProgressBar {
    public final eg c;
    public int d;
    public final boolean e;
    public final int f;
    public y8 g;
    public boolean h;
    public int i;
    public final bg j;
    public final bg k;
    public final cg l;
    public final cg m;

    public dg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(lk0.N(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.h = false;
        this.i = 4;
        this.j = new bg(this, 0);
        this.k = new bg(this, 1);
        this.l = new cg(this, 0);
        this.m = new cg(this, 1);
        Context context2 = getContext();
        this.c = a(context2, attributeSet);
        th1.b(context2, attributeSet, i, i2);
        int[] iArr = ov0.d;
        th1.e(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        typedArrayObtainStyledAttributes.getInt(6, -1);
        this.f = Math.min(typedArrayObtainStyledAttributes.getInt(4, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.g = new y8();
        this.e = true;
    }

    private ov getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().n;
    }

    public abstract eg a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.d = i;
            this.h = true;
            if (getIndeterminateDrawable().isVisible()) {
                y8 y8Var = this.g;
                ContentResolver contentResolver = getContext().getContentResolver();
                y8Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().o.n();
                    return;
                }
            }
            this.l.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = oe1.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.c.f;
    }

    @Override // android.widget.ProgressBar
    public c90 getIndeterminateDrawable() {
        return (c90) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.c.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.c.g;
    }

    @Override // android.widget.ProgressBar
    public nt getProgressDrawable() {
        return (nt) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.c.e;
    }

    public int getTrackColor() {
        return this.c.d;
    }

    public int getTrackCornerRadius() {
        return this.c.b;
    }

    public int getTrackThickness() {
        return this.c.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o.m(this.l);
        }
        nt progressDrawable = getProgressDrawable();
        cg cgVar = this.m;
        if (progressDrawable != null) {
            nt progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.h == null) {
                progressDrawable2.h = new ArrayList();
            }
            if (!progressDrawable2.h.contains(cgVar)) {
                progressDrawable2.h.add(cgVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            c90 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.h == null) {
                indeterminateDrawable.h = new ArrayList();
            }
            if (!indeterminateDrawable.h.contains(cgVar)) {
                indeterminateDrawable.h.add(cgVar);
            }
        }
        if (c()) {
            if (this.f > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k);
        removeCallbacks(this.j);
        ((cv) getCurrentDrawable()).c(false, false, false);
        c90 indeterminateDrawable = getIndeterminateDrawable();
        cg cgVar = this.m;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(cgVar);
            getIndeterminateDrawable().o.q();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(cgVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            ov currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.e) {
            ((cv) getCurrentDrawable()).c(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.e) {
            ((cv) getCurrentDrawable()).c(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(y8 y8Var) {
        this.g = y8Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().e = y8Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().e = y8Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.c.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            cv cvVar = (cv) getCurrentDrawable();
            if (cvVar != null) {
                cvVar.c(false, false, false);
            }
            super.setIndeterminate(z);
            cv cvVar2 = (cv) getCurrentDrawable();
            if (cvVar2 != null) {
                cvVar2.c(c(), false, false);
            }
            if ((cvVar2 instanceof c90) && c()) {
                ((c90) cvVar2).o.p();
            }
            this.h = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (!(drawable instanceof c90)) {
            id.q("Cannot set framework drawable as indeterminate drawable.");
        } else {
            ((cv) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{r71.t(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.c.c = iArr;
        getIndeterminateDrawable().o.j();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        eg egVar = this.c;
        if (egVar.g != i) {
            egVar.g = i;
            egVar.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
            return;
        }
        if (!(drawable instanceof nt)) {
            id.q("Cannot set framework drawable as progress drawable.");
            return;
        }
        nt ntVar = (nt) drawable;
        ntVar.c(false, false, false);
        super.setProgressDrawable(ntVar);
        ntVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
    }

    public void setShowAnimationBehavior(int i) {
        this.c.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        eg egVar = this.c;
        if (egVar.d != i) {
            egVar.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        eg egVar = this.c;
        if (egVar.b != i) {
            egVar.b = Math.min(i, egVar.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        eg egVar = this.c;
        if (egVar.a != i) {
            egVar.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.i = i;
        } else {
            id.q("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }
}
