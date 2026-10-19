package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class e40 extends hq implements cf1, gf0, g01, f50 {
    public final qa s;
    public final qa t;
    public final Handler u;
    public final t40 v;
    public final /* synthetic */ qa w;

    public e40(qa qaVar) {
        this.w = qaVar;
        Handler handler = new Handler();
        this.v = new t40();
        this.s = qaVar;
        this.t = qaVar;
        this.u = handler;
    }

    @Override // defpackage.hq
    public final View A(int i) {
        return this.w.findViewById(i);
    }

    @Override // defpackage.hq
    public final boolean B() {
        Window window = this.w.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.cf1
    public final bf1 K() {
        return this.w.K();
    }

    @Override // defpackage.gf0
    public final if0 R() {
        return this.w.x;
    }

    @Override // defpackage.g01
    public final ui0 b() {
        return (ui0) this.w.f.d;
    }

    @Override // defpackage.f50
    public final void d(t40 t40Var, c40 c40Var) {
    }
}
