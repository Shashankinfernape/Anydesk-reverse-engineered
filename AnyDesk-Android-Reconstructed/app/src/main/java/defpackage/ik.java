package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik extends hk {
    public final t10 f;

    public ik(int i, oh ohVar, br brVar, t10 t10Var) {
        super(brVar, i, ohVar);
        this.f = t10Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[RETURN] */
    @Override // defpackage.hk, defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) {
        Object objA;
        int i = this.d;
        lr lrVar = lr.c;
        if (i == -3) {
            br brVarE = rqVar.e();
            Boolean bool = Boolean.FALSE;
            hn hnVar = new hn(2);
            br brVar = this.c;
            br brVarJ = !((Boolean) brVar.h(bool, hnVar)).booleanValue() ? brVarE.j(brVar) : ec1.k(brVarE, brVar, false);
            if (y90.e(brVarJ, brVarE)) {
                Object objH = h(v10Var, rqVar);
                if (objH == lrVar) {
                    return objH;
                }
            } else {
                fw fwVar = fw.d;
                if (y90.e(brVarJ.l(fwVar), brVarE.l(fwVar))) {
                    br brVarE2 = rqVar.e();
                    if (!(v10Var instanceof e11) && !(v10Var instanceof yp0)) {
                        v10Var = new y10(v10Var, brVarE2);
                    }
                    Object objP = r71.P(brVarJ, v10Var, uj.H(brVarJ), new ih(this, (rq) null, 4), rqVar);
                    if (objP == lrVar) {
                        return objP;
                    }
                } else {
                    objA = super.a(v10Var, rqVar);
                    if (objA == lrVar) {
                        return objA;
                    }
                }
            }
        } else {
            objA = super.a(v10Var, rqVar);
            if (objA == lrVar) {
                return objA;
            }
        }
        return uc1.a;
    }

    @Override // defpackage.hk
    public final Object d(ev0 ev0Var, ih ihVar) {
        Object objH = h(new e11(ev0Var), ihVar);
        return objH == lr.c ? objH : uc1.a;
    }

    public abstract Object h(v10 v10Var, rq rqVar);

    @Override // defpackage.hk
    public final String toString() {
        return this.f + " -> " + super.toString();
    }
}
