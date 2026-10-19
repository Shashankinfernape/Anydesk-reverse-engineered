package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class xg1 extends wg1 {
    public s90 n;

    public xg1(gh1 gh1Var, WindowInsets windowInsets) {
        super(gh1Var, windowInsets);
        this.n = null;
    }

    @Override // defpackage.dh1
    public gh1 b() {
        return gh1.g(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.dh1
    public gh1 c() {
        return gh1.g(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.dh1
    public final s90 h() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = s90.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.dh1
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.dh1
    public void r(s90 s90Var) {
        this.n = s90Var;
    }
}
