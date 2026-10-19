package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class wd0 implements pd0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(wd0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = yi.a;
        f = unsafe.objectFieldOffset(wd0.class.getDeclaredField("_state$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(wd0.class, Object.class, "_parentHandle$volatile");
        e = unsafe.objectFieldOffset(wd0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public wd0(boolean z) {
        this._state$volatile = z ? ds.i : ds.h;
    }

    public static nl S(qh0 qh0Var) {
        while (qh0Var.n()) {
            qh0Var = qh0Var.m();
        }
        while (true) {
            qh0Var = qh0Var.l();
            if (!qh0Var.n()) {
                if (qh0Var instanceof nl) {
                    return (nl) qh0Var;
                }
                if (qh0Var instanceof vp0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof vd0)) {
            if (obj instanceof a90) {
                return ((a90) obj).a() ? "Active" : "New";
            }
            return obj instanceof on ? "Cancelled" : "Completed";
        }
        vd0 vd0Var = (vd0) obj;
        if (vd0Var.f()) {
            return "Cancelling";
        }
        return vd0.d.get(vd0Var) == 1 ? "Completing" : "Active";
    }

    public boolean A(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return w(th) && F();
    }

    public final void B(a90 a90Var, Object obj) {
        ml mlVarI = I();
        if (mlVarI != null) {
            mlVarI.b();
            Z(xp0.c);
        }
        pn pnVar = null;
        on onVar = obj instanceof on ? (on) obj : null;
        Throwable th = onVar != null ? onVar.a : null;
        if (a90Var instanceof td0) {
            try {
                ((td0) a90Var).s(th);
                return;
            } catch (Throwable th2) {
                L(new pn("Exception in completion handler " + a90Var + " for " + this, th2));
                return;
            }
        }
        vp0 vp0VarD = a90Var.d();
        if (vp0VarD != null) {
            vp0VarD.e(new ag0(1), 1);
            Object objK = vp0VarD.k();
            objK.getClass();
            for (qh0 qh0VarL = (qh0) objK; !qh0VarL.equals(vp0VarD); qh0VarL = qh0VarL.l()) {
                if (qh0VarL instanceof td0) {
                    try {
                        ((td0) qh0VarL).s(th);
                    } catch (Throwable th3) {
                        if (pnVar != null) {
                            th1.a(pnVar, th3);
                        } else {
                            pnVar = new pn("Exception in completion handler " + qh0VarL + " for " + this, th3);
                        }
                    }
                }
            }
            if (pnVar != null) {
                L(pnVar);
            }
        }
    }

    public final Throwable C(Object obj) {
        Throwable thE;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        wd0 wd0Var = (wd0) obj;
        Object objJ = wd0Var.J();
        if (objJ instanceof vd0) {
            thE = ((vd0) objJ).e();
        } else if (objJ instanceof on) {
            thE = ((on) objJ).a;
        } else {
            if (objJ instanceof a90) {
                id.s(objJ, "Cannot be cancelling child in this state: ");
                return null;
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        return cancellationException == null ? new qd0("Parent job is ".concat(b0(objJ)), thE, wd0Var) : cancellationException;
    }

    public final Object D(vd0 vd0Var, Object obj) throws Throwable {
        Throwable th;
        vd0 vd0Var2;
        on onVar = obj instanceof on ? (on) obj : null;
        Throwable th2 = onVar != null ? onVar.a : null;
        synchronized (vd0Var) {
            try {
                vd0Var.f();
                ArrayList arrayListG = vd0Var.g(th2);
                Throwable thE = E(vd0Var, arrayListG);
                if (thE != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListG.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thE && th3 != thE && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    th1.a(thE, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thE != null && thE != th2) {
                    obj = new on(thE, false);
                }
                if (thE != null && (y(thE) || K(thE))) {
                    obj.getClass();
                    on.b.compareAndSet((on) obj, 0, 1);
                }
                U(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                Object b90Var = obj instanceof a90 ? new b90((a90) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = yi.a;
                    long j = f;
                    vd0Var2 = vd0Var;
                    if (unsafe.compareAndSwapObject(this, j, vd0Var2, b90Var) || unsafe.getObjectVolatile(this, j) != vd0Var2) {
                        break;
                    }
                    vd0Var = vd0Var2;
                }
                B(vd0Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Throwable E(vd0 vd0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (vd0Var.f()) {
                return new qd0(z(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof ba1) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof ba1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean F() {
        return true;
    }

    public boolean G() {
        return this instanceof ln;
    }

    public final vp0 H(a90 a90Var) {
        vp0 vp0VarD = a90Var.d();
        if (vp0VarD != null) {
            return vp0VarD;
        }
        if (a90Var instanceof ix) {
            return new vp0();
        }
        if (a90Var instanceof td0) {
            X((td0) a90Var);
            return null;
        }
        id.s(a90Var, "State should have list: ");
        return null;
    }

    public final ml I() {
        d.getClass();
        return (ml) yi.a.getObjectVolatile(this, e);
    }

    public final Object J() {
        c.getClass();
        return yi.a.getObjectVolatile(this, f);
    }

    public boolean K(Throwable th) {
        return false;
    }

    public final void M(pd0 pd0Var) {
        xp0 xp0Var = xp0.c;
        if (pd0Var == null) {
            Z(xp0Var);
            return;
        }
        pd0Var.start();
        ml mlVarI = pd0Var.i(this);
        Z(mlVarI);
        if (J() instanceof a90) {
            return;
        }
        mlVarI.b();
        Z(xp0Var);
    }

    public final uu N(z50 z50Var) {
        return O(true, new da0(z50Var));
    }

    public final uu O(boolean z, td0 td0Var) {
        td0 td0Var2;
        boolean zE;
        td0Var.i = this;
        loop0: while (true) {
            Object objJ = J();
            if (!(objJ instanceof ix)) {
                td0Var2 = td0Var;
                boolean z2 = objJ instanceof a90;
                xp0 xp0Var = xp0.c;
                if (z2) {
                    a90 a90Var = (a90) objJ;
                    vp0 vp0VarD = a90Var.d();
                    if (vp0VarD == null) {
                        X((td0) objJ);
                    } else {
                        if (td0Var2.r()) {
                            vd0 vd0Var = a90Var instanceof vd0 ? (vd0) a90Var : null;
                            Throwable thE = vd0Var != null ? vd0Var.e() : null;
                            if (thE == null) {
                                zE = vp0VarD.e(td0Var2, 5);
                            } else if (z) {
                                td0Var2.s(thE);
                                return xp0Var;
                            }
                        } else {
                            zE = vp0VarD.e(td0Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    td0Var = td0Var2;
                } else if (z) {
                    Object objJ2 = J();
                    on onVar = objJ2 instanceof on ? (on) objJ2 : null;
                    td0Var2.s(onVar != null ? onVar.a : null);
                }
                return xp0Var;
            }
            ix ixVar = (ix) objJ;
            if (ixVar.c) {
                while (true) {
                    c.getClass();
                    Unsafe unsafe = yi.a;
                    long j = f;
                    td0Var2 = td0Var;
                    if (unsafe.compareAndSwapObject(this, j, objJ, td0Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(this, j) != objJ) {
                        break;
                    }
                    td0Var = td0Var2;
                }
            } else {
                td0Var2 = td0Var;
                W(ixVar);
            }
            td0Var = td0Var2;
        }
        return td0Var2;
    }

    public boolean P() {
        return false;
    }

    public final Object Q(Object obj) {
        Object objE0;
        do {
            objE0 = e0(J(), obj);
            if (objE0 == ds.c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                on onVar = obj instanceof on ? (on) obj : null;
                throw new IllegalStateException(str, onVar != null ? onVar.a : null);
            }
        } while (objE0 == ds.e);
        return objE0;
    }

    public String R() {
        return getClass().getSimpleName();
    }

    public final void T(vp0 vp0Var, Throwable th) {
        vp0Var.e(new ag0(4), 4);
        Object objK = vp0Var.k();
        objK.getClass();
        pn pnVar = null;
        for (qh0 qh0VarL = (qh0) objK; !qh0VarL.equals(vp0Var); qh0VarL = qh0VarL.l()) {
            if ((qh0VarL instanceof td0) && ((td0) qh0VarL).r()) {
                try {
                    ((td0) qh0VarL).s(th);
                } catch (Throwable th2) {
                    if (pnVar != null) {
                        th1.a(pnVar, th2);
                    } else {
                        pnVar = new pn("Exception in completion handler " + qh0VarL + " for " + this, th2);
                    }
                }
            }
        }
        if (pnVar != null) {
            L(pnVar);
        }
        y(th);
    }

    public final void W(ix ixVar) {
        vp0 vp0Var = new vp0();
        Object w80Var = ixVar.c ? vp0Var : new w80(vp0Var);
        while (true) {
            c.getClass();
            Unsafe unsafe = yi.a;
            long j = f;
            ix ixVar2 = ixVar;
            if (unsafe.compareAndSwapObject(this, j, ixVar2, w80Var) || unsafe.getObjectVolatile(this, j) != ixVar2) {
                return;
            } else {
                ixVar = ixVar2;
            }
        }
    }

    public final void X(td0 td0Var) {
        td0Var.g(new vp0());
        qh0 qh0VarL = td0Var.l();
        while (true) {
            c.getClass();
            Unsafe unsafe = yi.a;
            long j = f;
            td0 td0Var2 = td0Var;
            if (unsafe.compareAndSwapObject(this, j, td0Var2, qh0VarL) || unsafe.getObjectVolatile(this, j) != td0Var2) {
                return;
            } else {
                td0Var = td0Var2;
            }
        }
    }

    public final void Y(td0 td0Var) {
        Unsafe unsafe;
        long j;
        while (true) {
            Object objJ = J();
            if (!(objJ instanceof td0)) {
                if (!(objJ instanceof a90) || ((a90) objJ).d() == null) {
                    return;
                }
                td0Var.o();
                return;
            }
            if (objJ != td0Var) {
                return;
            }
            ix ixVar = ds.i;
            do {
                c.getClass();
                unsafe = yi.a;
                j = f;
                if (unsafe.compareAndSwapObject(this, j, objJ, ixVar)) {
                    return;
                }
            } while (unsafe.getObjectVolatile(this, j) == objJ);
        }
    }

    public final void Z(ml mlVar) {
        d.getClass();
        yi.a.putObjectVolatile(this, e, mlVar);
    }

    @Override // defpackage.pd0
    public boolean a() {
        Object objJ = J();
        return (objJ instanceof a90) && ((a90) objJ).a();
    }

    public final int a0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof ix;
        long j = f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (z) {
            if (((ix) obj).c) {
                return 0;
            }
            ix ixVar = ds.i;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = yi.a;
                if (unsafe2.compareAndSwapObject(this, f, obj, ixVar)) {
                    V();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof w80)) {
            return 0;
        }
        vp0 vp0Var = ((w80) obj).c;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = yi.a;
            if (unsafe.compareAndSwapObject(this, f, obj, vp0Var)) {
                V();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // defpackage.pd0, defpackage.fk
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new qd0(z(), null, this);
        }
        x(cancellationException);
    }

    public final boolean c0(a90 a90Var, Object obj) {
        Object b90Var = obj instanceof a90 ? new b90((a90) obj) : obj;
        while (true) {
            c.getClass();
            Unsafe unsafe = yi.a;
            long j = f;
            a90 a90Var2 = a90Var;
            if (unsafe.compareAndSwapObject(this, j, a90Var2, b90Var)) {
                U(obj);
                B(a90Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(this, j) != a90Var2) {
                return false;
            }
            a90Var = a90Var2;
        }
    }

    public final boolean d0(a90 a90Var, Throwable th) {
        vp0 vp0VarH = H(a90Var);
        if (vp0VarH == null) {
            return false;
        }
        vd0 vd0Var = new vd0(vp0VarH, th);
        while (true) {
            c.getClass();
            Unsafe unsafe = yi.a;
            long j = f;
            a90 a90Var2 = a90Var;
            if (unsafe.compareAndSwapObject(this, j, a90Var2, vd0Var)) {
                T(vp0VarH, th);
                return true;
            }
            if (unsafe.getObjectVolatile(this, j) != a90Var2) {
                return false;
            }
            a90Var = a90Var2;
        }
    }

    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof a90)) {
            return ds.c;
        }
        if (((obj instanceof ix) || (obj instanceof td0)) && !(obj instanceof nl) && !(obj2 instanceof on)) {
            return c0((a90) obj, obj2) ? obj2 : ds.e;
        }
        a90 a90Var = (a90) obj;
        vp0 vp0VarH = H(a90Var);
        if (vp0VarH == null) {
            return ds.e;
        }
        vd0 vd0Var = a90Var instanceof vd0 ? (vd0) a90Var : null;
        if (vd0Var == null) {
            vd0Var = new vd0(vp0VarH, null);
        }
        synchronized (vd0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd0.d;
            if (atomicIntegerFieldUpdater.get(vd0Var) == 1) {
                return ds.c;
            }
            atomicIntegerFieldUpdater.set(vd0Var, 1);
            if (vd0Var != a90Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, a90Var, vd0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != a90Var) {
                        return ds.e;
                    }
                }
            }
            boolean zF = vd0Var.f();
            on onVar = obj2 instanceof on ? (on) obj2 : null;
            if (onVar != null) {
                vd0Var.b(onVar.a);
            }
            Throwable thE = zF ? null : vd0Var.e();
            if (thE != null) {
                T(vp0VarH, thE);
            }
            nl nlVarS = S(vp0VarH);
            if (nlVarS != null && f0(vd0Var, nlVarS, obj2)) {
                return ds.d;
            }
            vp0VarH.e(new ag0(2), 2);
            nl nlVarS2 = S(vp0VarH);
            return (nlVarS2 == null || !f0(vd0Var, nlVarS2, obj2)) ? D(vd0Var, obj2) : ds.d;
        }
    }

    public final boolean f0(vd0 vd0Var, nl nlVar, Object obj) {
        while (y90.E(nlVar.j, false, new ud0(this, vd0Var, nlVar, obj)) == xp0.c) {
            nlVar = S(nlVar);
            if (nlVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zq
    public final ar getKey() {
        return fw.f;
    }

    @Override // defpackage.br
    public final Object h(Object obj, d60 d60Var) {
        return d60Var.f(obj, this);
    }

    @Override // defpackage.pd0
    public final ml i(wd0 wd0Var) {
        Unsafe unsafe;
        long j;
        nl nlVar = new nl(wd0Var);
        nlVar.i = this;
        loop0: while (true) {
            Object objJ = J();
            if (objJ instanceof ix) {
                ix ixVar = (ix) objJ;
                if (ixVar.c) {
                    do {
                        c.getClass();
                        unsafe = yi.a;
                        j = f;
                        if (unsafe.compareAndSwapObject(this, j, objJ, nlVar)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objJ);
                } else {
                    W(ixVar);
                }
            } else {
                boolean z = objJ instanceof a90;
                xp0 xp0Var = xp0.c;
                Throwable thE = null;
                if (!z) {
                    Object objJ2 = J();
                    on onVar = objJ2 instanceof on ? (on) objJ2 : null;
                    nlVar.s(onVar != null ? onVar.a : null);
                    return xp0Var;
                }
                vp0 vp0VarD = ((a90) objJ).d();
                if (vp0VarD != null) {
                    if (vp0VarD.e(nlVar, 7)) {
                        break;
                    }
                    boolean zE = vp0VarD.e(nlVar, 3);
                    Object objJ3 = J();
                    if (objJ3 instanceof vd0) {
                        thE = ((vd0) objJ3).e();
                    } else {
                        on onVar2 = objJ3 instanceof on ? (on) objJ3 : null;
                        if (onVar2 != null) {
                            thE = onVar2.a;
                        }
                    }
                    nlVar.s(thE);
                    if (zE) {
                        break;
                    }
                    return xp0Var;
                }
                X((td0) objJ);
            }
        }
        return nlVar;
    }

    @Override // defpackage.br
    public final br j(br brVar) {
        brVar.getClass();
        return brVar == kx.c ? this : (br) brVar.h(this, new hn(1));
    }

    @Override // defpackage.br
    public final zq l(ar arVar) {
        arVar.getClass();
        if (y90.e(fw.f, arVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.pd0
    public final uu m(boolean z, boolean z2, sd0 sd0Var) {
        return O(z2, z ? new ca0(sd0Var) : new da0(sd0Var));
    }

    @Override // defpackage.pd0
    public final CancellationException n() {
        CancellationException cancellationException;
        Object objJ = J();
        if (objJ instanceof vd0) {
            Throwable thE = ((vd0) objJ).e();
            if (thE == null) {
                id.s(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
            return cancellationException == null ? new qd0(strConcat, thE, this) : cancellationException;
        }
        if (objJ instanceof a90) {
            id.s(this, "Job is still new or active: ");
            return null;
        }
        if (!(objJ instanceof on)) {
            return new qd0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((on) objJ).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new qd0(z(), th, this) : cancellationException;
    }

    @Override // defpackage.br
    public final br q(ar arVar) {
        arVar.getClass();
        return y90.e(fw.f, arVar) ? kx.c : this;
    }

    @Override // defpackage.pd0
    public final Object s(sq sqVar) {
        Object objJ;
        uc1 uc1Var;
        do {
            objJ = J();
            boolean z = objJ instanceof a90;
            uc1Var = uc1.a;
            if (!z) {
                y90.n(sqVar.e());
                return uc1Var;
            }
        } while (a0(objJ) < 0);
        xi xiVar = new xi(1, ds.u(sqVar));
        xiVar.v();
        xiVar.y(new si(1, y90.E(this, true, new ty0(xiVar))));
        Object objS = xiVar.s();
        lr lrVar = lr.c;
        if (objS != lrVar) {
            objS = uc1Var;
        }
        return objS == lrVar ? objS : uc1Var;
    }

    @Override // defpackage.pd0
    public final boolean start() {
        int iA0;
        do {
            iA0 = a0(J());
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(R() + '{' + b0(J()) + '}');
        sb.append('@');
        sb.append(ds.s(this));
        return sb.toString();
    }

    public void v(Object obj) {
        u(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean w(Object obj) {
        Throwable thC;
        Object objJ;
        Throwable thE;
        bx bxVar;
        a90 a90Var;
        Object objE0;
        Object objE1 = ds.c;
        if (G()) {
            do {
                Object objJ2 = J();
                if (objJ2 instanceof a90) {
                    if (objJ2 instanceof vd0) {
                        if (vd0.d.get((vd0) objJ2) == 1) {
                        }
                    }
                    objE1 = e0(objJ2, new on(C(obj), false));
                }
                objE1 = ds.c;
                break;
            } while (objE1 == ds.e);
            if (objE1 != ds.d) {
                if (objE1 == ds.c) {
                    thC = null;
                    while (true) {
                        objJ = J();
                        if (objJ instanceof vd0) {
                            synchronized (objJ) {
                                if (((vd0) objJ).c() == ds.g) {
                                    bxVar = ds.f;
                                } else {
                                    boolean zF = ((vd0) objJ).f();
                                    if (thC == null) {
                                        thC = C(obj);
                                    }
                                    ((vd0) objJ).b(thC);
                                    thE = zF ? null : ((vd0) objJ).e();
                                    if (thE != null) {
                                        T(((vd0) objJ).c, thE);
                                    }
                                    bxVar = ds.c;
                                }
                            }
                        } else if (objJ instanceof a90) {
                            if (thC == null) {
                                thC = C(obj);
                            }
                            a90Var = (a90) objJ;
                            if (a90Var.a()) {
                                objE0 = e0(objJ, new on(thC, false));
                                if (objE0 != ds.c) {
                                    id.s(objJ, "Cannot happen in ");
                                    return false;
                                }
                                if (objE0 != ds.e) {
                                    objE1 = objE0;
                                    break;
                                }
                            } else if (d0(a90Var, thC)) {
                                bxVar = ds.c;
                            }
                        } else {
                            bxVar = ds.f;
                        }
                        objE1 = bxVar;
                        break;
                    }
                }
                if (objE1 != ds.c && objE1 != ds.d) {
                    if (objE1 == ds.f) {
                        return false;
                    }
                    u(objE1);
                    return true;
                }
            }
        } else {
            if (objE1 == ds.c) {
                thC = null;
                while (true) {
                    objJ = J();
                    if (objJ instanceof vd0) {
                        synchronized (objJ) {
                            if (((vd0) objJ).c() == ds.g) {
                                bxVar = ds.f;
                            } else {
                                boolean zF2 = ((vd0) objJ).f();
                                if (thC == null) {
                                    thC = C(obj);
                                }
                                ((vd0) objJ).b(thC);
                                if (zF2) {
                                }
                                if (thE != null) {
                                    T(((vd0) objJ).c, thE);
                                }
                                bxVar = ds.c;
                            }
                        }
                    } else if (objJ instanceof a90) {
                        if (thC == null) {
                            thC = C(obj);
                        }
                        a90Var = (a90) objJ;
                        if (a90Var.a()) {
                            objE0 = e0(objJ, new on(thC, false));
                            if (objE0 != ds.c) {
                                id.s(objJ, "Cannot happen in ");
                                return false;
                            }
                            if (objE0 != ds.e) {
                                objE1 = objE0;
                                break;
                            }
                        } else if (d0(a90Var, thC)) {
                            bxVar = ds.c;
                        }
                    } else {
                        bxVar = ds.f;
                    }
                    objE1 = bxVar;
                    break;
                }
            }
            if (objE1 != ds.c) {
                if (objE1 == ds.f) {
                    return false;
                }
                u(objE1);
                return true;
            }
        }
        return true;
    }

    public void x(CancellationException cancellationException) {
        w(cancellationException);
    }

    public final boolean y(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ml mlVarI = I();
        if (mlVarI == null || mlVarI == xp0.c) {
            return z;
        }
        return mlVarI.c(th) || z;
    }

    public String z() {
        return "Job was cancelled";
    }

    public void L(pn pnVar) {
        throw pnVar;
    }

    public void U(Object obj) {
    }

    public void u(Object obj) {
    }

    public void V() {
    }
}
