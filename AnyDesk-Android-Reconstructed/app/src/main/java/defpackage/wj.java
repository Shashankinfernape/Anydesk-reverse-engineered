package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wj extends hg1 {
    public final ArrayList k;
    public int l;

    public wj(bq bqVar, int i) {
        bq bqVar2;
        super(bqVar);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        bq bqVar3 = this.b;
        bq bqVarM = bqVar3.m(i);
        while (true) {
            bqVar2 = bqVar3;
            bqVar3 = bqVarM;
            if (bqVar3 == null) {
                break;
            } else {
                bqVarM = bqVar3.m(this.f);
            }
        }
        this.b = bqVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? bqVar2.d : i2 == 1 ? bqVar2.e : null);
        bq bqVarL = bqVar2.l(this.f);
        while (bqVarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? bqVarL.d : i3 == 1 ? bqVarL.e : null);
            bqVarL = bqVarL.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            hg1 hg1Var = (hg1) obj;
            int i5 = this.f;
            if (i5 == 0) {
                hg1Var.b.b = this;
            } else if (i5 == 1) {
                hg1Var.b.c = this;
            }
        }
        if (this.f == 0 && ((cq) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((hg1) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        bq bqVar4 = this.b;
        this.l = i6 == 0 ? bqVar4.i0 : bqVar4.j0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // defpackage.ht
    public final void a(ht htVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        kt ktVar = this.h;
        if (ktVar.j) {
            kt ktVar2 = this.i;
            if (ktVar2.j) {
                bq bqVar = this.b.T;
                boolean z2 = bqVar instanceof cq ? ((cq) bqVar).v0 : false;
                int i12 = ktVar2.g - ktVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (((hg1) arrayList.get(i13)).b.g0 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    if (((hg1) arrayList.get(i15)).b.g0 != 8) {
                        i = i15;
                        break;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= 2) {
                        z = z2;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i17 = 0;
                    i5 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    f = 0.0f;
                    while (i17 < size) {
                        hg1 hg1Var = (hg1) arrayList.get(i17);
                        bq bqVar2 = hg1Var.b;
                        boolean z3 = z2;
                        if (bqVar2.g0 == i2) {
                            i10 = i16;
                        } else {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i5 += hg1Var.h.f;
                            }
                            mu muVar = hg1Var.e;
                            int i20 = muVar.g;
                            i10 = i16;
                            boolean z4 = hg1Var.d != 3;
                            if (z4) {
                                int i21 = this.f;
                                if (i21 == 0 && !bqVar2.d.e.j) {
                                    return;
                                }
                                if (i21 == 1 && !bqVar2.e.e.j) {
                                    return;
                                }
                            } else {
                                if (hg1Var.a == 1 && i10 == 0) {
                                    i11 = muVar.m;
                                    i18++;
                                } else {
                                    if (muVar.j) {
                                        i11 = i20;
                                    }
                                    if (z4) {
                                        i5 += i11;
                                    } else {
                                        i18++;
                                        f3 = bqVar2.k0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i17 >= i14 && i17 < i) {
                                        i5 += -hg1Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i18++;
                                    f3 = bqVar2.k0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i11;
                                }
                                if (i17 >= i14) {
                                }
                            }
                            i11 = i20;
                            if (z4) {
                                i18++;
                                f3 = bqVar2.k0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i11;
                            }
                            if (i17 >= i14) {
                            }
                        }
                        i17++;
                        z2 = z3;
                        i16 = i10;
                        i2 = 8;
                    }
                    z = z2;
                    int i22 = i16;
                    if (i5 < i12 || i18 == 0) {
                        i3 = i18;
                        i4 = i19;
                        break;
                    } else {
                        i16 = i22 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i23 = ktVar.g;
                if (z) {
                    i23 = ktVar2.g;
                }
                if (i5 > i12) {
                    i23 = z ? i23 + ((int) (((i5 - i12) / 2.0f) + 0.5f)) : i23 - ((int) (((i5 - i12) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f4 = i12 - i5;
                    int i24 = (int) ((f4 / i3) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        hg1 hg1Var2 = (hg1) arrayList.get(i25);
                        int i27 = i23;
                        bq bqVar3 = hg1Var2.b;
                        int i28 = i3;
                        mu muVar2 = hg1Var2.e;
                        float f5 = f4;
                        int i29 = i24;
                        if (bqVar3.g0 != 8 && hg1Var2.d == 3 && !muVar2.j) {
                            int i30 = f > 0.0f ? (int) (((bqVar3.k0[this.f] * f5) / f) + 0.5f) : i29;
                            if (this.f == 0) {
                                i8 = bqVar3.v;
                                i9 = bqVar3.u;
                            } else {
                                i8 = bqVar3.y;
                                i9 = bqVar3.x;
                            }
                            int iMax = Math.max(i9, hg1Var2.a == 1 ? Math.min(i30, muVar2.m) : i30);
                            if (i8 > 0) {
                                iMax = Math.min(i8, iMax);
                            }
                            if (iMax != i30) {
                                i26++;
                                i30 = iMax;
                            }
                            muVar2.d(i30);
                        }
                        i25++;
                        i23 = i27;
                        i3 = i28;
                        f4 = f5;
                        i24 = i29;
                    }
                    i6 = i23;
                    int i31 = i3;
                    f2 = 0.5f;
                    if (i26 > 0) {
                        i3 = i31 - i26;
                        i5 = 0;
                        for (int i32 = 0; i32 < size; i32++) {
                            hg1 hg1Var3 = (hg1) arrayList.get(i32);
                            if (hg1Var3.b.g0 != 8) {
                                if (i32 > 0 && i32 >= i13) {
                                    i5 += hg1Var3.h.f;
                                }
                                i5 += hg1Var3.e.g;
                                if (i32 < i14 && i32 < i) {
                                    i5 += -hg1Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i31;
                    }
                    i7 = 2;
                    if (this.l == 2 && i26 == 0) {
                        this.l = 0;
                    }
                } else {
                    i6 = i23;
                    i7 = 2;
                    f2 = 0.5f;
                }
                if (i5 > i12) {
                    this.l = i7;
                }
                if (i4 > 0 && i3 == 0 && i13 == i) {
                    this.l = i7;
                }
                int i33 = this.l;
                if (i33 == 1) {
                    int i34 = i4 > 1 ? (i12 - i5) / (i4 - 1) : i4 == 1 ? (i12 - i5) / 2 : 0;
                    if (i3 > 0) {
                        i34 = 0;
                    }
                    int i35 = i6;
                    for (int i36 = 0; i36 < size; i36++) {
                        hg1 hg1Var4 = (hg1) arrayList.get(z ? size - (i36 + 1) : i36);
                        bq bqVar4 = hg1Var4.b;
                        kt ktVar3 = hg1Var4.i;
                        kt ktVar4 = hg1Var4.h;
                        if (bqVar4.g0 == 8) {
                            ktVar4.d(i35);
                            ktVar3.d(i35);
                        } else {
                            if (i36 > 0) {
                                i35 = z ? i35 - i34 : i35 + i34;
                            }
                            if (i36 > 0 && i36 >= i13) {
                                i35 = z ? i35 - ktVar4.f : i35 + ktVar4.f;
                            }
                            if (z) {
                                ktVar3.d(i35);
                            } else {
                                ktVar4.d(i35);
                            }
                            mu muVar3 = hg1Var4.e;
                            int i37 = muVar3.g;
                            if (hg1Var4.d == 3 && hg1Var4.a == 1) {
                                i37 = muVar3.m;
                            }
                            i35 = z ? i35 - i37 : i35 + i37;
                            if (z) {
                                ktVar4.d(i35);
                            } else {
                                ktVar3.d(i35);
                            }
                            hg1Var4.g = true;
                            if (i36 < i14 && i36 < i) {
                                i35 = z ? i35 - (-ktVar3.f) : i35 + (-ktVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i33 == 0) {
                    int i38 = (i12 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i38 = 0;
                    }
                    int i39 = i6;
                    for (int i40 = 0; i40 < size; i40++) {
                        hg1 hg1Var5 = (hg1) arrayList.get(z ? size - (i40 + 1) : i40);
                        bq bqVar5 = hg1Var5.b;
                        kt ktVar5 = hg1Var5.i;
                        kt ktVar6 = hg1Var5.h;
                        if (bqVar5.g0 == 8) {
                            ktVar6.d(i39);
                            ktVar5.d(i39);
                        } else {
                            int i41 = z ? i39 - i38 : i39 + i38;
                            if (i40 > 0 && i40 >= i13) {
                                i41 = z ? i41 - ktVar6.f : i41 + ktVar6.f;
                            }
                            if (z) {
                                ktVar5.d(i41);
                            } else {
                                ktVar6.d(i41);
                            }
                            mu muVar4 = hg1Var5.e;
                            int iMin = muVar4.g;
                            if (hg1Var5.d == 3 && hg1Var5.a == 1) {
                                iMin = Math.min(iMin, muVar4.m);
                            }
                            i39 = z ? i41 - iMin : i41 + iMin;
                            if (z) {
                                ktVar6.d(i39);
                            } else {
                                ktVar5.d(i39);
                            }
                            if (i40 < i14 && i40 < i) {
                                i39 = z ? i39 - (-ktVar5.f) : i39 + (-ktVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i33 == 2) {
                    int i42 = this.f;
                    bq bqVar6 = this.b;
                    float f6 = i42 == 0 ? bqVar6.d0 : bqVar6.e0;
                    if (z) {
                        f6 = 1.0f - f6;
                    }
                    int i43 = (int) (((i12 - i5) * f6) + f2);
                    if (i43 < 0 || i3 > 0) {
                        i43 = 0;
                    }
                    int i44 = z ? i6 - i43 : i6 + i43;
                    for (int i45 = 0; i45 < size; i45++) {
                        hg1 hg1Var6 = (hg1) arrayList.get(z ? size - (i45 + 1) : i45);
                        bq bqVar7 = hg1Var6.b;
                        kt ktVar7 = hg1Var6.i;
                        kt ktVar8 = hg1Var6.h;
                        if (bqVar7.g0 == 8) {
                            ktVar8.d(i44);
                            ktVar7.d(i44);
                        } else {
                            if (i45 > 0 && i45 >= i13) {
                                i44 = z ? i44 - ktVar8.f : i44 + ktVar8.f;
                            }
                            if (z) {
                                ktVar7.d(i44);
                            } else {
                                ktVar8.d(i44);
                            }
                            mu muVar5 = hg1Var6.e;
                            int i46 = muVar5.g;
                            if (hg1Var6.d == 3 && hg1Var6.a == 1) {
                                i46 = muVar5.m;
                            }
                            i44 = z ? i44 - i46 : i44 + i46;
                            if (z) {
                                ktVar8.d(i44);
                            } else {
                                ktVar7.d(i44);
                            }
                            if (i45 < i14 && i45 < i) {
                                i44 = z ? i44 - (-ktVar7.f) : i44 + (-ktVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.hg1
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((hg1) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        bq bqVar = ((hg1) arrayList.get(0)).b;
        bq bqVar2 = ((hg1) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        kt ktVar = this.i;
        kt ktVar2 = this.h;
        if (i2 == 0) {
            np npVar = bqVar.I;
            np npVar2 = bqVar2.K;
            kt ktVarI = hg1.i(npVar, 0);
            int iE = npVar.e();
            bq bqVarM = m();
            if (bqVarM != null) {
                iE = bqVarM.I.e();
            }
            if (ktVarI != null) {
                hg1.b(ktVar2, ktVarI, iE);
            }
            kt ktVarI2 = hg1.i(npVar2, 0);
            int iE2 = npVar2.e();
            bq bqVarN = n();
            if (bqVarN != null) {
                iE2 = bqVarN.K.e();
            }
            if (ktVarI2 != null) {
                hg1.b(ktVar, ktVarI2, -iE2);
            }
        } else {
            np npVar3 = bqVar.J;
            np npVar4 = bqVar2.L;
            kt ktVarI3 = hg1.i(npVar3, 1);
            int iE3 = npVar3.e();
            bq bqVarM2 = m();
            if (bqVarM2 != null) {
                iE3 = bqVarM2.J.e();
            }
            if (ktVarI3 != null) {
                hg1.b(ktVar2, ktVarI3, iE3);
            }
            kt ktVarI4 = hg1.i(npVar4, 1);
            int iE4 = npVar4.e();
            bq bqVarN2 = n();
            if (bqVarN2 != null) {
                iE4 = bqVarN2.L.e();
            }
            if (ktVarI4 != null) {
                hg1.b(ktVar, ktVarI4, -iE4);
            }
        }
        ktVar2.a = this;
        ktVar.a = this;
    }

    @Override // defpackage.hg1
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((hg1) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.hg1
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((hg1) obj).f();
        }
    }

    @Override // defpackage.hg1
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            hg1 hg1Var = (hg1) arrayList.get(i);
            j = ((long) hg1Var.i.f) + hg1Var.j() + j + ((long) hg1Var.h.f);
        }
        return j;
    }

    @Override // defpackage.hg1
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((hg1) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final bq m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            bq bqVar = ((hg1) arrayList.get(i)).b;
            if (bqVar.g0 != 8) {
                return bqVar;
            }
            i++;
        }
    }

    public final bq n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bq bqVar = ((hg1) arrayList.get(size)).b;
            if (bqVar.g0 != 8) {
                return bqVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((hg1) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
