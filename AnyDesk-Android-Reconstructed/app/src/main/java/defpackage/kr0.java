package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements lg0 {
    public final ss0 c;
    public final af1 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public kr0(ss0 ss0Var, ss0 ss0Var2, af1 af1Var) {
        ss0Var.getClass();
        this.c = ss0Var2;
        this.d = af1Var;
        this.e = ss0Var.c;
        this.f = ss0Var.d;
        this.g = ss0Var.b;
        this.h = 1;
        this.i = 1;
    }

    @Override // defpackage.lg0
    public final void b(Object obj, int i, int i2) {
        this.d.b(obj, i + this.e, i2);
    }

    @Override // defpackage.lg0
    public final void c(int i, int i2) {
        int i3;
        int i4 = i + i2;
        int i5 = this.g;
        lu luVar = lu.c;
        ss0 ss0Var = this.c;
        af1 af1Var = this.d;
        if (i4 >= i5 && this.i != 3) {
            int iMin = Math.min(ss0Var.d - this.f, i2);
            i3 = iMin >= 0 ? iMin : 0;
            int i6 = i2 - i3;
            if (i3 > 0) {
                this.i = 2;
                af1Var.b(luVar, this.e + i, i3);
                this.f += i3;
            }
            if (i6 > 0) {
                af1Var.c(i + i3 + this.e, i6);
            }
        } else if (i <= 0 && this.h != 3) {
            int iMin2 = Math.min(ss0Var.c - this.e, i2);
            i3 = iMin2 >= 0 ? iMin2 : 0;
            int i7 = i2 - i3;
            if (i7 > 0) {
                af1Var.c(this.e, i7);
            }
            if (i3 > 0) {
                this.h = 2;
                af1Var.b(luVar, this.e, i3);
                this.e += i3;
            }
        } else {
            af1Var.c(i + this.e, i2);
        }
        this.g -= i2;
    }

    @Override // defpackage.lg0
    public final void d(int i, int i2) {
        int i3 = this.e;
        this.d.d(i + i3, i2 + i3);
    }

    @Override // defpackage.lg0
    public final void n(int i, int i2) {
        int i3 = this.g;
        lu luVar = lu.d;
        af1 af1Var = this.d;
        if (i >= i3 && this.i != 2) {
            int iMin = Math.min(i2, this.f);
            if (iMin > 0) {
                this.i = 3;
                af1Var.b(luVar, this.e + i, iMin);
                this.f -= iMin;
            }
            int i4 = i2 - iMin;
            if (i4 > 0) {
                af1Var.n(i + iMin + this.e, i4);
            }
        } else if (i <= 0 && this.h != 2) {
            int iMin2 = Math.min(i2, this.e);
            if (iMin2 > 0) {
                this.h = 3;
                af1Var.b(luVar, (0 - iMin2) + this.e, iMin2);
                this.e -= iMin2;
            }
            int i5 = i2 - iMin2;
            if (i5 > 0) {
                af1Var.n(this.e, i5);
            }
        } else {
            af1Var.n(i + this.e, i2);
        }
        this.g += i2;
    }
}
