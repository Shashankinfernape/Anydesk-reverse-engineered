package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends oy0 implements d60, m60 {
    public final int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(View view, rq rqVar) {
        super(rqVar);
        this.g = view;
        this.d = 2;
    }

    @Override // defpackage.m60
    public final int b() {
        return this.d;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((ue1) j((rq) obj2, (g11) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        ue1 ue1Var = new ue1(this.g, rqVar);
        ue1Var.f = obj;
        return ue1Var;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        Object obj2;
        int i = this.e;
        View view = this.g;
        lr lrVar = lr.c;
        if (i == 0) {
            y90.V(obj);
            g11 g11Var = (g11) this.f;
            this.f = g11Var;
            this.e = 1;
            g11Var.d = view;
            g11Var.c = 3;
            g11Var.f = this;
            return lrVar;
        }
        uc1 uc1Var = uc1.a;
        if (i != 1) {
            if (i == 2) {
                y90.V(obj);
                return uc1Var;
            }
            nh0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g11 g11Var2 = (g11) this.f;
        y90.V(obj);
        if (view instanceof ViewGroup) {
            this.f = null;
            this.e = 2;
            g11Var2.getClass();
            nb1 nb1Var = new nb1(new j2(3, (ViewGroup) view));
            if (nb1Var.d.hasNext()) {
                g11Var2.e = nb1Var;
                g11Var2.c = 2;
                g11Var2.f = this;
                obj2 = lrVar;
            } else {
                obj2 = uc1Var;
            }
            if (obj2 != lrVar) {
                obj2 = uc1Var;
            }
            if (obj2 == lrVar) {
                return lrVar;
            }
        }
        return uc1Var;
    }

    @Override // defpackage.ag
    public final String toString() {
        if (this.c != null) {
            return super.toString();
        }
        nx0.a.getClass();
        return ox0.a(this);
    }
}
