package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ll extends td0 {
    public final xi j;

    public ll(xi xiVar) {
        this.j = xiVar;
    }

    @Override // defpackage.td0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.td0
    public final void s(Throwable th) throws ou {
        CancellationException cancellationExceptionN = q().n();
        xi xiVar = this.j;
        if (!xiVar.z() ? false : ((pu) xiVar.f).p(cancellationExceptionN)) {
            return;
        }
        xiVar.o(cancellationExceptionN);
        if (xiVar.z()) {
            return;
        }
        xiVar.p();
    }
}
