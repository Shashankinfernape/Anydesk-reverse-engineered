package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class lf0 extends ov {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    @Override // defpackage.ov
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.b = rect.width();
        vf0 vf0Var = (vf0) this.a;
        float f2 = vf0Var.a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f2) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (vf0Var.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f3 = this.b / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.clipRect(-f3, -f4, f3, f4);
        int i = vf0Var.a;
        int i2 = i / 2;
        int i3 = vf0Var.b;
        this.e = i2 == i3;
        this.c = i * f;
        this.d = Math.min(i / 2, i3) * f;
        if (z || z2) {
            if ((z && vf0Var.e == 2) || (z2 && vf0Var.f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && vf0Var.f != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * vf0Var.a) / 2.0f);
            }
        }
        if (z2 && vf0Var.f == 3) {
            this.f = f;
        } else {
            this.f = 1.0f;
        }
    }

    @Override // defpackage.ov
    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int iJ = r71.j(i, i2);
        vf0 vf0Var = (vf0) this.a;
        if (vf0Var.k <= 0 || iJ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iJ);
        PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), 0.0f);
        int i3 = vf0Var.k;
        h(canvas, paint, pointF, null, i3, i3);
    }

    @Override // defpackage.ov
    public final void c(Canvas canvas, Paint paint, nv nvVar, int i) {
        int iJ = r71.j(nvVar.c, i);
        float f = nvVar.a;
        float f2 = nvVar.b;
        int i2 = nvVar.d;
        g(canvas, paint, f, f2, iJ, i2, i2);
    }

    @Override // defpackage.ov
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        g(canvas, paint, f, f2, r71.j(i, i2), i3, i3);
    }

    @Override // defpackage.ov
    public final int e() {
        return ((vf0) this.a).a;
    }

    @Override // defpackage.ov
    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3;
        float fE = uj.e(f, 0.0f, 1.0f);
        float fE2 = uj.e(f2, 0.0f, 1.0f);
        float f4 = this.f;
        float f5 = (fE * 1.0f) + ((1.0f - fE) * (1.0f - f4));
        float f6 = (fE2 * 1.0f) + ((1.0f - fE2) * (1.0f - f4));
        int iE = (int) ((uj.e(f5, 0.0f, 0.01f) * i2) / 0.01f);
        float fE3 = 1.0f - uj.e(f6, 0.99f, 1.0f);
        float f7 = this.b;
        int i4 = (int) ((f5 * f7) + iE);
        int i5 = (int) ((f6 * f7) - ((int) ((fE3 * i3) / 0.01f)));
        float f8 = (-f7) / 2.0f;
        if (i4 <= i5) {
            float f9 = this.d;
            float f10 = i4 + f9;
            float f11 = i5 - f9;
            float f12 = f9 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.c);
            if (f10 >= f11) {
                h(canvas, paint, new PointF(f10 + f8, 0.0f), new PointF(f11 + f8, 0.0f), f12, this.c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f13 = f10 + f8;
            float f14 = f11 + f8;
            canvas.drawLine(f13, 0.0f, f14, 0.0f, paint);
            if (this.e || this.d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f10 > 0.0f) {
                f3 = f12;
                h(canvas, paint, new PointF(f13, 0.0f), null, f3, this.c);
            } else {
                f3 = f12;
            }
            if (f11 < this.b) {
                h(canvas, paint, new PointF(f14, 0.0f), null, f3, this.c);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f, float f2) {
        float fMin = Math.min(f2, this.c);
        float f3 = f / 2.0f;
        float fMin2 = Math.min(f3, (this.d * fMin) / this.c);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f3, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
