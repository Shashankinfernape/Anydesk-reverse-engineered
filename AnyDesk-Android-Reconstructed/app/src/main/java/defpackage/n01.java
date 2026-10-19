package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class n01 extends FrameLayout {
    public Drawable c;
    public Rect d;
    public Rect e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect = this.e;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.d == null || this.c == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f) {
            rect.set(0, 0, width, this.d.top);
            this.c.setBounds(rect);
            this.c.draw(canvas);
        }
        if (this.g) {
            rect.set(0, height - this.d.bottom, width, height);
            this.c.setBounds(rect);
            this.c.draw(canvas);
        }
        if (this.h) {
            Rect rect2 = this.d;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.c.setBounds(rect);
            this.c.draw(canvas);
        }
        if (this.i) {
            Rect rect3 = this.d;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.c.setBounds(rect);
            this.c.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.g = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.h = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.i = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.c = drawable;
    }
}
