package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ue extends qe0 implements z50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue(int i, Object obj) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        int i = this.d;
        uc1 uc1Var = uc1.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                jn jnVar = (jn) obj;
                jnVar.getClass();
                cf cfVar = (cf) obj2;
                if (!((Boolean) cfVar.d.getValue()).booleanValue()) {
                    Iterator it = cfVar.j.iterator();
                    while (it.hasNext()) {
                        ((z50) it.next()).h(jnVar);
                    }
                } else {
                    Handler handler = (Handler) cfVar.l.getValue();
                    d3 d3Var = cfVar.m;
                    handler.removeCallbacks(d3Var);
                    ((AtomicReference) d3Var.e).set(jnVar);
                    handler.post(d3Var);
                }
                break;
            case 1:
                ((v41) ((gi) obj2).b).p(null);
                break;
            default:
                ((j51) obj2).c.h(null, false);
                break;
        }
        return uc1Var;
    }
}
