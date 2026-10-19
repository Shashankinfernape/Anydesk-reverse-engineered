package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h00 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ i00 e;

    public /* synthetic */ h00(i00 i00Var, boolean z, int i) {
        this.c = i;
        this.e = i00Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.d;
        i00 i00Var = this.e;
        switch (i) {
            case 0:
                if (i00Var.r0 == z) {
                    i00Var.T0();
                }
                break;
            default:
                if (i00Var.r0 == z) {
                    i00Var.T0();
                }
                break;
        }
    }
}
