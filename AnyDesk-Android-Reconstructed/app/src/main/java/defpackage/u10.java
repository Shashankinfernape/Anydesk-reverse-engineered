package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u10 extends v70 {
    public int A0;
    public hg B0;
    public sp C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public bq[] X0;
    public bq[] Y0;
    public int[] Z0;
    public bq[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.v70
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            bq bqVar = this.q0[i];
            if (bqVar != null) {
                bqVar.F = true;
            }
        }
    }

    public final int T(bq bqVar, int i) {
        bq bqVar2;
        if (bqVar != null) {
            int[] iArr = bqVar.p0;
            if (iArr[1] == 3) {
                int i2 = bqVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (bqVar.z * i);
                        if (i3 != bqVar.k()) {
                            bqVar.g = true;
                            V(iArr[0], bqVar.q(), 1, i3, bqVar);
                        }
                        return i3;
                    }
                    bqVar2 = bqVar;
                    if (i2 == 1) {
                        return bqVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((bqVar2.q() * bqVar2.W) + 0.5f);
                    }
                }
            } else {
                bqVar2 = bqVar;
            }
            return bqVar2.k();
        }
        return 0;
    }

    public final int U(bq bqVar, int i) {
        bq bqVar2;
        if (bqVar != null) {
            int[] iArr = bqVar.p0;
            if (iArr[0] == 3) {
                int i2 = bqVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (bqVar.w * i);
                        if (i3 != bqVar.q()) {
                            bqVar.g = true;
                            V(1, i3, iArr[1], bqVar.k(), bqVar);
                        }
                        return i3;
                    }
                    bqVar2 = bqVar;
                    if (i2 == 1) {
                        return bqVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((bqVar2.k() * bqVar2.W) + 0.5f);
                    }
                }
            } else {
                bqVar2 = bqVar;
            }
            return bqVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, bq bqVar) {
        sp spVar;
        bq bqVar2;
        hg hgVar = this.B0;
        while (true) {
            spVar = this.C0;
            if (spVar != null || (bqVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((cq) bqVar2).u0;
            }
        }
        hgVar.a = i;
        hgVar.b = i3;
        hgVar.c = i2;
        hgVar.d = i4;
        spVar.b(bqVar, hgVar);
        bqVar.O(hgVar.e);
        bqVar.L(hgVar.f);
        bqVar.E = hgVar.h;
        bqVar.I(hgVar.g);
    }

    @Override // defpackage.bq
    public final void b(xf0 xf0Var, boolean z) {
        bq bqVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(xf0Var, z);
        bq bqVar2 = this.T;
        boolean z2 = bqVar2 != null && ((cq) bqVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((s10) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((s10) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                bq bqVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    bq bqVar4 = this.Y0[i];
                    if (bqVar4 != null) {
                        np npVar = bqVar4.I;
                        if (bqVar4.g0 != 8) {
                            if (i8 == 0) {
                                bqVar4.f(npVar, this.I, this.w0);
                                bqVar4.i0 = this.D0;
                                bqVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                bqVar4.f(bqVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && bqVar3 != null) {
                                np npVar2 = bqVar3.K;
                                bqVar4.f(npVar, npVar2, this.P0);
                                bqVar3.f(npVar2, npVar, 0);
                            }
                            bqVar3 = bqVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    bq bqVar5 = this.X0[i9];
                    if (bqVar5 != null) {
                        np npVar3 = bqVar5.J;
                        if (bqVar5.g0 != 8) {
                            if (i9 == 0) {
                                bqVar5.f(npVar3, this.J, this.s0);
                                bqVar5.j0 = this.E0;
                                bqVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                bqVar5.f(bqVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && bqVar3 != null) {
                                np npVar4 = bqVar3.L;
                                bqVar5.f(npVar3, npVar4, this.Q0);
                                bqVar3.f(npVar4, npVar3, 0);
                            }
                            bqVar3 = bqVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        bq[] bqVarArr = this.a1;
                        if (i12 < bqVarArr.length && (bqVar = bqVarArr[i12]) != null && bqVar.g0 != 8) {
                            bq bqVar6 = this.Y0[i10];
                            bq bqVar7 = this.X0[i11];
                            if (bqVar != bqVar6) {
                                bqVar.f(bqVar.I, bqVar6.I, 0);
                                bqVar.f(bqVar.K, bqVar6.K, 0);
                            }
                            if (bqVar != bqVar7) {
                                bqVar.f(bqVar.J, bqVar7.J, 0);
                                bqVar.f(bqVar.L, bqVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((s10) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
