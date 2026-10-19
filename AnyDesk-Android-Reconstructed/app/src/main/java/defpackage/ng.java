package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ng implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ vg f;

    public /* synthetic */ ng(vg vgVar, int i, CharSequence charSequence, int i2) {
        this.c = i2;
        this.f = vgVar;
        this.d = i;
        this.e = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        CharSequence charSequence = this.e;
        int i2 = this.d;
        vg vgVar = this.f;
        switch (i) {
            case 0:
                gh ghVar = vgVar.a0;
                if (ghVar.c == null) {
                    ghVar.c = new eh();
                }
                ghVar.c.A(i2, charSequence);
                break;
            default:
                vgVar.U0(i2, charSequence);
                break;
        }
    }
}
