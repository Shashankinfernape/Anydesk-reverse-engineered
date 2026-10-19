package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.bc0;
import defpackage.cx0;
import defpackage.dx0;
import defpackage.id;
import defpackage.oe1;
import defpackage.ow;
import defpackage.p60;
import defpackage.qw0;
import defpackage.re0;
import defpackage.rw0;
import defpackage.sw0;
import defpackage.th1;
import defpackage.u61;
import defpackage.ui0;
import defpackage.v3;
import defpackage.v61;
import defpackage.w3;
import defpackage.w61;
import defpackage.wf0;
import defpackage.x61;
import defpackage.yh0;
import defpackage.yw0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends rw0 implements cx0 {
    public final ui0 B;
    public final int C;
    public boolean D;
    public boolean E;
    public x61 F;
    public final Rect G;
    public final u61 H;
    public final boolean I;
    public int[] J;
    public final bc0 K;
    public final int p;
    public final yh0[] q;
    public final ow r;
    public final ow s;
    public final int t;
    public int u;
    public final re0 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        ui0 ui0Var = new ui0(12, false);
        this.B = ui0Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new u61(this);
        this.I = true;
        this.K = new bc0(18, this);
        qw0 qw0VarH = rw0.H(context, attributeSet, i, i2);
        int i3 = qw0VarH.a;
        if (i3 != 0 && i3 != 1) {
            id.q("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            ow owVar = this.r;
            this.r = this.s;
            this.s = owVar;
            o0();
        }
        int i4 = qw0VarH.b;
        c(null);
        if (i4 != this.p) {
            ui0Var.e();
            o0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new yh0[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new yh0(this, i5);
            }
            o0();
        }
        boolean z = qw0VarH.c;
        c(null);
        x61 x61Var = this.F;
        if (x61Var != null && x61Var.j != z) {
            x61Var.j = z;
        }
        this.w = z;
        o0();
        re0 re0Var = new re0();
        re0Var.a = true;
        re0Var.f = 0;
        re0Var.g = 0;
        this.v = re0Var;
        this.r = ow.a(this, this.t);
        this.s = ow.a(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.rw0
    public final void A0(RecyclerView recyclerView, int i) {
        wf0 wf0Var = new wf0(recyclerView.getContext());
        wf0Var.a = i;
        B0(wf0Var);
    }

    @Override // defpackage.rw0
    public final boolean C0() {
        return this.F == null;
    }

    public final boolean D0() {
        int iK0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iK0 = L0();
                K0();
            } else {
                iK0 = K0();
                L0();
            }
            if (iK0 == 0 && P0() != null) {
                this.B.e();
                this.f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return th1.l(dx0Var, this.r, H0(z), G0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int F0(yw0 yw0Var, re0 re0Var, dx0 dx0Var) {
        int i;
        yh0[] yh0VarArr;
        int iM0;
        BitSet bitSet;
        yh0[] yh0VarArr2;
        yh0 yh0Var;
        ?? r5;
        int i2;
        int iC;
        int iC2;
        int iG;
        BitSet bitSet2;
        int i3;
        int i4;
        yw0 yw0Var2 = yw0Var;
        BitSet bitSet3 = this.y;
        int i5 = this.p;
        bitSet3.set(0, i5, true);
        re0 re0Var2 = this.v;
        if (re0Var2.i) {
            i = re0Var.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = re0Var.e == 1 ? re0Var.g + re0Var.b : re0Var.f - re0Var.b;
        }
        int i6 = re0Var.e;
        int i7 = 0;
        while (true) {
            yh0VarArr = this.q;
            if (i7 >= i5) {
                break;
            }
            if (!((ArrayList) yh0VarArr[i7].f).isEmpty()) {
                c1(yh0VarArr[i7], i6, i);
            }
            i7++;
        }
        boolean z = this.x;
        ow owVar = this.r;
        int iG2 = z ? owVar.g() : owVar.k();
        boolean z2 = false;
        while (true) {
            int i8 = re0Var.c;
            if (i8 < 0 || i8 >= dx0Var.b() || (!re0Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View view = yw0Var2.q(re0Var.c, Long.MAX_VALUE).a;
            re0Var.c += re0Var.d;
            v61 v61Var = (v61) view.getLayoutParams();
            int iC3 = v61Var.a.c();
            ui0 ui0Var = this.B;
            int[] iArr = (int[]) ui0Var.e;
            int i9 = (iArr == null || iC3 >= iArr.length) ? -1 : iArr[iC3];
            if (i9 == -1) {
                if (T0(re0Var.e)) {
                    i4 = i5 - 1;
                    i5 = -1;
                    i3 = -1;
                } else {
                    i3 = 1;
                    i4 = 0;
                }
                yh0 yh0Var2 = null;
                int i10 = i3;
                if (re0Var.e == 1) {
                    int iK = owVar.k();
                    yh0VarArr2 = yh0VarArr;
                    int i11 = i4;
                    int i12 = Integer.MAX_VALUE;
                    while (i11 != i5) {
                        int i13 = i11;
                        yh0 yh0Var3 = yh0VarArr2[i13];
                        BitSet bitSet4 = bitSet3;
                        int iG3 = yh0Var3.g(iK);
                        if (iG3 < i12) {
                            i12 = iG3;
                            yh0Var2 = yh0Var3;
                        }
                        i11 = i13 + i10;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    yh0VarArr2 = yh0VarArr;
                    int iG4 = owVar.g();
                    int i14 = i4;
                    int i15 = Integer.MIN_VALUE;
                    while (i14 != i5) {
                        yh0 yh0Var4 = yh0VarArr2[i14];
                        int i16 = i5;
                        int i17 = yh0Var4.i(iG4);
                        if (i17 > i15) {
                            i15 = i17;
                            yh0Var2 = yh0Var4;
                        }
                        i14 += i10;
                        i5 = i16;
                    }
                }
                yh0Var = yh0Var2;
                ui0Var.h(iC3);
                ((int[]) ui0Var.e)[iC3] = yh0Var.e;
            } else {
                bitSet = bitSet3;
                i5 = i5;
                yh0VarArr2 = yh0VarArr;
                yh0Var = yh0VarArr2[i9];
            }
            v61Var.e = yh0Var;
            if (re0Var.e == 1) {
                r5 = 0;
                b(view, -1, false);
            } else {
                r5 = 0;
                b(view, 0, false);
            }
            int i18 = this.t;
            if (i18 == 1) {
                R0(view, rw0.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) v61Var).width), rw0.w(true, this.o, this.m, C() + F(), ((ViewGroup.MarginLayoutParams) v61Var).height));
            } else {
                R0(view, rw0.w(true, this.n, this.l, E() + D(), ((ViewGroup.MarginLayoutParams) v61Var).width), rw0.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) v61Var).height));
            }
            if (re0Var.e == 1) {
                iC = yh0Var.g(iG2);
                i2 = owVar.c(view) + iC;
            } else {
                i2 = yh0Var.i(iG2);
                iC = i2 - owVar.c(view);
            }
            int i19 = re0Var.e;
            yh0 yh0Var5 = v61Var.e;
            if (i19 == 1) {
                yh0Var5.getClass();
                v61 v61Var2 = (v61) view.getLayoutParams();
                v61Var2.e = yh0Var5;
                ArrayList arrayList = (ArrayList) yh0Var5.f;
                arrayList.add(view);
                yh0Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    yh0Var5.b = Integer.MIN_VALUE;
                }
                if (v61Var2.a.i() || v61Var2.a.l()) {
                    yh0Var5.d = ((StaggeredGridLayoutManager) yh0Var5.g).r.c(view) + yh0Var5.d;
                }
            } else {
                yh0Var5.getClass();
                v61 v61Var3 = (v61) view.getLayoutParams();
                v61Var3.e = yh0Var5;
                ArrayList arrayList2 = (ArrayList) yh0Var5.f;
                arrayList2.add(0, view);
                yh0Var5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    yh0Var5.c = Integer.MIN_VALUE;
                }
                if (v61Var3.a.i() || v61Var3.a.l()) {
                    yh0Var5.d = ((StaggeredGridLayoutManager) yh0Var5.g).r.c(view) + yh0Var5.d;
                }
            }
            boolean zQ0 = Q0();
            ow owVar2 = this.s;
            if (zQ0 && i18 == 1) {
                iG = owVar2.g() - (((i5 - 1) - yh0Var.e) * this.u);
                iC2 = iG - owVar2.c(view);
            } else {
                int iK2 = (yh0Var.e * this.u) + owVar2.k();
                int iC4 = owVar2.c(view) + iK2;
                iC2 = iK2;
                iG = iC4;
            }
            z2 = true;
            if (i18 == 1) {
                rw0.N(view, iC2, iC, iG, i2);
            } else {
                rw0.N(view, iC, iC2, i2, iG);
            }
            c1(yh0Var, re0Var2.e, i);
            yw0Var2 = yw0Var;
            V0(yw0Var2, re0Var2);
            if (re0Var2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(yh0Var.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i5 = i5;
            yh0VarArr = yh0VarArr2;
        }
        if (!z2) {
            V0(yw0Var2, re0Var2);
        }
        if (re0Var2.e == -1) {
            iM0 = owVar.k() - N0(owVar.k());
        } else {
            iM0 = M0(owVar.g()) - owVar.g();
        }
        if (iM0 > 0) {
            return Math.min(re0Var.b, iM0);
        }
        return 0;
    }

    public final View G0(boolean z) {
        ow owVar = this.r;
        int iK = owVar.k();
        int iG = owVar.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = owVar.e(viewU);
            int iB = owVar.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z) {
        ow owVar = this.r;
        int iK = owVar.k();
        int iG = owVar.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = owVar.e(viewU);
            if (owVar.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    @Override // defpackage.rw0
    public final int I(yw0 yw0Var, dx0 dx0Var) {
        if (this.t == 0) {
            return Math.min(this.p, dx0Var.b());
        }
        return -1;
    }

    public final void I0(yw0 yw0Var, dx0 dx0Var, boolean z) {
        int iG;
        int iM0 = M0(Integer.MIN_VALUE);
        if (iM0 != Integer.MIN_VALUE && (iG = this.r.g() - iM0) > 0) {
            int i = iG - (-Z0(-iG, yw0Var, dx0Var));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void J0(yw0 yw0Var, dx0 dx0Var, boolean z) {
        int iK;
        int iN0 = N0(Integer.MAX_VALUE);
        if (iN0 != Integer.MAX_VALUE && (iK = iN0 - this.r.k()) > 0) {
            int iZ0 = iK - Z0(iK, yw0Var, dx0Var);
            if (!z || iZ0 <= 0) {
                return;
            }
            this.r.o(-iZ0);
        }
    }

    @Override // defpackage.rw0
    public final boolean K() {
        return this.C != 0;
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return rw0.G(u(0));
    }

    @Override // defpackage.rw0
    public final boolean L() {
        return this.w;
    }

    public final int L0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return rw0.G(u(iV - 1));
    }

    public final int M0(int i) {
        int iG = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iG2 = this.q[i2].g(i);
            if (iG2 > iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    public final int N0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // defpackage.rw0
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            yh0 yh0Var = this.q[i2];
            int i3 = yh0Var.b;
            if (i3 != Integer.MIN_VALUE) {
                yh0Var.b = i3 + i;
            }
            int i4 = yh0Var.c;
            if (i4 != Integer.MIN_VALUE) {
                yh0Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[LOOP:0: B:23:0x003c->B:27:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:1: B:32:0x0063->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0051 A[EDGE_INSN: B:62:0x0051->B:29:0x0051 BREAK  A[LOOP:0: B:23:0x003c->B:27:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EDGE_INSN: B:64:0x0078->B:38:0x0078 BREAK  A[LOOP:1: B:32:0x0063->B:36:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void O0(int i, int i2, int i3) {
        int i4;
        int i5;
        ui0 ui0Var;
        int[] iArr;
        int iL0;
        ArrayList arrayList;
        int size;
        w61 w61Var;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iL1 = this.x ? L0() : K0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            ui0Var = this.B;
            iArr = (int[]) ui0Var.e;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) ui0Var.d;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            w61Var = null;
                            break;
                        }
                        w61Var = (w61) ((ArrayList) ui0Var.d).get(size);
                        if (w61Var.c == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (w61Var != null) {
                        ((ArrayList) ui0Var.d).remove(w61Var);
                    }
                    size2 = ((ArrayList) ui0Var.d).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((w61) ((ArrayList) ui0Var.d).get(i6)).c >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        w61 w61Var2 = (w61) ((ArrayList) ui0Var.d).get(i6);
                        ((ArrayList) ui0Var.d).remove(i6);
                        i7 = w61Var2.c;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = (int[]) ui0Var.e;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) ui0Var.e).length;
                } else {
                    Arrays.fill((int[]) ui0Var.e, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                ui0Var.m(i, i2);
            } else if (i3 != 2) {
                ui0Var.n(i, i2);
            } else if (i3 == 8) {
                ui0Var.n(i, 1);
                ui0Var.m(i2, 1);
            }
            if (i4 <= iL1) {
                return;
            }
            if (this.x) {
                iL0 = K0();
            } else {
                iL0 = L0();
            }
            if (i5 <= iL0) {
                o0();
            }
        }
        i4 = i + i2;
        i5 = i;
        ui0Var = this.B;
        iArr = (int[]) ui0Var.e;
        if (iArr != null) {
            arrayList = (ArrayList) ui0Var.d;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        w61Var = null;
                        break;
                    }
                    w61Var = (w61) ((ArrayList) ui0Var.d).get(size);
                    if (w61Var.c == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (w61Var != null) {
                    ((ArrayList) ui0Var.d).remove(w61Var);
                }
                size2 = ((ArrayList) ui0Var.d).size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((w61) ((ArrayList) ui0Var.d).get(i6)).c >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    w61 w61Var3 = (w61) ((ArrayList) ui0Var.d).get(i6);
                    ((ArrayList) ui0Var.d).remove(i6);
                    i7 = w61Var3.c;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = (int[]) ui0Var.e;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) ui0Var.e).length;
            } else {
                Arrays.fill((int[]) ui0Var.e, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            ui0Var.m(i, i2);
        } else if (i3 != 2) {
            ui0Var.n(i, i2);
        } else if (i3 == 8) {
            ui0Var.n(i, 1);
            ui0Var.m(i2, 1);
        }
        if (i4 <= iL1) {
            return;
        }
        if (this.x) {
            iL0 = K0();
        } else {
            iL0 = L0();
        }
        if (i5 <= iL0) {
            o0();
        }
    }

    @Override // defpackage.rw0
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            yh0 yh0Var = this.q[i2];
            int i3 = yh0Var.b;
            if (i3 != Integer.MIN_VALUE) {
                yh0Var.b = i3 + i;
            }
            int i4 = yh0Var.c;
            if (i4 != Integer.MIN_VALUE) {
                yh0Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View P0() {
        boolean z;
        boolean z2;
        int iV = v();
        int i = iV - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.t == 1 && Q0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iV = -1;
        } else {
            i = 0;
        }
        int i3 = i < iV ? 1 : -1;
        while (i != iV) {
            View viewU = u(i);
            v61 v61Var = (v61) viewU.getLayoutParams();
            boolean z3 = bitSet.get(v61Var.e.e);
            ow owVar = this.r;
            if (z3) {
                yh0 yh0Var = v61Var.e;
                if (this.x) {
                    int i4 = yh0Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        yh0Var.a();
                        i4 = yh0Var.c;
                    }
                    if (i4 < owVar.g()) {
                        ArrayList arrayList = (ArrayList) yh0Var.f;
                        ((v61) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i5 = yh0Var.b;
                    ArrayList arrayList2 = (ArrayList) yh0Var.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        v61 v61Var2 = (v61) view.getLayoutParams();
                        yh0Var.b = ((StaggeredGridLayoutManager) yh0Var.g).r.e(view);
                        v61Var2.getClass();
                        i5 = yh0Var.b;
                    }
                    if (i5 > owVar.k()) {
                        ((v61) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(v61Var.e.e);
            }
            i += i3;
            if (i != iV) {
                View viewU2 = u(i);
                if (this.x) {
                    int iB = owVar.b(viewU);
                    int iB2 = owVar.b(viewU2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (v61Var.e.e - ((v61) viewU2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iE = owVar.e(viewU);
                int iE2 = owVar.e(viewU2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (v61Var.e.e - ((v61) viewU2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    @Override // defpackage.rw0
    public final void Q() {
        this.B.e();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final boolean Q0() {
        return this.b.getLayoutDirection() == 1;
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        v61 v61Var = (v61) view.getLayoutParams();
        int iD1 = d1(i, ((ViewGroup.MarginLayoutParams) v61Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) v61Var).rightMargin + rect.right);
        int iD2 = d1(i2, ((ViewGroup.MarginLayoutParams) v61Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) v61Var).bottomMargin + rect.bottom);
        if (x0(view, iD1, iD2, v61Var)) {
            view.measure(iD1, iD2);
        }
    }

    @Override // defpackage.rw0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void S0(yw0 yw0Var, dx0 dx0Var, boolean z) {
        int i;
        boolean z2;
        x61 x61Var;
        int iV;
        int i2;
        int iG;
        int iG2;
        int iV2;
        boolean z3;
        int i3;
        boolean z4;
        x61 x61Var2 = this.F;
        u61 u61Var = this.H;
        if (!(x61Var2 == null && this.z == -1) && dx0Var.b() == 0) {
            j0(yw0Var);
            u61Var.a();
            return;
        }
        boolean z5 = u61Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = u61Var.g;
        boolean z6 = (z5 && this.z == -1 && this.F == null) ? false : true;
        yh0[] yh0VarArr = this.q;
        int i4 = this.p;
        ui0 ui0Var = this.B;
        if (z6) {
            u61Var.a();
            x61 x61Var3 = this.F;
            ow owVar = this.r;
            if (x61Var3 != null) {
                int i5 = x61Var3.e;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            yh0VarArr[i6].b();
                            x61 x61Var4 = this.F;
                            int iG3 = x61Var4.f[i6];
                            if (iG3 != Integer.MIN_VALUE) {
                                iG3 += x61Var4.k ? owVar.g() : owVar.k();
                            }
                            yh0 yh0Var = yh0VarArr[i6];
                            yh0Var.b = iG3;
                            yh0Var.c = iG3;
                        }
                    } else {
                        x61Var3.f = null;
                        x61Var3.e = 0;
                        x61Var3.g = 0;
                        x61Var3.h = null;
                        x61Var3.i = null;
                        x61Var3.c = x61Var3.d;
                    }
                }
                x61 x61Var5 = this.F;
                this.E = x61Var5.l;
                boolean z7 = x61Var5.j;
                c(null);
                x61 x61Var6 = this.F;
                if (x61Var6 != null && x61Var6.j != z7) {
                    x61Var6.j = z7;
                }
                this.w = z7;
                o0();
                Y0();
                x61 x61Var7 = this.F;
                int i7 = x61Var7.c;
                if (i7 != -1) {
                    this.z = i7;
                    u61Var.c = x61Var7.k;
                } else {
                    u61Var.c = this.x;
                }
                if (x61Var7.g > 1) {
                    ui0Var.e = x61Var7.h;
                    ui0Var.d = x61Var7.i;
                }
            } else {
                Y0();
                u61Var.c = this.x;
            }
            if (dx0Var.g || (i3 = this.z) == -1) {
                if (this.D) {
                    int iB = dx0Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iG2 = 0;
                            break;
                        }
                        iG2 = rw0.G(u(iV2));
                        if (iG2 < 0 && iG2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = dx0Var.b();
                    iV = v();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iV) {
                            iG2 = 0;
                            break;
                        }
                        iG = rw0.G(u(i2));
                        if (iG < 0 && iG < iB2) {
                            iG2 = iG;
                            break;
                        }
                        i2++;
                    }
                }
                u61Var.a = iG2;
                u61Var.b = Integer.MIN_VALUE;
                z3 = true;
            } else if (i3 < 0 || i3 >= dx0Var.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = dx0Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iG2 = 0;
                            break;
                        } else {
                            iG2 = rw0.G(u(iV2));
                            if (iG2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = dx0Var.b();
                    iV = v();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iV) {
                            iG2 = 0;
                            break;
                        } else {
                            iG = rw0.G(u(i2));
                            if (iG < 0) {
                            }
                            i2++;
                        }
                    }
                }
                u61Var.a = iG2;
                u61Var.b = Integer.MIN_VALUE;
                z3 = true;
            } else {
                x61 x61Var8 = this.F;
                if (x61Var8 == null || x61Var8.c == -1 || x61Var8.e < 1) {
                    View viewQ = q(this.z);
                    if (viewQ != null) {
                        u61Var.a = this.x ? L0() : K0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (u61Var.c) {
                                u61Var.b = (owVar.g() - this.A) - owVar.b(viewQ);
                            } else {
                                u61Var.b = (owVar.k() + this.A) - owVar.e(viewQ);
                            }
                        } else if (owVar.c(viewQ) > owVar.l()) {
                            u61Var.b = u61Var.c ? owVar.g() : owVar.k();
                        } else {
                            int iE = owVar.e(viewQ) - owVar.k();
                            if (iE < 0) {
                                u61Var.b = -iE;
                            } else {
                                int iG4 = owVar.g() - owVar.b(viewQ);
                                if (iG4 < 0) {
                                    u61Var.b = iG4;
                                } else {
                                    u61Var.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.z;
                        u61Var.a = i8;
                        int i9 = this.A;
                        if (i9 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i8 < K0()) != this.x) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                            } else if (this.x) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            u61Var.c = z4;
                            ow owVar2 = staggeredGridLayoutManager.r;
                            u61Var.b = z4 ? owVar2.g() : owVar2.k();
                        } else {
                            boolean z8 = u61Var.c;
                            ow owVar3 = staggeredGridLayoutManager.r;
                            if (z8) {
                                u61Var.b = owVar3.g() - i9;
                            } else {
                                u61Var.b = owVar3.k() + i9;
                            }
                        }
                        z3 = true;
                        u61Var.d = true;
                    }
                } else {
                    u61Var.b = Integer.MIN_VALUE;
                    u61Var.a = this.z;
                }
                z3 = true;
            }
            u61Var.e = z3;
        }
        if (this.F == null && this.z == -1 && !(u61Var.c == this.D && Q0() == this.E)) {
            ui0Var.e();
            i = 1;
            u61Var.d = true;
        } else {
            i = 1;
        }
        if (v() > 0 && ((x61Var = this.F) == null || x61Var.e < i)) {
            if (u61Var.d) {
                for (int i10 = 0; i10 < i4; i10++) {
                    yh0VarArr[i10].b();
                    int i11 = u61Var.b;
                    if (i11 != Integer.MIN_VALUE) {
                        yh0 yh0Var2 = yh0VarArr[i10];
                        yh0Var2.b = i11;
                        yh0Var2.c = i11;
                    }
                }
            } else if (z6 || u61Var.f == null) {
                for (int i12 = 0; i12 < i4; i12++) {
                    yh0 yh0Var3 = yh0VarArr[i12];
                    boolean z9 = this.x;
                    int i13 = u61Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) yh0Var3.g;
                    int iG5 = z9 ? yh0Var3.g(Integer.MIN_VALUE) : yh0Var3.i(Integer.MIN_VALUE);
                    yh0Var3.b();
                    if (iG5 != Integer.MIN_VALUE && ((!z9 || iG5 >= staggeredGridLayoutManager2.r.g()) && (z9 || iG5 <= staggeredGridLayoutManager2.r.k()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iG5 += i13;
                        }
                        yh0Var3.c = iG5;
                        yh0Var3.b = iG5;
                    }
                }
                int length = yh0VarArr.length;
                int[] iArr = u61Var.f;
                if (iArr == null || iArr.length < length) {
                    u61Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    u61Var.f[i14] = yh0VarArr[i14].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < i4; i15++) {
                    yh0 yh0Var4 = yh0VarArr[i15];
                    yh0Var4.b();
                    int i16 = u61Var.f[i15];
                    yh0Var4.b = i16;
                    yh0Var4.c = i16;
                }
            }
        }
        p(yw0Var);
        re0 re0Var = this.v;
        re0Var.a = false;
        ow owVar4 = this.s;
        int iL = owVar4.l();
        this.u = iL / i4;
        View.MeasureSpec.makeMeasureSpec(iL, owVar4.i());
        b1(u61Var.a, dx0Var);
        if (u61Var.c) {
            a1(-1);
            F0(yw0Var, re0Var, dx0Var);
            a1(1);
            re0Var.c = u61Var.a + re0Var.d;
            F0(yw0Var, re0Var, dx0Var);
        } else {
            a1(1);
            F0(yw0Var, re0Var, dx0Var);
            a1(-1);
            re0Var.c = u61Var.a + re0Var.d;
            F0(yw0Var, re0Var, dx0Var);
        }
        if (owVar4.i() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iV3; i17++) {
                View viewU = u(i17);
                float fC = owVar4.c(viewU);
                if (fC >= fMax) {
                    ((v61) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i18 = this.u;
            int iRound = Math.round(fMax * i4);
            if (owVar4.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, owVar4.l());
            }
            this.u = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, owVar4.i());
            if (this.u != i18) {
                for (int i19 = 0; i19 < iV3; i19++) {
                    View viewU2 = u(i19);
                    v61 v61Var = (v61) viewU2.getLayoutParams();
                    v61Var.getClass();
                    boolean zQ0 = Q0();
                    int i20 = this.t;
                    if (zQ0 && i20 == 1) {
                        int i21 = -((i4 - 1) - v61Var.e.e);
                        viewU2.offsetLeftAndRight((this.u * i21) - (i21 * i18));
                    } else {
                        int i22 = v61Var.e.e;
                        int i23 = this.u * i22;
                        int i24 = i22 * i18;
                        if (i20 == 1) {
                            viewU2.offsetLeftAndRight(i23 - i24);
                        } else {
                            viewU2.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                I0(yw0Var, dx0Var, true);
                J0(yw0Var, dx0Var, false);
            } else {
                J0(yw0Var, dx0Var, true);
                I0(yw0Var, dx0Var, false);
            }
        }
        if (!z || dx0Var.g || this.C == 0 || v() <= 0 || P0() == null) {
            z2 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (D0()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (dx0Var.g) {
            u61Var.a();
        }
        this.D = u61Var.c;
        this.E = Q0();
        if (z2) {
            u61Var.a();
            S0(yw0Var, dx0Var, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0047  */
    /* JADX WARN: Code duplicated, block: B:34:0x004e  */
    @Override // defpackage.rw0
    public final View T(View view, int i, yw0 yw0Var, dx0 dx0Var) {
        View viewD;
        int i2;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewD = recyclerView.D(view)) == null || this.a.c.contains(viewD)) {
                viewD = null;
            }
            if (viewD != null) {
                Y0();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && Q0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && Q0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    v61 v61Var = (v61) viewD.getLayoutParams();
                    v61Var.getClass();
                    yh0 yh0Var = v61Var.e;
                    int iL0 = i2 == 1 ? L0() : K0();
                    b1(iL0, dx0Var);
                    a1(i2);
                    re0 re0Var = this.v;
                    re0Var.c = re0Var.d + iL0;
                    re0Var.b = (int) (this.r.l() * 0.33333334f);
                    re0Var.h = true;
                    re0Var.a = false;
                    F0(yw0Var, re0Var, dx0Var);
                    this.D = this.x;
                    View viewH = yh0Var.h(iL0, i2);
                    if (viewH != null && viewH != viewD) {
                        return viewH;
                    }
                    boolean zT0 = T0(i2);
                    yh0[] yh0VarArr = this.q;
                    int i4 = this.p;
                    if (zT0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewH2 = yh0VarArr[i5].h(iL0, i2);
                            if (viewH2 != null && viewH2 != viewD) {
                                return viewH2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewH3 = yh0VarArr[i6].h(iL0, i2);
                            if (viewH3 != null && viewH3 != viewD) {
                                return viewH3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View viewQ = q(z ? yh0Var.c() : yh0Var.d());
                    if (viewQ != null && viewQ != viewD) {
                        return viewQ;
                    }
                    if (T0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != yh0Var.e) {
                                View viewQ2 = q(z ? yh0VarArr[i7].c() : yh0VarArr[i7].d());
                                if (viewQ2 != null && viewQ2 != viewD) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewQ3 = q(z ? yh0VarArr[i8].c() : yh0VarArr[i8].d());
                            if (viewQ3 != null && viewQ3 != viewD) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean T0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == Q0();
    }

    @Override // defpackage.rw0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewH0 = H0(false);
            View viewG0 = G0(false);
            if (viewH0 == null || viewG0 == null) {
                return;
            }
            int iG = rw0.G(viewH0);
            int iG2 = rw0.G(viewG0);
            if (iG < iG2) {
                accessibilityEvent.setFromIndex(iG);
                accessibilityEvent.setToIndex(iG2);
            } else {
                accessibilityEvent.setFromIndex(iG2);
                accessibilityEvent.setToIndex(iG);
            }
        }
    }

    public final void U0(int i, dx0 dx0Var) {
        int iK0;
        int i2;
        if (i > 0) {
            iK0 = L0();
            i2 = 1;
        } else {
            iK0 = K0();
            i2 = -1;
        }
        re0 re0Var = this.v;
        re0Var.a = true;
        b1(iK0, dx0Var);
        a1(i2);
        re0Var.c = iK0 + re0Var.d;
        re0Var.b = Math.abs(i);
    }

    @Override // defpackage.rw0
    public final void V(yw0 yw0Var, dx0 dx0Var, w3 w3Var) {
        super.V(yw0Var, dx0Var, w3Var);
        w3Var.j("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(yw0 yw0Var, re0 re0Var) {
        if (!re0Var.a || re0Var.i) {
            return;
        }
        int i = re0Var.b;
        int i2 = re0Var.e;
        if (i == 0) {
            if (i2 == -1) {
                W0(yw0Var, re0Var.g);
                return;
            } else {
                X0(yw0Var, re0Var.f);
                return;
            }
        }
        int i3 = this.p;
        yh0[] yh0VarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = re0Var.f;
            int i6 = yh0VarArr[0].i(i5);
            while (i4 < i3) {
                int i7 = yh0VarArr[i4].i(i5);
                if (i7 > i6) {
                    i6 = i7;
                }
                i4++;
            }
            int i8 = i5 - i6;
            int iMin = re0Var.g;
            if (i8 >= 0) {
                iMin -= Math.min(i8, re0Var.b);
            }
            W0(yw0Var, iMin);
            return;
        }
        int i9 = re0Var.g;
        int iG = yh0VarArr[0].g(i9);
        while (i4 < i3) {
            int iG2 = yh0VarArr[i4].g(i9);
            if (iG2 < iG) {
                iG = iG2;
            }
            i4++;
        }
        int i10 = iG - re0Var.g;
        int iMin2 = re0Var.f;
        if (i10 >= 0) {
            iMin2 += Math.min(i10, re0Var.b);
        }
        X0(yw0Var, iMin2);
    }

    @Override // defpackage.rw0
    public final void W(yw0 yw0Var, dx0 dx0Var, View view, w3 w3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof v61)) {
            X(view, w3Var);
            return;
        }
        yh0 yh0Var = ((v61) layoutParams).e;
        if (this.t == 0) {
            w3Var.k(v3.a(yh0Var == null ? -1 : yh0Var.e, 1, -1, -1, false, false));
        } else {
            w3Var.k(v3.a(-1, -1, yh0Var == null ? -1 : yh0Var.e, 1, false, false));
        }
    }

    public final void W0(yw0 yw0Var, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            ow owVar = this.r;
            if (owVar.e(viewU) < i || owVar.n(viewU) < i) {
                return;
            }
            v61 v61Var = (v61) viewU.getLayoutParams();
            v61Var.getClass();
            if (((ArrayList) v61Var.e.f).size() == 1) {
                return;
            }
            yh0 yh0Var = v61Var.e;
            ArrayList arrayList = (ArrayList) yh0Var.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            v61 v61Var2 = (v61) view.getLayoutParams();
            v61Var2.e = null;
            if (v61Var2.a.i() || v61Var2.a.l()) {
                yh0Var.d -= ((StaggeredGridLayoutManager) yh0Var.g).r.c(view);
            }
            if (size == 1) {
                yh0Var.b = Integer.MIN_VALUE;
            }
            yh0Var.c = Integer.MIN_VALUE;
            l0(viewU, yw0Var);
        }
    }

    public final void X0(yw0 yw0Var, int i) {
        while (v() > 0) {
            View viewU = u(0);
            ow owVar = this.r;
            if (owVar.b(viewU) > i || owVar.m(viewU) > i) {
                return;
            }
            v61 v61Var = (v61) viewU.getLayoutParams();
            v61Var.getClass();
            if (((ArrayList) v61Var.e.f).size() == 1) {
                return;
            }
            yh0 yh0Var = v61Var.e;
            ArrayList arrayList = (ArrayList) yh0Var.f;
            View view = (View) arrayList.remove(0);
            v61 v61Var2 = (v61) view.getLayoutParams();
            v61Var2.e = null;
            if (arrayList.size() == 0) {
                yh0Var.c = Integer.MIN_VALUE;
            }
            if (v61Var2.a.i() || v61Var2.a.l()) {
                yh0Var.d -= ((StaggeredGridLayoutManager) yh0Var.g).r.c(view);
            }
            yh0Var.b = Integer.MIN_VALUE;
            l0(viewU, yw0Var);
        }
    }

    @Override // defpackage.rw0
    public final void Y(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void Y0() {
        if (this.t == 1 || !Q0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.rw0
    public final void Z() {
        this.B.e();
        o0();
    }

    public final int Z0(int i, yw0 yw0Var, dx0 dx0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, dx0Var);
        re0 re0Var = this.v;
        int iF0 = F0(yw0Var, re0Var, dx0Var);
        if (re0Var.b >= iF0) {
            i = i < 0 ? -iF0 : iF0;
        }
        this.r.o(-i);
        this.D = this.x;
        re0Var.b = 0;
        V0(yw0Var, re0Var);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // defpackage.cx0
    public final PointF a(int i) {
        int i2 = -1;
        if (v() != 0) {
            if ((i < K0()) == this.x) {
                i2 = 1;
            }
        } else if (this.x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.rw0
    public final void a0(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void a1(int i) {
        re0 re0Var = this.v;
        re0Var.e = i;
        re0Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.rw0
    public final void b0(int i, int i2) {
        O0(i, i2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    public final void b1(int i, dx0 dx0Var) {
        int iL;
        int iL2;
        RecyclerView recyclerView;
        int i2;
        re0 re0Var = this.v;
        boolean z = false;
        re0Var.b = 0;
        re0Var.c = i;
        wf0 wf0Var = this.e;
        ow owVar = this.r;
        if (wf0Var != null && wf0Var.e && (i2 = dx0Var.a) != -1) {
            if (this.x == (i2 < i)) {
                iL = owVar.l();
            } else {
                iL2 = owVar.l();
                iL = 0;
            }
            recyclerView = this.b;
            if (recyclerView == null && recyclerView.j) {
                re0Var.f = owVar.k() - iL2;
                re0Var.g = owVar.g() + iL;
            } else {
                re0Var.g = owVar.f() + iL;
                re0Var.f = -iL2;
            }
            re0Var.h = false;
            re0Var.a = true;
            if (owVar.i() == 0 && owVar.f() == 0) {
                z = true;
            }
            re0Var.i = z;
        }
        iL = 0;
        iL2 = 0;
        recyclerView = this.b;
        if (recyclerView == null) {
            re0Var.g = owVar.f() + iL;
            re0Var.f = -iL2;
        } else {
            re0Var.g = owVar.f() + iL;
            re0Var.f = -iL2;
        }
        re0Var.h = false;
        re0Var.a = true;
        if (owVar.i() == 0) {
            z = true;
        }
        re0Var.i = z;
    }

    @Override // defpackage.rw0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.rw0
    public final void c0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void c1(yh0 yh0Var, int i, int i2) {
        int i3 = yh0Var.d;
        int i4 = yh0Var.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = yh0Var.c;
            if (i5 == Integer.MIN_VALUE) {
                yh0Var.a();
                i5 = yh0Var.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = yh0Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) yh0Var.f).get(0);
            v61 v61Var = (v61) view.getLayoutParams();
            yh0Var.b = ((StaggeredGridLayoutManager) yh0Var.g).r.e(view);
            v61Var.getClass();
            i6 = yh0Var.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.rw0
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.rw0
    public final void d0(yw0 yw0Var, dx0 dx0Var) {
        S0(yw0Var, dx0Var, true);
    }

    @Override // defpackage.rw0
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.rw0
    public final void e0(dx0 dx0Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.rw0
    public final boolean f(sw0 sw0Var) {
        return sw0Var instanceof v61;
    }

    @Override // defpackage.rw0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof x61) {
            x61 x61Var = (x61) parcelable;
            this.F = x61Var;
            if (this.z != -1) {
                x61Var.c = -1;
                x61Var.d = -1;
                x61Var.f = null;
                x61Var.e = 0;
                x61Var.g = 0;
                x61Var.h = null;
                x61Var.i = null;
            }
            o0();
        }
    }

    @Override // defpackage.rw0
    public final Parcelable g0() {
        int i;
        int iK;
        int[] iArr;
        x61 x61Var = this.F;
        if (x61Var != null) {
            x61 x61Var2 = new x61();
            x61Var2.e = x61Var.e;
            x61Var2.c = x61Var.c;
            x61Var2.d = x61Var.d;
            x61Var2.f = x61Var.f;
            x61Var2.g = x61Var.g;
            x61Var2.h = x61Var.h;
            x61Var2.j = x61Var.j;
            x61Var2.k = x61Var.k;
            x61Var2.l = x61Var.l;
            x61Var2.i = x61Var.i;
            return x61Var2;
        }
        x61 x61Var3 = new x61();
        x61Var3.j = this.w;
        x61Var3.k = this.D;
        x61Var3.l = this.E;
        ui0 ui0Var = this.B;
        if (ui0Var == null || (iArr = (int[]) ui0Var.e) == null) {
            x61Var3.g = 0;
        } else {
            x61Var3.h = iArr;
            x61Var3.g = iArr.length;
            x61Var3.i = (ArrayList) ui0Var.d;
        }
        if (v() <= 0) {
            x61Var3.c = -1;
            x61Var3.d = -1;
            x61Var3.e = 0;
            return x61Var3;
        }
        x61Var3.c = this.D ? L0() : K0();
        View viewG0 = this.x ? G0(true) : H0(true);
        x61Var3.d = viewG0 != null ? rw0.G(viewG0) : -1;
        int i2 = this.p;
        x61Var3.e = i2;
        x61Var3.f = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = this.D;
            ow owVar = this.r;
            yh0[] yh0VarArr = this.q;
            if (z) {
                i = yh0VarArr[i3].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    iK = owVar.g();
                    i -= iK;
                }
            } else {
                i = yh0VarArr[i3].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    iK = owVar.k();
                    i -= iK;
                }
            }
            x61Var3.f[i3] = i;
        }
        return x61Var3;
    }

    @Override // defpackage.rw0
    public final void h(int i, int i2, dx0 dx0Var, p60 p60Var) {
        re0 re0Var;
        int iG;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, dx0Var);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            re0Var = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = re0Var.d;
            yh0[] yh0VarArr = this.q;
            if (i6 == -1) {
                int i7 = re0Var.f;
                iG = i7 - yh0VarArr[i4].i(i7);
            } else {
                iG = yh0VarArr[i4].g(re0Var.g) - re0Var.g;
            }
            if (iG >= 0) {
                this.J[i5] = iG;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = re0Var.c;
            if (i9 < 0 || i9 >= dx0Var.b()) {
                return;
            }
            p60Var.a(re0Var.c, this.J[i8]);
            re0Var.c += re0Var.d;
        }
    }

    @Override // defpackage.rw0
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // defpackage.rw0
    public final int j(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return th1.k(dx0Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.rw0
    public final int k(dx0 dx0Var) {
        return E0(dx0Var);
    }

    @Override // defpackage.rw0
    public final int l(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return th1.m(dx0Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.rw0
    public final int m(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return th1.k(dx0Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.rw0
    public final int n(dx0 dx0Var) {
        return E0(dx0Var);
    }

    @Override // defpackage.rw0
    public final int o(dx0 dx0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return th1.m(dx0Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.rw0
    public final int p0(int i, yw0 yw0Var, dx0 dx0Var) {
        return Z0(i, yw0Var, dx0Var);
    }

    @Override // defpackage.rw0
    public final void q0(int i) {
        x61 x61Var = this.F;
        if (x61Var != null && x61Var.c != i) {
            x61Var.f = null;
            x61Var.e = 0;
            x61Var.c = -1;
            x61Var.d = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // defpackage.rw0
    public final sw0 r() {
        return this.t == 0 ? new v61(-2, -1) : new v61(-1, -2);
    }

    @Override // defpackage.rw0
    public final int r0(int i, yw0 yw0Var, dx0 dx0Var) {
        return Z0(i, yw0Var, dx0Var);
    }

    @Override // defpackage.rw0
    public final sw0 s(Context context, AttributeSet attributeSet) {
        return new v61(context, attributeSet);
    }

    @Override // defpackage.rw0
    public final sw0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new v61((ViewGroup.MarginLayoutParams) layoutParams) : new v61(layoutParams);
    }

    @Override // defpackage.rw0
    public final void u0(int i, int i2, Rect rect) {
        int iG;
        int iG2;
        int iE = E() + D();
        int iC = C() + F();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = oe1.a;
            iG2 = rw0.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = rw0.g(i, (this.u * i4) + iE, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = oe1.a;
            iG = rw0.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = rw0.g(i2, (this.u * i4) + iC, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.rw0
    public final int x(yw0 yw0Var, dx0 dx0Var) {
        if (this.t == 1) {
            return Math.min(this.p, dx0Var.b());
        }
        return -1;
    }
}
