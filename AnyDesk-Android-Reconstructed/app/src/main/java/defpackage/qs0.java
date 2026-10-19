package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends f81 implements d60 {
    public final /* synthetic */ int g;
    public final /* synthetic */ rs0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs0(rs0 rs0Var, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.h = rs0Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        v10 v10Var = (v10) obj;
        rq rqVar = (rq) obj2;
        switch (i) {
            case 0:
                ((qs0) j(rqVar, v10Var)).m(uc1Var);
                break;
            default:
                ((qs0) j(rqVar, v10Var)).m(uc1Var);
                break;
        }
        return uc1Var;
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        switch (this.g) {
            case 0:
                return new qs0(this.h, rqVar, 0);
            default:
                return new qs0(this.h, rqVar, 1);
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        rs0 rs0Var = this.h;
        switch (i) {
            case 0:
                y90.V(obj);
                rs0Var.j.p(new Integer(rs0Var.h));
                break;
            default:
                y90.V(obj);
                rs0Var.i.p(new Integer(rs0Var.g));
                break;
        }
        return uc1Var;
    }
}
