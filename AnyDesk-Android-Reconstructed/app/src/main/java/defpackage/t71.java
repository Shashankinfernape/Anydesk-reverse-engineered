package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t71 implements v10 {
    public final v10 c;
    public final af d;

    public t71(v10 v10Var, af afVar) {
        this.c = v10Var;
        this.d = afVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sq] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public final Object a(sq sqVar) {
        s71 s71Var;
        nz0 nz0Var;
        t71 t71Var;
        if (sqVar instanceof s71) {
            s71Var = (s71) sqVar;
            int i = s71Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                s71Var.j = i - Integer.MIN_VALUE;
            } else {
                s71Var = new s71(this, sqVar);
            }
        } else {
            s71Var = new s71(this, sqVar);
        }
        Object obj = s71Var.h;
        ?? r1 = s71Var.j;
        uc1 uc1Var = uc1.a;
        lr lrVar = lr.c;
        try {
            if (r1 == 0) {
                y90.V(obj);
                br brVar = s71Var.d;
                brVar.getClass();
                nz0Var = new nz0(this.c, brVar);
                af afVar = this.d;
                s71Var.f = this;
                s71Var.g = nz0Var;
                s71Var.j = 1;
                if (afVar.f(nz0Var, s71Var) != lrVar) {
                    t71Var = this;
                }
                return lrVar;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    y90.V(obj);
                    return uc1Var;
                }
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nz0Var = s71Var.g;
            t71Var = s71Var.f;
            y90.V(obj);
            nz0Var.n();
            v10 v10Var = t71Var.c;
            r1 = v10Var instanceof t71;
            if (r1 != 0) {
                s71Var.f = null;
                s71Var.g = null;
                s71Var.j = 2;
                if (((t71) v10Var).a(s71Var) == lrVar) {
                    return lrVar;
                }
            }
            return uc1Var;
        } catch (Throwable th) {
            r1.n();
            throw th;
        }
    }

    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        return this.c.i(obj, rqVar);
    }
}
