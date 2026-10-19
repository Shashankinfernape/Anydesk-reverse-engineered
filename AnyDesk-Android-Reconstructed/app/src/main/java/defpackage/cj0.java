package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 {
    public int a;
    public int b;
    public int c;
    public final vm0 d;
    public final vm0 e;
    public final vm0 f;
    public final vm0 g;
    public final xd h = new xd(0);
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public final SharedPreferences k;

    public cj0(SharedPreferences sharedPreferences) {
        int i;
        int[] iArrS;
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        this.k = sharedPreferences;
        synchronized (this) {
            Looper looper = t70.a;
            try {
                i = sharedPreferences.getInt("speed_dial_mode", 0);
                while (true) {
                    i3 = 1;
                    if (i2 >= length) {
                        i4 = 1;
                        break;
                    }
                    i4 = iArrS[i2];
                    if (q51.r(i4) == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable unused) {
                i = 0;
            }
            iArrS = q51.s(3);
            length = iArrS.length;
            i2 = 0;
            this.a = i4;
            try {
                i5 = this.k.getInt("speed_dial_category", 0);
            } catch (Throwable unused2) {
                i5 = 0;
            }
            for (int i6 : q51.s(4)) {
                if (q51.r(i6) == i5) {
                    i3 = i6;
                    break;
                }
            }
            this.b = i3;
            this.c = 8;
            this.d = new vm0(Boolean.FALSE);
            this.e = new vm0(-1);
            this.h.clear();
            this.i.clear();
            this.j.clear();
            this.f = new vm0(null);
            this.g = new vm0(new ArrayList());
        }
    }

    public final synchronized void a(int i) {
        this.j.remove(Integer.valueOf(i));
    }

    public final synchronized el b(int i) {
        return (el) this.j.get(Integer.valueOf(i));
    }

    public final vm0 c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        xd xdVar = this.h;
        vm0 vm0Var = (vm0) xdVar.get(numValueOf);
        if (vm0Var != null) {
            return vm0Var;
        }
        vm0 vm0Var2 = new vm0(0);
        xdVar.put(Integer.valueOf(i), vm0Var2);
        return vm0Var2;
    }

    public final synchronized int d() {
        return this.b;
    }

    public final synchronized int e() {
        return this.a;
    }

    public final synchronized int f(int i) {
        Integer num;
        num = (Integer) c(i).d();
        return num != null ? num.intValue() : 0;
    }

    public final synchronized void g(int i, gf0 gf0Var, mq0 mq0Var) {
        c(i).e(gf0Var, mq0Var);
    }

    public final synchronized void h(int i) {
        this.i.remove(Integer.valueOf(i));
    }

    public final synchronized void i(int i) {
        this.h.remove(Integer.valueOf(i));
    }

    public final synchronized void j(int i, MainFragment mainFragment) {
        c(i).k(mainFragment);
    }

    public final synchronized void k(int i, fl flVar) {
        this.i.put(Integer.valueOf(i), flVar);
    }

    public final synchronized void l(int i) {
        this.c = i;
    }

    public final synchronized void m(boolean z) {
        this.d.i(Boolean.valueOf(z));
    }

    public final synchronized void n(int i) {
        this.e.i(Integer.valueOf(i));
    }

    public final synchronized void o(int i) {
        this.b = i;
        t70.c0(this.k, "speed_dial_category", q51.r(i));
    }

    public final synchronized void p(int i) {
        this.a = i;
        t70.c0(this.k, "speed_dial_mode", q51.r(i));
    }

    public final synchronized void q(int i) {
        c(i).i(0);
    }
}
