package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.cx0;
import defpackage.dx0;
import defpackage.gr0;
import defpackage.hx0;
import defpackage.id;
import defpackage.iw0;
import defpackage.ow;
import defpackage.p60;
import defpackage.q3;
import defpackage.qw0;
import defpackage.rf0;
import defpackage.rw0;
import defpackage.sf0;
import defpackage.sw0;
import defpackage.tf0;
import defpackage.th1;
import defpackage.uf0;
import defpackage.w3;
import defpackage.wf0;
import defpackage.yw0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends rw0 implements cx0 {
    public final rf0 A;
    public final sf0 B;
    public final int C;
    public final int[] D;
    public int p;
    public tf0 q;
    public ow r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public uf0 z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new rf0();
        this.B = new sf0();
        this.C = 2;
        this.D = new int[2];
        qw0 qw0VarH = rw0.H(context, attributeSet, i, i2);
        c1(qw0VarH.a);
        boolean z = qw0VarH.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            o0();
        }
        d1(qw0VarH.d);
    }

    @Override // defpackage.rw0
    public final void A0(RecyclerView recyclerView, int i) {
        wf0 wf0Var = new wf0(recyclerView.getContext());
        wf0Var.a = i;
        B0(wf0Var);
    }

    @Override // defpackage.rw0
    public boolean C0() {
        return this.z == null && this.s == this.v;
    }

    public void D0(dx0 dx0Var, tf0 tf0Var, p60 p60Var) {
        int i = tf0Var.d;
        if (i < 0 || i >= dx0Var.b()) {
            return;
        }
        p60Var.a(i, Math.max(0, tf0Var.g));
    }

    public final int E0(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        ow owVar = this.r;
        boolean z = !this.w;
        return th1.k(dx0Var, owVar, L0(z), K0(z), this, this.w);
    }

    public final int F0(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        ow owVar = this.r;
        boolean z = !this.w;
        return th1.l(dx0Var, owVar, L0(z), K0(z), this, this.w, this.u);
    }

    public final int G0(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        ow owVar = this.r;
        boolean z = !this.w;
        return th1.m(dx0Var, owVar, L0(z), K0(z), this, this.w);
    }

    public final int H0(int i) {
        if (i == 1) {
            return (this.p != 1 && V0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && V0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void I0() {
        if (this.q == null) {
            tf0 tf0Var = new tf0();
            tf0Var.a = true;
            tf0Var.h = 0;
            tf0Var.i = 0;
            tf0Var.k = null;
            this.q = tf0Var;
        }
    }

    public final int J0(yw0 yw0Var, tf0 tf0Var, dx0 dx0Var, boolean z) {
        int i;
        int i2 = tf0Var.c;
        int i3 = tf0Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                tf0Var.g = i3 + i2;
            }
            Y0(yw0Var, tf0Var);
        }
        int i4 = tf0Var.c + tf0Var.h;
        while (true) {
            if ((!tf0Var.l && i4 <= 0) || (i = tf0Var.d) < 0 || i >= dx0Var.b()) {
                break;
            }
            sf0 sf0Var = this.B;
            sf0Var.a = 0;
            sf0Var.b = false;
            sf0Var.c = false;
            sf0Var.d = false;
            W0(yw0Var, dx0Var, tf0Var, sf0Var);
            if (!sf0Var.b) {
                int i5 = tf0Var.b;
                int i6 = sf0Var.a;
                tf0Var.b = (tf0Var.f * i6) + i5;
                if (!sf0Var.c || tf0Var.k != null || !dx0Var.g) {
                    tf0Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = tf0Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    tf0Var.g = i8;
                    int i9 = tf0Var.c;
                    if (i9 < 0) {
                        tf0Var.g = i8 + i9;
                    }
                    Y0(yw0Var, tf0Var);
                }
                if (z && sf0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - tf0Var.c;
    }

    @Override // defpackage.rw0
    public final boolean K() {
        return true;
    }

    public final View K0(boolean z) {
        return this.u ? P0(0, v(), z) : P0(v() - 1, -1, z);
    }

    @Override // defpackage.rw0
    public final boolean L() {
        return this.t;
    }

    public final View L0(boolean z) {
        return this.u ? P0(v() - 1, -1, z) : P0(0, v(), z);
    }

    public final int M0() {
        View viewP0 = P0(0, v(), false);
        if (viewP0 == null) {
            return -1;
        }
        return rw0.G(viewP0);
    }

    public final int N0() {
        View viewP0 = P0(v() - 1, -1, false);
        if (viewP0 == null) {
            return -1;
        }
        return rw0.G(viewP0);
    }

    public final View O0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.i(i, i2, i3, i4) : this.d.i(i, i2, i3, i4);
    }

    public final View P0(int i, int i2, boolean z) {
        I0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.i(i, i2, i3, 320) : this.d.i(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View Q0(yw0 yw0Var, dx0 dx0Var, boolean z, boolean z2) {
        int i;
        int iV;
        int i2;
        I0();
        int iV2 = v();
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
            i2 = 1;
        }
        int iB = dx0Var.b();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iG2 = rw0.G(viewU);
            int iE = this.r.e(viewU);
            int iB2 = this.r.b(viewU);
            if (iG2 >= 0 && iG2 < iB) {
                if (!((sw0) viewU.getLayoutParams()).a.i()) {
                    boolean z3 = iB2 <= iK && iE < iK;
                    boolean z4 = iE >= iG && iB2 > iG;
                    if (!z3 && !z4) {
                        return viewU;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z3) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int R0(int i, yw0 yw0Var, dx0 dx0Var, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -b1(-iG2, yw0Var, dx0Var);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(iG);
        return iG + i2;
    }

    public final int S0(int i, yw0 yw0Var, dx0 dx0Var, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -b1(iK2, yw0Var, dx0Var);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-iK);
        return i2 - iK;
    }

    @Override // defpackage.rw0
    public View T(View view, int i, yw0 yw0Var, dx0 dx0Var) {
        int iH0;
        View viewO0;
        a1();
        if (v() != 0 && (iH0 = H0(i)) != Integer.MIN_VALUE) {
            I0();
            e1(iH0, (int) (this.r.l() * 0.33333334f), false, dx0Var);
            tf0 tf0Var = this.q;
            tf0Var.g = Integer.MIN_VALUE;
            tf0Var.a = false;
            J0(yw0Var, tf0Var, dx0Var, true);
            boolean z = this.u;
            if (iH0 == -1) {
                viewO0 = z ? O0(v() - 1, -1) : O0(0, v());
            } else {
                viewO0 = z ? O0(0, v()) : O0(v() - 1, -1);
            }
            View viewU0 = iH0 == -1 ? U0() : T0();
            if (!viewU0.hasFocusable()) {
                return viewO0;
            }
            if (viewO0 != null) {
                return viewU0;
            }
        }
        return null;
    }

    public final View T0() {
        return u(this.u ? 0 : v() - 1);
    }

    @Override // defpackage.rw0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(M0());
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // defpackage.rw0
    public void V(yw0 yw0Var, dx0 dx0Var, w3 w3Var) {
        super.V(yw0Var, dx0Var, w3Var);
        iw0 iw0Var = this.b.o;
        if (iw0Var == null || iw0Var.a() <= 0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        w3Var.b(q3.k);
    }

    public final boolean V0() {
        return this.b.getLayoutDirection() == 1;
    }

    public void W0(yw0 yw0Var, dx0 dx0Var, tf0 tf0Var, sf0 sf0Var) {
        int iD;
        int i;
        int i2;
        int iD2;
        int iD3;
        View viewB = tf0Var.b(yw0Var);
        if (viewB == null) {
            sf0Var.b = true;
            return;
        }
        sw0 sw0Var = (sw0) viewB.getLayoutParams();
        List list = tf0Var.k;
        boolean z = this.u;
        int i3 = tf0Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        sw0 sw0Var2 = (sw0) viewB.getLayoutParams();
        Rect rectN = this.b.N(viewB);
        int i4 = rectN.left + rectN.right;
        int i5 = rectN.top + rectN.bottom;
        int iW = rw0.w(d(), this.n, this.l, E() + D() + ((ViewGroup.MarginLayoutParams) sw0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) sw0Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) sw0Var2).width);
        int iW2 = rw0.w(e(), this.o, this.m, C() + F() + ((ViewGroup.MarginLayoutParams) sw0Var2).topMargin + ((ViewGroup.MarginLayoutParams) sw0Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) sw0Var2).height);
        if (x0(viewB, iW, iW2, sw0Var2)) {
            viewB.measure(iW, iW2);
        }
        sf0Var.a = this.r.c(viewB);
        if (this.p == 1) {
            if (V0()) {
                iD2 = this.n - E();
                iD3 = iD2 - this.r.d(viewB);
            } else {
                iD3 = D();
                iD2 = this.r.d(viewB) + iD3;
            }
            int i6 = tf0Var.f;
            i2 = tf0Var.b;
            int i7 = sf0Var.a;
            if (i6 == -1) {
                int i8 = iD3;
                iD = i2;
                i2 -= i7;
                i = i8;
            } else {
                i = iD3;
                iD = i7 + i2;
            }
        } else {
            int iF = F();
            iD = this.r.d(viewB) + iF;
            int i9 = tf0Var.f;
            int i10 = tf0Var.b;
            int i11 = sf0Var.a;
            if (i9 == -1) {
                i = i10 - i11;
                iD2 = i10;
                i2 = iF;
            } else {
                int i12 = i10 + i11;
                i = i10;
                i2 = iF;
                iD2 = i12;
            }
        }
        rw0.N(viewB, i, i2, iD2, iD);
        if (sw0Var.a.i() || sw0Var.a.l()) {
            sf0Var.c = true;
        }
        sf0Var.d = viewB.hasFocusable();
    }

    public final void Y0(yw0 yw0Var, tf0 tf0Var) {
        if (!tf0Var.a || tf0Var.l) {
            return;
        }
        int i = tf0Var.g;
        int i2 = tf0Var.i;
        if (tf0Var.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.n(viewU) < iF) {
                        Z0(yw0Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.n(viewU2) < iF) {
                    Z0(yw0Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.m(viewU3) > i6) {
                    Z0(yw0Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.m(viewU4) > i6) {
                Z0(yw0Var, i8, i9);
                return;
            }
        }
    }

    public final void Z0(yw0 yw0Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                m0(i);
                yw0Var.m(viewU);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewU2 = u(i3);
            m0(i3);
            yw0Var.m(viewU2);
        }
    }

    @Override // defpackage.cx0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < rw0.G(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1() {
        if (this.p == 1 || !V0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int b1(int i, yw0 yw0Var, dx0 dx0Var) {
        if (v() != 0 && i != 0) {
            I0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            e1(i2, iAbs, true, dx0Var);
            tf0 tf0Var = this.q;
            int iJ0 = J0(yw0Var, tf0Var, dx0Var, false) + tf0Var.g;
            if (iJ0 >= 0) {
                if (iAbs > iJ0) {
                    i = i2 * iJ0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.rw0
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final void c1(int i) {
        if (i != 0 && i != 1) {
            id.q(gr0.e(i, "invalid orientation:"));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            ow owVarA = ow.a(this, i);
            this.r = owVarA;
            this.A.a = owVarA;
            this.p = i;
            o0();
        }
    }

    @Override // defpackage.rw0
    public final boolean d() {
        return this.p == 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x022e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0235  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x023a  */
    /* JADX WARN: Code duplicated, block: B:141:0x023e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0242  */
    /* JADX WARN: Code duplicated, block: B:145:0x0249  */
    /* JADX WARN: Code duplicated, block: B:146:0x024f  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.rw0
    public void d0(yw0 yw0Var, dx0 dx0Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewQ0;
        boolean z3;
        ow owVar;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z4;
        boolean z5;
        ow owVar2;
        int iL;
        sw0 sw0Var;
        int i;
        int iE2;
        int i2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iR0;
        int i7;
        View viewQ;
        int iE3;
        int iG2;
        int i8;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && dx0Var.b() == 0) {
            j0(yw0Var);
            return;
        }
        uf0 uf0Var = this.z;
        if (uf0Var != null && (i8 = uf0Var.c) >= 0) {
            this.x = i8;
        }
        I0();
        this.q.a = false;
        a1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
            focusedChild = null;
        }
        rf0 rf0Var = this.A;
        if (!rf0Var.e || this.x != -1 || this.z != null) {
            rf0Var.c();
            rf0Var.d = this.u ^ this.v;
            if (dx0Var.g || (i = this.x) == -1) {
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        sw0Var = (sw0) focusedChild2.getLayoutParams();
                        if (!sw0Var.a.i() || sw0Var.a.c() < 0 || sw0Var.a.c() >= dx0Var.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewQ0 = Q0(yw0Var, dx0Var, rf0Var.d, z2)) == null) {
                                rf0Var.a();
                                if (this.v) {
                                    iB = dx0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                rf0Var.b = iB;
                            } else {
                                int iG3 = rw0.G(viewQ0);
                                z3 = rf0Var.d;
                                owVar = rf0Var.a;
                                if (z3) {
                                    int iB3 = owVar.b(viewQ0);
                                    owVar2 = rf0Var.a;
                                    if (Integer.MIN_VALUE == owVar2.a) {
                                        iL = 0;
                                    } else {
                                        iL = owVar2.l() - owVar2.a;
                                    }
                                    rf0Var.c = iL + iB3;
                                } else {
                                    rf0Var.c = owVar.e(viewQ0);
                                }
                                rf0Var.b = iG3;
                                if (!dx0Var.g && C0()) {
                                    iE = this.r.e(viewQ0);
                                    iB2 = this.r.b(viewQ0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (rf0Var.d) {
                                            iK = iG;
                                        }
                                        rf0Var.c = iK;
                                    }
                                }
                            }
                        } else {
                            rf0Var.b(focusedChild2, rw0.G(focusedChild2));
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            rf0Var.a();
                            if (this.v) {
                                iB = dx0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            rf0Var.b = iB;
                        } else {
                            int iG4 = rw0.G(viewQ0);
                            z3 = rf0Var.d;
                            owVar = rf0Var.a;
                            if (z3) {
                                int iB4 = owVar.b(viewQ0);
                                owVar2 = rf0Var.a;
                                if (Integer.MIN_VALUE == owVar2.a) {
                                    iL = 0;
                                } else {
                                    iL = owVar2.l() - owVar2.a;
                                }
                                rf0Var.c = iL + iB4;
                            } else {
                                rf0Var.c = owVar.e(viewQ0);
                            }
                            rf0Var.b = iG4;
                            if (!dx0Var.g) {
                                iE = this.r.e(viewQ0);
                                iB2 = this.r.b(viewQ0);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iE >= iG) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (rf0Var.d) {
                                        iK = iG;
                                    }
                                    rf0Var.c = iK;
                                } else {
                                    if (rf0Var.d) {
                                        iK = iG;
                                    }
                                    rf0Var.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    rf0Var.a();
                    if (this.v) {
                        iB = dx0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    rf0Var.b = iB;
                }
            } else if (i < 0 || i >= dx0Var.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        sw0Var = (sw0) focusedChild2.getLayoutParams();
                        if (sw0Var.a.i()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                rf0Var.a();
                                if (this.v) {
                                    iB = dx0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                rf0Var.b = iB;
                            } else {
                                int iG5 = rw0.G(viewQ0);
                                z3 = rf0Var.d;
                                owVar = rf0Var.a;
                                if (z3) {
                                    int iB5 = owVar.b(viewQ0);
                                    owVar2 = rf0Var.a;
                                    if (Integer.MIN_VALUE == owVar2.a) {
                                        iL = 0;
                                    } else {
                                        iL = owVar2.l() - owVar2.a;
                                    }
                                    rf0Var.c = iL + iB5;
                                } else {
                                    rf0Var.c = owVar.e(viewQ0);
                                }
                                rf0Var.b = iG5;
                                if (!dx0Var.g) {
                                    iE = this.r.e(viewQ0);
                                    iB2 = this.r.b(viewQ0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iE >= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (rf0Var.d) {
                                            iK = iG;
                                        }
                                        rf0Var.c = iK;
                                    } else {
                                        if (rf0Var.d) {
                                            iK = iG;
                                        }
                                        rf0Var.c = iK;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                rf0Var.a();
                                if (this.v) {
                                    iB = dx0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                rf0Var.b = iB;
                            } else {
                                int iG6 = rw0.G(viewQ0);
                                z3 = rf0Var.d;
                                owVar = rf0Var.a;
                                if (z3) {
                                    int iB6 = owVar.b(viewQ0);
                                    owVar2 = rf0Var.a;
                                    if (Integer.MIN_VALUE == owVar2.a) {
                                        iL = 0;
                                    } else {
                                        iL = owVar2.l() - owVar2.a;
                                    }
                                    rf0Var.c = iL + iB6;
                                } else {
                                    rf0Var.c = owVar.e(viewQ0);
                                }
                                rf0Var.b = iG6;
                                if (!dx0Var.g) {
                                    iE = this.r.e(viewQ0);
                                    iB2 = this.r.b(viewQ0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iE >= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (rf0Var.d) {
                                            iK = iG;
                                        }
                                        rf0Var.c = iK;
                                    } else {
                                        if (rf0Var.d) {
                                            iK = iG;
                                        }
                                        rf0Var.c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            rf0Var.a();
                            if (this.v) {
                                iB = dx0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            rf0Var.b = iB;
                        } else {
                            int iG7 = rw0.G(viewQ0);
                            z3 = rf0Var.d;
                            owVar = rf0Var.a;
                            if (z3) {
                                int iB7 = owVar.b(viewQ0);
                                owVar2 = rf0Var.a;
                                if (Integer.MIN_VALUE == owVar2.a) {
                                    iL = 0;
                                } else {
                                    iL = owVar2.l() - owVar2.a;
                                }
                                rf0Var.c = iL + iB7;
                            } else {
                                rf0Var.c = owVar.e(viewQ0);
                            }
                            rf0Var.b = iG7;
                            if (!dx0Var.g) {
                                iE = this.r.e(viewQ0);
                                iB2 = this.r.b(viewQ0);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iE >= iG) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (rf0Var.d) {
                                        iK = iG;
                                    }
                                    rf0Var.c = iK;
                                } else {
                                    if (rf0Var.d) {
                                        iK = iG;
                                    }
                                    rf0Var.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    rf0Var.a();
                    if (this.v) {
                        iB = dx0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    rf0Var.b = iB;
                }
            } else {
                int i10 = this.x;
                rf0Var.b = i10;
                uf0 uf0Var2 = this.z;
                if (uf0Var2 != null && uf0Var2.c >= 0) {
                    boolean z6 = uf0Var2.e;
                    rf0Var.d = z6;
                    ow owVar3 = this.r;
                    if (z6) {
                        rf0Var.c = owVar3.g() - this.z.d;
                    } else {
                        rf0Var.c = owVar3.k() + this.z.d;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i10);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            rf0Var.d = (this.x < rw0.G(u(0))) == this.u;
                        }
                        rf0Var.a();
                    } else if (this.r.c(viewQ2) > this.r.l()) {
                        rf0Var.a();
                    } else {
                        int iE4 = this.r.e(viewQ2) - this.r.k();
                        ow owVar4 = this.r;
                        if (iE4 < 0) {
                            rf0Var.c = owVar4.k();
                            rf0Var.d = false;
                        } else if (owVar4.g() - this.r.b(viewQ2) < 0) {
                            rf0Var.c = this.r.g();
                            rf0Var.d = true;
                        } else {
                            boolean z7 = rf0Var.d;
                            ow owVar5 = this.r;
                            if (z7) {
                                int iB8 = owVar5.b(viewQ2);
                                ow owVar6 = this.r;
                                iE2 = (Integer.MIN_VALUE == owVar6.a ? 0 : owVar6.l() - owVar6.a) + iB8;
                            } else {
                                iE2 = owVar5.e(viewQ2);
                            }
                            rf0Var.c = iE2;
                        }
                    }
                } else {
                    boolean z8 = this.u;
                    rf0Var.d = z8;
                    ow owVar7 = this.r;
                    if (z8) {
                        rf0Var.c = owVar7.g() - this.y;
                    } else {
                        rf0Var.c = owVar7.k() + this.y;
                    }
                }
            }
            rf0Var.e = true;
        } else if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
            rf0Var.b(focusedChild, rw0.G(focusedChild));
        }
        tf0 tf0Var = this.q;
        tf0Var.f = tf0Var.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        int iL2 = dx0Var.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i2 = 0;
        } else {
            i2 = iL2;
            iL2 = 0;
        }
        iArr[0] = iL2;
        iArr[1] = i2;
        int iK2 = this.r.k() + Math.max(0, iL2);
        int iH = this.r.h() + Math.max(0, iArr[1]);
        if (dx0Var.g && (i7 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewQ = q(i7)) != null) {
            boolean z9 = this.u;
            ow owVar8 = this.r;
            if (z9) {
                iG2 = owVar8.g() - this.r.b(viewQ);
                iE3 = this.y;
            } else {
                iE3 = owVar8.e(viewQ) - this.r.k();
                iG2 = this.y;
            }
            int i11 = iG2 - iE3;
            if (i11 > 0) {
                iK2 += i11;
            } else {
                iH -= i11;
            }
        }
        boolean z10 = rf0Var.d;
        boolean z11 = this.u;
        if (!z10 ? !z11 : z11) {
            i9 = 1;
        }
        X0(yw0Var, dx0Var, rf0Var, i9);
        p(yw0Var);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z12 = rf0Var.d;
        int i12 = rf0Var.b;
        if (z12) {
            g1(i12, rf0Var.c);
            tf0 tf0Var2 = this.q;
            tf0Var2.h = iK2;
            J0(yw0Var, tf0Var2, dx0Var, false);
            tf0 tf0Var3 = this.q;
            i4 = tf0Var3.b;
            int i13 = tf0Var3.d;
            int i14 = tf0Var3.c;
            if (i14 > 0) {
                iH += i14;
            }
            f1(rf0Var.b, rf0Var.c);
            tf0 tf0Var4 = this.q;
            tf0Var4.h = iH;
            tf0Var4.d += tf0Var4.e;
            J0(yw0Var, tf0Var4, dx0Var, false);
            tf0 tf0Var5 = this.q;
            i3 = tf0Var5.b;
            int i15 = tf0Var5.c;
            if (i15 > 0) {
                g1(i13, i4);
                tf0 tf0Var6 = this.q;
                tf0Var6.h = i15;
                J0(yw0Var, tf0Var6, dx0Var, false);
                i4 = this.q.b;
            }
        } else {
            f1(i12, rf0Var.c);
            tf0 tf0Var7 = this.q;
            tf0Var7.h = iH;
            J0(yw0Var, tf0Var7, dx0Var, false);
            tf0 tf0Var8 = this.q;
            i3 = tf0Var8.b;
            int i16 = tf0Var8.d;
            int i17 = tf0Var8.c;
            if (i17 > 0) {
                iK2 += i17;
            }
            g1(rf0Var.b, rf0Var.c);
            tf0 tf0Var9 = this.q;
            tf0Var9.h = iK2;
            tf0Var9.d += tf0Var9.e;
            J0(yw0Var, tf0Var9, dx0Var, false);
            tf0 tf0Var10 = this.q;
            int i18 = tf0Var10.b;
            int i19 = tf0Var10.c;
            if (i19 > 0) {
                f1(i16, i3);
                tf0 tf0Var11 = this.q;
                tf0Var11.h = i19;
                J0(yw0Var, tf0Var11, dx0Var, false);
                i3 = this.q.b;
            }
            i4 = i18;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int iR1 = R0(i3, yw0Var, dx0Var, true);
                i5 = i4 + iR1;
                i6 = i3 + iR1;
                iR0 = S0(i5, yw0Var, dx0Var, false);
            } else {
                int iS0 = S0(i4, yw0Var, dx0Var, true);
                i5 = i4 + iS0;
                i6 = i3 + iS0;
                iR0 = R0(i6, yw0Var, dx0Var, false);
            }
            i4 = i5 + iR0;
            i3 = i6 + iR0;
        }
        if (dx0Var.k && v() != 0 && !dx0Var.g && C0()) {
            List list2 = (List) yw0Var.f;
            int size = list2.size();
            int iG8 = rw0.G(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                hx0 hx0Var = (hx0) list2.get(i20);
                boolean zI = hx0Var.i();
                View view = hx0Var.a;
                if (!zI) {
                    boolean z13 = hx0Var.c() < iG8;
                    boolean z14 = this.u;
                    ow owVar9 = this.r;
                    if (z13 != z14) {
                        iC += owVar9.c(view);
                    } else {
                        iC2 += owVar9.c(view);
                    }
                }
            }
            this.q.k = list2;
            if (iC > 0) {
                g1(rw0.G(U0()), i4);
                tf0 tf0Var12 = this.q;
                tf0Var12.h = iC;
                r4 = 0;
                tf0Var12.c = 0;
                tf0Var12.a(null);
                J0(yw0Var, this.q, dx0Var, false);
            } else {
                r4 = 0;
            }
            if (iC2 > 0) {
                f1(rw0.G(T0()), i3);
                tf0 tf0Var13 = this.q;
                tf0Var13.h = iC2;
                tf0Var13.c = r4;
                list = null;
                tf0Var13.a(null);
                J0(yw0Var, this.q, dx0Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (dx0Var.g) {
            rf0Var.c();
        } else {
            ow owVar10 = this.r;
            owVar10.a = owVar10.l();
        }
        this.s = this.v;
    }

    public void d1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        o0();
    }

    @Override // defpackage.rw0
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.rw0
    public void e0(dx0 dx0Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void e1(int i, int i2, boolean z, dx0 dx0Var) {
        int i3;
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        int iL = dx0Var.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i3 = 0;
        } else {
            i3 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i3;
        int iMax = Math.max(0, iL);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        tf0 tf0Var = this.q;
        int i4 = z2 ? iMax2 : iMax;
        tf0Var.h = i4;
        if (!z2) {
            iMax = iMax2;
        }
        tf0Var.i = iMax;
        if (z2) {
            tf0Var.h = this.r.h() + i4;
            View viewT0 = T0();
            tf0 tf0Var2 = this.q;
            tf0Var2.e = this.u ? -1 : 1;
            int iG = rw0.G(viewT0);
            tf0 tf0Var3 = this.q;
            tf0Var2.d = iG + tf0Var3.e;
            tf0Var3.b = this.r.b(viewT0);
            iK = this.r.b(viewT0) - this.r.g();
        } else {
            View viewU0 = U0();
            tf0 tf0Var4 = this.q;
            tf0Var4.h = this.r.k() + tf0Var4.h;
            tf0 tf0Var5 = this.q;
            tf0Var5.e = this.u ? 1 : -1;
            int iG2 = rw0.G(viewU0);
            tf0 tf0Var6 = this.q;
            tf0Var5.d = iG2 + tf0Var6.e;
            tf0Var6.b = this.r.e(viewU0);
            iK = (-this.r.e(viewU0)) + this.r.k();
        }
        tf0 tf0Var7 = this.q;
        tf0Var7.c = i2;
        if (z) {
            tf0Var7.c = i2 - iK;
        }
        tf0Var7.g = iK;
    }

    @Override // defpackage.rw0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof uf0) {
            uf0 uf0Var = (uf0) parcelable;
            this.z = uf0Var;
            if (this.x != -1) {
                uf0Var.c = -1;
            }
            o0();
        }
    }

    public final void f1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        tf0 tf0Var = this.q;
        tf0Var.e = this.u ? -1 : 1;
        tf0Var.d = i;
        tf0Var.f = 1;
        tf0Var.b = i2;
        tf0Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.rw0
    public final Parcelable g0() {
        uf0 uf0Var = this.z;
        if (uf0Var != null) {
            uf0 uf0Var2 = new uf0();
            uf0Var2.c = uf0Var.c;
            uf0Var2.d = uf0Var.d;
            uf0Var2.e = uf0Var.e;
            return uf0Var2;
        }
        uf0 uf0Var3 = new uf0();
        if (v() <= 0) {
            uf0Var3.c = -1;
            return uf0Var3;
        }
        I0();
        boolean z = this.s ^ this.u;
        uf0Var3.e = z;
        if (z) {
            View viewT0 = T0();
            uf0Var3.d = this.r.g() - this.r.b(viewT0);
            uf0Var3.c = rw0.G(viewT0);
            return uf0Var3;
        }
        View viewU0 = U0();
        uf0Var3.c = rw0.G(viewU0);
        uf0Var3.d = this.r.e(viewU0) - this.r.k();
        return uf0Var3;
    }

    public final void g1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        tf0 tf0Var = this.q;
        tf0Var.d = i;
        tf0Var.e = this.u ? 1 : -1;
        tf0Var.f = -1;
        tf0Var.b = i2;
        tf0Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.rw0
    public final void h(int i, int i2, dx0 dx0Var, p60 p60Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        e1(i > 0 ? 1 : -1, Math.abs(i), true, dx0Var);
        D0(dx0Var, this.q, p60Var);
    }

    @Override // defpackage.rw0
    public final void i(int i, p60 p60Var) {
        boolean z;
        int i2;
        uf0 uf0Var = this.z;
        if (uf0Var == null || (i2 = uf0Var.c) < 0) {
            a1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = uf0Var.e;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            p60Var.a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    @Override // defpackage.rw0
    public boolean i0(int i, Bundle bundle) {
        int iMin;
        uf0 uf0Var;
        if (super.i0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    RecyclerView recyclerView = this.b;
                    iMin = Math.min(i2, I(recyclerView.e, recyclerView.h0) - 1);
                    if (iMin >= 0) {
                        this.x = iMin;
                        this.y = 0;
                        uf0Var = this.z;
                        if (uf0Var != null) {
                            uf0Var.c = -1;
                        }
                        o0();
                        return true;
                    }
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView2 = this.b;
                    iMin = Math.min(i3, x(recyclerView2.e, recyclerView2.h0) - 1);
                    if (iMin >= 0) {
                        this.x = iMin;
                        this.y = 0;
                        uf0Var = this.z;
                        if (uf0Var != null) {
                            uf0Var.c = -1;
                        }
                        o0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.rw0
    public final int j(dx0 dx0Var) {
        return E0(dx0Var);
    }

    @Override // defpackage.rw0
    public int k(dx0 dx0Var) {
        return F0(dx0Var);
    }

    @Override // defpackage.rw0
    public int l(dx0 dx0Var) {
        return G0(dx0Var);
    }

    @Override // defpackage.rw0
    public final int m(dx0 dx0Var) {
        return E0(dx0Var);
    }

    @Override // defpackage.rw0
    public int n(dx0 dx0Var) {
        return F0(dx0Var);
    }

    @Override // defpackage.rw0
    public int o(dx0 dx0Var) {
        return G0(dx0Var);
    }

    @Override // defpackage.rw0
    public int p0(int i, yw0 yw0Var, dx0 dx0Var) {
        if (this.p == 1) {
            return 0;
        }
        return b1(i, yw0Var, dx0Var);
    }

    @Override // defpackage.rw0
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iG = i - rw0.G(u(0));
        if (iG >= 0 && iG < iV) {
            View viewU = u(iG);
            if (rw0.G(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.rw0
    public final void q0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        uf0 uf0Var = this.z;
        if (uf0Var != null) {
            uf0Var.c = -1;
        }
        o0();
    }

    @Override // defpackage.rw0
    public sw0 r() {
        return new sw0(-2, -2);
    }

    @Override // defpackage.rw0
    public int r0(int i, yw0 yw0Var, dx0 dx0Var) {
        if (this.p == 0) {
            return 0;
        }
        return b1(i, yw0Var, dx0Var);
    }

    @Override // defpackage.rw0
    public final boolean y0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rw0
    public final void S(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new rf0();
        this.B = new sf0();
        this.C = 2;
        this.D = new int[2];
        c1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        o0();
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void X0(yw0 yw0Var, dx0 dx0Var, rf0 rf0Var, int i) {
    }
}
