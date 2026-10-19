package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class xm0 extends z01 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(xm0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = yi.a.objectFieldOffset(xm0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = r71.d;

    public final Object d(sq sqVar) {
        int iE = e();
        uc1 uc1Var = uc1.a;
        if (iE != 0) {
            if (iE != 1) {
                if (iE == 2) {
                    throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
                }
                nh0.j("unexpected");
                return null;
            }
            xi xiVarT = ds.t(ds.u(sqVar));
            try {
                wm0 wm0Var = new wm0(this, xiVarT);
                while (true) {
                    int andDecrement = z01.f.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                            xm0 xm0Var = wm0Var.d;
                            atomicReferenceFieldUpdater.set(xm0Var, null);
                            xi xiVar = wm0Var.c;
                            xiVar.E(uc1Var, xiVar.e, new wi(0, new z(xm0Var, wm0Var)));
                            break;
                        }
                        if (a(wm0Var)) {
                            break;
                        }
                    }
                }
                Object objS = xiVarT.s();
                lr lrVar = lr.c;
                if (objS != lrVar) {
                    objS = uc1Var;
                }
                if (objS == lrVar) {
                    return objS;
                }
            } catch (Throwable th) {
                xiVarT.B();
                throw th;
            }
        }
        return uc1Var;
    }

    public final int e() {
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z01.f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                if (i3 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    i.getClass();
                    yi.a.putObjectVolatile(this, j, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void f(Object obj) {
        Unsafe unsafe;
        while (Math.max(z01.f.get(this), 0) == 0) {
            i.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = j;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            bx bxVar = r71.d;
            if (objectVolatile != bxVar) {
                if (objectVolatile != obj && obj != null) {
                    nh0.l("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, j, objectVolatile, bxVar)) {
                        b();
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
        nh0.j("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(ds.s(this));
        sb.append("[isLocked=");
        sb.append(Math.max(z01.f.get(this), 0) == 0);
        sb.append(",owner=");
        i.getClass();
        sb.append(yi.a.getObjectVolatile(this, j));
        sb.append(']');
        return sb.toString();
    }
}
