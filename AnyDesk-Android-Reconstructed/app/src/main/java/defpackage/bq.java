package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class bq {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final np I;
    public final np J;
    public final np K;
    public final np L;
    public final np M;
    public final np N;
    public final np O;
    public final np P;
    public final np[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public bq T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public wj b;
    public int b0;
    public wj c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final bq[] l0;
    public boolean m;
    public final bq[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public y70 d = null;
    public zd1 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public bq() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        np npVar = new np(this, 2);
        this.I = npVar;
        np npVar2 = new np(this, 3);
        this.J = npVar2;
        np npVar3 = new np(this, 4);
        this.K = npVar3;
        np npVar4 = new np(this, 5);
        this.L = npVar4;
        np npVar5 = new np(this, 6);
        this.M = npVar5;
        np npVar6 = new np(this, 8);
        this.N = npVar6;
        np npVar7 = new np(this, 9);
        this.O = npVar7;
        np npVar8 = new np(this, 7);
        this.P = npVar8;
        this.Q = new np[]{npVar, npVar3, npVar2, npVar4, npVar5, npVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new bq[]{null, null};
        this.m0 = new bq[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(npVar);
        arrayList.add(npVar2);
        arrayList.add(npVar3);
        arrayList.add(npVar4);
        arrayList.add(npVar6);
        arrayList.add(npVar7);
        arrayList.add(npVar8);
        arrayList.add(npVar5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, np npVar) {
        if (npVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(npVar.f);
        sb.append("'");
        if (npVar.h != Integer.MIN_VALUE || npVar.g != 0) {
            sb.append(",");
            sb.append(npVar.g);
            if (npVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(npVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        bq bqVar = this.T;
        if (bqVar != null && (bqVar instanceof cq)) {
            ((cq) bqVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((np) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            np npVar = (np) arrayList.get(i);
            npVar.c = false;
            npVar.b = 0;
        }
    }

    public void F(y6 y6Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        y70 y70Var = this.d;
        boolean z3 = z & y70Var.g;
        zd1 zd1Var = this.e;
        boolean z4 = z2 & zd1Var.g;
        int i3 = y70Var.h.g;
        int i4 = zd1Var.h.g;
        int i5 = y70Var.i.g;
        int i6 = zd1Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(xf0 xf0Var, boolean z) {
        int i;
        int i2;
        zd1 zd1Var;
        y70 y70Var;
        xf0Var.getClass();
        int iN = xf0.n(this.I);
        int iN2 = xf0.n(this.J);
        int iN3 = xf0.n(this.K);
        int iN4 = xf0.n(this.L);
        if (z && (y70Var = this.d) != null) {
            kt ktVar = y70Var.h;
            if (ktVar.j) {
                kt ktVar2 = y70Var.i;
                if (ktVar2.j) {
                    iN = ktVar.g;
                    iN3 = ktVar2.g;
                }
            }
        }
        if (z && (zd1Var = this.e) != null) {
            kt ktVar3 = zd1Var.h;
            if (ktVar3.j) {
                kt ktVar4 = zd1Var.i;
                if (ktVar4.j) {
                    iN2 = ktVar3.g;
                    iN4 = ktVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(cq cqVar, xf0 xf0Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            th1.c(cqVar, xf0Var, this);
            hashSet.remove(this);
            b(xf0Var, cqVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((np) it.next()).d.a(cqVar, xf0Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((np) it2.next()).d.a(cqVar, xf0Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((np) it3.next()).d.a(cqVar, xf0Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((np) it4.next()).d.a(cqVar, xf0Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((np) it5.next()).d.a(cqVar, xf0Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:126:0x0207  */
    /* JADX WARN: Code duplicated, block: B:129:0x0210  */
    /* JADX WARN: Code duplicated, block: B:131:0x0216  */
    /* JADX WARN: Code duplicated, block: B:133:0x0220  */
    /* JADX WARN: Code duplicated, block: B:136:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0234  */
    /* JADX WARN: Code duplicated, block: B:147:0x025a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0284  */
    /* JADX WARN: Code duplicated, block: B:163:0x0293  */
    /* JADX WARN: Code duplicated, block: B:166:0x029c  */
    /* JADX WARN: Code duplicated, block: B:167:0x029f  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:179:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x03c0 A[PHI: r13
  0x03c0: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:259:0x03c8, B:260:0x03ca, B:254:0x03b4, B:241:0x0389, B:247:0x0397, B:249:0x039b, B:250:0x039d, B:246:0x0393] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:259:0x03c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:260:0x03ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:274:0x0407  */
    /* JADX WARN: Code duplicated, block: B:276:0x040c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x0410  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0414  */
    /* JADX WARN: Code duplicated, block: B:286:0x0420  */
    /* JADX WARN: Code duplicated, block: B:289:0x0428  */
    /* JADX WARN: Code duplicated, block: B:292:0x042e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0431  */
    /* JADX WARN: Code duplicated, block: B:297:0x044d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0494  */
    /* JADX WARN: Code duplicated, block: B:332:0x0531  */
    /* JADX WARN: Code duplicated, block: B:348:0x0584  */
    /* JADX WARN: Code duplicated, block: B:351:0x0595  */
    /* JADX WARN: Code duplicated, block: B:354:0x0599  */
    /* JADX WARN: Code duplicated, block: B:391:0x065a  */
    /* JADX WARN: Code duplicated, block: B:393:0x0660  */
    /* JADX WARN: Code duplicated, block: B:395:0x0669  */
    /* JADX WARN: Code duplicated, block: B:396:0x0690  */
    /* JADX WARN: Code duplicated, block: B:399:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:402:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    public void b(xf0 xf0Var, boolean z) {
        char c;
        boolean z2;
        boolean z3;
        int i;
        boolean[] zArr;
        boolean z4;
        boolean z5;
        boolean z6;
        HashSet hashSet;
        bq bqVar;
        cq cqVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        bq bqVar2;
        cq cqVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        np npVar;
        boolean[] zArr3;
        boolean z7;
        boolean z8;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        boolean z9;
        int i8;
        boolean z10;
        float f;
        int i9;
        int i10;
        np npVar2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        np npVar3;
        int i15;
        np npVar4;
        r51 r51Var;
        r51 r51Var2;
        r51 r51Var3;
        boolean z14;
        boolean z15;
        boolean z16;
        int i16;
        r51 r51Var4;
        r51 r51Var5;
        r51 r51Var6;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        r51 r51Var7;
        int i19;
        float f2;
        zd1 zd1Var;
        y70 y70Var;
        int i20;
        int i21;
        boolean zX;
        boolean zY;
        y70 y70Var2;
        zd1 zd1Var2;
        boolean z19;
        ArrayList arrayList;
        int size;
        int i22;
        HashSet hashSet2;
        xf0 xf0Var2 = xf0Var;
        np npVar5 = this.I;
        r51 r51VarK = xf0Var2.k(npVar5);
        np npVar6 = this.K;
        r51 r51VarK2 = xf0Var2.k(npVar6);
        np npVar7 = this.J;
        r51 r51VarK3 = xf0Var2.k(npVar7);
        np npVar8 = this.L;
        r51 r51VarK4 = xf0Var2.k(npVar8);
        np npVar9 = this.M;
        r51 r51VarK5 = xf0Var2.k(npVar9);
        bq bqVar3 = this.T;
        if (bqVar3 != null) {
            int[] iArr2 = bqVar3.p0;
            c = 0;
            z3 = iArr2[0] == 2;
            boolean z20 = iArr2[1] == 2;
            int i23 = this.q;
            if (i23 == 1) {
                z2 = false;
            } else if (i23 == 2) {
                z2 = z20;
                z3 = false;
            } else if (i23 != 3) {
                z2 = z20;
            }
            i = this.g0;
            zArr = this.S;
            z4 = z2;
            if (i == 8) {
                arrayList = this.R;
                size = arrayList.size();
                z5 = z3;
                i22 = 0;
                while (true) {
                    if (i22 < size) {
                        if (!zArr[c] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i24 = size;
                    hashSet2 = ((np) arrayList.get(i22)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i22++;
                    size = i24;
                }
            } else {
                z5 = z3;
            }
            z6 = this.k;
            if (z6 || this.l) {
                if (z6) {
                    xf0Var2.d(r51VarK, this.Y);
                    xf0Var2.d(r51VarK2, this.Y + this.U);
                    if (z5 && (bqVar2 = this.T) != null) {
                        cqVar2 = (cq) bqVar2;
                        weakReference3 = cqVar2.H0;
                        if (weakReference3 != null || weakReference3.get() == null || npVar5.d() > ((np) cqVar2.H0.get()).d()) {
                            cqVar2.H0 = new WeakReference(npVar5);
                        }
                        weakReference4 = cqVar2.J0;
                        if (weakReference4 != null || weakReference4.get() == null || npVar6.d() > ((np) cqVar2.J0.get()).d()) {
                            cqVar2.J0 = new WeakReference(npVar6);
                        }
                    }
                }
                if (this.l) {
                    xf0Var2.d(r51VarK3, this.Z);
                    xf0Var2.d(r51VarK4, this.Z + this.V);
                    hashSet = npVar9.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        xf0Var2.d(r51VarK5, this.Z + this.a0);
                    }
                    if (z4 && (bqVar = this.T) != null) {
                        cqVar = (cq) bqVar;
                        weakReference = cqVar.G0;
                        if (weakReference != null || weakReference.get() == null || npVar7.d() > ((np) cqVar.G0.get()).d()) {
                            cqVar.G0 = new WeakReference(npVar7);
                        }
                        weakReference2 = cqVar.I0;
                        if (weakReference2 != null || weakReference2.get() == null || npVar8.d() > ((np) cqVar.I0.get()).d()) {
                            cqVar.I0 = new WeakReference(npVar8);
                        }
                    }
                }
                if (this.k && this.l) {
                    this.k = false;
                    this.l = false;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (y70Var2 = this.d) == null || (zd1Var2 = this.e) == null) {
                npVar = npVar9;
                zArr3 = zArr2;
            } else {
                npVar = npVar9;
                kt ktVar = y70Var2.h;
                zArr3 = zArr2;
                if (ktVar.j && y70Var2.i.j && zd1Var2.h.j && zd1Var2.i.j) {
                    xf0Var2.d(r51VarK, ktVar.g);
                    xf0Var2.d(r51VarK2, this.d.i.g);
                    xf0Var2.d(r51VarK3, this.e.h.g);
                    xf0Var2.d(r51VarK4, this.e.i.g);
                    xf0Var2.d(r51VarK5, this.e.k.g);
                    if (this.T == null) {
                        z19 = false;
                    } else {
                        if (z5 && zArr3[0] && !x()) {
                            xf0Var2.f(xf0Var2.k(this.T.K), r51VarK2, 0, 8);
                        }
                        if (z4 && zArr3[1] && !y()) {
                            z19 = false;
                            xf0Var2.f(xf0Var2.k(this.T.L), r51VarK4, 0, 8);
                        } else {
                            z19 = false;
                        }
                    }
                    this.k = z19;
                    this.l = z19;
                    return;
                }
            }
            if (this.T != null) {
                if (w(0)) {
                    ((cq) this.T).R(this, 0);
                    zX = true;
                } else {
                    zX = x();
                }
                if (w(1)) {
                    ((cq) this.T).R(this, 1);
                    zY = true;
                } else {
                    zY = y();
                }
                if (zX && z5 && this.g0 != 8 && npVar5.f == null && npVar6.f == null) {
                    xf0Var2.f(xf0Var2.k(this.T.K), r51VarK2, 0, 1);
                }
                if (!zY && z4 && this.g0 != 8 && npVar7.f == null && npVar8.f == null && npVar == null) {
                    xf0Var2.f(xf0Var2.k(this.T.L), r51VarK4, 0, 1);
                }
                z8 = zY;
                z7 = zX;
            } else {
                npVar5 = npVar5;
                z7 = false;
                z8 = false;
            }
            i2 = this.U;
            i3 = this.b0;
            if (i2 >= i3) {
                i3 = i2;
            }
            i4 = this.V;
            i5 = this.c0;
            if (i4 < i5) {
                i6 = i5;
            } else {
                i6 = i4;
            }
            iArr = this.p0;
            i7 = iArr[0];
            if (i7 != 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            i8 = iArr[1];
            if (i8 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i25 = this.X;
            this.A = i25;
            f = this.W;
            this.B = f;
            i9 = this.r;
            i10 = this.s;
            if (f > 0.0f) {
                npVar2 = npVar8;
                if (this.g0 != 8) {
                    if (i7 == 3 || i9 != 0) {
                        i12 = i9;
                    } else {
                        i12 = 3;
                    }
                    if (i8 == 3 || i10 != 0) {
                        i21 = i10;
                    } else {
                        i21 = 3;
                    }
                    if (i7 == 3 || i8 != 3 || i12 != 3 || i21 != 3) {
                        if (i7 != 3 && i12 == 3) {
                            this.A = 0;
                            i3 = (int) (f * i4);
                            if (i8 != 3) {
                                npVar = npVar;
                                i11 = i6;
                                i12 = 4;
                                z11 = false;
                            }
                            i13 = i21;
                            int[] iArr3 = this.t;
                            iArr3[0] = i12;
                            iArr3[1] = i13;
                            if (z11) {
                                int i26 = this.A;
                                i14 = -1;
                                if (i26 != 0) {
                                }
                                if (z11) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iArr[0] == 2) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    i3 = 0;
                                }
                                npVar3 = this.P;
                                boolean z21 = !npVar3.h();
                                boolean z22 = zArr[0];
                                boolean z23 = zArr[1];
                                i15 = this.o;
                                int[] iArr4 = this.C;
                                if (i15 != 2) {
                                    npVar4 = npVar;
                                    r51Var = r51VarK;
                                    r51Var2 = r51VarK2;
                                    r51Var3 = r51VarK5;
                                    z14 = z7;
                                    z15 = z5;
                                    z16 = z4;
                                    i16 = i12;
                                } else {
                                    npVar4 = npVar;
                                    r51Var = r51VarK;
                                    r51Var2 = r51VarK2;
                                    r51Var3 = r51VarK5;
                                    z14 = z7;
                                    z15 = z5;
                                    z16 = z4;
                                    i16 = i12;
                                }
                                if (z) {
                                    r51Var4 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0584: MOVE (r5v1 'r51Var4' r51) = (r33v0 r51) (LINE:1413) in method: bq.b(xf0, boolean):void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 r51
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1903
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bq.b(xf0, boolean):void");
                                }

                                public boolean c() {
                                    return this.g0 != 8;
                                }

                                /* JADX WARN: Code duplicated, block: B:219:0x03ac  */
                                /* JADX WARN: Code duplicated, block: B:221:0x03b0  */
                                /* JADX WARN: Code duplicated, block: B:228:0x03c4  */
                                /* JADX WARN: Code duplicated, block: B:230:0x03e9  */
                                /* JADX WARN: Code duplicated, block: B:239:0x0406  */
                                /* JADX WARN: Code duplicated, block: B:256:0x0437  */
                                /* JADX WARN: Code duplicated, block: B:258:0x043d  */
                                /* JADX WARN: Code duplicated, block: B:269:0x0452  */
                                /* JADX WARN: Code duplicated, block: B:274:0x045c  */
                                /* JADX WARN: Code duplicated, block: B:276:0x0460  */
                                /* JADX WARN: Code duplicated, block: B:277:0x0462  */
                                /* JADX WARN: Code duplicated, block: B:280:0x046a  */
                                /* JADX WARN: Code duplicated, block: B:286:0x0478 A[PHI: r3
  0x0478: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:279:0x0468, B:281:0x046e, B:282:0x0470, B:284:0x0474] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:289:0x048a A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:290:0x048c  */
                                /* JADX WARN: Code duplicated, block: B:291:0x0491  */
                                /* JADX WARN: Code duplicated, block: B:293:0x0494  */
                                /* JADX WARN: Code duplicated, block: B:302:0x04ab  */
                                /* JADX WARN: Code duplicated, block: B:336:0x0505  */
                                public final void d(xf0 xf0Var, boolean z, boolean z2, boolean z3, boolean z4, r51 r51Var, r51 r51Var2, int i, boolean z5, np npVar, np npVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
                                    boolean z12;
                                    boolean z13;
                                    int iMin;
                                    boolean z14;
                                    int i10;
                                    int i11;
                                    boolean z15;
                                    r51 r51VarK;
                                    r51 r51VarK2;
                                    np npVar3;
                                    r51 r51Var3;
                                    int i12;
                                    int i13;
                                    int i14;
                                    boolean z16;
                                    boolean z17;
                                    boolean z18;
                                    boolean z19;
                                    bq bqVar;
                                    boolean z20;
                                    int iMin2;
                                    boolean z21;
                                    int iE;
                                    int i15;
                                    int i16;
                                    HashSet hashSet;
                                    boolean z22;
                                    int i17;
                                    int i18;
                                    int i19;
                                    int i20;
                                    int i21;
                                    boolean z23;
                                    boolean z24;
                                    int i22;
                                    xf0Var = xf0Var;
                                    int i23 = i8;
                                    int i24 = i9;
                                    r51 r51VarK3 = xf0Var.k(npVar);
                                    r51 r51VarK4 = xf0Var.k(npVar2);
                                    r51 r51VarK5 = xf0Var.k(npVar.f);
                                    r51 r51VarK6 = xf0Var.k(npVar2.f);
                                    boolean zH = npVar.h();
                                    boolean zH2 = npVar2.h();
                                    boolean zH3 = this.P.h();
                                    int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
                                    if (zH3) {
                                        i25++;
                                    }
                                    int i26 = i25;
                                    int i27 = z6 ? 3 : i6;
                                    int iR = q51.r(i);
                                    boolean z25 = (iR == 0 || iR == 1 || iR != 2 || i27 == 4) ? false : true;
                                    int i28 = this.h;
                                    if (i28 == -1 || !z) {
                                        i28 = i3;
                                        z12 = z25;
                                    } else {
                                        this.h = -1;
                                        z12 = false;
                                    }
                                    int i29 = this.i;
                                    if (i29 == -1 || z) {
                                        z13 = z12;
                                    } else {
                                        this.i = -1;
                                        i28 = i29;
                                        z13 = false;
                                    }
                                    boolean z26 = z13;
                                    if (this.g0 == 8) {
                                        z14 = false;
                                        iMin = 0;
                                    } else {
                                        iMin = i28;
                                        z14 = z26;
                                    }
                                    if (z11) {
                                        if (!zH && !zH2 && !zH3) {
                                            xf0Var.d(r51VarK3, i2);
                                        } else if (zH && !zH2) {
                                            i10 = 8;
                                            xf0Var.e(r51VarK3, r51VarK5, npVar.e(), 8);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = 8;
                                    }
                                    if (z14 != 0) {
                                        if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                                            if (i23 == -2) {
                                                i23 = iMin;
                                            }
                                            if (i24 == -2) {
                                                i24 = iMin;
                                            }
                                            if (iMin > 0 && i27 != 1) {
                                                iMin = 0;
                                            }
                                            if (i23 > 0) {
                                                xf0Var.f(r51VarK4, r51VarK3, i23, 8);
                                                iMin = Math.max(iMin, i23);
                                            }
                                            if (i24 > 0) {
                                                if (!z2 || i27 != 1) {
                                                    xf0Var.g(r51VarK4, r51VarK3, i24, 8);
                                                }
                                                iMin = Math.min(iMin, i24);
                                            }
                                            if (i27 == 1) {
                                                if (z2) {
                                                    xf0Var.e(r51VarK4, r51VarK3, iMin, 8);
                                                } else if (z8) {
                                                    xf0Var.e(r51VarK4, r51VarK3, iMin, 5);
                                                    xf0Var.g(r51VarK4, r51VarK3, iMin, 8);
                                                } else {
                                                    xf0Var.e(r51VarK4, r51VarK3, iMin, 5);
                                                    xf0Var.g(r51VarK4, r51VarK3, iMin, 8);
                                                }
                                            } else if (i27 == 2) {
                                                int i30 = npVar.e;
                                                if (i30 == 3 || i30 == 5) {
                                                    r51VarK = xf0Var.k(this.T.i(3));
                                                    r51VarK2 = xf0Var.k(this.T.i(5));
                                                } else {
                                                    r51VarK = xf0Var.k(this.T.i(2));
                                                    r51VarK2 = xf0Var.k(this.T.i(4));
                                                }
                                                yd ydVarL = xf0Var.l();
                                                int i31 = i23;
                                                ydVarL.d.g(r51VarK4, -1.0f);
                                                ydVarL.d.g(r51VarK3, 1.0f);
                                                ydVarL.d.g(r51VarK2, f2);
                                                ydVarL.d.g(r51VarK, -f2);
                                                xf0Var.c(ydVarL);
                                                if (z2) {
                                                    z14 = false;
                                                }
                                                z15 = z4;
                                                i11 = i31;
                                            } else {
                                                i11 = i23;
                                                z15 = true;
                                            }
                                        } else {
                                            int iMax = Math.max(i23, iMin);
                                            if (i24 > 0) {
                                                iMax = Math.min(i24, iMax);
                                            }
                                            xf0Var.e(r51VarK4, r51VarK3, iMax, 8);
                                            z15 = z4;
                                            i11 = i23;
                                            z14 = false;
                                        }
                                        if (z11 || z8) {
                                            boolean z27 = z15;
                                            if (i26 >= 2 && z2 && z27) {
                                                xf0Var.f(r51VarK3, r51Var, 0, 8);
                                                np npVar4 = this.M;
                                                boolean z28 = z || npVar4.f == null;
                                                if (!z && (npVar3 = npVar4.f) != null) {
                                                    bq bqVar2 = npVar3.d;
                                                    if (bqVar2.W != 0.0f) {
                                                        int[] iArr = bqVar2.p0;
                                                        if (iArr[0] == 3 && iArr[1] == 3) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                    } else {
                                                        z28 = false;
                                                    }
                                                }
                                                if (z28) {
                                                    xf0Var.f(r51Var2, r51VarK4, 0, 8);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        if (zH || zH2 || zH3) {
                                            if (zH && !zH2) {
                                                npVar2 = npVar2;
                                                r51VarK4 = r51VarK4;
                                                z15 = z15;
                                                r51Var3 = r51VarK6;
                                                z20 = z2;
                                                i22 = (z2 && (npVar.f.d instanceof zf)) ? 8 : 5;
                                            } else if (zH || !zH2) {
                                                r51Var3 = r51VarK6;
                                                if (zH && zH2) {
                                                    bq bqVar3 = npVar.f.d;
                                                    bq bqVar4 = npVar2.f.d;
                                                    z15 = z15;
                                                    bq bqVar5 = this.T;
                                                    int i32 = 6;
                                                    if (z14) {
                                                        if (i27 == 0) {
                                                            if (i24 != 0 || i11 != 0) {
                                                                i20 = 5;
                                                                i21 = 5;
                                                                z23 = true;
                                                                z24 = false;
                                                                z17 = true;
                                                            } else if (r51VarK5.h && r51Var3.h) {
                                                                xf0Var.e(r51VarK3, r51VarK5, npVar.e(), 8);
                                                                xf0Var.e(r51VarK4, r51Var3, -npVar2.e(), 8);
                                                                return;
                                                            } else {
                                                                i20 = 8;
                                                                i21 = 8;
                                                                z23 = false;
                                                                z24 = true;
                                                                z17 = false;
                                                            }
                                                            if ((bqVar3 instanceof zf) || (bqVar4 instanceof zf)) {
                                                                xf0Var = xf0Var;
                                                                i27 = i27;
                                                                r51VarK3 = r51VarK3;
                                                                r51VarK4 = r51VarK4;
                                                                z18 = z24;
                                                                r51Var2 = r51Var2;
                                                                i12 = i20;
                                                                r51VarK5 = r51VarK5;
                                                                z16 = z23;
                                                                i13 = 6;
                                                                i14 = 4;
                                                            } else {
                                                                xf0Var = xf0Var;
                                                                r51VarK3 = r51VarK3;
                                                                r51VarK4 = r51VarK4;
                                                                z18 = z24;
                                                                i12 = i20;
                                                                r51VarK5 = r51VarK5;
                                                                z16 = z23;
                                                                i13 = 6;
                                                                i14 = i21;
                                                                i27 = i27;
                                                                r51Var2 = r51Var2;
                                                            }
                                                        } else {
                                                            if (i27 == 2) {
                                                                if ((bqVar3 instanceof zf) || (bqVar4 instanceof zf)) {
                                                                    i12 = 5;
                                                                } else {
                                                                    xf0Var = xf0Var;
                                                                    i27 = i27;
                                                                    r51VarK3 = r51VarK3;
                                                                    r51VarK4 = r51VarK4;
                                                                    r51VarK5 = r51VarK5;
                                                                    i12 = 5;
                                                                    i13 = 6;
                                                                    i14 = 5;
                                                                }
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = false;
                                                                r51Var2 = r51Var2;
                                                            } else if (i27 == 1) {
                                                                i12 = 8;
                                                            } else if (i27 == 3) {
                                                                i27 = i27;
                                                                if (this.A != -1) {
                                                                    if (z6) {
                                                                        if (i7 == 2 || i7 == 1) {
                                                                            i18 = 5;
                                                                            i19 = 4;
                                                                        } else {
                                                                            i18 = 8;
                                                                            i19 = 5;
                                                                        }
                                                                        i14 = i19;
                                                                        i13 = 6;
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    } else {
                                                                        if (i24 > 0) {
                                                                            xf0Var = xf0Var;
                                                                            r51Var2 = r51Var2;
                                                                            r51VarK3 = r51VarK3;
                                                                            r51VarK4 = r51VarK4;
                                                                            r51VarK5 = r51VarK5;
                                                                            i12 = 5;
                                                                            i13 = 6;
                                                                        } else if (i24 != 0 || i11 != 0) {
                                                                            xf0Var = xf0Var;
                                                                            r51Var2 = r51Var2;
                                                                            r51VarK3 = r51VarK3;
                                                                            r51VarK4 = r51VarK4;
                                                                            r51VarK5 = r51VarK5;
                                                                            i12 = 5;
                                                                            i13 = 6;
                                                                            i14 = 4;
                                                                        } else if (z9) {
                                                                            i18 = (bqVar3 == bqVar5 || bqVar4 == bqVar5) ? 5 : 4;
                                                                            i13 = 6;
                                                                            i14 = 4;
                                                                            z16 = true;
                                                                            z17 = true;
                                                                            z18 = true;
                                                                        } else {
                                                                            xf0Var = xf0Var;
                                                                            r51Var2 = r51Var2;
                                                                            r51VarK3 = r51VarK3;
                                                                            r51VarK4 = r51VarK4;
                                                                            r51VarK5 = r51VarK5;
                                                                            i12 = 5;
                                                                            i13 = 6;
                                                                            i14 = 8;
                                                                        }
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    }
                                                                    i12 = i18;
                                                                    xf0Var = xf0Var;
                                                                } else if (z9) {
                                                                    xf0Var = xf0Var;
                                                                    r51Var2 = r51Var2;
                                                                    r51VarK3 = r51VarK3;
                                                                    r51VarK4 = r51VarK4;
                                                                    r51VarK5 = r51VarK5;
                                                                    i12 = 8;
                                                                    i13 = z2 ? 5 : 4;
                                                                } else {
                                                                    xf0Var = xf0Var;
                                                                    r51Var2 = r51Var2;
                                                                    r51VarK3 = r51VarK3;
                                                                    r51VarK4 = r51VarK4;
                                                                    r51VarK5 = r51VarK5;
                                                                    i12 = 8;
                                                                    i13 = 8;
                                                                }
                                                                i14 = 5;
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = true;
                                                            } else {
                                                                i12 = 5;
                                                                i13 = 6;
                                                                i14 = 4;
                                                                z16 = false;
                                                                z17 = false;
                                                            }
                                                            i13 = 6;
                                                            i14 = 4;
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = false;
                                                            r51Var2 = r51Var2;
                                                        }
                                                        if (z17 || r51VarK5 != r51Var3 || bqVar3 == bqVar5) {
                                                            z19 = true;
                                                        } else {
                                                            z17 = false;
                                                            z19 = false;
                                                        }
                                                        if (z16) {
                                                            if (z14 && !z7 && !z9 && r51VarK5 == r51Var && r51Var3 == r51Var2) {
                                                                i13 = 8;
                                                                z20 = false;
                                                                i17 = 8;
                                                                z22 = false;
                                                            } else {
                                                                z20 = z2;
                                                                z22 = z19;
                                                                i17 = i12;
                                                            }
                                                            r51 r51Var4 = r51VarK5;
                                                            bqVar = bqVar4;
                                                            xf0Var.b(r51VarK3, r51Var4, npVar.e(), f, r51Var3, r51VarK4, npVar2.e(), i13);
                                                            r51VarK5 = r51Var4;
                                                            i12 = i17;
                                                            z19 = z22;
                                                        } else {
                                                            bqVar = bqVar4;
                                                            z20 = z2;
                                                        }
                                                        if (this.g0 != 8 && ((hashSet = npVar2.a) == null || hashSet.size() <= 0)) {
                                                            return;
                                                        }
                                                        if (z17) {
                                                            if (z20 && r51VarK5 != r51Var3 && !z14 && ((bqVar3 instanceof zf) || (bqVar instanceof zf))) {
                                                                i12 = 6;
                                                            }
                                                            xf0Var.f(r51VarK3, r51VarK5, npVar.e(), i12);
                                                            xf0Var.g(r51VarK4, r51Var3, -npVar2.e(), i12);
                                                        }
                                                        if (z20 || !z10 || (bqVar3 instanceof zf) || (bqVar instanceof zf) || bqVar == bqVar5) {
                                                            iMin2 = i14;
                                                            z21 = z19;
                                                        } else {
                                                            iMin2 = 6;
                                                            i12 = 6;
                                                            z21 = true;
                                                        }
                                                        if (z21) {
                                                            if (z18 && (!z9 || z3)) {
                                                                if (bqVar3 != bqVar5 && bqVar != bqVar5) {
                                                                    i32 = iMin2;
                                                                }
                                                                if ((bqVar3 instanceof k70) || (bqVar instanceof k70)) {
                                                                    i32 = 5;
                                                                }
                                                                if ((bqVar3 instanceof zf) || (bqVar instanceof zf)) {
                                                                    i32 = 5;
                                                                }
                                                                if (z9) {
                                                                    i16 = 5;
                                                                } else {
                                                                    i16 = i32;
                                                                }
                                                                iMin2 = Math.max(i16, iMin2);
                                                            }
                                                            if (z20) {
                                                                iMin2 = Math.min(i12, iMin2);
                                                                if (z6 || z9 || !(bqVar3 == bqVar5 || bqVar == bqVar5)) {
                                                                    i15 = iMin2;
                                                                } else {
                                                                    i15 = 4;
                                                                }
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                            xf0Var.e(r51VarK3, r51VarK5, npVar.e(), i15);
                                                            xf0Var.e(r51VarK4, r51Var3, -npVar2.e(), i15);
                                                        }
                                                        if (z20) {
                                                            if (r51Var == r51VarK5) {
                                                                iE = npVar.e();
                                                            } else {
                                                                iE = 0;
                                                            }
                                                            if (r51VarK5 != r51Var) {
                                                                xf0Var.f(r51VarK3, r51Var, iE, 5);
                                                            }
                                                        }
                                                        if (!z20 && z14 && i4 == 0 && i11 == 0) {
                                                            if (z14 && i27 == 3) {
                                                                xf0Var.f(r51VarK4, r51VarK3, 0, 8);
                                                            } else {
                                                                xf0Var.f(r51VarK4, r51VarK3, 0, 5);
                                                            }
                                                        }
                                                    } else {
                                                        if (r51VarK5.h && r51Var3.h) {
                                                            xf0Var.b(r51VarK3, r51VarK5, npVar.e(), f, r51Var3, r51VarK4, npVar2.e(), 8);
                                                            if (z2 && z15) {
                                                                int iE2 = npVar2.f != null ? npVar2.e() : 0;
                                                                if (r51Var3 != r51Var2) {
                                                                    xf0Var.f(r51Var2, r51VarK4, iE2, 5);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        i12 = 5;
                                                        i13 = 6;
                                                        i14 = 4;
                                                        z16 = true;
                                                        z17 = true;
                                                    }
                                                    z18 = false;
                                                    if (z17) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    if (z16) {
                                                        if (z14) {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        } else {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        }
                                                        r51 r51Var5 = r51VarK5;
                                                        bqVar = bqVar4;
                                                        xf0Var.b(r51VarK3, r51Var5, npVar.e(), f, r51Var3, r51VarK4, npVar2.e(), i13);
                                                        r51VarK5 = r51Var5;
                                                        i12 = i17;
                                                        z19 = z22;
                                                    } else {
                                                        bqVar = bqVar4;
                                                        z20 = z2;
                                                    }
                                                    if (this.g0 != 8) {
                                                    }
                                                    if (z17) {
                                                        if (z20) {
                                                            i12 = 6;
                                                        }
                                                        xf0Var.f(r51VarK3, r51VarK5, npVar.e(), i12);
                                                        xf0Var.g(r51VarK4, r51Var3, -npVar2.e(), i12);
                                                    }
                                                    if (z20) {
                                                        iMin2 = i14;
                                                        z21 = z19;
                                                    } else {
                                                        iMin2 = i14;
                                                        z21 = z19;
                                                    }
                                                    if (z21) {
                                                        if (z18) {
                                                            if (bqVar3 != bqVar5) {
                                                                i32 = iMin2;
                                                            }
                                                            if (bqVar3 instanceof k70) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (bqVar3 instanceof zf) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (z9) {
                                                                i16 = 5;
                                                            } else {
                                                                i16 = i32;
                                                            }
                                                            iMin2 = Math.max(i16, iMin2);
                                                        }
                                                        if (z20) {
                                                            iMin2 = Math.min(i12, iMin2);
                                                            if (z6) {
                                                                i15 = iMin2;
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                        } else {
                                                            i15 = iMin2;
                                                        }
                                                        xf0Var.e(r51VarK3, r51VarK5, npVar.e(), i15);
                                                        xf0Var.e(r51VarK4, r51Var3, -npVar2.e(), i15);
                                                    }
                                                    if (z20) {
                                                        if (r51Var == r51VarK5) {
                                                            iE = npVar.e();
                                                        } else {
                                                            iE = 0;
                                                        }
                                                        if (r51VarK5 != r51Var) {
                                                            xf0Var.f(r51VarK3, r51Var, iE, 5);
                                                        }
                                                    }
                                                    if (!z20) {
                                                    }
                                                }
                                                i22 = 5;
                                            } else {
                                                r51Var3 = r51VarK6;
                                                xf0Var.e(r51VarK4, r51Var3, -npVar2.e(), 8);
                                                if (z2) {
                                                    xf0Var.f(r51VarK3, r51Var, 0, 5);
                                                }
                                            }
                                            if (z20 || !z15) {
                                                return;
                                            }
                                            int iE3 = npVar2.f != null ? npVar2.e() : 0;
                                            if (r51Var3 != r51Var2) {
                                                xf0Var.f(r51Var2, r51VarK4, iE3, i22);
                                                return;
                                            }
                                            return;
                                        }
                                        r51Var3 = r51VarK6;
                                        z20 = z2;
                                        i22 = 5;
                                        if (z20) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (z5) {
                                        xf0Var.e(r51VarK4, r51VarK3, 0, 3);
                                        if (i4 > 0) {
                                            xf0Var.f(r51VarK4, r51VarK3, i4, i10);
                                        }
                                        if (i5 < Integer.MAX_VALUE) {
                                            xf0Var.g(r51VarK4, r51VarK3, i5, i10);
                                        }
                                    } else {
                                        xf0Var.e(r51VarK4, r51VarK3, iMin, i10);
                                    }
                                    z15 = z4;
                                    i11 = i23;
                                    if (z11) {
                                    }
                                    boolean z29 = z15;
                                    if (i26 >= 2) {
                                    }
                                }

                                public final void e(int i, bq bqVar, int i2, int i3) {
                                    boolean z;
                                    if (i == 7) {
                                        if (i2 != 7) {
                                            if (i2 == 2 || i2 == 4) {
                                                e(2, bqVar, i2, 0);
                                                e(4, bqVar, i2, 0);
                                                i(7).a(bqVar.i(i2), 0);
                                                return;
                                            } else {
                                                if (i2 == 3 || i2 == 5) {
                                                    e(3, bqVar, i2, 0);
                                                    e(5, bqVar, i2, 0);
                                                    i(7).a(bqVar.i(i2), 0);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        np npVarI = i(2);
                                        np npVarI2 = i(4);
                                        np npVarI3 = i(3);
                                        np npVarI4 = i(5);
                                        boolean z2 = true;
                                        if ((npVarI == null || !npVarI.h()) && (npVarI2 == null || !npVarI2.h())) {
                                            e(2, bqVar, 2, 0);
                                            e(4, bqVar, 4, 0);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if ((npVarI3 == null || !npVarI3.h()) && (npVarI4 == null || !npVarI4.h())) {
                                            e(3, bqVar, 3, 0);
                                            e(5, bqVar, 5, 0);
                                        } else {
                                            z2 = false;
                                        }
                                        if (z && z2) {
                                            i(7).a(bqVar.i(7), 0);
                                            return;
                                        } else if (z) {
                                            i(8).a(bqVar.i(8), 0);
                                            return;
                                        } else {
                                            if (z2) {
                                                i(9).a(bqVar.i(9), 0);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (i == 8 && (i2 == 2 || i2 == 4)) {
                                        np npVarI5 = i(2);
                                        np npVarI6 = bqVar.i(i2);
                                        np npVarI7 = i(4);
                                        npVarI5.a(npVarI6, 0);
                                        npVarI7.a(npVarI6, 0);
                                        i(8).a(npVarI6, 0);
                                        return;
                                    }
                                    if (i == 9 && (i2 == 3 || i2 == 5)) {
                                        np npVarI8 = bqVar.i(i2);
                                        i(3).a(npVarI8, 0);
                                        i(5).a(npVarI8, 0);
                                        i(9).a(npVarI8, 0);
                                        return;
                                    }
                                    if (i == 8 && i2 == 8) {
                                        i(2).a(bqVar.i(2), 0);
                                        i(4).a(bqVar.i(4), 0);
                                        i(8).a(bqVar.i(i2), 0);
                                        return;
                                    }
                                    if (i == 9 && i2 == 9) {
                                        i(3).a(bqVar.i(3), 0);
                                        i(5).a(bqVar.i(5), 0);
                                        i(9).a(bqVar.i(i2), 0);
                                        return;
                                    }
                                    np npVarI9 = i(i);
                                    np npVarI10 = bqVar.i(i2);
                                    if (npVarI9.i(npVarI10)) {
                                        if (i == 6) {
                                            np npVarI11 = i(3);
                                            np npVarI12 = i(5);
                                            if (npVarI11 != null) {
                                                npVarI11.j();
                                            }
                                            if (npVarI12 != null) {
                                                npVarI12.j();
                                            }
                                        } else if (i == 3 || i == 5) {
                                            np npVarI13 = i(6);
                                            if (npVarI13 != null) {
                                                npVarI13.j();
                                            }
                                            np npVarI14 = i(7);
                                            if (npVarI14.f != npVarI10) {
                                                npVarI14.j();
                                            }
                                            np npVarF = i(i).f();
                                            np npVarI15 = i(9);
                                            if (npVarI15.h()) {
                                                npVarF.j();
                                                npVarI15.j();
                                            }
                                        } else if (i == 2 || i == 4) {
                                            np npVarI16 = i(7);
                                            if (npVarI16.f != npVarI10) {
                                                npVarI16.j();
                                            }
                                            np npVarF2 = i(i).f();
                                            np npVarI17 = i(8);
                                            if (npVarI17.h()) {
                                                npVarF2.j();
                                                npVarI17.j();
                                            }
                                        }
                                        npVarI9.a(npVarI10, i3);
                                    }
                                }

                                public final void f(np npVar, np npVar2, int i) {
                                    if (npVar.d == this) {
                                        e(npVar.e, npVar2.d, npVar2.e, i);
                                    }
                                }

                                public final void g(xf0 xf0Var) {
                                    xf0Var.k(this.I);
                                    xf0Var.k(this.J);
                                    xf0Var.k(this.K);
                                    xf0Var.k(this.L);
                                    if (this.a0 > 0) {
                                        xf0Var.k(this.M);
                                    }
                                }

                                public final void h() {
                                    if (this.d == null) {
                                        y70 y70Var = new y70(this);
                                        y70Var.h.e = 4;
                                        y70Var.i.e = 5;
                                        y70Var.f = 0;
                                        this.d = y70Var;
                                    }
                                    if (this.e == null) {
                                        zd1 zd1Var = new zd1(this);
                                        kt ktVar = new kt(zd1Var);
                                        zd1Var.k = ktVar;
                                        zd1Var.l = null;
                                        zd1Var.h.e = 6;
                                        zd1Var.i.e = 7;
                                        ktVar.e = 8;
                                        zd1Var.f = 1;
                                        this.e = zd1Var;
                                    }
                                }

                                public np i(int i) {
                                    switch (q51.r(i)) {
                                        case 0:
                                            return null;
                                        case 1:
                                            return this.I;
                                        case 2:
                                            return this.J;
                                        case 3:
                                            return this.K;
                                        case 4:
                                            return this.L;
                                        case 5:
                                            return this.M;
                                        case 6:
                                            return this.P;
                                        case 7:
                                            return this.N;
                                        case 8:
                                            return this.O;
                                        default:
                                            throw new AssertionError(q51.q(i));
                                    }
                                }

                                public final int j(int i) {
                                    int[] iArr = this.p0;
                                    if (i == 0) {
                                        return iArr[0];
                                    }
                                    if (i == 1) {
                                        return iArr[1];
                                    }
                                    return 0;
                                }

                                public final int k() {
                                    if (this.g0 == 8) {
                                        return 0;
                                    }
                                    return this.V;
                                }

                                public final bq l(int i) {
                                    np npVar;
                                    np npVar2;
                                    if (i != 0) {
                                        if (i == 1 && (npVar2 = (npVar = this.L).f) != null && npVar2.f == npVar) {
                                            return npVar2.d;
                                        }
                                        return null;
                                    }
                                    np npVar3 = this.K;
                                    np npVar4 = npVar3.f;
                                    if (npVar4 == null || npVar4.f != npVar3) {
                                        return null;
                                    }
                                    return npVar4.d;
                                }

                                public final bq m(int i) {
                                    np npVar;
                                    np npVar2;
                                    if (i != 0) {
                                        if (i == 1 && (npVar2 = (npVar = this.J).f) != null && npVar2.f == npVar) {
                                            return npVar2.d;
                                        }
                                        return null;
                                    }
                                    np npVar3 = this.I;
                                    np npVar4 = npVar3.f;
                                    if (npVar4 == null || npVar4.f != npVar3) {
                                        return null;
                                    }
                                    return npVar4.d;
                                }

                                public void n(StringBuilder sb) {
                                    sb.append("  " + this.j + ":{\n");
                                    StringBuilder sb2 = new StringBuilder("    actualWidth:");
                                    sb2.append(this.U);
                                    sb.append(sb2.toString());
                                    sb.append("\n");
                                    sb.append("    actualHeight:" + this.V);
                                    sb.append("\n");
                                    sb.append("    actualLeft:" + this.Y);
                                    sb.append("\n");
                                    sb.append("    actualTop:" + this.Z);
                                    sb.append("\n");
                                    p(sb, "left", this.I);
                                    p(sb, "top", this.J);
                                    p(sb, "right", this.K);
                                    p(sb, "bottom", this.L);
                                    p(sb, "baseline", this.M);
                                    p(sb, "centerX", this.N);
                                    p(sb, "centerY", this.O);
                                    int i = this.U;
                                    int i2 = this.b0;
                                    int[] iArr = this.C;
                                    int i3 = iArr[0];
                                    int i4 = this.u;
                                    int i5 = this.r;
                                    float f = this.w;
                                    int[] iArr2 = this.p0;
                                    int i6 = iArr2[0];
                                    float[] fArr = this.k0;
                                    float f2 = fArr[0];
                                    o(sb, "    width", i, i2, i3, i4, i5, f, i6);
                                    int i7 = this.V;
                                    int i8 = this.c0;
                                    int i9 = iArr[1];
                                    int i10 = this.x;
                                    int i11 = this.s;
                                    float f3 = this.z;
                                    int i12 = iArr2[1];
                                    float f4 = fArr[1];
                                    o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
                                    float f5 = this.W;
                                    int i13 = this.X;
                                    if (f5 != 0.0f) {
                                        sb.append("    dimensionRatio");
                                        sb.append(" :  [");
                                        sb.append(f5);
                                        sb.append(",");
                                        sb.append(i13);
                                        sb.append("");
                                        sb.append("],\n");
                                    }
                                    H(sb, "    horizontalBias", this.d0, 0.5f);
                                    H(sb, "    verticalBias", this.e0, 0.5f);
                                    G(this.i0, 0, "    horizontalChainStyle", sb);
                                    G(this.j0, 0, "    verticalChainStyle", sb);
                                    sb.append("  }");
                                }

                                public final int q() {
                                    if (this.g0 == 8) {
                                        return 0;
                                    }
                                    return this.U;
                                }

                                public final int r() {
                                    bq bqVar = this.T;
                                    return (bqVar == null || !(bqVar instanceof cq)) ? this.Y : ((cq) bqVar).x0 + this.Y;
                                }

                                public final int s() {
                                    bq bqVar = this.T;
                                    return (bqVar == null || !(bqVar instanceof cq)) ? this.Z : ((cq) bqVar).y0 + this.Z;
                                }

                                /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
                                /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
                                public final boolean t(int i) {
                                    if (i == 0) {
                                        if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2) {
                                        return true;
                                    }
                                    return false;
                                }

                                public String toString() {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("");
                                    sb.append(this.h0 != null ? q51.m(new StringBuilder("id: "), this.h0, " ") : "");
                                    sb.append("(");
                                    sb.append(this.Y);
                                    sb.append(", ");
                                    sb.append(this.Z);
                                    sb.append(") - (");
                                    sb.append(this.U);
                                    sb.append(" x ");
                                    sb.append(this.V);
                                    sb.append(")");
                                    return sb.toString();
                                }

                                public final boolean u(int i, int i2) {
                                    np npVar;
                                    np npVar2;
                                    np npVar3;
                                    np npVar4;
                                    if (i == 0) {
                                        np npVar5 = this.I;
                                        np npVar6 = npVar5.f;
                                        if (npVar6 == null || !npVar6.c || (npVar4 = (npVar3 = this.K).f) == null || !npVar4.c) {
                                            return false;
                                        }
                                        return (npVar4.d() - npVar3.e()) - (npVar5.e() + npVar5.f.d()) >= i2;
                                    }
                                    np npVar7 = this.J;
                                    np npVar8 = npVar7.f;
                                    if (npVar8 == null || !npVar8.c || (npVar2 = (npVar = this.L).f) == null || !npVar2.c) {
                                        return false;
                                    }
                                    return (npVar2.d() - npVar.e()) - (npVar7.e() + npVar7.f.d()) >= i2;
                                }

                                public final void v(int i, int i2, int i3, int i4, bq bqVar) {
                                    i(i).b(bqVar.i(i2), i3, i4, true);
                                }

                                public final boolean w(int i) {
                                    np npVar;
                                    np npVar2;
                                    int i2 = i * 2;
                                    np[] npVarArr = this.Q;
                                    np npVar3 = npVarArr[i2];
                                    np npVar4 = npVar3.f;
                                    return (npVar4 == null || npVar4.f == npVar3 || (npVar2 = (npVar = npVarArr[i2 + 1]).f) == null || npVar2.f != npVar) ? false : true;
                                }

                                public final boolean x() {
                                    np npVar = this.I;
                                    np npVar2 = npVar.f;
                                    if (npVar2 != null && npVar2.f == npVar) {
                                        return true;
                                    }
                                    np npVar3 = this.K;
                                    np npVar4 = npVar3.f;
                                    return npVar4 != null && npVar4.f == npVar3;
                                }

                                public final boolean y() {
                                    np npVar = this.J;
                                    np npVar2 = npVar.f;
                                    if (npVar2 != null && npVar2.f == npVar) {
                                        return true;
                                    }
                                    np npVar3 = this.L;
                                    np npVar4 = npVar3.f;
                                    return npVar4 != null && npVar4.f == npVar3;
                                }

                                public final boolean z() {
                                    return this.g && this.g0 != 8;
                                }
                            }
