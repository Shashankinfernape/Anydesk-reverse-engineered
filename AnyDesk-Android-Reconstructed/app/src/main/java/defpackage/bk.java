package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class bk extends rb1 {
    public boolean a = false;
    public final ViewGroup b;

    public bk(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.rb1, defpackage.pb1
    public final void c() {
        uj.G(this.b, false);
    }

    @Override // defpackage.rb1, defpackage.pb1
    public final void d() {
        uj.G(this.b, true);
    }

    @Override // defpackage.pb1
    public final void e(qb1 qb1Var) {
        if (!this.a) {
            uj.G(this.b, false);
        }
        qb1Var.x(this);
    }

    @Override // defpackage.rb1, defpackage.pb1
    public final void g(qb1 qb1Var) {
        uj.G(this.b, false);
        this.a = true;
    }
}
