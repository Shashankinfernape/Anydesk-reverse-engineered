package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class pu extends ru implements mr, rq {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(pu.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long k = yi.a.objectFieldOffset(pu.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final dr f;
    public final sq g;
    public Object h;
    public final Object i;

    public pu(dr drVar, sq sqVar) {
        super(-1);
        this.f = drVar;
        this.g = sqVar;
        this.h = r71.b;
        this.i = uj.H(sqVar.e());
    }

    @Override // defpackage.mr
    public final mr d() {
        return this.g;
    }

    @Override // defpackage.rq
    public final br e() {
        return this.g.e();
    }

    @Override // defpackage.rq
    public final void g(Object obj) throws ou {
        Throwable thA = qy0.a(obj);
        Object onVar = thA == null ? obj : new on(thA, false);
        sq sqVar = this.g;
        br brVarE = sqVar.e();
        dr drVar = this.f;
        if (r71.M(drVar, brVarE)) {
            this.h = onVar;
            this.e = 0;
            r71.L(drVar, sqVar.e(), this);
            return;
        }
        dy dyVarA = x91.a();
        if (dyVarA.e >= 4294967296L) {
            this.h = onVar;
            this.e = 0;
            dyVarA.p(this);
            return;
        }
        dyVarA.r(true);
        try {
            br brVarE2 = sqVar.e();
            Object objJ = uj.J(brVarE2, this.i);
            try {
                sqVar.g(obj);
                uj.B(brVarE2, objJ);
                while (dyVarA.t()) {
                }
            } catch (Throwable th) {
                uj.B(brVarE2, objJ);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                dyVarA.o();
            }
        }
    }

    @Override // defpackage.ru
    public final Object j() {
        Object obj = this.h;
        this.h = r71.b;
        return obj;
    }

    public final void l() {
        do {
            j.getClass();
        } while (yi.a.getObjectVolatile(this, k) == r71.c);
    }

    public final xi m() {
        Unsafe unsafe;
        bx bxVar = r71.c;
        while (true) {
            j.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                unsafe2.putObjectVolatile(this, j2, bxVar);
                return null;
            }
            if (objectVolatile instanceof xi) {
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, k, objectVolatile, bxVar)) {
                        return (xi) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
            } else if (objectVolatile != bxVar && !(objectVolatile instanceof Throwable)) {
                id.s(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
    }

    public final xi n() {
        j.getClass();
        Object objectVolatile = yi.a.getObjectVolatile(this, k);
        if (objectVolatile instanceof xi) {
            return (xi) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        j.getClass();
        return yi.a.getObjectVolatile(this, k) != null;
    }

    public final boolean p(Throwable th) {
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            j.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            bx bxVar = r71.c;
            if (y90.e(objectVolatile, bxVar)) {
                while (true) {
                    Unsafe unsafe3 = yi.a;
                    th2 = th;
                    if (unsafe3.compareAndSwapObject(this, k, bxVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(this, j2) != bxVar) {
                        break;
                    }
                    th = th2;
                }
            } else {
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, k, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
            }
            th = th2;
        }
    }

    public final Throwable q(xi xiVar) {
        Unsafe unsafe;
        xi xiVar2;
        while (true) {
            j.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            bx bxVar = r71.c;
            if (objectVolatile != bxVar) {
                if (!(objectVolatile instanceof Throwable)) {
                    id.s(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, k, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
                id.q("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = yi.a;
                xiVar2 = xiVar;
                if (unsafe3.compareAndSwapObject(this, k, bxVar, xiVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(this, j2) != bxVar) {
                    break;
                }
                xiVar = xiVar2;
            }
            xiVar = xiVar2;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f + ", " + ds.F(this.g) + ']';
    }

    @Override // defpackage.ru
    public final rq c() {
        return this;
    }
}
