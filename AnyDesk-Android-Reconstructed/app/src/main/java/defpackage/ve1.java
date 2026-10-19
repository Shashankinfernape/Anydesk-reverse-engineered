package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ve1 {
    public final we1 a = new we1();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        we1 we1Var = this.a;
        if (we1Var != null) {
            if (we1Var.d) {
                we1.a(autoCloseable);
                return;
            }
            synchronized (we1Var.a) {
                autoCloseable2 = (AutoCloseable) we1Var.b.put(str, autoCloseable);
            }
            we1.a(autoCloseable2);
        }
    }

    public final void b() {
        we1 we1Var = this.a;
        if (we1Var != null && !we1Var.d) {
            we1Var.d = true;
            synchronized (we1Var.a) {
                try {
                    Iterator it = we1Var.b.values().iterator();
                    while (it.hasNext()) {
                        we1.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = we1Var.c.iterator();
                    while (it2.hasNext()) {
                        we1.a((AutoCloseable) it2.next());
                    }
                    we1Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        we1 we1Var = this.a;
        if (we1Var == null) {
            return null;
        }
        synchronized (we1Var.a) {
            autoCloseable = (AutoCloseable) we1Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
