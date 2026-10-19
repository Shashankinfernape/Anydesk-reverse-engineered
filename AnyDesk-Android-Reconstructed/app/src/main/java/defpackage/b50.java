package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@ep0("fragment")
public class b50 extends fp0 {
    public final Context c;
    public final t40 d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final x40 h = new x40(0, this);
    public final z i = new z(2, this);

    public static final class a extends ve1 {
        public WeakReference b;

        @Override // defpackage.ve1
        public final void d() {
            WeakReference weakReference = this.b;
            if (weakReference == null) {
                y90.W("completeTransition");
                throw null;
            }
            o50 o50Var = (o50) weakReference.get();
            if (o50Var != null) {
                o50Var.a();
            }
        }
    }

    public b50(Context context, t40 t40Var, int i) {
        this.c = context;
        this.d = t40Var;
        this.e = i;
    }

    public static void k(b50 b50Var, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = b50Var.g;
        if (z2) {
            zm.e0(arrayList, new z(3, str));
        }
        arrayList.add(new st0(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // defpackage.fp0
    public final vn0 a() {
        return new c50(this);
    }

    @Override // defpackage.fp0
    public final void d(List list, eo0 eo0Var) {
        t40 t40Var = this.d;
        if (t40Var.M()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            an0 an0Var = (an0) it.next();
            boolean zIsEmpty = ((List) b().e.c.getValue()).isEmpty();
            int i = 0;
            if (eo0Var == null || zIsEmpty || !eo0Var.b || !this.f.remove(an0Var.h)) {
                sf sfVarM = m(an0Var, eo0Var);
                String str = an0Var.h;
                if (!zIsEmpty) {
                    an0 an0Var2 = (an0) tm.p0((List) b().e.c.getValue());
                    if (an0Var2 != null) {
                        k(this, an0Var2.h, 6);
                    }
                    k(this, str, 6);
                    if (!sfVarM.h) {
                        nh0.j("This FragmentTransaction is not allowed to be added to the back stack.");
                        return;
                    } else {
                        sfVarM.g = true;
                        sfVarM.i = str;
                    }
                }
                sfVarM.d(false);
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + an0Var);
                }
                b().h(an0Var);
            } else {
                t40Var.v(new s40(t40Var, an0Var.h, i), false);
                b().h(an0Var);
            }
        }
    }

    @Override // defpackage.fp0
    public final void e(final gn0 gn0Var) {
        this.a = gn0Var;
        this.b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        f50 f50Var = new f50() { // from class: y40
            @Override // defpackage.f50
            public final void d(t40 t40Var, c40 c40Var) {
                Object objPrevious;
                t40Var.getClass();
                c40Var.getClass();
                gn0 gn0Var2 = gn0Var;
                List list = (List) gn0Var2.e.c.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!y90.e(((an0) objPrevious).h, c40Var.A));
                an0 an0Var = (an0) objPrevious;
                boolean zN = b50.n();
                b50 b50Var = this;
                if (zN) {
                    Log.v("FragmentNavigator", "Attaching fragment " + c40Var + " associated with entry " + an0Var + " to FragmentManager " + b50Var.d);
                }
                if (an0Var != null) {
                    c40Var.S.e(c40Var, new e50(new z40(b50Var, c40Var, an0Var), 0));
                    c40Var.Q.a(b50Var.h);
                    b50Var.l(c40Var, an0Var, gn0Var2);
                }
            }
        };
        t40 t40Var = this.d;
        t40Var.n.add(f50Var);
        d50 d50Var = new d50(gn0Var, this);
        if (t40Var.l == null) {
            t40Var.l = new ArrayList();
        }
        t40Var.l.add(d50Var);
    }

