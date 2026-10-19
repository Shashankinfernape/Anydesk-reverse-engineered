package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends f81 implements d60 {
    public int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ u1 i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(long j, u1 u1Var, boolean z, rq rqVar) {
        super(2, rqVar);
        this.h = j;
        this.i = u1Var;
        this.j = z;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((r1) j((rq) obj2, (kr) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        return new r1(this.h, this.i, this.j, rqVar);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        v1 v1Var;
        Long lValueOf;
        Long l;
        int i = this.g;
        uc1 uc1Var = uc1.a;
        if (i == 0) {
            y90.V(obj);
            this.g = 1;
            Object objI = bu0.i(bu0.M(this.h), this);
            lr lrVar = lr.c;
            if (objI != lrVar) {
                objI = uc1Var;
            }
            if (objI == lrVar) {
                return lrVar;
            }
        } else {
            if (i != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y90.V(obj);
        }
        u1 u1Var = this.i;
        e71 e71Var = u1Var.d;
        do {
            v1Var = (v1) e71Var.getValue();
            if (this.j) {
                long jP2 = JniAdExt.P2();
                lValueOf = Long.valueOf(jP2);
                if (jP2 == 0) {
                    lValueOf = null;
                }
            } else {
                lValueOf = v1Var.a;
            }
            l = lValueOf;
            boolean z = v1Var.g;
        } while (!e71Var.g(v1Var, v1.a(v1Var, l, false, null, null, null, false, true, false, null, null, 958)));
        h1 h1Var = u1Var.f;
        if (h1Var != null) {
            h1Var.c();
        }
        return uc1Var;
    }
}
