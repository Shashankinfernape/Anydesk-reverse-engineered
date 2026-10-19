package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class za implements Executor {
    public final Object c = new Object();
    public final ArrayDeque d = new ArrayDeque();
    public final ab e;
    public Runnable f;

    public za(ab abVar) {
        this.e = abVar;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                Runnable runnable = (Runnable) this.d.poll();
                this.f = runnable;
                if (runnable != null) {
                    this.e.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            try {
                this.d.add(new c0(this, 4, runnable));
                if (this.f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
