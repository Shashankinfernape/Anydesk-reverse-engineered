package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class vd0 implements a90 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(vd0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(vd0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final vp0 c;

    static {
        Unsafe unsafe = yi.a;
        h = unsafe.objectFieldOffset(vd0.class.getDeclaredField("_rootCause$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(vd0.class, Object.class, "_exceptionsHolder$volatile");
        g = unsafe.objectFieldOffset(vd0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public vd0(vp0 vp0Var, Throwable th) {
        this.c = vp0Var;
        this._rootCause$volatile = th;
    }

    @Override // defpackage.a90
    public final boolean a() {
        return e() == null;
    }

    public final void b(Throwable th) {
        Throwable thE = e();
        if (thE == null) {
            i(th);
            return;
        }
        if (th == thE) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            h(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                id.s(objC, "State is ");
                return;
            }
        }
        if (th == objC) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objC);
        arrayList.add(th);
        h(arrayList);
    }

    public final Object c() {
        f.getClass();
        return yi.a.getObjectVolatile(this, g);
    }

    @Override // defpackage.a90
    public final vp0 d() {
        return this.c;
    }

    public final Throwable e() {
        e.getClass();
        return (Throwable) yi.a.getObjectVolatile(this, h);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object objC = c();
        if (objC == null) {
            arrayList = new ArrayList(4);
        } else if (objC instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objC);
            arrayList = arrayList2;
        } else {
            if (!(objC instanceof ArrayList)) {
                id.s(objC, "State is ");
                return null;
            }
            arrayList = (ArrayList) objC;
        }
        Throwable thE = e();
        if (thE != null) {
            arrayList.add(0, thE);
        }
        if (th != null && !th.equals(thE)) {
            arrayList.add(th);
        }
        h(ds.g);
        return arrayList;
    }

    public final void h(Object obj) {
        f.getClass();
        yi.a.putObjectVolatile(this, g, obj);
    }

    public final void i(Throwable th) {
        e.getClass();
        yi.a.putObjectVolatile(this, h, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(d.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
