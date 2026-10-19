package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gm {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public gm(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            ze0 ze0Var = (ze0) entry.getValue();
            List arrayList = (List) this.a.get(ze0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(ze0Var, arrayList);
            }
            arrayList.add((hm) entry.getKey());
        }
    }

    public static void a(List list, gf0 gf0Var, ze0 ze0Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                hm hmVar = (hm) list.get(size);
                Method method = hmVar.b;
                try {
                    int i = hmVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, gf0Var);
                    } else if (i == 2) {
                        method.invoke(obj, gf0Var, ze0Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
