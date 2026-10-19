package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.dx0;
import defpackage.g70;
import defpackage.gr0;
import defpackage.h70;
import defpackage.hx0;
import defpackage.id;
import defpackage.iw0;
import defpackage.oe1;
import defpackage.p60;
import defpackage.q3;
import defpackage.rf0;
import defpackage.rw0;
import defpackage.sf0;
import defpackage.sw0;
import defpackage.tf0;
import defpackage.uf0;
import defpackage.v3;
import defpackage.w3;
import defpackage.yw0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final g70 K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new g70(0);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(rw0.H(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final boolean C0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(dx0 dx0Var, tf0 tf0Var, p60 p60Var) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = tf0Var.d) >= 0 && i < dx0Var.b() && i2 > 0; i3++) {
            p60Var.a(tf0Var.d, Math.max(0, tf0Var.g));
            this.K.getClass();
            i2--;
            tf0Var.d += tf0Var.e;
        }
    }

    @Override // defpackage.rw0
    public final int I(yw0 yw0Var, dx0 dx0Var) {
        if (this.p == 0) {
            return Math.min(this.F, B());
        }
        if (dx0Var.b() < 1) {
            return 0;
        }
        return o1(dx0Var.b() - 1, yw0Var, dx0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(yw0 yw0Var, dx0 dx0Var, boolean z, boolean z2) {
        int i;
        int iV;
        int iV2 = v();
        int i2 = 1;
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = dx0Var.b();
        I0();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iG2 = rw0.G(viewU);
            if (iG2 >= 0 && iG2 < iB && p1(iG2, yw0Var, dx0Var) == 0) {
                if (((sw0) viewU.getLayoutParams()).a.i()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r23, int r24, defpackage.yw0 r25, defpackage.dx0 r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, yw0, dx0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final void V(yw0 yw0Var, dx0 dx0Var, w3 w3Var) {
        super.V(yw0Var, dx0Var, w3Var);
        w3Var.j(GridView.class.getName());
        iw0 iw0Var = this.b.o;
        if (iw0Var == null || iw0Var.a() <= 1) {
            return;
        }
        w3Var.b(q3.n);
    }

    @Override // defpackage.rw0
    public final void W(yw0 yw0Var, dx0 dx0Var, View view, w3 w3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof h70)) {
            X(view, w3Var);
            return;
        }
        h70 h70Var = (h70) layoutParams;
        int iO1 = o1(h70Var.a.c(), yw0Var, dx0Var);
        int i = this.p;
        int i2 = h70Var.e;
        int i3 = h70Var.f;
        if (i == 0) {
            w3Var.k(v3.a(i2, i3, iO1, 1, false, false));
        } else {
            w3Var.k(v3.a(iO1, 1, i2, i3, false, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(yw0 yw0Var, dx0 dx0Var, tf0 tf0Var, sf0 sf0Var) {
        int i;
        int i2;
        int i3;
        int iD;
        int iD2;
        int iF;
        int iW;
        int iW2;
        ?? r12;
        int i4;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i5 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            t1();
        }
        boolean z2 = tf0Var.e == 1;
        int iP1 = this.F;
        if (!z2) {
            iP1 = p1(tf0Var.d, yw0Var, dx0Var) + q1(tf0Var.d, yw0Var, dx0Var);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = tf0Var.d) >= 0 && i4 < dx0Var.b() && iP1 > 0) {
            int i7 = tf0Var.d;
            int iQ1 = q1(i7, yw0Var, dx0Var);
            if (iQ1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i7 + " requires " + iQ1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            iP1 -= iQ1;
            if (iP1 < 0 || (viewB = tf0Var.b(yw0Var)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            sf0Var.b = true;
            return;
        }
        if (z2) {
            i2 = i6;
            i = 0;
            i3 = 1;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            h70 h70Var = (h70) view.getLayoutParams();
            int iQ2 = q1(rw0.G(view), yw0Var, dx0Var);
            h70Var.f = iQ2;
            h70Var.e = i8;
            i8 += iQ2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (tf0Var.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            r1(view2, iJ, r12);
            int iC = this.r.c(view2);
            if (iC > i9) {
                i9 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((h70) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            h1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                r1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i9) {
                    i9 = iC2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                h70 h70Var2 = (h70) view4.getLayoutParams();
                Rect rect2 = h70Var2.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) h70Var2).topMargin + ((ViewGroup.MarginLayoutParams) h70Var2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) h70Var2).leftMargin + ((ViewGroup.MarginLayoutParams) h70Var2).rightMargin;
                int iN1 = n1(h70Var2.e, h70Var2.f);
                if (this.p == 1) {
                    iW2 = rw0.w(false, iN1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) h70Var2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iW = rw0.w(false, iN1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) h70Var2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (z0(view4, iW2, iW, (sw0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        sf0Var.a = i9;
        int i15 = this.p;
        int i16 = tf0Var.f;
        int iD3 = tf0Var.b;
        if (i15 != 1) {
            if (i16 == -1) {
                iD2 = iD3 - i9;
                iD = iD3;
            } else {
                iD = iD3 + i9;
                iD2 = iD3;
            }
            iF = 0;
            iD3 = 0;
        } else if (i16 == -1) {
            iF = iD3 - i9;
            iD2 = 0;
            iD = 0;
        } else {
            iF = iD3;
            iD = 0;
            iD3 += i9;
            iD2 = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            h70 h70Var3 = (h70) view5.getLayoutParams();
            if (this.p != 1) {
                iF = F() + this.G[h70Var3.e];
                iD3 = this.r.d(view5) + iF;
            } else if (V0()) {
                int iD4 = D() + this.G[this.F - h70Var3.e];
                iD = iD4;
                iD2 = iD4 - this.r.d(view5);
            } else {
                iD2 = D() + this.G[h70Var3.e];
                iD = this.r.d(view5) + iD2;
            }
            rw0.N(view5, iD2, iF, iD, iD3);
            if (h70Var3.a.i() || h70Var3.a.l()) {
                sf0Var.c = true;
            }
            sf0Var.d = view5.hasFocusable() | sf0Var.d;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(yw0 yw0Var, dx0 dx0Var, rf0 rf0Var, int i) {
        t1();
        if (dx0Var.b() > 0 && !dx0Var.g) {
            boolean z = i == 1;
            int iP1 = p1(rf0Var.b, yw0Var, dx0Var);
            if (z) {
                while (iP1 > 0) {
                    int i2 = rf0Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rf0Var.b = i3;
                    iP1 = p1(i3, yw0Var, dx0Var);
                }
            } else {
                int iB = dx0Var.b() - 1;
                int i4 = rf0Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iP2 = p1(i5, yw0Var, dx0Var);
                    if (iP2 <= iP1) {
                        break;
                    }
                    i4 = i5;
                    iP1 = iP2;
                }
                rf0Var.b = i4;
            }
        }
        i1();
    }

    @Override // defpackage.rw0
    public final void Y(int i, int i2) {
        g70 g70Var = this.K;
        g70Var.b();
        g70Var.b.clear();
    }

    @Override // defpackage.rw0
    public final void Z() {
        g70 g70Var = this.K;
        g70Var.b();
        g70Var.b.clear();
    }

    @Override // defpackage.rw0
    public final void a0(int i, int i2) {
        g70 g70Var = this.K;
        g70Var.b();
        g70Var.b.clear();
    }

    @Override // defpackage.rw0
    public final void b0(int i, int i2) {
        g70 g70Var = this.K;
        g70Var.b();
        g70Var.b.clear();
    }

    @Override // defpackage.rw0
    public final void c0(int i, int i2) {
        g70 g70Var = this.K;
        g70Var.b();
        g70Var.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public void d0(yw0 yw0Var, dx0 dx0Var) {
        boolean z = dx0Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                h70 h70Var = (h70) u(i).getLayoutParams();
                int iC = h70Var.a.c();
                sparseIntArray2.put(iC, h70Var.f);
                sparseIntArray.put(iC, h70Var.e);
            }
        }
        super.d0(yw0Var, dx0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z) {
        if (z) {
            id.m("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.d1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final void e0(dx0 dx0Var) {
        View viewQ;
        super.e0(dx0Var);
        this.E = false;
        int i = this.M;
        if (i == -1 || (viewQ = q(i)) == null) {
            return;
        }
        viewQ.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // defpackage.rw0
    public final boolean f(sw0 sw0Var) {
        return sw0Var instanceof h70;
    }

    public final void h1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:126:0x01af A[EDGE_INSN: B:126:0x01af->B:170:0x0281 BREAK  A[LOOP:2: B:130:0x01bf->B:139:0x01e8]] */
    /* JADX WARN: Code duplicated, block: B:127:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e0 A[LOOP:3: B:133:0x01cd->B:138:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:147:0x021a  */
    /* JADX WARN: Code duplicated, block: B:149:0x021d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x022c  */
    /* JADX WARN: Code duplicated, block: B:157:0x023a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0248  */
    /* JADX WARN: Code duplicated, block: B:167:0x0267  */
    /* JADX WARN: Code duplicated, block: B:171:0x0283  */
    /* JADX WARN: Code duplicated, block: B:213:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[LOOP:4: B:141:0x01f3->B:218:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[LOOP:7: B:165:0x0261->B:228:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final boolean i0(int i, Bundle bundle) {
        View viewU;
        hx0 hx0VarL;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == q3.n.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= v()) {
                    viewU = null;
                    break;
                }
                View viewU2 = u(i5);
                Objects.requireNonNull(viewU2);
                if (viewU2.isAccessibilityFocused()) {
                    viewU = u(i5);
                    break;
                }
                i5++;
            }
            if (viewU != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i6)) && (hx0VarL = this.b.L(viewU)) != null) {
                    RecyclerView recyclerView = hx0VarL.r;
                    int iJ = recyclerView == null ? -1 : recyclerView.J(hx0VarL);
                    int iK1 = k1(iJ);
                    int iJ1 = j1(iJ);
                    if (iK1 >= 0 && iJ1 >= 0) {
                        if (!l1(iJ).contains(Integer.valueOf(this.N)) || !m1(j1(iJ), iJ).contains(Integer.valueOf(this.O))) {
                            this.N = iK1;
                            this.O = iJ1;
                        }
                        int i7 = this.N;
                        if (i7 == -1) {
                            i7 = iK1;
                        }
                        int i8 = this.O;
                        if (i8 != -1) {
                            iJ1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iJ - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iK2 = k1(iIntValue);
                                    int iJ2 = j1(iIntValue);
                                    if (iK2 >= 0 && iJ2 >= 0) {
                                        if (this.p != 1) {
                                            if (l1(iIntValue).contains(Integer.valueOf(i7)) && iJ2 < iJ1) {
                                                this.O = iJ2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iK2 == i7 && iJ2 < iJ1) || iK2 < i7) {
                                                this.N = iK2;
                                                this.O = iJ2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iK1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < B()) {
                                                    it2 = l1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iK1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break;
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                } else {
                                    if (iK1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < B()) {
                                                it4 = l1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iK1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = j1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                    iIntValue = -1;
                                    break;
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iJ - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iK3 = k1(iIntValue);
                                    int iJ3 = j1(iIntValue);
                                    if (iK3 >= 0 && iJ3 >= 0) {
                                        if (this.p != 1) {
                                            if (iK3 < i7 && iJ3 == iJ1) {
                                                this.N = ((Integer) Collections.max(l1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iK3 < i7 && m1(j1(iIntValue), iIntValue).contains(Integer.valueOf(iJ1))) {
                                                this.N = iK3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iK1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < B()) {
                                                    it2 = l1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iK1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break;
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                } else {
                                    if (iK1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < B()) {
                                                it4 = l1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iK1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = j1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                    iIntValue = -1;
                                    break;
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iJ + 1;
                            while (true) {
                                if (iIntValue < B()) {
                                    int iK4 = k1(iIntValue);
                                    int iJ4 = j1(iIntValue);
                                    if (iK4 >= 0 && iJ4 >= 0) {
                                        if (this.p != 1) {
                                            if (iJ4 > iJ1 && l1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.O = iJ4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iK4 == i7 && iJ4 > iJ1) || iK4 > i7) {
                                                this.N = iK4;
                                                this.O = iJ4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iK1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < B()) {
                                                    it2 = l1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iK1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break;
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                } else {
                                    if (iK1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < B()) {
                                                it4 = l1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iK1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = j1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                    iIntValue = -1;
                                    break;
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iJ + 1;
                            while (true) {
                                if (iIntValue < B()) {
                                    int iK5 = k1(iIntValue);
                                    int iJ5 = j1(iIntValue);
                                    if (iK5 >= 0 && iJ5 >= 0) {
                                        if (this.p != 1) {
                                            if (iK5 > i7 && iJ5 == iJ1) {
                                                this.N = k1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iK5 > i7 && (iJ5 == iJ1 || m1(j1(iIntValue), iIntValue).contains(Integer.valueOf(iJ1)))) {
                                                this.N = iK5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.p) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iK1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < B()) {
                                                it2 = l1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iK1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.N = iIntValue2;
                                                            this.O = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                } else {
                                    if (iK1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < B()) {
                                            it4 = l1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iK1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = iIntValue3;
                                                        this.O = j1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.i0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iA = this.b.o.a();
                int i11 = 0;
                while (true) {
                    if (i11 >= iA) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView2 = this.b;
                    int iP1 = p1(i11, recyclerView2.e, recyclerView2.h0);
                    RecyclerView recyclerView3 = this.b;
                    int iO1 = o1(i11, recyclerView3.e, recyclerView3.h0);
                    if (this.p != 1) {
                        if (iP1 == i9 && iO1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iP1 == i10 && iO1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    this.x = i11;
                    this.y = 0;
                    uf0 uf0Var = this.z;
                    if (uf0Var != null) {
                        uf0Var.c = -1;
                    }
                    o0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int j1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? o1(i, recyclerView.e, recyclerView.h0) : p1(i, recyclerView.e, recyclerView.h0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final int k(dx0 dx0Var) {
        return F0(dx0Var);
    }

    public final int k1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? o1(i, recyclerView.e, recyclerView.h0) : p1(i, recyclerView.e, recyclerView.h0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final int l(dx0 dx0Var) {
        return G0(dx0Var);
    }

    public final HashSet l1(int i) {
        return m1(k1(i), i);
    }

    public final HashSet m1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iQ1 = q1(i2, recyclerView.e, recyclerView.h0);
        for (int i3 = i; i3 < i + iQ1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final int n(dx0 dx0Var) {
        return F0(dx0Var);
    }

    public final int n1(int i, int i2) {
        if (this.p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final int o(dx0 dx0Var) {
        return G0(dx0Var);
    }

    public final int o1(int i, yw0 yw0Var, dx0 dx0Var) {
        boolean z = dx0Var.g;
        g70 g70Var = this.K;
        if (!z) {
            int i2 = this.F;
            g70Var.getClass();
            return g70.a(i, i2);
        }
        int iD = yw0Var.d(i);
        if (iD != -1) {
            int i3 = this.F;
            g70Var.getClass();
            return g70.a(iD, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final int p0(int i, yw0 yw0Var, dx0 dx0Var) {
        t1();
        i1();
        return super.p0(i, yw0Var, dx0Var);
    }

    public final int p1(int i, yw0 yw0Var, dx0 dx0Var) {
        boolean z = dx0Var.g;
        g70 g70Var = this.K;
        if (!z) {
            int i2 = this.F;
            g70Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iD = yw0Var.d(i);
        if (iD != -1) {
            int i4 = this.F;
            g70Var.getClass();
            return iD % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int q1(int i, yw0 yw0Var, dx0 dx0Var) {
        boolean z = dx0Var.g;
        g70 g70Var = this.K;
        if (!z) {
            g70Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (yw0Var.d(i) != -1) {
            g70Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final sw0 r() {
        return this.p == 0 ? new h70(-2, -1) : new h70(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final int r0(int i, yw0 yw0Var, dx0 dx0Var) {
        t1();
        i1();
        return super.r0(i, yw0Var, dx0Var);
    }

    public final void r1(View view, int i, boolean z) {
        int iW;
        int iW2;
        h70 h70Var = (h70) view.getLayoutParams();
        Rect rect = h70Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) h70Var).topMargin + ((ViewGroup.MarginLayoutParams) h70Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) h70Var).leftMargin + ((ViewGroup.MarginLayoutParams) h70Var).rightMargin;
        int iN1 = n1(h70Var.e, h70Var.f);
        if (this.p == 1) {
            iW2 = rw0.w(false, iN1, i, i3, ((ViewGroup.MarginLayoutParams) h70Var).width);
            iW = rw0.w(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) h70Var).height);
        } else {
            int iW3 = rw0.w(false, iN1, i, i2, ((ViewGroup.MarginLayoutParams) h70Var).height);
            int iW4 = rw0.w(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) h70Var).width);
            iW = iW3;
            iW2 = iW4;
        }
        sw0 sw0Var = (sw0) view.getLayoutParams();
        if (z ? z0(view, iW2, iW, sw0Var) : x0(view, iW2, iW, sw0Var)) {
            view.measure(iW2, iW);
        }
    }

    @Override // defpackage.rw0
    public final sw0 s(Context context, AttributeSet attributeSet) {
        h70 h70Var = new h70(context, attributeSet);
        h70Var.e = -1;
        h70Var.f = 0;
        return h70Var;
    }

    public final void s1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            id.q(gr0.e(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i;
        this.K.b();
        o0();
    }

    @Override // defpackage.rw0
    public final sw0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            h70 h70Var = new h70((ViewGroup.MarginLayoutParams) layoutParams);
            h70Var.e = -1;
            h70Var.f = 0;
            return h70Var;
        }
        h70 h70Var2 = new h70(layoutParams);
        h70Var2.e = -1;
        h70Var2.f = 0;
        return h70Var2;
    }

    public final void t1() {
        int iC;
        int iF;
        if (this.p == 1) {
            iC = this.n - E();
            iF = D();
        } else {
            iC = this.o - C();
            iF = F();
        }
        h1(iC - iF);
    }

    @Override // defpackage.rw0
    public final void u0(int i, int i2, Rect rect) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.u0(i, i2, rect);
        }
        int iE = E() + D();
        int iC = C() + F();
        if (this.p == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = oe1.a;
            iG2 = rw0.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = rw0.g(i, iArr[iArr.length - 1] + iE, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = oe1.a;
            iG = rw0.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = rw0.g(i2, iArr2[iArr2.length - 1] + iC, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.rw0
    public final int x(yw0 yw0Var, dx0 dx0Var) {
        if (this.p == 1) {
            return Math.min(this.F, B());
        }
        if (dx0Var.b() < 1) {
            return 0;
        }
        return o1(dx0Var.b() - 1, yw0Var, dx0Var) + 1;
    }

    public GridLayoutManager(Context context) {
        super(context, 1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new g70(0);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(1);
    }
}
