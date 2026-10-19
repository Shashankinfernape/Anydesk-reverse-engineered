package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class bi extends f81 implements d60 {
    public final /* synthetic */ int g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(tm0 tm0Var, rq rqVar) {
        super(2, rqVar);
        this.g = 2;
        this.h = tm0Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                return ((bi) j((rq) obj2, (d90) obj)).m(uc1Var);
            case 1:
                ((bi) j((rq) obj2, (wr0) obj)).m(uc1Var);
                return uc1Var;
            default:
                ((bi) j((rq) obj2, (v10) obj)).m(uc1Var);
                return uc1Var;
        }
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        switch (this.g) {
            case 0:
                bi biVar = new bi(2, rqVar, 0);
                biVar.h = obj;
                return biVar;
            case 1:
                bi biVar2 = new bi(2, rqVar, 1);
                biVar2.h = obj;
                return biVar2;
            default:
                return new bi((tm0) this.h, rqVar);
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        boolean z = false;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                y90.V(obj);
                return Boolean.valueOf(((d90) this.h) != null);
            case 1:
                y90.V(obj);
                wr0 wr0Var = (wr0) this.h;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    z = true;
                }
                if (z) {
                    Log.v("Paging", "Sent " + wr0Var, null);
                }
                return uc1Var;
            default:
                y90.V(obj);
                ((tm0) this.h).getClass();
                return uc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi(int i, rq rqVar, int i2) {
        super(i, rqVar);
        this.g = i2;
    }
}
