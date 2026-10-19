package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nk0 extends vm0 {
    public final vz0 l;

    public nk0() {
        this.l = new vz0();
    }

    @Override // defpackage.vm0
    public void g() {
        Iterator it = this.l.iterator();
        while (true) {
            rz0 rz0Var = (rz0) it;
            if (!rz0Var.hasNext()) {
                return;
            } else {
                ((mk0) ((Map.Entry) rz0Var.next()).getValue()).a();
            }
        }
    }

    @Override // defpackage.vm0
    public void h() {
        Iterator it = this.l.iterator();
        while (true) {
            rz0 rz0Var = (rz0) it;
            if (!rz0Var.hasNext()) {
                return;
            }
            mk0 mk0Var = (mk0) ((Map.Entry) rz0Var.next()).getValue();
            mk0Var.c.j(mk0Var);
        }
    }

    public final void m(vm0 vm0Var, e50 e50Var) {
        Object obj;
        if (vm0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        mk0 mk0Var = new mk0(vm0Var, e50Var);
        vz0 vz0Var = this.l;
        sz0 sz0VarA = vz0Var.a(vm0Var);
        if (sz0VarA != null) {
            obj = sz0VarA.d;
        } else {
            sz0 sz0Var = new sz0(vm0Var, mk0Var);
            vz0Var.f++;
            sz0 sz0Var2 = vz0Var.d;
            if (sz0Var2 == null) {
                vz0Var.c = sz0Var;
                vz0Var.d = sz0Var;
            } else {
                sz0Var2.e = sz0Var;
                sz0Var.f = sz0Var2;
                vz0Var.d = sz0Var;
            }
            obj = null;
        }
        mk0 mk0Var2 = (mk0) obj;
        if (mk0Var2 != null && mk0Var2.d != e50Var) {
            id.q("This source was already added with the different observer");
        } else if (mk0Var2 == null && this.c > 0) {
            mk0Var.a();
        }
    }

    public nk0(Object obj) {
        super(obj);
        this.l = new vz0();
    }
}
