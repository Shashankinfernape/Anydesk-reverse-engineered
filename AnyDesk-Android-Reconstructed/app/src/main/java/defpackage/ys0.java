package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class ys0 extends iw0 {
    public boolean d;
    public final cf e;

    public ys0(k0 k0Var) {
        us usVar = su.a;
        o70 o70Var = li0.a;
        us usVar2 = su.a;
        o70Var.getClass();
        usVar2.getClass();
        this.e = new cf(k0Var, new af1(16, this), o70Var, usVar2);
        this.c = 3;
        this.a.g();
        m0 m0Var = (m0) this;
        this.a.registerObserver(new ws0(0, m0Var));
        i(new xs0(m0Var));
    }

    @Override // defpackage.iw0
    public final int a() {
        cf cfVar = this.e;
        ss0 ss0Var = (ss0) cfVar.f.get();
        return ss0Var != null ? ss0Var.e() : cfVar.g.d.e();
    }

    @Override // defpackage.iw0
    public final long b(int i) {
        return -1L;
    }

    public final void i(z50 z50Var) {
        cf cfVar = this.e;
        cfVar.getClass();
        AtomicReference atomicReference = cfVar.i;
        if (atomicReference.get() == null) {
            ue ueVar = cfVar.k;
            ueVar.getClass();
            atomicReference.set(ueVar);
            xe xeVar = cfVar.g;
            xeVar.getClass();
            y6 y6Var = xeVar.e;
            y6Var.getClass();
            ((CopyOnWriteArrayList) y6Var.d).add(ueVar);
            jn jnVar = (jn) ((e71) y6Var.e).getValue();
            if (jnVar != null) {
                ueVar.h(jnVar);
            }
        }
        cfVar.j.add(z50Var);
    }

    public final Object j(int i) {
        Object value;
        Object value2;
        Object value3;
        cf cfVar = this.e;
        e71 e71Var = cfVar.d;
        do {
            try {
                value2 = e71Var.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th) {
                do {
                    value = e71Var.getValue();
                    ((Boolean) value).getClass();
                } while (!e71Var.g(value, Boolean.FALSE));
                throw th;
            }
        } while (!e71Var.g(value2, Boolean.TRUE));
        cfVar.e = i;
        ss0 ss0Var = (ss0) cfVar.f.get();
        Object objB = ss0Var != null ? ds.b(ss0Var, i) : cfVar.g.b(i);
        do {
            value3 = e71Var.getValue();
            ((Boolean) value3).getClass();
        } while (!e71Var.g(value3, Boolean.FALSE));
        return objB;
    }

    public final void k(int i) {
        if (i == 0) {
            throw null;
        }
        this.d = true;
        this.c = i;
        this.a.g();
    }

    public final ea0 l() {
        cf cfVar = this.e;
        ss0 ss0Var = (ss0) cfVar.f.get();
        int i = 0;
        if (ss0Var != null) {
            int i2 = ss0Var.b - 1;
            ArrayList arrayList = new ArrayList();
            if (i2 >= 0) {
                while (true) {
                    arrayList.add(ss0Var.b(i));
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            return new ea0(arrayList, ss0Var.c, ss0Var.d);
        }
        ss0 ss0Var2 = cfVar.g.d;
        int i3 = ss0Var2.c;
        int i4 = ss0Var2.d;
        ArrayList arrayList2 = ss0Var2.a;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zm.d0(((mb1) obj).b, arrayList3);
        }
        return new ea0(arrayList3, i3, i4);
    }
}
