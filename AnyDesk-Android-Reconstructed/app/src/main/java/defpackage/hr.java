package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class hr extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(hr.class, "workerCtl$volatile");
    public final mh1 c;
    public final mx0 d;
    public ir e;
    public long f;
    public long g;
    public int h;
    public boolean i;
    private volatile int indexInArray;
    public final /* synthetic */ jr j;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public hr(jr jrVar, int i) {
        this.j = jrVar;
        setDaemon(true);
        setContextClassLoader(jr.class.getClassLoader());
        this.c = new mh1();
        this.d = new mx0();
        this.e = ir.f;
        this.nextParkedWorker = jr.m;
        int iNanoTime = (int) System.nanoTime();
        this.h = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final u81 a(boolean z) {
        u81 u81VarE;
        u81 u81VarE2;
        long j;
        ir irVar = this.e;
        jr jrVar = this.j;
        mh1 mh1Var = this.c;
        ir irVar2 = ir.c;
        if (irVar != irVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = jr.k;
            do {
                j = atomicLongFieldUpdater.get(jrVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    u81 u81VarD = mh1Var.d();
                    if (u81VarD != null) {
                        return u81VarD;
                    }
                    u81 u81Var = (u81) jrVar.h.d();
                    return u81Var == null ? i(1) : u81Var;
                }
            } while (!jr.k.compareAndSet(jrVar, j, j - 4398046511104L));
            this.e = irVar2;
        }
        if (z) {
            boolean z2 = d(jrVar.c * 2) == 0;
            if (z2 && (u81VarE2 = e()) != null) {
                return u81VarE2;
            }
            mh1Var.getClass();
            mh1.b.getClass();
            u81 u81VarC = (u81) yi.a(yi.a, mh1Var, mh1.f, null);
            if (u81VarC == null) {
                u81VarC = mh1Var.c();
            }
            if (u81VarC != null) {
                return u81VarC;
            }
            if (!z2 && (u81VarE = e()) != null) {
                return u81VarE;
            }
        } else {
            u81 u81VarE3 = e();
            if (u81VarE3 != null) {
                return u81VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final u81 e() {
        int iD = d(2);
        jr jrVar = this.j;
        b70 b70Var = jrVar.h;
        b70 b70Var2 = jrVar.g;
        if (iD == 0) {
            u81 u81Var = (u81) b70Var2.d();
            return u81Var != null ? u81Var : (u81) b70Var.d();
        }
        u81 u81Var2 = (u81) b70Var.d();
        return u81Var2 != null ? u81Var2 : (u81) b70Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j.f);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ir irVar) {
        ir irVar2 = this.e;
        boolean z = irVar2 == ir.c;
        if (z) {
            jr.k.addAndGet(this.j, 4398046511104L);
        }
        if (irVar2 != irVar) {
            this.e = irVar;
        }
        return z;
    }

    public final u81 i(int i) {
        u81 u81VarE;
        long jF;
        AtomicLongFieldUpdater atomicLongFieldUpdater = jr.k;
        jr jrVar = this.j;
        int i2 = (int) (atomicLongFieldUpdater.get(jrVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            hr hrVar = (hr) jrVar.i.b(iD);
            if (hrVar != null && hrVar != this) {
                mh1 mh1Var = hrVar.c;
                if (i != 3) {
                    mh1Var.getClass();
                    int i4 = mh1.d.get(mh1Var);
                    int i5 = mh1.c.get(mh1Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5 || (z && mh1.e.get(mh1Var) == 0)) {
                            u81VarE = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        u81VarE = mh1Var.e(i4, z);
                        if (u81VarE != null) {
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    u81VarE = mh1Var.c();
                }
                mx0 mx0Var = this.d;
                if (u81VarE != null) {
                    mx0Var.c = u81VarE;
                    jF = -1;
                } else {
                    jF = mh1Var.f(i, mx0Var);
                }
                if (jF == -1) {
                    u81 u81Var = (u81) mx0Var.c;
                    mx0Var.c = null;
                    return u81Var;
                }
                if (jF > 0) {
                    jMin = Math.min(jMin, jF);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.g = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (jr.l.get(this.j) != 1) {
                    ir irVar = this.e;
                    ir irVar2 = ir.g;
                    if (irVar == irVar2) {
                        break loop0;
                    }
                    u81 u81VarA = a(this.i);
                    if (u81VarA != null) {
                        this.g = 0L;
                        jr jrVar = this.j;
                        this.f = 0L;
                        if (this.e == ir.e) {
                            this.e = ir.d;
                        }
                        if (!u81VarA.d) {
                            try {
                                u81VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(ir.d) && !jrVar.f() && !jrVar.e(jr.k.get(jrVar))) {
                            jrVar.f();
                        }
                        try {
                            u81VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        jr.k.addAndGet(jrVar, -2097152L);
                        if (this.e == irVar2) {
                            break;
                        }
                        this.e = ir.f;
                        break;
                    }
                    this.i = false;
                    if (this.g == 0) {
                        Object obj = this.nextParkedWorker;
                        bx bxVar = jr.m;
                        if (obj != bxVar) {
                            k.set(this, -1);
                            while (this.nextParkedWorker != jr.m) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                jr jrVar2 = this.j;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = jr.l;
                                if (atomicIntegerFieldUpdater2.get(jrVar2) == 1) {
                                    break;
                                }
                                ir irVar3 = this.e;
                                ir irVar4 = ir.g;
                                if (irVar3 == irVar4) {
                                    break;
                                }
                                h(ir.e);
                                Thread.interrupted();
                                if (this.f == 0) {
                                    j = 2097151;
                                    this.f = System.nanoTime() + this.j.e;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.j.e);
                                if (System.nanoTime() - this.f >= 0) {
                                    this.f = 0L;
                                    jr jrVar3 = this.j;
                                    synchronized (jrVar3.i) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(jrVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = jr.k;
                                                if (((int) (atomicLongFieldUpdater.get(jrVar3) & j)) > jrVar3.c) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        jrVar3.d(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(jrVar3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = jrVar3.i.b(andDecrement);
                                                            objB.getClass();
                                                            hr hrVar = (hr) objB;
                                                            jrVar3.i.c(i, hrVar);
                                                            hrVar.f(i);
                                                            jrVar3.d(hrVar, andDecrement, i);
                                                        }
                                                        jrVar3.i.c(andDecrement, null);
                                                        this.e = irVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            jr jrVar4 = this.j;
                            if (this.nextParkedWorker == bxVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = jr.j;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(jrVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = jrVar4.i.b((int) (j2 & 2097151));
                                    jr jrVar5 = jrVar4;
                                    if (jr.j.compareAndSet(jrVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        jrVar4 = jrVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(ir.e);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.g);
                            this.g = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(ir.g);
    }
}
