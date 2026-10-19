package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class md extends ds {
    public static volatile md A;
    public final et z = new et();

    public static md K() {
        if (A != null) {
            return A;
        }
        synchronized (md.class) {
            try {
                if (A == null) {
                    A = new md();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return A;
    }

    public final boolean L() {
        this.z.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void M(Runnable runnable) {
        et etVar = this.z;
        if (etVar.A == null) {
            synchronized (etVar.z) {
                try {
                    if (etVar.A == null) {
                        etVar.A = et.K(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        etVar.A.post(runnable);
    }
}
