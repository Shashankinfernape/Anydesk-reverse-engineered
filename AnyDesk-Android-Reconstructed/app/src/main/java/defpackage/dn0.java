package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class dn0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Cloneable e;
    public final Parcelable f;
    public Object g;
    public Object h;
    public final Object i;
    public final Serializable j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.Matrix[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [float[], java.io.Serializable] */
    public dn0() {
        this.a = 1;
        this.c = new zg0[4];
        this.d = new Matrix[4];
        this.e = new Matrix[4];
        this.f = new PointF();
        this.g = new Path();
        this.h = new Path();
        this.i = new zg0(1);
        this.j = new float[2];
        this.k = new float[2];
        this.l = new Path();
        this.m = new Path();
        this.b = true;
        for (int i = 0; i < 4; i++) {
            ((zg0[]) this.c)[i] = new zg0(1);
            ((Matrix[]) this.d)[i] = new Matrix();
            ((Matrix[]) this.e)[i] = new Matrix();
        }
    }

    public void a(d41 d41Var, float f, RectF rectF, ev evVar, Path path) {
        int i;
        char c;
        float f2;
        fw fwVar;
        ev evVar2;
        yq yqVar;
        r71 r71Var;
        ev evVar3 = evVar;
        Matrix[] matrixArr = (Matrix[]) this.e;
        float[] fArr = (float[]) this.j;
        zg0[] zg0VarArr = (zg0[]) this.c;
        Matrix[] matrixArr2 = (Matrix[]) this.d;
        path.rewind();
        Path path2 = (Path) this.g;
        path2.rewind();
        Path path3 = (Path) this.h;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            c = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f;
            if (i2 == 1) {
                yqVar = d41Var.g;
            } else if (i2 != 2) {
                yqVar = i2 != 3 ? d41Var.f : d41Var.e;
            } else {
                yqVar = d41Var.h;
            }
            if (i2 == 1) {
                r71Var = d41Var.c;
            } else if (i2 != 2) {
                r71Var = i2 != 3 ? d41Var.b : d41Var.a;
            } else {
                r71Var = d41Var.d;
            }
            zg0 zg0Var = zg0VarArr[i2];
            r71Var.getClass();
            Matrix[] matrixArr3 = matrixArr;
            r71Var.v(zg0Var, f, yqVar.a(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            zg0 zg0Var2 = zg0VarArr[i2];
            fArr[0] = zg0Var2.c;
            fArr[1] = zg0Var2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        while (i4 < i) {
            zg0 zg0Var3 = zg0VarArr[i4];
            zg0Var3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = zg0Var3.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            zg0VarArr[i4].b(matrixArr2[i4], path);
            if (evVar3 != null) {
                zg0 zg0Var4 = zg0VarArr[i4];
                Matrix matrix = matrixArr2[i4];
                hk0 hk0Var = (hk0) evVar3.d;
                BitSet bitSet = hk0Var.f;
                zg0Var4.getClass();
                f2 = 0.0f;
                bitSet.set(i4, false);
                l41[] l41VarArr = hk0Var.d;
                zg0Var4.a(zg0Var4.f);
                l41VarArr[i4] = new f41(new ArrayList((ArrayList) zg0Var4.h), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path4 = (Path) this.l;
            zg0 zg0Var5 = (zg0) this.i;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            zg0 zg0Var6 = zg0VarArr[i4];
            fArr[0] = zg0Var6.c;
            fArr[1] = zg0Var6.d;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) this.k;
            zg0 zg0Var7 = zg0VarArr[i6];
            zg0Var7.getClass();
            fArr2[0] = f2;
            fArr2[1] = zg0Var7.b;
            matrixArr2[i6].mapPoints(fArr2);
            zg0[] zg0VarArr2 = zg0VarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            zg0 zg0Var8 = zg0VarArr2[i4];
            fArr[0] = zg0Var8.c;
            fArr[1] = zg0Var8.d;
            matrixArr5[i4].mapPoints(fArr);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            zg0Var5.e(0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                fwVar = d41Var.k;
            } else if (i4 != 2) {
                fwVar = i4 != 3 ? d41Var.j : d41Var.i;
            } else {
                fwVar = d41Var.l;
            }
            fwVar.getClass();
            zg0Var5.d(fMax, 0.0f);
            path4.reset();
            zg0Var5.b(matrixArr4[i4], path4);
            if (this.b && (c(path4, i4) || c(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = zg0Var5.b;
                matrixArr4[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                zg0Var5.b(matrixArr4[i4], path2);
            } else {
                zg0Var5.b(matrixArr4[i4], path);
            }
            if (evVar != null) {
                Matrix matrix2 = matrixArr4[i4];
                evVar2 = evVar;
                hk0 hk0Var2 = (hk0) evVar2.d;
                hk0Var2.f.set(i4 + 4, false);
                l41[] l41VarArr2 = hk0Var2.e;
                zg0Var5.a(zg0Var5.f);
                l41VarArr2[i4] = new f41(new ArrayList((ArrayList) zg0Var5.h), new Matrix(matrix2));
            } else {
                evVar2 = evVar;
            }
            evVar3 = evVar2;
            i4 = i5;
            zg0VarArr = zg0VarArr2;
            matrixArr2 = matrixArr5;
            i = 4;
            c = 0;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public Bundle b() {
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
        bundleG.putAll(bundle);
        return bundleG;
    }

    public boolean c(Path path, int i) {
        Path path2 = (Path) this.m;
        path2.reset();
        ((zg0[]) this.c)[i].b(((Matrix[]) this.d)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void d() {
        ui0 ui0Var = (ui0) this.k;
        if (!this.b) {
            ((f01) ui0Var.e).a();
            this.b = true;
            if (((nn0) this.i) != null) {
                lk0.m((an0) this.c);
            }
            ui0Var.p((Bundle) this.f);
        }
        int iOrdinal = ((af0) this.g).ordinal();
        int iOrdinal2 = ((af0) this.h).ordinal();
        if0 if0Var = (if0) this.l;
        if (iOrdinal < iOrdinal2) {
            if0Var.g((af0) this.g);
        } else {
            if0Var.g((af0) this.h);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(nx0.a(an0.class).a());
                sb.append("(" + ((String) this.j) + ')');
                sb.append(" destination=");
                sb.append((vn0) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public dn0(an0 an0Var) {
        final int i = 0;
        this.a = 0;
        this.c = an0Var;
        this.d = an0Var.d;
        this.e = an0Var.e;
        this.g = an0Var.f;
        this.i = an0Var.g;
        this.j = an0Var.h;
        this.f = an0Var.i;
        this.k = new ui0(new f01(an0Var, new y(8, an0Var)), 8);
        g81 g81Var = new g81(new o50() { // from class: bn0
            @Override // defpackage.o50
            public final Object a() {
                switch (i) {
                    case 0:
                        return new h01();
                    default:
                        j90 j90Var = new j90(0);
                        j90Var.a(nx0.a(cn0.class), new a0(7));
                        return j90Var.b();
                }
            }
        });
        this.l = new if0(an0Var);
        this.h = af0.d;
        final int i2 = 1;
        this.m = new g81(new o50() { // from class: bn0
            @Override // defpackage.o50
            public final Object a() {
                switch (i2) {
                    case 0:
                        return new h01();
                    default:
                        j90 j90Var = new j90(0);
                        j90Var.a(nx0.a(cn0.class), new a0(7));
                        return j90Var.b();
                }
            }
        });
    }
}
