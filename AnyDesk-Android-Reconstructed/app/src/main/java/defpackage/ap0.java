package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ap0 implements hv {
    public final /* synthetic */ NavigationView a;

    public ap0(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // defpackage.hv
    public final void a(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            y6 y6Var = navigationView.x;
            Objects.requireNonNull(y6Var);
            view.post(new l(15, y6Var));
        }
    }

    @Override // defpackage.hv
    public final void b(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            y6 y6Var = navigationView.x;
            sj0 sj0Var = (sj0) y6Var.d;
            if (sj0Var != null) {
                sj0Var.c((NavigationView) y6Var.f);
            }
            if (!navigationView.t || navigationView.s == 0) {
                return;
            }
            navigationView.s = 0;
            navigationView.g(navigationView.getWidth(), navigationView.getHeight());
        }
    }
}
