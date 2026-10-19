package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@ep0("dialog")
public final class cu extends fp0 {
    public final Context c;
    public final t40 d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final ew0 f = new ew0(3, this);
    public final LinkedHashMap g = new LinkedHashMap();

    public cu(Context context, t40 t40Var) {
        this.c = context;
        this.d = t40Var;
    }

    @Override // defpackage.fp0
    public final vn0 a() {
        return new au(this);
    }

    @Override // defpackage.fp0
    public final void d(List list, eo0 eo0Var) {
        t40 t40Var = this.d;
        if (t40Var.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            an0 an0Var = (an0) it.next();
            k(an0Var).Q0(t40Var, an0Var.h);
            an0 an0Var2 = (an0) tm.p0((List) b().e.c.getValue());
            boolean zH0 = tm.h0((Iterable) b().f.c.getValue(), an0Var2);
            b().h(an0Var);
            if (an0Var2 != null && !zH0) {
                b().c(an0Var2);
            }
        }
    }

    @Override // defpackage.fp0
    public final void e(gn0 gn0Var) {
        if0 if0Var;
        this.a = gn0Var;
        this.b = true;
        Iterator it = ((List) gn0Var.e.c.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            t40 t40Var = this.d;
            if (!zHasNext) {
                t40Var.n.add(new f50() { // from class: zt
                    @Override // defpackage.f50
                    public final void d(t40 t40Var2, c40 c40Var) {
                        t40Var2.getClass();
                        c40Var.getClass();
                        cu cuVar = this.c;
                        LinkedHashSet linkedHashSet = cuVar.e;
                        String str = c40Var.A;
                        if ((linkedHashSet instanceof yd0) && !(linkedHashSet instanceof zd0)) {
                            ec1.I(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            c40Var.Q.a(cuVar.f);
                        }
                        LinkedHashMap linkedHashMap = cuVar.g;
                        String str2 = c40Var.A;
                        ec1.d(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
            an0 an0Var = (an0) it.next();
            xt xtVar = (xt) t40Var.B(an0Var.h);
            if (xtVar == null || (if0Var = xtVar.Q) == null) {
                this.e.add(an0Var.h);
            } else {
                if0Var.a(this.f);
            }
        }
    }

    @Override // defpackage.fp0
    public final void f(an0 an0Var) {
        String str = an0Var.h;
        t40 t40Var = this.d;
        if (t40Var.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        xt xtVar = (xt) this.g.get(str);
        if (xtVar == null) {
            c40 c40VarB = t40Var.B(str);
            xtVar = c40VarB instanceof xt ? (xt) c40VarB : null;
        }
        if (xtVar != null) {
            xtVar.Q.f(this.f);
            xtVar.O0(false, false);
        }
        k(an0Var).Q0(t40Var, str);
        gn0 gn0VarB = b();
        List list = (List) gn0VarB.e.c.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            an0 an0Var2 = (an0) listIterator.previous();
            if (y90.e(an0Var2.h, str)) {
                e71 e71Var = gn0VarB.c;
                e71Var.j(null, t11.L(t11.L((Set) e71Var.getValue(), an0Var2), an0Var));
                gn0VarB.d(an0Var);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.fp0
    public final void i(an0 an0Var, boolean z) {
        t40 t40Var = this.d;
        if (t40Var.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.c.getValue();
        int iIndexOf = list.indexOf(an0Var);
        Iterator it = tm.s0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            c40 c40VarB = t40Var.B(((an0) it.next()).h);
            if (c40VarB != null) {
                ((xt) c40VarB).O0(false, false);
            }
        }
        l(iIndexOf, an0Var, z);
    }

    public final xt k(an0 an0Var) {
        vn0 vn0Var = an0Var.d;
        vn0Var.getClass();
        au auVar = (au) vn0Var;
        String str = auVar.i;
        if (str == null) {
            nh0.j("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        n40 n40VarE = this.d.E();
        context.getClassLoader();
        c40 c40VarA = n40VarE.a(str);
        c40VarA.getClass();
        if (xt.class.isAssignableFrom(c40VarA.getClass())) {
            xt xtVar = (xt) c40VarA;
            xtVar.N0(an0Var.j.b());
            xtVar.Q.a(this.f);
            this.g.put(an0Var.h, xtVar);
            return xtVar;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = auVar.i;
        if (str2 != null) {
            nh0.e(q51.m(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        nh0.j("DialogFragment class was not set");
        return null;
    }

    public final void l(int i, an0 an0Var, boolean z) {
        an0 an0Var2 = (an0) tm.k0(i - 1, (List) b().e.c.getValue());
        boolean zH0 = tm.h0((Iterable) b().f.c.getValue(), an0Var2);
        b().f(an0Var, z);
        if (an0Var2 == null || zH0) {
            return;
        }
        b().c(an0Var2);
    }
}
