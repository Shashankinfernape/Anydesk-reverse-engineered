package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cd1 {
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public static boolean a(cd1 cd1Var) {
        if (cd1Var.e.isEmpty()) {
            ArrayList arrayList = cd1Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((bd1) obj).d.isEmpty()) {
                }
            }
            return false;
        }
        return true;
    }

    public static void b(cd1 cd1Var, ea eaVar, Object[] objArr) {
        cd1Var.e.add(new fa(eaVar, objArr));
    }
}
