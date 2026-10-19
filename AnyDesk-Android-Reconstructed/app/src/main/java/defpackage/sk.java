package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class sk extends w01 {
    public final sh g;
    public final /* synthetic */ AtomicReferenceArray h;

    public sk(long j, sk skVar, sh shVar, int i) {
        super(j, skVar, i);
        this.g = shVar;
        this.h = new AtomicReferenceArray(uh.b * 2);
    }

    @Override // defpackage.w01
    public final int k() {
        return uh.b;
    }

    @Override // defpackage.w01
    public final void l(int i, br brVar) {
        sh shVar;
        int i2 = uh.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objP = p(i);
            boolean z2 = objP instanceof bg1;
            shVar = this.g;
            if (z2 || (objP instanceof cg1)) {
                if (o(objP, i, z ? uh.j : uh.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        shVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objP == uh.j || objP == uh.k) {
                    break;
                }
                if (objP != uh.g && objP != uh.f) {
                    if (objP == uh.i || objP == uh.d || objP == uh.l) {
                        return;
                    }
                    id.s(objP, "unexpected state: ");
                    return;
                }
            }
        }
        r(i, null);
        if (z) {
            shVar.getClass();
        }
    }

    public final boolean o(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            sh shVar = this.g;
            shVar.getClass();
            shVar.M((this.e * ((long) uh.b)) + ((long) i));
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
