package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class vm0 {
    public static final Object k = new Object();
    public final Object a;
    public final vz0 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final bc0 j;

    public vm0() {
        this.a = new Object();
        this.b = new vz0();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new bc0(6, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (md.K().L()) {
            return;
        }
        nh0.j(gr0.f("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(qg0 qg0Var) {
        if (qg0Var.d) {
            if (!qg0Var.k()) {
                qg0Var.b(false);
                return;
            }
            int i = qg0Var.e;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            qg0Var.e = i2;
            qg0Var.c.b(this.e);
        }
    }

    public final void c(qg0 qg0Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (qg0Var != null) {
                b(qg0Var);
                qg0Var = null;
            } else {
                vz0 vz0Var = this.b;
                vz0Var.getClass();
                tz0 tz0Var = new tz0(vz0Var);
                vz0Var.e.put(tz0Var, Boolean.FALSE);
                while (tz0Var.hasNext()) {
                    b((qg0) ((Map.Entry) tz0Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(gf0 gf0Var, mq0 mq0Var) {
        Object obj;
        a("observe");
        if (gf0Var.R().d == af0.c) {
            return;
        }
        pg0 pg0Var = new pg0(this, gf0Var, mq0Var);
        vz0 vz0Var = this.b;
        sz0 sz0VarA = vz0Var.a(mq0Var);
        if (sz0VarA != null) {
            obj = sz0VarA.d;
        } else {
            sz0 sz0Var = new sz0(mq0Var, pg0Var);
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
        qg0 qg0Var = (qg0) obj;
        if (qg0Var != null && !qg0Var.j(gf0Var)) {
            id.q("Cannot add the same observer with different lifecycles");
        } else {
            if (qg0Var != null) {
                return;
            }
            gf0Var.R().a(pg0Var);
        }
    }

    public final void f(mq0 mq0Var) {
        Object obj;
        a("observeForever");
        og0 og0Var = new og0(this, mq0Var);
        vz0 vz0Var = this.b;
        sz0 sz0VarA = vz0Var.a(mq0Var);
        if (sz0VarA != null) {
            obj = sz0VarA.d;
        } else {
            sz0 sz0Var = new sz0(mq0Var, og0Var);
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
        qg0 qg0Var = (qg0) obj;
        if (qg0Var instanceof pg0) {
            id.q("Cannot add the same observer with different lifecycles");
        } else {
            if (qg0Var != null) {
                return;
            }
            og0Var.b(true);
        }
    }

    public final void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            md.K().M(this.j);
        }
    }

    public final void j(mq0 mq0Var) {
        a("removeObserver");
        qg0 qg0Var = (qg0) this.b.b(mq0Var);
        if (qg0Var == null) {
            return;
        }
        qg0Var.f();
        qg0Var.b(false);
    }

    public final void k(c40 c40Var) {
        a("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            rz0 rz0Var = (rz0) it;
            if (!rz0Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) rz0Var.next();
            if (((qg0) entry.getValue()).j(c40Var)) {
                j((mq0) entry.getKey());
            }
        }
    }

    public void l(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public vm0(Object obj) {
        this.a = new Object();
        this.b = new vz0();
        this.c = 0;
        this.f = k;
        this.j = new bc0(6, this);
        this.e = obj;
        this.g = 0;
    }

    public void g() {
    }

    public void h() {
    }
}
