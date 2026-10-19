package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class og implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ vg d;

    public og(vg vgVar, zg zgVar) {
        this.c = 2;
        this.d = vgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        vg vgVar = this.d;
        switch (i) {
            case 0:
                gh ghVar = vgVar.a0;
                if (ghVar.c == null) {
                    ghVar.c = new eh();
                }
                ghVar.c.B();
                break;
            case 1:
                vgVar.a0.u = false;
                break;
            default:
                gh ghVar2 = vgVar.a0;
                if (ghVar2.c == null) {
                    ghVar2.c = new eh();
                }
                ghVar2.c.C();
                break;
        }
    }

    public /* synthetic */ og(vg vgVar, int i) {
        this.c = i;
        this.d = vgVar;
    }
}
