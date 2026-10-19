package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends r71 {
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;

    public r2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.j = atomicReferenceFieldUpdater;
        this.k = atomicReferenceFieldUpdater2;
        this.l = atomicReferenceFieldUpdater3;
        this.m = atomicReferenceFieldUpdater4;
        this.n = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.r71
    public final void E(t2 t2Var, t2 t2Var2) {
        this.k.lazySet(t2Var, t2Var2);
    }

    @Override // defpackage.r71
    public final void F(t2 t2Var, Thread thread) {
        this.j.lazySet(t2Var, thread);
    }

    @Override // defpackage.r71
    public final boolean f(u2 u2Var, q2 q2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, q2Var, q2.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == q2Var);
        return false;
    }

    @Override // defpackage.r71
    public final boolean g(u2 u2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == obj);
        return false;
    }

    @Override // defpackage.r71
    public final boolean h(u2 u2Var, t2 t2Var, t2 t2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, t2Var, t2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == t2Var);
        return false;
    }
}
