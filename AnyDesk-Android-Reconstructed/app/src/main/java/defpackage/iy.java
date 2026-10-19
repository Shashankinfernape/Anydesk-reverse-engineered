package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class iy extends dy implements ft {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(iy.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicIntegerFieldUpdater j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = yi.a;
        l = unsafe.objectFieldOffset(iy.class.getDeclaredField("_queue$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(iy.class, Object.class, "_delayed$volatile");
        k = unsafe.objectFieldOffset(iy.class.getDeclaredField("_delayed$volatile"));
        j = AtomicIntegerFieldUpdater.newUpdater(iy.class, "_isCompleted$volatile");
    }

    public abstract Thread A();

    public final boolean B() {
        qd qdVar = this.g;
        if (qdVar != null ? qdVar.isEmpty() : true) {
            i.getClass();
            Unsafe unsafe = yi.a;
            hy hyVar = (hy) unsafe.getObjectVolatile(this, k);
            if (hyVar != null && y91.b.get(hyVar) != 0) {
                return false;
            }
            h.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, l);
            if (objectVolatile != null) {
                if (objectVolatile instanceof th0) {
                    long j2 = th0.f.get((th0) objectVolatile);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == th1.f) {
                }
            }
            return true;
        }
        return false;
    }

    public void C(long j2, gy gyVar) {
        gs.m.F(j2, gyVar);
    }

    public final void D() {
        gy gyVarC;
        long jNanoTime = System.nanoTime();
        while (true) {
            i.getClass();
            hy hyVar = (hy) yi.a.getObjectVolatile(this, k);
            if (hyVar == null) {
                return;
            }
            synchronized (hyVar) {
                gyVarC = y91.b.get(hyVar) > 0 ? hyVar.c(0) : null;
            }
            if (gyVarC == null) {
                return;
            } else {
                C(jNanoTime, gyVarC);
            }
        }
    }

    public final void E() {
        h.getClass();
        Unsafe unsafe = yi.a;
        unsafe.putObjectVolatile(this, l, (Object) null);
        i.getClass();
        unsafe.putObjectVolatile(this, k, (Object) null);
    }

    public final void F(long j2, gy gyVar) {
        Thread threadA;
        int iG = G(j2, gyVar);
        if (iG == 0) {
            if (!H(gyVar) || Thread.currentThread() == (threadA = A())) {
                return;
            }
            LockSupport.unpark(threadA);
            return;
        }
        if (iG == 1) {
            C(j2, gyVar);
        } else {
            if (iG == 2) {
                return;
            }
            nh0.j("unexpected result");
        }
    }

    public final int G(long j2, gy gyVar) {
        Unsafe unsafe;
        if (j.get(this) == 1) {
            return 1;
        }
        i.getClass();
        Unsafe unsafe2 = yi.a;
        long j3 = k;
        hy hyVar = (hy) unsafe2.getObjectVolatile(this, j3);
        if (hyVar == null) {
            hy hyVar2 = new hy();
            hyVar2.c = j2;
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, k, (Object) null, hyVar2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
            Object objectVolatile = unsafe.getObjectVolatile(this, j3);
            objectVolatile.getClass();
            hyVar = (hy) objectVolatile;
        }
        return gyVar.d(j2, hyVar, this);
    }

    public final boolean H(gy gyVar) {
        i.getClass();
        hy hyVar = (hy) yi.a.getObjectVolatile(this, k);
        gy gyVar2 = null;
        if (hyVar != null) {
            synchronized (hyVar) {
                gy[] gyVarArr = hyVar.a;
                gyVar2 = gyVarArr != null ? gyVarArr[0] : null;
            }
        }
        return gyVar2 == gyVar;
    }

    public uu c(long j2, ca1 ca1Var, br brVar) {
        return hs.a.c(j2, ca1Var, brVar);
    }

    @Override // defpackage.ft
    public final void d(long j2, xi xiVar) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2;
        }
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ey eyVar = new ey(this, j3 + jNanoTime, xiVar);
            F(jNanoTime, eyVar);
            xiVar.y(new si(1, eyVar));
        }
    }

    @Override // defpackage.dr
    public final void e(br brVar, Runnable runnable) {
        w(runnable);
    }

    @Override // defpackage.dy
    public void shutdown() {
        long jZ;
        x91.a.set(null);
        j.set(this, 1);
        u();
        do {
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
        } while (jZ <= 0);
        D();
    }

    public final void u() {
        Unsafe unsafe;
        Unsafe unsafe2;
        bx bxVar = th1.f;
        while (true) {
            h.getClass();
            Unsafe unsafe3 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, l, (Object) null, bxVar)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == null);
            } else {
                if (objectVolatile instanceof th0) {
                    ((th0) objectVolatile).c();
                    return;
                }
                if (objectVolatile == bxVar) {
                    return;
                }
                th0 th0Var = new th0(8, true);
                th0Var.a((Runnable) objectVolatile);
                do {
                    unsafe2 = yi.a;
                    if (unsafe2.compareAndSwapObject(this, l, objectVolatile, th0Var)) {
                        return;
                    }
                } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    public final Runnable v() {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            h.getClass();
            Unsafe unsafe3 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof th0) {
                th0 th0Var = (th0) objectVolatile;
                Object objE = th0Var.e();
                if (objE != th0.g) {
                    return (Runnable) objE;
                }
                th0 th0VarD = th0Var.d();
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, l, objectVolatile, th0VarD)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
            } else {
                if (objectVolatile == th1.f) {
                    return null;
                }
                do {
                    unsafe2 = yi.a;
                    if (unsafe2.compareAndSwapObject(this, l, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    public void w(Runnable runnable) {
        x();
        if (!y(runnable)) {
            gs.m.w(runnable);
            return;
        }
        Thread threadA = A();
        if (Thread.currentThread() != threadA) {
            LockSupport.unpark(threadA);
        }
    }

    public final void x() {
        gy gyVarC;
        i.getClass();
        hy hyVar = (hy) yi.a.getObjectVolatile(this, k);
        if (hyVar == null || y91.b.get(hyVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (hyVar) {
                try {
                    gy[] gyVarArr = hyVar.a;
                    gyVarC = null;
                    gy gyVar = gyVarArr != null ? gyVarArr[0] : null;
                    if (gyVar != null) {
                        gyVarC = ((jNanoTime - gyVar.c) > 0L ? 1 : ((jNanoTime - gyVar.c) == 0L ? 0 : -1)) >= 0 ? y(gyVar) : false ? hyVar.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (gyVarC != null);
    }

    public final boolean y(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            h.getClass();
            Unsafe unsafe4 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j2);
            if (j.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, l, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == null);
            } else if (objectVolatile instanceof th0) {
                th0 th0Var = (th0) objectVolatile;
                int iA = th0Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    th0 th0VarD = th0Var.d();
                    do {
                        unsafe2 = yi.a;
                        if (unsafe2.compareAndSwapObject(this, l, objectVolatile, th0VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == th1.f) {
                    return false;
                }
                th0 th0Var2 = new th0(8, true);
                th0Var2.a((Runnable) objectVolatile);
                th0Var2.a(runnable);
                do {
                    unsafe3 = yi.a;
                    if (unsafe3.compareAndSwapObject(this, l, objectVolatile, th0Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    public final long z() {
        gy gyVar;
        qd qdVar = this.g;
        if (((qdVar == null || qdVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            h.getClass();
            Unsafe unsafe = yi.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, l);
            if (objectVolatile != null) {
                if (objectVolatile instanceof th0) {
                    long j2 = th0.f.get((th0) objectVolatile);
                    if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == th1.f) {
                    return Long.MAX_VALUE;
                }
            }
            i.getClass();
            hy hyVar = (hy) unsafe.getObjectVolatile(this, k);
            if (hyVar != null) {
                synchronized (hyVar) {
                    gy[] gyVarArr = hyVar.a;
                    gyVar = gyVarArr != null ? gyVarArr[0] : null;
                }
                if (gyVar != null) {
                    long jNanoTime = gyVar.c - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }
}
