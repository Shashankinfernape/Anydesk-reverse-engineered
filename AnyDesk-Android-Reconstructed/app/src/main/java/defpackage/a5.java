package defpackage;

import android.R;
import android.graphics.Color;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a5 {
    public static int f;
    public Object c;
    public Object d;
    public final Object e;

    public a5() {
        this.e = new xt0(20, this);
    }

    public static void j() {
        f++;
    }

    public void a() {
        c();
        f = 0;
        this.d = null;
        f(true);
    }

    public abstract p81 b(int i);

    public void c() {
        t81 t81Var = (t81) this.d;
        if (t81Var != null) {
            t81Var.b(false);
            ViewGroup viewGroup = t81Var.q;
            if (viewGroup != null) {
                try {
                    viewGroup.removeView(t81Var);
                } catch (Exception unused) {
                }
            }
            t81Var.q = null;
            t81Var.A = null;
            t81Var.C = null;
            t81Var.K = null;
            this.d = null;
        }
        this.c = null;
    }

    public boolean d() {
        return ((t81) this.d) != null;
    }

    public void e() {
        h5 h5Var = ((AccountRegistrationFragment) this.e).d0;
        if (h5Var == null) {
            return;
        }
        EnumSet enumSet = (EnumSet) this.c;
        synchronized (h5Var) {
            h5Var.n.removeAll(enumSet);
        }
        Iterator it = ((EnumSet) this.c).iterator();
        while (it.hasNext()) {
            ((AccountRegistrationFragment) this.e).U0((f5) it.next());
        }
    }

    public abstract void f(boolean z);

    public void g(qa qaVar) {
        this.c = qaVar;
        try {
            if (((t81) this.d) == null) {
                i();
            }
        } catch (Throwable unused) {
        }
    }

    public void i() {
        p81 p81VarB = b(f);
        if (p81VarB != null) {
            p81VarB.x = 1.0f;
            p81VarB.n = -1;
            p81VarB.o = -1;
            p81VarB.l = Integer.valueOf(Color.parseColor("#4488ff"));
            p81VarB.t = true;
            p81VarB.m = Integer.valueOf(Color.parseColor("#000000"));
            p81VarB.c = 0.8f;
            p81VarB.w = true;
        }
        qa qaVar = (qa) this.c;
        if (p81VarB == null || qaVar == null) {
            f = 0;
            this.d = null;
            f(false);
            return;
        }
        xt0 xt0Var = (xt0) this.e;
        int i = t81.q0;
        ViewGroup viewGroup = (ViewGroup) qaVar.getWindow().getDecorView();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content);
        t81 t81Var = new t81(qaVar, viewGroup2, p81VarB, xt0Var);
        viewGroup2.addView(t81Var, layoutParams);
        t81Var.setContentDescription("tutorial");
        this.d = t81Var;
    }

    public a5(AccountRegistrationFragment accountRegistrationFragment, EnumSet enumSet, Runnable runnable) {
        this.e = accountRegistrationFragment;
        this.c = enumSet;
        this.d = runnable;
    }
}
