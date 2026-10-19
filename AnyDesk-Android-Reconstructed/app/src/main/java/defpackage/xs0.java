package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xs0 implements z50 {
    public boolean c = true;
    public final /* synthetic */ m0 d;

    public xs0(m0 m0Var) {
        this.d = m0Var;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        z50 z50Var;
        jn jnVar = (jn) obj;
        jnVar.getClass();
        if (this.c) {
            this.c = false;
        } else if (jnVar.d.a instanceof ug0) {
            m0 m0Var = this.d;
            if (m0Var.c == 3 && !m0Var.d) {
                m0Var.k(1);
            }
            cf cfVar = m0Var.e;
            cfVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = cfVar.j;
            copyOnWriteArrayList.remove(this);
            if (copyOnWriteArrayList.isEmpty() && (z50Var = (z50) cfVar.i.get()) != null) {
                xe xeVar = cfVar.g;
                xeVar.getClass();
                y6 y6Var = xeVar.e;
                y6Var.getClass();
                ((CopyOnWriteArrayList) y6Var.d).remove(z50Var);
            }
        }
        return uc1.a;
    }
}
