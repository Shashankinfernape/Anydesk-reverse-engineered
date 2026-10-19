package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class js extends jy implements Executor {
    public static final js e = new js();
    public static final dr f;

    static {
        vc1 vc1Var = vc1.e;
        int i = k81.a;
        if (64 >= i) {
            i = 64;
        }
        f = vc1Var.k(hq.P(i, "kotlinx.coroutines.io.parallelism", 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.dr
    public final void e(br brVar, Runnable runnable) {
        f.e(brVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(kx.c, runnable);
    }

    @Override // defpackage.dr
    public final void f(br brVar, Runnable runnable) {
        f.f(brVar, runnable);
    }

    @Override // defpackage.dr
    public final String toString() {
        return "Dispatchers.IO";
    }
}
