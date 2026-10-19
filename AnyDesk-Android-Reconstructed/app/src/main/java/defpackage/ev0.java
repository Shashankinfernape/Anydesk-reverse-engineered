package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ev0 extends g2 implements fk, c11 {
    public final sh h;

    public ev0(br brVar, sh shVar) {
        super(brVar, true);
        this.h = shVar;
    }

    @Override // defpackage.wd0, defpackage.pd0, defpackage.fk
    public final void b(CancellationException cancellationException) {
        Object objJ = J();
        if (objJ instanceof on) {
            return;
        }
        if ((objJ instanceof vd0) && ((vd0) objJ).f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new qd0(z(), null, this);
        }
        x(cancellationException);
    }

    @Override // defpackage.c11
    public final Object c(rq rqVar, Object obj) {
        return this.h.c(rqVar, obj);
    }

    @Override // defpackage.g2
    public final void g0(Throwable th, boolean z) {
        if (this.h.h(th, false) || z) {
            return;
        }
        uj.s(this.g, th);
    }

    @Override // defpackage.g2
    public final void h0(Object obj) {
        this.h.f(null);
    }

    @Override // defpackage.fk
    public final ph iterator() {
        sh shVar = this.h;
        shVar.getClass();
        return new ph(shVar);
    }

    @Override // defpackage.fk
    public final Object o() {
        return this.h.o();
    }

    @Override // defpackage.c11
    public final Object p(Object obj) {
        return this.h.p(obj);
    }

    @Override // defpackage.fk
    public final Object r(gn gnVar) {
        sh shVar = this.h;
        shVar.getClass();
        return sh.D(shVar, gnVar);
    }

    @Override // defpackage.wd0
    public final void x(CancellationException cancellationException) {
        this.h.h(cancellationException, true);
        w(cancellationException);
    }
}
