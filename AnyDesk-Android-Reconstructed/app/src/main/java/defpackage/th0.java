package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class th0 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(th0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = yi.a.objectFieldOffset(th0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(th0.class, "_state$volatile");
    public static final bx g = new bx("REMOVE_FROZEN", 2);

    public th0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            nh0.j("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        nh0.j("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    th0 th0VarD = this;
                    while ((atomicLongFieldUpdater.get(th0VarD) & 1152921504606846976L) != 0) {
                        th0VarD = th0VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = th0VarD.d;
                        int i4 = th0VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof sh0) && ((sh0) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            th0VarD = null;
                        }
                        if (th0VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final th0 b(long j) {
        Unsafe unsafe;
        while (true) {
            e.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = h;
            th0 th0Var = (th0) unsafe2.getObjectVolatile(this, j2);
            if (th0Var != null) {
                return th0Var;
            }
            th0 th0Var2 = new th0(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object sh0Var = this.d.get(i4);
                if (sh0Var == null) {
                    sh0Var = new sh0(i);
                }
                th0Var2.d.set(th0Var2.c & i, sh0Var);
                i++;
            }
            f.set(th0Var2, (-1152921504606846977L) & j);
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, h, (Object) null, th0Var2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j2) == null);
        }
    }

    public final boolean c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final th0 d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j2;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) == 0) {
                j2 = 1152921504606846976L | j;
            }
            return b(j);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        j = j2;
        return b(j);
    }

    public final Object e() {
        th0 th0VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(th0VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = th0VarD.c;
            int i4 = i & i3;
            if ((i2 & i3) != i4) {
                AtomicReferenceArray atomicReferenceArray = th0VarD.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = th0VarD.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof sh0)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(th0VarD, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    th0VarD = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(th0VarD);
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                th0VarD = th0VarD.d();
                            } else {
                                th0 th0Var = th0VarD;
                                if (f.compareAndSet(th0Var, j3, (j3 & (-1073741824)) | j2)) {
                                    th0Var.d.set(i5 & th0Var.c, null);
                                    th0VarD = null;
                                } else {
                                    th0VarD = th0Var;
                                }
                            }
                            if (th0VarD == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
