package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements t10 {
    public final /* synthetic */ i20 c;
    public final /* synthetic */ e60 d;

    public g20(i20 i20Var, e60 e60Var) {
        this.c = i20Var;
        this.d = e60Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) throws Throwable {
        f20 f20Var;
        g20 g20Var;
        aa1 aa1Var;
        e60 e60Var;
        nz0 nz0Var;
        Throwable th;
        nz0 nz0Var2;
        e60 e60Var2;
        if (rqVar instanceof f20) {
            f20Var = (f20) rqVar;
            int i = f20Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                f20Var.g = i - Integer.MIN_VALUE;
            } else {
                f20Var = new f20(this, rqVar);
            }
        } else {
            f20Var = new f20(this, rqVar);
        }
        Object obj = f20Var.f;
        int i2 = f20Var.g;
        lr lrVar = lr.c;
        if (i2 == 0) {
            y90.V(obj);
            try {
                i20 i20Var = this.c;
                f20Var.i = this;
                f20Var.j = v10Var;
                f20Var.g = 1;
                if (i20Var.a(v10Var, f20Var) != lrVar) {
                    g20Var = this;
                    br brVar = f20Var.d;
                    brVar.getClass();
                    nz0Var = new nz0(v10Var, brVar);
                    e60Var2 = g20Var.d;
                    f20Var.i = nz0Var;
                    f20Var.j = null;
                    f20Var.g = 3;
                    if (e60Var2.c(nz0Var, null, f20Var) != lrVar) {
                        nz0Var2 = nz0Var;
                        nz0Var2.n();
                        return uc1.a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                g20Var = this;
                aa1Var = new aa1(th);
                e60Var = g20Var.d;
                f20Var.i = th;
                f20Var.j = null;
                f20Var.g = 2;
                if (bu0.b(aa1Var, e60Var, th, f20Var) == lrVar) {
                    throw th;
                }
            }
            return lrVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) f20Var.i;
                y90.V(obj);
                throw th3;
            }
            if (i2 != 3) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nz0Var2 = (nz0) f20Var.i;
            try {
                y90.V(obj);
                nz0Var2.n();
                return uc1.a;
            } catch (Throwable th4) {
                th = th4;
                nz0Var2.n();
                throw th;
            }
        }
        v10Var = f20Var.j;
        g20Var = (g20) f20Var.i;
        try {
            y90.V(obj);
            br brVar2 = f20Var.d;
            brVar2.getClass();
            nz0Var = new nz0(v10Var, brVar2);
            try {
                e60Var2 = g20Var.d;
                f20Var.i = nz0Var;
                f20Var.j = null;
                f20Var.g = 3;
                if (e60Var2.c(nz0Var, null, f20Var) != lrVar) {
                    nz0Var2 = nz0Var;
                    nz0Var2.n();
                    return uc1.a;
                }
            } catch (Throwable th5) {
                th = th5;
                nz0Var2 = nz0Var;
                nz0Var2.n();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            aa1Var = new aa1(th);
            e60Var = g20Var.d;
            f20Var.i = th;
            f20Var.j = null;
            f20Var.g = 2;
            if (bu0.b(aa1Var, e60Var, th, f20Var) == lrVar) {
                throw th;
            }
        }
        return lrVar;
    }
}
