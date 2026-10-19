package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class yd {
    public final rd d;
    public r51 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public yd(y6 y6Var) {
        this.d = new rd(this, y6Var);
    }

    public final void a(xf0 xf0Var, int i) {
        r51 r51VarJ = xf0Var.j(i);
        rd rdVar = this.d;
        rdVar.g(r51VarJ, 1.0f);
        rdVar.g(xf0Var.j(i), -1.0f);
    }

    public final void b(r51 r51Var, r51 r51Var2, r51 r51Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        rd rdVar = this.d;
        if (z) {
            rdVar.g(r51Var, 1.0f);
            rdVar.g(r51Var2, -1.0f);
            rdVar.g(r51Var3, -1.0f);
        } else {
            rdVar.g(r51Var, -1.0f);
            rdVar.g(r51Var2, 1.0f);
            rdVar.g(r51Var3, 1.0f);
        }
    }

    public final void c(r51 r51Var, r51 r51Var2, r51 r51Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        rd rdVar = this.d;
        if (z) {
            rdVar.g(r51Var, 1.0f);
            rdVar.g(r51Var2, -1.0f);
            rdVar.g(r51Var3, 1.0f);
        } else {
            rdVar.g(r51Var, -1.0f);
            rdVar.g(r51Var2, 1.0f);
            rdVar.g(r51Var3, -1.0f);
        }
    }

    public r51 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final r51 f(boolean[] zArr, r51 r51Var) {
        int i;
        rd rdVar = this.d;
        int iD = rdVar.d();
        r51 r51Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = rdVar.f(i2);
            if (f2 < 0.0f) {
                r51 r51VarE = rdVar.e(i2);
                if ((zArr == null || !zArr[r51VarE.d]) && r51VarE != r51Var && (((i = r51VarE.n) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    r51Var2 = r51VarE;
                }
            }
        }
        return r51Var2;
    }

    public final void g(r51 r51Var) {
        r51 r51Var2 = this.a;
        rd rdVar = this.d;
        if (r51Var2 != null) {
            rdVar.g(r51Var2, -1.0f);
            this.a.e = -1;
            this.a = null;
        }
        float fH = rdVar.h(r51Var, true) * (-1.0f);
        this.a = r51Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = rdVar.h;
        for (int i2 = 0; i != -1 && i2 < rdVar.a; i2++) {
            float[] fArr = rdVar.g;
            fArr[i] = fArr[i] / fH;
            i = rdVar.f[i];
        }
    }

    public final void h(xf0 xf0Var, r51 r51Var, boolean z) {
        if (r51Var.h) {
            rd rdVar = this.d;
            float fC = rdVar.c(r51Var);
            this.b = (r51Var.g * fC) + this.b;
            rdVar.h(r51Var, z);
            if (z) {
                r51Var.b(this);
            }
            if (rdVar.d() == 0) {
                this.e = true;
                xf0Var.b = true;
            }
        }
    }

    public void i(xf0 xf0Var, yd ydVar, boolean z) {
        rd rdVar = this.d;
        rdVar.getClass();
        float fC = rdVar.c(ydVar.a);
        rdVar.h(ydVar.a, z);
        rd rdVar2 = ydVar.d;
        int iD = rdVar2.d();
        for (int i = 0; i < iD; i++) {
            r51 r51VarE = rdVar2.e(i);
            rdVar.a(r51VarE, rdVar2.c(r51VarE) * fC, z);
        }
        this.b = (ydVar.b * fC) + this.b;
        if (z) {
            ydVar.a.b(this);
        }
        if (this.a == null || rdVar.d() != 0) {
            return;
        }
        this.e = true;
        xf0Var.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            strConcat = strConcat + this.b;
            z = true;
        } else {
            z = false;
        }
        rd rdVar = this.d;
        int iD = rdVar.d();
        for (int i = 0; i < iD; i++) {
            r51 r51VarE = rdVar.e(i);
            if (r51VarE != null) {
                float f = rdVar.f(i);
                if (f != 0.0f) {
                    String string = r51VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
