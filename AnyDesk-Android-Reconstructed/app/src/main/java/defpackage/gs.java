package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class gs extends iy implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final gs m;
    public static final long n;

    static {
        Long l;
        gs gsVar = new gs();
        m = gsVar;
        gsVar.r(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        n = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.iy
    public final Thread A() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.iy
    public final void C(long j, gy gyVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void I() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            E();
            notifyAll();
        }
    }

    @Override // defpackage.iy, defpackage.ft
    public final uu c(long j, ca1 ca1Var, br brVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return xp0.c;
        }
        long jNanoTime = System.nanoTime();
        fy fyVar = new fy(j2 + jNanoTime, ca1Var);
        F(jNanoTime, fyVar);
        return fyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jZ;
        x91.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    I();
                    if (B()) {
                        return;
                    }
                    A();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    if (t()) {
                        jZ = 0;
                    } else {
                        x();
                        Runnable runnableV = v();
                        if (runnableV != null) {
                            runnableV.run();
                            jZ = 0;
                        } else {
                            jZ = z();
                        }
                    }
                    if (jZ == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = n + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            I();
                            if (B()) {
                                return;
                            }
                            A();
                            return;
                        }
                        if (jZ > j2) {
                            jZ = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jZ > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            I();
                            if (B()) {
                                return;
                            }
                            A();
                            return;
                        }
                        LockSupport.parkNanos(this, jZ);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            I();
            if (!B()) {
                A();
            }
            throw th;
        }
    }

    @Override // defpackage.iy, defpackage.dy
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.dr
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.iy
    public final void w(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.w(runnable);
    }
}
