package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eu implements Runnable {
    public final /* synthetic */ t40 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ yt f;

    public eu(t40 t40Var, boolean z, String str, yt ytVar) {
        this.c = t40Var;
        this.d = z;
        this.e = str;
        this.f = ytVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c40 c40VarB;
        t40 t40Var = this.c;
        t40Var.x(true);
        t40Var.C();
        sf sfVar = new sf(t40Var);
        boolean z = this.d;
        String str = this.e;
        if (z && (c40VarB = t40Var.B(str)) != null) {
            sfVar.g(c40VarB);
        }
        yt ytVar = this.f;
        ytVar.m0 = false;
        ytVar.n0 = true;
        sfVar.e(0, ytVar, str, 1);
        ytVar.l0 = false;
        ytVar.h0 = sfVar.d(false);
        t40Var.x(true);
        t40Var.C();
    }
}
