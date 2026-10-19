package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf {
    public final int a;
    public final String b;

    public qf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        if (this.a != qfVar.a) {
            return false;
        }
        String str = qfVar.b;
        String str2 = this.b;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int i = (((652557461 ^ this.a) * 1000003) ^ 950289813) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyedAppState{key=ad.client_id, severity=");
        sb.append(this.a);
        sb.append(", message=AnyDesk Client ID, data=");
        return q51.m(sb, this.b, "}");
    }
}
