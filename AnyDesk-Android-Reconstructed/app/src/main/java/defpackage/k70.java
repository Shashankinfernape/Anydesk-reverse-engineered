package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k70 extends bq {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public np t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public k70() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.bq
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.bq
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.bq
    public final void Q(xf0 xf0Var, boolean z) {
        if (this.T == null) {
            return;
        }
        np npVar = this.t0;
        xf0Var.getClass();
        int iN = xf0.n(npVar);
        if (this.u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        np[] npVarArr = this.Q;
        int length = npVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            npVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.bq
    public final void b(xf0 xf0Var, boolean z) {
        cq cqVar = (cq) this.T;
        if (cqVar == null) {
            return;
        }
        Object objI = cqVar.i(2);
        Object objI2 = cqVar.i(4);
        bq bqVar = this.T;
        boolean z2 = bqVar != null && bqVar.p0[0] == 2;
        if (this.u0 == 0) {
            objI = cqVar.i(3);
            objI2 = cqVar.i(5);
            bq bqVar2 = this.T;
            z2 = bqVar2 != null && bqVar2.p0[1] == 2;
        }
        if (this.v0) {
            np npVar = this.t0;
            if (npVar.c) {
                r51 r51VarK = xf0Var.k(npVar);
                xf0Var.d(r51VarK, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        xf0Var.f(xf0Var.k(objI2), r51VarK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    r51 r51VarK2 = xf0Var.k(objI2);
                    xf0Var.f(r51VarK, xf0Var.k(objI), 0, 5);
                    xf0Var.f(r51VarK2, r51VarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            r51 r51VarK3 = xf0Var.k(this.t0);
            xf0Var.e(r51VarK3, xf0Var.k(objI), this.r0, 8);
            if (z2) {
                xf0Var.f(xf0Var.k(objI2), r51VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            r51 r51VarK4 = xf0Var.k(this.t0);
            r51 r51VarK5 = xf0Var.k(objI2);
            xf0Var.e(r51VarK4, r51VarK5, -this.s0, 8);
            if (z2) {
                xf0Var.f(r51VarK4, xf0Var.k(objI), 0, 5);
                xf0Var.f(r51VarK5, r51VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            r51 r51VarK6 = xf0Var.k(this.t0);
            r51 r51VarK7 = xf0Var.k(objI2);
            float f = this.q0;
            yd ydVarL = xf0Var.l();
            ydVarL.d.g(r51VarK6, -1.0f);
            ydVarL.d.g(r51VarK7, f);
            xf0Var.c(ydVarL);
        }
    }

    @Override // defpackage.bq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bq
    public final np i(int i) {
        int iR = q51.r(i);
        if (iR != 1) {
            if (iR != 2) {
                if (iR != 3) {
                    if (iR != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
