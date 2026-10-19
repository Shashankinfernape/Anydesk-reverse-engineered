package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w81 {
    public static final w81 b;
    public ThreadPoolExecutor a;

    static {
        w81 w81Var = new w81();
        w81Var.a = new ThreadPoolExecutor(2, 4, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(20));
        b = w81Var;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
