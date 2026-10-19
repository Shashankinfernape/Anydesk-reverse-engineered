package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class rh0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(rh0.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = yi.a.objectFieldOffset(rh0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new th0(8, false);

    public final boolean a(Runnable runnable) {
        Unsafe unsafe;
        while (true) {
            a.getClass();
            Unsafe unsafe2 = yi.a;
            long j = b;
            th0 th0Var = (th0) unsafe2.getObjectVolatile(this, j);
            int iA = th0Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                th0 th0VarD = th0Var.d();
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, b, th0Var, th0VarD)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j) == th0Var);
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        Unsafe unsafe;
        while (true) {
            a.getClass();
            Unsafe unsafe2 = yi.a;
            long j = b;
            th0 th0Var = (th0) unsafe2.getObjectVolatile(this, j);
            if (th0Var.c()) {
                return;
            }
            th0 th0VarD = th0Var.d();
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, b, th0Var, th0VarD)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j) == th0Var);
        }
    }

    public final int c() {
        a.getClass();
        th0 th0Var = (th0) yi.a.getObjectVolatile(this, b);
        th0Var.getClass();
        long j = th0.f.get(th0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        Unsafe unsafe;
        while (true) {
            a.getClass();
            Unsafe unsafe2 = yi.a;
            long j = b;
            th0 th0Var = (th0) unsafe2.getObjectVolatile(this, j);
            Object objE = th0Var.e();
            if (objE != th0.g) {
                return objE;
            }
            th0 th0VarD = th0Var.d();
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, b, th0Var, th0VarD)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j) == th0Var);
        }
    }
}
