package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s10 {
    public int a;
    public np d;
    public np e;
    public np f;
    public np g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ u10 r;
    public bq b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public s10(u10 u10Var, int i, np npVar, np npVar2, np npVar3, np npVar4, int i2) {
        this.r = u10Var;
        this.a = i;
        this.d = npVar;
        this.e = npVar2;
        this.f = npVar3;
        this.g = npVar4;
        this.h = u10Var.w0;
        this.i = u10Var.s0;
        this.j = u10Var.x0;
        this.k = u10Var.t0;
        this.q = i2;
    }

    public final void a(bq bqVar) {
        int i = this.a;
        int i2 = this.q;
        u10 u10Var = this.r;
        if (i == 0) {
            int iU = u10Var.U(bqVar, i2);
            if (bqVar.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (bqVar.g0 != 8 ? u10Var.P0 : 0) + this.l;
            int iT = u10Var.T(bqVar, this.q);
            if (this.b == null || this.c < iT) {
                this.b = bqVar;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = u10Var.U(bqVar, i2);
            int iT2 = u10Var.T(bqVar, this.q);
            if (bqVar.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (bqVar.g0 != 8 ? u10Var.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = bqVar;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v24 int) = (r5v22 int), (r5v25 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(int i, boolean z, boolean z2) {
        u10 u10Var;
        int i2;
        int i3;
        bq bqVar;
        boolean z3;
        int i4;
        float f;
        int i5;
        int i6 = this.o;
        int i7 = 0;
        while (true) {
            u10Var = this.r;
            if (i7 >= i6 || (i5 = this.n + i7) >= u10Var.b1) {
                break;
            }
            bq bqVar2 = u10Var.a1[i5];
            if (bqVar2 != null) {
                bqVar2.D();
            }
            i7++;
        }
        if (i6 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= u10Var.b1) {
                break;
            }
            bq bqVar3 = u10Var.a1[i11];
            if (bqVar3 != null && bqVar3.g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.a;
        bq bqVar4 = this.b;
        if (i12 == 0) {
            bqVar4.j0 = u10Var.E0;
            np npVar = bqVar4.L;
            np npVar2 = bqVar4.J;
            int i13 = this.i;
            if (i > 0) {
                i13 += u10Var.Q0;
            }
            npVar2.a(this.e, i13);
            if (z2) {
                npVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(npVar2, 0);
            }
            if (u10Var.S0 != 3 || bqVar4.E) {
                bqVar = bqVar4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.n + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < u10Var.b1) {
                        bqVar = u10Var.a1[i15];
                        if (bqVar.E) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                bqVar = bqVar4;
                break;
            }
            bq bqVar5 = null;
            int i16 = 0;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.n + i17;
                if (i18 >= u10Var.b1) {
                    return;
                }
                bq bqVar6 = u10Var.a1[i18];
                if (bqVar6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                } else {
                    np npVar3 = bqVar6.J;
                    np npVar4 = bqVar6.L;
                    np npVar5 = bqVar6.I;
                    z3 = z4;
                    if (i16 == 0) {
                        bqVar6.f(npVar5, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i19 = u10Var.D0;
                        float f2 = u10Var.J0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.n == 0 && (i4 = u10Var.F0) != -1) {
                            f = u10Var.L0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = u10Var.H0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = u10Var.N0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        bqVar6.i0 = i4;
                        bqVar6.d0 = f;
                    }
                    if (i16 == i6 - 1) {
                        bqVar6.f(bqVar6.K, this.f, this.j);
                    }
                    if (bqVar5 != null) {
                        np npVar6 = bqVar5.K;
                        npVar5.a(npVar6, u10Var.P0);
                        if (i16 == i8) {
                            int i20 = this.h;
                            if (npVar5.h()) {
                                npVar5.h = i20;
                            }
                        }
                        npVar6.a(npVar5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.j;
                            if (npVar6.h()) {
                                npVar6.h = i21;
                            }
                        }
                    }
                    if (bqVar6 != bqVar4) {
                        int i22 = u10Var.S0;
                        if (i22 == 3 && bqVar.E && bqVar6 != bqVar && bqVar6.E) {
                            bqVar6.M.a(bqVar.M, 0);
                        } else if (i22 == 0) {
                            npVar3.a(npVar2, 0);
                        } else if (i22 == 1) {
                            npVar4.a(npVar, 0);
                        } else if (z3) {
                            npVar3.a(this.e, this.i);
                            npVar4.a(this.g, this.k);
                        } else {
                            npVar3.a(npVar2, 0);
                            npVar4.a(npVar, 0);
                        }
                    }
                    bqVar5 = bqVar6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        bqVar4.i0 = u10Var.D0;
        np npVar7 = bqVar4.I;
        np npVar8 = bqVar4.K;
        int i25 = this.h;
        if (i > 0) {
            i25 += u10Var.P0;
        }
        if (z) {
            npVar8.a(this.f, i25);
            if (z2) {
                npVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(npVar8, 0);
            }
        } else {
            npVar7.a(this.d, i25);
            if (z2) {
                npVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(npVar7, 0);
            }
        }
        int i26 = 0;
        bq bqVar7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.n + i26) >= u10Var.b1) {
                return;
            }
            bq bqVar8 = u10Var.a1[i2];
            if (bqVar8 == null) {
                i23 = i27;
            } else {
                np npVar9 = bqVar8.I;
                np npVar10 = bqVar8.J;
                np npVar11 = bqVar8.K;
                if (i26 == 0) {
                    bqVar8.f(npVar10, this.e, this.i);
                    int i28 = u10Var.E0;
                    float f3 = u10Var.K0;
                    if (this.n == 0) {
                        int i29 = u10Var.G0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = u10Var.M0;
                        }
                        i28 = i29;
                        bqVar8.j0 = i28;
                        bqVar8.e0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = u10Var.I0) != i3) {
                        f3 = u10Var.O0;
                        i28 = i29;
                    }
                    bqVar8.j0 = i28;
                    bqVar8.e0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    bqVar8.f(bqVar8.L, this.g, this.k);
                }
                if (bqVar7 != null) {
                    np npVar12 = bqVar7.L;
                    npVar10.a(npVar12, u10Var.Q0);
                    if (i26 == i8) {
                        int i30 = this.i;
                        if (npVar10.h()) {
                            npVar10.h = i30;
                        }
                    }
                    npVar12.a(npVar10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.k;
                        if (npVar12.h()) {
                            npVar12.h = i31;
                        }
                    }
                }
                if (bqVar8 != bqVar4) {
                    int i32 = u10Var.R0;
                    if (z) {
                        if (i32 == 0) {
                            npVar11.a(npVar8, 0);
                        } else if (i32 == 1) {
                            npVar9.a(npVar7, 0);
                        } else if (i32 == 2) {
                            npVar9.a(npVar7, 0);
                            npVar11.a(npVar8, 0);
                        }
                    } else if (i32 == 0) {
                        npVar9.a(npVar7, 0);
                    } else if (i32 == 1) {
                        npVar11.a(npVar8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            npVar9.a(this.d, this.h);
                            npVar11.a(this.f, this.j);
                        } else {
                            npVar9.a(npVar7, 0);
                            npVar11.a(npVar8, 0);
                        }
                    }
                }
                bqVar7 = bqVar8;
            }
            i26++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.Q0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.P0 : i2;
    }

    public final void e(int i) {
        u10 u10Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            u10Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= u10Var.b1) {
                break;
            }
            bq bqVar = u10Var.a1[i2];
            if (this.a == 0) {
                if (bqVar != null) {
                    int[] iArr = bqVar.p0;
                    if (iArr[0] == 3 && bqVar.r == 0) {
                        u10Var.V(1, i5, iArr[1], bqVar.k(), bqVar);
                    }
                }
            } else if (bqVar != null) {
                int[] iArr2 = bqVar.p0;
                if (iArr2[1] == 3 && bqVar.s == 0) {
                    int i7 = i5;
                    u10Var.V(iArr2[0], bqVar.q(), 1, i7, bqVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= u10Var.b1) {
                return;
            }
            bq bqVar2 = u10Var.a1[i10];
            if (this.a == 0) {
                int iQ = bqVar2.q();
                int i11 = u10Var.P0;
                if (bqVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = iQ + i11 + this.l;
                int iT = u10Var.T(bqVar2, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = bqVar2;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = u10Var.U(bqVar2, this.q);
                int iT2 = u10Var.T(bqVar2, this.q);
                int i12 = u10Var.Q0;
                if (bqVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = iT2 + i12 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = bqVar2;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, np npVar, np npVar2, np npVar3, np npVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = npVar;
        this.e = npVar2;
        this.f = npVar3;
        this.g = npVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
