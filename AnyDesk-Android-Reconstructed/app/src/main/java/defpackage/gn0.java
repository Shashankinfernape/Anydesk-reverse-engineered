package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gn0 {
    public final us0 a;
    public final e71 b;
    public final e71 c;
    public boolean d;
    public final cw0 e;
    public final cw0 f;
    public final fp0 g;
    public final /* synthetic */ bo0 h;

    public gn0(bo0 bo0Var, fp0 fp0Var) {
        fp0Var.getClass();
        this.h = bo0Var;
        this.a = new us0(15);
        e71 e71VarB = ec1.b(mx.c);
        this.b = e71VarB;
        e71 e71VarB2 = ec1.b(px.c);
        this.c = e71VarB2;
        this.e = new cw0(e71VarB);
        this.f = new cw0(e71VarB2);
        this.g = fp0Var;
    }

    public final void a(an0 an0Var) {
        an0Var.getClass();
        synchronized (this.a) {
            e71 e71Var = this.b;
            Collection collection = (Collection) e71Var.getValue();
            collection.getClass();
            ArrayList arrayList = new ArrayList(collection.size() + 1);
            arrayList.addAll(collection);
            arrayList.add(an0Var);
            e71Var.j(null, arrayList);
        }
    }

    public final an0 b(vn0 vn0Var, Bundle bundle) {
        mn0 mn0Var = this.h.b;
        mn0Var.getClass();
        return fw.d(mn0Var.a.c, vn0Var, bundle, mn0Var.h(), mn0Var.n);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    public final void c(an0 an0Var) {
        nn0 nn0Var;
        bf1 bf1Var;
        an0Var.getClass();
        mn0 mn0Var = this.h.b;
        e71 e71Var = mn0Var.h;
        String str = an0Var.h;
        LinkedHashMap linkedHashMap = mn0Var.v;
        boolean zE = y90.e(linkedHashMap.get(an0Var), Boolean.TRUE);
        e71 e71Var2 = this.c;
        e71Var2.j(null, t11.K((Set) e71Var2.getValue(), an0Var));
        linkedHashMap.remove(an0Var);
        qd qdVar = mn0Var.f;
        if (qdVar.contains(an0Var)) {
            if (this.d) {
                return;
            }
            mn0Var.s();
            e71 e71Var3 = mn0Var.g;
            ArrayList arrayList = new ArrayList(qdVar);
            e71Var3.getClass();
            e71Var3.j(null, arrayList);
            ArrayList arrayListO = mn0Var.o();
            e71Var.getClass();
            e71Var.j(null, arrayListO);
            return;
        }
        mn0Var.r(an0Var);
        if (((if0) an0Var.j.l).d.compareTo(af0.e) >= 0) {
            an0Var.a(af0.c);
        }
        if (!qdVar.isEmpty()) {
            Iterator it = qdVar.iterator();
            while (it.hasNext()) {
                if (y90.e(((an0) it.next()).h, str)) {
                }
            }
            if (!zE) {
                str.getClass();
                bf1Var = (bf1) nn0Var.b.remove(str);
                if (bf1Var != null) {
                    bf1Var.a();
                }
            }
        } else if (!zE && (nn0Var = mn0Var.n) != null) {
            str.getClass();
            bf1Var = (bf1) nn0Var.b.remove(str);
            if (bf1Var != null) {
                bf1Var.a();
            }
        }
        mn0Var.s();
        ArrayList arrayListO2 = mn0Var.o();
        e71Var.getClass();
        e71Var.j(null, arrayListO2);
    }

    public final void d(an0 an0Var) {
        int iNextIndex;
        synchronized (this.a) {
            try {
                ArrayList arrayListX0 = tm.x0((Collection) this.e.c.getValue());
                ListIterator listIterator = arrayListX0.listIterator(arrayListX0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (y90.e(((an0) listIterator.previous()).h, an0Var.h)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListX0.set(iNextIndex, an0Var);
                e71 e71Var = this.b;
                e71Var.getClass();
                e71Var.j(null, arrayListX0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(an0 an0Var, boolean z) {
        mn0 mn0Var = this.h.b;
        a50 a50Var = new a50(this, an0Var, z);
        mn0Var.getClass();
        fp0 fp0VarB = mn0Var.r.b(an0Var.d.c);
        mn0Var.v.put(an0Var, Boolean.valueOf(z));
        if (!fp0VarB.equals(this.g)) {
            Object obj = mn0Var.s.get(fp0VarB);
            obj.getClass();
            ((gn0) obj).e(an0Var, z);
            return;
        }
        jn0 jn0Var = mn0Var.u;
        if (jn0Var != null) {
            jn0Var.h(an0Var);
            a50Var.a();
            return;
        }
        qd qdVar = mn0Var.f;
        int iIndexOf = qdVar.indexOf(an0Var);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + an0Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != qdVar.e) {
            mn0Var.l(((an0) qdVar.get(i)).d.d.a, true, false);
        }
        mn0.n(mn0Var, an0Var);
        a50Var.a();
        mn0Var.b.a();
        mn0Var.b();
    }

    public final void f(an0 an0Var, boolean z) {
        Object objPrevious;
        e71 e71Var = this.c;
        Iterable iterable = (Iterable) e71Var.getValue();
        boolean z2 = iterable instanceof Collection;
        cw0 cw0Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((an0) it.next()) == an0Var) {
                    Iterable iterable2 = (Iterable) cw0Var.c.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((an0) it2.next()) == an0Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        e71Var.j(null, t11.L((Set) e71Var.getValue(), an0Var));
        e71 e71Var2 = cw0Var.c;
        e71 e71Var3 = cw0Var.c;
        List list = (List) e71Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            an0 an0Var2 = (an0) objPrevious;
            if (!y90.e(an0Var2, an0Var) && ((List) e71Var3.getValue()).lastIndexOf(an0Var2) < ((List) e71Var3.getValue()).lastIndexOf(an0Var)) {
                break;
            }
        }
        an0 an0Var3 = (an0) objPrevious;
        if (an0Var3 != null) {
            e71Var.j(null, t11.L((Set) e71Var.getValue(), an0Var3));
        }
        e(an0Var, z);
    }

    public final void g(an0 an0Var) {
        an0Var.getClass();
        mn0 mn0Var = this.h.b;
        mn0Var.getClass();
        fp0 fp0VarB = mn0Var.r.b(an0Var.d.c);
        if (!fp0VarB.equals(this.g)) {
            Object obj = mn0Var.s.get(fp0VarB);
            if (obj == null) {
                throw new IllegalStateException(q51.m(new StringBuilder("NavigatorBackStack for "), an0Var.d.c, " should already be created").toString());
            }
            ((gn0) obj).g(an0Var);
            return;
        }
        z50 z50Var = mn0Var.t;
        if (z50Var != null) {
            z50Var.h(an0Var);
            a(an0Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + an0Var.d + " outside of the call to navigate(). ");
        }
    }

    public final void h(an0 an0Var) {
        e71 e71Var = this.c;
        Iterable iterable = (Iterable) e71Var.getValue();
        boolean z = iterable instanceof Collection;
        cw0 cw0Var = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((an0) it.next()) == an0Var) {
                    Iterable iterable2 = (Iterable) cw0Var.c.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((an0) it2.next()) == an0Var) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        an0 an0Var2 = (an0) tm.p0((List) cw0Var.c.getValue());
        if (an0Var2 != null) {
            e71Var.j(null, t11.L((Set) e71Var.getValue(), an0Var2));
        }
        e71Var.j(null, t11.L((Set) e71Var.getValue(), an0Var));
        g(an0Var);
    }
}
