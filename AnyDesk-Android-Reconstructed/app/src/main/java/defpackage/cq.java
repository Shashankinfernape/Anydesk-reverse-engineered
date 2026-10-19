package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cq extends bq {
    public int A0;
    public vj[] B0;
    public vj[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final hg L0;
    public ArrayList q0 = new ArrayList();
    public final y6 r0 = new y6(this);
    public final jt s0;
    public int t0;
    public sp u0;
    public boolean v0;
    public final xf0 w0;
    public int x0;
    public int y0;
    public int z0;

    public cq() {
        jt jtVar = new jt();
        jtVar.b = true;
        jtVar.c = true;
        jtVar.e = new ArrayList();
        new ArrayList();
        jtVar.f = null;
        jtVar.g = new hg();
        jtVar.h = new ArrayList();
        jtVar.a = this;
        jtVar.d = this;
        this.s0 = jtVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new xf0();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new vj[4];
        this.C0 = new vj[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new hg();
    }

    public static void V(bq bqVar, sp spVar, hg hgVar) {
        int i;
        int i2;
        if (spVar == null) {
            return;
        }
        int i3 = bqVar.g0;
        int[] iArr = bqVar.t;
        if (i3 == 8 || (bqVar instanceof k70) || (bqVar instanceof zf)) {
            hgVar.e = 0;
            hgVar.f = 0;
            return;
        }
        int[] iArr2 = bqVar.p0;
        hgVar.a = iArr2[0];
        hgVar.b = iArr2[1];
        hgVar.c = bqVar.q();
        hgVar.d = bqVar.k();
        hgVar.i = false;
        hgVar.j = 0;
        boolean z = hgVar.a == 3;
        boolean z2 = hgVar.b == 3;
        boolean z3 = z && bqVar.W > 0.0f;
        boolean z4 = z2 && bqVar.W > 0.0f;
        if (z && bqVar.t(0) && bqVar.r == 0 && !z3) {
            hgVar.a = 2;
            if (z2 && bqVar.s == 0) {
                hgVar.a = 1;
            }
            z = false;
        }
        if (z2 && bqVar.t(1) && bqVar.s == 0 && !z4) {
            hgVar.b = 2;
            if (z && bqVar.r == 0) {
                hgVar.b = 1;
            }
            z2 = false;
        }
        if (bqVar.A()) {
            hgVar.a = 1;
            z = false;
        }
        if (bqVar.B()) {
            hgVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                hgVar.a = 1;
            } else if (!z2) {
                if (hgVar.b == 1) {
                    i2 = hgVar.d;
                } else {
                    hgVar.a = 2;
                    spVar.b(bqVar, hgVar);
                    i2 = hgVar.f;
                }
                hgVar.a = 1;
                hgVar.c = (int) (bqVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                hgVar.b = 1;
            } else if (!z) {
                if (hgVar.a == 1) {
                    i = hgVar.c;
                } else {
                    hgVar.b = 2;
                    spVar.b(bqVar, hgVar);
                    i = hgVar.e;
                }
                hgVar.b = 1;
                int i4 = bqVar.X;
                float f = bqVar.W;
                if (i4 == -1) {
                    hgVar.d = (int) (i / f);
                } else {
                    hgVar.d = (int) (f * i);
                }
            }
        }
        spVar.b(bqVar, hgVar);
        bqVar.O(hgVar.e);
        bqVar.L(hgVar.f);
        bqVar.E = hgVar.h;
        bqVar.I(hgVar.g);
        hgVar.j = 0;
    }

    @Override // defpackage.bq
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.bq
    public final void F(y6 y6Var) {
        super.F(y6Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((bq) this.q0.get(i)).F(y6Var);
        }
    }

    @Override // defpackage.bq
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((bq) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(bq bqVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            vj[] vjVarArr = this.C0;
            if (i2 >= vjVarArr.length) {
                this.C0 = (vj[]) Arrays.copyOf(vjVarArr, vjVarArr.length * 2);
            }
            vj[] vjVarArr2 = this.C0;
            int i3 = this.z0;
            vjVarArr2[i3] = new vj(bqVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            vj[] vjVarArr3 = this.B0;
            if (i4 >= vjVarArr3.length) {
                this.B0 = (vj[]) Arrays.copyOf(vjVarArr3, vjVarArr3.length * 2);
            }
            vj[] vjVarArr4 = this.B0;
            int i5 = this.A0;
            vjVarArr4[i5] = new vj(bqVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(xf0 xf0Var) {
        xf0 xf0Var2;
        boolean zW = W(64);
        b(xf0Var, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            bq bqVar = (bq) this.q0.get(i);
            boolean[] zArr = bqVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (bqVar instanceof zf) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                bq bqVar2 = (bq) this.q0.get(i2);
                if (bqVar2 instanceof zf) {
                    zf zfVar = (zf) bqVar2;
                    for (int i3 = 0; i3 < zfVar.r0; i3++) {
                        bq bqVar3 = zfVar.q0[i3];
                        if (zfVar.t0 || bqVar3.c()) {
                            int i4 = zfVar.s0;
                            if (i4 == 0 || i4 == 1) {
                                bqVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                bqVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            bq bqVar4 = (bq) this.q0.get(i5);
            bqVar4.getClass();
            boolean z2 = bqVar4 instanceof u10;
            if (z2 || (bqVar4 instanceof k70)) {
                if (z2) {
                    hashSet.add(bqVar4);
                } else {
                    bqVar4.b(xf0Var, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u10 u10Var = (u10) ((bq) it.next());
                for (int i6 = 0; i6 < u10Var.r0; i6++) {
                    if (hashSet.contains(u10Var.q0[i6])) {
                        u10Var.b(xf0Var, zW);
                        hashSet.remove(u10Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((bq) it2.next()).b(xf0Var, zW);
                }
                hashSet.clear();
            }
        }
        if (xf0.q) {
            HashSet<bq> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                bq bqVar5 = (bq) this.q0.get(i7);
                bqVar5.getClass();
                if (!(bqVar5 instanceof u10) && !(bqVar5 instanceof k70)) {
                    hashSet2.add(bqVar5);
                }
            }
            xf0Var2 = xf0Var;
            a(this, xf0Var2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            for (bq bqVar6 : hashSet2) {
                th1.c(this, xf0Var2, bqVar6);
                bqVar6.b(xf0Var2, zW);
            }
        } else {
            xf0Var2 = xf0Var;
            for (int i8 = 0; i8 < size; i8++) {
                bq bqVar7 = (bq) this.q0.get(i8);
                if (bqVar7 instanceof cq) {
                    int[] iArr = bqVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        bqVar7.M(1);
                    }
                    if (i10 == 2) {
                        bqVar7.N(1);
                    }
                    bqVar7.b(xf0Var2, zW);
                    if (i9 == 2) {
                        bqVar7.M(i9);
                    }
                    if (i10 == 2) {
                        bqVar7.N(i10);
                    }
                } else {
                    th1.c(this, xf0Var2, bqVar7);
                    if (!(bqVar7 instanceof u10) && !(bqVar7 instanceof k70)) {
                        bqVar7.b(xf0Var2, zW);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            bu0.d(this, xf0Var2, null, 0);
        }
        if (this.A0 > 0) {
            bu0.d(this, xf0Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    public final boolean T(int i, boolean z) {
        boolean z2;
        boolean z3;
        jt jtVar = this.s0;
        ArrayList arrayList = jtVar.e;
        cq cqVar = jtVar.a;
        boolean z4 = false;
        int iJ = cqVar.j(0);
        int iJ2 = cqVar.j(1);
        int iR = cqVar.r();
        int iS = cqVar.s();
        if (z && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = z;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                hg1 hg1Var = (hg1) obj;
                if (hg1Var.f == i && !hg1Var.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && iJ == 2) {
                    cqVar.M(1);
                    cqVar.O(jtVar.d(cqVar, 0));
                    cqVar.d.e.d(cqVar.q());
                }
            } else if (z3 && iJ2 == 2) {
                cqVar.N(1);
                cqVar.L(jtVar.d(cqVar, 1));
                cqVar.e.e.d(cqVar.k());
            }
        }
        int[] iArr = cqVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iQ = cqVar.q() + iR;
                cqVar.d.i.d(iQ);
                cqVar.d.e.d(iQ - iR);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iK = cqVar.k() + iS;
                cqVar.e.i.d(iK);
                cqVar.e.e.d(iK - iS);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        jtVar.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            hg1 hg1Var2 = (hg1) obj2;
            if (hg1Var2.f == i && (hg1Var2.b != cqVar || hg1Var2.g)) {
                hg1Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            hg1 hg1Var3 = (hg1) obj3;
            if (hg1Var3.f == i && (z2 || hg1Var3.b != cqVar)) {
                if (!hg1Var3.h.j || !hg1Var3.i.j || (!(hg1Var3 instanceof wj) && !hg1Var3.e.j)) {
                    cqVar.M(iJ);
                    cqVar.N(iJ2);
                    return z4;
                }
            }
        }
        z4 = true;
        cqVar.M(iJ);
        cqVar.N(iJ2);
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:341:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:349:0x0605  */
    /* JADX WARN: Code duplicated, block: B:350:0x060c  */
    /* JADX WARN: Code duplicated, block: B:356:0x0620  */
    /* JADX WARN: Code duplicated, block: B:362:0x0639  */
    /* JADX WARN: Code duplicated, block: B:365:0x063f  */
    /* JADX WARN: Code duplicated, block: B:367:0x0647 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x0650  */
    /* JADX WARN: Code duplicated, block: B:370:0x0655  */
    /* JADX WARN: Code duplicated, block: B:375:0x0663  */
    /* JADX WARN: Code duplicated, block: B:379:0x066e  */
    /* JADX WARN: Code duplicated, block: B:382:0x0679 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:384:0x067f  */
    /* JADX WARN: Code duplicated, block: B:387:0x0687  */
    /* JADX WARN: Code duplicated, block: B:391:0x068e  */
    /* JADX WARN: Code duplicated, block: B:394:0x0698  */
    /* JADX WARN: Code duplicated, block: B:396:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:400:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:403:0x06c7 A[Catch: Exception -> 0x06d5, LOOP:12: B:402:0x06c5->B:403:0x06c7, LOOP_END, TryCatch #6 {Exception -> 0x06d5, blocks: (B:401:0x06b9, B:403:0x06c7, B:406:0x06de), top: B:540:0x06b9 }] */
    /* JADX WARN: Code duplicated, block: B:411:0x06eb A[Catch: Exception -> 0x0714, TRY_LEAVE, TryCatch #7 {Exception -> 0x0714, blocks: (B:409:0x06e5, B:411:0x06eb), top: B:542:0x06e5 }] */
    /* JADX WARN: Code duplicated, block: B:427:0x0718  */
    /* JADX WARN: Code duplicated, block: B:430:0x0720 A[Catch: Exception -> 0x0708, TryCatch #3 {Exception -> 0x0708, blocks: (B:416:0x0701, B:428:0x071c, B:430:0x0720, B:432:0x0726, B:433:0x0740, B:435:0x0744, B:437:0x074a, B:441:0x0760, B:444:0x076b, B:446:0x076f, B:448:0x0775), top: B:534:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0744 A[Catch: Exception -> 0x0708, TryCatch #3 {Exception -> 0x0708, blocks: (B:416:0x0701, B:428:0x071c, B:430:0x0720, B:432:0x0726, B:433:0x0740, B:435:0x0744, B:437:0x074a, B:441:0x0760, B:444:0x076b, B:446:0x076f, B:448:0x0775), top: B:534:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x076f A[Catch: Exception -> 0x0708, TryCatch #3 {Exception -> 0x0708, blocks: (B:416:0x0701, B:428:0x071c, B:430:0x0720, B:432:0x0726, B:433:0x0740, B:435:0x0744, B:437:0x074a, B:441:0x0760, B:444:0x076b, B:446:0x076f, B:448:0x0775), top: B:534:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:460:0x079a  */
    /* JADX WARN: Code duplicated, block: B:467:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:469:0x07de  */
    /* JADX WARN: Code duplicated, block: B:471:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:473:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:476:0x0802  */
    /* JADX WARN: Code duplicated, block: B:478:0x0809 A[LOOP:15: B:477:0x0807->B:478:0x0809, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:482:0x081c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:487:0x0829 A[LOOP:14: B:486:0x0827->B:487:0x0829, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:490:0x085e  */
    /* JADX WARN: Code duplicated, block: B:494:0x0870  */
    /* JADX WARN: Code duplicated, block: B:499:0x0890  */
    /* JADX WARN: Code duplicated, block: B:500:0x089c  */
    /* JADX WARN: Code duplicated, block: B:503:0x08af  */
    /* JADX WARN: Code duplicated, block: B:504:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:506:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:508:0x08c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:514:0x08d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:519:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:521:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:525:0x0904  */
    /* JADX WARN: Code duplicated, block: B:542:0x06e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    public final void U() {
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        np npVar;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i5;
        int i6;
        boolean zW;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        Object obj2;
        boolean z7;
        int i9;
        int iMax;
        ?? r8;
        boolean z8;
        int iMax2;
        boolean z9;
        int i10;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i12;
        bq bqVar;
        int i13;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        np npVar2;
        bq bqVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        gg1 gg1Var;
        gg1 gg1Var2;
        int i18;
        int iQ;
        int size2;
        int i19;
        int i20;
        gg1 gg1Var3;
        int iB;
        int iB2;
        gg1 gg1Var4;
        gg1 gg1Var5;
        int i21;
        boolean z10;
        boolean[] zArr = th1.g;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size3 = this.q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.p0;
        int i22 = iArr[1];
        int i23 = iArr[0];
        int i24 = this.t0;
        np npVar3 = this.J;
        np npVar4 = this.I;
        if (i24 == 0 && th1.p(this.D0, 1)) {
            sp spVar = this.u0;
            int i25 = iArr[0];
            int i26 = iArr[1];
            E();
            ArrayList arrayList = this.q0;
            int size4 = arrayList.size();
            for (int i27 = 0; i27 < size4; i27++) {
                ((bq) arrayList.get(i27)).E();
            }
            boolean z11 = this.v0;
            if (i25 == 1) {
                J(0, q());
            } else {
                npVar4.l(0);
                this.Y = 0;
            }
            int i28 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i28 < size4) {
                int i29 = i28;
                bq bqVar3 = (bq) arrayList.get(i28);
                int[] iArr2 = iArr;
                if (bqVar3 instanceof k70) {
                    k70 k70Var = (k70) bqVar3;
                    z10 = z12;
                    if (k70Var.u0 == 1) {
                        int i30 = k70Var.r0;
                        if (i30 != -1) {
                            k70Var.R(i30);
                        } else if (k70Var.s0 != -1 && A()) {
                            k70Var.R(q() - k70Var.s0);
                        } else if (A()) {
                            k70Var.R((int) ((k70Var.q0 * q()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else {
                    z10 = z12;
                    if ((bqVar3 instanceof zf) && ((zf) bqVar3).U() == 0) {
                        z12 = z10;
                        z13 = true;
                    }
                    i28 = i29 + 1;
                    iArr = iArr2;
                }
                z12 = z10;
                i28 = i29 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z12) {
                for (int i31 = 0; i31 < size4; i31 = i21 + 1) {
                    bq bqVar4 = (bq) arrayList.get(i31);
                    if (bqVar4 instanceof k70) {
                        k70 k70Var2 = (k70) bqVar4;
                        i21 = i31;
                        if (k70Var2.u0 == 1) {
                            bu0.t(0, spVar, k70Var2, z11);
                        }
                    } else {
                        i21 = i31;
                    }
                }
            }
            bu0.t(0, spVar, this, z11);
            if (z13) {
                for (int i32 = 0; i32 < size4; i32++) {
                    bq bqVar5 = (bq) arrayList.get(i32);
                    if (bqVar5 instanceof zf) {
                        zf zfVar = (zf) bqVar5;
                        if (zfVar.U() == 0 && zfVar.T()) {
                            bu0.t(1, spVar, zfVar, z11);
                        }
                    }
                }
            }
            if (i26 == 1) {
                K(0, k());
            } else {
                npVar3.l(0);
                this.Z = 0;
            }
            int i33 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i33 < size4) {
                bq bqVar6 = (bq) arrayList.get(i33);
                int i34 = i33;
                if (bqVar6 instanceof k70) {
                    k70 k70Var3 = (k70) bqVar6;
                    if (k70Var3.u0 == 0) {
                        int i35 = k70Var3.r0;
                        if (i35 != -1) {
                            k70Var3.R(i35);
                        } else if (k70Var3.s0 != -1 && B()) {
                            k70Var3.R(k() - k70Var3.s0);
                        } else if (B()) {
                            k70Var3.R((int) ((k70Var3.q0 * k()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else if ((bqVar6 instanceof zf) && ((zf) bqVar6).U() == 1) {
                    z15 = true;
                }
                i33 = i34 + 1;
            }
            if (z14) {
                for (int i36 = 0; i36 < size4; i36++) {
                    bq bqVar7 = (bq) arrayList.get(i36);
                    if (bqVar7 instanceof k70) {
                        k70 k70Var4 = (k70) bqVar7;
                        if (k70Var4.u0 == 0) {
                            bu0.N(1, spVar, k70Var4);
                        }
                    }
                }
            }
            bu0.N(0, spVar, this);
            if (z15) {
                for (int i37 = 0; i37 < size4; i37++) {
                    bq bqVar8 = (bq) arrayList.get(i37);
                    if (bqVar8 instanceof zf) {
                        zf zfVar2 = (zf) bqVar8;
                        if (zfVar2.U() == 1 && zfVar2.T()) {
                            bu0.N(1, spVar, zfVar2);
                        }
                    }
                }
            }
            for (int i38 = 0; i38 < size4; i38++) {
                bq bqVar9 = (bq) arrayList.get(i38);
                if (bqVar9.z() && bu0.f(bqVar9)) {
                    V(bqVar9, spVar, bu0.c);
                    if (!(bqVar9 instanceof k70)) {
                        bu0.t(0, spVar, bqVar9, z11);
                        bu0.N(0, spVar, bqVar9);
                    } else if (((k70) bqVar9).u0 == 0) {
                        bu0.N(0, spVar, bqVar9);
                    } else {
                        bu0.t(0, spVar, bqVar9, z11);
                    }
                }
            }
            for (int i39 = 0; i39 < size3; i39++) {
                bq bqVar10 = (bq) this.q0.get(i39);
                if (bqVar10.z() && !(bqVar10 instanceof k70) && !(bqVar10 instanceof zf) && !(bqVar10 instanceof u10) && !bqVar10.F) {
                    int iJ = bqVar10.j(0);
                    int iJ2 = bqVar10.j(1);
                    if (iJ != 3 || bqVar10.r == 1 || iJ2 != 3 || bqVar10.s == 1) {
                        V(bqVar10, this.u0, new hg());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        xf0 xf0Var = this.w0;
        if (size3 <= 2 || !((i23 == 2 || i22 == 2) && th1.p(this.D0, 1024))) {
            i = iMax7;
            i2 = size3;
            i3 = i22;
            i4 = i23;
            obj = npVar3;
            npVar = npVar4;
        } else {
            sp spVar2 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size5 = arrayList2.size();
            int i40 = 0;
            while (true) {
                if (i40 < size5) {
                    bq bqVar11 = (bq) arrayList2.get(i40);
                    char c3 = objArr[0];
                    char c4 = objArr[1];
                    int i41 = i40;
                    int[] iArr3 = bqVar11.p0;
                    npVar = npVar4;
                    if (y90.Y(c3, c4, iArr3[0], iArr3[1]) && !(bqVar11 instanceof u10)) {
                        i40 = i41 + 1;
                        npVar4 = npVar;
                    } else {
                        i14 = iMax7;
                        i2 = size3;
                        i15 = iMax8;
                        i16 = i22;
                        i17 = i23;
                        obj = npVar3;
                    }
                } else {
                    npVar = npVar4;
                    i2 = size3;
                    obj = npVar3;
                    int i42 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i42 < size5) {
                        int i43 = i42;
                        bq bqVar12 = (bq) arrayList2.get(i42);
                        int i44 = iMax8;
                        char c5 = objArr[0];
                        int i45 = i22;
                        char c6 = objArr[1];
                        int i46 = iMax7;
                        int[] iArr4 = bqVar12.p0;
                        int i47 = i23;
                        if (!y90.Y(c5, c6, iArr4[0], iArr4[1])) {
                            V(bqVar12, spVar2, this.L0);
                        }
                        boolean z16 = bqVar12 instanceof k70;
                        if (z16) {
                            k70 k70Var5 = (k70) bqVar12;
                            if (k70Var5.u0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(k70Var5);
                            }
                            if (k70Var5.u0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(k70Var5);
                            }
                        }
                        if (bqVar12 instanceof v70) {
                            if (bqVar12 instanceof zf) {
                                zf zfVar3 = (zf) bqVar12;
                                if (zfVar3.U() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(zfVar3);
                                }
                                if (zfVar3.U() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(zfVar3);
                                }
                            } else {
                                v70 v70Var = (v70) bqVar12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(v70Var);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(v70Var);
                            }
                        }
                        if (bqVar12.I.f == null && bqVar12.K.f == null && !z16 && !(bqVar12 instanceof zf)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(bqVar12);
                        }
                        if (bqVar12.J.f == null && bqVar12.L.f == null && bqVar12.M.f == null && !z16 && !(bqVar12 instanceof zf)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(bqVar12);
                        }
                        i42 = i43 + 1;
                        iMax8 = i44;
                        i22 = i45;
                        iMax7 = i46;
                        i23 = i47;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i22;
                    i17 = i23;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size6 = arrayList3.size();
                        int i48 = 0;
                        while (i48 < size6) {
                            Object obj3 = arrayList3.get(i48);
                            i48++;
                            y90.o((k70) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i49 = 0;
                        while (i49 < size7) {
                            Object obj4 = arrayList5.get(i49);
                            i49++;
                            v70 v70Var2 = (v70) obj4;
                            gg1 gg1VarO = y90.o(v70Var2, 0, arrayList9, null);
                            v70Var2.R(0, gg1VarO, arrayList9);
                            gg1VarO.a(arrayList9);
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            y90.o(((np) it.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            y90.o(((np) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            y90.o(((np) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i50 = 0;
                        while (i50 < size8) {
                            Object obj5 = arrayList6.get(i50);
                            i50++;
                            y90.o((bq) obj5, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i51 = 0;
                        while (i51 < size9) {
                            Object obj6 = arrayList7.get(i51);
                            i51++;
                            y90.o((k70) obj6, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i52 = 0;
                        while (i52 < size10) {
                            Object obj7 = arrayList8.get(i52);
                            i52++;
                            v70 v70Var3 = (v70) obj7;
                            gg1 gg1VarO2 = y90.o(v70Var3, 1, arrayList9, null);
                            v70Var3.R(1, gg1VarO2, arrayList9);
                            gg1VarO2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            y90.o(((np) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            y90.o(((np) it5.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            y90.o(((np) it6.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            y90.o(((np) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size11 = arrayList4.size();
                        int i53 = 0;
                        while (i53 < size11) {
                            Object obj8 = arrayList4.get(i53);
                            i53++;
                            y90.o((bq) obj8, 1, arrayList9, null);
                        }
                    }
                    char c7 = 1;
                    int i54 = 0;
                    while (i54 < size5) {
                        bq bqVar13 = (bq) arrayList2.get(i54);
                        int[] iArr5 = bqVar13.p0;
                        if (iArr5[0] == 3 && iArr5[c7] == 3) {
                            int i55 = bqVar13.n0;
                            int size12 = arrayList9.size();
                            int i56 = 0;
                            while (true) {
                                if (i56 >= size12) {
                                    gg1Var4 = null;
                                    break;
                                }
                                gg1Var4 = (gg1) arrayList9.get(i56);
                                if (i55 == gg1Var4.b) {
                                    break;
                                } else {
                                    i56++;
                                }
                            }
                            int i57 = bqVar13.o0;
                            int size13 = arrayList9.size();
                            int i58 = 0;
                            while (true) {
                                if (i58 >= size13) {
                                    gg1Var5 = null;
                                    break;
                                }
                                gg1Var5 = (gg1) arrayList9.get(i58);
                                if (i57 == gg1Var5.b) {
                                    break;
                                } else {
                                    i58++;
                                }
                            }
                            if (gg1Var4 != null && gg1Var5 != null) {
                                gg1Var4.c(0, gg1Var5);
                                gg1Var5.c = 2;
                                arrayList9.remove(gg1Var4);
                            }
                        }
                        i54++;
                        c7 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (objArr[0] == 2) {
                            int size14 = arrayList9.size();
                            int i59 = 0;
                            int i60 = 0;
                            gg1Var = null;
                            while (i60 < size14) {
                                Object obj9 = arrayList9.get(i60);
                                i60++;
                                gg1 gg1Var6 = (gg1) obj9;
                                if (gg1Var6.c != 1 && (iB2 = gg1Var6.b(xf0Var, 0)) > i59) {
                                    gg1Var = gg1Var6;
                                    i59 = iB2;
                                }
                            }
                            c2 = 1;
                            if (gg1Var != null) {
                                M(1);
                                O(i59);
                            }
                            if (objArr[c2] == 2) {
                                size2 = arrayList9.size();
                                i19 = 0;
                                i20 = 0;
                                gg1Var2 = null;
                                while (i20 < size2) {
                                    Object obj10 = arrayList9.get(i20);
                                    i20++;
                                    gg1Var3 = (gg1) obj10;
                                    if (gg1Var3.c != 0 && (iB = gg1Var3.b(xf0Var, 1)) > i19) {
                                        gg1Var2 = gg1Var3;
                                        i19 = iB;
                                    }
                                }
                                if (gg1Var2 != null) {
                                    N(1);
                                    L(i19);
                                } else {
                                    gg1Var2 = null;
                                }
                            } else {
                                gg1Var2 = null;
                            }
                            if (gg1Var == null || gg1Var2 != null) {
                                i4 = i17;
                                if (i4 == 2) {
                                    i18 = i14;
                                    if (i18 < q() || i18 <= 0) {
                                        iQ = q();
                                    } else {
                                        O(i18);
                                        this.E0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        iMax8 = i15;
                                        if (iMax8 < k() || iMax8 <= 0) {
                                            iMax8 = k();
                                        } else {
                                            L(iMax8);
                                            this.F0 = true;
                                        }
                                    } else {
                                        iMax8 = i15;
                                    }
                                    i = iQ;
                                    z = true;
                                } else {
                                    i18 = i14;
                                }
                                iQ = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    iMax8 = i15;
                                    if (iMax8 < k()) {
                                        iMax8 = k();
                                    } else {
                                        iMax8 = k();
                                    }
                                } else {
                                    iMax8 = i15;
                                }
                                i = iQ;
                                z = true;
                            }
                            if (!W(64) || W(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xf0Var.getClass();
                            xf0Var.h = false;
                            if (this.D0 == 0 && z2) {
                                c = 1;
                                xf0Var.h = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.q0;
                            if (objArr[0] != 2 || objArr[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i5 = i2;
                            for (i6 = 0; i6 < i5; i6++) {
                                bqVar2 = (bq) this.q0.get(i6);
                                if (bqVar2 instanceof cq) {
                                    ((cq) bqVar2).U();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i7 = 0;
                            z5 = true;
                            while (z5) {
                                i8 = i7 + 1;
                                try {
                                    xf0Var.t();
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    g(xf0Var);
                                    for (i13 = 0; i13 < i5; i13++) {
                                        ((bq) this.q0.get(i13)).g(xf0Var);
                                    }
                                    S(xf0Var);
                                    try {
                                        weakReference = this.G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    obj2 = obj;
                                                    try {
                                                        try {
                                                            z7 = z3;
                                                            try {
                                                                xf0Var.f(xf0Var.k((np) this.G0.get()), xf0Var.k(obj2), 0, 5);
                                                                this.G0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z5 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                if (z5) {
                                                                    zArr[2] = false;
                                                                    zW2 = W(64);
                                                                    Q(xf0Var, zW2);
                                                                    size = this.q0.size();
                                                                    i12 = 0;
                                                                    z5 = false;
                                                                    while (i12 < size) {
                                                                        bqVar = (bq) this.q0.get(i12);
                                                                        bqVar.Q(xf0Var, zW2);
                                                                        boolean z17 = zW2;
                                                                        int i61 = size;
                                                                        if (bqVar.h == -1) {
                                                                            z5 = true;
                                                                        } else {
                                                                            z5 = true;
                                                                        }
                                                                        i12++;
                                                                        zW2 = z17;
                                                                        size = i61;
                                                                    }
                                                                } else {
                                                                    Q(xf0Var, zW);
                                                                    for (i9 = 0; i9 < i5; i9++) {
                                                                        ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                                                    }
                                                                    z5 = false;
                                                                }
                                                                if (z7) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i11 = 0; i11 < i5; i11++) {
                                                                        bq bqVar14 = (bq) this.q0.get(i11);
                                                                        iMax4 = Math.max(iMax4, bqVar14.q() + bqVar14.Y);
                                                                        iMax3 = Math.max(iMax3, bqVar14.k() + bqVar14.Z);
                                                                    }
                                                                    iMax5 = Math.max(this.b0, iMax4);
                                                                    iMax6 = Math.max(this.c0, iMax3);
                                                                    if (i4 == 2) {
                                                                        O(iMax5);
                                                                        objArr[0] = 2;
                                                                        z5 = true;
                                                                        z4 = true;
                                                                    }
                                                                    if (i3 == 2) {
                                                                        L(iMax6);
                                                                        objArr[1] = 2;
                                                                        z5 = true;
                                                                        z4 = true;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.b0, q());
                                                                if (iMax > q()) {
                                                                    O(iMax);
                                                                    r8 = 1;
                                                                    objArr[0] = 1;
                                                                    z5 = true;
                                                                    z8 = true;
                                                                } else {
                                                                    r8 = 1;
                                                                    z8 = z4;
                                                                }
                                                                iMax2 = Math.max(this.c0, k());
                                                                if (iMax2 > k()) {
                                                                    L(iMax2);
                                                                    objArr[r8] = r8;
                                                                    z9 = true;
                                                                    z5 = true;
                                                                } else {
                                                                    z9 = z8;
                                                                }
                                                                if (z9) {
                                                                    if (objArr[0] == 2) {
                                                                        this.E0 = r8;
                                                                        objArr[0] = r8;
                                                                        O(i);
                                                                        z9 = true;
                                                                        z5 = true;
                                                                    }
                                                                    if (objArr[r8] != 2) {
                                                                    }
                                                                    if (i8 > i10) {
                                                                        z5 = false;
                                                                    }
                                                                    z4 = z9;
                                                                    i7 = i8;
                                                                    z3 = z7;
                                                                    obj = obj2;
                                                                }
                                                                i10 = 8;
                                                                if (i8 > i10) {
                                                                    z5 = false;
                                                                }
                                                                z4 = z9;
                                                                i7 = i8;
                                                                z3 = z7;
                                                                obj = obj2;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z7 = z3;
                                                            z5 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (z5) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(xf0Var, zW2);
                                                                size = this.q0.size();
                                                                i12 = 0;
                                                                z5 = false;
                                                                while (i12 < size) {
                                                                    bqVar = (bq) this.q0.get(i12);
                                                                    bqVar.Q(xf0Var, zW2);
                                                                    boolean z18 = zW2;
                                                                    int i62 = size;
                                                                    if (bqVar.h == -1) {
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = true;
                                                                    }
                                                                    i12++;
                                                                    zW2 = z18;
                                                                    size = i62;
                                                                }
                                                            } else {
                                                                Q(xf0Var, zW);
                                                                while (i9 < i5) {
                                                                    ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                                                }
                                                                z5 = false;
                                                            }
                                                            if (z7) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    bq bqVar15 = (bq) this.q0.get(i11);
                                                                    iMax4 = Math.max(iMax4, bqVar15.q() + bqVar15.Y);
                                                                    iMax3 = Math.max(iMax3, bqVar15.k() + bqVar15.Z);
                                                                }
                                                                iMax5 = Math.max(this.b0, iMax4);
                                                                iMax6 = Math.max(this.c0, iMax3);
                                                                if (i4 == 2) {
                                                                    O(iMax5);
                                                                    objArr[0] = 2;
                                                                    z5 = true;
                                                                    z4 = true;
                                                                }
                                                                if (i3 == 2) {
                                                                    L(iMax6);
                                                                    objArr[1] = 2;
                                                                    z5 = true;
                                                                    z4 = true;
                                                                }
                                                            }
                                                            iMax = Math.max(this.b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r8 = 1;
                                                                objArr[0] = 1;
                                                                z5 = true;
                                                                z8 = true;
                                                            } else {
                                                                r8 = 1;
                                                                z8 = z4;
                                                            }
                                                            iMax2 = Math.max(this.c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                objArr[r8] = r8;
                                                                z9 = true;
                                                                z5 = true;
                                                            } else {
                                                                z9 = z8;
                                                            }
                                                            if (z9) {
                                                                if (objArr[0] == 2) {
                                                                    this.E0 = r8;
                                                                    objArr[0] = r8;
                                                                    O(i);
                                                                    z9 = true;
                                                                    z5 = true;
                                                                }
                                                                if (objArr[r8] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    z5 = false;
                                                                }
                                                                z4 = z9;
                                                                i7 = i8;
                                                                z3 = z7;
                                                                obj = obj2;
                                                            }
                                                            i10 = 8;
                                                            if (i8 > i10) {
                                                                z5 = false;
                                                            }
                                                            z4 = z9;
                                                            i7 = i8;
                                                            z3 = z7;
                                                            obj = obj2;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    obj2 = obj;
                                                    z7 = z3;
                                                }
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    npVar2 = npVar;
                                                    try {
                                                        npVar = npVar2;
                                                        xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                                                        this.H0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        npVar = npVar2;
                                                        z5 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        if (z5) {
                                                            zArr[2] = false;
                                                            zW2 = W(64);
                                                            Q(xf0Var, zW2);
                                                            size = this.q0.size();
                                                            i12 = 0;
                                                            z5 = false;
                                                            while (i12 < size) {
                                                                bqVar = (bq) this.q0.get(i12);
                                                                bqVar.Q(xf0Var, zW2);
                                                                boolean z19 = zW2;
                                                                int i63 = size;
                                                                if (bqVar.h == -1) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = true;
                                                                }
                                                                i12++;
                                                                zW2 = z19;
                                                                size = i63;
                                                            }
                                                        } else {
                                                            Q(xf0Var, zW);
                                                            while (i9 < i5) {
                                                                ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                                            }
                                                            z5 = false;
                                                        }
                                                        if (z7) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i11 < i5) {
                                                                bq bqVar16 = (bq) this.q0.get(i11);
                                                                iMax4 = Math.max(iMax4, bqVar16.q() + bqVar16.Y);
                                                                iMax3 = Math.max(iMax3, bqVar16.k() + bqVar16.Z);
                                                            }
                                                            iMax5 = Math.max(this.b0, iMax4);
                                                            iMax6 = Math.max(this.c0, iMax3);
                                                            if (i4 == 2) {
                                                                O(iMax5);
                                                                objArr[0] = 2;
                                                                z5 = true;
                                                                z4 = true;
                                                            }
                                                            if (i3 == 2) {
                                                                L(iMax6);
                                                                objArr[1] = 2;
                                                                z5 = true;
                                                                z4 = true;
                                                            }
                                                        }
                                                        iMax = Math.max(this.b0, q());
                                                        if (iMax > q()) {
                                                            O(iMax);
                                                            r8 = 1;
                                                            objArr[0] = 1;
                                                            z5 = true;
                                                            z8 = true;
                                                        } else {
                                                            r8 = 1;
                                                            z8 = z4;
                                                        }
                                                        iMax2 = Math.max(this.c0, k());
                                                        if (iMax2 > k()) {
                                                            L(iMax2);
                                                            objArr[r8] = r8;
                                                            z9 = true;
                                                            z5 = true;
                                                        } else {
                                                            z9 = z8;
                                                        }
                                                        if (z9) {
                                                            if (objArr[0] == 2) {
                                                                this.E0 = r8;
                                                                objArr[0] = r8;
                                                                O(i);
                                                                z9 = true;
                                                                z5 = true;
                                                            }
                                                            if (objArr[r8] != 2) {
                                                            }
                                                            if (i8 > i10) {
                                                                z5 = false;
                                                            }
                                                            z4 = z9;
                                                            i7 = i8;
                                                            z3 = z7;
                                                            obj = obj2;
                                                        }
                                                        i10 = 8;
                                                        if (i8 > i10) {
                                                            z5 = false;
                                                        }
                                                        z4 = z9;
                                                        i7 = i8;
                                                        z3 = z7;
                                                        obj = obj2;
                                                    }
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            xf0Var.f(xf0Var.k(this.K), xf0Var.k((np) this.J0.get()), 0, 5);
                                                            try {
                                                                this.J0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z5 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z5 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (z5) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(xf0Var, zW2);
                                                                size = this.q0.size();
                                                                i12 = 0;
                                                                z5 = false;
                                                                while (i12 < size) {
                                                                    bqVar = (bq) this.q0.get(i12);
                                                                    bqVar.Q(xf0Var, zW2);
                                                                    boolean z110 = zW2;
                                                                    int i64 = size;
                                                                    if (bqVar.h == -1) {
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = true;
                                                                    }
                                                                    i12++;
                                                                    zW2 = z110;
                                                                    size = i64;
                                                                }
                                                            } else {
                                                                Q(xf0Var, zW);
                                                                while (i9 < i5) {
                                                                    ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                                                }
                                                                z5 = false;
                                                            }
                                                            if (z7) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    bq bqVar17 = (bq) this.q0.get(i11);
                                                                    iMax4 = Math.max(iMax4, bqVar17.q() + bqVar17.Y);
                                                                    iMax3 = Math.max(iMax3, bqVar17.k() + bqVar17.Z);
                                                                }
                                                                iMax5 = Math.max(this.b0, iMax4);
                                                                iMax6 = Math.max(this.c0, iMax3);
                                                                if (i4 == 2) {
                                                                    O(iMax5);
                                                                    objArr[0] = 2;
                                                                    z5 = true;
                                                                    z4 = true;
                                                                }
                                                                if (i3 == 2) {
                                                                    L(iMax6);
                                                                    objArr[1] = 2;
                                                                    z5 = true;
                                                                    z4 = true;
                                                                }
                                                            }
                                                            iMax = Math.max(this.b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r8 = 1;
                                                                objArr[0] = 1;
                                                                z5 = true;
                                                                z8 = true;
                                                            } else {
                                                                r8 = 1;
                                                                z8 = z4;
                                                            }
                                                            iMax2 = Math.max(this.c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                objArr[r8] = r8;
                                                                z9 = true;
                                                                z5 = true;
                                                            } else {
                                                                z9 = z8;
                                                            }
                                                            if (z9) {
                                                                if (objArr[0] == 2) {
                                                                    this.E0 = r8;
                                                                    objArr[0] = r8;
                                                                    O(i);
                                                                    z9 = true;
                                                                    z5 = true;
                                                                }
                                                                if (objArr[r8] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    z5 = false;
                                                                }
                                                                z4 = z9;
                                                                i7 = i8;
                                                                z3 = z7;
                                                                obj = obj2;
                                                            }
                                                            i10 = 8;
                                                            if (i8 > i10) {
                                                                z5 = false;
                                                            }
                                                            z4 = z9;
                                                            i7 = i8;
                                                            z3 = z7;
                                                            obj = obj2;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                }
                                                xf0Var.p();
                                                z5 = true;
                                            } catch (Exception e8) {
                                                e = e8;
                                                obj2 = obj;
                                            }
                                        } else {
                                            obj2 = obj;
                                            z7 = z3;
                                            weakReference2 = this.I0;
                                            if (weakReference2 != null) {
                                                xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                                                this.I0 = null;
                                            }
                                            weakReference3 = this.H0;
                                            if (weakReference3 != null) {
                                                npVar2 = npVar;
                                                npVar = npVar2;
                                                xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference4 = this.J0;
                                            if (weakReference4 == null) {
                                            }
                                            xf0Var.p();
                                            z5 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        obj2 = obj;
                                        z7 = z3;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    obj2 = obj;
                                    z7 = z3;
                                }
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(xf0Var, zW2);
                                    size = this.q0.size();
                                    i12 = 0;
                                    z5 = false;
                                    while (i12 < size) {
                                        bqVar = (bq) this.q0.get(i12);
                                        bqVar.Q(xf0Var, zW2);
                                        boolean z111 = zW2;
                                        int i65 = size;
                                        if (bqVar.h == -1 || bqVar.i != -1) {
                                            z5 = true;
                                        }
                                        i12++;
                                        zW2 = z111;
                                        size = i65;
                                    }
                                } else {
                                    Q(xf0Var, zW);
                                    while (i9 < i5) {
                                        ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                    }
                                    z5 = false;
                                }
                                if (z7 && i8 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        bq bqVar18 = (bq) this.q0.get(i11);
                                        iMax4 = Math.max(iMax4, bqVar18.q() + bqVar18.Y);
                                        iMax3 = Math.max(iMax3, bqVar18.k() + bqVar18.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax4);
                                    iMax6 = Math.max(this.c0, iMax3);
                                    if (i4 == 2 && q() < iMax5) {
                                        O(iMax5);
                                        objArr[0] = 2;
                                        z5 = true;
                                        z4 = true;
                                    }
                                    if (i3 == 2 && k() < iMax6) {
                                        L(iMax6);
                                        objArr[1] = 2;
                                        z5 = true;
                                        z4 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r8 = 1;
                                    objArr[0] = 1;
                                    z5 = true;
                                    z8 = true;
                                } else {
                                    r8 = 1;
                                    z8 = z4;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    objArr[r8] = r8;
                                    z9 = true;
                                    z5 = true;
                                } else {
                                    z9 = z8;
                                }
                                if (z9) {
                                    if (objArr[0] == 2 && i > 0 && q() > i) {
                                        this.E0 = r8;
                                        objArr[0] = r8;
                                        O(i);
                                        z9 = true;
                                        z5 = true;
                                    }
                                    if (objArr[r8] != 2 && iMax8 > 0 && k() > iMax8) {
                                        this.F0 = r8;
                                        objArr[r8] = r8;
                                        L(iMax8);
                                        z9 = true;
                                        i10 = 8;
                                        z5 = true;
                                    }
                                    if (i8 > i10) {
                                        z5 = false;
                                    }
                                    z4 = z9;
                                    i7 = i8;
                                    z3 = z7;
                                    obj = obj2;
                                }
                                i10 = 8;
                                if (i8 > i10) {
                                    z5 = false;
                                }
                                z4 = z9;
                                i7 = i8;
                                z3 = z7;
                                obj = obj2;
                            }
                            z6 = z4;
                            this.q0 = arrayList10;
                            if (z6) {
                                objArr[0] = i4;
                                objArr[1] = i3;
                            }
                            F(xf0Var.m);
                        }
                        c2 = 1;
                        gg1Var = null;
                        if (objArr[c2] == 2) {
                            size2 = arrayList9.size();
                            i19 = 0;
                            i20 = 0;
                            gg1Var2 = null;
                            while (i20 < size2) {
                                Object obj11 = arrayList9.get(i20);
                                i20++;
                                gg1Var3 = (gg1) obj11;
                                if (gg1Var3.c != 0) {
                                    gg1Var2 = gg1Var3;
                                    i19 = iB;
                                }
                            }
                            if (gg1Var2 != null) {
                                N(1);
                                L(i19);
                            } else {
                                gg1Var2 = null;
                            }
                        } else {
                            gg1Var2 = null;
                        }
                        if (gg1Var == null) {
                        }
                        i4 = i17;
                        if (i4 == 2) {
                            i18 = i14;
                            if (i18 < q()) {
                            }
                            iQ = q();
                            i3 = i16;
                            if (i3 == 2) {
                                iMax8 = i15;
                                if (iMax8 < k()) {
                                    iMax8 = k();
                                } else {
                                    iMax8 = k();
                                }
                            } else {
                                iMax8 = i15;
                            }
                            i = iQ;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            xf0Var.getClass();
                            xf0Var.h = false;
                            if (this.D0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList11 = this.q0;
                            if (objArr[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i5 = i2;
                            while (i6 < i5) {
                                bqVar2 = (bq) this.q0.get(i6);
                                if (bqVar2 instanceof cq) {
                                    ((cq) bqVar2).U();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i7 = 0;
                            z5 = true;
                            while (z5) {
                                i8 = i7 + 1;
                                xf0Var.t();
                                this.z0 = 0;
                                this.A0 = 0;
                                g(xf0Var);
                                while (i13 < i5) {
                                    ((bq) this.q0.get(i13)).g(xf0Var);
                                }
                                S(xf0Var);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        obj2 = obj;
                                        z7 = z3;
                                        xf0Var.f(xf0Var.k((np) this.G0.get()), xf0Var.k(obj2), 0, 5);
                                        this.G0 = null;
                                    } else {
                                        obj2 = obj;
                                        z7 = z3;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        npVar2 = npVar;
                                        npVar = npVar2;
                                        xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    xf0Var.p();
                                    z5 = true;
                                } else {
                                    obj2 = obj;
                                    z7 = z3;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        npVar2 = npVar;
                                        npVar = npVar2;
                                        xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    xf0Var.p();
                                    z5 = true;
                                }
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(xf0Var, zW2);
                                    size = this.q0.size();
                                    i12 = 0;
                                    z5 = false;
                                    while (i12 < size) {
                                        bqVar = (bq) this.q0.get(i12);
                                        bqVar.Q(xf0Var, zW2);
                                        boolean z112 = zW2;
                                        int i66 = size;
                                        if (bqVar.h == -1) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        i12++;
                                        zW2 = z112;
                                        size = i66;
                                    }
                                } else {
                                    Q(xf0Var, zW);
                                    while (i9 < i5) {
                                        ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                    }
                                    z5 = false;
                                }
                                if (z7) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        bq bqVar19 = (bq) this.q0.get(i11);
                                        iMax4 = Math.max(iMax4, bqVar19.q() + bqVar19.Y);
                                        iMax3 = Math.max(iMax3, bqVar19.k() + bqVar19.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax4);
                                    iMax6 = Math.max(this.c0, iMax3);
                                    if (i4 == 2) {
                                        O(iMax5);
                                        objArr[0] = 2;
                                        z5 = true;
                                        z4 = true;
                                    }
                                    if (i3 == 2) {
                                        L(iMax6);
                                        objArr[1] = 2;
                                        z5 = true;
                                        z4 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r8 = 1;
                                    objArr[0] = 1;
                                    z5 = true;
                                    z8 = true;
                                } else {
                                    r8 = 1;
                                    z8 = z4;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    objArr[r8] = r8;
                                    z9 = true;
                                    z5 = true;
                                } else {
                                    z9 = z8;
                                }
                                if (z9) {
                                    if (objArr[0] == 2) {
                                        this.E0 = r8;
                                        objArr[0] = r8;
                                        O(i);
                                        z9 = true;
                                        z5 = true;
                                    }
                                    if (objArr[r8] != 2) {
                                    }
                                    if (i8 > i10) {
                                        z5 = false;
                                    }
                                    z4 = z9;
                                    i7 = i8;
                                    z3 = z7;
                                    obj = obj2;
                                }
                                i10 = 8;
                                if (i8 > i10) {
                                    z5 = false;
                                }
                                z4 = z9;
                                i7 = i8;
                                z3 = z7;
                                obj = obj2;
                            }
                            z6 = z4;
                            this.q0 = arrayList11;
                            if (z6) {
                                objArr[0] = i4;
                                objArr[1] = i3;
                            }
                            F(xf0Var.m);
                        }
                        i18 = i14;
                        iQ = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            iMax8 = i15;
                            if (iMax8 < k()) {
                                iMax8 = k();
                            } else {
                                iMax8 = k();
                            }
                        } else {
                            iMax8 = i15;
                        }
                        i = iQ;
                        z = true;
                        if (W(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        xf0Var.getClass();
                        xf0Var.h = false;
                        if (this.D0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList12 = this.q0;
                        if (objArr[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.z0 = 0;
                        this.A0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                            bqVar2 = (bq) this.q0.get(i6);
                            if (bqVar2 instanceof cq) {
                                ((cq) bqVar2).U();
                            }
                        }
                        zW = W(64);
                        z4 = z;
                        i7 = 0;
                        z5 = true;
                        while (z5) {
                            i8 = i7 + 1;
                            xf0Var.t();
                            this.z0 = 0;
                            this.A0 = 0;
                            g(xf0Var);
                            while (i13 < i5) {
                                ((bq) this.q0.get(i13)).g(xf0Var);
                            }
                            S(xf0Var);
                            weakReference = this.G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    obj2 = obj;
                                    z7 = z3;
                                    xf0Var.f(xf0Var.k((np) this.G0.get()), xf0Var.k(obj2), 0, 5);
                                    this.G0 = null;
                                } else {
                                    obj2 = obj;
                                    z7 = z3;
                                }
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    npVar2 = npVar;
                                    npVar = npVar2;
                                    xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                xf0Var.p();
                                z5 = true;
                            } else {
                                obj2 = obj;
                                z7 = z3;
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    npVar2 = npVar;
                                    npVar = npVar2;
                                    xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                xf0Var.p();
                                z5 = true;
                            }
                            if (z5) {
                                zArr[2] = false;
                                zW2 = W(64);
                                Q(xf0Var, zW2);
                                size = this.q0.size();
                                i12 = 0;
                                z5 = false;
                                while (i12 < size) {
                                    bqVar = (bq) this.q0.get(i12);
                                    bqVar.Q(xf0Var, zW2);
                                    boolean z113 = zW2;
                                    int i67 = size;
                                    if (bqVar.h == -1) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    i12++;
                                    zW2 = z113;
                                    size = i67;
                                }
                            } else {
                                Q(xf0Var, zW);
                                while (i9 < i5) {
                                    ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                                }
                                z5 = false;
                            }
                            if (z7) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i5) {
                                    bq bqVar110 = (bq) this.q0.get(i11);
                                    iMax4 = Math.max(iMax4, bqVar110.q() + bqVar110.Y);
                                    iMax3 = Math.max(iMax3, bqVar110.k() + bqVar110.Z);
                                }
                                iMax5 = Math.max(this.b0, iMax4);
                                iMax6 = Math.max(this.c0, iMax3);
                                if (i4 == 2) {
                                    O(iMax5);
                                    objArr[0] = 2;
                                    z5 = true;
                                    z4 = true;
                                }
                                if (i3 == 2) {
                                    L(iMax6);
                                    objArr[1] = 2;
                                    z5 = true;
                                    z4 = true;
                                }
                            }
                            iMax = Math.max(this.b0, q());
                            if (iMax > q()) {
                                O(iMax);
                                r8 = 1;
                                objArr[0] = 1;
                                z5 = true;
                                z8 = true;
                            } else {
                                r8 = 1;
                                z8 = z4;
                            }
                            iMax2 = Math.max(this.c0, k());
                            if (iMax2 > k()) {
                                L(iMax2);
                                objArr[r8] = r8;
                                z9 = true;
                                z5 = true;
                            } else {
                                z9 = z8;
                            }
                            if (z9) {
                                if (objArr[0] == 2) {
                                    this.E0 = r8;
                                    objArr[0] = r8;
                                    O(i);
                                    z9 = true;
                                    z5 = true;
                                }
                                if (objArr[r8] != 2) {
                                }
                                if (i8 > i10) {
                                    z5 = false;
                                }
                                z4 = z9;
                                i7 = i8;
                                z3 = z7;
                                obj = obj2;
                            }
                            i10 = 8;
                            if (i8 > i10) {
                                z5 = false;
                            }
                            z4 = z9;
                            i7 = i8;
                            z3 = z7;
                            obj = obj2;
                        }
                        z6 = z4;
                        this.q0 = arrayList12;
                        if (z6) {
                            objArr[0] = i4;
                            objArr[1] = i3;
                        }
                        F(xf0Var.m);
                    }
                }
                iMax8 = i15;
                i3 = i16;
                i = i14;
                i4 = i17;
            }
        }
        z = false;
        if (W(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        xf0Var.getClass();
        xf0Var.h = false;
        if (this.D0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList13 = this.q0;
        if (objArr[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.z0 = 0;
        this.A0 = 0;
        i5 = i2;
        while (i6 < i5) {
            bqVar2 = (bq) this.q0.get(i6);
            if (bqVar2 instanceof cq) {
                ((cq) bqVar2).U();
            }
        }
        zW = W(64);
        z4 = z;
        i7 = 0;
        z5 = true;
        while (z5) {
            i8 = i7 + 1;
            xf0Var.t();
            this.z0 = 0;
            this.A0 = 0;
            g(xf0Var);
            while (i13 < i5) {
                ((bq) this.q0.get(i13)).g(xf0Var);
            }
            S(xf0Var);
            weakReference = this.G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    obj2 = obj;
                    z7 = z3;
                    xf0Var.f(xf0Var.k((np) this.G0.get()), xf0Var.k(obj2), 0, 5);
                    this.G0 = null;
                } else {
                    obj2 = obj;
                    z7 = z3;
                }
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    npVar2 = npVar;
                    npVar = npVar2;
                    xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                xf0Var.p();
                z5 = true;
            } else {
                obj2 = obj;
                z7 = z3;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    xf0Var.f(xf0Var.k(this.L), xf0Var.k((np) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    npVar2 = npVar;
                    npVar = npVar2;
                    xf0Var.f(xf0Var.k((np) this.H0.get()), xf0Var.k(npVar2), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                xf0Var.p();
                z5 = true;
            }
            if (z5) {
                zArr[2] = false;
                zW2 = W(64);
                Q(xf0Var, zW2);
                size = this.q0.size();
                i12 = 0;
                z5 = false;
                while (i12 < size) {
                    bqVar = (bq) this.q0.get(i12);
                    bqVar.Q(xf0Var, zW2);
                    boolean z114 = zW2;
                    int i68 = size;
                    if (bqVar.h == -1) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    i12++;
                    zW2 = z114;
                    size = i68;
                }
            } else {
                Q(xf0Var, zW);
                while (i9 < i5) {
                    ((bq) this.q0.get(i9)).Q(xf0Var, zW);
                }
                z5 = false;
            }
            if (z7) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i5) {
                    bq bqVar111 = (bq) this.q0.get(i11);
                    iMax4 = Math.max(iMax4, bqVar111.q() + bqVar111.Y);
                    iMax3 = Math.max(iMax3, bqVar111.k() + bqVar111.Z);
                }
                iMax5 = Math.max(this.b0, iMax4);
                iMax6 = Math.max(this.c0, iMax3);
                if (i4 == 2) {
                    O(iMax5);
                    objArr[0] = 2;
                    z5 = true;
                    z4 = true;
                }
                if (i3 == 2) {
                    L(iMax6);
                    objArr[1] = 2;
                    z5 = true;
                    z4 = true;
                }
            }
            iMax = Math.max(this.b0, q());
            if (iMax > q()) {
                O(iMax);
                r8 = 1;
                objArr[0] = 1;
                z5 = true;
                z8 = true;
            } else {
                r8 = 1;
                z8 = z4;
            }
            iMax2 = Math.max(this.c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                objArr[r8] = r8;
                z9 = true;
                z5 = true;
            } else {
                z9 = z8;
            }
            if (z9) {
                if (objArr[0] == 2) {
                    this.E0 = r8;
                    objArr[0] = r8;
                    O(i);
                    z9 = true;
                    z5 = true;
                }
                if (objArr[r8] != 2) {
                }
                if (i8 > i10) {
                    z5 = false;
                }
                z4 = z9;
                i7 = i8;
                z3 = z7;
                obj = obj2;
            }
            i10 = 8;
            if (i8 > i10) {
                z5 = false;
            }
            z4 = z9;
            i7 = i8;
            z3 = z7;
            obj = obj2;
        }
        z6 = z4;
        this.q0 = arrayList13;
        if (z6) {
            objArr[0] = i4;
            objArr[1] = i3;
        }
        F(xf0Var.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.bq
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bq) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
