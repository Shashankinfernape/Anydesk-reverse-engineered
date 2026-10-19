package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xf0 {
    public static boolean q = false;
    public final zu0 d;
    public final y6 m;
    public yd p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public r51[] n = new r51[1000];
    public int o = 0;
    public yd[] g = new yd[32];

    public xf0() {
        s();
        y6 y6Var = new y6(8);
        y6Var.d = new uu0();
        y6Var.e = new uu0();
        y6Var.f = new r51[32];
        this.m = y6Var;
        zu0 zu0Var = new zu0(y6Var);
        zu0Var.f = new r51[128];
        zu0Var.g = new r51[128];
        zu0Var.h = 0;
        zu0Var.i = new ui0(zu0Var);
        this.d = zu0Var;
        this.p = new yd(y6Var);
    }

    public static int n(Object obj) {
        r51 r51Var = ((np) obj).i;
        if (r51Var != null) {
            return (int) (r51Var.g + 0.5f);
        }
        return 0;
    }

    public final r51 a(int i) {
        uu0 uu0Var = (uu0) this.m.e;
        int i2 = uu0Var.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = uu0Var.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            uu0Var.b = i3;
            obj = obj2;
        }
        r51 r51Var = (r51) obj;
        if (r51Var == null) {
            r51Var = new r51(i);
            r51Var.n = i;
        } else {
            r51Var.c();
            r51Var.n = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (r51[]) Arrays.copyOf(this.n, i6);
        }
        r51[] r51VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        r51VarArr[i7] = r51Var;
        return r51Var;
    }

    public final void b(r51 r51Var, r51 r51Var2, int i, float f, r51 r51Var3, r51 r51Var4, int i2, int i3) {
        yd ydVarL = l();
        if (r51Var2 == r51Var3) {
            ydVarL.d.g(r51Var, 1.0f);
            ydVarL.d.g(r51Var4, 1.0f);
            ydVarL.d.g(r51Var2, -2.0f);
        } else {
            rd rdVar = ydVarL.d;
            if (f == 0.5f) {
                rdVar.g(r51Var, 1.0f);
                ydVarL.d.g(r51Var2, -1.0f);
                ydVarL.d.g(r51Var3, -1.0f);
                ydVarL.d.g(r51Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    ydVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                rdVar.g(r51Var, -1.0f);
                ydVarL.d.g(r51Var2, 1.0f);
                ydVarL.b = i;
            } else if (f >= 1.0f) {
                rdVar.g(r51Var4, -1.0f);
                ydVarL.d.g(r51Var3, 1.0f);
                ydVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                rdVar.g(r51Var, f2 * 1.0f);
                ydVarL.d.g(r51Var2, f2 * (-1.0f));
                ydVarL.d.g(r51Var3, (-1.0f) * f);
                ydVarL.d.g(r51Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    ydVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            ydVarL.a(this, i3);
        }
        c(ydVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    public final void c(yd ydVar) {
        boolean z;
        boolean z2;
        r51 r51VarF;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (ydVar.e) {
            z = false;
        } else {
            ArrayList arrayList = ydVar.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = ydVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        r51 r51VarE = ydVar.d.e(i);
                        if (r51VarE.e != -1 || r51VarE.h) {
                            arrayList.add(r51VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            r51 r51Var = (r51) arrayList.get(i2);
                            if (r51Var.h) {
                                ydVar.h(this, r51Var, true);
                            } else {
                                ydVar.i(this, this.g[r51Var.e], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (ydVar.a != null && ydVar.d.d() == 0) {
                    ydVar.e = true;
                    this.b = true;
                }
            }
            if (ydVar.e()) {
                return;
            }
            float f = ydVar.b;
            if (f < 0.0f) {
                ydVar.b = f * (-1.0f);
                rd rdVar = ydVar.d;
                int i3 = rdVar.h;
                for (int i4 = 0; i3 != -1 && i4 < rdVar.a; i4++) {
                    float[] fArr = rdVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = rdVar.f[i3];
                }
            }
            int iD2 = ydVar.d.d();
            r51 r51Var2 = null;
            r51 r51Var3 = null;
            float f2 = 0.0f;
            boolean z4 = false;
            float f3 = 0.0f;
            boolean z5 = false;
            for (int i5 = 0; i5 < iD2; i5++) {
                float f4 = ydVar.d.f(i5);
                r51 r51VarE2 = ydVar.d.e(i5);
                if (r51VarE2.n == 1) {
                    if (r51Var2 == null) {
                        if (r51VarE2.m <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r51Var2 = r51VarE2;
                        f2 = f4;
                    } else if (f2 > f4) {
                        if (r51VarE2.m <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r51Var2 = r51VarE2;
                        f2 = f4;
                    } else if (!z4 && r51VarE2.m <= 1) {
                        r51Var2 = r51VarE2;
                        f2 = f4;
                        z4 = true;
                    }
                } else if (r51Var2 == null && f4 < 0.0f) {
                    if (r51Var3 == null) {
                        if (r51VarE2.m <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        r51Var3 = r51VarE2;
                        f3 = f4;
                    } else if (f3 > f4) {
                        if (r51VarE2.m <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        r51Var3 = r51VarE2;
                        f3 = f4;
                    } else if (!z5 && r51VarE2.m <= 1) {
                        r51Var3 = r51VarE2;
                        f3 = f4;
                        z5 = true;
                    }
                }
            }
            if (r51Var2 == null) {
                r51Var2 = r51Var3;
            }
            if (r51Var2 == null) {
                z2 = true;
            } else {
                ydVar.g(r51Var2);
                z2 = false;
            }
            if (ydVar.d.d() == 0) {
                ydVar.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                r51 r51VarA = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                r51VarA.d = i6;
                y6 y6Var = this.m;
                ((r51[]) y6Var.f)[i6] = r51VarA;
                ydVar.a = r51VarA;
                int i7 = this.k;
                h(ydVar);
                if (this.k == i7 + 1) {
                    yd ydVar2 = this.p;
                    ydVar2.a = null;
                    ydVar2.d.b();
                    for (int i8 = 0; i8 < ydVar.d.d(); i8++) {
                        ydVar2.d.a(ydVar.d.e(i8), ydVar.d.f(i8), true);
                    }
                    r(this.p);
                    if (r51VarA.e == -1) {
                        if (ydVar.a == r51VarA && (r51VarF = ydVar.f(null, r51VarA)) != null) {
                            ydVar.g(r51VarF);
                        }
                        if (!ydVar.e) {
                            ydVar.a.e(this, ydVar);
                        }
                        ((uu0) y6Var.d).b(ydVar);
                        this.k--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            r51 r51Var4 = ydVar.a;
            if (r51Var4 == null) {
                return;
            }
            if (r51Var4.n != 1 && ydVar.b < 0.0f) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(ydVar);
    }

    public final void d(r51 r51Var, int i) {
        int i2 = r51Var.e;
        if (i2 == -1) {
            r51Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                r51 r51Var2 = ((r51[]) this.m.f)[i3];
            }
            return;
        }
        if (i2 == -1) {
            yd ydVarL = l();
            ydVarL.a = r51Var;
            float f = i;
            r51Var.g = f;
            ydVarL.b = f;
            ydVarL.e = true;
            c(ydVarL);
            return;
        }
        yd ydVar = this.g[i2];
        if (ydVar.e) {
            ydVar.b = i;
            return;
        }
        if (ydVar.d.d() == 0) {
            ydVar.e = true;
            ydVar.b = i;
            return;
        }
        yd ydVarL2 = l();
        if (i < 0) {
            ydVarL2.b = i * (-1);
            ydVarL2.d.g(r51Var, 1.0f);
        } else {
            ydVarL2.b = i;
            ydVarL2.d.g(r51Var, -1.0f);
        }
        c(ydVarL2);
    }

    public final void e(r51 r51Var, r51 r51Var2, int i, int i2) {
        if (i2 == 8 && r51Var2.h && r51Var.e == -1) {
            r51Var.d(this, r51Var2.g + i);
            return;
        }
        yd ydVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            ydVarL.b = i;
        }
        rd rdVar = ydVarL.d;
        if (z) {
            rdVar.g(r51Var, 1.0f);
            ydVarL.d.g(r51Var2, -1.0f);
        } else {
            rdVar.g(r51Var, -1.0f);
            ydVarL.d.g(r51Var2, 1.0f);
        }
        if (i2 != 8) {
            ydVarL.a(this, i2);
        }
        c(ydVarL);
    }

    public final void f(r51 r51Var, r51 r51Var2, int i, int i2) {
        yd ydVarL = l();
        r51 r51VarM = m();
        r51VarM.f = 0;
        ydVarL.b(r51Var, r51Var2, r51VarM, i);
        if (i2 != 8) {
            ydVarL.d.g(j(i2), (int) (ydVarL.d.c(r51VarM) * (-1.0f)));
        }
        c(ydVarL);
    }

    public final void g(r51 r51Var, r51 r51Var2, int i, int i2) {
        yd ydVarL = l();
        r51 r51VarM = m();
        r51VarM.f = 0;
        ydVarL.c(r51Var, r51Var2, r51VarM, i);
        if (i2 != 8) {
            ydVarL.d.g(j(i2), (int) (ydVarL.d.c(r51VarM) * (-1.0f)));
        }
        c(ydVarL);
    }

    public final void h(yd ydVar) {
        int i;
        if (ydVar.e) {
            ydVar.a.d(this, ydVar.b);
        } else {
            yd[] ydVarArr = this.g;
            int i2 = this.k;
            ydVarArr[i2] = ydVar;
            r51 r51Var = ydVar.a;
            r51Var.e = i2;
            this.k = i2 + 1;
            r51Var.e(this, ydVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                yd ydVar2 = this.g[i3];
                if (ydVar2 != null && ydVar2.e) {
                    ydVar2.a.d(this, ydVar2.b);
                    ((uu0) this.m.d).b(ydVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        yd[] ydVarArr2 = this.g;
                        int i6 = i4 - 1;
                        yd ydVar3 = ydVarArr2[i4];
                        ydVarArr2[i6] = ydVar3;
                        r51 r51Var2 = ydVar3.a;
                        if (r51Var2.e == i4) {
                            r51Var2.e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            yd ydVar = this.g[i];
            ydVar.a.g = ydVar.b;
        }
    }

    public final r51 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        r51 r51VarA = a(4);
        float[] fArr = r51VarA.j;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        r51VarA.d = i2;
        r51VarA.f = i;
        ((r51[]) this.m.f)[i2] = r51VarA;
        zu0 zu0Var = this.d;
        zu0Var.i.e = r51VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[r51VarA.f] = 1.0f;
        zu0Var.j(r51VarA);
        return r51VarA;
    }

    public final r51 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof np)) {
            return null;
        }
        np npVar = (np) obj;
        r51 r51Var = npVar.i;
        if (r51Var == null) {
            npVar.k();
            r51Var = npVar.i;
        }
        int i = r51Var.d;
        y6 y6Var = this.m;
        if (i != -1 && i <= this.c && ((r51[]) y6Var.f)[i] != null) {
            return r51Var;
        }
        if (i != -1) {
            r51Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        r51Var.d = i2;
        r51Var.n = 1;
        ((r51[]) y6Var.f)[i2] = r51Var;
        return r51Var;
    }

    public final yd l() {
        Object obj;
        y6 y6Var = this.m;
        uu0 uu0Var = (uu0) y6Var.d;
        int i = uu0Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = uu0Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            uu0Var.b = i2;
        } else {
            obj = null;
        }
        yd ydVar = (yd) obj;
        if (ydVar == null) {
            return new yd(y6Var);
        }
        ydVar.a = null;
        ydVar.d.b();
        ydVar.b = 0.0f;
        ydVar.e = false;
        return ydVar;
    }

    public final r51 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        r51 r51VarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        r51VarA.d = i;
        ((r51[]) this.m.f)[i] = r51VarA;
        return r51VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (yd[]) Arrays.copyOf(this.g, i);
        y6 y6Var = this.m;
        y6Var.f = (r51[]) Arrays.copyOf((r51[]) y6Var.f, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        zu0 zu0Var = this.d;
        if (zu0Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(zu0Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(zu0Var);
                return;
            }
        }
        i();
    }

    public final void q(zu0 zu0Var) {
        for (int i = 0; i < this.k; i++) {
            yd ydVar = this.g[i];
            int i2 = 1;
            if (ydVar.a.n != 1) {
                float f = 0.0f;
                if (ydVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.k) {
                            yd ydVar2 = this.g[i4];
                            if (ydVar2.a.n != i2 && !ydVar2.e && ydVar2.b < f) {
                                int iD = ydVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    r51 r51VarE = ydVar2.d.e(i8);
                                    float fC = ydVar2.d.c(r51VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = r51VarE.i[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i6 = r51VarE.d;
                                                i5 = i4;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i4++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            yd ydVar3 = this.g[i5];
                            ydVar3.a.e = -1;
                            ydVar3.g(((r51[]) this.m.f)[i6]);
                            r51 r51Var = ydVar3.a;
                            r51Var.e = i5;
                            r51Var.e(this, ydVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(zu0Var);
        i();
    }

    public final void r(yd ydVar) {
        boolean z;
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.j * 2) {
                return;
            }
            r51 r51Var = ydVar.a;
            if (r51Var != null) {
                this.i[r51Var.d] = true;
            }
            r51 r51VarD = ydVar.d(this.i);
            if (r51VarD != null) {
                boolean[] zArr = this.i;
                int i3 = r51VarD.d;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (r51VarD != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    yd ydVar2 = this.g[i5];
                    if (ydVar2.a.n != 1 && !ydVar2.e) {
                        rd rdVar = ydVar2.d;
                        int i6 = rdVar.h;
                        if (i6 == -1) {
                            z = false;
                            break;
                        }
                        int i7 = 0;
                        while (true) {
                            if (i6 == -1 || i7 >= rdVar.a) {
                                z = false;
                                break;
                            } else if (rdVar.e[i6] == r51VarD.d) {
                                z = true;
                                break;
                            } else {
                                i6 = rdVar.f[i6];
                                i7++;
                            }
                        }
                        if (z) {
                            float fC = ydVar2.d.c(r51VarD);
                            if (fC < 0.0f) {
                                float f2 = (-ydVar2.b) / fC;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    yd ydVar3 = this.g[i4];
                    ydVar3.a.e = -1;
                    ydVar3.g(r51VarD);
                    r51 r51Var2 = ydVar3.a;
                    r51Var2.e = i4;
                    r51Var2.e(this, ydVar3);
                }
            } else {
                z2 = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            yd ydVar = this.g[i];
            if (ydVar != null) {
                ((uu0) this.m.d).b(ydVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        y6 y6Var;
        int i = 0;
        while (true) {
            y6Var = this.m;
            r51[] r51VarArr = (r51[]) y6Var.f;
            if (i >= r51VarArr.length) {
                break;
            }
            r51 r51Var = r51VarArr[i];
            if (r51Var != null) {
                r51Var.c();
            }
            i++;
        }
        uu0 uu0Var = (uu0) y6Var.e;
        r51[] r51VarArr2 = this.n;
        int length = this.o;
        uu0Var.getClass();
        if (length > r51VarArr2.length) {
            length = r51VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            r51 r51Var2 = r51VarArr2[i2];
            int i3 = uu0Var.b;
            Object[] objArr = uu0Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = r51Var2;
                uu0Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((r51[]) y6Var.f, (Object) null);
        this.c = 0;
        zu0 zu0Var = this.d;
        zu0Var.h = 0;
        zu0Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            yd ydVar = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new yd(y6Var);
    }
}
