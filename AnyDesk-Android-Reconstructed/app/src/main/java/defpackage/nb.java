package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class nb {
    public Object a;
    public Object b;

    public nb(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new nv());
        }
    }

    public static float h(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void c();

    public void d() {
        mb mbVar = (mb) this.a;
        if (mbVar != null) {
            try {
                ((qb) this.b).m.unregisterReceiver(mbVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void e() {
        a61 a61Var = (a61) this.a;
        aj ajVar = (aj) this.b;
        LinkedHashSet linkedHashSet = a61Var.e;
        if (linkedHashSet.remove(ajVar) && linkedHashSet.isEmpty()) {
            a61Var.b();
        }
    }

    public abstract IntentFilter f();

    public abstract int g();

    public MenuItem i(MenuItem menuItem) {
        if (!(menuItem instanceof d81)) {
            return menuItem;
        }
        d81 d81Var = (d81) menuItem;
        if (((i51) this.b) == null) {
            this.b = new i51(0);
        }
        MenuItem menuItem2 = (MenuItem) ((i51) this.b).get(d81Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zk0 zk0Var = new zk0((Context) this.a, d81Var);
        ((i51) this.b).put(d81Var, zk0Var);
        return zk0Var;
    }

    public abstract void j();

    public boolean k() {
        a61 a61Var = (a61) this.a;
        View view = a61Var.c.H;
        view.getClass();
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    id.q(gr0.e(visibility, "Unknown visibility "));
                    return false;
                }
                i = 3;
            }
        }
        int i2 = a61Var.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    public abstract void l();

    public abstract void m(cg cgVar);

    public abstract void n();

    public void o() {
        d();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        if (((mb) this.a) == null) {
            this.a = new mb(0, this);
        }
        ((qb) this.b).m.registerReceiver((mb) this.a, intentFilterF);
    }

    public abstract void p();

    public abstract void q();

    public nb(Context context) {
        this.a = context;
    }

    public nb(a61 a61Var, aj ajVar) {
        this.a = a61Var;
        this.b = ajVar;
    }

    public nb(qb qbVar) {
        this.b = qbVar;
    }
}
