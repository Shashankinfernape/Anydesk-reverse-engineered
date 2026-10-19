package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class jt {
    public cq a;
    public boolean b;
    public boolean c;
    public cq d;
    public ArrayList e;
    public sp f;
    public hg g;
    public ArrayList h;

    public final void a(kt ktVar, int i, ArrayList arrayList, kz0 kz0Var) {
        hg1 hg1Var = ktVar.d;
        kz0 kz0Var2 = hg1Var.c;
        kt ktVar2 = hg1Var.i;
        kt ktVar3 = hg1Var.h;
        if (kz0Var2 == null) {
            cq cqVar = this.a;
            if (hg1Var == cqVar.d || hg1Var == cqVar.e) {
                return;
            }
            if (kz0Var == null) {
                kz0Var = new kz0();
                kz0Var.a = null;
                kz0Var.b = new ArrayList();
                kz0Var.a = hg1Var;
                arrayList.add(kz0Var);
            }
            hg1Var.c = kz0Var;
            kz0Var.b.add(hg1Var);
            ArrayList arrayList2 = ktVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ht htVar = (ht) obj;
                if (htVar instanceof kt) {
                    a((kt) htVar, i, arrayList, kz0Var);
                }
            }
            ArrayList arrayList3 = ktVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ht htVar2 = (ht) obj2;
                if (htVar2 instanceof kt) {
                    a((kt) htVar2, i, arrayList, kz0Var);
                }
            }
            if (i == 1 && (hg1Var instanceof zd1)) {
                ArrayList arrayList4 = ((zd1) hg1Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    ht htVar3 = (ht) obj3;
                    if (htVar3 instanceof kt) {
                        a((kt) htVar3, i, arrayList, kz0Var);
                    }
                }
            }
            ArrayList arrayList5 = ktVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((kt) obj4, i, arrayList, kz0Var);
            }
            ArrayList arrayList6 = ktVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((kt) obj5, i, arrayList, kz0Var);
            }
            if (i == 1 && (hg1Var instanceof zd1)) {
                ArrayList arrayList7 = ((zd1) hg1Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((kt) obj6, i, arrayList, kz0Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0202  */
    /* JADX WARN: Code duplicated, block: B:120:0x0217  */
    /* JADX WARN: Code duplicated, block: B:122:0x021c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0220  */
    /* JADX WARN: Code duplicated, block: B:129:0x0256  */
    /* JADX WARN: Code duplicated, block: B:131:0x0260  */
    /* JADX WARN: Code duplicated, block: B:136:0x0290  */
    /* JADX WARN: Code duplicated, block: B:138:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x029c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:153:0x0307  */
    /* JADX WARN: Code duplicated, block: B:156:0x0319  */
    /* JADX WARN: Code duplicated, block: B:157:0x032b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce A[PHI: r0
  0x00ce: PHI (r0v20 int) = (r0v18 int), (r0v96 int) binds: [B:69:0x00c6, B:63:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0140  */
    /* JADX WARN: Code duplicated, block: B:95:0x0177  */
    /* JADX WARN: Code duplicated, block: B:97:0x0180  */
    public final void b(cq cqVar) {
        int i;
        int i2;
        int i3;
        int iQ;
        int iK;
        int i4;
        int iK2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        ArrayList arrayList = cqVar.q0;
        int[] iArr = cqVar.p0;
        int size = arrayList.size();
        char c = 0;
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList.get(i18);
            i18++;
            bq bqVar = (bq) obj;
            int[] iArr2 = bqVar.p0;
            np[] npVarArr = bqVar.Q;
            np npVar = bqVar.L;
            np npVar2 = bqVar.J;
            np npVar3 = bqVar.K;
            np npVar4 = bqVar.I;
            int i19 = iArr2[c];
            int i20 = iArr2[1];
            if (bqVar.g0 == 8) {
                bqVar.a = true;
            } else {
                float f2 = bqVar.w;
                if (f2 < 1.0f && i19 == 3) {
                    bqVar.r = 2;
                }
                float f3 = bqVar.z;
                if (f3 < 1.0f && i20 == 3) {
                    bqVar.s = 2;
                }
                if (bqVar.W > 0.0f) {
                    if (i19 == 3) {
                        i17 = 2;
                        if (i20 == 2 || i20 == 1) {
                            i = 3;
                            bqVar.r = 3;
                        }
                    } else {
                        i17 = 2;
                    }
                    i = 3;
                    if (i20 == 3 && (i19 == i17 || i19 == 1)) {
                        bqVar.s = 3;
                    } else if (i19 == 3 && i20 == 3) {
                        if (bqVar.r == 0) {
                            bqVar.r = 3;
                        }
                        if (bqVar.s == 0) {
                            bqVar.s = 3;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i19 == i && bqVar.r == 1 && (npVar4.f == null || npVar3.f == null)) {
                    i19 = 2;
                }
                if (i20 == 3 && bqVar.s == 1 && (npVar2.f == null || npVar.f == null)) {
                    i20 = 2;
                }
                y70 y70Var = bqVar.d;
                y70Var.d = i19;
                int i21 = bqVar.r;
                y70Var.a = i21;
                zd1 zd1Var = bqVar.e;
                zd1Var.d = i20;
                ArrayList arrayList2 = arrayList;
                int i22 = bqVar.s;
                zd1Var.a = i22;
                if (i19 == 4 || i19 == 1) {
                    if (i20 != 4 && i20 != 1) {
                        i5 = 2;
                        if (i20 == 2) {
                            if (i19 == 3) {
                                if (i20 == i5 && i20 != 1) {
                                    i6 = i20;
                                    i9 = 3;
                                    i7 = 1;
                                    i8 = 2;
                                } else if (i21 == 3) {
                                    if (i20 == i5) {
                                        f(2, 0, i5, 0, bqVar);
                                    }
                                    int iK3 = bqVar.k();
                                    f(1, (int) ((iK3 * bqVar.W) + 0.5f), 1, iK3, bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else {
                                    i8 = 2;
                                    if (i21 == 1) {
                                        f(2, 0, i20, 0, bqVar);
                                        bqVar.d.e.m = bqVar.q();
                                    } else if (i21 == 2) {
                                        i16 = iArr[0];
                                        if (i16 != 1 || i16 == 4) {
                                            f(1, (int) ((f2 * cqVar.q()) + 0.5f), i20, bqVar.k(), bqVar);
                                            bqVar.d.e.d(bqVar.q());
                                            bqVar.e.e.d(bqVar.k());
                                            bqVar.a = true;
                                        } else {
                                            i6 = i20;
                                            i9 = 3;
                                            i7 = 1;
                                        }
                                    } else {
                                        i6 = i20;
                                        i7 = 1;
                                        if (npVarArr[0].f != null || npVarArr[1].f == null) {
                                            f(2, 0, i6, 0, bqVar);
                                            bqVar.d.e.d(bqVar.q());
                                            bqVar.e.e.d(bqVar.k());
                                            bqVar.a = true;
                                        }
                                    }
                                }
                                if (i6 != i9) {
                                    if (i19 == i8 && i19 != i7) {
                                        i10 = i19;
                                    } else if (i22 == i9) {
                                        if (i19 == i8) {
                                            f(i8, 0, i8, 0, bqVar);
                                        }
                                        int iQ2 = bqVar.q();
                                        f = bqVar.W;
                                        if (bqVar.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(1, iQ2, i7, (int) ((iQ2 * f) + 0.5f), bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    } else if (i22 == 1) {
                                        f(i19, 0, 2, 0, bqVar);
                                        bqVar.e.e.m = bqVar.k();
                                    } else {
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7 || i15 == 4) {
                                                f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                                bqVar.d.e.d(bqVar.q());
                                                bqVar.e.e.d(bqVar.k());
                                                bqVar.a = true;
                                            } else {
                                                i10 = i14;
                                            }
                                        } else {
                                            i10 = i14;
                                            i12 = 1;
                                            if (npVarArr[2].f != null || npVarArr[3].f == null) {
                                                f(2, 0, i6, 0, bqVar);
                                                bqVar.d.e.d(bqVar.q());
                                                bqVar.e.e.d(bqVar.k());
                                                bqVar.a = true;
                                            } else {
                                                i6 = i6;
                                                i11 = 1;
                                                i13 = 3;
                                            }
                                        }
                                    }
                                    i11 = 1;
                                    i12 = 1;
                                    i13 = 3;
                                } else {
                                    i6 = i6;
                                    i10 = i19;
                                    i11 = 1;
                                    i12 = 1;
                                    i13 = 3;
                                }
                                if (i10 == i13 && i6 == i13) {
                                    if (i21 != i11 || i22 == i11) {
                                        f(2, 0, 2, 0, bqVar);
                                        bqVar.d.e.m = bqVar.q();
                                        bqVar.e.e.m = bqVar.k();
                                    } else if (i22 == 2 && i21 == 2 && iArr[0] == i12 && iArr[i11] == i12) {
                                        f(i12, (int) ((f2 * cqVar.q()) + 0.5f), i12, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    }
                                }
                            } else {
                                i6 = i20;
                                i7 = 1;
                                i8 = 2;
                            }
                            i9 = 3;
                            if (i6 != i9) {
                                i6 = i6;
                                i10 = i19;
                                i11 = 1;
                                i12 = 1;
                                i13 = 3;
                            } else if (i19 == i8) {
                                if (i22 == i9) {
                                    if (i19 == i8) {
                                        f(i8, 0, i8, 0, bqVar);
                                    }
                                    int iQ3 = bqVar.q();
                                    f = bqVar.W;
                                    if (bqVar.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(1, iQ3, i7, (int) ((iQ3 * f) + 0.5f), bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else if (i22 == 1) {
                                    f(i19, 0, 2, 0, bqVar);
                                    bqVar.e.e.m = bqVar.k();
                                } else {
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    } else {
                                        i10 = i14;
                                        i12 = 1;
                                        if (npVarArr[2].f != null) {
                                        }
                                        f(2, 0, i6, 0, bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    }
                                }
                            } else if (i22 == i9) {
                                if (i19 == i8) {
                                    f(i8, 0, i8, 0, bqVar);
                                }
                                int iQ4 = bqVar.q();
                                f = bqVar.W;
                                if (bqVar.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(1, iQ4, i7, (int) ((iQ4 * f) + 0.5f), bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            } else if (i22 == 1) {
                                f(i19, 0, 2, 0, bqVar);
                                bqVar.e.e.m = bqVar.k();
                            } else {
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else {
                                    i10 = i14;
                                    i12 = 1;
                                    if (npVarArr[2].f != null) {
                                    }
                                    f(2, 0, i6, 0, bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                }
                            }
                            if (i10 == i13) {
                                if (i21 != i11) {
                                    f(2, 0, 2, 0, bqVar);
                                    bqVar.d.e.m = bqVar.q();
                                    bqVar.e.e.m = bqVar.k();
                                } else {
                                    f(2, 0, 2, 0, bqVar);
                                    bqVar.d.e.m = bqVar.q();
                                    bqVar.e.e.m = bqVar.k();
                                }
                            }
                        }
                    }
                    i2 = i20;
                    i3 = i19;
                    iQ = bqVar.q();
                    if (i3 == 4) {
                        iQ = (cqVar.q() - npVar4.g) - npVar3.g;
                        i3 = 1;
                    }
                    iK = bqVar.k();
                    if (i2 == 4) {
                        i4 = 1;
                        iK2 = (cqVar.k() - npVar2.g) - npVar.g;
                    } else {
                        i4 = i2;
                        iK2 = iK;
                    }
                    f(i3, iQ, i4, iK2, bqVar);
                    bqVar.d.e.d(bqVar.q());
                    bqVar.e.e.d(bqVar.k());
                    bqVar.a = true;
                } else {
                    i5 = 2;
                    if (i19 == 2) {
                        if (i20 != 4) {
                            i5 = 2;
                            if (i20 == 2) {
                                if (i19 == 3) {
                                    i6 = i20;
                                    i7 = 1;
                                    i8 = 2;
                                } else if (i20 == i5) {
                                    if (i21 == 3) {
                                        if (i20 == i5) {
                                            f(2, 0, i5, 0, bqVar);
                                        }
                                        int iK4 = bqVar.k();
                                        f(1, (int) ((iK4 * bqVar.W) + 0.5f), 1, iK4, bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    } else {
                                        i8 = 2;
                                        if (i21 == 1) {
                                            f(2, 0, i20, 0, bqVar);
                                            bqVar.d.e.m = bqVar.q();
                                        } else if (i21 == 2) {
                                            i16 = iArr[0];
                                            if (i16 != 1) {
                                            }
                                            f(1, (int) ((f2 * cqVar.q()) + 0.5f), i20, bqVar.k(), bqVar);
                                            bqVar.d.e.d(bqVar.q());
                                            bqVar.e.e.d(bqVar.k());
                                            bqVar.a = true;
                                        } else {
                                            i6 = i20;
                                            i7 = 1;
                                            if (npVarArr[0].f != null) {
                                            }
                                            f(2, 0, i6, 0, bqVar);
                                            bqVar.d.e.d(bqVar.q());
                                            bqVar.e.e.d(bqVar.k());
                                            bqVar.a = true;
                                        }
                                    }
                                } else if (i21 == 3) {
                                    if (i20 == i5) {
                                        f(2, 0, i5, 0, bqVar);
                                    }
                                    int iK5 = bqVar.k();
                                    f(1, (int) ((iK5 * bqVar.W) + 0.5f), 1, iK5, bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else {
                                    i8 = 2;
                                    if (i21 == 1) {
                                        f(2, 0, i20, 0, bqVar);
                                        bqVar.d.e.m = bqVar.q();
                                    } else if (i21 == 2) {
                                        i16 = iArr[0];
                                        if (i16 != 1) {
                                        }
                                        f(1, (int) ((f2 * cqVar.q()) + 0.5f), i20, bqVar.k(), bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    } else {
                                        i6 = i20;
                                        i7 = 1;
                                        if (npVarArr[0].f != null) {
                                        }
                                        f(2, 0, i6, 0, bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    }
                                }
                                i9 = 3;
                                if (i6 != i9) {
                                    i6 = i6;
                                    i10 = i19;
                                    i11 = 1;
                                    i12 = 1;
                                    i13 = 3;
                                } else if (i19 == i8) {
                                    if (i22 == i9) {
                                        if (i19 == i8) {
                                            f(i8, 0, i8, 0, bqVar);
                                        }
                                        int iQ5 = bqVar.q();
                                        f = bqVar.W;
                                        if (bqVar.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(1, iQ5, i7, (int) ((iQ5 * f) + 0.5f), bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    } else if (i22 == 1) {
                                        f(i19, 0, 2, 0, bqVar);
                                        bqVar.e.e.m = bqVar.k();
                                    } else {
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7) {
                                            }
                                            f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                            bqVar.d.e.d(bqVar.q());
                                            bqVar.e.e.d(bqVar.k());
                                            bqVar.a = true;
                                        } else {
                                            i10 = i14;
                                            i12 = 1;
                                            if (npVarArr[2].f != null) {
                                            }
                                            f(2, 0, i6, 0, bqVar);
                                            bqVar.d.e.d(bqVar.q());
                                            bqVar.e.e.d(bqVar.k());
                                            bqVar.a = true;
                                        }
                                    }
                                } else if (i22 == i9) {
                                    if (i19 == i8) {
                                        f(i8, 0, i8, 0, bqVar);
                                    }
                                    int iQ6 = bqVar.q();
                                    f = bqVar.W;
                                    if (bqVar.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(1, iQ6, i7, (int) ((iQ6 * f) + 0.5f), bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else if (i22 == 1) {
                                    f(i19, 0, 2, 0, bqVar);
                                    bqVar.e.e.m = bqVar.k();
                                } else {
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    } else {
                                        i10 = i14;
                                        i12 = 1;
                                        if (npVarArr[2].f != null) {
                                        }
                                        f(2, 0, i6, 0, bqVar);
                                        bqVar.d.e.d(bqVar.q());
                                        bqVar.e.e.d(bqVar.k());
                                        bqVar.a = true;
                                    }
                                }
                                if (i10 == i13) {
                                    if (i21 != i11) {
                                        f(2, 0, 2, 0, bqVar);
                                        bqVar.d.e.m = bqVar.q();
                                        bqVar.e.e.m = bqVar.k();
                                    } else {
                                        f(2, 0, 2, 0, bqVar);
                                        bqVar.d.e.m = bqVar.q();
                                        bqVar.e.e.m = bqVar.k();
                                    }
                                }
                            }
                        }
                        i2 = i20;
                        i3 = i19;
                        iQ = bqVar.q();
                        if (i3 == 4) {
                            iQ = (cqVar.q() - npVar4.g) - npVar3.g;
                            i3 = 1;
                        }
                        iK = bqVar.k();
                        if (i2 == 4) {
                            i4 = 1;
                            iK2 = (cqVar.k() - npVar2.g) - npVar.g;
                        } else {
                            i4 = i2;
                            iK2 = iK;
                        }
                        f(i3, iQ, i4, iK2, bqVar);
                        bqVar.d.e.d(bqVar.q());
                        bqVar.e.e.d(bqVar.k());
                        bqVar.a = true;
                    } else {
                        if (i19 == 3) {
                            i6 = i20;
                            i7 = 1;
                            i8 = 2;
                        } else if (i20 == i5) {
                            if (i21 == 3) {
                                if (i20 == i5) {
                                    f(2, 0, i5, 0, bqVar);
                                }
                                int iK6 = bqVar.k();
                                f(1, (int) ((iK6 * bqVar.W) + 0.5f), 1, iK6, bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            } else {
                                i8 = 2;
                                if (i21 == 1) {
                                    f(2, 0, i20, 0, bqVar);
                                    bqVar.d.e.m = bqVar.q();
                                } else if (i21 == 2) {
                                    i16 = iArr[0];
                                    if (i16 != 1) {
                                    }
                                    f(1, (int) ((f2 * cqVar.q()) + 0.5f), i20, bqVar.k(), bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (npVarArr[0].f != null) {
                                    }
                                    f(2, 0, i6, 0, bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                }
                            }
                        } else if (i21 == 3) {
                            if (i20 == i5) {
                                f(2, 0, i5, 0, bqVar);
                            }
                            int iK7 = bqVar.k();
                            f(1, (int) ((iK7 * bqVar.W) + 0.5f), 1, iK7, bqVar);
                            bqVar.d.e.d(bqVar.q());
                            bqVar.e.e.d(bqVar.k());
                            bqVar.a = true;
                        } else {
                            i8 = 2;
                            if (i21 == 1) {
                                f(2, 0, i20, 0, bqVar);
                                bqVar.d.e.m = bqVar.q();
                            } else if (i21 == 2) {
                                i16 = iArr[0];
                                if (i16 != 1) {
                                }
                                f(1, (int) ((f2 * cqVar.q()) + 0.5f), i20, bqVar.k(), bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            } else {
                                i6 = i20;
                                i7 = 1;
                                if (npVarArr[0].f != null) {
                                }
                                f(2, 0, i6, 0, bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            }
                        }
                        i9 = 3;
                        if (i6 != i9) {
                            i6 = i6;
                            i10 = i19;
                            i11 = 1;
                            i12 = 1;
                            i13 = 3;
                        } else if (i19 == i8) {
                            if (i22 == i9) {
                                if (i19 == i8) {
                                    f(i8, 0, i8, 0, bqVar);
                                }
                                int iQ7 = bqVar.q();
                                f = bqVar.W;
                                if (bqVar.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(1, iQ7, i7, (int) ((iQ7 * f) + 0.5f), bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            } else if (i22 == 1) {
                                f(i19, 0, 2, 0, bqVar);
                                bqVar.e.e.m = bqVar.k();
                            } else {
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                } else {
                                    i10 = i14;
                                    i12 = 1;
                                    if (npVarArr[2].f != null) {
                                    }
                                    f(2, 0, i6, 0, bqVar);
                                    bqVar.d.e.d(bqVar.q());
                                    bqVar.e.e.d(bqVar.k());
                                    bqVar.a = true;
                                }
                            }
                        } else if (i22 == i9) {
                            if (i19 == i8) {
                                f(i8, 0, i8, 0, bqVar);
                            }
                            int iQ8 = bqVar.q();
                            f = bqVar.W;
                            if (bqVar.X == -1) {
                                f = 1.0f / f;
                            }
                            f(1, iQ8, i7, (int) ((iQ8 * f) + 0.5f), bqVar);
                            bqVar.d.e.d(bqVar.q());
                            bqVar.e.e.d(bqVar.k());
                            bqVar.a = true;
                        } else if (i22 == 1) {
                            f(i19, 0, 2, 0, bqVar);
                            bqVar.e.e.m = bqVar.k();
                        } else {
                            i14 = i19;
                            if (i22 == 2) {
                                i15 = iArr[1];
                                if (i15 != i7) {
                                }
                                f(i14, bqVar.q(), 1, (int) ((f3 * cqVar.k()) + 0.5f), bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            } else {
                                i10 = i14;
                                i12 = 1;
                                if (npVarArr[2].f != null) {
                                }
                                f(2, 0, i6, 0, bqVar);
                                bqVar.d.e.d(bqVar.q());
                                bqVar.e.e.d(bqVar.k());
                                bqVar.a = true;
                            }
                        }
                        if (i10 == i13) {
                            if (i21 != i11) {
                                f(2, 0, 2, 0, bqVar);
                                bqVar.d.e.m = bqVar.q();
                                bqVar.e.e.m = bqVar.k();
                            } else {
                                f(2, 0, 2, 0, bqVar);
                                bqVar.d.e.m = bqVar.q();
                                bqVar.e.e.m = bqVar.k();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
            c = 0;
        }
    }

    public final void c() {
        cq cqVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        cq cqVar2 = this.d;
        cqVar2.d.f();
        cqVar2.e.f();
        arrayList2.add(cqVar2.d);
        arrayList2.add(cqVar2.e);
        ArrayList arrayList3 = cqVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            bq bqVar = (bq) obj;
            if (bqVar instanceof k70) {
                l70 l70Var = new l70(bqVar);
                bqVar.d.f();
                bqVar.e.f();
                l70Var.f = ((k70) bqVar).u0;
                arrayList2.add(l70Var);
            } else {
                if (bqVar.x()) {
                    if (bqVar.b == null) {
                        bqVar.b = new wj(bqVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(bqVar.b);
                } else {
                    arrayList2.add(bqVar.d);
                }
                if (bqVar.y()) {
                    if (bqVar.c == null) {
                        bqVar.c = new wj(bqVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(bqVar.c);
                } else {
                    arrayList2.add(bqVar.e);
                }
                if (bqVar instanceof v70) {
                    arrayList2.add(new u70(bqVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((hg1) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            hg1 hg1Var = (hg1) obj3;
            if (hg1Var.b != cqVar2) {
                hg1Var.d();
            }
        }
        arrayList.clear();
        e(cqVar.d, 0, arrayList);
        e(cqVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(cq cqVar, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            hg1 hg1Var = ((kz0) arrayList2.get(i3)).a;
            if (!(hg1Var instanceof wj) ? !(i != 0 ? (hg1Var instanceof zd1) : (hg1Var instanceof y70)) : ((wj) hg1Var).f != i) {
                kt ktVar = (i == 0 ? cqVar.d : cqVar.e).h;
                kt ktVar2 = (i == 0 ? cqVar.d : cqVar.e).i;
                kt ktVar3 = hg1Var.h;
                kt ktVar4 = hg1Var.i;
                boolean zContains = ktVar3.l.contains(ktVar);
                boolean zContains2 = ktVar4.l.contains(ktVar2);
                long j4 = hg1Var.j();
                if (zContains && zContains2) {
                    long jB = kz0.b(ktVar3, j3);
                    long jA = kz0.a(ktVar4, j3);
                    long j5 = jB - j4;
                    int i4 = ktVar4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = ktVar3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    bq bqVar = hg1Var.b;
                    if (i == 0) {
                        f = bqVar.d0;
                    } else if (i == 1) {
                        f = bqVar.e0;
                    } else {
                        bqVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) ktVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) ktVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        j = Math.max(kz0.b(ktVar3, ktVar3.f), ((long) ktVar3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-kz0.a(ktVar4, ktVar4.f), ((long) (-ktVar4.f)) + j4);
                    } else {
                        j = (hg1Var.j() + ((long) ktVar3.f)) - ((long) ktVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                j = j3;
            }
            jMax = Math.max(jMax, j);
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j3 = 0;
        }
        return (int) jMax;
    }

    public final void e(hg1 hg1Var, int i, ArrayList arrayList) {
        kt ktVar = hg1Var.h;
        kt ktVar2 = hg1Var.i;
        ArrayList arrayList2 = ktVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ht htVar = (ht) obj;
            if (htVar instanceof kt) {
                a((kt) htVar, i, arrayList, null);
            } else if (htVar instanceof hg1) {
                a(((hg1) htVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = ktVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ht htVar2 = (ht) obj2;
            if (htVar2 instanceof kt) {
                a((kt) htVar2, i, arrayList, null);
            } else if (htVar2 instanceof hg1) {
                a(((hg1) htVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((zd1) hg1Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                ht htVar3 = (ht) obj3;
                if (htVar3 instanceof kt) {
                    a((kt) htVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, bq bqVar) {
        hg hgVar = this.g;
        hgVar.a = i;
        hgVar.b = i3;
        hgVar.c = i2;
        hgVar.d = i4;
        this.f.b(bqVar, hgVar);
        bqVar.O(hgVar.e);
        bqVar.L(hgVar.f);
        bqVar.E = hgVar.h;
        bqVar.I(hgVar.g);
    }

    public final void g() {
        gg ggVar;
        jt jtVar = this;
        ArrayList arrayList = jtVar.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bq bqVar = (bq) arrayList.get(i);
            if (!bqVar.a) {
                int[] iArr = bqVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = bqVar.r;
                int i6 = bqVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                mu muVar = bqVar.d.e;
                boolean z3 = muVar.j;
                mu muVar2 = bqVar.e.e;
                boolean z4 = muVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    jtVar.f(1, muVar.g, 1, muVar2.g, bqVar);
                    bqVar.a = true;
                } else if (z3 && z2) {
                    f(1, muVar.g, 2, muVar2.g, bqVar);
                    zd1 zd1Var = bqVar.e;
                    if (i4 == 3) {
                        zd1Var.e.m = bqVar.k();
                    } else {
                        zd1Var.e.d(bqVar.k());
                        bqVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, muVar.g, 1, muVar2.g, bqVar);
                    y70 y70Var = bqVar.d;
                    if (i3 == 3) {
                        y70Var.e.m = bqVar.q();
                    } else {
                        y70Var.e.d(bqVar.q());
                        bqVar.a = true;
                    }
                }
                if (bqVar.a && (ggVar = bqVar.e.l) != null) {
                    ggVar.d(bqVar.a0);
                }
                jtVar = this;
            }
            i = i2;
        }
    }
}
