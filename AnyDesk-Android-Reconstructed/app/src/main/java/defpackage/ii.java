package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii implements v10 {
    public final /* synthetic */ int c;
    public final /* synthetic */ v10 d;

    public /* synthetic */ ii(v10 v10Var, int i) {
        this.c = i;
        this.d = v10Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        hi hiVar;
        ko koVar;
        w20 w20Var;
        int i = this.c;
        uc1 uc1Var = uc1.a;
        v10 v10Var = this.d;
        lr lrVar = lr.c;
        switch (i) {
            case 0:
                if (rqVar instanceof hi) {
                    hiVar = (hi) rqVar;
                    int i2 = hiVar.g;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hiVar.g = i2 - Integer.MIN_VALUE;
                    } else {
                        hiVar = new hi(this, rqVar);
                    }
                } else {
                    hiVar = new hi(this, rqVar);
                }
                Object obj2 = hiVar.f;
                int i3 = hiVar.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y90.V(obj2);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj2);
                tm0 tm0Var = (tm0) obj;
                g20 g20Var = new g20(new i20(new bi(tm0Var, null), (ji) tm0Var.b.e), new rm0(tm0Var, null));
                vs0 vs0Var = tm0Var.a;
                vs0 vs0Var2 = new vs0(g20Var, vs0Var.b, vs0Var.c, new sm0(0, tm0Var));
                hiVar.g = 1;
                return v10Var.i(vs0Var2, hiVar) == lrVar ? lrVar : uc1Var;
            case 1:
                if (rqVar instanceof ko) {
                    koVar = (ko) rqVar;
                    int i4 = koVar.g;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        koVar.g = i4 - Integer.MIN_VALUE;
                    } else {
                        koVar = new ko(this, rqVar);
                    }
                } else {
                    koVar = new ko(this, rqVar);
                }
                Object obj3 = koVar.f;
                int i5 = koVar.g;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y90.V(obj3);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj3);
                Object obj4 = ((st0) obj).d;
                if (obj4 == null) {
                    return uc1Var;
                }
                koVar.g = 1;
                return v10Var.i(obj4, koVar) == lrVar ? lrVar : uc1Var;
            default:
                if (rqVar instanceof w20) {
                    w20Var = (w20) rqVar;
                    int i6 = w20Var.g;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        w20Var.g = i6 - Integer.MIN_VALUE;
                    } else {
                        w20Var = new w20(this, rqVar);
                    }
                } else {
                    w20Var = new w20(this, rqVar);
                }
                Object obj5 = w20Var.f;
                int i7 = w20Var.g;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y90.V(obj5);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj5);
                if (obj == null) {
                    return uc1Var;
                }
                w20Var.g = 1;
                return v10Var.i(obj, w20Var) == lrVar ? lrVar : uc1Var;
        }
    }
}
