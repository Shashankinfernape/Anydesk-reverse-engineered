package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lp {
    public static final float[] K = {0.5f, 1.0f, 2.0f, 4.0f, 10.0f};
    public static final CharSequence[] L = {"0.5", "1.0", "2.0", "4.0", "10.0"};
    public vm0 A;
    public vm0 B;
    public zl0 E;
    public final SharedPreferences F;
    public vm0 G;
    public int J;
    public long a;
    public long b;
    public boolean c;
    public long d;
    public boolean e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public ke0 l;
    public boolean m;
    public long n;
    public int o;
    public vl0[] p;
    public double q;
    public double r;
    public boolean s;
    public boolean t;
    public boolean u;
    public vm0 v;
    public vm0 w;
    public nk0 x;
    public nk0 y;
    public vm0 z;
    public final HashMap H = new HashMap();
    public final c I = new c(14, this);
    public final vm0 C = new vm0(Boolean.FALSE);
    public final Handler D = new Handler(Looper.getMainLooper());

    public lp(SharedPreferences sharedPreferences) {
        this.F = sharedPreferences;
        a();
    }

    public final synchronized void A(int i) {
        this.k = i;
    }

    public final synchronized void B(boolean z) {
        this.i = z;
    }

    public final synchronized void C(long j) {
        this.g = j;
    }

    public final synchronized void D(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i >= 5) {
            i = 4;
        }
        this.j = i;
    }

    public final synchronized void E(long j) {
        this.f = j;
    }

    public final synchronized void F(long j) {
        this.d = j;
    }

    public final synchronized void G(double d) {
        this.r = d;
        SharedPreferences sharedPreferences = this.F;
        Looper looper = t70.a;
        sharedPreferences.edit().putFloat("nubsi_pos_y", (float) d).commit();
    }

    public final synchronized void H(int i) {
        this.J = ec1.l(i);
    }

    public final synchronized void I(du0 du0Var, cu0 cu0Var) {
        this.H.put(du0Var, cu0Var);
    }

    public final synchronized void J(boolean z) {
        this.c = z;
    }

    public final synchronized void a() {
        this.a = 0L;
        this.b = 0L;
        this.c = true;
        this.d = 0L;
        this.e = false;
        this.f = 0L;
        this.g = 0L;
        this.h = false;
        this.i = false;
        this.j = 1;
        this.k = 0;
        this.m = true;
        this.J = 1;
        this.n = 0L;
        this.p = new vl0[0];
        this.o = 0;
        SharedPreferences sharedPreferences = this.F;
        Looper looper = t70.a;
        float f = 1.0f;
        try {
            f = sharedPreferences.getFloat("nubsi_pos_x", 1.0f);
        } catch (Throwable unused) {
        }
        this.q = f;
        float f2 = 0.5f;
        try {
            f2 = this.F.getFloat("nubsi_pos_y", 0.5f);
        } catch (Throwable unused2) {
        }
        this.r = f2;
        this.s = true;
        this.t = false;
        this.u = false;
        this.v = new vm0("");
        this.w = new vm0(new zl("", ""));
        vm0 vm0Var = JniAdExt.B0;
        this.x = th1.D(vm0Var, new a0(3));
        this.y = th1.D(vm0Var, new a0(4));
        Boolean bool = Boolean.FALSE;
        this.z = new vm0(bool);
        this.A = new vm0(bool);
        this.B = new vm0(bool);
        this.D.removeCallbacks(this.I);
        this.C.i(bool);
        this.E = null;
        this.G = new vm0();
        u();
        this.l = ke0.c;
    }

    public final synchronized int b() {
        return this.o;
    }

    public final synchronized long c() {
        return this.a;
    }

    public final synchronized ke0 d() {
        return this.l;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized vl0 f(int i) {
        vl0[] vl0VarArr = this.p;
        if (i < 0 || i >= vl0VarArr.length) {
            return null;
        }
        return vl0VarArr[i];
    }

    public final synchronized double g() {
        return this.r;
    }

    public final synchronized int h() {
        return this.k;
    }

    public final synchronized long i() {
        return this.g;
    }

    public final synchronized float j() {
        return K[this.j];
    }

    public final synchronized long k() {
        return this.f;
    }

    public final synchronized long l() {
        return this.d;
    }

    public final synchronized long m() {
        return this.n;
    }

    public final synchronized int n() {
        return this.J;
    }

    public final synchronized boolean o() {
        return this.u;
    }

    public final synchronized boolean p() {
        return this.t;
    }

    public final synchronized boolean q() {
        return this.i;
    }

    public final synchronized boolean r() {
        return this.m;
    }

    public final synchronized void s() {
        this.a = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 26) {
            t70.h(JniAdExt.d, "AnyDesk remote", JniAdExt.b);
        }
    }

    public final synchronized void t() {
        ArrayList arrayListZ2 = JniAdExt.z2();
        if (!arrayListZ2.isEmpty()) {
            zl0 zl0Var = (zl0) arrayListZ2.get(0);
            this.E = zl0Var;
            this.D.postDelayed(this.I, ((long) zl0Var.i) * 1000);
        }
    }

    public final synchronized void u() {
        for (du0 du0Var : du0.values()) {
            I(du0Var, null);
        }
    }

    public final synchronized void v(boolean z) {
        this.u = z;
    }

    public final synchronized void w(ke0 ke0Var) {
        this.l = ke0Var;
    }

    public final synchronized void x(long j) {
        this.b = j;
    }

    public final synchronized void y(boolean z) {
        this.s = z;
    }

    public final synchronized void z(boolean z) {
        this.e = z;
    }
}
