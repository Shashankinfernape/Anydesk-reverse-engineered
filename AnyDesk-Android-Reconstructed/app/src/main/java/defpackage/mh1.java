package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class mh1 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(mh1.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = yi.a.objectFieldOffset(mh1.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(mh1.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(mh1.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(mh1.class, "blockingTasksInBuffer$volatile");

    public final u81 a(u81 u81Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return u81Var;
        }
        if (u81Var.d) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, u81Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        b.getClass();
        Object objectVolatile = yi.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final u81 c() {
        u81 u81Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (u81Var = (u81) this.a.getAndSet(i2, null)) != null) {
                if (u81Var.d) {
                    e.decrementAndGet(this);
                }
                return u81Var;
            }
        }
    }

    public final u81 d() {
        Unsafe unsafe;
        while (true) {
            b.getClass();
            Unsafe unsafe2 = yi.a;
            long j = f;
            u81 u81Var = (u81) unsafe2.getObjectVolatile(this, j);
            if (u81Var == null || !u81Var.d) {
                break;
            }
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, f, u81Var, (Object) null)) {
                    return u81Var;
                }
            } while (unsafe.getObjectVolatile(this, j) == u81Var);
        }
        int i = d.get(this);
        int i2 = c.get(this);
        while (i != i2 && e.get(this) != 0) {
            i2--;
            u81 u81VarE = e(i2, true);
            if (u81VarE != null) {
                return u81VarE;
            }
        }
        return null;
    }

    public final u81 e(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        u81 u81Var = (u81) atomicReferenceArray.get(i2);
        if (u81Var != null && u81Var.d == z) {
            while (!atomicReferenceArray.compareAndSet(i2, u81Var, null)) {
                if (atomicReferenceArray.get(i2) != u81Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return u81Var;
        }
        return null;
    }

    public final long f(int i, mx0 mx0Var) {
        Unsafe unsafe;
        while (true) {
            b.getClass();
            Unsafe unsafe2 = yi.a;
            long j = f;
            u81 u81Var = (u81) unsafe2.getObjectVolatile(this, j);
            if (u81Var == null) {
                return -2L;
            }
            if (((u81Var.d ? 1 : 2) & i) == 0) {
                return -2L;
            }
            y81.f.getClass();
            long jNanoTime = System.nanoTime() - u81Var.c;
            long j2 = y81.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, f, u81Var, (Object) null)) {
                    mx0Var.c = u81Var;
                    return -1L;
                }
            } while (unsafe.getObjectVolatile(this, j) == u81Var);
        }
    }
}
