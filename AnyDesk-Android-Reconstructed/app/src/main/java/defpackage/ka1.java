package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ka1 implements z5, pk0 {
    public final /* synthetic */ Toolbar c;

    public /* synthetic */ ka1(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.pk0
    public boolean f(rk0 rk0Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.pk0
    public void o(rk0 rk0Var) {
        Toolbar toolbar = this.c;
        w5 w5Var = toolbar.c.v;
        if (w5Var == null || !w5Var.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.I.e).iterator();
            while (it.hasNext()) {
                ((jl0) it.next()).y(rk0Var);
            }
        }
        qa1 qa1Var = toolbar.Q;
        if (qa1Var != null) {
            qa1Var.o(rk0Var);
        }
    }
}
