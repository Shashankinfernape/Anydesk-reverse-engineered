package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class ho {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ho.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = yi.a;
        c = unsafe.objectFieldOffset(ho.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(ho.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(ho.class.getDeclaredField("_prev$volatile"));
    }

    public ho(w01 w01Var) {
        this._prev$volatile = w01Var;
    }

    public final void a() {
        b.getClass();
        yi.a.putObjectVolatile(this, d, (Object) null);
    }

    public final ho b() {
        ho hoVarE = e();
        while (hoVarE != null && hoVarE.f()) {
            b.getClass();
            hoVarE = (ho) yi.a.getObjectVolatile(hoVarE, d);
        }
        return hoVarE;
    }

    public final ho c() {
        Object objD = d();
        if (objD == ds.b) {
            return null;
        }
        return (ho) objD;
    }

    public final Object d() {
        a.getClass();
        return yi.a.getObjectVolatile(this, c);
    }

    public final ho e() {
        b.getClass();
        return (ho) yi.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        Unsafe unsafe;
        long j;
        bx bxVar = ds.b;
        do {
            a.getClass();
            unsafe = yi.a;
            j = c;
            if (unsafe.compareAndSwapObject(this, j, (Object) null, bxVar)) {
                return true;
            }
        } while (unsafe.getObjectVolatile(this, j) == null);
        return false;
    }

    public final void h() {
        ho hoVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            ho hoVarB = b();
            ho hoVarC = c();
            hoVarC.getClass();
            do {
                hoVar = hoVarC;
                if (!hoVar.f()) {
                    break;
                } else {
                    hoVarC = hoVar.c();
                }
            } while (hoVarC != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = yi.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(hoVar, j);
                ho hoVar2 = ((ho) objectVolatile) == null ? null : hoVarB;
                while (true) {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(hoVar, d, objectVolatile, hoVar2)) {
                        break;
                    } else if (unsafe.getObjectVolatile(hoVar, j) != objectVolatile) {
                    }
                }
            }
            if (hoVarB != null) {
                a.getClass();
                unsafe.putObjectVolatile(hoVarB, c, hoVar);
            }
            if (!hoVar.f() || hoVar.c() == null) {
                if (hoVarB == null || !hoVarB.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(w01 w01Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = yi.a;
            long j = c;
            w01 w01Var2 = w01Var;
            if (unsafe.compareAndSwapObject(this, j, (Object) null, w01Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(this, j) != null) {
                return false;
            }
            w01Var = w01Var2;
        }
    }
}
