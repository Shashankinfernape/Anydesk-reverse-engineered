package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b7 implements View.OnGenericMotionListener, View.OnTouchListener {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public d7 K;
    public final double L;
    public final double M;
    public int d;
    public float e;
    public float f;
    public int g;
    public float h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public float z;
    public int c = 0;
    public boolean o = false;
    public boolean p = false;
    public nm0 q = nm0.d;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean I = false;
    public int J = 0;
    public long N = 0;
    public int O = 0;
    public final vy0 P = new vy0(new c(10, this));
    public int Q = 2;

    public b7(d7 d7Var, double d, double d2) {
        this.K = d7Var;
        this.L = d;
        this.M = d2;
    }

    public final void a(float f, float f2, int i) {
        vy0 vy0Var = this.P;
        boolean zA = vy0Var.a();
        nm0 nm0Var = nm0.d;
        if (!zA) {
            if (this.I) {
                b(f, f2);
                return;
            }
            if (this.p && i == this.d) {
                this.e = f;
                this.f = f2;
                this.p = false;
                int i2 = this.q.c;
                nm0 nm0Var2 = (i2 & 1) == 1 ? new nm0(2) : nm0Var;
                if ((i2 & 4) == 4) {
                    nm0Var2 = new nm0(nm0Var2.c | 8);
                }
                this.q = nm0Var;
                h(nm0Var2, f, f2);
                return;
            }
            return;
        }
        if (i == this.u) {
            if (this.I) {
                b(f, f2);
                return;
            }
            if (this.y) {
                i(5);
                return;
            }
            Looper looper = t70.a;
            if (SystemClock.uptimeMillis() - this.N >= 500) {
                this.y = true;
                this.z = f;
                this.A = f2;
            } else {
                vy0Var.d();
                h(nm0.e, f, f2);
                h(nm0.f, f, f2);
                this.I = false;
                this.p = false;
                this.q = nm0Var;
            }
        }
    }

    public final void b(float f, float f2) {
        this.P.d();
        h(nm0.f, f, f2);
        this.I = false;
        this.p = false;
        this.q = nm0.d;
    }

    public final float c() {
        return ((this.e + this.h) + this.k) / 3.0f;
    }

    public final float d() {
        return ((this.f + this.i) + this.l) / 3.0f;
    }

    public final float e() {
        float f = this.e - this.h;
        float f2 = this.f - this.i;
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public final void f(MotionEvent motionEvent) {
        float f;
        float f2;
        int i;
        int i2;
        d7 d7Var;
        km0 km0Var;
        jm0 jm0Var;
        hm0 hm0Var;
        int i3;
        em0 em0Var;
        float axisValue;
        float axisValue2;
        nm0 nm0Var = nm0.d;
        if (this.Q == 1) {
            int source = motionEvent.getSource();
            km0 km0Var2 = km0.msrcc_none;
            km0[] km0VarArrValues = km0.values();
            int length = km0VarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    km0Var = km0Var2;
                    break;
                }
                km0 km0Var3 = km0VarArrValues[i4];
                if (km0Var3 != km0Var2) {
                    int i5 = km0Var3.d;
                    if (i5 == (i5 & source & 255)) {
                        km0Var = km0Var3;
                        break;
                    }
                }
                i4++;
            }
            int source2 = motionEvent.getSource();
            jm0 jm0Var2 = jm0.msrc_unknown;
            jm0[] jm0VarArrValues = jm0.values();
            int length2 = jm0VarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    jm0Var = jm0Var2;
                    break;
                }
                jm0 jm0Var3 = jm0VarArrValues[i6];
                if (jm0Var3 != jm0Var2) {
                    int i7 = jm0Var3.d;
                    if (i7 == (i7 & source2)) {
                        jm0Var = jm0Var3;
                        break;
                    }
                }
                i6++;
            }
            int deviceId = motionEvent.getDeviceId();
            int actionMasked = motionEvent.getActionMasked();
            hm0[] hm0VarArrValues = hm0.values();
            int length3 = hm0VarArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length3) {
                    hm0Var = hm0.mop_none;
                    break;
                }
                hm0Var = hm0VarArrValues[i8];
                if (hm0Var.d == actionMasked) {
                    break;
                } else {
                    i8++;
                }
            }
            if (hm0Var == hm0.mop_none) {
                return;
            }
            int pointerCount = (byte) motionEvent.getPointerCount();
            int i9 = cm0.maf_axis_x.c | cm0.maf_axis_y.c;
            int[] iArr = new int[pointerCount];
            float[] fArr = new float[pointerCount];
            float[] fArr2 = new float[pointerCount];
            int eventTime = motionEvent.getEventTime() > motionEvent.getDownTime() ? (int) ((motionEvent.getEventTime() - motionEvent.getDownTime()) & 4294967295L) : 0;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                iArr[i10] = motionEvent.getPointerId(i10);
                fArr[i10] = motionEvent.getX(i10);
                fArr2[i10] = motionEvent.getY(i10);
            }
            int buttonState = motionEvent.getButtonState();
            int i11 = this.O ^ buttonState;
            em0[] em0VarArrValues = em0.values();
            int length4 = em0VarArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length4) {
                    i3 = pointerCount;
                    em0Var = em0.mbtn_none;
                    break;
                }
                em0Var = em0VarArrValues[i12];
                i3 = pointerCount;
                if (em0Var.d == i11) {
                    break;
                }
                i12++;
                pointerCount = i3;
            }
            em0 em0Var2 = em0Var;
            this.O = buttonState;
            if (actionMasked == 8) {
                axisValue2 = motionEvent.getAxisValue(10);
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = 0.0f;
                axisValue2 = 0.0f;
            }
            int i13 = iArr[motionEvent.getActionIndex()];
            d7 d7Var2 = this.K;
            if (d7Var2 != null) {
                e7 e7Var = new e7(km0Var, jm0Var, deviceId, hm0Var, i13, eventTime, i3 == true ? (byte) 1 : (byte) 0, 0, i9, axisValue2, axisValue, em0Var2, iArr, fArr, fArr2);
                synchronized (d7Var2) {
                    try {
                        vy0 vy0Var = d7Var2.g;
                        Looper looper = t70.a;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        d7Var2.o = e7Var;
                        if (e7Var.d != hm0.mop_move || jUptimeMillis - d7Var2.n > 20) {
                            if (vy0Var != null) {
                                vy0Var.d();
                            }
                            a7 a7Var = d7Var2.a;
                            if (a7Var != null) {
                                a7Var.c(e7Var);
                            }
                            d7Var2.n = jUptimeMillis;
                        } else if (vy0Var != null && !vy0Var.a()) {
                            vy0Var.b(20L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        if (!motionEvent.isFromSource(1048584) && !motionEvent.isFromSource(4098)) {
            j();
            d7 d7Var3 = this.K;
            int actionMasked2 = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (actionMasked2 == 8) {
                if (d7Var3 != null) {
                    float axisValue3 = motionEvent.getAxisValue(9);
                    if (axisValue3 < 0.0f) {
                        d7Var3.l(x, y, -1);
                    } else if (axisValue3 > 0.0f) {
                        d7Var3.l(x, y, 1);
                    }
                    float axisValue4 = motionEvent.getAxisValue(10);
                    if (axisValue4 < 0.0f) {
                        d7Var3.d(x, y, -1);
                        return;
                    } else {
                        if (axisValue4 > 0.0f) {
                            d7Var3.d(x, y, 1);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int buttonState2 = motionEvent.getButtonState();
            int i14 = this.J;
            int i15 = (~i14) & buttonState2;
            int i16 = i14 & (~buttonState2);
            this.J = buttonState2;
            if (t70.e(i15, 1)) {
                nm0Var = new nm0(1);
            }
            if (t70.e(i15, 2)) {
                nm0Var = new nm0(nm0Var.c | 4);
            }
            if (t70.e(i15, 4)) {
                nm0Var = new nm0(nm0Var.c | 16);
            }
            if (t70.e(i16, 1)) {
                nm0Var = new nm0(nm0Var.c | 2);
            }
            if (t70.e(i16, 2)) {
                nm0Var = new nm0(nm0Var.c | 8);
            }
            if (t70.e(i16, 4)) {
                nm0Var = new nm0(nm0Var.c | 32);
            }
            if (d7Var3 != null) {
                d7Var3.e(nm0Var, x, y);
                return;
            }
            return;
        }
        vy0 vy0Var2 = this.P;
        double d = this.L;
        double d2 = this.M;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 != 0) {
            if (actionMasked3 != 1) {
                if (actionMasked3 == 2) {
                    int iR = q51.r(this.Q);
                    if (iR == 1 || iR == 2) {
                        d7 d7Var4 = this.K;
                        int i17 = this.c;
                        if (i17 == 1) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            int i18 = 0;
                            while (i18 < pointerCount2) {
                                int pointerId = motionEvent.getPointerId(i18);
                                if (!vy0Var2.a()) {
                                    i = i18;
                                    if (pointerId == this.d) {
                                        i2 = i;
                                        this.e = motionEvent.getX(i2);
                                        float y2 = motionEvent.getY(i2);
                                        this.f = y2;
                                        if (this.p) {
                                            h(this.q, this.e, y2);
                                        }
                                    } else {
                                        i2 = i;
                                    }
                                } else if (pointerId == this.u) {
                                    this.x = true;
                                    this.z = motionEvent.getX(i18);
                                    float y3 = motionEvent.getY(i18);
                                    this.A = y3;
                                    double d3 = ((double) (this.z - this.v)) / d;
                                    i = i18;
                                    double d4 = ((double) (y3 - this.w)) / d2;
                                    double dSqrt = Math.sqrt((d4 * d4) + (d3 * d3));
                                    int i19 = this.Q;
                                    if (dSqrt > 0.1d) {
                                        if (i19 != 3) {
                                            i(2);
                                        } else if (this.y) {
                                            this.I = true;
                                            i(2);
                                        } else {
                                            i(1);
                                        }
                                    } else if (i19 == 3) {
                                        h(this.q, this.z, this.A);
                                    }
                                    i2 = i;
                                } else {
                                    i2 = i18;
                                }
                                i18 = i2 + 1;
                            }
                            return;
                        }
                        if (i17 >= 2) {
                            int pointerCount3 = motionEvent.getPointerCount();
                            boolean z = false;
                            for (int i20 = 0; i20 < pointerCount3; i20++) {
                                int pointerId2 = motionEvent.getPointerId(i20);
                                if (pointerId2 == this.d) {
                                    this.e = motionEvent.getX(i20);
                                    this.f = motionEvent.getY(i20);
                                } else if (pointerId2 == this.g) {
                                    this.h = motionEvent.getX(i20);
                                    this.i = motionEvent.getY(i20);
                                } else {
                                    if (pointerId2 == this.j) {
                                        this.k = motionEvent.getX(i20);
                                        this.l = motionEvent.getY(i20);
                                    }
                                }
                                z = true;
                            }
                            if (z) {
                                int i21 = this.c;
                                if (i21 != 2) {
                                    if (i21 == 3) {
                                        if (!this.s) {
                                            if (!this.t || d7Var4 == null) {
                                                return;
                                            }
                                            d7Var4.i(c(), d());
                                            return;
                                        }
                                        float fC = c();
                                        float fD = d();
                                        double d5 = ((double) (this.E - fC)) / d;
                                        double d6 = ((double) (this.F - fD)) / d2;
                                        if (Math.sqrt((d6 * d6) + (d5 * d5)) > 0.1d) {
                                            this.s = false;
                                            if (d7Var4 != null) {
                                                d7Var4.k(c(), d());
                                            }
                                            this.t = true;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if (!this.r) {
                                    float f3 = (this.e + this.h) / 2.0f;
                                    float f4 = (this.f + this.i) / 2.0f;
                                    float fE = e();
                                    double d7 = ((double) (this.B - f3)) / d;
                                    double d8 = ((double) (this.C - f4)) / d2;
                                    double dSqrt2 = Math.sqrt((d8 * d8) + (d7 * d7));
                                    float f5 = this.D;
                                    double d9 = (((double) (f5 - fE)) / (d + d2)) * 2.0d;
                                    if (d9 < 0.0d) {
                                        d9 = -d9;
                                    }
                                    if (dSqrt2 > 0.1d || d9 > 0.1d) {
                                        if (d7Var4 != null) {
                                            d7Var4.j(this.B, this.C, f5);
                                        }
                                        this.r = true;
                                    }
                                }
                                if (!this.r || d7Var4 == null) {
                                    return;
                                }
                                d7Var4.h((this.e + this.h) / 2.0f, (this.f + this.i) / 2.0f, e());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (actionMasked3 == 3) {
                    int iR2 = q51.r(this.Q);
                    if (iR2 == 1 || iR2 == 2) {
                        g(motionEvent);
                        j();
                        return;
                    }
                    return;
                }
                f = 2.0f;
                if (actionMasked3 != 5) {
                    if (actionMasked3 != 6) {
                        if (actionMasked3 == 8 && (d7Var = this.K) != null) {
                            float x2 = motionEvent.getX();
                            float y4 = motionEvent.getY();
                            if (motionEvent.getAxisValue(9) < 0.0f) {
                                d7Var.l(x2, y4, -1);
                            } else {
                                d7Var.l(x2, y4, 1);
                            }
                            if (motionEvent.getAxisValue(10) < 0.0f) {
                                d7Var.d(x2, y4, -1);
                                return;
                            } else {
                                d7Var.d(x2, y4, 1);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
            g(motionEvent);
            return;
        }
        f = 2.0f;
        d7 d7Var5 = this.K;
        int actionIndex = motionEvent.getActionIndex();
        int pointerId3 = motionEvent.getPointerId(actionIndex);
        float x3 = motionEvent.getX(actionIndex);
        float y5 = motionEvent.getY(actionIndex);
        int i22 = this.c + 1;
        this.c = i22;
        if (i22 == 1) {
            if (this.y) {
                f2 = x3;
                double d10 = ((double) (x3 - this.z)) / d;
                double d11 = ((double) (y5 - this.A)) / d2;
                if (Math.sqrt((d11 * d11) + (d10 * d10)) > 0.1d) {
                    i(4);
                }
            } else {
                f2 = x3;
            }
            float f6 = f2;
            if (this.Q == 3) {
                this.G = f6;
                this.H = y5;
                if (d7Var5 != null) {
                    d7Var5.g();
                }
            }
            this.u = pointerId3;
            this.v = f6;
            this.w = y5;
            this.x = false;
            vy0Var2.b(500L);
            return;
        }
        if (i22 == 2) {
            i(6);
            this.g = pointerId3;
            this.h = x3;
            this.i = y5;
            this.B = (this.e + x3) / f;
            this.C = (this.f + y5) / f;
            this.D = e();
            return;
        }
        if (i22 != 3) {
            if (i22 >= 4) {
                this.s = false;
                this.t = false;
                return;
            }
            return;
        }
        this.j = pointerId3;
        this.k = x3;
        this.l = y5;
        if (this.I) {
            b(this.e, this.f);
        }
        if (this.r && d7Var5 != null) {
            d7Var5.b();
        }
        this.s = true;
        this.E = c();
        float fD2 = d();
        this.F = fD2;
        if (this.o || d7Var5 == null) {
            return;
        }
        d7Var5.e(nm0Var, this.E, fD2);
    }

    public final void g(MotionEvent motionEvent) {
        d7 d7Var = this.K;
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        int i = this.c - 1;
        this.c = i;
        if (i < 0) {
            this.c = 0;
            return;
        }
        if (i == 0) {
            a(x, y, pointerId);
            return;
        }
        if (i == 1) {
            if (this.r) {
                this.r = false;
                if (d7Var != null) {
                    d7Var.b();
                }
            }
            if (pointerId == this.d) {
                this.d = this.g;
                this.e = this.h;
                this.f = this.i;
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.s) {
                this.s = false;
                if (this.Q == 3) {
                    if (d7Var != null) {
                        d7Var.g();
                    }
                    if (d7Var != null) {
                        d7Var.f(new nm0(this.q.c | 16), 0.0f, 0.0f);
                    }
                    if (d7Var != null) {
                        d7Var.f(new nm0(this.q.c | 32), 0.0f, 0.0f);
                    }
                } else {
                    if (d7Var != null) {
                        d7Var.e(new nm0(this.q.c | 16), this.m, this.n);
                    }
                    if (d7Var != null) {
                        d7Var.e(new nm0(this.q.c | 32), this.m, this.n);
                    }
                }
            }
            if (this.t) {
                this.t = false;
                if (d7Var != null) {
                    d7Var.c();
                }
            }
            if (pointerId == this.d) {
                this.d = this.j;
                this.e = this.k;
                this.f = this.l;
            } else if (pointerId == this.g) {
                this.g = this.j;
                this.h = this.k;
                this.i = this.l;
            }
            if (this.r) {
                if (d7Var != null) {
                    d7Var.j((this.e + this.h) / 2.0f, (this.f + this.i) / 2.0f, e());
                }
            } else {
                this.B = (this.e + this.h) / 2.0f;
                this.C = (this.f + this.i) / 2.0f;
                this.D = e();
            }
        }
    }

    public final void h(nm0 nm0Var, float f, float f2) {
        d7 d7Var = this.K;
        if (this.Q == 3) {
            float f3 = f - this.G;
            float f4 = f2 - this.H;
            if (d7Var != null) {
                d7Var.f(nm0Var, f3, f4);
            }
        } else {
            this.m = f;
            this.n = f2;
            if (d7Var != null) {
                d7Var.e(nm0Var, f, f2);
            }
        }
        this.o = true;
    }

    public final void i(int i) {
        vy0 vy0Var = this.P;
        if (vy0Var.a()) {
            vy0Var.d();
            this.d = this.u;
            float f = this.v;
            this.e = f;
            float f2 = this.w;
            this.f = f2;
            nm0 nm0Var = nm0.e;
            if (i == 2) {
                this.p = true;
                this.q = nm0Var;
                h(nm0Var, f, f2);
            } else if (i == 3) {
                this.p = true;
                nm0 nm0Var2 = nm0.g;
                this.q = nm0Var2;
                h(nm0Var2, f, f2);
            } else {
                nm0 nm0Var3 = nm0.f;
                nm0 nm0Var4 = nm0.d;
                if (i == 4) {
                    this.p = false;
                    this.q = nm0Var4;
                    h(nm0Var, f, f2);
                    h(nm0Var3, this.e, this.f);
                } else if (i == 5) {
                    this.p = false;
                    this.q = nm0Var4;
                    Looper looper = t70.a;
                    this.N = SystemClock.uptimeMillis();
                    h(nm0Var, this.e, this.f);
                    h(nm0Var3, this.e, this.f);
                    h(nm0Var, this.e, this.f);
                    h(nm0Var3, this.e, this.f);
                } else if (i == 1) {
                    this.p = true;
                    this.q = nm0Var4;
                }
            }
            if (this.x) {
                float f3 = this.z;
                this.e = f3;
                float f4 = this.A;
                this.f = f4;
                if (i == 1 || (this.p && (i == 2 || i == 3))) {
                    h(this.q, f3, f4);
                }
            }
            this.y = false;
        }
    }

    public final void j() {
        d7 d7Var = this.K;
        if (this.c > 2) {
            if (this.s) {
                this.s = false;
            }
            if (this.t) {
                this.t = false;
                if (d7Var != null) {
                    d7Var.c();
                }
            }
        }
        if (this.c > 1 && this.r) {
            this.r = false;
            if (d7Var != null) {
                d7Var.b();
            }
        }
        if (this.c > 0) {
            a(this.e, this.f, this.d);
        }
        this.c = 0;
    }

    public final synchronized void k(int i) {
        this.Q = i;
    }

    @Override // android.view.View.OnGenericMotionListener
    public final synchronized boolean onGenericMotion(View view, MotionEvent motionEvent) {
        f(motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        f(motionEvent);
        return true;
    }
}
