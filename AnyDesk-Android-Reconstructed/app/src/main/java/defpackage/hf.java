package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf {
    public int a;

    public final synchronized void a() {
        int i = -1;
        try {
            i = jf.b.getInt("auth_ad1_signature_index", -1);
        } catch (Throwable unused) {
        }
        if (i < 0 || i >= 10) {
            i = 0;
        }
        this.a = i;
    }

    public final synchronized void b() {
        jf.b.edit().putInt("auth_ad1_signature_index", this.a).commit();
    }

    public final void c(int i) {
        if (i > this.a) {
            synchronized (this) {
                try {
                    if (i > this.a) {
                        this.a = i;
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
