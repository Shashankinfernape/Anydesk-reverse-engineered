package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class an0 implements gf0, cf1, q70, g01 {
    public final yg c;
    public vn0 d;
    public final Bundle e;
    public af0 f;
    public final nn0 g;
    public final String h;
    public final Bundle i;
    public final dn0 j = new dn0(this);
    public final g81 k = new g81(new y(4, this));

    public an0(yg ygVar, vn0 vn0Var, Bundle bundle, af0 af0Var, nn0 nn0Var, String str, Bundle bundle2) {
        this.c = ygVar;
        this.d = vn0Var;
        this.e = bundle;
        this.f = af0Var;
        this.g = nn0Var;
        this.h = str;
        this.i = bundle2;
    }

    @Override // defpackage.cf1
    public final bf1 K() {
        dn0 dn0Var = this.j;
        if (!dn0Var.b) {
            nh0.j("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (((if0) dn0Var.l).d == af0.c) {
            nh0.j("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        nn0 nn0Var = (nn0) dn0Var.i;
        if (nn0Var == null) {
            nh0.j("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = (String) dn0Var.j;
        str.getClass();
        LinkedHashMap linkedHashMap = nn0Var.b;
        bf1 bf1Var = (bf1) linkedHashMap.get(str);
        if (bf1Var != null) {
            return bf1Var;
        }
        bf1 bf1Var2 = new bf1();
        linkedHashMap.put(str, bf1Var2);
        return bf1Var2;
    }

    @Override // defpackage.gf0
    public final if0 R() {
        return (if0) this.j.l;
    }

    public final void a(af0 af0Var) {
        dn0 dn0Var = this.j;
        dn0Var.getClass();
        dn0Var.h = af0Var;
        dn0Var.d();
    }

    @Override // defpackage.g01
    public final ui0 b() {
        return (ui0) ((ui0) this.j.k).d;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof an0)) {
            an0 an0Var = (an0) obj;
            Bundle bundle = an0Var.e;
            if (y90.e(this.h, an0Var.h) && y90.e(this.d, an0Var.d) && y90.e((if0) this.j.l, (if0) an0Var.j.l) && y90.e(b(), an0Var.b())) {
                Bundle bundle2 = this.e;
                if (y90.e(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    if (setKeySet.isEmpty()) {
                        return true;
                    }
                    for (String str : setKeySet) {
                        if (!y90.e(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.d.hashCode() + (this.h.hashCode() * 31);
        Bundle bundle = this.e;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((((if0) this.j.l).hashCode() + (iHashCode * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    @Override // defpackage.q70
    public final um0 t() {
        Application application;
        dn0 dn0Var = this.j;
        dn0Var.getClass();
        um0 um0Var = new um0(0);
        us0 us0Var = lk0.h;
        an0 an0Var = (an0) dn0Var.c;
        LinkedHashMap linkedHashMap = um0Var.a;
        linkedHashMap.put(us0Var, an0Var);
        linkedHashMap.put(lk0.i, an0Var);
        Bundle bundleB = dn0Var.b();
        if (bundleB != null) {
            linkedHashMap.put(lk0.j, bundleB);
        }
        yg ygVar = this.c;
        if (ygVar != null) {
            Context applicationContext = ygVar.a.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        } else {
            application = null;
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(ye1.e, application2);
        }
        return um0Var;
    }

    public final String toString() {
        return this.j.toString();
    }
}
