package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class sh implements fk {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(sh.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(sh.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(sh.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(sh.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(sh.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final int c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = yi.a;
        q = unsafe.objectFieldOffset(sh.class.getDeclaredField("sendSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(sh.class, Object.class, "receiveSegment$volatile");
        p = unsafe.objectFieldOffset(sh.class.getDeclaredField("receiveSegment$volatile"));
        j = AtomicReferenceFieldUpdater.newUpdater(sh.class, Object.class, "bufferEndSegment$volatile");
        n = unsafe.objectFieldOffset(sh.class.getDeclaredField("bufferEndSegment$volatile"));
        k = AtomicReferenceFieldUpdater.newUpdater(sh.class, Object.class, "_closeCause$volatile");
        m = unsafe.objectFieldOffset(sh.class.getDeclaredField("_closeCause$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(sh.class, Object.class, "closeHandler$volatile");
        o = unsafe.objectFieldOffset(sh.class.getDeclaredField("closeHandler$volatile"));
    }

    public sh(int i2) {
        this.c = i2;
        if (i2 < 0) {
            nh0.e(q51.k(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        sk skVar = uh.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
        sk skVar2 = new sk(0L, null, this, 3);
        this.sendSegment$volatile = skVar2;
        this.receiveSegment$volatile = skVar2;
        if (A()) {
            skVar2 = uh.a;
            skVar2.getClass();
        }
        this.bufferEndSegment$volatile = skVar2;
        this._closeCause$volatile = uh.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object D(sh shVar, sq sqVar) throws ou {
        qh qhVar;
        sk skVar;
        if (sqVar instanceof qh) {
            qhVar = (qh) sqVar;
            int i2 = qhVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qhVar.h = i2 - Integer.MIN_VALUE;
            } else {
                qhVar = new qh(shVar, sqVar);
            }
        } else {
            qhVar = new qh(shVar, sqVar);
        }
        qh qhVar2 = qhVar;
        Object obj = qhVar2.f;
        int i3 = qhVar2.h;
        if (i3 != 0) {
            if (i3 == 1) {
                y90.V(obj);
                return ((rk) obj).a;
            }
            nh0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y90.V(obj);
        i.getClass();
        sk skVar2 = (sk) yi.a.getObjectVolatile(shVar, p);
        while (!shVar.y(d.get(shVar), true)) {
            long andIncrement = e.getAndIncrement(shVar);
            long j2 = uh.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (skVar2.e != j3) {
                sk skVarN = shVar.n(j3, skVar2);
                if (skVarN == null) {
                    continue;
                } else {
                    skVar = skVarN;
                }
            } else {
                skVar = skVar2;
            }
            sh shVar2 = shVar;
            Object objK = shVar2.K(skVar, i4, andIncrement, null);
            if (objK == uh.m) {
                nh0.j("unexpected");
                return null;
            }
            if (objK != uh.o) {
                if (objK != uh.n) {
                    skVar.a();
                    return objK;
                }
                qhVar2.h = 1;
                Object objE = shVar2.E(skVar, i4, andIncrement, qhVar2);
                lr lrVar = lr.c;
                return objE == lrVar ? lrVar : objE;
            }
            if (andIncrement < shVar2.u()) {
                skVar.a();
            }
            shVar = shVar2;
            skVar2 = skVar;
        }
        return new pk(shVar.s());
    }

    /* JADX WARN: Code duplicated, block: B:113:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:31:0x008e, B:40:0x00a0, B:41:0x00a9, B:43:0x00c6, B:46:0x00ce, B:51:0x00dd, B:63:0x00f6, B:64:0x00fa, B:66:0x0104, B:67:0x0108, B:68:0x010d, B:70:0x0110, B:71:0x0114, B:73:0x011e, B:74:0x0122, B:75:0x0127, B:76:0x0128, B:78:0x0131, B:79:0x0135, B:72:0x011a, B:80:0x013b), top: B:97:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0104 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:31:0x008e, B:40:0x00a0, B:41:0x00a9, B:43:0x00c6, B:46:0x00ce, B:51:0x00dd, B:63:0x00f6, B:64:0x00fa, B:66:0x0104, B:67:0x0108, B:68:0x010d, B:70:0x0110, B:71:0x0114, B:73:0x011e, B:74:0x0122, B:75:0x0127, B:76:0x0128, B:78:0x0131, B:79:0x0135, B:72:0x011a, B:80:0x013b), top: B:97:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0110 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:31:0x008e, B:40:0x00a0, B:41:0x00a9, B:43:0x00c6, B:46:0x00ce, B:51:0x00dd, B:63:0x00f6, B:64:0x00fa, B:66:0x0104, B:67:0x0108, B:68:0x010d, B:70:0x0110, B:71:0x0114, B:73:0x011e, B:74:0x0122, B:75:0x0127, B:76:0x0128, B:78:0x0131, B:79:0x0135, B:72:0x011a, B:80:0x013b), top: B:97:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[Catch: all -> 0x00d3, EDGE_INSN: B:71:0x0114->B:82:0x013f BREAK  A[LOOP:1: B:41:0x00a9->B:49:0x00d6], TryCatch #0 {all -> 0x00d3, blocks: (B:31:0x008e, B:40:0x00a0, B:41:0x00a9, B:43:0x00c6, B:46:0x00ce, B:51:0x00dd, B:63:0x00f6, B:64:0x00fa, B:66:0x0104, B:67:0x0108, B:68:0x010d, B:70:0x0110, B:71:0x0114, B:73:0x011e, B:74:0x0122, B:75:0x0127, B:76:0x0128, B:78:0x0131, B:79:0x0135, B:72:0x011a, B:80:0x013b), top: B:97:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0146  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149 A[RETURN] */
    public static Object G(sh shVar, Object obj, rq rqVar) throws ou {
        uc1 uc1Var;
        Object objS;
        int iD;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        atomicReferenceFieldUpdater.getClass();
        sk skVar = (sk) yi.a.getObjectVolatile(shVar, q);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(shVar);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zY = shVar.y(andIncrement, false);
            int i2 = uh.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = skVar.e;
            lr lrVar = lr.c;
            uc1Var = uc1.a;
            if (j5 != j4) {
                sk skVarQ = shVar.q(j4, skVar);
                if (skVarQ != null) {
                    skVar = skVarQ;
                } else if (zY) {
                    Object objC = shVar.C(rqVar, obj);
                    if (objC == lrVar) {
                        return objC;
                    }
                }
            }
            int iD2 = d(shVar, skVar, i3, obj, j2, null, zY);
            if (iD2 == 0) {
                skVar.a();
                return uc1Var;
            }
            if (iD2 != 1) {
                if (iD2 == 2) {
                    if (!zY) {
                        break;
                    }
                    skVar.m();
                    Object objC2 = shVar.C(rqVar, obj);
                    if (objC2 == lrVar) {
                        return objC2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
                    if (iD2 == 3) {
                        xi xiVarT = ds.t(ds.u(rqVar));
                        try {
                            int iD3 = d(shVar, skVar, i3, obj, j2, xiVarT, false);
                            if (iD3 != 0) {
                                if (iD3 != 1) {
                                    if (iD3 != 2) {
                                        if (iD3 != 4) {
                                            if (iD3 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            skVar.a();
                                            sk skVar2 = (sk) atomicReferenceFieldUpdater.get(shVar);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(shVar);
                                                long j6 = andIncrement2 & 1152921504606846975L;
                                                boolean zY2 = shVar.y(andIncrement2, false);
                                                int i4 = uh.b;
                                                long j7 = i4;
                                                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                                long j8 = j6 / j7;
                                                int i5 = (int) (j6 % j7);
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                                if (skVar2.e == j8) {
                                                    iD = d(shVar, skVar2, i5, obj, j6, xiVarT, zY2);
                                                    if (iD != 0) {
                                                        skVar2.a();
                                                    } else if (iD != 1) {
                                                        if (iD != 2) {
                                                            if (zY2) {
                                                                xiVarT.a(skVar2, i5 + i4);
                                                                break;
                                                            }
                                                            skVar2.m();
                                                        } else {
                                                            if (iD != 3) {
                                                                throw new IllegalStateException("unexpected");
                                                            }
                                                            if (iD != 4) {
                                                                if (iD != 5) {
                                                                    skVar2.a();
                                                                }
                                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                            } else if (j6 < atomicLongFieldUpdater4.get(shVar)) {
                                                                skVar2.a();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sk skVarQ2 = shVar.q(j8, skVar2);
                                                    if (skVarQ2 != null) {
                                                        skVar2 = skVarQ2;
                                                        iD = d(shVar, skVar2, i5, obj, j6, xiVarT, zY2);
                                                        if (iD != 0) {
                                                            skVar2.a();
                                                        } else if (iD != 1) {
                                                            if (iD != 2) {
                                                                if (zY2) {
                                                                    xiVarT.a(skVar2, i5 + i4);
                                                                    break;
                                                                }
                                                                skVar2.m();
                                                            } else {
                                                                if (iD != 3) {
                                                                    throw new IllegalStateException("unexpected");
                                                                }
                                                                if (iD != 4) {
                                                                    if (iD != 5) {
                                                                        skVar2.a();
                                                                    }
                                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                                } else if (j6 < atomicLongFieldUpdater4.get(shVar)) {
                                                                    skVar2.a();
                                                                }
                                                            }
                                                        }
                                                    } else if (!zY2) {
                                                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                        atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    }
                                                }
                                            }
                                        } else if (j2 < atomicLongFieldUpdater2.get(shVar)) {
                                            skVar.a();
                                        }
                                        a(shVar, obj, xiVarT);
                                        break;
                                    } else {
                                        xiVarT.a(skVar, i3 + i2);
                                    }
                                }
                                objS = xiVarT.s();
                                if (objS != lrVar) {
                                    objS = uc1Var;
                                }
                                if (objS == lrVar) {
                                    return objS;
                                }
                            } else {
                                skVar.a();
                            }
                            xiVarT.g(uc1Var);
                            objS = xiVarT.s();
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
                    } else if (iD2 == 4) {
                        if (j2 < atomicLongFieldUpdater2.get(shVar)) {
                            skVar.a();
                        }
                        Object objC3 = shVar.C(rqVar, obj);
                        if (objC3 == lrVar) {
                            return objC3;
                        }
                    } else if (iD2 == 5) {
                        skVar.a();
                    }
                }
            } else {
                break;
            }
        }
        return uc1Var;
    }

    public static boolean I(Object obj) {
        if (obj instanceof vi) {
            return uh.a((vi) obj, uc1.a, null);
        }
        id.s(obj, "Unexpected waiter: ");
        return false;
    }

    public static final void a(sh shVar, Object obj, xi xiVar) {
        xiVar.g(new py0(shVar.t()));
    }

    public static final int d(sh shVar, sk skVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        skVar.r(i2, obj);
        if (z) {
            return shVar.L(skVar, i2, obj, j2, obj2, z);
        }
        Object objP = skVar.p(i2);
        if (objP == null) {
            if (shVar.e(j2)) {
                if (skVar.o(null, i2, uh.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (skVar.o(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (objP instanceof bg1) {
            skVar.r(i2, null);
            if (shVar.H(objP, obj)) {
                skVar.s(i2, uh.i);
                return 0;
            }
            bx bxVar = uh.k;
            if (skVar.h.getAndSet((i2 * 2) + 1, bxVar) == bxVar) {
                return 5;
            }
            skVar.q(i2, true);
            return 5;
        }
        return shVar.L(skVar, i2, obj, j2, obj2, z);
    }

    public static void w(sh shVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(shVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(shVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j2 = f.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void B(long j2, sk skVar) {
        Unsafe unsafe;
        sk skVar2;
        sk skVar3;
        while (skVar.e < j2 && (skVar3 = (sk) skVar.c()) != null) {
            skVar = skVar3;
        }
        while (true) {
            sk skVar4 = skVar;
            while (skVar4.f() && (skVar2 = (sk) skVar4.c()) != null) {
                skVar4 = skVar2;
            }
            while (true) {
                j.getClass();
                Unsafe unsafe2 = yi.a;
                long j3 = n;
                w01 w01Var = (w01) unsafe2.getObjectVolatile(this, j3);
                if (w01Var.e >= skVar4.e) {
                    return;
                }
                if (!skVar4.n()) {
                    break;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, n, w01Var, skVar4)) {
                        if (w01Var.j()) {
                            w01Var.h();
                            return;
                        }
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j3) == w01Var);
                if (skVar4.j()) {
                    skVar4.h();
                }
            }
            skVar = skVar4;
        }
    }

    public final Object C(rq rqVar, Object obj) {
        xi xiVar = new xi(1, ds.u(rqVar));
        xiVar.v();
        xiVar.g(new py0(t()));
        Object objS = xiVar.s();
        return objS == lr.c ? objS : uc1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(sk skVar, int i2, long j2, sq sqVar) throws ou {
        rh rhVar;
        rk rkVar;
        sk skVar2;
        if (sqVar instanceof rh) {
            rhVar = (rh) sqVar;
            int i3 = rhVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rhVar.h = i3 - Integer.MIN_VALUE;
            } else {
                rhVar = new rh(this, sqVar);
            }
        } else {
            rhVar = new rh(this, sqVar);
        }
        Object objS = rhVar.f;
        int i4 = rhVar.h;
        if (i4 == 0) {
            y90.V(objS);
            rhVar.h = 1;
            xi xiVarT = ds.t(ds.u(rhVar));
            try {
                dw0 dw0Var = new dw0(xiVarT);
                Object objK = K(skVar, i2, j2, dw0Var);
                if (objK != uh.m) {
                    if (objK == uh.o) {
                        if (j2 < u()) {
                            skVar.a();
                        }
                        sk skVar3 = (sk) i.get(this);
                        while (true) {
                            if (y(d.get(this), true)) {
                                xiVarT.g(new rk(new pk(s())));
                                break;
                            }
                            long andIncrement = e.getAndIncrement(this);
                            long j3 = uh.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (skVar3.e != j4) {
                                sk skVarN = n(j4, skVar3);
                                if (skVarN != null) {
                                    skVar2 = skVarN;
                                }
                            } else {
                                skVar2 = skVar3;
                            }
                            Object objK2 = K(skVar2, i5, andIncrement, dw0Var);
                            sk skVar4 = skVar2;
                            if (objK2 == uh.m) {
                                dw0Var.a(skVar4, i5);
                                break;
                            }
                            if (objK2 == uh.o) {
                                if (andIncrement < u()) {
                                    skVar4.a();
                                }
                                skVar3 = skVar4;
                            } else {
                                if (objK2 == uh.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                skVar4.a();
                                rkVar = new rk(objK2);
                            }
                        }
                    } else {
                        skVar.a();
                        rkVar = new rk(objK);
                    }
                    xiVarT.D(rkVar, null);
                    break;
                }
                dw0Var.a(skVar, i2);
                objS = xiVarT.s();
                lr lrVar = lr.c;
                if (objS == lrVar) {
                    return lrVar;
                }
            } catch (Throwable th) {
                xiVarT.B();
                throw th;
            }
        } else {
            if (i4 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y90.V(objS);
        }
        return ((rk) objS).a;
    }

    public final void F(bg1 bg1Var, boolean z) {
        Throwable thT;
        if (bg1Var instanceof vi) {
            rq rqVar = (rq) bg1Var;
            if (z) {
                thT = s();
                if (thT == null) {
                    thT = new om("Channel was closed");
                }
            } else {
                thT = t();
            }
            rqVar.g(new py0(thT));
            return;
        }
        if (bg1Var instanceof dw0) {
            ((dw0) bg1Var).c.g(new rk(new pk(s())));
            return;
        }
        if (!(bg1Var instanceof ph)) {
            id.s(bg1Var, "Unexpected waiter: ");
            return;
        }
        ph phVar = (ph) bg1Var;
        xi xiVar = phVar.d;
        xiVar.getClass();
        phVar.d = null;
        phVar.c = uh.l;
        Throwable thS = phVar.e.s();
        if (thS == null) {
            xiVar.g(Boolean.FALSE);
        } else {
            xiVar.g(new py0(thS));
        }
    }

    public final boolean H(Object obj, Object obj2) {
        if (obj instanceof dw0) {
            return uh.a(((dw0) obj).c, new rk(obj2), null);
        }
        if (!(obj instanceof ph)) {
            if (obj instanceof vi) {
                return uh.a((vi) obj, obj2, null);
            }
            id.s(obj, "Unexpected receiver type: ");
            return false;
        }
        ph phVar = (ph) obj;
        xi xiVar = phVar.d;
        xiVar.getClass();
        phVar.d = null;
        phVar.c = obj2;
        return uh.a(xiVar, Boolean.TRUE, null);
    }

    public final Object J(Object obj) {
        sk skVarQ;
        ax axVar = uh.d;
        h.getClass();
        sk skVar = (sk) yi.a.getObjectVolatile(this, q);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zY = y(andIncrement, false);
            int i2 = uh.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (skVar.e != j4) {
                skVarQ = q(j4, skVar);
                if (skVarQ == null) {
                    if (zY) {
                        return new pk(t());
                    }
                }
            } else {
                skVarQ = skVar;
            }
            Object obj2 = obj;
            int iD = d(this, skVarQ, i3, obj2, j2, axVar, zY);
            skVar = skVarQ;
            uc1 uc1Var = uc1.a;
            if (iD == 0) {
                skVar.a();
                return uc1Var;
            }
            if (iD != 1) {
                if (iD != 2) {
                    if (iD == 3) {
                        nh0.j("unexpected");
                        return null;
                    }
                    if (iD == 4) {
                        if (j2 < e.get(this)) {
                            skVar.a();
                        }
                        return new pk(t());
                    }
                    if (iD == 5) {
                        skVar.a();
                    }
                    obj = obj2;
                } else {
                    if (zY) {
                        skVar.m();
                        return new pk(t());
                    }
                    bg1 bg1Var = axVar instanceof bg1 ? (bg1) axVar : null;
                    if (bg1Var != null) {
                        bg1Var.a(skVar, i3 + i2);
                    }
                    k((skVar.e * j3) + ((long) i3));
                }
            }
            return uc1Var;
        }
    }

    public final Object K(sk skVar, int i2, long j2, Object obj) {
        Object objP = skVar.p(i2);
        AtomicReferenceArray atomicReferenceArray = skVar.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objP == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return uh.n;
                }
                if (skVar.o(objP, i2, obj)) {
                    l();
                    return uh.m;
                }
            }
        } else if (objP == uh.d && skVar.o(objP, i2, uh.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            skVar.r(i2, null);
            return obj2;
        }
        while (true) {
            Object objP2 = skVar.p(i2);
            if (objP2 == null || objP2 == uh.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (skVar.o(objP2, i2, uh.h)) {
                        l();
                        return uh.o;
                    }
                } else {
                    if (obj == null) {
                        return uh.n;
                    }
                    if (skVar.o(objP2, i2, obj)) {
                        l();
                        return uh.m;
                    }
                }
            } else if (objP2 != uh.d) {
                bx bxVar = uh.j;
                if (objP2 == bxVar) {
                    return uh.o;
                }
                if (objP2 == uh.h) {
                    return uh.o;
                }
                if (objP2 == uh.l) {
                    l();
                    return uh.o;
                }
                if (objP2 != uh.g && skVar.o(objP2, i2, uh.f)) {
                    boolean z = objP2 instanceof cg1;
                    if (z) {
                        objP2 = ((cg1) objP2).a;
                    }
                    if (I(objP2)) {
                        skVar.s(i2, uh.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        skVar.r(i2, null);
                        return obj3;
                    }
                    skVar.s(i2, bxVar);
                    skVar.m();
                    if (z) {
                        l();
                    }
                    return uh.o;
                }
            } else if (skVar.o(objP2, i2, uh.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                skVar.r(i2, null);
                return obj4;
            }
        }
    }

    public final int L(sk skVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objP = skVar.p(i2);
            if (objP == null) {
                if (!e(j2) || z) {
                    if (z) {
                        if (skVar.o(null, i2, uh.j)) {
                            skVar.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (skVar.o(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (skVar.o(null, i2, uh.d)) {
                    break;
                }
            } else {
                if (objP != uh.e) {
                    bx bxVar = uh.k;
                    if (objP == bxVar) {
                        skVar.r(i2, null);
                        return 5;
                    }
                    if (objP == uh.h) {
                        skVar.r(i2, null);
                        return 5;
                    }
                    if (objP == uh.l) {
                        skVar.r(i2, null);
                        j();
                        return 4;
                    }
                    skVar.r(i2, null);
                    if (objP instanceof cg1) {
                        objP = ((cg1) objP).a;
                    }
                    if (H(objP, obj)) {
                        skVar.s(i2, uh.i);
                        return 0;
                    }
                    if (skVar.h.getAndSet((i2 * 2) + 1, bxVar) != bxVar) {
                        skVar.q(i2, true);
                    }
                    return 5;
                }
                if (skVar.o(objP, i2, uh.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void M(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        sh shVar = this;
        if (shVar.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f;
            if (atomicLongFieldUpdater.get(shVar) > j2) {
                break;
            } else {
                shVar = this;
            }
        }
        int i2 = uh.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(shVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(shVar)) && j3 == atomicLongFieldUpdater.get(shVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(shVar);
                    if (atomicLongFieldUpdater2.compareAndSet(shVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        shVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(shVar);
                    long j6 = atomicLongFieldUpdater2.get(shVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(shVar)) {
                        break;
                    }
                    if (z) {
                        shVar = this;
                    } else {
                        shVar = this;
                        atomicLongFieldUpdater2.compareAndSet(shVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(shVar);
                    if (atomicLongFieldUpdater2.compareAndSet(shVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        shVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.fk
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // defpackage.c11
    public Object c(rq rqVar, Object obj) {
        return G(this, obj, rqVar);
    }

    public final boolean e(long j2) {
        return j2 < f.get(this) || j2 < e.get(this) + ((long) this.c);
    }

    public final boolean f(Throwable th) {
        return h(th, false);
    }

    public final sk g() {
        j.getClass();
        Unsafe unsafe = yi.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, n);
        h.getClass();
        sk skVar = (sk) unsafe.getObjectVolatile(this, q);
        if (skVar.e > ((sk) objectVolatile).e) {
            objectVolatile = skVar;
        }
        i.getClass();
        sk skVar2 = (sk) unsafe.getObjectVolatile(this, p);
        if (skVar2.e > ((sk) objectVolatile).e) {
            objectVolatile = skVar2;
        }
        ho hoVar = (ho) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ho.a;
            Object objD = hoVar.d();
            if (objD == ds.b) {
                break;
            }
            ho hoVar2 = (ho) objD;
            if (hoVar2 != null) {
                hoVar = hoVar2;
            } else if (hoVar.g()) {
                break;
            }
        }
        return (sk) hoVar;
    }

    public final boolean h(Throwable th, boolean z) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        sh shVar;
        boolean z2;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
        if (!z) {
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            break;
        }
        while (true) {
            long j3 = atomicLongFieldUpdater2.get(this);
            if (((int) (j3 >> 60)) != 0) {
                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                break;
            }
            sk skVar = uh.a;
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            if (atomicLongFieldUpdater2.compareAndSet(this, j3, (j3 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater;
        }
        bx bxVar = uh.s;
        while (true) {
            k.getClass();
            Unsafe unsafe = yi.a;
            long j4 = m;
            shVar = this;
            if (unsafe.compareAndSwapObject(shVar, j4, bxVar, th)) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(shVar, j4) != bxVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(shVar);
                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                if (atomicLongFieldUpdater3.compareAndSet(shVar, j5, (j5 & 1152921504606846975L) + 3458764513820540928L)) {
                    break;
                }
                atomicLongFieldUpdater = atomicLongFieldUpdater3;
            }
        } else {
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater;
            while (true) {
                long j6 = atomicLongFieldUpdater4.get(shVar);
                int i2 = (int) (j6 >> 60);
                if (i2 == 0) {
                    j2 = (j6 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = (j6 & 1152921504606846975L) + 3458764513820540928L;
                }
                if (atomicLongFieldUpdater4.compareAndSet(shVar, j6, j2)) {
                    break;
                }
                shVar = this;
            }
        }
        j();
        if (z2) {
            x();
        }
        return z2;
    }

    public final sk i(long j2) {
        long j3;
        sk skVarG = g();
        if (z()) {
            sk skVar = skVarG;
            loop0: while (true) {
                int i2 = uh.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (skVar.e * ((long) uh.b)) + ((long) i2);
                        if (j3 >= e.get(this)) {
                            while (true) {
                                Object objP = skVar.p(i2);
                                if (objP != null && objP != uh.e) {
                                    if (objP != uh.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (skVar.o(objP, i2, uh.l)) {
                                    skVar.m();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        skVar = (sk) skVar.e();
                        if (skVar == null) {
                        }
                    }
                    j3 = -1;
                    break loop0;
                }
            }
            if (j3 != -1) {
                k(j3);
            }
        }
        Object objL = null;
        loop3: for (sk skVar2 = skVarG; skVar2 != null; skVar2 = (sk) skVar2.e()) {
            for (int i3 = uh.b - 1; -1 < i3; i3--) {
                if ((skVar2.e * ((long) uh.b)) + ((long) i3) < j2) {
                    break loop3;
                }
                while (true) {
                    Object objP2 = skVar2.p(i3);
                    if (objP2 != null && objP2 != uh.e) {
                        if (!(objP2 instanceof cg1)) {
                            if (!(objP2 instanceof bg1)) {
                                break;
                            }
                            if (skVar2.o(objP2, i3, uh.l)) {
                                objL = th1.L(objL, objP2);
                                skVar2.q(i3, true);
                                break;
                            }
                        } else {
                            if (skVar2.o(objP2, i3, uh.l)) {
                                objL = th1.L(objL, ((cg1) objP2).a);
                                skVar2.q(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (skVar2.o(objP2, i3, uh.l)) {
                            skVar2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (objL != null) {
            if (!(objL instanceof ArrayList)) {
                F((bg1) objL, true);
                return skVarG;
            }
            ArrayList arrayList = (ArrayList) objL;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                F((bg1) arrayList.get(size), true);
            }
        }
        return skVarG;
    }

    @Override // defpackage.fk
    public final ph iterator() {
        return new ph(this);
    }

    public final void j() {
        y(d.get(this), false);
    }

    public final void k(long j2) {
        i.getClass();
        sk skVar = (sk) yi.a.getObjectVolatile(this, p);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.c) + j3, f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = uh.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (skVar.e != j5) {
                    sk skVarN = n(j5, skVar);
                    if (skVarN != null) {
                        skVar = skVarN;
                    }
                }
                sk skVar2 = skVar;
                if (K(skVar2, i2, j3, null) != uh.o || j3 < u()) {
                    skVar2.a();
                }
                skVar = skVar2;
            }
        }
    }

    public final void l() {
        if (A()) {
            return;
        }
        j.getClass();
        sk skVar = (sk) yi.a.getObjectVolatile(this, n);
        while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j2 = uh.b;
            long j3 = andIncrement / j2;
            if (u() <= andIncrement) {
                if (skVar.e < j3 && skVar.c() != null) {
                    B(j3, skVar);
                }
                w(this);
                return;
            }
            if (skVar.e != j3) {
                sk skVarM = m(j3, skVar, andIncrement);
                if (skVarM == null) {
                    continue;
                } else {
                    skVar = skVarM;
                }
            }
            int i2 = (int) (andIncrement % j2);
            Object objP = skVar.p(i2);
            boolean z = objP instanceof bg1;
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            if (!z || andIncrement < atomicLongFieldUpdater.get(this) || !skVar.o(objP, i2, uh.g)) {
                while (true) {
                    Object objP2 = skVar.p(i2);
                    if (objP2 instanceof bg1) {
                        if (andIncrement < atomicLongFieldUpdater.get(this)) {
                            if (skVar.o(objP2, i2, new cg1((bg1) objP2))) {
                                w(this);
                                return;
                            }
                        } else if (skVar.o(objP2, i2, uh.g)) {
                            if (!I(objP2)) {
                                skVar.s(i2, uh.j);
                                skVar.m();
                                break;
                            } else {
                                skVar.s(i2, uh.d);
                                w(this);
                                return;
                            }
                        }
                    } else {
                        if (objP2 == uh.j) {
                            break;
                        }
                        if (objP2 == null) {
                            if (skVar.o(objP2, i2, uh.e)) {
                                w(this);
                                return;
                            }
                        } else if (objP2 == uh.d || objP2 == uh.h || objP2 == uh.i || objP2 == uh.k || objP2 == uh.l) {
                            w(this);
                            return;
                        } else if (objP2 != uh.f) {
                            id.s(objP2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                w(this);
            } else if (I(objP)) {
                skVar.s(i2, uh.d);
                w(this);
                return;
            } else {
                skVar.s(i2, uh.j);
                skVar.m();
                w(this);
            }
        }
    }

    public final sk m(long j2, sk skVar, long j3) {
        Object objN;
        Unsafe unsafe;
        sk skVar2 = uh.a;
        th thVar = th.k;
        loop0: while (true) {
            objN = ds.n(skVar, j2, thVar);
            if (!uj.t(objN)) {
                w01 w01VarR = uj.r(objN);
                while (true) {
                    j.getClass();
                    Unsafe unsafe2 = yi.a;
                    long j4 = n;
                    w01 w01Var = (w01) unsafe2.getObjectVolatile(this, j4);
                    if (w01Var.e >= w01VarR.e) {
                        break loop0;
                    }
                    if (!w01VarR.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, n, w01Var, w01VarR)) {
                            if (!w01Var.j()) {
                                break loop0;
                            }
                            w01Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == w01Var);
                    if (w01VarR.j()) {
                        w01VarR.h();
                    }
                }
            } else {
                break;
            }
        }
        if (uj.t(objN)) {
            j();
            B(j2, skVar);
            w(this);
            return null;
        }
        sk skVar3 = (sk) uj.r(objN);
        long j5 = skVar3.e;
        if (j5 <= j2) {
            return skVar3;
        }
        long j6 = j5 * ((long) uh.b);
        if (!f.compareAndSet(this, j3 + 1, j6)) {
            w(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(this, j6 - j3) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final sk n(long j2, sk skVar) {
        Object objN;
        sk skVar2;
        long j3;
        Unsafe unsafe;
        sk skVar3 = uh.a;
        th thVar = th.k;
        loop0: while (true) {
            objN = ds.n(skVar, j2, thVar);
            if (!uj.t(objN)) {
                w01 w01VarR = uj.r(objN);
                while (true) {
                    i.getClass();
                    Unsafe unsafe2 = yi.a;
                    long j4 = p;
                    w01 w01Var = (w01) unsafe2.getObjectVolatile(this, j4);
                    if (w01Var.e >= w01VarR.e) {
                        break loop0;
                    }
                    if (!w01VarR.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, p, w01Var, w01VarR)) {
                            if (!w01Var.j()) {
                                break loop0;
                            }
                            w01Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == w01Var);
                    if (w01VarR.j()) {
                        w01VarR.h();
                    }
                }
            } else {
                break;
            }
        }
        if (uj.t(objN)) {
            j();
            if (skVar.e * ((long) uh.b) < u()) {
                skVar.a();
                return null;
            }
        } else {
            sk skVar4 = (sk) uj.r(objN);
            long j5 = skVar4.e;
            if (A() || j2 > f.get(this) / ((long) uh.b)) {
                skVar2 = skVar4;
                break;
            }
            loop3: while (true) {
                j.getClass();
                Unsafe unsafe3 = yi.a;
                long j6 = n;
                w01 w01Var2 = (w01) unsafe3.getObjectVolatile(this, j6);
                if (w01Var2.e >= j5 || !skVar4.n()) {
                    skVar2 = skVar4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = yi.a;
                    skVar2 = skVar4;
                    if (unsafe4.compareAndSwapObject(this, n, w01Var2, skVar4)) {
                        if (!w01Var2.j()) {
                            break loop3;
                        }
                        w01Var2.h();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j6) != w01Var2) {
                        break;
                    }
                    skVar4 = skVar2;
                }
                if (skVar2.j()) {
                    skVar2.h();
                }
                skVar4 = skVar2;
            }
            if (j5 <= j2) {
                return skVar2;
            }
            long j7 = j5 * ((long) uh.b);
            do {
                j3 = e.get(this);
                if (j3 >= j7) {
                    break;
                }
            } while (!e.compareAndSet(this, j3, j7));
            if (j5 * ((long) uh.b) < u()) {
                skVar2.a();
            }
        }
        return null;
    }

    @Override // defpackage.fk
    public final Object o() {
        sk skVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (y(j3, true)) {
            return new pk(s());
        }
        long j4 = j3 & 1152921504606846975L;
        qk qkVar = rk.b;
        if (j2 >= j4) {
            return qkVar;
        }
        Object obj = uh.k;
        i.getClass();
        sk skVar2 = (sk) yi.a.getObjectVolatile(this, p);
        while (!y(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = uh.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (skVar2.e != j6) {
                sk skVarN = n(j6, skVar2);
                if (skVarN == null) {
                    continue;
                } else {
                    skVar = skVarN;
                }
            } else {
                skVar = skVar2;
            }
            Object objK = K(skVar, i2, andIncrement, obj);
            sk skVar3 = skVar;
            if (objK == uh.m) {
                bg1 bg1Var = obj instanceof bg1 ? (bg1) obj : null;
                if (bg1Var != null) {
                    bg1Var.a(skVar3, i2);
                }
                M(andIncrement);
                skVar3.m();
                return qkVar;
            }
            if (objK != uh.o) {
                if (objK != uh.n) {
                    skVar3.a();
                    return objK;
                }
                nh0.j("unexpected");
                return null;
            }
            if (andIncrement < u()) {
                skVar3.a();
            }
            skVar2 = skVar3;
        }
        return new pk(s());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0072, please report this as an issue */
    @Override // defpackage.c11
    public Object p(Object obj) {
        int iD;
        uc1 uc1Var;
        bg1 bg1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j3 = 1152921504606846975L;
        boolean z2 = y(j2, false) ? false : !e(j2 & 1152921504606846975L);
        qk qkVar = rk.b;
        if (z2) {
            return qkVar;
        }
        ax axVar = uh.j;
        h.getClass();
        sk skVar = (sk) yi.a.getObjectVolatile(this, q);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean zY = y(andIncrement, z);
            int i2 = uh.b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (skVar.e == j6) {
                iD = d(this, skVar, i3, obj, j4, axVar, zY);
                uc1Var = uc1.a;
                if (iD != 0) {
                    skVar.a();
                    return uc1Var;
                }
                if (iD != 1) {
                    return uc1Var;
                }
                if (iD != 2) {
                    if (zY) {
                        skVar.m();
                        return new pk(t());
                    }
                    bg1Var = axVar instanceof bg1 ? (bg1) axVar : null;
                    if (bg1Var != null) {
                        bg1Var.a(skVar, i3 + i2);
                    }
                    skVar.m();
                    return qkVar;
                }
                if (iD != 3) {
                    nh0.j("unexpected");
                    return null;
                }
                if (iD != 4) {
                    if (j4 < e.get(this)) {
                        skVar.a();
                    }
                    return new pk(t());
                }
                if (iD == 5) {
                    skVar.a();
                }
                z = false;
            } else {
                sk skVarQ = q(j6, skVar);
                if (skVarQ != null) {
                    skVar = skVarQ;
                    iD = d(this, skVar, i3, obj, j4, axVar, zY);
                    uc1Var = uc1.a;
                    if (iD != 0) {
                        skVar.a();
                        return uc1Var;
                    }
                    if (iD != 1) {
                        return uc1Var;
                    }
                    if (iD != 2) {
                        if (zY) {
                            skVar.m();
                            return new pk(t());
                        }
                        if (axVar instanceof bg1) {
                        }
                        if (bg1Var != null) {
                            bg1Var.a(skVar, i3 + i2);
                        }
                        skVar.m();
                        return qkVar;
                    }
                    if (iD != 3) {
                        nh0.j("unexpected");
                        return null;
                    }
                    if (iD != 4) {
                        if (j4 < e.get(this)) {
                            skVar.a();
                        }
                        return new pk(t());
                    }
                    if (iD == 5) {
                        skVar.a();
                    }
                    z = false;
                } else {
                    if (zY) {
                        return new pk(t());
                    }
                    z = false;
                }
            }
            j3 = 1152921504606846975L;
        }
    }

    public final sk q(long j2, sk skVar) {
        Object objN;
        long j3;
        long j4;
        Unsafe unsafe;
        sk skVar2 = uh.a;
        th thVar = th.k;
        loop0: while (true) {
            objN = ds.n(skVar, j2, thVar);
            if (!uj.t(objN)) {
                w01 w01VarR = uj.r(objN);
                while (true) {
                    h.getClass();
                    Unsafe unsafe2 = yi.a;
                    long j5 = q;
                    w01 w01Var = (w01) unsafe2.getObjectVolatile(this, j5);
                    if (w01Var.e >= w01VarR.e) {
                        break loop0;
                    }
                    if (!w01VarR.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, q, w01Var, w01VarR)) {
                            if (!w01Var.j()) {
                                break loop0;
                            }
                            w01Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == w01Var);
                    if (w01VarR.j()) {
                        w01VarR.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zT = uj.t(objN);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (zT) {
            j();
            if (skVar.e * ((long) uh.b) < atomicLongFieldUpdater.get(this)) {
                skVar.a();
                return null;
            }
        } else {
            sk skVar3 = (sk) uj.r(objN);
            long j6 = skVar3.e;
            if (j6 <= j2) {
                return skVar3;
            }
            long j7 = j6 * ((long) uh.b);
            do {
                j3 = d.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j7) {
                    break;
                }
            } while (!d.compareAndSet(this, j3, j4 + (((long) ((int) (j3 >> 60))) << 60)));
            if (j6 * ((long) uh.b) < atomicLongFieldUpdater.get(this)) {
                skVar3.a();
            }
        }
        return null;
    }

    @Override // defpackage.fk
    public final Object r(gn gnVar) {
        return D(this, gnVar);
    }

    public final Throwable s() {
        k.getClass();
        return (Throwable) yi.a.getObjectVolatile(this, m);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new pm("Channel was closed") : thS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (d.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.c + ',');
        sb.append("data=[");
        i.getClass();
        Unsafe unsafe = yi.a;
        h.getClass();
        j.getClass();
        List listAsList = Arrays.asList(unsafe.getObjectVolatile(this, p), unsafe.getObjectVolatile(this, q), unsafe.getObjectVolatile(this, n));
        listAsList.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsList) {
            if (((sk) obj) != uh.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((sk) next).e;
            do {
                Object next2 = it.next();
                long j3 = ((sk) next2).e;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        sk skVar = (sk) next;
        long j4 = e.get(this);
        long jU = u();
        loop2: do {
            int i3 = uh.b;
            for (int i4 = 0; i4 < i3; i4++) {
                long j5 = (skVar.e * ((long) uh.b)) + ((long) i4);
                if (j5 >= jU && j5 >= j4) {
                    break loop2;
                }
                Object objP = skVar.p(i4);
                Object obj2 = skVar.h.get(i4 * 2);
                if (objP instanceof vi) {
                    string = (j5 >= j4 || j5 < jU) ? (j5 >= jU || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objP instanceof dw0) {
                    string = "receiveCatching";
                } else if (objP instanceof cg1) {
                    string = "EB(" + objP + ')';
                } else if (y90.e(objP, uh.f) || y90.e(objP, uh.g)) {
                    string = "resuming_sender";
                } else {
                    if (objP != null && !objP.equals(uh.e) && !objP.equals(uh.i) && !objP.equals(uh.h) && !objP.equals(uh.k) && !objP.equals(uh.j) && !objP.equals(uh.l)) {
                        string = objP.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            skVar = (sk) skVar.c();
        } while (skVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return d.get(this) & 1152921504606846975L;
    }

    public final boolean v() {
        while (true) {
            i.getClass();
            Unsafe unsafe = yi.a;
            long j2 = p;
            sk skVarN = (sk) unsafe.getObjectVolatile(this, j2);
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (u() <= j3) {
                return false;
            }
            long j4 = uh.b;
            long j5 = j3 / j4;
            if (skVarN.e == j5 || (skVarN = n(j5, skVarN)) != null) {
                skVarN.a();
                int i2 = (int) (j3 % j4);
                while (true) {
                    Object objP = skVarN.p(i2);
                    if (objP != null && objP != uh.e) {
                        if (objP != uh.d) {
                            if (objP != uh.j && objP != uh.l && objP != uh.i && objP != uh.h) {
                                if (objP != uh.g) {
                                    if (objP == uh.f || j3 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (skVarN.o(objP, i2, uh.h)) {
                        l();
                        break;
                    }
                }
                e.compareAndSet(this, j3, j3 + 1);
            } else if (((sk) unsafe.getObjectVolatile(this, j2)).e < j5) {
                return false;
            }
        }
    }

    public final void x() {
        Object objectVolatile;
        Unsafe unsafe;
        loop0: while (true) {
            l.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = o;
            objectVolatile = unsafe2.getObjectVolatile(this, j2);
            bx bxVar = objectVolatile == null ? uh.q : uh.r;
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, o, objectVolatile, bxVar)) {
                    break loop0;
                }
            } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
        }
        if (objectVolatile == null) {
            return;
        }
        ec1.g(1, objectVolatile);
        ((z50) objectVolatile).h(s());
    }

    public final boolean y(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                i(j2 & 1152921504606846975L);
                if (!z || !v()) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(gr0.e(i2, "unexpected close status: ").toString());
                }
                sk skVarI = i(j2 & 1152921504606846975L);
                Object objL = null;
                loop0: do {
                    for (int i3 = uh.b - 1; -1 < i3; i3--) {
                        long j3 = (skVarI.e * ((long) uh.b)) + ((long) i3);
                        while (true) {
                            Object objP = skVarI.p(i3);
                            if (objP == uh.i) {
                                break loop0;
                            }
                            bx bxVar = uh.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if (objP != bxVar) {
                                if (objP != uh.e && objP != null) {
                                    if (!(objP instanceof bg1) && !(objP instanceof cg1)) {
                                        bx bxVar2 = uh.g;
                                        if (objP == bxVar2 || objP == uh.f) {
                                            break loop0;
                                        }
                                        if (objP != bxVar2) {
                                            break;
                                        }
                                    } else {
                                        if (j3 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        bg1 bg1Var = objP instanceof cg1 ? ((cg1) objP).a : (bg1) objP;
                                        if (skVarI.o(objP, i3, uh.l)) {
                                            objL = th1.L(objL, bg1Var);
                                            skVarI.r(i3, null);
                                            skVarI.m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (skVarI.o(objP, i3, uh.l)) {
                                        skVarI.m();
                                        break;
                                    }
                                }
                            } else {
                                if (j3 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (skVarI.o(objP, i3, uh.l)) {
                                    skVarI.r(i3, null);
                                    skVarI.m();
                                    break;
                                }
                            }
                        }
                    }
                    skVarI = (sk) skVarI.e();
                } while (skVarI != null);
                if (objL != null) {
                    if (objL instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objL;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            F((bg1) arrayList.get(size), false);
                        }
                    } else {
                        F((bg1) objL, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean z() {
        return false;
    }
}
