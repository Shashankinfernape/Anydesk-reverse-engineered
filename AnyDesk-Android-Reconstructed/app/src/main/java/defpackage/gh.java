package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class gh extends ve1 {
    public Executor b;
    public ec1 c;
    public bh d;
    public ah e;
    public y6 f;
    public bc g;
    public a h;
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public vm0 p;
    public vm0 q;
    public vm0 r;
    public vm0 s;
    public vm0 t;
    public vm0 v;
    public vm0 x;
    public vm0 y;
    public int j = 0;
    public boolean u = true;
    public int w = 0;

    public static void j(vm0 vm0Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            vm0Var.l(obj);
        } else {
            vm0Var.i(obj);
        }
    }

    public final int e() {
        bh bhVar = this.d;
        if (bhVar == null) {
            return 0;
        }
        ah ahVar = this.e;
        int i = bhVar.b;
        if (i != 0) {
            return i;
        }
        int i2 = ahVar != null ? 15 : 255;
        return bhVar.a ? 32768 | i2 : i2;
    }

    public final void f(mg mgVar) {
        if (this.q == null) {
            this.q = new vm0();
        }
        j(this.q, mgVar);
    }

    public final void g(CharSequence charSequence) {
        if (this.y == null) {
            this.y = new vm0();
        }
        j(this.y, charSequence);
    }

    public final void h(int i) {
        if (this.x == null) {
            this.x = new vm0();
        }
        j(this.x, Integer.valueOf(i));
    }

    public final void i(boolean z) {
        if (this.t == null) {
            this.t = new vm0();
        }
        j(this.t, Boolean.valueOf(z));
    }
}