    @Override // defpackage.fp0
    public final void f(an0 an0Var) {
        String str = an0Var.h;
        t40 t40Var = this.d;
        if (t40Var.M()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        sf sfVarM = m(an0Var, null);
        List list = (List) b().e.c.getValue();
        if (list.size() > 1) {
            an0 an0Var2 = (an0) tm.k0(list.size() - 2, list);
            if (an0Var2 != null) {
                k(this, an0Var2.h, 6);
            }
            k(this, str, 4);
            t40Var.v(new r40(t40Var, str, -1), false);
            k(this, str, 2);
            if (!sfVarM.h) {
                nh0.j("This FragmentTransaction is not allowed to be added to the back stack.");
                return;
            } else {
                sfVarM.g = true;
                sfVarM.i = str;
            }
        }
        sfVarM.d(false);
        b().d(an0Var);
    }

    @Override // defpackage.fp0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            zm.d0(stringArrayList, linkedHashSet);
        }
    }

    @Override // defpackage.fp0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return hq.g(new st0("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // defpackage.fp0
    public final void i(an0 an0Var, boolean z) {
        int i;
        t40 t40Var = this.d;
        if (t40Var.M()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.c.getValue();
        int iIndexOf = list.indexOf(an0Var);
        List listSubList = list.subList(iIndexOf, list.size());
        an0 an0Var2 = (an0) tm.i0(list);
        int i2 = 1;
        an0 an0Var3 = (an0) tm.k0(iIndexOf - 1, list);
        if (an0Var3 != null) {
            k(this, an0Var3.h, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    k(this, ((an0) obj).h, 4);
                }
                if (z) {
                    for (an0 an0Var4 : tm.s0(listSubList)) {
                        if (y90.e(an0Var4, an0Var2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + an0Var4);
                        } else {
                            t40Var.v(new s40(t40Var, an0Var4.h, i2), false);
                            this.f.add(an0Var4.h);
                        }
                    }
                } else {
                    t40Var.v(new r40(t40Var, an0Var.h, -1), false);
                }
                if (n()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + an0Var + " with savedState " + z);
                }
                b().f(an0Var, z);
                return;
            }
            Object next = it.next();
            an0 an0Var5 = (an0) next;
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            String str = an0Var5.h;
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                st0 st0Var = (st0) it2.next();
                st0Var.getClass();
                String str2 = (String) st0Var.c;
                if (i3 < 0) {
                    um.b0();
                    throw null;
                }
                if (y90.e(str, str2)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i >= 0 || !y90.e(an0Var5.h, an0Var2.h)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(c40 c40Var, an0 an0Var, gn0 gn0Var) {
        c40Var.getClass();
        bf1 bf1VarK = c40Var.K();
        j90 j90Var = new j90(0);
        j90Var.a(nx0.a(a.class), new a0(6));
        i90 i90VarB = j90Var.b();
        pr prVar = pr.b;
        prVar.getClass();
        ah ahVar = new ah(bf1VarK, i90VarB, prVar);
        fm fmVarA = nx0.a(a.class);
        String strU = y90.u(fmVarA);
        if (strU == null) {
            id.q("Local and anonymous classes can not be ViewModels");
        } else {
            ((a) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU))).b = new WeakReference(new a50(an0Var, gn0Var, this, c40Var));
        }
    }

    public final sf m(an0 an0Var, eo0 eo0Var) {
        vn0 vn0Var = an0Var.d;
        vn0Var.getClass();
        Bundle bundleB = an0Var.j.b();
        String str = ((c50) vn0Var).i;
        if (str == null) {
            nh0.j("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        t40 t40Var = this.d;
        n40 n40VarE = t40Var.E();
        context.getClassLoader();
        c40 c40VarA = n40VarE.a(str);
        c40VarA.getClass();
        c40VarA.N0(bundleB);
        sf sfVar = new sf(t40Var);
        int i = eo0Var != null ? eo0Var.f : -1;
        int i2 = eo0Var != null ? eo0Var.g : -1;
        int i3 = eo0Var != null ? eo0Var.h : -1;
        int i4 = eo0Var != null ? eo0Var.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            sfVar.b = i;
            sfVar.c = i2;
            sfVar.d = i3;
            sfVar.e = i5;
        }
        sfVar.h(this.e, c40VarA, an0Var.h);
        sfVar.i(c40VarA);
        sfVar.p = true;
        return sfVar;
    }
}
