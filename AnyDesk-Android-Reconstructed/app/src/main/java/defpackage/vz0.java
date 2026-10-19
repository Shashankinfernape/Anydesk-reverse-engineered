package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class vz0 implements Iterable {
    public sz0 c;
    public sz0 d;
    public final WeakHashMap e = new WeakHashMap();
    public int f = 0;

    public sz0 a(Object obj) {
        sz0 sz0Var = this.c;
        while (sz0Var != null && !sz0Var.c.equals(obj)) {
            sz0Var = sz0Var.e;
        }
        return sz0Var;
    }

    public Object b(Object obj) {
        sz0 sz0VarA = a(obj);
        if (sz0VarA == null) {
            return null;
        }
        this.f--;
        WeakHashMap weakHashMap = this.e;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((uz0) it.next()).a(sz0VarA);
            }
        }
        sz0 sz0Var = sz0VarA.f;
        sz0 sz0Var2 = sz0VarA.e;
        if (sz0Var != null) {
            sz0Var.e = sz0Var2;
        } else {
            this.c = sz0Var2;
        }
        sz0 sz0Var3 = sz0VarA.e;
        if (sz0Var3 != null) {
            sz0Var3.f = sz0Var;
        } else {
            this.d = sz0Var;
        }
        sz0VarA.e = null;
        sz0VarA.f = null;
        return sz0VarA.d;
    }

    public final boolean equals(Object obj) {
        rz0 rz0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vz0)) {
            return false;
        }
        vz0 vz0Var = (vz0) obj;
        if (this.f != vz0Var.f) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = vz0Var.iterator();
        while (true) {
            rz0Var = (rz0) it;
            if (!rz0Var.hasNext()) {
                break;
            }
            rz0 rz0Var2 = (rz0) it2;
            if (!rz0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) rz0Var.next();
            Object next = rz0Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (rz0Var.hasNext() || ((rz0) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            rz0 rz0Var = (rz0) it;
            if (!rz0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) rz0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        rz0 rz0Var = new rz0(this.c, this.d, 0);
        this.e.put(rz0Var, Boolean.FALSE);
        return rz0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            rz0 rz0Var = (rz0) it;
            if (!rz0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) rz0Var.next()).toString());
            if (rz0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
