package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mn {
    public final Object a;
    public final si b;
    public final e60 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ mn(Object obj, si siVar, e60 e60Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : siVar, (i & 4) != 0 ? null : e60Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static mn a(mn mnVar, si siVar, Throwable th, int i) {
        Object obj = mnVar.a;
        if ((i & 2) != 0) {
            siVar = mnVar.b;
        }
        si siVar2 = siVar;
        e60 e60Var = mnVar.c;
        Object obj2 = mnVar.d;
        if ((i & 16) != 0) {
            th = mnVar.e;
        }
        return new mn(obj, siVar2, e60Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return y90.e(this.a, mnVar.a) && y90.e(this.b, mnVar.b) && y90.e(this.c, mnVar.c) && y90.e(this.d, mnVar.d) && y90.e(this.e, mnVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        si siVar = this.b;
        int iHashCode2 = (iHashCode + (siVar == null ? 0 : siVar.hashCode())) * 31;
        e60 e60Var = this.c;
        int iHashCode3 = (iHashCode2 + (e60Var == null ? 0 : e60Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public mn(Object obj, si siVar, e60 e60Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = siVar;
        this.c = e60Var;
        this.d = obj2;
        this.e = th;
    }
}
