package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mn0 {
    public final bo0 a;
    public final fn0 b;
    public xn0 c;
    public Bundle d;
    public Bundle[] e;
    public final qd f = new qd();
    public final e71 g;
    public final e71 h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public gf0 m;
    public nn0 n;
    public final ArrayList o;
    public af0 p;
    public final x40 q;
    public final gp0 r;
    public final LinkedHashMap s;
    public z50 t;
    public jn0 u;
    public final LinkedHashMap v;
    public int w;
    public final ArrayList x;
    public final v41 y;

    public mn0(bo0 bo0Var, fn0 fn0Var) {
        this.a = bo0Var;
        this.b = fn0Var;
        mx mxVar = mx.c;
        this.g = ec1.b(mxVar);
        this.h = ec1.b(mxVar);
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.o = new ArrayList();
        this.p = af0.d;
        this.q = new x40(1, this);
        this.r = new gp0();
        this.s = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.x = new ArrayList();
        this.y = bu0.a(1, 0, oh.d);
    }

    public static vn0 d(int i, vn0 vn0Var, vn0 vn0Var2, boolean z) {
        if (vn0Var.d.a == i && (vn0Var2 == null || (vn0Var.equals(vn0Var2) && y90.e(vn0Var.e, vn0Var2.e)))) {
            return vn0Var;
        }
        xn0 xn0Var = vn0Var instanceof xn0 ? (xn0) vn0Var : null;
        if (xn0Var == null) {
            xn0Var = vn0Var.e;
            xn0Var.getClass();
        }
        return xn0Var.i.c(i, xn0Var, vn0Var2, z);
    }

    public static /* synthetic */ void n(mn0 mn0Var, an0 an0Var) {
        mn0Var.m(an0Var, false, new qd());
    }

    public final void a(vn0 vn0Var, Bundle bundle, an0 an0Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        yg ygVar = this.a.c;
        vn0 vn0Var2 = an0Var.d;
        boolean z = vn0Var2 instanceof au;
        qd qdVar = this.f;
        if (!z) {
            while (!qdVar.isEmpty() && (((an0) qdVar.last()).d instanceof au) && l(((an0) qdVar.last()).d.d.a, true, false)) {
            }
        }
        qd<an0> qdVar2 = new qd();
        Object obj = null;
        if (vn0Var instanceof xn0) {
            vn0 vn0Var3 = vn0Var2;
            do {
                vn0Var3.getClass();
                vn0Var3 = vn0Var3.e;
                if (vn0Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!y90.e(((an0) objPrevious2).d, vn0Var3));
                    an0 an0VarD = (an0) objPrevious2;
                    if (an0VarD == null) {
                        an0VarD = fw.d(ygVar, vn0Var3, bundle, h(), this.n);
                    }
                    qdVar2.addFirst(an0VarD);
                    if (!qdVar.isEmpty() && ((an0) qdVar.last()).d == vn0Var3) {
                        n(this, (an0) qdVar.last());
                    }
                }
                if (vn0Var3 == null) {
                    break;
                }
            } while (vn0Var3 != vn0Var);
        }
        vn0 vn0Var4 = qdVar2.isEmpty() ? vn0Var2 : ((an0) qdVar2.first()).d;
        while (vn0Var4 != null && c(vn0Var4.d.a, vn0Var4) != vn0Var4) {
            vn0Var4 = vn0Var4.e;
            if (vn0Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!y90.e(((an0) objPrevious).d, vn0Var4));
                an0 an0VarD2 = (an0) objPrevious;
                if (an0VarD2 == null) {
                    an0VarD2 = fw.d(ygVar, vn0Var4, vn0Var4.a(bundle2), h(), this.n);
                }
                qdVar2.addFirst(an0VarD2);
            }
        }
        if (!qdVar2.isEmpty()) {
            vn0Var2 = ((an0) qdVar2.first()).d;
        }
        while (!qdVar.isEmpty() && (((an0) qdVar.last()).d instanceof xn0)) {
            vn0 vn0Var5 = ((an0) qdVar.last()).d;
            vn0Var5.getClass();
            if (((x51) ((xn0) vn0Var5).i.e).c(vn0Var2.d.a) != null) {
                break;
            } else {
                n(this, (an0) qdVar.last());
            }
        }
        an0 an0Var2 = (an0) (qdVar.isEmpty() ? null : qdVar.d[qdVar.c]);
        if (an0Var2 == null) {
            an0Var2 = (an0) (qdVar2.isEmpty() ? null : qdVar2.d[qdVar2.c]);
        }
        if (!y90.e(an0Var2 != null ? an0Var2.d : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                vn0 vn0Var6 = ((an0) objPrevious3).d;
                xn0 xn0Var = this.c;
                xn0Var.getClass();
                if (y90.e(vn0Var6, xn0Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            an0 an0VarD3 = (an0) obj;
            if (an0VarD3 == null) {
                xn0 xn0Var2 = this.c;
                xn0Var2.getClass();
                xn0 xn0Var3 = this.c;
                xn0Var3.getClass();
                an0VarD3 = fw.d(ygVar, xn0Var2, xn0Var3.a(bundle), h(), this.n);
            }
            qdVar2.addFirst(an0VarD3);
        }
        for (an0 an0Var3 : qdVar2) {
            Object obj2 = this.s.get(this.r.b(an0Var3.d.c));
            if (obj2 == null) {
                throw new IllegalStateException(q51.m(new StringBuilder("NavigatorBackStack for "), vn0Var.c, " should already be created").toString());
            }
            ((gn0) obj2).a(an0Var3);
        }
        qdVar.addAll(qdVar2);
        qdVar.addLast(an0Var);
        ArrayList arrayList = new ArrayList(qdVar2.size() + 1);
        arrayList.addAll(qdVar2);
        arrayList.add(an0Var);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            an0 an0Var4 = (an0) obj3;
            xn0 xn0Var4 = an0Var4.d.e;
            if (xn0Var4 != null) {
                j(an0Var4, e(xn0Var4.d.a));
            }
        }
    }

    public final boolean b() {
        qd qdVar;
        while (true) {
            qdVar = this.f;
            if (qdVar.isEmpty() || !(((an0) qdVar.last()).d instanceof xn0)) {
                break;
            }
            n(this, (an0) qdVar.last());
        }
        an0 an0Var = (an0) qdVar.d();
        ArrayList arrayList = this.x;
        if (an0Var != null) {
            arrayList.add(an0Var);
        }
        this.w++;
        s();
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            ArrayList arrayListX0 = tm.x0(arrayList);
            arrayList.clear();
            int size = arrayListX0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListX0.get(i2);
                i2++;
                an0 an0Var2 = (an0) obj;
                Iterator it = tm.w0(this.o).iterator();
                while (it.hasNext()) {
                    ((hn0) it.next()).m(this.a, an0Var2.d, an0Var2.j.b());
                }
                this.y.p(an0Var2);
            }
            ArrayList arrayList2 = new ArrayList(qdVar);
            e71 e71Var = this.g;
            e71Var.getClass();
            e71Var.j(null, arrayList2);
            ArrayList arrayListO = o();
            e71 e71Var2 = this.h;
            e71Var2.getClass();
            e71Var2.j(null, arrayListO);
        }
        return an0Var != null;
    }

    public final vn0 c(int i, vn0 vn0Var) {
        vn0 vn0Var2;
        xn0 xn0Var = this.c;
        if (xn0Var == null) {
            return null;
        }
        if (xn0Var.d.a == i) {
            if (vn0Var == null) {
                return xn0Var;
            }
            if (y90.e(xn0Var, vn0Var) && vn0Var.e == null) {
                return this.c;
            }
        }
        an0 an0Var = (an0) this.f.d();
        if (an0Var == null || (vn0Var2 = an0Var.d) == null) {
            vn0Var2 = this.c;
            vn0Var2.getClass();
        }
        return d(i, vn0Var2, vn0Var, false);
    }

    public final an0 e(int i) {
        Object objPrevious;
        qd qdVar = this.f;
        ListIterator<E> listIterator = qdVar.listIterator(qdVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((an0) objPrevious).d.d.a != i);
        an0 an0Var = (an0) objPrevious;
        if (an0Var != null) {
            return an0Var;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + f()).toString());
    }

    public final vn0 f() {
        an0 an0Var = (an0) this.f.d();
        if (an0Var != null) {
            return an0Var.d;
        }
        return null;
    }

    public final xn0 g() {
        xn0 xn0Var = this.c;
        if (xn0Var != null) {
            xn0Var.getClass();
            return xn0Var;
        }
        nh0.j("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final af0 h() {
        return this.m == null ? af0.e : this.p;
    }

    public final xn0 i() {
        vn0 vn0Var;
        an0 an0Var = (an0) this.f.d();
        if (an0Var == null || (vn0Var = an0Var.d) == null) {
            vn0Var = this.c;
            vn0Var.getClass();
        }
        xn0 xn0Var = vn0Var instanceof xn0 ? (xn0) vn0Var : null;
        if (xn0Var != null) {
            return xn0Var;
        }
        xn0 xn0Var2 = vn0Var.e;
        xn0Var2.getClass();
        return xn0Var2;
    }

    public final void j(an0 an0Var, an0 an0Var2) {
        this.i.put(an0Var, an0Var2);
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap.get(an0Var2) == null) {
            linkedHashMap.put(an0Var2, new df());
        }
        Object obj = linkedHashMap.get(an0Var2);
        obj.getClass();
        ((df) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110 A[LOOP:4: B:50:0x0109->B:52:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x016d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192 A[LOOP:6: B:61:0x018c->B:63:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x0184 A[SYNTHETIC] */
    public final void k(final vn0 vn0Var, Bundle bundle, eo0 eo0Var) {
        int i;
        boolean zL;
        gp0 gp0Var;
        LinkedHashMap linkedHashMap;
        boolean z;
        int iNextIndex;
        vn0 vn0Var2;
        qd<an0> qdVar;
        xn0 xn0Var;
        vn0Var.getClass();
        m7 m7Var = vn0Var.d;
        LinkedHashMap linkedHashMap2 = this.s;
        Iterator it = linkedHashMap2.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((gn0) it.next()).d = true;
            }
        }
        final kx0 kx0Var = new kx0();
        if (eo0Var != null) {
            boolean z2 = eo0Var.e;
            boolean z3 = eo0Var.d;
            int i2 = eo0Var.c;
            if (i2 != -1) {
                zL = l(i2, z3, z2);
            } else {
                zL = false;
            }
        } else {
            zL = false;
        }
        final Bundle bundleA = vn0Var.a(bundle);
        if (eo0Var == null || !eo0Var.b) {
            gp0Var = this.r;
            if (eo0Var == null && eo0Var.a) {
                qd qdVar2 = this.f;
                an0 an0Var = (an0) qdVar2.d();
                ListIterator listIterator = qdVar2.listIterator(qdVar2.e);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((an0) listIterator.previous()).d == vn0Var) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (vn0Var instanceof xn0) {
                    int i3 = xn0.j;
                    List listD0 = h11.d0(new o81(h11.c0((xn0) vn0Var, new a0(16)), new a0(11), 1));
                    if (qdVar2.e - iNextIndex == listD0.size()) {
                        List listSubList = qdVar2.subList(iNextIndex, qdVar2.e);
                        ArrayList arrayList = new ArrayList(vm.c0(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((an0) it2.next()).d.d.a));
                        }
                        if (arrayList.equals(listD0)) {
                            qdVar = new qd();
                            for (i = 1; qdVar2.size() - i >= iNextIndex; i = 1) {
                                an0 an0Var2 = (an0) zm.g0(qdVar2);
                                r(an0Var2);
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                an0 an0Var3 = new an0(an0Var2.c, an0Var2.d, an0Var2.d.a(bundle), an0Var2.f, an0Var2.g, an0Var2.h, an0Var2.i);
                                af0 af0Var = an0Var2.f;
                                dn0 dn0Var = an0Var3.j;
                                dn0Var.getClass();
                                af0Var.getClass();
                                dn0Var.g = af0Var;
                                af0 af0Var2 = (af0) an0Var2.j.h;
                                af0Var2.getClass();
                                dn0Var.h = af0Var2;
                                dn0Var.d();
                                qdVar.addFirst(an0Var3);
                                linkedHashMap2 = linkedHashMap3;
                            }
                            linkedHashMap = linkedHashMap2;
                            for (an0 an0Var4 : qdVar) {
                                xn0Var = an0Var4.d.e;
                                if (xn0Var != null) {
                                    j(an0Var4, e(xn0Var.d.a));
                                }
                                qdVar2.addLast(an0Var4);
                            }
                            for (an0 an0Var5 : qdVar) {
                                gp0Var.b(an0Var5.d.c).f(an0Var5);
                            }
                            z = true;
                        }
                    }
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (an0Var == null || (vn0Var2 = an0Var.d) == null || m7Var.a != vn0Var2.d.a) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else {
                    qdVar = new qd();
                    while (qdVar2.size() - i >= iNextIndex) {
                        an0 an0Var6 = (an0) zm.g0(qdVar2);
                        r(an0Var6);
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        an0 an0Var7 = new an0(an0Var6.c, an0Var6.d, an0Var6.d.a(bundle), an0Var6.f, an0Var6.g, an0Var6.h, an0Var6.i);
                        af0 af0Var3 = an0Var6.f;
                        dn0 dn0Var2 = an0Var7.j;
                        dn0Var2.getClass();
                        af0Var3.getClass();
                        dn0Var2.g = af0Var3;
                        af0 af0Var4 = (af0) an0Var6.j.h;
                        af0Var4.getClass();
                        dn0Var2.h = af0Var4;
                        dn0Var2.d();
                        qdVar.addFirst(an0Var7);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    linkedHashMap = linkedHashMap2;
                    while (r4.hasNext()) {
                        xn0Var = an0Var4.d.e;
                        if (xn0Var != null) {
                            j(an0Var4, e(xn0Var.d.a));
                        }
                        qdVar2.addLast(an0Var4);
                    }
                    while (r3.hasNext()) {
                        gp0Var.b(an0Var5.d.c).f(an0Var5);
                    }
                    z = true;
                }
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                an0 an0VarD = fw.d(this.a.c, vn0Var, bundleA, h(), this.n);
                fp0 fp0VarB = gp0Var.b(vn0Var.c);
                List listJ = y90.J(an0VarD);
                this.t = new z50() { // from class: in0
                    @Override // defpackage.z50
                    public final Object h(Object obj) {
                        an0 an0Var8 = (an0) obj;
                        an0Var8.getClass();
                        kx0Var.c = true;
                        this.a(vn0Var, bundleA, an0Var8, mx.c);
                        return uc1.a;
                    }
                };
                fp0VarB.d(listJ, eo0Var);
                this.t = null;
            }
        } else if (this.k.containsKey(Integer.valueOf(m7Var.a))) {
            kx0Var.c = p(m7Var.a, bundleA, eo0Var);
            linkedHashMap = linkedHashMap2;
            z = false;
        } else {
            gp0Var = this.r;
            if (eo0Var == null) {
                linkedHashMap = linkedHashMap2;
                z = false;
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                an0 an0VarD2 = fw.d(this.a.c, vn0Var, bundleA, h(), this.n);
                fp0 fp0VarB2 = gp0Var.b(vn0Var.c);
                List listJ2 = y90.J(an0VarD2);
                this.t = new z50() { // from class: in0
                    @Override // defpackage.z50
                    public final Object h(Object obj) {
                        an0 an0Var8 = (an0) obj;
                        an0Var8.getClass();
                        kx0Var.c = true;
                        this.a(vn0Var, bundleA, an0Var8, mx.c);
                        return uc1.a;
                    }
                };
                fp0VarB2.d(listJ2, eo0Var);
                this.t = null;
            }
        }
        this.b.a();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((gn0) it3.next()).d = false;
        }
        if (zL || kx0Var.c || z) {
            b();
        } else {
            s();
        }
    }

    public final boolean l(int i, boolean z, boolean z2) {
        vn0 vn0Var;
        boolean z3;
        qd qdVar = this.f;
        final int i2 = 0;
        if (qdVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = tm.s0(qdVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                vn0Var = null;
                break;
            }
            vn0 vn0Var2 = ((an0) it.next()).d;
            String str = vn0Var2.c;
            m7 m7Var = vn0Var2.d;
            fp0 fp0VarB = this.r.b(str);
            if (z || m7Var.a != i) {
                arrayList.add(fp0VarB);
            }
            if (m7Var.a == i) {
                vn0Var = vn0Var2;
                break;
            }
        }
        if (vn0Var == null) {
            int i3 = vn0.h;
            Log.i("NavController", "Ignoring popBackStack to destination " + ec1.q(this.a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        kx0 kx0Var = new kx0();
        qd qdVar2 = new qd();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = z2;
                break;
            }
            int i5 = i4 + 1;
            fp0 fp0Var = (fp0) arrayList.get(i4);
            kx0 kx0Var2 = new kx0();
            an0 an0Var = (an0) qdVar.last();
            z3 = z2;
            jn0 jn0Var = new jn0(kx0Var2, kx0Var, this, z3, qdVar2);
            fp0Var.getClass();
            an0Var.getClass();
            this.u = jn0Var;
            fp0Var.i(an0Var, z3);
            this.u = null;
            if (!kx0Var2.c) {
                break;
            }
            i4 = i5;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.k;
            if (!z) {
                a10 a10Var = new a10(new o81(h11.c0(vn0Var, new a0(9)), new z50(this) { // from class: kn0
                    public final /* synthetic */ mn0 d;

                    {
                        this.d = this;
                    }

                    @Override // defpackage.z50
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        int i6 = i2;
                        mn0 mn0Var = this.d;
                        vn0 vn0Var3 = (vn0) obj;
                        switch (i6) {
                            case 0:
                                vn0Var3.getClass();
                                zContainsKey = mn0Var.k.containsKey(Integer.valueOf(vn0Var3.d.a));
                                break;
                            default:
                                vn0Var3.getClass();
                                zContainsKey = mn0Var.k.containsKey(Integer.valueOf(vn0Var3.d.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (a10Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((vn0) a10Var.next()).d.a);
                    en0 en0Var = (en0) (qdVar2.isEmpty() ? null : qdVar2.d[qdVar2.c]);
                    linkedHashMap.put(numValueOf, en0Var != null ? (String) en0Var.a.d : null);
                }
            }
            if (!qdVar2.isEmpty()) {
                xb xbVar = ((en0) qdVar2.first()).a;
                final int i6 = 1;
                a10 a10Var2 = new a10(new o81(h11.c0(c(xbVar.c, null), new a0(10)), new z50(this) { // from class: kn0
                    public final /* synthetic */ mn0 d;

                    {
                        this.d = this;
                    }

                    @Override // defpackage.z50
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        int i7 = i6;
                        mn0 mn0Var = this.d;
                        vn0 vn0Var3 = (vn0) obj;
                        switch (i7) {
                            case 0:
                                vn0Var3.getClass();
                                zContainsKey = mn0Var.k.containsKey(Integer.valueOf(vn0Var3.d.a));
                                break;
                            default:
                                vn0Var3.getClass();
                                zContainsKey = mn0Var.k.containsKey(Integer.valueOf(vn0Var3.d.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (a10Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((vn0) a10Var2.next()).d.a), (String) xbVar.d);
                }
                if (linkedHashMap.values().contains((String) xbVar.d)) {
                    this.l.put((String) xbVar.d, qdVar2);
                }
            }
        }
        this.b.a();
        return kx0Var.c;
    }

    public final void m(an0 an0Var, boolean z, qd qdVar) {
        nn0 nn0Var;
        cw0 cw0Var;
        Set set;
        an0Var.getClass();
        qd qdVar2 = this.f;
        an0 an0Var2 = (an0) qdVar2.last();
        if (!y90.e(an0Var2, an0Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(an0Var.d);
            vn0 vn0Var = an0Var2.d;
            sb.append(", which is not the top of the back stack (");
            sb.append(vn0Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        zm.g0(qdVar2);
        gn0 gn0Var = (gn0) this.s.get(this.r.b(an0Var2.d.c));
        boolean z2 = true;
        if ((gn0Var == null || (cw0Var = gn0Var.f) == null || (set = (Set) cw0Var.c.getValue()) == null || !set.contains(an0Var2)) && !this.j.containsKey(an0Var2)) {
            z2 = false;
        }
        af0 af0Var = ((if0) an0Var2.j.l).d;
        af0 af0Var2 = af0.e;
        if (af0Var.compareTo(af0Var2) >= 0) {
            if (z) {
                an0Var2.a(af0Var2);
                qdVar.addFirst(new en0(an0Var2));
            }
            if (z2) {
                an0Var2.a(af0Var2);
            } else {
                an0Var2.a(af0.c);
                r(an0Var2);
            }
        }
        if (z || z2 || (nn0Var = this.n) == null) {
            return;
        }
        String str = an0Var2.h;
        str.getClass();
        bf1 bf1Var = (bf1) nn0Var.b.remove(str);
        if (bf1Var != null) {
            bf1Var.a();
        }
    }

    public final ArrayList o() {
        af0 af0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.s.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            af0Var = af0.f;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((gn0) it.next()).f.c.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                an0 an0Var = (an0) obj;
                if (!arrayList.contains(an0Var) && ((af0) an0Var.j.h).compareTo(af0Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            zm.d0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            an0 an0Var2 = (an0) obj2;
            if (!arrayList.contains(an0Var2) && ((af0) an0Var2.j.h).compareTo(af0Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        zm.d0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((an0) obj3).d instanceof xn0)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i, final Bundle bundle, eo0 eo0Var) {
        vn0 vn0VarG;
        an0 an0Var;
        vn0 vn0Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.k;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (y90.e((String) it.next(), str)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.l;
        ec1.d(linkedHashMap2);
        qd<en0> qdVar = (qd) linkedHashMap2.remove(str);
        yg ygVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        an0 an0Var2 = (an0) this.f.d();
        if (an0Var2 == null || (vn0VarG = an0Var2.d) == null) {
            vn0VarG = g();
        }
        if (qdVar != null) {
            for (en0 en0Var : qdVar) {
                xb xbVar = en0Var.a;
                xb xbVar2 = en0Var.a;
                vn0 vn0VarD = d(xbVar.c, vn0VarG, null, true);
                if (vn0VarD == null) {
                    int i3 = vn0.h;
                    nh0.r("Restore State failed: destination ", ec1.q(ygVar, xbVar2.c), " cannot be found from the current destination ", vn0VarG);
                    return false;
                }
                af0 af0VarH = h();
                nn0 nn0Var = this.n;
                ygVar.getClass();
                af0VarH.getClass();
                Bundle bundle3 = (Bundle) xbVar2.e;
                if (bundle3 != null) {
                    bundle3.setClassLoader(ygVar.a.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) xbVar2.d;
                Bundle bundle4 = (Bundle) xbVar2.f;
                str2.getClass();
                arrayList.add(new an0(ygVar, vn0VarD, bundle2, af0VarH, nn0Var, str2, bundle4));
                vn0VarG = vn0VarD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((an0) obj).d instanceof xn0)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            an0 an0Var3 = (an0) obj2;
            List list = (List) tm.p0(arrayList2);
            if (y90.e((list == null || (an0Var = (an0) tm.o0(list)) == null || (vn0Var = an0Var.d) == null) ? null : vn0Var.c, an0Var3.d.c)) {
                list.add(an0Var3);
            } else {
                arrayList2.add(new ArrayList(new pd(new an0[]{an0Var3}, true)));
            }
        }
        final kx0 kx0Var = new kx0();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            fp0 fp0VarB = this.r.b(((an0) tm.i0(list2)).d.c);
            final lx0 lx0Var = new lx0();
            final ArrayList arrayList4 = arrayList;
            this.t = new z50() { // from class: ln0
                @Override // defpackage.z50
                public final Object h(Object obj4) {
                    List listSubList;
                    an0 an0Var4 = (an0) obj4;
                    an0Var4.getClass();
                    kx0Var.c = true;
                    ArrayList arrayList5 = arrayList4;
                    int iIndexOf = arrayList5.indexOf(an0Var4);
                    if (iIndexOf != -1) {
                        lx0 lx0Var2 = lx0Var;
                        int i6 = iIndexOf + 1;
                        listSubList = arrayList5.subList(lx0Var2.c, i6);
                        lx0Var2.c = i6;
                    } else {
                        listSubList = mx.c;
                    }
                    this.a(an0Var4.d, bundle, an0Var4, listSubList);
                    return uc1.a;
                }
            };
            fp0VarB.d(list2, eo0Var);
            this.t = null;
            arrayList = arrayList4;
        }
        return kx0Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r28v0, types: [mn0] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v22, types: [vn0] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r7v19, types: [vn0, xn0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q(xn0 xn0Var, Bundle bundle) {
        LinkedHashMap linkedHashMap;
        ?? r4;
        gp0 gp0Var;
        String str;
        LinkedHashMap linkedHashMap2;
        Intent intent;
        int[] intArray;
        ?? I;
        un0 un0VarI;
        int[] iArr;
        ArrayList arrayList;
        String strQ;
        vn0 vn0VarH;
        xn0 xn0Var2;
        int i;
        Bundle bundle2;
        vn0 vn0VarH2;
        xn0 xn0Var3;
        ?? r5;
        xb xbVar = xn0Var.i;
        qd<an0> qdVar = this.f;
        if (!qdVar.isEmpty() && h() == af0.c) {
            nh0.j("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (y90.e(this.c, xn0Var)) {
            int iF = ((x51) xbVar.e).f();
            for (int i2 = 0; i2 < iF; i2++) {
                vn0 vn0Var = (vn0) ((x51) xbVar.e).g(i2);
                xn0 xn0Var4 = this.c;
                xn0Var4.getClass();
                int iD = ((x51) xn0Var4.i.e).d(i2);
                xn0 xn0Var5 = this.c;
                xn0Var5.getClass();
                x51 x51Var = (x51) xn0Var5.i.e;
                if (x51Var.c) {
                    r71.b(x51Var);
                }
                int iF2 = y90.f(x51Var.f, iD, x51Var.d);
                if (iF2 >= 0) {
                    Object[] objArr = x51Var.e;
                    Object obj = objArr[iF2];
                    objArr[iF2] = vn0Var;
                }
            }
            for (an0 an0Var : qdVar) {
                int i3 = vn0.h;
                vn0 vn0Var2 = an0Var.d;
                vn0Var2.getClass();
                xy0 xy0Var = new xy0(h11.d0(h11.c0(vn0Var2, new a0(15))));
                vn0 vn0VarH3 = this.c;
                vn0VarH3.getClass();
                Iterator it = xy0Var.iterator();
                while (true) {
                    ListIterator listIterator = ((wy0) it).c;
                    if (listIterator.hasPrevious()) {
                        vn0 vn0Var3 = (vn0) listIterator.previous();
                        if (!y90.e(vn0Var3, this.c) || !vn0VarH3.equals(xn0Var)) {
                            if (vn0VarH3 instanceof xn0) {
                                vn0VarH3 = ((xn0) vn0VarH3).h(vn0Var3.d.a);
                                vn0VarH3.getClass();
                            }
                        }
                    }
                }
                an0Var.d = vn0VarH3;
            }
            return;
        }
        xn0 xn0Var6 = this.c;
        LinkedHashMap linkedHashMap3 = this.s;
        Bundle bundle3 = null;
        if (xn0Var6 != null) {
            ArrayList arrayList2 = new ArrayList(this.k.keySet());
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                Integer num = (Integer) arrayList2.get(i4);
                num.getClass();
                int iIntValue = num.intValue();
                Iterator it2 = linkedHashMap3.values().iterator();
                while (it2.hasNext()) {
                    ((gn0) it2.next()).d = true;
                }
                Bundle bundle4 = bundle3;
                ArrayList arrayList3 = arrayList2;
                int i6 = size;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                boolean zP = p(iIntValue, bundle4, new eo0(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it3 = linkedHashMap4.values().iterator();
                while (it3.hasNext()) {
                    ((gn0) it3.next()).d = false;
                }
                if (zP) {
                    l(iIntValue, true, false);
                }
                bundle3 = bundle4;
                i4 = i5;
                arrayList2 = arrayList3;
                size = i6;
                linkedHashMap3 = linkedHashMap4;
            }
            linkedHashMap = linkedHashMap3;
            r4 = bundle3;
            l(xn0Var6.d.a, true, false);
        } else {
            linkedHashMap = linkedHashMap3;
            r4 = 0;
        }
        this.c = xn0Var;
        bo0 bo0Var = this.a;
        mn0 mn0Var = bo0Var.b;
        yg ygVar = bo0Var.c;
        Bundle bundle5 = this.d;
        gp0 gp0Var2 = this.r;
        if (bundle5 != null && bundle5.containsKey("android-support-nav:controller:navigatorState:names")) {
            ArrayList<String> stringArrayList = bundle5.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList == null) {
                bu0.u("android-support-nav:controller:navigatorState:names");
                throw r4;
            }
            int size2 = stringArrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                String str2 = stringArrayList.get(i7);
                i7++;
                String str3 = str2;
                fp0 fp0VarB = gp0Var2.b(str3);
                if (bundle5.containsKey(str3)) {
                    Bundle bundle6 = bundle5.getBundle(str3);
                    if (bundle6 == null) {
                        bu0.u(str3);
                        throw r4;
                    }
                    fp0VarB.g(bundle6);
                }
            }
        }
        Bundle[] bundleArr = this.e;
        String str4 = " cannot be found from the current destination ";
        if (bundleArr != null) {
            int length = bundleArr.length;
            int i8 = 0;
            while (i8 < length) {
                Bundle bundle7 = bundleArr[i8];
                bundle7.getClass();
                bundle7.setClassLoader(en0.class.getClassLoader());
                String string = bundle7.getString("nav-entry-state:id");
                if (string == null) {
                    r5 = r4;
                    ?? r19 = r5;
                    bu0.u("nav-entry-state:id");
                    throw r19;
                }
                int iS = lk0.s("nav-entry-state:destination-id", bundle7);
                int i9 = length;
                Bundle bundle8 = bundle7.getBundle("nav-entry-state:args");
                if (bundle8 == null) {
                    r5 = r4;
                    ?? r110 = r5;
                    bu0.u("nav-entry-state:args");
                    throw r110;
                }
                Bundle bundle9 = bundle7.getBundle("nav-entry-state:saved-state");
                if (bundle9 == null) {
                    r5 = r4;
                    ?? r111 = r5;
                    bu0.u("nav-entry-state:saved-state");
                    throw r111;
                }
                String str5 = str4;
                vn0 vn0VarC = c(iS, r5);
                if (vn0VarC == null) {
                    r5 = r4;
                    int i10 = vn0.h;
                    nh0.s(q51.n("Restoring the Navigation back stack failed: destination ", ec1.q(ygVar, iS), str5), f());
                    return;
                }
                int i11 = i8;
                af0 af0VarH = h();
                nn0 nn0Var = this.n;
                ygVar.getClass();
                af0VarH.getClass();
                bundle8.setClassLoader(ygVar.a.getClassLoader());
                gp0 gp0Var3 = gp0Var2;
                ?? r112 = r5;
                an0 an0Var2 = new an0(ygVar, vn0VarC, bundle8, af0VarH, nn0Var, string, bundle9);
                fp0 fp0VarB2 = gp0Var3.b(vn0VarC.c);
                LinkedHashMap linkedHashMap5 = linkedHashMap;
                Object gn0Var = linkedHashMap5.get(fp0VarB2);
                if (gn0Var == null) {
                    r5 = r4;
                    gn0Var = new gn0(bo0Var, fp0VarB2);
                    linkedHashMap5.put(fp0VarB2, gn0Var);
                }
                r5 = r4;
                qdVar.addLast(an0Var2);
                ((gn0) gn0Var).a(an0Var2);
                xn0 xn0Var7 = an0Var2.d.e;
                if (xn0Var7 != null) {
                    j(an0Var2, e(xn0Var7.d.a));
                }
                i8 = i11 + 1;
                gp0Var2 = gp0Var3;
                str4 = str5;
                linkedHashMap = linkedHashMap5;
                length = i9;
                r5 = r112;
            }
            r5 = r4;
            ?? r113 = r5;
            gp0Var = gp0Var2;
            str = str4;
            linkedHashMap2 = linkedHashMap;
            this.b.a();
            this.e = r113;
        } else {
            gp0Var = gp0Var2;
            str = " cannot be found from the current destination ";
            linkedHashMap2 = linkedHashMap;
        }
        Collection collectionValues = mj0.R(gp0Var.a).values();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((fp0) obj2).b) {
                arrayList4.add(obj2);
            }
        }
        int size3 = arrayList4.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList4.get(i12);
            i12++;
            fp0 fp0Var = (fp0) obj3;
            Object gn0Var2 = linkedHashMap2.get(fp0Var);
            if (gn0Var2 == null) {
                fp0Var.getClass();
                gn0Var2 = new gn0(bo0Var, fp0Var);
                linkedHashMap2.put(fp0Var, gn0Var2);
            }
            fp0Var.e((gn0) gn0Var2);
        }
        if (this.c == null || !qdVar.isEmpty()) {
            b();
            return;
        }
        Activity activity = bo0Var.d;
        if (!bo0Var.e && activity != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
            Bundle bundle10 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle10 != null) {
                bundleG.putAll(bundle10);
            }
            if ((intArray == null || intArray.length == 0) && (un0VarI = (I = mn0Var.i()).i(new y6(intent.getData(), intent.getAction(), intent.getType(), 21), I)) != null) {
                vn0 vn0Var4 = un0VarI.c;
                int[] iArrB = vn0Var4.b(null);
                Bundle bundleA = vn0Var4.a(un0VarI.d);
                if (bundleA != null) {
                    bundleG.putAll(bundleA);
                }
                iArr = iArrB;
                arrayList = null;
            } else {
                iArr = intArray;
                arrayList = parcelableArrayList;
            }
            if (iArr != null && iArr.length != 0) {
                mn0Var.getClass();
                xn0 xn0Var8 = mn0Var.c;
                int length2 = iArr.length;
                xn0 xn0Var9 = xn0Var8;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        strQ = null;
                        break;
                    }
                    int i14 = iArr[i13];
                    if (i13 == 0) {
                        xn0 xn0Var10 = mn0Var.c;
                        xn0Var10.getClass();
                        vn0VarH2 = xn0Var10.d.a == i14 ? mn0Var.c : null;
                    } else {
                        xn0Var9.getClass();
                        vn0VarH2 = xn0Var9.h(i14);
                    }
                    if (vn0VarH2 == null) {
                        int i15 = vn0.h;
                        strQ = ec1.q(mn0Var.a.c, i14);
                        break;
                    }
                    if (i13 != iArr.length - 1 && (vn0VarH2 instanceof xn0)) {
                        while (true) {
                            xn0Var3 = (xn0) vn0VarH2;
                            xn0Var3.getClass();
                            xb xbVar2 = xn0Var3.i;
                            if (!(xn0Var3.h(xbVar2.c) instanceof xn0)) {
                                break;
                            } else {
                                vn0VarH2 = xn0Var3.h(xbVar2.c);
                            }
                        }
                        xn0Var9 = xn0Var3;
                    }
                    i13++;
                }
                if (strQ == null) {
                    bundleG.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length3 = iArr.length;
                    Bundle[] bundleArr2 = new Bundle[length3];
                    for (int i16 = 0; i16 < length3; i16++) {
                        Bundle bundleG2 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                        bundleG2.putAll(bundleG);
                        if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i16)) != null) {
                            bundleG2.putAll(bundle2);
                        }
                        bundleArr2[i16] = bundleG2;
                    }
                    int flags = intent.getFlags();
                    int i17 = 268435456 & flags;
                    if (i17 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        x81 x81Var = new x81(bo0Var.a);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(x81Var.d.getPackageManager());
                        }
                        if (component != null) {
                            x81Var.a(component);
                        }
                        x81Var.c.add(intent);
                        x81Var.b();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i17 != 0) {
                        if (mn0Var.f.isEmpty()) {
                            i = 0;
                        } else {
                            xn0 xn0Var11 = mn0Var.c;
                            xn0Var11.getClass();
                            i = 0;
                            mn0Var.l(xn0Var11.d.a, true, false);
                        }
                        while (i < iArr.length) {
                            int i18 = iArr[i];
                            int i19 = i + 1;
                            Bundle bundle11 = bundleArr2[i];
                            vn0 vn0VarC2 = mn0Var.c(i18, null);
                            if (vn0VarC2 == null) {
                                int i20 = vn0.h;
                                nh0.s(q51.n("Deep Linking failed: destination ", ec1.q(ygVar, i18), str), mn0Var.f());
                                return;
                            }
                            m70 m70Var = new m70(vn0VarC2, 1, bo0Var);
                            fo0 fo0Var = new fo0();
                            m70Var.h(fo0Var);
                            do0 do0Var = fo0Var.a;
                            do0Var.a = false;
                            do0Var.b = false;
                            int i21 = fo0Var.b;
                            boolean z = fo0Var.c;
                            do0Var.c = i21;
                            do0Var.d = z;
                            mn0Var.k(vn0VarC2, bundle11, do0Var.a());
                            i = i19;
                        }
                        bo0Var.e = true;
                        return;
                    }
                    xn0 xn0Var12 = mn0Var.c;
                    int length4 = iArr.length;
                    for (int i22 = 0; i22 < length4; i22++) {
                        int i23 = iArr[i22];
                        Bundle bundle12 = bundleArr2[i22];
                        if (i22 == 0) {
                            vn0VarH = mn0Var.c;
                        } else {
                            xn0Var12.getClass();
                            vn0VarH = xn0Var12.h(i23);
                        }
                        if (vn0VarH == null) {
                            int i24 = vn0.h;
                            throw new IllegalStateException("Deep Linking failed: destination " + ec1.q(ygVar, i23) + " cannot be found in graph " + xn0Var12);
                        }
                        if (i22 == iArr.length - 1) {
                            xn0 xn0Var13 = mn0Var.c;
                            xn0Var13.getClass();
                            mn0Var.k(vn0VarH, bundle12, new eo0(false, false, xn0Var13.d.a, true, false, 0, 0, -1, -1));
                        } else if (vn0VarH instanceof xn0) {
                            while (true) {
                                xn0Var2 = (xn0) vn0VarH;
                                xn0Var2.getClass();
                                xb xbVar3 = xn0Var2.i;
                                if (!(xn0Var2.h(xbVar3.c) instanceof xn0)) {
                                    break;
                                } else {
                                    vn0VarH = xn0Var2.h(xbVar3.c);
                                }
                            }
                            xn0Var12 = xn0Var2;
                        }
                    }
                    bo0Var.e = true;
                    return;
                }
                Log.i("NavController", "Could not find destination " + strQ + " in the navigation graph, ignoring the deep link from " + intent);
            }
        }
        xn0 xn0Var14 = this.c;
        xn0Var14.getClass();
        k(xn0Var14, bundle, null);
    }

    public final void r(an0 an0Var) {
        an0Var.getClass();
        an0 an0Var2 = (an0) this.i.remove(an0Var);
        if (an0Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.j;
        df dfVar = (df) linkedHashMap.get(an0Var2);
        Integer numValueOf = dfVar != null ? Integer.valueOf(dfVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            gn0 gn0Var = (gn0) this.s.get(this.r.b(an0Var2.d.c));
            if (gn0Var != null) {
                gn0Var.c(an0Var2);
            }
            linkedHashMap.remove(an0Var2);
        }
    }

    public final void s() {
        df dfVar;
        cw0 cw0Var;
        Set set;
        ArrayList arrayListX0 = tm.x0(this.f);
        if (arrayListX0.isEmpty()) {
            return;
        }
        int i = 0;
        ArrayList arrayList = new ArrayList(new pd(new vn0[]{((an0) tm.o0(arrayListX0)).d}, true));
        ArrayList arrayList2 = new ArrayList();
        if (tm.o0(arrayList) instanceof au) {
            Iterator it = tm.s0(arrayListX0).iterator();
            while (it.hasNext()) {
                vn0 vn0Var = ((an0) it.next()).d;
                arrayList2.add(vn0Var);
                if (!(vn0Var instanceof au) && !(vn0Var instanceof xn0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (an0 an0Var : tm.s0(arrayListX0)) {
            af0 af0Var = (af0) an0Var.j.h;
            vn0 vn0Var2 = an0Var.d;
            vn0 vn0Var3 = (vn0) tm.j0(arrayList);
            af0 af0Var2 = af0.g;
            af0 af0Var3 = af0.f;
            if (vn0Var3 != null && vn0Var3.d.a == vn0Var2.d.a) {
                if (af0Var != af0Var2) {
                    gn0 gn0Var = (gn0) this.s.get(this.r.b(an0Var.d.c));
                    if (y90.e((gn0Var == null || (cw0Var = gn0Var.f) == null || (set = (Set) cw0Var.c.getValue()) == null) ? null : Boolean.valueOf(set.contains(an0Var)), Boolean.TRUE) || ((dfVar = (df) this.j.get(an0Var)) != null && dfVar.a.get() == 0)) {
                        map.put(an0Var, af0Var3);
                    } else {
                        map.put(an0Var, af0Var2);
                    }
                }
                vn0 vn0Var4 = (vn0) tm.j0(arrayList2);
                if (vn0Var4 != null && vn0Var4.d.a == vn0Var2.d.a) {
                    zm.f0(arrayList2);
                }
                zm.f0(arrayList);
                xn0 xn0Var = vn0Var2.e;
                if (xn0Var != null) {
                    arrayList.add(xn0Var);
                }
            } else if (arrayList2.isEmpty() || vn0Var2.d.a != ((vn0) tm.i0(arrayList2)).d.a) {
                an0Var.a(af0.e);
            } else {
                vn0 vn0Var5 = (vn0) zm.f0(arrayList2);
                if (af0Var == af0Var2) {
                    an0Var.a(af0Var3);
                } else if (af0Var != af0Var3) {
                    map.put(an0Var, af0Var3);
                }
                xn0 xn0Var2 = vn0Var5.e;
                if (xn0Var2 != null && !arrayList2.contains(xn0Var2)) {
                    arrayList2.add(xn0Var2);
                }
            }
        }
        int size = arrayListX0.size();
        while (i < size) {
            Object obj = arrayListX0.get(i);
            i++;
            an0 an0Var2 = (an0) obj;
            af0 af0Var4 = (af0) map.get(an0Var2);
            if (af0Var4 != null) {
                an0Var2.a(af0Var4);
            } else {
                an0Var2.j.d();
            }
        }
    }
}
