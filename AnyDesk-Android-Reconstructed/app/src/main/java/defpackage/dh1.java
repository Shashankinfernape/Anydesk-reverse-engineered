package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class dh1 {
    public static final gh1 b;
    public final gh1 a;

    static {
        vg1 rg1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            rg1Var = new ug1();
        } else if (i >= 31) {
            rg1Var = new tg1();
        } else if (i >= 30) {
            rg1Var = new sg1();
        } else {
            rg1Var = i >= 29 ? new rg1() : new pg1();
        }
        b = rg1Var.b().a.a().a.b().a.c();
    }

    public dh1(gh1 gh1Var) {
        this.a = gh1Var;
    }

    public gh1 a() {
        return this.a;
    }

    public gh1 b() {
        return this.a;
    }

    public gh1 c() {
        return this.a;
    }

    public tu e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh1)) {
            return false;
        }
        dh1 dh1Var = (dh1) obj;
        return n() == dh1Var.n() && m() == dh1Var.m() && Objects.equals(j(), dh1Var.j()) && Objects.equals(h(), dh1Var.h()) && Objects.equals(e(), dh1Var.e());
    }

    public s90 f(int i) {
        return s90.e;
    }

    public s90 g() {
        return j();
    }

    public s90 h() {
        return s90.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public s90 i() {
        return j();
    }

    public s90 j() {
        return s90.e;
    }

    public s90 k() {
        return j();
    }

    public gh1 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void p(s90[] s90VarArr) {
    }

    public void q(gh1 gh1Var) {
    }

    public void r(s90 s90Var) {
    }

    public void s(int i) {
    }
}
