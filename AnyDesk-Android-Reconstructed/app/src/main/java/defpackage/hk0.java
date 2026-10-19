package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class hk0 extends Drawable implements da1, m41 {
    public static final Paint y;
    public gk0 c;
    public final l41[] d;
    public final l41[] e;
    public final BitSet f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public d41 o;
    public final Paint p;
    public final Paint q;
    public final b41 r;
    public final ev s;
    public final dn0 t;
    public PorterDuffColorFilter u;
    public PorterDuffColorFilter v;
    public final RectF w;
    public boolean x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public hk0(gk0 gk0Var) {
        this.d = new l41[4];
        this.e = new l41[4];
        this.f = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.p = paint;
        Paint paint2 = new Paint(1);
        this.q = paint2;
        this.r = new b41();
        this.t = Looper.getMainLooper().getThread() == Thread.currentThread() ? e41.a : new dn0();
        this.w = new RectF();
        this.x = true;
        this.c = gk0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q();
        p(getState());
        this.s = new ev(21, this);
    }

    public final void b(RectF rectF, Path path) {
        gk0 gk0Var = this.c;
        this.t.a(gk0Var.a, gk0Var.i, rectF, this.s, path);
        if (this.c.h != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.c.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final int c(int i) {
        int i2;
        gk0 gk0Var = this.c;
        float f = gk0Var.m + 0.0f + gk0Var.l;
        lw lwVar = gk0Var.b;
        if (lwVar == null || !lwVar.a || cn.d(i, 255) != lwVar.d) {
            return i;
        }
        float f2 = lwVar.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iB = r71.B(cn.d(i, 255), lwVar.b, fMin);
        if (fMin > 0.0f && (i2 = lwVar.c) != 0) {
            iB = cn.b(cn.d(i2, lw.f), iB);
        }
        return cn.d(iB, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f.cardinality() > 0) {
            Log.w("hk0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.c.o;
        Path path = this.i;
        b41 b41Var = this.r;
        if (i != 0) {
            canvas.drawPath(path, b41Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            l41 l41Var = this.d[i2];
            int i3 = this.c.n;
            Matrix matrix = l41.b;
            l41Var.a(matrix, b41Var, i3, canvas);
            this.e[i2].a(matrix, b41Var, this.c.n, canvas);
        }
        if (this.x) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.c.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.c.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, y);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.u;
        Paint paint = this.p;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.c.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        Paint paint2 = this.q;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.c.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.c.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.g;
        Path path = this.i;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            d41 d41Var = this.c.a;
            c41 c41VarE = d41Var.e();
            yq n7Var = d41Var.e;
            if (!(n7Var instanceof rx0)) {
                n7Var = new n7(f, n7Var);
            }
            c41VarE.e = n7Var;
            yq n7Var2 = d41Var.f;
            if (!(n7Var2 instanceof rx0)) {
                n7Var2 = new n7(f, n7Var2);
            }
            c41VarE.f = n7Var2;
            yq n7Var3 = d41Var.h;
            if (!(n7Var3 instanceof rx0)) {
                n7Var3 = new n7(f, n7Var3);
            }
            c41VarE.h = n7Var3;
            yq n7Var4 = d41Var.g;
            if (!(n7Var4 instanceof rx0)) {
                n7Var4 = new n7(f, n7Var4);
            }
            c41VarE.g = n7Var4;
            d41 d41VarA = c41VarE.a();
            this.o = d41VarA;
            float f2 = this.c.i;
            RectF rectFG = g();
            RectF rectF = this.l;
            rectF.set(rectFG);
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.t.a(d41VarA, f2, rectF, null, this.j);
            b(g(), path);
            this.g = false;
        }
        gk0 gk0Var = this.c;
        gk0Var.getClass();
        if (gk0Var.n > 0 && !k() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.c.o)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.c.o)));
            if (this.x) {
                RectF rectF2 = this.w;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    nh0.j("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.c.n * 2) + ((int) rectF2.width()) + iWidth, (this.c.n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.c.n) - iWidth;
                float f4 = (getBounds().top - this.c.n) - iHeight;
                canvas2.translate(-f3, -f4);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        gk0 gk0Var2 = this.c;
        Paint.Style style = gk0Var2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, gk0Var2.a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, d41 d41Var, RectF rectF) {
        if (!d41Var.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = d41Var.f.a(rectF) * this.c.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        d41 d41Var = this.o;
        RectF rectFG = g();
        RectF rectF = this.l;
        rectF.set(rectFG);
        boolean zI = i();
        Paint paint = this.q;
        float strokeWidth = zI ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.j, d41Var, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.c.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.c.getClass();
        if (k()) {
            outline.setRoundRect(getBounds(), h() * this.c.i);
        } else {
            RectF rectFG = g();
            Path path = this.i;
            b(rectFG, path);
            ld.p(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.c.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.i;
        b(rectFG, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.c.a.e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.c.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.c.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.c.getClass();
        ColorStateList colorStateList2 = this.c.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.c.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.c.b = new lw(context);
        r();
    }

    public final boolean k() {
        return this.c.a.d(g());
    }

    public final void l(float f) {
        gk0 gk0Var = this.c;
        if (gk0Var.m != f) {
            gk0Var.m = f;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        gk0 gk0Var = this.c;
        if (gk0Var.c != colorStateList) {
            gk0Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.c = new gk0(this.c);
        return this;
    }

    public final void n(float f) {
        gk0 gk0Var = this.c;
        if (gk0Var.i != f) {
            gk0Var.i = f;
            this.g = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.r.a(-12303292);
        this.c.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = p(iArr) || q();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.c.c == null || color2 == (colorForState2 = this.c.c.getColorForState(iArr, (color2 = (paint2 = this.p).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.c.d == null || color == (colorForState = this.c.d.getColorForState(iArr, (color = (paint = this.q).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean q() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        PorterDuffColorFilter porterDuffColorFilter3 = this.v;
        gk0 gk0Var = this.c;
        ColorStateList colorStateList = gk0Var.e;
        PorterDuff.Mode mode = gk0Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.p.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.u = porterDuffColorFilter;
        this.c.getClass();
        this.v = null;
        this.c.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.u) && Objects.equals(porterDuffColorFilter3, this.v)) ? false : true;
    }

    public final void r() {
        gk0 gk0Var = this.c;
        float f = gk0Var.m + 0.0f;
        gk0Var.n = (int) Math.ceil(0.75f * f);
        this.c.o = (int) Math.ceil(f * 0.25f);
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        gk0 gk0Var = this.c;
        if (gk0Var.k != i) {
            gk0Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.m41
    public final void setShapeAppearanceModel(d41 d41Var) {
        this.c.a = d41Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.c.e = colorStateList;
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        gk0 gk0Var = this.c;
        if (gk0Var.f != mode) {
            gk0Var.f = mode;
            q();
            super.invalidateSelf();
        }
    }

    public hk0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(d41.b(context, attributeSet, i, i2).a());
    }

    public hk0(d41 d41Var) {
        this(new gk0(d41Var));
    }

    public hk0() {
        this(new d41());
    }
}
