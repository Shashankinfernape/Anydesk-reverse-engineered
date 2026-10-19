package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {
    public final Long a;
    public final boolean b;
    public final String c;
    public final Set d;
    public final Long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Throwable i;
    public final Map j;

    public v1(Long l, boolean z, String str, Set set, Long l2, boolean z2, boolean z3, boolean z4, Throwable th, Map map) {
        set.getClass();
        map.getClass();
        this.a = l;
        this.b = z;
        this.c = str;
        this.d = set;
        this.e = l2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = th;
        this.j = map;
    }

    public static v1 a(v1 v1Var, Long l, boolean z, String str, Set set, Long l2, boolean z2, boolean z3, boolean z4, Throwable th, Map map, int i) {
        if ((i & 1) != 0) {
            l = v1Var.a;
        }
        Long l3 = l;
        if ((i & 2) != 0) {
            z = v1Var.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            str = v1Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            set = v1Var.d;
        }
        Set set2 = set;
        Long l4 = (i & 16) != 0 ? v1Var.e : l2;
        boolean z6 = (i & 32) != 0 ? v1Var.f : z2;
        boolean z7 = (i & 64) != 0 ? v1Var.g : z3;
        boolean z8 = (i & 128) != 0 ? v1Var.h : z4;
        Throwable th2 = (i & 256) != 0 ? v1Var.i : th;
        Map map2 = (i & 512) != 0 ? v1Var.j : map;
        v1Var.getClass();
        str2.getClass();
        set2.getClass();
        map2.getClass();
        return new v1(l3, z5, str2, set2, l4, z6, z7, z8, th2, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return y90.e(this.a, v1Var.a) && this.b == v1Var.b && this.c.equals(v1Var.c) && y90.e(this.d, v1Var.d) && y90.e(this.e, v1Var.e) && this.f == v1Var.f && this.g == v1Var.g && this.h == v1Var.h && y90.e(this.i, v1Var.i) && y90.e(this.j, v1Var.j);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((((l == null ? 0 : l.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31)) * 31;
        Long l2 = this.e;
        int iHashCode2 = (((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31;
        Throwable th = this.i;
        return this.j.hashCode() + ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AbookRosterViewState(selectedRosterId=" + this.a + ", rosterChangeInProgress=" + this.b + ", filterText=" + this.c + ", selectedTags=" + this.d + ", selectedItemId=" + this.e + ", refreshInProgress=" + this.f + ", loadFromStartOnRefresh=" + this.g + ", jumpOnRefresh=" + this.h + ", refreshError=" + this.i + ", onlineStates=" + this.j + ")";
    }
}
