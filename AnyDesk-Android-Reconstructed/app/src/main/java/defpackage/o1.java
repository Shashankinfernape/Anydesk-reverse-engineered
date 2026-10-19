package defpackage;

import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends f81 implements d60 {
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ q1 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ RosterItemFilter k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, long j, RosterItemFilter rosterItemFilter, rq rqVar) {
        super(2, rqVar);
        this.i = q1Var;
        this.j = j;
        this.k = rosterItemFilter;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((o1) j((rq) obj2, (kr) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        o1 o1Var = new o1(this.i, this.j, this.k, rqVar);
        o1Var.h = obj;
        return o1Var;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        kr krVar = (kr) this.h;
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                y90.V(obj);
                return obj;
            }
            nh0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y90.V(obj);
        this.h = krVar;
        this.g = 1;
        xi xiVar = new xi(1, ds.u(this));
        xiVar.v();
        long j = this.j;
        RosterItemFilter rosterItemFilter = this.k;
        q1 q1Var = this.i;
        n1 n1Var = new n1(j, rosterItemFilter, q1Var, krVar, xiVar);
        Logging.f(7, q1Var.g.a, "REQ roster " + j + " filter " + rosterItemFilter);
        JniAdExt.q1(n1Var);
        JniAdExt.e4(j, rosterItemFilter);
        xiVar.x(new m1(n1Var));
        Object objS = xiVar.s();
        lr lrVar = lr.c;
        return objS == lrVar ? lrVar : objS;
    }
}
