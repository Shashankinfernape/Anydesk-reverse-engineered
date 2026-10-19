package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ok extends hk {
    public final Iterable f;

    public ok(Iterable iterable, br brVar, int i, oh ohVar) {
        super(brVar, i, ohVar);
        this.f = iterable;
    }

    @Override // defpackage.hk
    public final Object d(ev0 ev0Var, ih ihVar) {
        e11 e11Var = new e11(ev0Var);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            th1.B(ev0Var, null, null, new ih((t10) it.next(), e11Var, null, 5), 3);
        }
        return uc1.a;
    }

    @Override // defpackage.hk
    public final hk e(br brVar, int i, oh ohVar) {
        return new ok(this.f, brVar, i, ohVar);
    }

    @Override // defpackage.hk
    public final fk g(kr krVar) {
        d60 ihVar = new ih(this, (rq) null, 3);
        sh shVarA = ec1.a(this.d, 4, oh.c);
        br brVarK = ec1.k(krVar.f(), this.c, true);
        us usVar = su.a;
        if (brVarK != usVar && brVarK.l(fw.d) == null) {
            brVarK = brVarK.j(usVar);
        }
        ev0 ev0Var = new ev0(brVarK, shVarA);
        ev0Var.i0(nr.c, ev0Var, ihVar);
        return ev0Var;
    }
}
