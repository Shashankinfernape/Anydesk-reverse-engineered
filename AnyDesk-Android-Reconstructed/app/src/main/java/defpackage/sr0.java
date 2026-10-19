package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sr0 extends wr0 {
    public static final sr0 g;
    public final xg0 a;
    public final List b;
    public final int c;
    public final int d;
    public final wg0 e;
    public final wg0 f;

    static {
        List listJ = y90.J(mb1.d);
        ug0 ug0Var = ug0.c;
        ug0 ug0Var2 = ug0.b;
        g = new sr0(xg0.c, listJ, 0, 0, new wg0(ug0Var, ug0Var2, ug0Var2), null);
    }

    public sr0(xg0 xg0Var, List list, int i, int i2, wg0 wg0Var, wg0 wg0Var2) {
        this.a = xg0Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = wg0Var;
        this.f = wg0Var2;
        if (xg0Var != xg0.e && i < 0) {
            nh0.e(gr0.e(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
            throw null;
        }
        if (xg0Var != xg0.d && i2 < 0) {
            nh0.e(gr0.e(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
            throw null;
        }
        if (xg0Var == xg0.c && list.isEmpty()) {
            id.q("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:18:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c2 -> B:24:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.wr0
    public final java.lang.Object a(defpackage.s1 r18, defpackage.rq r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr0.a(s1, rq):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr0)) {
            return false;
        }
        sr0 sr0Var = (sr0) obj;
        return this.a == sr0Var.a && y90.e(this.b, sr0Var.b) && this.c == sr0Var.c && this.d == sr0Var.d && y90.e(this.e, sr0Var.e) && y90.e(this.f, sr0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c) * 31) + this.d) * 31)) * 31;
        wg0 wg0Var = this.f;
        return iHashCode + (wg0Var == null ? 0 : wg0Var.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((mb1) it.next()).b.size();
        }
        int i = this.c;
        String strValueOf = i != -1 ? String.valueOf(i) : "none";
        int i2 = this.d;
        String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.a);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        mb1 mb1Var = (mb1) tm.j0(list3);
        Object objP0 = null;
        sb.append((mb1Var == null || (list2 = mb1Var.b) == null) ? null : tm.j0(list2));
        sb.append("\n                    |   last item: ");
        mb1 mb1Var2 = (mb1) tm.p0(list3);
        if (mb1Var2 != null && (list = mb1Var2.b) != null) {
            objP0 = tm.p0(list);
        }
        sb.append(objP0);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.e);
        sb.append("\n                    ");
        String string = sb.toString();
        wg0 wg0Var = this.f;
        if (wg0Var != null) {
            string = string + "|   mediatorLoadStates: " + wg0Var + '\n';
        }
        return j71.M(string.concat("|)"));
    }
}
