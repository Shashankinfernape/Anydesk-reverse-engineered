package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt0 {
    public final Object a;
    public final Object b;

    public rt0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rt0.class != obj.getClass()) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        Object obj2 = rt0Var.a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = rt0Var.b;
        Object obj5 = this.b;
        if (obj5 == null) {
            if (obj4 != null) {
                return false;
            }
        } else if (!obj5.equals(obj4)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 31) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
