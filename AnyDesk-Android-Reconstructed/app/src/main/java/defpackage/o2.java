package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {
    public static final o2 b;
    public static final o2 c;
    public final Throwable a;

    static {
        if (u2.f) {
            c = null;
            b = null;
        } else {
            c = new o2(null, false);
            b = new o2(null, true);
        }
    }

    public o2(Throwable th, boolean z) {
        this.a = th;
    }
}
