package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class en implements v10 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ en(Object obj, int i, int i2) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        dn dnVar;
        es0 es0Var;
        int i = this.c;
        uc1 uc1Var = uc1.a;
        int i2 = this.d;
        Object obj2 = this.e;
        lr lrVar = lr.c;
        switch (i) {
            case 0:
                if (rqVar instanceof dn) {
                    dnVar = (dn) rqVar;
                    int i3 = dnVar.h;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dnVar.h = i3 - Integer.MIN_VALUE;
                    } else {
                        dnVar = new dn(this, rqVar);
                    }
                } else {
                    dnVar = new dn(this, rqVar);
                }
                Object obj3 = dnVar.f;
                int i4 = dnVar.h;
                if (i4 == 0) {
                    y90.V(obj3);
                    d90 d90Var = new d90(i2, obj);
                    dnVar.h = 1;
                    if (((sh) obj2).c(dnVar, d90Var) != lrVar) {
                    }
                    return lrVar;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        y90.V(obj3);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj3);
                dnVar.h = 2;
                if (lk0.O(dnVar) != lrVar) {
                    return uc1Var;
                }
                return lrVar;
            default:
                if (rqVar instanceof es0) {
                    es0Var = (es0) rqVar;
                    int i5 = es0Var.g;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        es0Var.g = i5 - Integer.MIN_VALUE;
                    } else {
                        es0Var = new es0(this, rqVar);
                    }
                } else {
                    es0Var = new es0(this, rqVar);
                }
                Object obj4 = es0Var.f;
                int i6 = es0Var.g;
                if (i6 == 0) {
                    y90.V(obj4);
                    t60 t60Var = new t60(i2, (vf1) obj);
                    es0Var.g = 1;
                    return ((v10) obj2).i(t60Var, es0Var) == lrVar ? lrVar : uc1Var;
                }
                if (i6 == 1) {
                    y90.V(obj4);
                    return uc1Var;
                }
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
