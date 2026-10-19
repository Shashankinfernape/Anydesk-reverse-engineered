package defpackage;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class au0 {
    public char a;
    public final float[] b;

    public au0(au0 au0Var) {
        this.a = au0Var.a;
        float[] fArr = au0Var.b;
        this.b = uj.h(fArr, fArr.length);
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d7 = f6;
        double d8 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d7;
        double d9 = f4;
        double d10 = ((d9 * dSin) + (((double) f3) * dCos)) / d5;
        double d11 = ((d9 * dCos) + (((double) (-f3)) * dSin)) / d7;
        double d12 = d6 - d10;
        double d13 = d8 - d11;
        double d14 = (d6 + d10) / 2.0d;
        double d15 = (d8 + d11) / 2.0d;
        double d16 = (d13 * d13) + (d12 * d12);
        if (d16 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d16);
            float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d17);
        double d18 = dSqrt * d12;
        double d19 = dSqrt * d13;
        if (z == z2) {
            d = d14 - d19;
            d2 = d15 + d18;
        } else {
            d = d14 + d19;
            d2 = d15 - d18;
        }
        double dAtan2 = Math.atan2(d8 - d2, d6 - d);
        double dAtan3 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d20 = d * d5;
        double d21 = d2 * d7;
        double d22 = (d20 * dCos) - (d21 * dSin);
        double d23 = (d21 * dCos) + (d20 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d24 = d4;
        double d25 = -d5;
        double d26 = d25 * dCos2;
        double d27 = d7 * dSin2;
        double d28 = (d26 * dSin3) - (d27 * dCos3);
        double d29 = d25 * dSin2;
        double d30 = d7 * dCos2;
        double d31 = (dCos3 * d30) + (dSin3 * d29);
        double d32 = dAtan3 / ((double) iCeil);
        double d33 = dAtan2;
        int i = 0;
        while (i < iCeil) {
            double d34 = d33 + d32;
            double dSin4 = Math.sin(d34);
            double dCos4 = Math.cos(d34);
            int i2 = iCeil;
            double d35 = (((d5 * dCos2) * dCos4) + d22) - (d27 * dSin4);
            double d36 = d29;
            double d37 = (d30 * dSin4) + (d5 * dSin2 * dCos4) + d23;
            double d38 = (d26 * dSin4) - (d27 * dCos4);
            double d39 = (dCos4 * d30) + (dSin4 * d36);
            double d40 = d34 - d33;
            double dTan = Math.tan(d40 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d28 * dSqrt2) + d3), (float) ((d31 * dSqrt2) + d24), (float) (d35 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d35, (float) d37);
            i++;
            d3 = d35;
            d24 = d37;
            d22 = d22;
            d33 = d34;
            dCos2 = dCos2;
            d31 = d39;
            d28 = d38;
            iCeil = i2;
            d32 = d32;
            d29 = d36;
        }
    }

    public static void b(au0[] au0VarArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        au0[] au0VarArr2 = au0VarArr;
        float[] fArr = new float[6];
        int length = au0VarArr2.length;
        char c = 0;
        char c2 = 'm';
        int i2 = 0;
        while (i2 < length) {
            au0 au0Var = au0VarArr2[i2];
            char c3 = au0Var.a;
            float[] fArr2 = au0Var.b;
            float f11 = fArr[c];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c3 == 'A') {
                    fArr2 = fArr2;
                    i3 = i3;
                    au0Var = au0Var;
                    float f21 = f20;
                    i2 = i2;
                    int i4 = i3 + 5;
                    int i5 = i3 + 6;
                    a(path, f19, f21, fArr2[i4], fArr2[i5], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f13 = fArr2[i4];
                    f = fArr2[i5];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr2 = fArr2;
                    i3 = i3;
                    i2 = i2;
                    au0Var = au0Var;
                    int i6 = i3 + 2;
                    int i7 = i3 + 3;
                    int i8 = i3 + 4;
                    int i9 = i3 + 5;
                    path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    float f22 = fArr2[i8];
                    float f23 = fArr2[i9];
                    f13 = fArr2[i6];
                    f14 = fArr2[i7];
                    f = f23;
                    f2 = f22;
                } else if (c3 == 'H') {
                    fArr2 = fArr2;
                    i3 = i3;
                    au0Var = au0Var;
                    f = f20;
                    i2 = i2;
                    path.lineTo(fArr2[i3], f);
                    f2 = fArr2[i3];
                } else if (c3 == 'Q') {
                    fArr2 = fArr2;
                    i3 = i3;
                    i2 = i2;
                    au0Var = au0Var;
                    int i10 = i3 + 1;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    path.quadTo(fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                    float f24 = fArr2[i3];
                    float f25 = fArr2[i10];
                    float f26 = fArr2[i11];
                    float f27 = fArr2[i12];
                    f13 = f24;
                    f14 = f25;
                    f2 = f26;
                    f = f27;
                } else if (c3 == 'V') {
                    fArr2 = fArr2;
                    i3 = i3;
                    i2 = i2;
                    au0Var = au0Var;
                    f2 = f19;
                    path.lineTo(f2, fArr2[i3]);
                    f = fArr2[i3];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr2 = fArr2;
                        i3 = i3;
                        int i13 = i3 + 2;
                        int i14 = i3 + 3;
                        int i15 = i3 + 4;
                        int i16 = i3 + 5;
                        path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f28 = fArr2[i13] + f19;
                        float f29 = fArr2[i14] + f20;
                        f19 += fArr2[i15];
                        f20 += fArr2[i16];
                        f13 = f28;
                        f14 = f29;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr2 = fArr2;
                                    i3 = i3;
                                    int i17 = i3 + 1;
                                    path.lineTo(fArr2[i3], fArr2[i17]);
                                    f2 = fArr2[i3];
                                    f = fArr2[i17];
                                } else if (c3 == 'M') {
                                    fArr2 = fArr2;
                                    i3 = i3;
                                    f2 = fArr2[i3];
                                    f = fArr2[i3 + 1];
                                    if (i3 > 0) {
                                        path.lineTo(f2, f);
                                    } else {
                                        path.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 == 'S') {
                                    fArr2 = fArr2;
                                    i3 = i3;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f30 = f19;
                                    float f31 = f20;
                                    int i18 = i3 + 1;
                                    int i19 = i3 + 2;
                                    int i20 = i3 + 3;
                                    path.cubicTo(f30, f31, fArr2[i3], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    float f32 = fArr2[i3];
                                    f13 = f32;
                                    f14 = fArr2[i18];
                                    f2 = fArr2[i19];
                                    f = fArr2[i20];
                                } else if (c3 == 'T') {
                                    fArr2 = fArr2;
                                    i3 = i3;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    int i21 = i3 + 1;
                                    path.quadTo(f19, f20, fArr2[i3], fArr2[i21]);
                                    f2 = fArr2[i3];
                                    f = fArr2[i21];
                                    au0Var = au0Var;
                                    f13 = f19;
                                    f14 = f20;
                                } else if (c3 == 'l') {
                                    fArr2 = fArr2;
                                    i3 = i3;
                                    int i22 = i3 + 1;
                                    path.rLineTo(fArr2[i3], fArr2[i22]);
                                    f19 += fArr2[i3];
                                    f6 = fArr2[i22];
                                } else if (c3 == 'm') {
                                    fArr2 = fArr2;
                                    i3 = i3;
                                    float f33 = fArr2[i3];
                                    f19 += f33;
                                    float f34 = fArr2[i3 + 1];
                                    f20 += f34;
                                    if (i3 > 0) {
                                        path.rLineTo(f33, f34);
                                    } else {
                                        path.rMoveTo(f33, f34);
                                        au0Var = au0Var;
                                        f2 = f19;
                                        f17 = f2;
                                        f = f20;
                                        f18 = f;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 != 't') {
                                        f2 = f19;
                                    } else {
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i23 = i3 + 1;
                                        path.rQuadTo(f9, f10, fArr2[i3], fArr2[i23]);
                                        float f35 = f9 + f19;
                                        float f36 = f10 + f20;
                                        float f37 = f19 + fArr2[i3];
                                        f20 += fArr2[i23];
                                        f14 = f36;
                                        f2 = f37;
                                        f13 = f35;
                                    }
                                    f = f20;
                                } else {
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f7 = f20 - f14;
                                        f8 = f19 - f13;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i24 = i3;
                                    int i25 = i24 + 1;
                                    int i26 = i24 + 2;
                                    int i27 = i24 + 3;
                                    fArr2 = fArr2;
                                    i3 = i24;
                                    path.rCubicTo(f8, f7, fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                    f3 = fArr2[i3] + f19;
                                    f4 = fArr2[i25] + f20;
                                    f19 += fArr2[i26];
                                    f5 = fArr2[i27];
                                }
                                au0Var = au0Var;
                            } else {
                                fArr2 = fArr2;
                                i3 = i3;
                                path.rLineTo(0.0f, fArr2[i3]);
                                f6 = fArr2[i3];
                            }
                            f20 += f6;
                        } else {
                            fArr2 = fArr2;
                            i3 = i3;
                            int i28 = i3 + 1;
                            int i29 = i3 + 2;
                            int i30 = i3 + 3;
                            path.rQuadTo(fArr2[i3], fArr2[i28], fArr2[i29], fArr2[i30]);
                            f3 = fArr2[i3] + f19;
                            f4 = fArr2[i28] + f20;
                            f19 += fArr2[i29];
                            f5 = fArr2[i30];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr2 = fArr2;
                        i3 = i3;
                        path.rLineTo(fArr2[i3], 0.0f);
                        f19 += fArr2[i3];
                    }
                    au0Var = au0Var;
                    f2 = f19;
                    f = f20;
                } else {
                    fArr2 = fArr2;
                    i3 = i3;
                    int i31 = i3 + 5;
                    float f38 = fArr2[i31] + f19;
                    int i32 = i3 + 6;
                    float f39 = fArr2[i32] + f20;
                    au0Var = au0Var;
                    float f40 = f19;
                    float f41 = f20;
                    i2 = i2;
                    a(path, f40, f41, f38, f39, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f2 = f40 + fArr2[i31];
                    f = f41 + fArr2[i32];
                    f13 = f2;
                    f14 = f;
                }
                i3 += i;
                path = path;
                au0Var = au0Var;
                c3 = c3;
                i2 = i2;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr2 = fArr2;
            }
            fArr[0] = f19;
            fArr[1] = f20;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f17;
            fArr[5] = f18;
            c2 = au0Var.a;
            i2++;
            au0VarArr2 = au0VarArr;
            c = 0;
        }
    }

    public au0(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }
}
