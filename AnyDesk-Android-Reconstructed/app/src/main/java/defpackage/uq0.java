package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uq0 implements ui {
    public final l40 c;
    public final /* synthetic */ wq0 d;

    public uq0(wq0 wq0Var, l40 l40Var) {
        l40Var.getClass();
        this.d = wq0Var;
        this.c = l40Var;
    }

    @Override // defpackage.ui
    public final void cancel() {
        wq0 wq0Var = this.d;
        qd qdVar = wq0Var.b;
        l40 l40Var = this.c;
        qdVar.remove(l40Var);
        if (y90.e(wq0Var.c, l40Var)) {
            l40Var.getClass();
            wq0Var.c = null;
        }
        l40Var.getClass();
        l40Var.b.remove(this);
        o50 o50Var = l40Var.c;
        if (o50Var != null) {
            o50Var.a();
        }
        l40Var.c = null;
    }
}
