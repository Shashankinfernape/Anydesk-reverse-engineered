package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zd1 extends hg1 {
    public kt k;
    public gg l;

    @Override // defpackage.ht
    public final void a(ht htVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (q51.r(this.j) == 3) {
            bq bqVar = this.b;
            l(bqVar.J, bqVar.L, 1);
            return;
        }
        mu muVar = this.e;
        if (muVar.c && !muVar.j && this.d == 3) {
            bq bqVar2 = this.b;
            int i2 = bqVar2.s;
            if (i2 == 2) {
                bq bqVar3 = bqVar2.T;
                if (bqVar3 != null) {
                    mu muVar2 = bqVar3.e.e;
                    if (muVar2.j) {
                        muVar.d((int) ((muVar2.g * bqVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                mu muVar3 = bqVar2.d.e;
                if (muVar3.j) {
                    int i3 = bqVar2.X;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = muVar3.g * bqVar2.W;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = muVar3.g;
                            f2 = bqVar2.W;
                        }
                        muVar.d(i);
                    } else {
                        f = muVar3.g;
                        f2 = bqVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    muVar.d(i);
                }
            }
        }
        kt ktVar = this.h;
        boolean z = ktVar.c;
        ArrayList arrayList = ktVar.l;
        if (z) {
            kt ktVar2 = this.i;
            boolean z2 = ktVar2.c;
            ArrayList arrayList2 = ktVar2.l;
            if (z2) {
                if (ktVar.j && ktVar2.j && muVar.j) {
                    return;
                }
                if (!muVar.j && this.d == 3) {
                    bq bqVar4 = this.b;
                    if (bqVar4.r == 0 && !bqVar4.y()) {
                        kt ktVar3 = (kt) arrayList.get(0);
                        kt ktVar4 = (kt) arrayList2.get(0);
                        int i4 = ktVar3.g + ktVar.f;
                        int i5 = ktVar4.g + ktVar2.f;
                        ktVar.d(i4);
                        ktVar2.d(i5);
                        muVar.d(i5 - i4);
                        return;
                    }
                }
                if (!muVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    kt ktVar5 = (kt) arrayList.get(0);
                    int i6 = (((kt) arrayList2.get(0)).g + ktVar2.f) - (ktVar5.g + ktVar.f);
                    int i7 = muVar.m;
                    if (i6 < i7) {
                        muVar.d(i6);
                    } else {
                        muVar.d(i7);
                    }
                }
                if (muVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    kt ktVar6 = (kt) arrayList.get(0);
                    kt ktVar7 = (kt) arrayList2.get(0);
                    int i8 = ktVar6.g;
                    int i9 = ktVar.f + i8;
                    int i10 = ktVar7.g;
                    int i11 = ktVar2.f + i10;
                    float f4 = this.b.e0;
                    if (ktVar6 == ktVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    ktVar.d((int) ((((i10 - i8) - muVar.g) * f4) + i8 + 0.5f));
                    ktVar2.d(ktVar.g + muVar.g);
                }
            }
        }
    }

    @Override // defpackage.hg1
    public final void d() {
        bq bqVar;
        bq bqVar2;
        bq bqVar3;
        bq bqVar4;
        kt ktVar = this.k;
        bq bqVar5 = this.b;
        boolean z = bqVar5.a;
        mu muVar = this.e;
        if (z) {
            muVar.d(bqVar5.k());
        }
        boolean z2 = muVar.j;
        ArrayList arrayList = muVar.k;
        ArrayList arrayList2 = muVar.l;
        kt ktVar2 = this.i;
        kt ktVar3 = this.h;
        if (!z2) {
            bq bqVar6 = this.b;
            this.d = bqVar6.p0[1];
            if (bqVar6.E) {
                this.l = new gg(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (bqVar4 = this.b.T) != null && bqVar4.p0[1] == 1) {
                    int iK = (bqVar4.k() - this.b.J.e()) - this.b.L.e();
                    hg1.b(ktVar3, bqVar4.e.h, this.b.J.e());
                    hg1.b(ktVar2, bqVar4.e.i, -this.b.L.e());
                    muVar.d(iK);
                    return;
                }
                if (i == 1) {
                    muVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (bqVar2 = (bqVar = this.b).T) != null && bqVar2.p0[1] == 1) {
            hg1.b(ktVar3, bqVar2.e.h, bqVar.J.e());
            hg1.b(ktVar2, bqVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = muVar.j;
        if (z3) {
            bq bqVar7 = this.b;
            if (bqVar7.a) {
                np[] npVarArr = bqVar7.Q;
                np npVar = npVarArr[2];
                np npVar2 = npVar.f;
                if (npVar2 != null && npVarArr[3].f != null) {
                    boolean zY = bqVar7.y();
                    bq bqVar8 = this.b;
                    if (zY) {
                        ktVar3.f = bqVar8.Q[2].e();
                        ktVar2.f = -this.b.Q[3].e();
                    } else {
                        kt ktVarH = hg1.h(bqVar8.Q[2]);
                        if (ktVarH != null) {
                            hg1.b(ktVar3, ktVarH, this.b.Q[2].e());
                        }
                        kt ktVarH2 = hg1.h(this.b.Q[3]);
                        if (ktVarH2 != null) {
                            hg1.b(ktVar2, ktVarH2, -this.b.Q[3].e());
                        }
                        ktVar3.b = true;
                        ktVar2.b = true;
                    }
                    bq bqVar9 = this.b;
                    if (bqVar9.E) {
                        hg1.b(ktVar, ktVar3, bqVar9.a0);
                        return;
                    }
                    return;
                }
                if (npVar2 != null) {
                    kt ktVarH3 = hg1.h(npVar);
                    if (ktVarH3 != null) {
                        hg1.b(ktVar3, ktVarH3, this.b.Q[2].e());
                        hg1.b(ktVar2, ktVar3, muVar.g);
                        bq bqVar10 = this.b;
                        if (bqVar10.E) {
                            hg1.b(ktVar, ktVar3, bqVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                np npVar3 = npVarArr[3];
                if (npVar3.f != null) {
                    kt ktVarH4 = hg1.h(npVar3);
                    if (ktVarH4 != null) {
                        hg1.b(ktVar2, ktVarH4, -this.b.Q[3].e());
                        hg1.b(ktVar3, ktVar2, -muVar.g);
                    }
                    bq bqVar11 = this.b;
                    if (bqVar11.E) {
                        hg1.b(ktVar, ktVar3, bqVar11.a0);
                        return;
                    }
                    return;
                }
                np npVar4 = npVarArr[4];
                if (npVar4.f != null) {
                    kt ktVarH5 = hg1.h(npVar4);
                    if (ktVarH5 != null) {
                        hg1.b(ktVar, ktVarH5, 0);
                        hg1.b(ktVar3, ktVar, -this.b.a0);
                        hg1.b(ktVar2, ktVar3, muVar.g);
                        return;
                    }
                    return;
                }
                if ((bqVar7 instanceof v70) || bqVar7.T == null || bqVar7.i(7).f != null) {
                    return;
                }
                bq bqVar12 = this.b;
                hg1.b(ktVar3, bqVar12.T.e.h, bqVar12.s());
                hg1.b(ktVar2, ktVar3, muVar.g);
                bq bqVar13 = this.b;
                if (bqVar13.E) {
                    hg1.b(ktVar, ktVar3, bqVar13.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            muVar.b(this);
        } else {
            bq bqVar14 = this.b;
            int i2 = bqVar14.s;
            if (i2 == 2) {
                bq bqVar15 = bqVar14.T;
                if (bqVar15 != null) {
                    mu muVar2 = bqVar15.e.e;
                    arrayList2.add(muVar2);
                    muVar2.k.add(muVar);
                    muVar.b = true;
                    arrayList.add(ktVar3);
                    arrayList.add(ktVar2);
                }
            } else if (i2 == 3 && !bqVar14.y()) {
                bq bqVar16 = this.b;
                if (bqVar16.r != 3) {
                    mu muVar3 = bqVar16.d.e;
                    arrayList2.add(muVar3);
                    muVar3.k.add(muVar);
                    muVar.b = true;
                    arrayList.add(ktVar3);
                    arrayList.add(ktVar2);
                }
            }
        }
        bq bqVar17 = this.b;
        np[] npVarArr2 = bqVar17.Q;
        np npVar5 = npVarArr2[2];
        np npVar6 = npVar5.f;
        if (npVar6 != null && npVarArr2[3].f != null) {
            boolean zY2 = bqVar17.y();
            bq bqVar18 = this.b;
            if (zY2) {
                ktVar3.f = bqVar18.Q[2].e();
                ktVar2.f = -this.b.Q[3].e();
            } else {
                kt ktVarH6 = hg1.h(bqVar18.Q[2]);
                kt ktVarH7 = hg1.h(this.b.Q[3]);
                if (ktVarH6 != null) {
                    ktVarH6.b(this);
                }
                if (ktVarH7 != null) {
                    ktVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(ktVar, ktVar3, 1, this.l);
            }
        } else if (npVar6 != null) {
            kt ktVarH8 = hg1.h(npVar5);
            if (ktVarH8 != null) {
                hg1.b(ktVar3, ktVarH8, this.b.Q[2].e());
                c(ktVar2, ktVar3, 1, muVar);
                if (this.b.E) {
                    c(ktVar, ktVar3, 1, this.l);
                }
                if (this.d == 3) {
                    bq bqVar19 = this.b;
                    if (bqVar19.W > 0.0f) {
                        y70 y70Var = bqVar19.d;
                        if (y70Var.d == 3) {
                            y70Var.e.k.add(muVar);
                            arrayList2.add(this.b.d.e);
                            muVar.a = this;
                        }
                    }
                }
            }
        } else {
            np npVar7 = npVarArr2[3];
            if (npVar7.f != null) {
                kt ktVarH9 = hg1.h(npVar7);
                if (ktVarH9 != null) {
                    hg1.b(ktVar2, ktVarH9, -this.b.Q[3].e());
                    c(ktVar3, ktVar2, -1, muVar);
                    if (this.b.E) {
                        c(ktVar, ktVar3, 1, this.l);
                    }
                }
            } else {
                np npVar8 = npVarArr2[4];
                if (npVar8.f != null) {
                    kt ktVarH10 = hg1.h(npVar8);
                    if (ktVarH10 != null) {
                        hg1.b(ktVar, ktVarH10, 0);
                        c(ktVar3, ktVar, -1, this.l);
                        c(ktVar2, ktVar3, 1, muVar);
                    }
                } else if (!(bqVar17 instanceof v70) && (bqVar3 = bqVar17.T) != null) {
                    hg1.b(ktVar3, bqVar3.e.h, bqVar17.s());
                    c(ktVar2, ktVar3, 1, muVar);
                    if (this.b.E) {
                        c(ktVar, ktVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        bq bqVar20 = this.b;
                        if (bqVar20.W > 0.0f) {
                            y70 y70Var2 = bqVar20.d;
                            if (y70Var2.d == 3) {
                                y70Var2.e.k.add(muVar);
                                arrayList2.add(this.b.d.e);
                                muVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            muVar.c = true;
        }
    }

    @Override // defpackage.hg1
    public final void e() {
        kt ktVar = this.h;
        if (ktVar.j) {
            this.b.Z = ktVar.g;
        }
    }

    @Override // defpackage.hg1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.hg1
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        kt ktVar = this.h;
        ktVar.c();
        ktVar.j = false;
        kt ktVar2 = this.i;
        ktVar2.c();
        ktVar2.j = false;
        kt ktVar3 = this.k;
        ktVar3.c();
        ktVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
