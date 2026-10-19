package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yz0 {
    public final LinkedHashMap a;
    public final gi b;

    public yz0() {
        this.a = new LinkedHashMap();
        this.b = new gi(nx.c);
    }

    public final Object a(String str) {
        Object value;
        gi giVar = this.b;
        giVar.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) giVar.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) giVar.d;
        try {
            e71 e71Var = (e71) linkedHashMap2.get(str);
            if (e71Var != null && (value = e71Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) giVar.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(Object obj, String str) {
        Object obj2;
        if (obj != null) {
            ArrayList arrayList = a01.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                do {
                    if (i < size) {
                        obj2 = arrayList.get(i);
                        i++;
                    }
                } while (!((Class) obj2).isInstance(obj));
            }
            nh0.h(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = a01.a;
        Object obj3 = this.a.get(str);
        vm0 vm0Var = obj3 instanceof vm0 ? (vm0) obj3 : null;
        if (vm0Var != null) {
            vm0Var.l(obj);
        }
        this.b.g(obj, str);
    }

    public yz0(jj0 jj0Var) {
        this.a = new LinkedHashMap();
        this.b = new gi(jj0Var);
    }
}
