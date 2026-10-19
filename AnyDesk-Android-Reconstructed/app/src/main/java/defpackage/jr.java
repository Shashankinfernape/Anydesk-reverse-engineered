package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class jr implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(jr.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(jr.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(jr.class, "_isTerminated$volatile");
    public static final bx m = new bx("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int c;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final long e;
    public final String f;
    public final b70 g;
    public final b70 h;
    public final fy0 i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public jr(int i, int i2, long j2, String str) {
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = str;
        if (i < 1) {
            nh0.e(q51.k(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            nh0.e(q51.k(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.g = new b70();
        this.h = new b70();
        this.i = new fy0((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void c(jr jrVar, Runnable runnable, int i) {
        jrVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.i) {
            try {
                if (l.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = k;
                long j2 = atomicLongFieldUpdater.get(this);
                int i = (int) (j2 & 2097151);
                int i2 = i - ((int) ((j2 & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.c) {
                    return 0;
                }
                if (i >= this.d) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.i.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                hr hrVar = new hr(this, i3);
                this.i.c(i3, hrVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                hrVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        u81 v81Var;
        ir irVar;
        y81.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof u81) {
            v81Var = (u81) runnable;
            v81Var.c = jNanoTime;
            v81Var.d = z;
        } else {
            v81Var = new v81(runnable, jNanoTime, z);
        }
        boolean z3 = v81Var.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        hr hrVar = threadCurrentThread instanceof hr ? (hr) threadCurrentThread : null;
        if (hrVar == null || hrVar.j != this) {
            hrVar = null;
        }
        if (hrVar != null && (irVar = hrVar.e) != ir.g && (v81Var.d || irVar != ir.d)) {
            hrVar.i = true;
            mh1 mh1Var = hrVar.c;
            if (z2) {
                v81Var = mh1Var.a(v81Var);
            } else {
                mh1Var.getClass();
                mh1.b.getClass();
                u81 u81Var = (u81) yi.a(yi.a, mh1Var, mh1.f, v81Var);
                v81Var = u81Var == null ? null : mh1Var.a(u81Var);
            }
        }
        if (v81Var != null) {
            if (!(v81Var.d ? this.h.a(v81Var) : this.g.a(v81Var))) {
                throw new RejectedExecutionException(q51.m(new StringBuilder(), this.f, " was terminated"));
            }
        }
        if (z3) {
            if (f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        u81 u81VarA;
        if (l.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            hr hrVar = threadCurrentThread instanceof hr ? (hr) threadCurrentThread : null;
            if (hrVar == null || hrVar.j != this) {
                hrVar = null;
            }
            synchronized (this.i) {
                i = (int) (k.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.i.b(i2);
                    objB.getClass();
                    hr hrVar2 = (hr) objB;
                    if (hrVar2 != hrVar) {
                        while (hrVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(hrVar2);
                            hrVar2.join(10000L);
                        }
                        mh1 mh1Var = hrVar2.c;
                        b70 b70Var = this.h;
                        mh1Var.getClass();
                        mh1.b.getClass();
                        u81 u81Var = (u81) yi.a(yi.a, mh1Var, mh1.f, null);
                        if (u81Var != null) {
                            b70Var.a(u81Var);
                        }
                        while (true) {
                            u81 u81VarC = mh1Var.c();
                            if (u81VarC == null) {
                                break;
                            } else {
                                b70Var.a(u81VarC);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.h.b();
            this.g.b();
            while (true) {
                if (hrVar != null) {
                    u81VarA = hrVar.a(true);
                    if (u81VarA == null) {
                        u81VarA = (u81) this.g.d();
                        if (u81VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    u81VarA = (u81) this.g.d();
                    if (u81VarA == null && (u81VarA = (u81) this.h.d()) == null) {
                        break;
                    }
                }
                try {
                    u81VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (hrVar != null) {
                hrVar.h(ir.g);
            }
            j.set(this, 0L);
            k.set(this, 0L);
        }
    }

    public final void d(hr hrVar, int i, int i2) {
        while (true) {
            long j2 = j.get(this);
            int iB = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iB == i) {
                if (i2 == 0) {
                    Object objC = hrVar.c();
                    while (true) {
                        if (objC == m) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        hr hrVar2 = (hr) objC;
                        iB = hrVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = hrVar2.c();
                        }
                    }
                } else {
                    iB = i2;
                }
            }
            if (iB >= 0) {
                if (j.compareAndSet(this, j2, j3 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.c;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        bx bxVar;
        int iB;
        while (true) {
            long j2 = j.get(this);
            hr hrVar = (hr) this.i.b((int) (2097151 & j2));
            if (hrVar == null) {
                hrVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = hrVar.c();
                while (true) {
                    bxVar = m;
                    if (objC == bxVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    hr hrVar2 = (hr) objC;
                    iB = hrVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = hrVar2.c();
                }
                if (iB >= 0) {
                    if (j.compareAndSet(this, j2, ((long) iB) | j3)) {
                        hrVar.g(bxVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (hrVar == null) {
                return false;
            }
            if (hr.k.compareAndSet(hrVar, -1, 0)) {
                LockSupport.unpark(hrVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fy0 fy0Var = this.i;
        int iA = fy0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            hr hrVar = (hr) fy0Var.b(i6);
            if (hrVar != null) {
                int iB = hrVar.c.b();
                int iOrdinal = hrVar.e.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new pn();
                    }
                    i5++;
                }
            }
        }
        long j2 = k.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f);
        sb4.append('@');
        sb4.append(ds.s(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.c;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.d);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.g.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.h.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
