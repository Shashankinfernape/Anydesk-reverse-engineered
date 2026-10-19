package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nd1 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final kd1 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final xd o;

    public nd1(nd1 nd1Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        xd xdVar = new xd(0);
        this.o = xdVar;
        this.g = new kd1(nd1Var.g, xdVar);
        this.a = new Path(nd1Var.a);
        this.b = new Path(nd1Var.b);
        this.h = nd1Var.h;
        this.i = nd1Var.i;
        this.j = nd1Var.j;
        this.k = nd1Var.k;
        this.l = nd1Var.l;
        this.m = nd1Var.m;
        String str = nd1Var.m;
        if (str != null) {
            xdVar.put(str, this);
        }
        this.n = nd1Var.n;
    }

    public final void a(kd1 kd1Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = kd1Var.a;
        ArrayList arrayList = kd1Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = kd1Var.a;
        matrix3.preConcat(kd1Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            ld1 ld1Var = (ld1) arrayList.get(i5);
            if (ld1Var instanceof kd1) {
                a((kd1) ld1Var, matrix3, canvas, i, i2);
            } else {
                if (ld1Var instanceof md1) {
                    md1 md1Var = (md1) ld1Var;
                    float f3 = i / this.j;
                    float f4 = i2 / this.k;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.a;
                        path.reset();
                        au0[] au0VarArr = md1Var.a;
                        if (au0VarArr != null) {
                            au0.b(au0VarArr, path);
                        }
                        Path path2 = this.b;
                        path2.reset();
                        if (md1Var instanceof id1) {
                            path2.setFillType(md1Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            jd1 jd1Var = (jd1) md1Var;
                            float f6 = jd1Var.i;
                            if (f6 != 0.0f || jd1Var.j != 1.0f) {
                                float f7 = jd1Var.k;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (jd1Var.j + f7) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, false);
                                float length = this.f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.f;
                                if (f10 > f11) {
                                    pathMeasure.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    this.f.getSegment(0.0f, f11, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            y7 y7Var = jd1Var.f;
                            if (((Shader) y7Var.d) == null && y7Var.c == 0) {
                                i4 = 16777215;
                                f2 = 255.0f;
                            } else {
                                if (this.e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.e;
                                Shader shader = (Shader) y7Var.d;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(jd1Var.h * 255.0f));
                                    f2 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = y7Var.c;
                                    float f12 = jd1Var.h;
                                    PorterDuff.Mode mode = qd1.l;
                                    f2 = 255.0f;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(jd1Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            y7 y7Var2 = jd1Var.d;
                            if (((Shader) y7Var2.d) != null || y7Var2.c != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = jd1Var.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = jd1Var.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(jd1Var.n);
                                Shader shader2 = (Shader) y7Var2.d;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(jd1Var.g * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = y7Var2.c;
                                    float f13 = jd1Var.g;
                                    PorterDuff.Mode mode2 = qd1.l;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(jd1Var.e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public nd1() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new xd(0);
        this.g = new kd1();
        this.a = new Path();
        this.b = new Path();
    }
}
