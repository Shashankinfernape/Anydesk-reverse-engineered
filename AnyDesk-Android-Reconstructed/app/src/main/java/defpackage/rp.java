package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class rp extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public bq p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.b0 = false;
            if (i2 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.d0 = true;
        this.a0 = true;
        this.b0 = true;
        if (!(this.p0 instanceof k70)) {
            this.p0 = new k70();
        }
        ((k70) this.p0).S(this.V);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = this.w;
        this.k0 = this.y;
        float f = this.E;
        this.l0 = f;
        int i8 = this.a;
        this.m0 = i8;
        int i9 = this.b;
        this.n0 = i9;
        float f2 = this.c;
        this.o0 = f2;
        int i10 = this.s;
        if (z2) {
            if (i10 != -1) {
                this.h0 = i10;
            } else {
                int i11 = this.t;
                if (i11 != -1) {
                    this.i0 = i11;
                } else {
                    i2 = this.u;
                    if (i2 != -1) {
                        this.g0 = i2;
                        z = true;
                    }
                    i3 = this.v;
                    if (i3 != -1) {
                        this.f0 = i3;
                        z = true;
                    }
                    i4 = this.A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.k0 = i4;
                    }
                    i5 = this.B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.j0 = i5;
                    }
                    if (z) {
                        this.l0 = 1.0f - f;
                    }
                    if (this.d0 && this.V == 1 && this.d) {
                        if (f2 != -1.0f) {
                            this.o0 = 1.0f - f2;
                            this.m0 = -1;
                            this.n0 = -1;
                        } else if (i8 != -1) {
                            this.n0 = i8;
                            this.m0 = -1;
                            this.o0 = -1.0f;
                        } else if (i9 != -1) {
                            this.m0 = i9;
                            this.n0 = -1;
                            this.o0 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.u;
            if (i2 != -1) {
                this.g0 = i2;
                z = true;
            }
            i3 = this.v;
            if (i3 != -1) {
                this.f0 = i3;
                z = true;
            }
            i4 = this.A;
            if (i4 != Integer.MIN_VALUE) {
                this.k0 = i4;
            }
            i5 = this.B;
            if (i5 != Integer.MIN_VALUE) {
                this.j0 = i5;
            }
            if (z) {
                this.l0 = 1.0f - f;
            }
            if (this.d0) {
                if (f2 != -1.0f) {
                    this.o0 = 1.0f - f2;
                    this.m0 = -1;
                    this.n0 = -1;
                } else if (i8 != -1) {
                    this.n0 = i8;
                    this.m0 = -1;
                    this.o0 = -1.0f;
                } else if (i9 != -1) {
                    this.m0 = i9;
                    this.n0 = -1;
                    this.o0 = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.g0 = i10;
            }
            int i12 = this.t;
            if (i12 != -1) {
                this.f0 = i12;
            }
            int i13 = this.u;
            if (i13 != -1) {
                this.h0 = i13;
            }
            int i14 = this.v;
            if (i14 != -1) {
                this.i0 = i14;
            }
            int i15 = this.A;
            if (i15 != Integer.MIN_VALUE) {
                this.j0 = i15;
            }
            int i16 = this.B;
            if (i16 != Integer.MIN_VALUE) {
                this.k0 = i16;
            }
        }
        if (this.u == -1 && this.v == -1 && this.t == -1 && i10 == -1) {
            int i17 = this.g;
            if (i17 != -1) {
                this.h0 = i17;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i18 = this.h;
                if (i18 != -1) {
                    this.i0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i19 = this.e;
            if (i19 != -1) {
                this.f0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i20 = this.f;
            if (i20 != -1) {
                this.g0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
