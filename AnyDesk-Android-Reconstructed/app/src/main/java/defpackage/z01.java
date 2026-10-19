package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class z01 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(z01.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final wi a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = yi.a;
        g = unsafe.objectFieldOffset(z01.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(z01.class, "deqIdx$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(z01.class, Object.class, "tail$volatile");
        h = unsafe.objectFieldOffset(z01.class.getDeclaredField("tail$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(z01.class, "enqIdx$volatile");
        f = AtomicIntegerFieldUpdater.newUpdater(z01.class, "_availablePermits$volatile");
    }

    public z01() {
        b11 b11Var = new b11(0L, null, 2);
        this.head$volatile = b11Var;
        this.tail$volatile = b11Var;
        this._availablePermits$volatile = 1;
        this.a = new wi(2, this);
    }

    public final boolean a(wm0 wm0Var) throws ou {
        Object objN;
        Unsafe unsafe;
        z01 z01Var = this;
        d.getClass();
        Unsafe unsafe2 = yi.a;
        long j = h;
        b11 b11Var = (b11) unsafe2.getObjectVolatile(z01Var, j);
        long andIncrement = e.getAndIncrement(z01Var);
        x01 x01Var = x01.k;
        long j2 = andIncrement / ((long) a11.f);
        loop0: while (true) {
            objN = ds.n(b11Var, j2, x01Var);
            if (uj.t(objN)) {
                break;
            }
            w01 w01VarR = uj.r(objN);
            while (true) {
                w01 w01Var = (w01) yi.a.getObjectVolatile(z01Var, j);
                if (w01Var.e >= w01VarR.e) {
                    break loop0;
                }
                if (!w01VarR.n()) {
                    break;
                }
                do {
                    unsafe = yi.a;
                    z01Var = this;
                    if (unsafe.compareAndSwapObject(z01Var, h, w01Var, w01VarR)) {
                        if (!w01Var.j()) {
                            break loop0;
                        }
                        w01Var.h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(z01Var, j) == w01Var);
                if (w01VarR.j()) {
                    w01VarR.h();
                }
            }
            z01Var = this;
        }
        b11 b11Var2 = (b11) uj.r(objN);
        AtomicReferenceArray atomicReferenceArray = b11Var2.g;
        int i = (int) (andIncrement % ((long) a11.f));
        while (!atomicReferenceArray.compareAndSet(i, null, wm0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                bx bxVar = a11.b;
                bx bxVar2 = a11.c;
                while (!atomicReferenceArray.compareAndSet(i, bxVar, bxVar2)) {
                    if (atomicReferenceArray.get(i) != bxVar) {
                        return false;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xm0.i;
                xm0 xm0Var = wm0Var.d;
                atomicReferenceFieldUpdater.set(xm0Var, null);
                xi xiVar = wm0Var.c;
                z zVar = new z(xm0Var, wm0Var);
                xiVar.E(uc1.a, xiVar.e, new wi(0, zVar));
                return true;
            }
        }
        wm0Var.a(b11Var2, i);
        return true;
    }

    public final void b() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!c());
    }

    public final boolean c() {
        Object objN;
        Unsafe unsafe;
        z01 z01Var = this;
        b.getClass();
        Unsafe unsafe2 = yi.a;
        long j = g;
        b11 b11Var = (b11) unsafe2.getObjectVolatile(z01Var, j);
        long andIncrement = c.getAndIncrement(z01Var);
        long j2 = andIncrement / ((long) a11.f);
        y01 y01Var = y01.k;
        loop0: while (true) {
            objN = ds.n(b11Var, j2, y01Var);
            if (uj.t(objN)) {
                break;
            }
            w01 w01VarR = uj.r(objN);
            while (true) {
                w01 w01Var = (w01) yi.a.getObjectVolatile(z01Var, j);
                if (w01Var.e >= w01VarR.e) {
                    z01Var = this;
                    break loop0;
                }
                if (!w01VarR.n()) {
                    break;
                }
                do {
                    unsafe = yi.a;
                    z01Var = this;
                    if (unsafe.compareAndSwapObject(z01Var, g, w01Var, w01VarR)) {
                        if (!w01Var.j()) {
                            break loop0;
                        }
                        w01Var.h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(z01Var, j) == w01Var);
                if (w01VarR.j()) {
                    w01VarR.h();
                }
            }
            z01Var = this;
        }
        b11 b11Var2 = (b11) uj.r(objN);
        AtomicReferenceArray atomicReferenceArray = b11Var2.g;
        b11Var2.a();
        long j3 = b11Var2.e;
        boolean z = false;
        if (j3 <= j2) {
            int i = (int) (andIncrement % ((long) a11.f));
            Object andSet = atomicReferenceArray.getAndSet(i, a11.b);
            if (andSet == null) {
                int i2 = a11.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == a11.c) {
                        return true;
                    }
                }
                bx bxVar = a11.b;
                bx bxVar2 = a11.d;
                while (!atomicReferenceArray.compareAndSet(i, bxVar, bxVar2)) {
                    if (atomicReferenceArray.get(i) != bxVar) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != a11.e) {
                if (!(andSet instanceof vi)) {
                    id.s(andSet, "unexpected: ");
                    return false;
                }
                vi viVar = (vi) andSet;
                bx bxVarK = viVar.k(uc1.a, z01Var.a);
                if (bxVarK != null) {
                    viVar.t(bxVarK);
                    return true;
                }
            }
        }
        return false;
    }
}
