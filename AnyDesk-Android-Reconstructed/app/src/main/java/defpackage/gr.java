package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gr extends nk0 {
    public sb m;

    @Override // defpackage.nk0, defpackage.vm0
    public final void g() {
        super.g();
        sb sbVar = this.m;
        if (sbVar != null) {
            z61 z61Var = (z61) sbVar.f;
            rq rqVar = null;
            if (z61Var != null) {
                z61Var.b(null);
            }
            sbVar.f = null;
            if (((z61) sbVar.e) != null) {
                return;
            }
            sbVar.e = th1.B((pq) sbVar.c, null, null, new ih(sbVar, rqVar, 0), 3);
        }
    }

    @Override // defpackage.nk0, defpackage.vm0
    public final void h() {
        super.h();
        sb sbVar = this.m;
        if (sbVar != null) {
            if (((z61) sbVar.f) != null) {
                nh0.j("Cancel call cannot happen without a maybeRun");
                return;
            }
            pq pqVar = (pq) sbVar.c;
            us usVar = su.a;
            sbVar.f = th1.B(pqVar, li0.a.g, null, new hh(sbVar, null, 0), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void n(sq sqVar) {
        fr frVar;
        if (sqVar instanceof fr) {
            frVar = (fr) sqVar;
            int i = frVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                frVar.h = i - Integer.MIN_VALUE;
            } else {
                frVar = new fr(this, sqVar);
            }
        } else {
            frVar = new fr(this, sqVar);
        }
        Object obj = frVar.f;
        int i2 = frVar.h;
        if (i2 == 0 || i2 == 1) {
            y90.V(obj);
        } else {
            nh0.j("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
