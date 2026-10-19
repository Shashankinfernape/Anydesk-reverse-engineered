package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class qh0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(qh0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = yi.a;
        f = unsafe.objectFieldOffset(qh0.class.getDeclaredField("_next$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(qh0.class, Object.class, "_prev$volatile");
        g = unsafe.objectFieldOffset(qh0.class.getDeclaredField("_prev$volatile"));
        e = AtomicReferenceFieldUpdater.newUpdater(qh0.class, Object.class, "_removedRef$volatile");
        h = unsafe.objectFieldOffset(qh0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static qh0 i(qh0 qh0Var) {
        while (qh0Var.n()) {
            d.getClass();
            qh0Var = (qh0) yi.a.getObjectVolatile(qh0Var, g);
        }
        return qh0Var;
    }

    public final boolean e(qh0 qh0Var, int i) {
        qh0 qh0VarM;
        do {
            qh0VarM = m();
            if (qh0VarM instanceof ag0) {
                return (((ag0) qh0VarM).i & i) == 0 && qh0VarM.e(qh0Var, i);
            }
        } while (!qh0VarM.f(qh0Var, this));
        return true;
    }

    public final boolean f(qh0 qh0Var, qh0 qh0Var2) {
        d.getClass();
        Unsafe unsafe = yi.a;
        unsafe.putObjectVolatile(qh0Var, g, this);
        c.getClass();
        long j = f;
        unsafe.putObjectVolatile(qh0Var, j, qh0Var2);
        while (true) {
            Unsafe unsafe2 = yi.a;
            qh0 qh0Var3 = qh0Var;
            qh0 qh0Var4 = qh0Var2;
            if (unsafe2.compareAndSwapObject(this, f, qh0Var4, qh0Var3)) {
                qh0Var3.j(qh0Var4);
                return true;
            }
            if (unsafe2.getObjectVolatile(this, j) != qh0Var4) {
                return false;
            }
            qh0Var2 = qh0Var4;
            qh0Var = qh0Var3;
        }
    }

    public final void g(vp0 vp0Var) {
        vp0 vp0Var2;
        d.getClass();
        Unsafe unsafe = yi.a;
        unsafe.putObjectVolatile(vp0Var, g, this);
        c.getClass();
        long j = f;
        unsafe.putObjectVolatile(vp0Var, j, this);
        while (k() == this) {
            while (true) {
                Unsafe unsafe2 = yi.a;
                vp0Var2 = vp0Var;
                if (unsafe2.compareAndSwapObject(this, f, this, vp0Var2)) {
                    vp0Var2.j(this);
                    return;
                } else if (unsafe2.getObjectVolatile(this, j) != this) {
                    break;
                } else {
                    vp0Var = vp0Var2;
                }
            }
            vp0Var = vp0Var2;
        }
    }

    public final qh0 h() {
        Unsafe unsafe;
        while (true) {
            d.getClass();
            Unsafe unsafe2 = yi.a;
            long j = g;
            qh0 qh0Var = (qh0) unsafe2.getObjectVolatile(this, j);
            qh0 qh0Var2 = null;
            qh0 qh0Var3 = qh0Var;
            while (true) {
                c.getClass();
                if (qh0Var3 == null) {
                    id.c();
                    return null;
                }
                Unsafe unsafe3 = yi.a;
                long j2 = f;
                Object objectVolatile = unsafe3.getObjectVolatile(qh0Var3, j2);
                if (objectVolatile == this) {
                    if (qh0Var != qh0Var3) {
                        do {
                            unsafe = yi.a;
                            if (unsafe.compareAndSwapObject(this, g, qh0Var, qh0Var3)) {
                            }
                        } while (unsafe.getObjectVolatile(this, j) == qh0Var);
                    }
                    return qh0Var3;
                }
                if (n()) {
                    return null;
                }
                if (!(objectVolatile instanceof zx0)) {
                    objectVolatile.getClass();
                    qh0Var2 = qh0Var3;
                    qh0Var3 = (qh0) objectVolatile;
                } else if (qh0Var2 != null) {
                    qh0 qh0Var4 = ((zx0) objectVolatile).a;
                    while (true) {
                        qh0 qh0Var5 = qh0Var3;
                        Unsafe unsafe4 = yi.a;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(qh0Var2, f, qh0Var5, qh0Var4);
                        qh0Var3 = qh0Var5;
                        if (zCompareAndSwapObject) {
                            qh0Var3 = qh0Var2;
                            qh0Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(qh0Var2, j2) != qh0Var3) {
                            break;
                        }
                    }
                } else {
                    if (qh0Var3 == null) {
                        id.c();
                        return null;
                    }
                    qh0Var3 = (qh0) unsafe3.getObjectVolatile(qh0Var3, j);
                }
            }
        }
    }

    public final void j(qh0 qh0Var) {
        qh0 qh0Var2;
        while (true) {
            d.getClass();
            if (qh0Var == null) {
                id.c();
                return;
            }
            Unsafe unsafe = yi.a;
            long j = g;
            qh0 qh0Var3 = (qh0) unsafe.getObjectVolatile(qh0Var, j);
            if (k() != qh0Var) {
                return;
            }
            while (true) {
                if (qh0Var == null) {
                    id.c();
                    return;
                }
                Unsafe unsafe2 = yi.a;
                qh0Var2 = qh0Var;
                if (unsafe2.compareAndSwapObject(qh0Var2, g, qh0Var3, this)) {
                    if (n()) {
                        qh0Var2.h();
                        return;
                    }
                    return;
                } else if (qh0Var2 == null) {
                    id.c();
                    return;
                } else if (unsafe2.getObjectVolatile(qh0Var2, j) != qh0Var3) {
                    break;
                } else {
                    qh0Var = qh0Var2;
                }
            }
            qh0Var = qh0Var2;
        }
    }

    public final Object k() {
        c.getClass();
        return yi.a.getObjectVolatile(this, f);
    }

    public final qh0 l() {
        Object objK = k();
        zx0 zx0Var = objK instanceof zx0 ? (zx0) objK : null;
        if (zx0Var != null) {
            return zx0Var.a;
        }
        objK.getClass();
        return (qh0) objK;
    }

    public final qh0 m() {
        qh0 qh0VarH = h();
        if (qh0VarH != null) {
            return qh0VarH;
        }
        d.getClass();
        return i((qh0) yi.a.getObjectVolatile(this, g));
    }

    public boolean n() {
        return k() instanceof zx0;
    }

    public final qh0 o() {
        Unsafe unsafe;
        long j;
        while (true) {
            Object objK = k();
            if (objK instanceof zx0) {
                return ((zx0) objK).a;
            }
            if (objK == this) {
                return (qh0) objK;
            }
            objK.getClass();
            qh0 qh0Var = (qh0) objK;
            zx0 zx0VarP = qh0Var.p();
            do {
                c.getClass();
                unsafe = yi.a;
                j = f;
                if (unsafe.compareAndSwapObject(this, j, objK, zx0VarP)) {
                    qh0Var.h();
                    return null;
                }
            } while (unsafe.getObjectVolatile(this, j) == objK);
        }
    }

    public final zx0 p() {
        e.getClass();
        Unsafe unsafe = yi.a;
        long j = h;
        zx0 zx0Var = (zx0) unsafe.getObjectVolatile(this, j);
        if (zx0Var != null) {
            return zx0Var;
        }
        zx0 zx0Var2 = new zx0(this);
        unsafe.putObjectVolatile(this, j, zx0Var2);
        return zx0Var2;
    }

    public String toString() {
        return new ph0(this) + '@' + ds.s(this);
    }
}
