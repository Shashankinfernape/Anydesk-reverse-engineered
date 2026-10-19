package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf extends v70 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.bq
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.bq
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            bq bqVar = this.q0[i4];
            if ((this.t0 || bqVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !bqVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !bqVar.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            bq bqVar2 = this.q0[i5];
            if (this.t0 || bqVar2.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = bqVar2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = bqVar2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = bqVar2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = bqVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, bqVar2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, bqVar2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, bqVar2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, bqVar2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.bq
    public final void b(xf0 xf0Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        np[] npVarArr = this.Q;
        np npVar = this.I;
        npVarArr[0] = npVar;
        int i3 = 2;
        np npVar2 = this.J;
        npVarArr[2] = npVar2;
        np npVar3 = this.K;
        npVarArr[1] = npVar3;
        np npVar4 = this.L;
        npVarArr[3] = npVar4;
        for (np npVar5 : npVarArr) {
            npVar5.i = xf0Var.k(npVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        np npVar6 = npVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                xf0Var.d(npVar.i, this.Y);
                xf0Var.d(npVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    xf0Var.d(npVar2.i, this.Z);
                    xf0Var.d(npVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.r0) {
                z2 = false;
                break;
            }
            bq bqVar = this.q0[i6];
            if ((this.t0 || bqVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && bqVar.p0[0] == 3 && bqVar.I.f != null && bqVar.K.f != null) || ((i2 == 2 || i2 == 3) && bqVar.p0[1] == 3 && bqVar.J.f != null && bqVar.L.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = npVar.g() || npVar3.g();
        boolean z4 = npVar2.g() || npVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            bq bqVar2 = this.q0[i8];
            if (this.t0 || bqVar2.c()) {
                r51 r51VarK = xf0Var.k(bqVar2.Q[this.s0]);
                np[] npVarArr2 = bqVar2.Q;
                int i9 = this.s0;
                np npVar7 = npVarArr2[i9];
                npVar7.i = r51VarK;
                np npVar8 = npVar7.f;
                int i10 = (npVar8 == null || npVar8.d != this) ? 0 : npVar7.g;
                if (i9 == 0 || i9 == i3) {
                    r51 r51Var = npVar6.i;
                    int i11 = this.u0 - i10;
                    yd ydVarL = xf0Var.l();
                    r51 r51VarM = xf0Var.m();
                    r51VarM.f = 0;
                    ydVarL.c(r51Var, r51VarK, r51VarM, i11);
                    xf0Var.c(ydVarL);
                } else {
                    r51 r51Var2 = npVar6.i;
                    int i12 = this.u0 + i10;
                    yd ydVarL2 = xf0Var.l();
                    r51 r51VarM2 = xf0Var.m();
                    r51VarM2.f = 0;
                    ydVarL2.b(r51Var2, r51VarK, r51VarM2, i12);
                    xf0Var.c(ydVarL2);
                }
                xf0Var.e(npVar6.i, r51VarK, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            xf0Var.e(npVar3.i, npVar.i, 0, 8);
            xf0Var.e(npVar.i, this.T.K.i, 0, 4);
            xf0Var.e(npVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            xf0Var.e(npVar.i, npVar3.i, 0, 8);
            xf0Var.e(npVar.i, this.T.I.i, 0, 4);
            xf0Var.e(npVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            xf0Var.e(npVar4.i, npVar2.i, 0, 8);
            xf0Var.e(npVar2.i, this.T.L.i, 0, 4);
            xf0Var.e(npVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            xf0Var.e(npVar2.i, npVar4.i, 0, 8);
            xf0Var.e(npVar2.i, this.T.J.i, 0, 4);
            xf0Var.e(npVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.bq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bq
    public final String toString() {
        String strM = q51.m(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            bq bqVar = this.q0[i];
            if (i > 0) {
                strM = strM.concat(", ");
            }
            strM = strM + bqVar.h0;
        }
        return strM.concat("}");
    }
}
