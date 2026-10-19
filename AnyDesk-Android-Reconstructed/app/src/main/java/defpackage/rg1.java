package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class rg1 extends vg1 {
    public final WindowInsets.Builder a;

    public rg1(gh1 gh1Var) {
        super(gh1Var);
        WindowInsets windowInsetsF = gh1Var.f();
        this.a = windowInsetsF != null ? qg1.b(windowInsetsF) : qg1.a();
    }

    @Override // defpackage.vg1
    public gh1 b() {
        a();
        gh1 gh1VarG = gh1.g(this.a.build(), null);
        gh1VarG.a.p(null);
        return gh1VarG;
    }

    @Override // defpackage.vg1
    public void c(s90 s90Var) {
        this.a.setStableInsets(s90Var.c());
    }

    @Override // defpackage.vg1
    public void d(s90 s90Var) {
        this.a.setSystemWindowInsets(s90Var.c());
    }

    public rg1() {
        this.a = qg1.a();
    }
}
