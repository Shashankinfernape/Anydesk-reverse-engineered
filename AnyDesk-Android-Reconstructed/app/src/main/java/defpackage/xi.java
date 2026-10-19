package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class xi extends ru implements vi, mr, bg1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(xi.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(xi.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final rq f;
    public final br g;

    static {
        Unsafe unsafe = yi.a;
        l = unsafe.objectFieldOffset(xi.class.getDeclaredField("_state$volatile"));
        j = AtomicReferenceFieldUpdater.newUpdater(xi.class, Object.class, "_parentHandle$volatile");
        k = unsafe.objectFieldOffset(xi.class.getDeclaredField("_parentHandle$volatile"));
    }

    public xi(int i2, rq rqVar) {
        super(i2);
        this.f = rqVar;
        this.g = rqVar.e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b6.a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object G(zp0 zp0Var, Object obj, int i2, e60 e60Var) {
        if (obj instanceof on) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (e60Var != null || (zp0Var instanceof si)) {
            return new mn(obj, zp0Var instanceof si ? (si) zp0Var : null, e60Var, (Throwable) null, 16);
        }
        return obj;
    }

    public final void B() throws ou {
        Throwable thQ;
        rq rqVar = this.f;
        pu puVar = rqVar instanceof pu ? (pu) rqVar : null;
        if (puVar == null || (thQ = puVar.q(this)) == null) {
            return;
        }
        p();
        o(thQ);
    }

    public final boolean C() {
        i.getClass();
        Unsafe unsafe = yi.a;
        long j2 = l;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        if ((objectVolatile instanceof mn) && ((mn) objectVolatile).d != null) {
            p();
            return false;
        }
        h.set(this, 536870911);
        unsafe.putObjectVolatile(this, j2, b6.a);
        return true;
    }

    public final void D(Object obj, e60 e60Var) throws ou {
        E(obj, this.e, e60Var);
    }

    public final void E(Object obj, int i2, e60 e60Var) throws ou {
        Unsafe unsafe;
        while (true) {
            i.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof zp0)) {
                if (objectVolatile instanceof cj) {
                    cj cjVar = (cj) objectVolatile;
                    if (cj.c.compareAndSet(cjVar, 0, 1)) {
                        if (e60Var != null) {
                            m(e60Var, cjVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                id.s(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objG = G((zp0) objectVolatile, obj, i2, e60Var);
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, l, objectVolatile, objG)) {
                    if (!z()) {
                        p();
                    }
                    q(i2);
                    return;
                }
            } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
        }
    }

    public final void F(dr drVar) {
        rq rqVar = this.f;
        pu puVar = rqVar instanceof pu ? (pu) rqVar : null;
        E(uc1.a, (puVar != null ? puVar.f : null) == drVar ? 4 : this.e, null);
    }

    public final bx H(Object obj, e60 e60Var) {
        Unsafe unsafe;
        bx bxVar = uj.b;
        while (true) {
            i.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof zp0)) {
                return null;
            }
            Object objG = G((zp0) objectVolatile, obj, this.e, e60Var);
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, l, objectVolatile, objG)) {
                    if (!z()) {
                        p();
                    }
                    return bxVar;
                }
            } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
        }
    }

    @Override // defpackage.bg1
    public final void a(w01 w01Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                nh0.j("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        y(w01Var);
    }

    @Override // defpackage.ru
    public final void b(CancellationException cancellationException) {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            i.getClass();
            Unsafe unsafe3 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j2);
            if (objectVolatile instanceof zp0) {
                nh0.j("Not completed");
                return;
            }
            if (objectVolatile instanceof on) {
                return;
            }
            if (objectVolatile instanceof mn) {
                mn mnVar = (mn) objectVolatile;
                if (mnVar.e != null) {
                    nh0.j("Must be called at most once");
                    return;
                }
                mn mnVarA = mn.a(mnVar, null, cancellationException, 15);
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(this, l, objectVolatile, mnVarA)) {
                        si siVar = mnVar.b;
                        if (siVar != null) {
                            l(siVar, cancellationException);
                        }
                        e60 e60Var = mnVar.c;
                        if (e60Var != null) {
                            m(e60Var, cancellationException, mnVar.a);
                            return;
                        }
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
            } else {
                mn mnVar2 = new mn(objectVolatile, (si) null, (e60) null, cancellationException, 14);
                do {
                    mn mnVar3 = mnVar2;
                    unsafe2 = yi.a;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(this, l, objectVolatile, mnVar3);
                    mnVar2 = mnVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    @Override // defpackage.ru
    public final rq c() {
        return this.f;
    }

    @Override // defpackage.mr
    public final mr d() {
        rq rqVar = this.f;
        if (rqVar instanceof mr) {
            return (mr) rqVar;
        }
        return null;
    }

    @Override // defpackage.rq
    public final br e() {
        return this.g;
    }

    @Override // defpackage.ru
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        Throwable thA = qy0.a(obj);
        if (thA != null) {
            obj = new on(thA, false);
        }
        E(obj, this.e, null);
    }

    @Override // defpackage.ru
    public final Object h(Object obj) {
        return obj instanceof mn ? ((mn) obj).a : obj;
    }

    @Override // defpackage.ru
    public final Object j() {
        return u();
    }

    @Override // defpackage.vi
    public final bx k(Object obj, e60 e60Var) {
        return H(obj, e60Var);
    }

    public final void l(si siVar, Throwable th) {
        try {
            switch (siVar.a) {
                case 0:
                    ((z50) siVar.b).h(th);
                    break;
                default:
                    ((uu) siVar.b).b();
                    break;
            }
        } catch (Throwable th2) {
            uj.s(this.g, new pn("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(e60 e60Var, Throwable th, Object obj) {
        br brVar = this.g;
        try {
            e60Var.c(th, obj, brVar);
        } catch (Throwable th2) {
            uj.s(brVar, new pn("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(w01 w01Var, Throwable th) {
        br brVar = this.g;
        int i2 = h.get(this) & 536870911;
        if (i2 == 536870911) {
            nh0.j("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            w01Var.l(i2, brVar);
        } catch (Throwable th2) {
            uj.s(brVar, new pn("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Throwable th) throws ou {
        Throwable cancellationException;
        Unsafe unsafe;
        while (true) {
            i.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof zp0)) {
                return;
            }
            boolean z = (objectVolatile instanceof si) || (objectVolatile instanceof w01);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            cj cjVar = new cj(cancellationException, z);
            do {
                unsafe = yi.a;
                if (unsafe.compareAndSwapObject(this, l, objectVolatile, cjVar)) {
                    zp0 zp0Var = (zp0) objectVolatile;
                    if (zp0Var instanceof si) {
                        l((si) objectVolatile, th);
                    } else if (zp0Var instanceof w01) {
                        n((w01) objectVolatile, th);
                    }
                    if (!z()) {
                        p();
                    }
                    q(this.e);
                    return;
                }
            } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
        }
    }

    public final void p() {
        uu uuVarR = r();
        if (uuVarR == null) {
            return;
        }
        uuVarR.b();
        j.getClass();
        yi.a.putObjectVolatile(this, k, xp0.c);
    }

    public final void q(int i2) throws ou {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    nh0.j("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                rq rqVar = this.f;
                if (!z && (rqVar instanceof pu)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.e;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        pu puVar = (pu) rqVar;
                        dr drVar = puVar.f;
                        br brVarE = puVar.g.e();
                        if (r71.M(drVar, brVarE)) {
                            r71.L(drVar, brVarE, this);
                            return;
                        }
                        dy dyVarA = x91.a();
                        if (dyVarA.e >= 4294967296L) {
                            dyVarA.p(this);
                            return;
                        }
                        dyVarA.r(true);
                        try {
                            th1.O(this, rqVar, true);
                            do {
                            } while (dyVarA.t());
                        } catch (Throwable th) {
                            try {
                                i(th);
                            } finally {
                                dyVarA.o();
                            }
                        }
                        return;
                    }
                }
                th1.O(this, rqVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final uu r() {
        j.getClass();
        return (uu) yi.a.getObjectVolatile(this, k);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        pd0 pd0Var;
        boolean z = z();
        do {
            atomicIntegerFieldUpdater = h;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    nh0.j("Already suspended");
                    return null;
                }
                if (z) {
                    B();
                }
                Object objU = u();
                if (objU instanceof on) {
                    throw ((on) objU).a;
                }
                int i4 = this.e;
                if ((i4 != 1 && i4 != 2) || (pd0Var = (pd0) this.g.l(fw.f)) == null || pd0Var.a()) {
                    return h(objU);
                }
                CancellationException cancellationExceptionN = pd0Var.n();
                b(cancellationExceptionN);
                throw cancellationExceptionN;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (r() == null) {
            w();
        }
        if (z) {
            B();
        }
        return lr.c;
    }

    @Override // defpackage.vi
    public final void t(Object obj) {
        q(this.e);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(ds.F(this.f));
        sb.append("){");
        Object objU = u();
        if (objU instanceof zp0) {
            str = "Active";
        } else {
            str = objU instanceof cj ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(ds.s(this));
        return sb.toString();
    }

    public final Object u() {
        i.getClass();
        return yi.a.getObjectVolatile(this, l);
    }

    public final void v() {
        uu uuVarW = w();
        if (uuVarW == null || (u() instanceof zp0)) {
            return;
        }
        uuVarW.b();
        j.getClass();
        yi.a.putObjectVolatile(this, k, xp0.c);
    }

    public final uu w() {
        Unsafe unsafe;
        long j2;
        pd0 pd0Var = (pd0) this.g.l(fw.f);
        if (pd0Var == null) {
            return null;
        }
        uu uuVarE = y90.E(pd0Var, true, new ll(this));
        do {
            j.getClass();
            unsafe = yi.a;
            j2 = k;
            if (unsafe.compareAndSwapObject(this, j2, (Object) null, uuVarE)) {
                break;
            }
        } while (unsafe.getObjectVolatile(this, j2) == null);
        return uuVarE;
    }

    public final void x(z50 z50Var) {
        y(new si(0, z50Var));
    }

    public final void y(zp0 zp0Var) {
        zp0 zp0Var2;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            i.getClass();
            Unsafe unsafe3 = yi.a;
            long j2 = l;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j2);
            if (objectVolatile instanceof b6) {
                while (true) {
                    Unsafe unsafe4 = yi.a;
                    zp0 zp0Var3 = zp0Var;
                    zp0Var2 = zp0Var3;
                    if (unsafe4.compareAndSwapObject(this, l, objectVolatile, zp0Var3)) {
                        return;
                    }
                    if (unsafe4.getObjectVolatile(this, j2) != objectVolatile) {
                        break;
                    } else {
                        zp0Var = zp0Var2;
                    }
                }
            } else {
                zp0Var2 = zp0Var;
                if ((objectVolatile instanceof si) || (objectVolatile instanceof w01)) {
                    A(zp0Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof on) {
                    on onVar = (on) objectVolatile;
                    if (!on.b.compareAndSet(onVar, 0, 1)) {
                        A(zp0Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof cj) {
                        Throwable th = onVar.a;
                        if (zp0Var2 instanceof si) {
                            l((si) zp0Var2, th);
                            return;
                        } else {
                            zp0Var2.getClass();
                            n((w01) zp0Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof mn) {
                    mn mnVar = (mn) objectVolatile;
                    if (mnVar.b != null) {
                        A(zp0Var2, objectVolatile);
                        throw null;
                    }
                    if (zp0Var2 instanceof w01) {
                        return;
                    }
                    zp0Var2.getClass();
                    si siVar = (si) zp0Var2;
                    Throwable th2 = mnVar.e;
                    if (th2 != null) {
                        l(siVar, th2);
                        return;
                    }
                    mn mnVarA = mn.a(mnVar, siVar, null, 29);
                    do {
                        unsafe2 = yi.a;
                        if (unsafe2.compareAndSwapObject(this, l, objectVolatile, mnVarA)) {
                            return;
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
                } else {
                    if (zp0Var2 instanceof w01) {
                        return;
                    }
                    zp0Var2.getClass();
                    mn mnVar2 = new mn(objectVolatile, (si) zp0Var2, (e60) null, (Throwable) null, 28);
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, l, objectVolatile, mnVar2)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
                }
            }
            zp0Var = zp0Var2;
        }
    }

    public final boolean z() {
        return this.e == 2 && ((pu) this.f).o();
    }
}
