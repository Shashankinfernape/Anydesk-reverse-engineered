package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class iw0 {
    public final jw0 a = new jw0();
    public boolean b = false;
    public int c = 1;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public final void d() {
        this.a.b();
    }

    public abstract void e(hx0 hx0Var, int i);

    public abstract hx0 f(ViewGroup viewGroup, int i);

    public final void h() {
        if (this.a.a()) {
            nh0.j("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = true;
        }
    }

    public void g(hx0 hx0Var) {
    }
}
