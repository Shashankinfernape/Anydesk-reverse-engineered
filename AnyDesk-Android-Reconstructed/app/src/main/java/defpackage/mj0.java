package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj0 extends lk0 {
    public static int P(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map Q(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return nx.c;
        }
        int i = 0;
        if (size == 1) {
            st0 st0Var = (st0) arrayList.get(0);
            st0Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(st0Var.c, st0Var.d);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            st0 st0Var2 = (st0) obj;
            linkedHashMap.put(st0Var2.c, st0Var2.d);
        }
        return linkedHashMap;
    }

    public static Map R(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return nx.c;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
