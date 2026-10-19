package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zu0 extends yd {
    public r51[] f;
    public r51[] g;
    public int h;
    public ui0 i;

    @Override // defpackage.yd
    public final r51 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            r51[] r51VarArr = this.f;
            r51 r51Var = r51VarArr[i2];
            if (!zArr[r51Var.d]) {
                ui0 ui0Var = this.i;
                ui0Var.e = r51Var;
                int i3 = 8;
                if (i != -1) {
                    r51 r51Var2 = r51VarArr[i];
                    while (i3 >= 0) {
                        float f = r51Var2.j[i3];
                        float f2 = ((r51) ui0Var.e).j[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((r51) ui0Var.e).j[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.yd
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.yd
    public final void i(xf0 xf0Var, yd ydVar, boolean z) {
        r51 r51Var = ydVar.a;
        if (r51Var == null) {
            return;
        }
        float[] fArr = r51Var.j;
        rd rdVar = ydVar.d;
        int iD = rdVar.d();
        for (int i = 0; i < iD; i++) {
            r51 r51VarE = rdVar.e(i);
            float f = rdVar.f(i);
            ui0 ui0Var = this.i;
            ui0Var.e = r51VarE;
            if (r51VarE.c) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((r51) ui0Var.e).j;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((r51) ui0Var.e).j[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((zu0) ui0Var.d).k((r51) ui0Var.e);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((r51) ui0Var.e).j[i3] = f4;
                    } else {
                        ((r51) ui0Var.e).j[i3] = 0.0f;
                    }
                }
                j(r51VarE);
            }
            this.b = (ydVar.b * f) + this.b;
        }
        k(r51Var);
    }

    public final void j(r51 r51Var) {
        int i;
        r51[] r51VarArr;
        int i2 = this.h + 1;
        r51[] r51VarArr2 = this.f;
        if (i2 > r51VarArr2.length) {
            r51[] r51VarArr3 = (r51[]) Arrays.copyOf(r51VarArr2, r51VarArr2.length * 2);
            this.f = r51VarArr3;
            this.g = (r51[]) Arrays.copyOf(r51VarArr3, r51VarArr3.length * 2);
        }
        r51[] r51VarArr4 = this.f;
        int i3 = this.h;
        r51VarArr4[i3] = r51Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && r51VarArr4[i3].d > r51Var.d) {
            int i5 = 0;
            while (true) {
                i = this.h;
                r51VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                r51VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(r51VarArr, 0, i, new he(6));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        r51Var.c = true;
        r51Var.a(this);
    }

    public final void k(r51 r51Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == r51Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        r51Var.c = false;
                        return;
                    } else {
                        r51[] r51VarArr = this.f;
                        int i3 = i + 1;
                        r51VarArr[i] = r51VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.yd
    public final String toString() {
        ui0 ui0Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            ui0Var.e = this.f[i];
            str = str + ui0Var + " ";
        }
        return str;
    }
}
