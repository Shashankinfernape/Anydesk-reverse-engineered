package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w40 extends ve1 {
    public static final v40 h = new v40(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public w40(boolean z) {
        this.e = z;
    }

    @Override // defpackage.ve1
    public final void d() {
        if (t40.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(c40 c40Var, boolean z) {
        if (t40.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + c40Var);
        }
        g(c40Var.g, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w40.class == obj.getClass()) {
            w40 w40Var = (w40) obj;
            if (this.b.equals(w40Var.b) && this.c.equals(w40Var.c) && this.d.equals(w40Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z) {
        if (t40.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z);
    }

    public final void g(String str, boolean z) {
        HashMap map = this.c;
        w40 w40Var = (w40) map.get(str);
        if (w40Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(w40Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    w40Var.f((String) obj, true);
                }
            }
            w40Var.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        bf1 bf1Var = (bf1) map2.get(str);
        if (bf1Var != null) {
            bf1Var.a();
            map2.remove(str);
        }
    }

    public final void h(c40 c40Var) {
        if (this.g) {
            if (t40.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(c40Var.g) == null || !t40.H(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + c40Var);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
