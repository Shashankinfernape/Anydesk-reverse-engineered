package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class m40 implements jl0 {
    public final /* synthetic */ t40 c;

    public m40(t40 t40Var) {
        this.c = t40Var;
    }

    @Override // defpackage.jl0
    public final boolean o(MenuItem menuItem) {
        return this.c.o();
    }

    @Override // defpackage.jl0
    public final void p(Menu menu) {
        this.c.p();
    }

    @Override // defpackage.jl0
    public final void v(Menu menu, MenuInflater menuInflater) {
        this.c.j();
    }

    @Override // defpackage.jl0
    public final void y(Menu menu) {
        this.c.s();
    }
}
