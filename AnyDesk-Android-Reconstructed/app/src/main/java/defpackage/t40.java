package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class t40 {
    public p6 A;
    public p6 B;
    public p6 C;
    public ArrayDeque D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public w40 M;
    public final c N;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public wq0 g;
    public ArrayList l;
    public final bc m;
    public final CopyOnWriteArrayList n;
    public final j40 o;
    public final j40 p;
    public final j40 q;
    public final j40 r;
    public final m40 s;
    public int t;
    public e40 u;
    public hq v;
    public c40 w;
    public c40 x;
    public final n40 y;
    public final fw z;
    public final ArrayList a = new ArrayList();
    public final ah c = new ah(1);
    public final i40 f = new i40(this);
    public final l40 h = new l40(0, this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = DesugarCollections.synchronizedMap(new HashMap());
    public final Map k = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [j40] */
    /* JADX WARN: Type inference failed for: r0v13, types: [j40] */
    /* JADX WARN: Type inference failed for: r0v14, types: [j40] */
    /* JADX WARN: Type inference failed for: r0v15, types: [j40] */
    public t40() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.m = new bc(this, 24);
        this.n = new CopyOnWriteArrayList();
        final int i = 0;
        this.o = new eq(this) { // from class: j40
            public final /* synthetic */ t40 b;

            {
                this.b = this;
            }

            @Override // defpackage.eq
            public final void accept(Object obj) {
                int i2 = i;
                t40 t40Var = this.b;
                switch (i2) {
                    case 0:
                        if (t40Var.J()) {
                            t40Var.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t40Var.J() && num.intValue() == 80) {
                            t40Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        qm0 qm0Var = (qm0) obj;
                        if (t40Var.J()) {
                            boolean z = qm0Var.a;
                            t40Var.m(false);
                        }
                        break;
                    default:
                        ku0 ku0Var = (ku0) obj;
                        if (t40Var.J()) {
                            boolean z2 = ku0Var.a;
                            t40Var.r(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.p = new eq(this) { // from class: j40
            public final /* synthetic */ t40 b;

            {
                this.b = this;
            }

            @Override // defpackage.eq
            public final void accept(Object obj) {
                int i3 = i2;
                t40 t40Var = this.b;
                switch (i3) {
                    case 0:
                        if (t40Var.J()) {
                            t40Var.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t40Var.J() && num.intValue() == 80) {
                            t40Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        qm0 qm0Var = (qm0) obj;
                        if (t40Var.J()) {
                            boolean z = qm0Var.a;
                            t40Var.m(false);
                        }
                        break;
                    default:
                        ku0 ku0Var = (ku0) obj;
                        if (t40Var.J()) {
                            boolean z2 = ku0Var.a;
                            t40Var.r(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.q = new eq(this) { // from class: j40
            public final /* synthetic */ t40 b;

            {
                this.b = this;
            }

            @Override // defpackage.eq
            public final void accept(Object obj) {
                int i4 = i3;
                t40 t40Var = this.b;
                switch (i4) {
                    case 0:
                        if (t40Var.J()) {
                            t40Var.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t40Var.J() && num.intValue() == 80) {
                            t40Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        qm0 qm0Var = (qm0) obj;
                        if (t40Var.J()) {
                            boolean z = qm0Var.a;
                            t40Var.m(false);
                        }
                        break;
                    default:
                        ku0 ku0Var = (ku0) obj;
                        if (t40Var.J()) {
                            boolean z2 = ku0Var.a;
                            t40Var.r(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.r = new eq(this) { // from class: j40
            public final /* synthetic */ t40 b;

            {
                this.b = this;
            }

            @Override // defpackage.eq
            public final void accept(Object obj) {
                int i5 = i4;
                t40 t40Var = this.b;
                switch (i5) {
                    case 0:
                        if (t40Var.J()) {
                            t40Var.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t40Var.J() && num.intValue() == 80) {
                            t40Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        qm0 qm0Var = (qm0) obj;
                        if (t40Var.J()) {
                            boolean z = qm0Var.a;
                            t40Var.m(false);
                        }
                        break;
                    default:
                        ku0 ku0Var = (ku0) obj;
                        if (t40Var.J()) {
                            boolean z2 = ku0Var.a;
                            t40Var.r(false);
                        }
                        break;
                }
            }
        };
        this.s = new m40(this);
        this.t = -1;
        this.y = new n40(this);
        this.z = new fw(20);
        this.D = new ArrayDeque();
        this.N = new c(26, this);
    }

    public static boolean H(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean I(c40 c40Var) {
        c40Var.getClass();
        ArrayList arrayListG = c40Var.w.c.g();
        int size = arrayListG.size();
        boolean zI = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListG.get(i);
            i++;
            c40 c40Var2 = (c40) obj;
            if (c40Var2 != null) {
                zI = I(c40Var2);
            }
            if (zI) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(c40 c40Var) {
        if (c40Var == null) {
            return true;
        }
        if (c40Var.E) {
            return c40Var.u == null || K(c40Var.x);
        }
        return false;
    }

    public static boolean L(c40 c40Var) {
        if (c40Var == null) {
            return true;
        }
        t40 t40Var = c40Var.u;
        return c40Var == t40Var.x && L(t40Var.w);
    }

    public static void b0(c40 c40Var) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + c40Var);
        }
        if (c40Var.B) {
            c40Var.B = false;
            c40Var.L = !c40Var.L;
        }
    }

    public final c40 A(int i) {
        ah ahVar = this.c;
        ArrayList arrayList = (ArrayList) ahVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c40 c40Var = (c40) arrayList.get(size);
            if (c40Var != null && c40Var.y == i) {
                return c40Var;
            }
        }
        for (i50 i50Var : ((HashMap) ahVar.b).values()) {
            if (i50Var != null) {
                c40 c40Var2 = i50Var.c;
                if (c40Var2.y == i) {
                    return c40Var2;
                }
            }
        }
        return null;
    }

    public final c40 B(String str) {
        ah ahVar = this.c;
        ArrayList arrayList = (ArrayList) ahVar.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c40 c40Var = (c40) arrayList.get(size);
                if (c40Var != null && str.equals(c40Var.A)) {
                    return c40Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (i50 i50Var : ((HashMap) ahVar.b).values()) {
            if (i50Var != null) {
                c40 c40Var2 = i50Var.c;
                if (str.equals(c40Var2.A)) {
                    return c40Var2;
                }
            }
        }
        return null;
    }

    public final void C() {
        for (ct ctVar : e()) {
            if (ctVar.e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                ctVar.e = false;
                ctVar.c();
            }
        }
    }

    public final ViewGroup D(c40 c40Var) {
        ViewGroup viewGroup = c40Var.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (c40Var.z <= 0 || !this.v.B()) {
            return null;
        }
        View viewA = this.v.A(c40Var.z);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    public final n40 E() {
        c40 c40Var = this.w;
        return c40Var != null ? c40Var.u.E() : this.y;
    }

    public final fw F() {
        c40 c40Var = this.w;
        return c40Var != null ? c40Var.u.F() : this.z;
    }

    public final void G(c40 c40Var) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + c40Var);
        }
        if (c40Var.B) {
            return;
        }
        c40Var.B = true;
        c40Var.L = true ^ c40Var.L;
        a0(c40Var);
    }

    public final boolean J() {
        c40 c40Var = this.w;
        if (c40Var == null) {
            return true;
        }
        return c40Var.k0() && this.w.e0().J();
    }

    public final boolean M() {
        return this.F || this.G;
    }

    public final void N(int i, boolean z) {
        e40 e40Var;
        if (this.u == null && i != -1) {
            nh0.j("No activity");
            return;
        }
        if (z || i != this.t) {
            this.t = i;
            ah ahVar = this.c;
            HashMap map = (HashMap) ahVar.b;
            ArrayList arrayList = (ArrayList) ahVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i50 i50Var = (i50) map.get(((c40) obj).g);
                if (i50Var != null) {
                    i50Var.k();
                }
            }
            for (i50 i50Var2 : map.values()) {
                if (i50Var2 != null) {
                    i50Var2.k();
                    c40 c40Var = i50Var2.c;
                    if (c40Var.n && !c40Var.m0()) {
                        if (c40Var.o && !((HashMap) ahVar.c).containsKey(c40Var.g)) {
                            ahVar.v(c40Var.g, i50Var2.o());
                        }
                        ahVar.o(i50Var2);
                    }
                }
            }
            c0();
            if (this.E && (e40Var = this.u) != null && this.t == 7) {
                e40Var.w.invalidateOptionsMenu();
                this.E = false;
            }
        }
    }

    public final void O() {
        if (this.u == null) {
            return;
        }
        this.F = false;
        this.G = false;
        this.M.g = false;
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null) {
                c40Var.w.O();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i, int i2) {
        x(false);
        w(true);
        c40 c40Var = this.x;
        if (c40Var != null && i < 0 && c40Var.Z().P()) {
            return true;
        }
        boolean zR = R(this.J, this.K, null, i, i2);
        if (zR) {
            this.b = true;
            try {
                T(this.J, this.K);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        e0();
        if (this.I) {
            this.I = false;
            c0();
        }
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return zR;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iZ = z(str, (i2 & 1) != 0, i);
        if (iZ < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iZ; size--) {
            arrayList.add((sf) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(c40 c40Var) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + c40Var + " nesting=" + c40Var.t);
        }
        boolean zM0 = c40Var.m0();
        if (c40Var.C && zM0) {
            return;
        }
        ah ahVar = this.c;
        synchronized (((ArrayList) ahVar.a)) {
            ((ArrayList) ahVar.a).remove(c40Var);
        }
        c40Var.m = false;
        if (I(c40Var)) {
            this.E = true;
        }
        c40Var.n = true;
        a0(c40Var);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            nh0.j("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((sf) arrayList.get(i)).p) {
                if (i2 != i) {
                    y(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((sf) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                y(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            y(arrayList, arrayList2, i2, size);
        }
    }

    public final void U(Bundle bundle) {
        bc bcVar;
        int i;
        Bundle bundle2;
        i50 i50Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.u.t.getClassLoader());
                this.k.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.u.t.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        ah ahVar = this.c;
        HashMap map2 = (HashMap) ahVar.c;
        HashMap map3 = (HashMap) ahVar.b;
        map2.clear();
        map2.putAll(map);
        u40 u40Var = (u40) bundle.getParcelable("state");
        if (u40Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = u40Var.c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            bcVar = this.m;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            Bundle bundleV = ahVar.v((String) obj, null);
            if (bundleV != null) {
                c40 c40Var = (c40) this.M.b.get(((h50) bundleV.getParcelable("state")).d);
                if (c40Var != null) {
                    if (H(2)) {
                        i = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + c40Var);
                    } else {
                        i = 2;
                    }
                    i50Var = new i50(bcVar, ahVar, c40Var, bundleV);
                    bundle2 = bundleV;
                } else {
                    i = 2;
                    bundle2 = bundleV;
                    i50Var = new i50(this.m, this.c, this.u.t.getClassLoader(), E(), bundleV);
                }
                c40 c40Var2 = i50Var.c;
                c40Var2.d = bundle2;
                c40Var2.u = this;
                if (H(i)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + c40Var2.g + "): " + c40Var2);
                }
                i50Var.m(this.u.t.getClassLoader());
                ahVar.n(i50Var);
                i50Var.e = this.t;
            }
        }
        w40 w40Var = this.M;
        w40Var.getClass();
        ArrayList arrayList2 = new ArrayList(w40Var.b.values());
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            c40 c40Var3 = (c40) obj2;
            if (map3.get(c40Var3.g) == null) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + c40Var3 + " that was not found in the set of active Fragments " + u40Var.c);
                }
                this.M.h(c40Var3);
                c40Var3.u = this;
                i50 i50Var2 = new i50(bcVar, ahVar, c40Var3);
                i50Var2.e = 1;
                i50Var2.k();
                c40Var3.n = true;
                i50Var2.k();
            }
        }
        ArrayList arrayList3 = u40Var.d;
        ((ArrayList) ahVar.a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                String str3 = (String) obj3;
                c40 c40VarC = ahVar.c(str3);
                if (c40VarC == null) {
                    nh0.j(gr0.f("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c40VarC);
                }
                ahVar.b(c40VarC);
            }
        }
        if (u40Var.e != null) {
            this.d = new ArrayList(u40Var.e.length);
            int i5 = 0;
            while (true) {
                tf[] tfVarArr = u40Var.e;
                if (i5 >= tfVarArr.length) {
                    break;
                }
                tf tfVar = tfVarArr[i5];
                ArrayList arrayList4 = tfVar.d;
                sf sfVar = new sf(this);
                tfVar.a(sfVar);
                sfVar.s = tfVar.i;
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    String str4 = (String) arrayList4.get(i6);
                    if (str4 != null) {
                        ((l50) sfVar.a.get(i6)).b = ahVar.c(str4);
                    }
                }
                sfVar.c(1);
                if (H(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + sfVar.s + "): " + sfVar);
                    PrintWriter printWriter = new PrintWriter(new wh0());
                    sfVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(sfVar);
                i5++;
            }
        } else {
            this.d = null;
        }
        this.i.set(u40Var.f);
        String str5 = u40Var.g;
        if (str5 != null) {
            c40 c40VarC2 = ahVar.c(str5);
            this.x = c40VarC2;
            q(c40VarC2);
        }
        ArrayList arrayList5 = u40Var.h;
        if (arrayList5 != null) {
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                this.j.put((String) arrayList5.get(i7), (uf) u40Var.i.get(i7));
            }
        }
        this.D = new ArrayDeque(u40Var.j);
    }

    public final Bundle V() {
        int i;
        ArrayList arrayList;
        tf[] tfVarArr;
        int size;
        Bundle bundle = new Bundle();
        C();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((ct) it.next()).e();
        }
        x(true);
        this.F = true;
        this.M.g = true;
        ah ahVar = this.c;
        ahVar.getClass();
        HashMap map = (HashMap) ahVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (i50 i50Var : map.values()) {
            if (i50Var != null) {
                c40 c40Var = i50Var.c;
                ahVar.v(c40Var.g, i50Var.o());
                arrayList2.add(c40Var.g);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + c40Var + ": " + c40Var.d);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.c;
        if (!map2.isEmpty()) {
            ah ahVar2 = this.c;
            synchronized (((ArrayList) ahVar2.a)) {
                try {
                    if (((ArrayList) ahVar2.a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) ahVar2.a).size());
                        ArrayList arrayList3 = (ArrayList) ahVar2.a;
                        int size2 = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            c40 c40Var2 = (c40) obj;
                            arrayList.add(c40Var2.g);
                            if (H(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + c40Var2.g + "): " + c40Var2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                tfVarArr = null;
            } else {
                tfVarArr = new tf[size];
                for (i = 0; i < size; i++) {
                    tfVarArr[i] = new tf((sf) this.d.get(i));
                    if (H(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            u40 u40Var = new u40();
            u40Var.g = null;
            ArrayList arrayList5 = new ArrayList();
            u40Var.h = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            u40Var.i = arrayList6;
            u40Var.c = arrayList2;
            u40Var.d = arrayList;
            u40Var.e = tfVarArr;
            u40Var.f = this.i.get();
            c40 c40Var3 = this.x;
            if (c40Var3 != null) {
                u40Var.g = c40Var3.g;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            u40Var.j = new ArrayList(this.D);
            bundle.putParcelable("state", u40Var);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) map2.get(str2));
            }
        } else if (H(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.u.u.removeCallbacks(this.N);
                    this.u.u.post(this.N);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(c40 c40Var, boolean z) {
        ViewGroup viewGroupD = D(c40Var);
        if (viewGroupD == null || !(viewGroupD instanceof g40)) {
            return;
        }
        ((g40) viewGroupD).setDrawDisappearingViewsLast(!z);
    }

    public final void Y(c40 c40Var, af0 af0Var) {
        if (c40Var == this.c.c(c40Var.g) && (c40Var.v == null || c40Var.u == this)) {
            c40Var.P = af0Var;
        } else {
            nh0.k("Fragment ", c40Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void Z(c40 c40Var) {
        if (c40Var != null) {
            if (c40Var != this.c.c(c40Var.g) || (c40Var.v != null && c40Var.u != this)) {
                nh0.k("Fragment ", c40Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        c40 c40Var2 = this.x;
        this.x = c40Var;
        q(c40Var2);
        q(this.x);
    }

    public final i50 a(c40 c40Var) {
        String str = c40Var.O;
        if (str != null) {
            k50.c(c40Var, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + c40Var);
        }
        i50 i50VarF = f(c40Var);
        c40Var.u = this;
        ah ahVar = this.c;
        ahVar.n(i50VarF);
        if (!c40Var.C) {
            ahVar.b(c40Var);
            c40Var.n = false;
            if (c40Var.H == null) {
                c40Var.L = false;
            }
            if (I(c40Var)) {
                this.E = true;
            }
        }
        return i50VarF;
    }

    public final void a0(c40 c40Var) {
        ViewGroup viewGroupD = D(c40Var);
        if (viewGroupD != null) {
            a40 a40Var = c40Var.K;
            if ((a40Var == null ? 0 : a40Var.e) + (a40Var == null ? 0 : a40Var.d) + (a40Var == null ? 0 : a40Var.c) + (a40Var == null ? 0 : a40Var.b) > 0) {
                if (viewGroupD.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupD.setTag(R.id.visible_removing_fragment_view_tag, c40Var);
                }
                c40 c40Var2 = (c40) viewGroupD.getTag(R.id.visible_removing_fragment_view_tag);
                a40 a40Var2 = c40Var.K;
                boolean z = a40Var2 != null ? a40Var2.a : false;
                if (c40Var2.K == null) {
                    return;
                }
                c40Var2.X().a = z;
            }
        }
    }

    public final void b(e40 e40Var, hq hqVar, c40 c40Var) {
        if (this.u != null) {
            nh0.j("Already attached");
            return;
        }
        this.u = e40Var;
        this.v = hqVar;
        this.w = c40Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (c40Var != null) {
            copyOnWriteArrayList.add(new o40(c40Var));
        } else if (e40Var != null) {
            copyOnWriteArrayList.add(e40Var);
        }
        if (this.w != null) {
            e0();
        }
        if (e40Var != null) {
            wq0 wq0VarT = e40Var.w.T();
            this.g = wq0VarT;
            wq0VarT.a(c40Var != null ? c40Var : e40Var, this.h);
        }
        int i = 0;
        if (c40Var != null) {
            w40 w40Var = c40Var.u.M;
            HashMap map = w40Var.c;
            w40 w40Var2 = (w40) map.get(c40Var.g);
            if (w40Var2 == null) {
                w40Var2 = new w40(w40Var.e);
                map.put(c40Var.g, w40Var2);
            }
            this.M = w40Var2;
        } else if (e40Var != null) {
            bf1 bf1VarK = e40Var.w.K();
            pr prVar = pr.b;
            prVar.getClass();
            ah ahVar = new ah(bf1VarK, w40.h, prVar);
            fm fmVarA = nx0.a(w40.class);
            String strU = y90.u(fmVarA);
            if (strU == null) {
                id.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.M = (w40) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
        } else {
            this.M = new w40(false);
        }
        this.M.g = M();
        this.c.d = this.M;
        e40 e40Var2 = this.u;
        if (e40Var2 != null && c40Var == null) {
            ui0 ui0VarB = e40Var2.b();
            ui0VarB.s("android:support:fragments", new k40(i, this));
            Bundle bundleG = ui0VarB.g("android:support:fragments");
            if (bundleG != null) {
                U(bundleG);
            }
        }
        e40 e40Var3 = this.u;
        if (e40Var3 != null) {
            zn znVar = e40Var3.w.k;
            String strConcat = "FragmentManager:".concat(c40Var != null ? q51.m(new StringBuilder(), c40Var.g, ":") : "");
            int i2 = 2;
            this.A = znVar.c(strConcat.concat("StartActivityForResult"), new i4(i2), new dh(this, i2));
            int i3 = 3;
            this.B = znVar.c(strConcat.concat("StartIntentSenderForResult"), new i4(i3), new dh(this, i3));
            int i4 = 1;
            this.C = znVar.c(strConcat.concat("RequestPermissions"), new i4(i4), new dh(this, i4));
        }
        e40 e40Var4 = this.u;
        if (e40Var4 != null) {
            qa qaVar = e40Var4.w;
            j40 j40Var = this.o;
            j40Var.getClass();
            qaVar.l.add(j40Var);
        }
        e40 e40Var5 = this.u;
        if (e40Var5 != null) {
            qa qaVar2 = e40Var5.w;
            j40 j40Var2 = this.p;
            j40Var2.getClass();
            qaVar2.m.add(j40Var2);
        }
        e40 e40Var6 = this.u;
        if (e40Var6 != null) {
            qa qaVar3 = e40Var6.w;
            j40 j40Var3 = this.q;
            j40Var3.getClass();
            qaVar3.o.add(j40Var3);
        }
        e40 e40Var7 = this.u;
        if (e40Var7 != null) {
            qa qaVar4 = e40Var7.w;
            j40 j40Var4 = this.r;
            j40Var4.getClass();
            qaVar4.p.add(j40Var4);
        }
        e40 e40Var8 = this.u;
        if (e40Var8 == null || c40Var != null) {
            return;
        }
        qa qaVar5 = e40Var8.w;
        m40 m40Var = this.s;
        m40Var.getClass();
        y6 y6Var = qaVar5.e;
        ((CopyOnWriteArrayList) y6Var.e).add(m40Var);
        ((Runnable) y6Var.d).run();
    }

    public final void c(c40 c40Var) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + c40Var);
        }
        if (c40Var.C) {
            c40Var.C = false;
            if (c40Var.m) {
                return;
            }
            this.c.b(c40Var);
            if (H(2)) {
                Log.v("FragmentManager", "add from attach: " + c40Var);
            }
            if (I(c40Var)) {
                this.E = true;
            }
        }
    }

    public final void c0() {
        ArrayList arrayListF = this.c.f();
        int size = arrayListF.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListF.get(i);
            i++;
            i50 i50Var = (i50) obj;
            c40 c40Var = i50Var.c;
            if (c40Var.I) {
                if (this.b) {
                    this.I = true;
                } else {
                    c40Var.I = false;
                    i50Var.k();
                }
            }
        }
    }

    public final void d() {
        this.b = false;
        this.K.clear();
        this.J.clear();
    }

    public final void d0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new wh0());
        e40 e40Var = this.u;
        if (e40Var == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            e40Var.w.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final HashSet e() {
        ct ctVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListF = this.c.f();
        int size = arrayListF.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListF.get(i);
            i++;
            ViewGroup viewGroup = ((i50) obj).c.G;
            if (viewGroup != null) {
                F().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof ct) {
                    ctVar = (ct) tag;
                } else {
                    ctVar = new ct(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, ctVar);
                }
                hashSet.add(ctVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    l40 l40Var = this.h;
                    l40Var.a = true;
                    o50 o50Var = l40Var.c;
                    if (o50Var != null) {
                        o50Var.a();
                    }
                    return;
                }
                l40 l40Var2 = this.h;
                ArrayList arrayList = this.d;
                l40Var2.a = (arrayList != null ? arrayList.size() : 0) > 0 && L(this.w);
                o50 o50Var2 = l40Var2.c;
                if (o50Var2 != null) {
                    o50Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i50 f(c40 c40Var) {
        String str = c40Var.g;
        ah ahVar = this.c;
        i50 i50Var = (i50) ((HashMap) ahVar.b).get(str);
        if (i50Var != null) {
            return i50Var;
        }
        i50 i50Var2 = new i50(this.m, ahVar, c40Var);
        i50Var2.m(this.u.t.getClassLoader());
        i50Var2.e = this.t;
        return i50Var2;
    }

    public final void g(c40 c40Var) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + c40Var);
        }
        if (c40Var.C) {
            return;
        }
        c40Var.C = true;
        if (c40Var.m) {
            if (H(2)) {
                Log.v("FragmentManager", "remove from detach: " + c40Var);
            }
            ah ahVar = this.c;
            synchronized (((ArrayList) ahVar.a)) {
                ((ArrayList) ahVar.a).remove(c40Var);
            }
            c40Var.m = false;
            if (I(c40Var)) {
                this.E = true;
            }
            a0(c40Var);
        }
    }

    public final void h(boolean z) {
        if (z && this.u != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null) {
                c40Var.F = true;
                if (z) {
                    c40Var.w.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.t >= 1) {
            for (c40 c40Var : this.c.h()) {
                if (c40Var != null) {
                    if (!c40Var.B ? c40Var.w.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null && K(c40Var)) {
                if (!c40Var.B ? c40Var.w.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c40Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                c40 c40Var2 = (c40) this.e.get(i);
                if (arrayList == null || !arrayList.contains(c40Var2)) {
                    c40Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((ct) it.next()).e();
        }
        e40 e40Var = this.u;
        ah ahVar = this.c;
        if (e40Var != null) {
            zIsChangingConfigurations = ((w40) ahVar.d).f;
        } else {
            qa qaVar = e40Var.t;
            if (q51.p(qaVar)) {
                zIsChangingConfigurations = true ^ qaVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((uf) it2.next()).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((w40) ahVar.d).f((String) obj, false);
                }
            }
        }
        t(-1);
        e40 e40Var2 = this.u;
        if (e40Var2 != null) {
            qa qaVar2 = e40Var2.w;
            j40 j40Var = this.p;
            j40Var.getClass();
            qaVar2.m.remove(j40Var);
        }
        e40 e40Var3 = this.u;
        if (e40Var3 != null) {
            qa qaVar3 = e40Var3.w;
            j40 j40Var2 = this.o;
            j40Var2.getClass();
            qaVar3.l.remove(j40Var2);
        }
        e40 e40Var4 = this.u;
        if (e40Var4 != null) {
            qa qaVar4 = e40Var4.w;
            j40 j40Var3 = this.q;
            j40Var3.getClass();
            qaVar4.o.remove(j40Var3);
        }
        e40 e40Var5 = this.u;
        if (e40Var5 != null) {
            qa qaVar5 = e40Var5.w;
            j40 j40Var4 = this.r;
            j40Var4.getClass();
            qaVar5.p.remove(j40Var4);
        }
        e40 e40Var6 = this.u;
        if (e40Var6 != null && this.w == null) {
            qa qaVar6 = e40Var6.w;
            m40 m40Var = this.s;
            m40Var.getClass();
            qaVar6.e.H(m40Var);
        }
        this.u = null;
        this.v = null;
        this.w = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((ui) it3.next()).cancel();
            }
            this.g = null;
        }
        p6 p6Var = this.A;
        if (p6Var != null) {
            p6Var.b();
            this.B.b();
            this.C.b();
        }
    }

    public final void l(boolean z) {
        if (z && this.u != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null) {
                c40Var.F = true;
                if (z) {
                    c40Var.w.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.u != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null && z) {
                c40Var.w.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListG = this.c.g();
        int size = arrayListG.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListG.get(i);
            i++;
            c40 c40Var = (c40) obj;
            if (c40Var != null) {
                c40Var.l0();
                c40Var.w.n();
            }
        }
    }

    public final boolean o() {
        if (this.t >= 1) {
            for (c40 c40Var : this.c.h()) {
                if (c40Var != null) {
                    if (!c40Var.B ? c40Var.w.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.t < 1) {
            return;
        }
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null && !c40Var.B) {
                c40Var.w.p();
            }
        }
    }

    public final void q(c40 c40Var) {
        if (c40Var != null) {
            if (c40Var != this.c.c(c40Var.g)) {
                return;
            }
            c40Var.u.getClass();
            boolean zL = L(c40Var);
            Boolean bool = c40Var.l;
            if (bool == null || bool.booleanValue() != zL) {
                c40Var.l = Boolean.valueOf(zL);
                t40 t40Var = c40Var.w;
                t40Var.e0();
                t40Var.q(t40Var.x);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.u != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null && z) {
                c40Var.w.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.t < 1) {
            return false;
        }
        boolean z = false;
        for (c40 c40Var : this.c.h()) {
            if (c40Var != null && K(c40Var)) {
                if (!c40Var.B ? c40Var.w.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (i50 i50Var : ((HashMap) this.c.b).values()) {
                if (i50Var != null) {
                    i50Var.e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((ct) it.next()).e();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c40 c40Var = this.w;
        if (c40Var != null) {
            sb.append(c40Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.w)));
            sb.append("}");
        } else {
            e40 e40Var = this.u;
            if (e40Var != null) {
                sb.append(e40Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        ah ahVar = this.c;
        ArrayList arrayList = (ArrayList) ahVar.a;
        String str4 = str + "    ";
        HashMap map = (HashMap) ahVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (i50 i50Var : map.values()) {
                printWriter.print(str);
                if (i50Var != null) {
                    c40 c40Var = i50Var.c;
                    printWriter.println(c40Var);
                    c40Var.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(c40Var.y));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(c40Var.z));
                    printWriter.print(" mTag=");
                    printWriter.println(c40Var.A);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(c40Var.c);
                    printWriter.print(" mWho=");
                    printWriter.print(c40Var.g);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(c40Var.t);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(c40Var.m);
                    printWriter.print(" mRemoving=");
                    printWriter.print(c40Var.n);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(c40Var.p);
                    printWriter.print(" mInLayout=");
                    printWriter.println(c40Var.q);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(c40Var.B);
                    printWriter.print(" mDetached=");
                    printWriter.print(c40Var.C);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(c40Var.E);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(c40Var.D);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(c40Var.J);
                    if (c40Var.u != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(c40Var.u);
                    }
                    if (c40Var.v != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(c40Var.v);
                    }
                    if (c40Var.x != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(c40Var.x);
                    }
                    if (c40Var.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(c40Var.h);
                    }
                    if (c40Var.d != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(c40Var.d);
                    }
                    if (c40Var.e != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(c40Var.e);
                    }
                    if (c40Var.f != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(c40Var.f);
                    }
                    Object objC = c40Var.i;
                    if (objC == null) {
                        t40 t40Var = c40Var.u;
                        objC = (t40Var == null || (str2 = c40Var.j) == null) ? null : t40Var.c.c(str2);
                    }
                    if (objC != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objC);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(c40Var.k);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    a40 a40Var = c40Var.K;
                    printWriter.println(a40Var == null ? false : a40Var.a);
                    a40 a40Var2 = c40Var.K;
                    if ((a40Var2 == null ? 0 : a40Var2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        a40 a40Var3 = c40Var.K;
                        printWriter.println(a40Var3 == null ? 0 : a40Var3.b);
                    }
                    a40 a40Var4 = c40Var.K;
                    if ((a40Var4 == null ? 0 : a40Var4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        a40 a40Var5 = c40Var.K;
                        printWriter.println(a40Var5 == null ? 0 : a40Var5.c);
                    }
                    a40 a40Var6 = c40Var.K;
                    if ((a40Var6 == null ? 0 : a40Var6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        a40 a40Var7 = c40Var.K;
                        printWriter.println(a40Var7 == null ? 0 : a40Var7.d);
                    }
                    a40 a40Var8 = c40Var.K;
                    if ((a40Var8 == null ? 0 : a40Var8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        a40 a40Var9 = c40Var.K;
                        printWriter.println(a40Var9 == null ? 0 : a40Var9.e);
                    }
                    if (c40Var.G != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(c40Var.G);
                    }
                    if (c40Var.H != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(c40Var.H);
                    }
                    if (c40Var.a0() != null) {
                        bf1 bf1VarK = c40Var.K();
                        v40 v40Var = yg0.c;
                        bf1VarK.getClass();
                        pr prVar = pr.b;
                        prVar.getClass();
                        ah ahVar2 = new ah(bf1VarK, v40Var, prVar);
                        fm fmVarA = nx0.a(yg0.class);
                        String strU = y90.u(fmVarA);
                        if (strU == null) {
                            id.q("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        x51 x51Var = ((yg0) ahVar2.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU))).b;
                        if (x51Var.f() > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (x51Var.f() > 0) {
                                if (x51Var.g(0) != null) {
                                    id.c();
                                    return;
                                }
                                printWriter.print(str4);
                                printWriter.print("  #");
                                printWriter.print(x51Var.d(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + c40Var.w + ":");
                    c40Var.w.u(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                c40 c40Var2 = (c40) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(c40Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                c40 c40Var3 = (c40) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c40Var3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                sf sfVar = (sf) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(sfVar.toString());
                sfVar.f(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (q40) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.v);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void v(q40 q40Var, boolean z) {
        if (!z) {
            if (this.u == null) {
                if (this.H) {
                    nh0.j("FragmentManager has been destroyed");
                    return;
                } else {
                    nh0.j("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (M()) {
                nh0.j("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.u == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(q40Var);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            nh0.j("FragmentManager is already executing transactions");
            return;
        }
        if (this.u == null) {
            if (this.H) {
                nh0.j("FragmentManager has been destroyed");
                return;
            } else {
                nh0.j("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.u.u.getLooper()) {
            nh0.j("Must be called from main thread of fragment host");
            return;
        }
        if (!z && M()) {
            nh0.j("Can not perform this action after onSaveInstanceState");
        } else if (this.J == null) {
            this.J = new ArrayList();
            this.K = new ArrayList();
        }
    }

    public final boolean x(boolean z) {
        boolean zA;
        ArrayList arrayList;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.J;
            ArrayList arrayList3 = this.K;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((q40) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.u.u.removeCallbacks(this.N);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.u.u.removeCallbacks(this.N);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                T(this.J, this.K);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        e0();
        if (this.I) {
            this.I = false;
            c0();
        }
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:307:0x070b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ViewGroup viewGroup;
        ArrayList arrayList3;
        Object obj;
        Object obj2;
        LinkedHashSet linkedHashSet;
        String str;
        Object objPrevious2;
        String str2;
        boolean z;
        int i3;
        boolean z2;
        String str3 = "FragmentNavigator";
        ah ahVar = this.c;
        boolean z3 = ((sf) arrayList.get(i)).p;
        ArrayList arrayList4 = this.L;
        if (arrayList4 == null) {
            this.L = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.L.addAll(ahVar.h());
        c40 c40Var = this.x;
        int i4 = i;
        boolean z4 = false;
        while (i4 < i2) {
            sf sfVar = (sf) arrayList.get(i4);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            ArrayList arrayList5 = this.L;
            if (zBooleanValue) {
                str2 = str3;
                z = z3;
                i3 = i4;
                z2 = z4;
                int i5 = 1;
                ArrayList arrayList6 = sfVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    l50 l50Var = (l50) arrayList6.get(size);
                    int i6 = l50Var.a;
                    if (i6 != i5) {
                        if (i6 != 3) {
                            switch (i6) {
                                case 6:
                                    arrayList5.add(l50Var.b);
                                    break;
                                case 8:
                                    c40Var = null;
                                    break;
                                case 9:
                                    c40Var = l50Var.b;
                                    break;
                                case 10:
                                    l50Var.i = l50Var.h;
                                    break;
                            }
                        } else {
                            arrayList5.add(l50Var.b);
                        }
                        size--;
                        i5 = 1;
                    }
                    arrayList5.remove(l50Var.b);
                    size--;
                    i5 = 1;
                }
            } else {
                ArrayList arrayList7 = sfVar.a;
                int i7 = 0;
                while (i7 < arrayList7.size()) {
                    l50 l50Var2 = (l50) arrayList7.get(i7);
                    boolean z5 = z3;
                    int i8 = l50Var2.a;
                    int i9 = i4;
                    int i10 = 1;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3 || i8 == 6) {
                                z4 = z4;
                                arrayList5.remove(l50Var2.b);
                                c40 c40Var2 = l50Var2.b;
                                if (c40Var2 == c40Var) {
                                    arrayList7.add(i7, new l50(9, c40Var2));
                                    i7++;
                                    c40Var = null;
                                }
                            } else if (i8 == 7) {
                                i10 = 1;
                            } else if (i8 != 8) {
                                z4 = z4;
                            } else {
                                z4 = z4;
                                arrayList7.add(i7, new l50(9, c40Var, 0));
                                l50Var2.c = true;
                                i7++;
                                c40Var = l50Var2.b;
                            }
                            i10 = 1;
                        } else {
                            z4 = z4;
                            c40 c40Var3 = l50Var2.b;
                            int i11 = c40Var3.z;
                            int size2 = arrayList5.size() - 1;
                            boolean z6 = false;
                            while (size2 >= 0) {
                                int i12 = size2;
                                c40 c40Var4 = (c40) arrayList5.get(size2);
                                String str4 = str3;
                                if (c40Var4.z != i11) {
                                    i11 = i11;
                                } else if (c40Var4 == c40Var3) {
                                    i11 = i11;
                                    z6 = true;
                                } else {
                                    if (c40Var4 == c40Var) {
                                        arrayList7.add(i7, new l50(9, c40Var4, 0));
                                        i7++;
                                        c40Var = null;
                                    }
                                    l50 l50Var3 = new l50(3, c40Var4, 0);
                                    l50Var3.d = l50Var2.d;
                                    l50Var3.f = l50Var2.f;
                                    l50Var3.e = l50Var2.e;
                                    l50Var3.g = l50Var2.g;
                                    arrayList7.add(i7, l50Var3);
                                    arrayList5.remove(c40Var4);
                                    i7++;
                                    c40Var = c40Var;
                                }
                                size2 = i12 - 1;
                                i11 = i11;
                                str3 = str4;
                            }
                            str3 = str3;
                            i10 = 1;
                            if (z6) {
                                arrayList7.remove(i7);
                                i7--;
                            } else {
                                l50Var2.a = 1;
                                l50Var2.c = true;
                                arrayList5.add(c40Var3);
                            }
                        }
                        i7 += i10;
                        z3 = z5;
                        i4 = i9;
                        z4 = z4;
                        str3 = str3;
                    }
                    arrayList5.add(l50Var2.b);
                    i7 += i10;
                    z3 = z5;
                    i4 = i9;
                    z4 = z4;
                    str3 = str3;
                }
                str2 = str3;
                z = z3;
                i3 = i4;
                z2 = z4;
            }
            z4 = z2 || sfVar.g;
            i4 = i3 + 1;
            z3 = z;
            str3 = str2;
        }
        String str5 = str3;
        boolean z7 = z3;
        boolean z8 = z4;
        this.L.clear();
        if (!z7 && this.t >= 1) {
            for (int i13 = i; i13 < i2; i13++) {
                ArrayList arrayList8 = ((sf) arrayList.get(i13)).a;
                int size3 = arrayList8.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList8.get(i14);
                    i14++;
                    c40 c40Var5 = ((l50) obj3).b;
                    if (c40Var5 != null && c40Var5.u != null) {
                        ahVar.n(f(c40Var5));
                    }
                }
            }
        }
        String str6 = "Unknown cmd: ";
        int i15 = i;
        while (i15 < i2) {
            sf sfVar2 = (sf) arrayList.get(i15);
            if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                sfVar2.c(-1);
                t40 t40Var = sfVar2.q;
                ArrayList arrayList9 = sfVar2.a;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    l50 l50Var4 = (l50) arrayList9.get(size4);
                    c40 c40Var6 = l50Var4.b;
                    if (c40Var6 != null) {
                        c40Var6.o = sfVar2.t;
                        if (c40Var6.K != null) {
                            c40Var6.X().a = true;
                        }
                        int i16 = sfVar2.f;
                        int i17 = 4097;
                        if (i16 == 4097) {
                            i17 = 8194;
                        } else if (i16 != 8194) {
                            i17 = 4100;
                            if (i16 != 8197) {
                                i17 = i16 != 4099 ? i16 != 4100 ? 0 : 8197 : 4099;
                            }
                        }
                        if (c40Var6.K != null || i17 != 0) {
                            c40Var6.X();
                            c40Var6.K.f = i17;
                        }
                        c40Var6.X();
                        c40Var6.K.getClass();
                    }
                    switch (l50Var4.a) {
                        case 1:
                            c40Var6.M0(l50Var4.d, l50Var4.e, l50Var4.f, l50Var4.g);
                            t40Var.X(c40Var6, true);
                            t40Var.S(c40Var6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str6 + l50Var4.a);
                        case 3:
                            c40Var6.M0(l50Var4.d, l50Var4.e, l50Var4.f, l50Var4.g);
                            t40Var.a(c40Var6);
                            break;
                        case 4:
                            c40Var6.M0(l50Var4.d, l50Var4.e, l50Var4.f, l50Var4.g);
                            t40Var.getClass();
                            b0(c40Var6);
                            break;
                        case 5:
                            c40Var6.M0(l50Var4.d, l50Var4.e, l50Var4.f, l50Var4.g);
                            t40Var.X(c40Var6, true);
                            t40Var.G(c40Var6);
                            break;
                        case 6:
                            c40Var6.M0(l50Var4.d, l50Var4.e, l50Var4.f, l50Var4.g);
                            t40Var.c(c40Var6);
                            break;
                        case 7:
                            c40Var6.M0(l50Var4.d, l50Var4.e, l50Var4.f, l50Var4.g);
                            t40Var.X(c40Var6, true);
                            t40Var.g(c40Var6);
                            break;
                        case 8:
                            t40Var.Z(null);
                            break;
                        case 9:
                            t40Var.Z(c40Var6);
                            break;
                        case 10:
                            t40Var.Y(c40Var6, l50Var4.h);
                            break;
                    }
                }
            } else {
                sfVar2.c(1);
                t40 t40Var2 = sfVar2.q;
                ArrayList arrayList10 = sfVar2.a;
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    l50 l50Var5 = (l50) arrayList10.get(i18);
                    c40 c40Var7 = l50Var5.b;
                    if (c40Var7 != null) {
                        c40Var7.o = sfVar2.t;
                        if (c40Var7.K != null) {
                            c40Var7.X().a = false;
                        }
                        int i19 = sfVar2.f;
                        if (c40Var7.K != null || i19 != 0) {
                            c40Var7.X();
                            c40Var7.K.f = i19;
                        }
                        c40Var7.X();
                        c40Var7.K.getClass();
                    }
                    switch (l50Var5.a) {
                        case 1:
                            c40Var7.M0(l50Var5.d, l50Var5.e, l50Var5.f, l50Var5.g);
                            t40Var2.X(c40Var7, false);
                            t40Var2.a(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str6 + l50Var5.a);
                        case 3:
                            c40Var7.M0(l50Var5.d, l50Var5.e, l50Var5.f, l50Var5.g);
                            t40Var2.S(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 4:
                            c40Var7.M0(l50Var5.d, l50Var5.e, l50Var5.f, l50Var5.g);
                            t40Var2.G(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 5:
                            c40Var7.M0(l50Var5.d, l50Var5.e, l50Var5.f, l50Var5.g);
                            t40Var2.X(c40Var7, false);
                            b0(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 6:
                            c40Var7.M0(l50Var5.d, l50Var5.e, l50Var5.f, l50Var5.g);
                            t40Var2.g(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 7:
                            c40Var7.M0(l50Var5.d, l50Var5.e, l50Var5.f, l50Var5.g);
                            t40Var2.X(c40Var7, false);
                            t40Var2.c(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 8:
                            t40Var2.Z(c40Var7);
                            i18++;
                            str6 = str6;
                            break;
                        case 9:
                            t40Var2.Z(null);
                            i18++;
                            str6 = str6;
                            break;
                        case 10:
                            t40Var2.Y(c40Var7, l50Var5.i);
                            i18++;
                            str6 = str6;
                            break;
                    }
                }
            }
            i15++;
            str6 = str6;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z8 && (arrayList3 = this.l) != null && !arrayList3.isEmpty()) {
            LinkedHashSet<c40> linkedHashSet2 = new LinkedHashSet();
            int size6 = arrayList.size();
            int i20 = 0;
            while (i20 < size6) {
                Object obj4 = arrayList.get(i20);
                i20++;
                sf sfVar3 = (sf) obj4;
                HashSet hashSet = new HashSet();
                for (int i21 = 0; i21 < sfVar3.a.size(); i21++) {
                    c40 c40Var8 = ((l50) sfVar3.a.get(i21)).b;
                    if (c40Var8 != null && sfVar3.g) {
                        hashSet.add(c40Var8);
                    }
                }
                linkedHashSet2.addAll(hashSet);
            }
            ArrayList arrayList11 = this.l;
            int size7 = arrayList11.size();
            int i22 = 0;
            while (i22 < size7) {
                Object obj5 = arrayList11.get(i22);
                i22++;
                d50 d50Var = (d50) obj5;
                for (c40 c40Var9 : linkedHashSet2) {
                    gn0 gn0Var = d50Var.a;
                    c40Var9.getClass();
                    if (zBooleanValue2) {
                        List list = (List) gn0Var.e.c.getValue();
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious2 = listIterator.previous();
                                linkedHashSet = linkedHashSet2;
                                ListIterator listIterator2 = listIterator;
                                if (!y90.e(((an0) objPrevious2).h, c40Var9.A)) {
                                    linkedHashSet2 = linkedHashSet;
                                    listIterator = listIterator2;
                                }
                            } else {
                                linkedHashSet = linkedHashSet2;
                                objPrevious2 = null;
                            }
                        }
                        an0 an0Var = (an0) objPrevious2;
                        if (b50.n()) {
                            str = str5;
                            Log.v(str, "OnBackStackChangedStarted for fragment " + c40Var9 + " associated with entry " + an0Var);
                        } else {
                            str = str5;
                        }
                        if (an0Var != null) {
                            e71 e71Var = gn0Var.c;
                            e71Var.j(null, t11.L((Set) e71Var.getValue(), an0Var));
                            mn0 mn0Var = gn0Var.h.b;
                            mn0Var.getClass();
                            if (!mn0Var.f.contains(an0Var)) {
                                nh0.j("Cannot transition entry that is not in the back stack");
                                return;
                            }
                            an0Var.a(af0.f);
                        }
                        str5 = str;
                        linkedHashSet2 = linkedHashSet;
                        arrayList11 = arrayList11;
                    } else {
                        linkedHashSet = linkedHashSet2;
                        str = str5;
                    }
                    str5 = str;
                    linkedHashSet2 = linkedHashSet;
                    arrayList11 = arrayList11;
                }
            }
            LinkedHashSet<c40> linkedHashSet3 = linkedHashSet2;
            String str7 = str5;
            ArrayList arrayList12 = this.l;
            int size8 = arrayList12.size();
            int i23 = 0;
            while (i23 < size8) {
                Object obj6 = arrayList12.get(i23);
                i23++;
                d50 d50Var2 = (d50) obj6;
                for (c40 c40Var10 : linkedHashSet3) {
                    b50 b50Var = d50Var2.b;
                    ArrayList arrayList13 = b50Var.g;
                    c40Var10.getClass();
                    ArrayList arrayList14 = arrayList12;
                    gn0 gn0Var2 = d50Var2.a;
                    int i24 = size8;
                    int i25 = i23;
                    ArrayList arrayListR0 = tm.r0((Collection) gn0Var2.e.c.getValue(), (Iterable) gn0Var2.f.c.getValue());
                    ListIterator listIterator3 = arrayListR0.listIterator(arrayListR0.size());
                    while (true) {
                        if (listIterator3.hasPrevious()) {
                            Object objPrevious3 = listIterator3.previous();
                            ListIterator listIterator4 = listIterator3;
                            obj = objPrevious3;
                            if (!y90.e(((an0) objPrevious3).h, c40Var10.A)) {
                                listIterator3 = listIterator4;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    an0 an0Var2 = (an0) obj;
                    boolean z9 = zBooleanValue2 && arrayList13.isEmpty() && c40Var10.n;
                    int size9 = arrayList13.size();
                    d50 d50Var3 = d50Var2;
                    int i26 = 0;
                    while (true) {
                        if (i26 < size9) {
                            Object obj7 = arrayList13.get(i26);
                            int i27 = i26 + 1;
                            int i28 = size9;
                            if (y90.e(((st0) obj7).c, c40Var10.A)) {
                                obj2 = obj7;
                            } else {
                                size9 = i28;
                                i26 = i27;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    st0 st0Var = (st0) obj2;
                    if (st0Var != null) {
                        arrayList13.remove(st0Var);
                    }
                    if (!z9 && b50.n()) {
                        Log.v(str7, "OnBackStackChangedCommitted for fragment " + c40Var10 + " associated with entry " + an0Var2);
                    }
                    boolean z10 = st0Var != null && ((Boolean) st0Var.d).booleanValue();
                    if (!zBooleanValue2 && !z10 && an0Var2 == null) {
                        nh0.e(q51.l("The fragment ", c40Var10, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
                        return;
                    }
                    if (an0Var2 != null) {
                        b50Var.l(c40Var10, an0Var2, gn0Var2);
                        if (z9) {
                            if (b50.n()) {
                                Log.v(str7, "OnBackStackChangedCommitted for fragment " + c40Var10 + " popping associated entry " + an0Var2 + " via system back");
                            }
                            gn0Var2.f(an0Var2, false);
                        }
                    }
                    arrayList12 = arrayList14;
                    size8 = i24;
                    i23 = i25;
                    d50Var2 = d50Var3;
                }
            }
        }
        for (int i29 = i; i29 < i2; i29++) {
            sf sfVar4 = (sf) arrayList.get(i29);
            if (zBooleanValue2) {
                for (int size10 = sfVar4.a.size() - 1; size10 >= 0; size10--) {
                    c40 c40Var11 = ((l50) sfVar4.a.get(size10)).b;
                    if (c40Var11 != null) {
                        f(c40Var11).k();
                    }
                }
            } else {
                ArrayList arrayList15 = sfVar4.a;
                int size11 = arrayList15.size();
                int i30 = 0;
                while (i30 < size11) {
                    Object obj8 = arrayList15.get(i30);
                    i30++;
                    c40 c40Var12 = ((l50) obj8).b;
                    if (c40Var12 != null) {
                        f(c40Var12).k();
                    }
                }
            }
        }
        N(this.t, true);
        HashSet<ct> hashSet2 = new HashSet();
        for (int i31 = i; i31 < i2; i31++) {
            ArrayList arrayList16 = ((sf) arrayList.get(i31)).a;
            int size12 = arrayList16.size();
            int i32 = 0;
            while (i32 < size12) {
                Object obj9 = arrayList16.get(i32);
                i32++;
                c40 c40Var13 = ((l50) obj9).b;
                if (c40Var13 != null && (viewGroup = c40Var13.G) != null) {
                    hashSet2.add(ct.f(viewGroup, this));
                }
            }
        }
        for (ct ctVar : hashSet2) {
            ctVar.d = zBooleanValue2;
            synchronized (ctVar.b) {
                try {
                    ctVar.g();
                    ArrayList arrayList17 = ctVar.b;
                    ListIterator listIterator5 = arrayList17.listIterator(arrayList17.size());
                    while (true) {
                        if (listIterator5.hasPrevious()) {
                            objPrevious = listIterator5.previous();
                            a61 a61Var = (a61) objPrevious;
                            View view = a61Var.c.H;
                            view.getClass();
                            char c = 4;
                            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c = 2;
                                } else if (visibility != 4) {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                    c = 3;
                                }
                            }
                            if (a61Var.a != 2 || c == 2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    ctVar.e = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ctVar.c();
        }
        for (int i33 = i; i33 < i2; i33++) {
            sf sfVar5 = (sf) arrayList.get(i33);
            if (((Boolean) arrayList2.get(i33)).booleanValue() && sfVar5.s >= 0) {
                sfVar5.s = -1;
            }
            sfVar5.getClass();
        }
        if (!z8 || this.l == null) {
            return;
        }
        for (int i34 = 0; i34 < this.l.size(); i34++) {
            ((d50) this.l.get(i34)).getClass();
        }
    }

    public final int z(String str, boolean z, int i) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            sf sfVar = (sf) this.d.get(size);
            if ((str != null && str.equals(sfVar.i)) || (i >= 0 && i == sfVar.s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            sf sfVar2 = (sf) this.d.get(size - 1);
            if ((str == null || !str.equals(sfVar2.i)) && (i < 0 || i != sfVar2.s)) {
                break;
            }
            size--;
        }
        return size;
    }
}
