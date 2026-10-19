package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nn0 extends ve1 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.ve1
    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((bf1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        th1.d(16);
        long j = ((long) iIdentityHashCode) & 4294967295L;
        if (j >= 0) {
            th1.d(16);
            strConcat = Long.toString(j, 16);
            strConcat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            th1.d(16);
            String string = Long.toString(j2, 16);
            string.getClass();
            th1.d(16);
            String string2 = Long.toString(j3, 16);
            string2.getClass();
            strConcat = string.concat(string2);
        }
        sb.append(strConcat);
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
