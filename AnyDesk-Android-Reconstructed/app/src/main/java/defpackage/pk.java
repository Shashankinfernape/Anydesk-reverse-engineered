package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk extends qk {
    public final Throwable a;

    public pk(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pk) {
            return y90.e(this.a, ((pk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.qk
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
