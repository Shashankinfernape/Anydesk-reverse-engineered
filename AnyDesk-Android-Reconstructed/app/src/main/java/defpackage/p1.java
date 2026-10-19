package defpackage;

import com.anydesk.anydeskandroid.RosterItemFilter;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends f81 implements d60 {
    public int g;
    public final /* synthetic */ q1 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ RosterItemFilter j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, long j, RosterItemFilter rosterItemFilter, rq rqVar) {
        super(2, rqVar);
        this.h = q1Var;
        this.i = j;
        this.j = rosterItemFilter;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((p1) j((rq) obj2, (kr) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        return new p1(this.h, this.i, this.j, rqVar);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        try {
            if (i == 0) {
                y90.V(obj);
                long j = q1.i;
                o1 o1Var = new o1(this.h, this.i, this.j, null);
                this.g = 1;
                obj = lk0.M(j, o1Var, this);
                lr lrVar = lr.c;
                if (obj == lrVar) {
                    return lrVar;
                }
            } else {
                if (i != 1) {
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
            }
            return (k1) obj;
        } catch (ba1 e) {
            return new i1(e);
        }
    }
}
