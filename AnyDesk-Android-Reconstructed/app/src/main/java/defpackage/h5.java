package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import com.anydesk.anydeskandroid.AdCountryCode;
import com.anydesk.jni.JniAdExt;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class h5 {
    public boolean A;
    public final SharedPreferences B;
    public int C;
    public int D;
    public t01 a;
    public t01 b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public EnumSet n;
    public EnumSet o;
    public f9 p = f9.d;
    public String q;
    public AdCountryCode r;
    public String s;
    public g5 t;
    public String u;
    public String v;
    public String w;
    public t01 x;
    public t01 y;
    public t01 z;

    public h5(SharedPreferences sharedPreferences) {
        this.B = sharedPreferences;
        Looper looper = t70.a;
        boolean z = false;
        try {
            z = sharedPreferences.getBoolean("anynet_account_login_ext_browser", false);
        } catch (Throwable unused) {
        }
        this.m = z;
        c();
    }

    public static void F(t01 t01Var) {
        if (t01Var != null) {
            t01Var.b();
        }
    }

    public static String i(int i, int i2) {
        if (i == 1) {
            if (i2 == 41) {
                return JniAdExt.n1("ad.account.er.orga.invalid");
            }
            if (i2 == 16) {
                return JniAdExt.n1("ad.account.er.timeout");
            }
            if (i2 == 1 || i2 == 35 || i2 == 31) {
                return null;
            }
        } else if (i == 0) {
            if (i2 == 2 || i2 == 4) {
                return JniAdExt.n1("ad.account.er.timeout");
            }
            if (i2 == 1) {
                return null;
            }
        }
        return String.format(JniAdExt.n1("ad.account.er.generic"), JniAdExt.M2(i, i2));
    }

    public final synchronized boolean A() {
        return this.n.size() > 0;
    }

    public final synchronized boolean B() {
        return this.f;
    }

    public final synchronized boolean C() {
        return this.e;
    }

    public final synchronized boolean D() {
        return this.k;
    }

    public final synchronized void E(f5 f5Var) {
        this.n.remove(f5Var);
    }

    public final synchronized void G(String str) {
        this.v = str;
    }

    public final synchronized void H(String str) {
        this.u = str;
    }

    public final synchronized void I(t01 t01Var) {
        F(this.a);
        this.a = t01Var;
    }

    public final synchronized void J(String str) {
        this.c = str;
    }

    public final synchronized void K(boolean z) {
        t70.b0(this.B, "anynet_account_login_ext_browser", z);
        this.m = z;
    }

    public final synchronized void L(t01 t01Var) {
        F(this.b);
        this.b = t01Var;
    }

    public final synchronized void M(boolean z) {
        this.e = z;
    }

    public final synchronized void N(boolean z) {
        this.d = z;
    }

    public final synchronized void O(String str) {
        this.i = str;
    }

    public final synchronized void P() {
    }

    public final synchronized void Q(String str) {
        this.h = str;
    }

    public final synchronized void R(String str) {
        this.g = str;
    }

    public final synchronized void S(String str) {
        this.s = str;
    }

    public final synchronized void T(t01 t01Var) {
        F(this.x);
        this.x = t01Var;
    }

    public final synchronized void U(t01 t01Var) {
        F(this.y);
        this.y = t01Var;
    }

    public final synchronized void V(t01 t01Var) {
        F(this.z);
        this.z = t01Var;
    }

    public final synchronized void W(boolean z) {
        this.A = z;
    }

    public final synchronized void X(boolean z) {
        this.l = z;
    }

    public final synchronized void Y(boolean z) {
        this.k = z;
    }

    public final synchronized void Z(String str) {
        this.j = str;
    }

    public final synchronized void a(e5 e5Var) {
        this.o.add(e5Var);
    }

    public final synchronized void a0(String str) {
        this.w = str;
    }

    public final synchronized void b(f5 f5Var) {
        this.n.add(f5Var);
    }

    public final synchronized void b0(int i) {
        this.D = i;
    }

    public final synchronized void c() {
        d();
        e();
    }

    public final synchronized void d() {
        F(this.a);
        F(this.b);
        this.a = JniAdExt.F1();
        this.b = t01.e;
        this.c = null;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
        this.C = 1;
        this.j = null;
        this.k = false;
        this.l = false;
        this.D = 1;
    }

    public final synchronized void e() {
        g();
        this.n = EnumSet.noneOf(f5.class);
        this.o = EnumSet.noneOf(e5.class);
        this.A = false;
    }

    public final synchronized void f() {
        this.n.clear();
    }

    public final synchronized void g() {
        F(this.x);
        F(this.y);
        F(this.z);
        this.p = f9.d;
        this.q = "";
        this.r = new AdCountryCode(0, "", JniAdExt.n1("ad.account.register.select"));
        this.s = "";
        this.t = g5.NONE;
        this.u = "";
        this.v = "";
        this.w = "";
        t01 t01Var = t01.e;
        this.x = t01Var;
        this.y = t01Var;
        this.z = t01Var;
    }

    public final synchronized void h() {
        this.D = 1;
    }

    public final synchronized AdCountryCode j() {
        return this.r;
    }

    public final synchronized String k() {
        return this.v;
    }

    public final synchronized String l() {
        return this.u;
    }

    public final synchronized t01 m() {
        return this.b;
    }

    public final synchronized String n() {
        return this.i;
    }

    public final synchronized String o() {
        return this.g;
    }

    public final synchronized String p() {
        return this.s;
    }

    public final synchronized f9 q() {
        return this.p;
    }

    public final synchronized t01 r() {
        return this.x;
    }

    public final synchronized t01 s() {
        return this.y;
    }

    public final synchronized t01 t() {
        return this.z;
    }

    public final synchronized int u() {
        return this.C;
    }

    public final synchronized String v() {
        return this.j;
    }

    public final synchronized String w() {
        return this.w;
    }

    public final synchronized g5 x() {
        return this.t;
    }

    public final synchronized boolean y(e5 e5Var) {
        return this.o.contains(e5Var);
    }

    public final synchronized boolean z(f5 f5Var) {
        return this.n.contains(f5Var);
    }
}
