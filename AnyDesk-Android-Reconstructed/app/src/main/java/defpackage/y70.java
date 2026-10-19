package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y70 extends hg1 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026c  */
    /* JADX WARN: Code duplicated, block: B:118:0x027c  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.ht
    public final void a(ht htVar) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (q51.r(this.j) == 3) {
            bq bqVar = this.b;
            l(bqVar.I, bqVar.K, 0);
            return;
        }
        mu muVar = this.e;
        boolean z = muVar.j;
        kt ktVar = this.h;
        kt ktVar2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            bq bqVar2 = this.b;
            int i3 = bqVar2.r;
            if (i3 == 2) {
                f = 0.5f;
                bq bqVar3 = bqVar2.T;
                if (bqVar3 != null) {
                    mu muVar2 = bqVar3.d.e;
                    if (muVar2.j) {
                        muVar.d((int) ((muVar2.g * bqVar2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = bqVar2.s;
                if (i4 == 0 || i4 == 3) {
                    zd1 zd1Var = bqVar2.e;
                    kt ktVar3 = zd1Var.h;
                    kt ktVar4 = zd1Var.i;
                    boolean z2 = bqVar2.I.f != null;
                    boolean z3 = bqVar2.J.f != null;
                    boolean z4 = bqVar2.K.f != null;
                    boolean z5 = bqVar2.L.f != null;
                    f = 0.5f;
                    int i5 = bqVar2.X;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = bqVar2.W;
                        boolean z6 = ktVar3.j;
                        ArrayList arrayList = ktVar3.l;
                        int[] iArr = k;
                        if (z6 && ktVar4.j) {
                            if (ktVar.c && ktVar2.c) {
                                m(iArr, ((kt) ktVar.l.get(0)).g + ktVar.f, ((kt) ktVar2.l.get(0)).g - ktVar2.f, ktVar3.g + ktVar3.f, ktVar4.g - ktVar4.f, f5, i5);
                                muVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (ktVar.j && ktVar2.j) {
                            if (!ktVar3.c || !ktVar4.c) {
                                return;
                            }
                            m(iArr, ktVar.g + ktVar.f, ktVar2.g - ktVar2.f, ((kt) arrayList.get(0)).g + ktVar3.f, ((kt) ktVar4.l.get(0)).g - ktVar4.f, f5, i5);
                            muVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!ktVar.c || !ktVar2.c || !ktVar3.c || !ktVar4.c) {
                            return;
                        }
                        m(iArr, ((kt) ktVar.l.get(0)).g + ktVar.f, ((kt) ktVar2.l.get(0)).g - ktVar2.f, ((kt) arrayList.get(0)).g + ktVar3.f, ((kt) ktVar4.l.get(0)).g - ktVar4.f, f5, i5);
                        muVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!ktVar.c || !ktVar2.c) {
                            return;
                        }
                        float f6 = bqVar2.W;
                        int i6 = ((kt) ktVar.l.get(0)).g + ktVar.f;
                        int i7 = ((kt) ktVar2.l.get(0)).g - ktVar2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            muVar.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            muVar.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!ktVar3.c || !ktVar4.c) {
                            return;
                        }
                        float f7 = bqVar2.W;
                        int i10 = ((kt) ktVar3.l.get(0)).g + ktVar3.f;
                        int i11 = ((kt) ktVar4.l.get(0)).g - ktVar4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            muVar.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            muVar.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            muVar.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = bqVar2.X;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = bqVar2.e.e.g / bqVar2.W;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = bqVar2.e.e.g;
                            f3 = bqVar2.W;
                        }
                        muVar.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = bqVar2.e.e.g;
                        f3 = bqVar2.W;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    muVar.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = ktVar.c;
        ArrayList arrayList2 = ktVar.l;
        if (z7) {
            boolean z8 = ktVar2.c;
            ArrayList arrayList3 = ktVar2.l;
            if (z8) {
                if (ktVar.j && ktVar2.j && muVar.j) {
                    return;
                }
                if (!muVar.j && this.d == 3) {
                    bq bqVar4 = this.b;
                    if (bqVar4.r == 0 && !bqVar4.x()) {
                        kt ktVar5 = (kt) arrayList2.get(0);
                        kt ktVar6 = (kt) arrayList3.get(0);
                        int i14 = ktVar5.g + ktVar.f;
                        int i15 = ktVar6.g + ktVar2.f;
                        ktVar.d(i14);
                        ktVar2.d(i15);
                        muVar.d(i15 - i14);
                        return;
                    }
                }
                if (!muVar.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((kt) arrayList3.get(0)).g + ktVar2.f) - (((kt) arrayList2.get(0)).g + ktVar.f), muVar.m);
                    bq bqVar5 = this.b;
                    int i16 = bqVar5.v;
                    int iMax = Math.max(bqVar5.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    muVar.d(iMax);
                }
                if (muVar.j) {
                    kt ktVar7 = (kt) arrayList2.get(0);
                    kt ktVar8 = (kt) arrayList3.get(0);
                    int i17 = ktVar7.g;
                    int i18 = ktVar.f + i17;
                    int i19 = ktVar8.g;
                    int i20 = ktVar2.f + i19;
                    float f8 = this.b.d0;
                    if (ktVar7 == ktVar8) {
                        f8 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    ktVar.d((int) ((((i19 - i17) - muVar.g) * f8) + i17 + f));
                    ktVar2.d(ktVar.g + muVar.g);
                }
            }
        }
    }

    @Override // defpackage.hg1
    public final void d() {
        bq bqVar;
        bq bqVar2;
        int i;
        bq bqVar3;
        bq bqVar4;
        int i2;
        bq bqVar5 = this.b;
        boolean z = bqVar5.a;
        mu muVar = this.e;
        if (z) {
            muVar.d(bqVar5.q());
        }
        boolean z2 = muVar.j;
        ArrayList arrayList = muVar.k;
        ArrayList arrayList2 = muVar.l;
        kt ktVar = this.i;
        kt ktVar2 = this.h;
        if (!z2) {
            bq bqVar6 = this.b;
            int i3 = bqVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (bqVar4 = bqVar6.T) != null && ((i2 = bqVar4.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (bqVar4.q() - this.b.I.e()) - this.b.K.e();
                    hg1.b(ktVar2, bqVar4.d.h, this.b.I.e());
                    hg1.b(ktVar, bqVar4.d.i, -this.b.K.e());
                    muVar.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    muVar.d(bqVar6.q());
                }
            }
        } else if (this.d == 4 && (bqVar2 = (bqVar = this.b).T) != null && ((i = bqVar2.p0[0]) == 1 || i == 4)) {
            hg1.b(ktVar2, bqVar2.d.h, bqVar.I.e());
            hg1.b(ktVar, bqVar2.d.i, -this.b.K.e());
            return;
        }
        if (muVar.j) {
            bq bqVar7 = this.b;
            if (bqVar7.a) {
                np[] npVarArr = bqVar7.Q;
                np npVar = npVarArr[0];
                np npVar2 = npVar.f;
                if (npVar2 != null && npVarArr[1].f != null) {
                    boolean zX = bqVar7.x();
                    bq bqVar8 = this.b;
                    if (zX) {
                        ktVar2.f = bqVar8.Q[0].e();
                        ktVar.f = -this.b.Q[1].e();
                        return;
                    }
                    kt ktVarH = hg1.h(bqVar8.Q[0]);
                    if (ktVarH != null) {
                        hg1.b(ktVar2, ktVarH, this.b.Q[0].e());
                    }
                    kt ktVarH2 = hg1.h(this.b.Q[1]);
                    if (ktVarH2 != null) {
                        hg1.b(ktVar, ktVarH2, -this.b.Q[1].e());
                    }
                    ktVar2.b = true;
                    ktVar.b = true;
                    return;
                }
                if (npVar2 != null) {
                    kt ktVarH3 = hg1.h(npVar);
                    if (ktVarH3 != null) {
                        hg1.b(ktVar2, ktVarH3, this.b.Q[0].e());
                        hg1.b(ktVar, ktVar2, muVar.g);
                        return;
                    }
                    return;
                }
                np npVar3 = npVarArr[1];
                if (npVar3.f != null) {
                    kt ktVarH4 = hg1.h(npVar3);
                    if (ktVarH4 != null) {
                        hg1.b(ktVar, ktVarH4, -this.b.Q[1].e());
                        hg1.b(ktVar2, ktVar, -muVar.g);
                        return;
                    }
                    return;
                }
                if ((bqVar7 instanceof v70) || bqVar7.T == null || bqVar7.i(7).f != null) {
                    return;
                }
                bq bqVar9 = this.b;
                hg1.b(ktVar2, bqVar9.T.d.h, bqVar9.r());
                hg1.b(ktVar, ktVar2, muVar.g);
                return;
            }
        }
        if (this.d == 3) {
            bq bqVar10 = this.b;
            int i4 = bqVar10.r;
            if (i4 == 2) {
                bq bqVar11 = bqVar10.T;
                if (bqVar11 != null) {
                    mu muVar2 = bqVar11.e.e;
                    arrayList2.add(muVar2);
                    muVar2.k.add(muVar);
                    muVar.b = true;
                    arrayList.add(ktVar2);
                    arrayList.add(ktVar);
                }
            } else if (i4 == 3) {
                if (bqVar10.s == 3) {
                    ktVar2.a = this;
                    ktVar.a = this;
                    zd1 zd1Var = bqVar10.e;
                    zd1Var.h.a = this;
                    zd1Var.i.a = this;
                    muVar.a = this;
                    if (bqVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(muVar);
                        zd1 zd1Var2 = this.b.e;
                        zd1Var2.e.a = this;
                        arrayList2.add(zd1Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(muVar);
                        this.b.e.i.k.add(muVar);
                    } else {
                        boolean zX2 = this.b.x();
                        bq bqVar12 = this.b;
                        if (zX2) {
                            bqVar12.e.e.l.add(muVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            bqVar12.e.e.l.add(muVar);
                        }
                    }
                } else {
                    mu muVar3 = bqVar10.e.e;
                    arrayList2.add(muVar3);
                    muVar3.k.add(muVar);
                    this.b.e.h.k.add(muVar);
                    this.b.e.i.k.add(muVar);
                    muVar.b = true;
                    arrayList.add(ktVar2);
                    arrayList.add(ktVar);
                    ktVar2.l.add(muVar);
                    ktVar.l.add(muVar);
                }
            }
        }
        bq bqVar13 = this.b;
        np[] npVarArr2 = bqVar13.Q;
        np npVar4 = npVarArr2[0];
        np npVar5 = npVar4.f;
        if (npVar5 != null && npVarArr2[1].f != null) {
            boolean zX3 = bqVar13.x();
            bq bqVar14 = this.b;
            if (zX3) {
                ktVar2.f = bqVar14.Q[0].e();
                ktVar.f = -this.b.Q[1].e();
                return;
            }
            kt ktVarH5 = hg1.h(bqVar14.Q[0]);
            kt ktVarH6 = hg1.h(this.b.Q[1]);
            if (ktVarH5 != null) {
                ktVarH5.b(this);
            }
            if (ktVarH6 != null) {
                ktVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (npVar5 != null) {
            kt ktVarH7 = hg1.h(npVar4);
            if (ktVarH7 != null) {
                hg1.b(ktVar2, ktVarH7, this.b.Q[0].e());
                c(ktVar, ktVar2, 1, muVar);
                return;
            }
            return;
        }
        np npVar6 = npVarArr2[1];
        if (npVar6.f != null) {
            kt ktVarH8 = hg1.h(npVar6);
            if (ktVarH8 != null) {
                hg1.b(ktVar, ktVarH8, -this.b.Q[1].e());
                c(ktVar2, ktVar, -1, muVar);
                return;
            }
            return;
        }
        if ((bqVar13 instanceof v70) || (bqVar3 = bqVar13.T) == null) {
            return;
        }
        hg1.b(ktVar2, bqVar3.d.h, bqVar13.r());
        c(ktVar, ktVar2, 1, muVar);
    }

    @Override // defpackage.hg1
    public final void e() {
        kt ktVar = this.h;
        if (ktVar.j) {
            this.b.Y = ktVar.g;
        }
    }

    @Override // defpackage.hg1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.hg1
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        kt ktVar = this.h;
        ktVar.c();
        ktVar.j = false;
        kt ktVar2 = this.i;
        ktVar2.c();
        ktVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
