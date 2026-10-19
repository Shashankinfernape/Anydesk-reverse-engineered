package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v71 implements s41 {
    public final v41 c;
    public final af d;

    public v71(v41 v41Var, af afVar) {
        this.c = v41Var;
        this.d = afVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) {
        u71 u71Var;
        if (rqVar instanceof u71) {
            u71Var = (u71) rqVar;
            int i = u71Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                u71Var.h = i - Integer.MIN_VALUE;
            } else {
                u71Var = new u71(this, rqVar);
            }
        } else {
            u71Var = new u71(this, rqVar);
        }
        Object obj = u71Var.f;
        int i2 = u71Var.h;
        if (i2 != 0) {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y90.V(obj);
            throw new pn();
        }
        y90.V(obj);
        t71 t71Var = new t71(v10Var, this.d);
        u71Var.h = 1;
        this.c.a(t71Var, u71Var);
        return lr.c;
    }
}
