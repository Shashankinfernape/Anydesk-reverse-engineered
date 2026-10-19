package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h11 extends i11 {
    public static f11 b0(Iterator it) {
        it.getClass();
        return new mp(new an(1, it));
    }

    public static f11 c0(Object obj, z50 z50Var) {
        return obj == null ? ox.a : new b10(new y(9, obj), z50Var, 1);
    }

    public static List d0(f11 f11Var) {
        Iterator it = f11Var.iterator();
        if (!it.hasNext()) {
            return mx.c;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return y90.J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
