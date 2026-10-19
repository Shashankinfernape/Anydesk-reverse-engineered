package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anydesk.anydeskandroid.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vf extends Drawable implements n91 {
    public final WeakReference c;
    public final hk0 d;
    public final o91 e;
    public final Rect f;
    public final xf g;
    public float h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public WeakReference n;
    public WeakReference o;

    public vf(Context context) {
        l91 l91Var;
        WeakReference weakReference = new WeakReference(context);
        this.c = weakReference;
        th1.f(context, th1.i, "Theme.MaterialComponents");
        this.f = new Rect();
        o91 o91Var = new o91(this);
        this.e = o91Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = o91Var.a;
        textPaint.setTextAlign(align);
        xf xfVar = new xf(context);
        this.g = xfVar;
        boolean zC = c();
        wf wfVar = xfVar.b;
        hk0 hk0Var = new hk0(d41.a(context, zC ? wfVar.i.intValue() : wfVar.g.intValue(), c() ? wfVar.j.intValue() : wfVar.h.intValue(), new e2(0.0f)).a());
        this.d = hk0Var;
        e();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && o91Var.g != (l91Var = new l91(context2, wfVar.f.intValue()))) {
            o91Var.b(l91Var, context2);
            f();
            p();
            invalidateSelf();
        }
        g();
        o91Var.e = true;
        e();
        p();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(wfVar.d.intValue());
        if (hk0Var.c.c != colorStateListValueOf) {
            hk0Var.m(colorStateListValueOf);
            invalidateSelf();
        }
        f();
        d();
        p();
        setVisible(wfVar.v.booleanValue(), false);
    }

    @Override // defpackage.n91
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int i;
        xf xfVar = this.g;
        wf wfVar = xfVar.b;
        String str = wfVar.l;
        WeakReference weakReference = this.c;
        if (str != null) {
            int i2 = wfVar.n;
            if (i2 == -2 || str == null || str.length() <= i2) {
                return str;
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
        }
        if (str != null || (i = wfVar.m) == -1) {
            return null;
        }
        int i3 = this.j;
        if (i3 != -2) {
            if (i == -1) {
                i = 0;
            }
            if (i > i3) {
                Context context2 = (Context) weakReference.get();
                return context2 == null ? "" : String.format(xfVar.b.p, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.j), "+");
            }
        }
        NumberFormat numberFormat = NumberFormat.getInstance(wfVar.p);
        int i4 = xfVar.b.m;
        return numberFormat.format(i4 != -1 ? i4 : 0);
    }

    public final boolean c() {
        wf wfVar = this.g.b;
        String str = wfVar.l;
        if (str != null) {
            return true;
        }
        return str == null && wfVar.m != -1;
    }

    public final void d() {
        WeakReference weakReference = this.n;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.n.get();
        WeakReference weakReference2 = this.o;
        o(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.d.draw(canvas);
        if (!c() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        o91 o91Var = this.e;
        o91Var.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.i - rect.exactCenterY();
        canvas.drawText(strB, this.h, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), o91Var.a);
    }

    public final void e() {
        Context context = (Context) this.c.get();
        if (context == null) {
            return;
        }
        boolean zC = c();
        xf xfVar = this.g;
        this.d.setShapeAppearanceModel(d41.a(context, zC ? xfVar.b.i.intValue() : xfVar.b.g.intValue(), c() ? xfVar.b.j.intValue() : xfVar.b.h.intValue(), new e2(0.0f)).a());
        invalidateSelf();
    }

    public final void f() {
        this.e.a.setColor(this.g.b.e.intValue());
        invalidateSelf();
    }

    public final void g() {
        wf wfVar = this.g.b;
        int i = wfVar.n;
        if (i != -2) {
            this.j = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.j = wfVar.o;
        }
        this.e.e = true;
        p();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g.b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i) {
        xf xfVar = this.g;
        xfVar.a.d = Integer.valueOf(i);
        xfVar.b.d = Integer.valueOf(i);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(xfVar.b.d.intValue());
        hk0 hk0Var = this.d;
        if (hk0Var.c.c != colorStateListValueOf) {
            hk0Var.m(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public final void i(int i) {
        if (this.e.a.getColor() != i) {
            xf xfVar = this.g;
            xfVar.a.e = Integer.valueOf(i);
            xfVar.b.e = Integer.valueOf(i);
            f();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(int i) {
        xf xfVar = this.g;
        xfVar.a.y = Integer.valueOf(i);
        wf wfVar = xfVar.b;
        wfVar.y = Integer.valueOf(i);
        p();
        xfVar.a.A = Integer.valueOf(i);
        wfVar.A = Integer.valueOf(i);
        p();
    }

    public final void k() {
        xf xfVar = this.g;
        wf wfVar = xfVar.b;
        if (wfVar.n != 3) {
            xfVar.a.n = 3;
            wfVar.n = 3;
            g();
        }
    }

    public final void l(int i) {
        int iMax = Math.max(0, i);
        xf xfVar = this.g;
        wf wfVar = xfVar.b;
        if (wfVar.m != iMax) {
            xfVar.a.m = iMax;
            wfVar.m = iMax;
            if (wfVar.l != null) {
                return;
            }
            this.e.e = true;
            e();
            p();
            invalidateSelf();
        }
    }

    public final void m(int i) {
        xf xfVar = this.g;
        xfVar.a.z = Integer.valueOf(i);
        wf wfVar = xfVar.b;
        wfVar.z = Integer.valueOf(i);
        p();
        xfVar.a.B = Integer.valueOf(i);
        wfVar.B = Integer.valueOf(i);
        p();
    }

    public final void n(boolean z) {
        xf xfVar = this.g;
        xfVar.a.v = Boolean.valueOf(z);
        xfVar.b.v = Boolean.valueOf(z);
        setVisible(xfVar.b.v.booleanValue(), false);
    }

    public final void o(View view, FrameLayout frameLayout) {
        this.n = new WeakReference(view);
        this.o = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        p();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.n91
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x024b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0254  */
    /* JADX WARN: Code duplicated, block: B:111:0x026c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x027e  */
    /* JADX WARN: Code duplicated, block: B:120:0x028b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0298  */
    public final void p() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.c;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.n;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.o;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zC = c();
        xf xfVar = this.g;
        float f2 = zC ? xfVar.d : xfVar.c;
        this.k = f2;
        if (f2 != -1.0f) {
            this.l = f2;
            this.m = f2;
        } else {
            this.l = Math.round((c() ? xfVar.g : xfVar.e) / 2.0f);
            this.m = Math.round((c() ? xfVar.h : xfVar.f) / 2.0f);
        }
        if (c()) {
            String strB = b();
            float f3 = this.l;
            o91 o91Var = this.e;
            if (o91Var.e) {
                o91Var.a(strB);
                f = o91Var.c;
            } else {
                f = o91Var.c;
            }
            this.l = Math.max(f3, (f / 2.0f) + xfVar.b.w.intValue());
            float f4 = this.m;
            if (o91Var.e) {
                o91Var.a(strB);
            }
            float fMax = Math.max(f4, (o91Var.d / 2.0f) + xfVar.b.x.intValue());
            this.m = fMax;
            this.l = Math.max(this.l, fMax);
        }
        wf wfVar = xfVar.b;
        wf wfVar2 = xfVar.b;
        int i = xfVar.k;
        int iIntValue = wfVar.z.intValue();
        if (c()) {
            iIntValue = wfVar.B.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = x8.c(iIntValue, iIntValue - wfVar.E.intValue(), x8.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.m);
        }
        int iIntValue2 = wfVar.D.intValue() + iIntValue;
        int iIntValue3 = wfVar2.u.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.i = rect3.bottom - iIntValue2;
        } else {
            this.i = rect3.top + iIntValue2;
        }
        int iIntValue4 = c() ? wfVar.A.intValue() : wfVar.y.intValue();
        if (i == 1) {
            iIntValue4 += c() ? xfVar.j : xfVar.i;
        }
        int iIntValue5 = wfVar.C.intValue() + iIntValue4;
        int iIntValue6 = wfVar2.u.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = oe1.a;
            this.h = view.getLayoutDirection() == 0 ? (rect3.left - this.l) + iIntValue5 : (rect3.right + this.l) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = oe1.a;
            this.h = view.getLayoutDirection() == 0 ? (rect3.right + this.l) - iIntValue5 : (rect3.left - this.l) + iIntValue5;
        }
        if (wfVar.F.booleanValue()) {
            WeakReference weakReference4 = this.o;
            View view2 = weakReference4 != null ? (FrameLayout) weakReference4.get() : null;
            if (view2 != null) {
                WeakReference weakReference5 = this.o;
                FrameLayout frameLayout = weakReference5 != null ? (FrameLayout) weakReference5.get() : null;
                if (frameLayout == null || frameLayout.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (view2.getParent() instanceof View) {
                    y = view2.getY();
                    x = view2.getX();
                    view2 = (View) view2.getParent();
                }
                y2 = view2.getY() + (this.i - this.m) + y;
                x2 = view2.getX() + (this.h - this.l) + x;
                if (view2.getParent() instanceof View) {
                    height = ((this.i + this.m) - (((View) view2.getParent()).getHeight() - view2.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (view2.getParent() instanceof View) {
                    width = ((this.h + this.l) - (((View) view2.getParent()).getWidth() - view2.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.i = Math.abs(y2) + this.i;
                }
                if (x2 < 0.0f) {
                    this.h = Math.abs(x2) + this.h;
                }
                if (height > 0.0f) {
                    this.i -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.h -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view3 = (View) view.getParent();
                y = y3;
                view2 = view3;
                y2 = view2.getY() + (this.i - this.m) + y;
                x2 = view2.getX() + (this.h - this.l) + x;
                if (view2.getParent() instanceof View) {
                    height = ((this.i + this.m) - (((View) view2.getParent()).getHeight() - view2.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (view2.getParent() instanceof View) {
                    width = ((this.h + this.l) - (((View) view2.getParent()).getWidth() - view2.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.i = Math.abs(y2) + this.i;
                }
                if (x2 < 0.0f) {
                    this.h = Math.abs(x2) + this.h;
                }
                if (height > 0.0f) {
                    this.i -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.h -= Math.abs(width);
                }
            }
        }
        float f5 = this.h;
        float f6 = this.i;
        float f7 = this.l;
        float f8 = this.m;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.k;
        hk0 hk0Var = this.d;
        if (f9 != -1.0f) {
            c41 c41VarE = hk0Var.c.a.e();
            c41VarE.e = new e2(f9);
            c41VarE.f = new e2(f9);
            c41VarE.g = new e2(f9);
            c41VarE.h = new e2(f9);
            hk0Var.setShapeAppearanceModel(c41VarE.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        hk0Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        xf xfVar = this.g;
        xfVar.a.k = i;
        xfVar.b.k = i;
        this.e.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
