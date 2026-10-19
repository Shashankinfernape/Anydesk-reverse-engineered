package defpackage;

import android.animation.TimeAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class hq0 implements TimeAnimator.TimeListener {
    public final TimeAnimator c = new TimeAnimator();
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public double l = 0.0d;
    public double m = 0.0d;
    public double n = 0.0d;
    public double o = 0.0d;
    public final ev p;
    public final double q;
    public final double r;

    public hq0(ev evVar, double d, double d2) {
        this.p = evVar;
        this.q = d;
        this.r = d2;
    }

    public final void a(int i, int i2, int i3, int i4, float f, float f2) {
        int i5;
        boolean z = true;
        b(true);
        if (i < 0) {
            i = 0;
            z = false;
        }
        if (i2 < 0) {
            i2 = 0;
            z = false;
        }
        if (i > i3) {
            i = i3;
            z = false;
        }
        if (i2 > i4) {
            i2 = i4;
            z = false;
        }
        this.f = i;
        this.g = i2;
        this.h = i;
        this.i = i2;
        this.j = i;
        this.k = i2;
        this.d = i3;
        this.e = i4;
        double d = f / 1000.0f;
        this.l = d;
        this.m = f2 / 1000.0f;
        if (Math.abs(d) >= this.q * 0.005d || Math.abs(this.m) >= this.r * 0.005d) {
            double d2 = this.l;
            double d3 = this.m;
            if (d2 < 0.0d) {
                if (d3 < 0.0d) {
                    double d4 = ((double) (-i)) / d2;
                    double d5 = ((double) (-i2)) / d3;
                    if (d4 < d5) {
                        this.j = 0;
                        this.k = (int) ((d3 * d4) + ((double) i2));
                    } else {
                        this.j = (int) ((d2 * d5) + ((double) i));
                        this.k = 0;
                    }
                } else {
                    double d6 = ((double) (-i)) / d2;
                    double d7 = ((double) (i4 - i2)) / d3;
                    if (d6 < d7) {
                        this.j = 0;
                        this.k = (int) ((d3 * d6) + ((double) i2));
                    } else {
                        this.j = (int) ((d2 * d7) + ((double) i));
                        this.k = i4;
                    }
                }
            } else if (d3 < 0.0d) {
                double d8 = ((double) (i3 - i)) / d2;
                double d9 = ((double) (-i2)) / d3;
                if (d8 < d9) {
                    this.j = i3;
                    this.k = (int) ((d3 * d8) + ((double) i2));
                } else {
                    this.j = (int) ((d2 * d9) + ((double) i));
                    this.k = 0;
                }
            } else {
                double d10 = ((double) (i3 - i)) / d2;
                double d11 = ((double) (i4 - i2)) / d3;
                if (d10 < d11) {
                    this.j = i3;
                    this.k = (int) ((d3 * d10) + ((double) i2));
                } else {
                    this.j = (int) ((d2 * d11) + ((double) i));
                    this.k = i4;
                }
            }
        } else {
            this.l = 0.0d;
            this.m = 0.0d;
            int i6 = this.f;
            float f3 = i6;
            int i7 = this.d;
            float f4 = i6 - i7;
            int i8 = this.g;
            float f5 = i8;
            int i9 = this.e;
            float f6 = i8 - i9;
            if (f3 < 0.0f) {
                f3 = -f3;
            }
            if (f4 < 0.0f) {
                f4 = -f4;
            }
            if (f5 < 0.0f) {
                f5 = -f5;
            }
            if (f6 < 0.0f) {
                f6 = -f6;
            }
            if (f4 < f3) {
                f3 = f4;
                i5 = i7;
            } else {
                i5 = 0;
            }
            if (f5 < f3) {
                i5 = i6;
                i8 = 0;
            } else {
                f5 = f3;
            }
            if (f6 < f5) {
                i8 = i9;
            } else {
                i6 = i5;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            int i10 = i8 >= 0 ? i8 : 0;
            if (i6 <= i7) {
                i7 = i6;
            }
            if (i10 <= i9) {
                i9 = i10;
            }
            this.j = i7;
            this.k = i9;
        }
        if (!z) {
            this.p.o(this.j, this.k);
            return;
        }
        this.n = ((((((double) this.j) - (this.l * 400.0d)) - ((double) this.h)) * 2.0d) / 400.0d) / 400.0d;
        this.o = ((((((double) this.k) - (this.m * 400.0d)) - ((double) this.i)) * 2.0d) / 400.0d) / 400.0d;
        TimeAnimator timeAnimator = this.c;
        timeAnimator.setCurrentPlayTime(0L);
        timeAnimator.setTimeListener(this);
        timeAnimator.start();
    }

    public final void b(boolean z) {
        this.c.cancel();
        if (z) {
            return;
        }
        this.p.o(this.j, this.k);
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        if (j > 400) {
            b(false);
            return;
        }
        double d = j;
        int i = (int) ((this.l * d) + (this.n * 0.5d * d * d) + ((double) this.h));
        this.f = i;
        int i2 = (int) ((this.m * d) + (this.o * 0.5d * d * d) + ((double) this.i));
        this.g = i2;
        if (i < 0 || i2 < 0 || i > this.d || i2 > this.e || (i == this.j && i2 == this.k)) {
            this.c.cancel();
            this.f = this.j;
            this.g = this.k;
        }
        this.p.o(this.f, this.g);
    }
}
