package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(1, ea.G);
        map.put(2, ea.Q);
        map.put(3, ea.H);
        map.put(4, ea.K);
        map.put(5, ea.V);
        map.put(6, ea.J);
        map.put(7, ea.X);
        map.put(8, ea.L);
        map.put(9, ea.b0);
        map.put(10, ea.i0);
        map.put(11, ea.c0);
        map.put(12, ea.f0);
        map.put(13, ea.r0);
        map.put(14, ea.e0);
        map.put(15, ea.t0);
        map.put(16, ea.g0);
        map.put(17, ea.U0);
        map.put(18, ea.P0);
        map.put(19, ea.R0);
        map.put(20, ea.Q0);
        map.put(21, ea.T0);
        map.put(22, ea.S0);
        map.put(23, ea.Y0);
        map.put(24, ea.X0);
        map.put(25, ea.N0);
        map.put(26, ea.V0);
        map.put(27, ea.W0);
        map.put(28, ea.f1);
        map.put(29, ea.g1);
        map.put(30, ea.O0);
        map.put(31, ea.Z0);
        map.put(32, ea.a1);
        map.put(33, ea.b1);
        map.put(34, ea.c1);
        map.put(35, ea.d1);
        map.put(36, ea.d);
        map.put(37, ea.w);
        map.put(38, ea.e1);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ba baVar = (ba) it.next();
            if (baVar instanceof fa) {
                arrayList.add((fa) baVar);
            } else {
                arrayList.add(new fa((ea) a.get(Integer.valueOf(baVar.a)), baVar.a()));
            }
        }
        return arrayList;
    }
}
