package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y10 implements v10 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public y10(v10 v10Var, br brVar) {
        this.c = 2;
        this.d = brVar;
        this.f = uj.H(brVar);
        this.e = new ih(v10Var, (rq) null, 14);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        x10 x10Var;
        mx0 mx0Var;
        mx0 mx0Var2;
        y10 y10Var;
        v10 v10Var;
        Object obj2;
        a20 a20Var;
        mx0 mx0Var3;
        y10 y10Var2;
        int i = this.c;
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        Object obj3 = this.f;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                if (rqVar instanceof x10) {
                    x10Var = (x10) rqVar;
                    int i2 = x10Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        x10Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        x10Var = new x10(this, rqVar);
                    }
                } else {
                    x10Var = new x10(this, rqVar);
                }
                Object obj5 = x10Var.h;
                int i3 = x10Var.j;
                if (i3 == 0) {
                    y90.V(obj5);
                    mx0Var = (mx0) obj4;
                    Object obj6 = mx0Var.c;
                    if (obj6 == uj.c) {
                        y10Var = this;
                        mx0Var.c = obj;
                        v10Var = (v10) y10Var.e;
                        obj2 = ((mx0) y10Var.d).c;
                        x10Var.f = null;
                        x10Var.g = null;
                        x10Var.j = 2;
                        if (v10Var.i(obj2, x10Var) != lrVar) {
                            return uc1Var;
                        }
                    } else {
                        x10Var.f = this;
                        x10Var.g = mx0Var;
                        x10Var.j = 1;
                        Object objC = ((e60) obj3).c(obj6, obj, x10Var);
                        if (objC != lrVar) {
                            obj5 = objC;
                            mx0Var2 = mx0Var;
                            y10Var = this;
                        }
                    }
                    return lrVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        y90.V(obj5);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mx0Var2 = x10Var.g;
                y10Var = x10Var.f;
                y90.V(obj5);
                Object obj7 = obj5;
                mx0Var = mx0Var2;
                obj = obj7;
                mx0Var.c = obj;
                v10Var = (v10) y10Var.e;
                obj2 = ((mx0) y10Var.d).c;
                x10Var.f = null;
                x10Var.g = null;
                x10Var.j = 2;
                if (v10Var.i(obj2, x10Var) != lrVar) {
                    return uc1Var;
                }
                return lrVar;
            case 1:
                if (rqVar instanceof a20) {
                    a20Var = (a20) rqVar;
                    int i4 = a20Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        a20Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        a20Var = new a20(this, rqVar);
                    }
                } else {
                    a20Var = new a20(this, rqVar);
                }
                Object obj8 = a20Var.h;
                int i5 = a20Var.j;
                if (i5 == 0) {
                    y90.V(obj8);
                    mx0 mx0Var4 = (mx0) obj4;
                    Object obj9 = mx0Var4.c;
                    a20Var.f = this;
                    a20Var.g = mx0Var4;
                    a20Var.j = 1;
                    Object objC2 = ((ki) obj3).c(obj9, obj, a20Var);
                    if (objC2 != lrVar) {
                        obj8 = objC2;
                        mx0Var3 = mx0Var4;
                        y10Var2 = this;
                    }
                    return lrVar;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        y90.V(obj8);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mx0Var3 = a20Var.g;
                y10Var2 = a20Var.f;
                y90.V(obj8);
                mx0Var3.c = obj8;
                v10 v10Var2 = (v10) y10Var2.e;
                Object obj10 = ((mx0) y10Var2.d).c;
                a20Var.f = null;
                a20Var.g = null;
                a20Var.j = 2;
                if (v10Var2.i(obj10, a20Var) != lrVar) {
                    return uc1Var;
                }
                return lrVar;
            default:
                Object objP = r71.P((br) obj4, obj, obj3, (ih) this.e, rqVar);
                return objP == lrVar ? objP : uc1Var;
        }
    }

    public /* synthetic */ y10(mx0 mx0Var, e60 e60Var, v10 v10Var, int i) {
        this.c = i;
        this.d = mx0Var;
        this.f = e60Var;
        this.e = v10Var;
    }
}
