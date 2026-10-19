package defpackage;

import android.graphics.Path;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 implements mu0 {
    public View a;
    public String b;
    public mu0 c;
    public boolean h;
    public boolean j;
    public float k;
    public float l;
    public int m;
    public int n;
    public Path o;
    public final ArrayList d = new ArrayList();
    public boolean f = true;
    public boolean g = false;
    public boolean i = false;
    public int e = 0;
    public s7 p = new s7(this, Looper.getMainLooper(), 4);

    public lu0(String str, mu0 mu0Var) {
        this.c = mu0Var;
    }

    @Override // defpackage.mu0
    public final void a() {
        s7 s7Var;
        mu0 mu0Var = this.c;
        if (mu0Var != null) {
            mu0Var.a();
        }
        this.i = false;
        if (this.b == null || (s7Var = this.p) == null) {
            return;
        }
        s7Var.removeMessages(q51.d(2));
    }

    @Override // defpackage.mu0
    public final void b() {
        s7 s7Var;
        mu0 mu0Var = this.c;
        if (mu0Var != null) {
            mu0Var.b();
        }
        this.i = true;
        if (this.b == null || (s7Var = this.p) == null) {
            return;
        }
        s7Var.sendEmptyMessageDelayed(q51.d(2), 1500L);
    }

    @Override // defpackage.mu0
    public final void c() {
        mu0 mu0Var = this.c;
        if (mu0Var != null) {
            mu0Var.c();
        }
    }

    public final void d(lu0 lu0Var) {
        lu0Var.e = this.e + 1;
        this.d.add(lu0Var);
    }

    public final void e() {
        this.p = null;
        this.d.clear();
        this.c = null;
        this.a = null;
    }

    public final void f(boolean z) {
        this.h = z;
        View view = this.a;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
