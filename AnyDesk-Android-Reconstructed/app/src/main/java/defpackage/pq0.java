package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq0 extends qe0 implements o50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ wq0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq0(wq0 wq0Var, int i) {
        super(0);
        this.d = i;
        this.e = wq0Var;
    }

    @Override // defpackage.o50
    public final Object a() {
        int i = this.d;
        uc1 uc1Var = uc1.a;
        wq0 wq0Var = this.e;
        switch (i) {
            case 0:
                wq0Var.c();
                break;
            case 1:
                wq0Var.b();
                break;
            default:
                wq0Var.c();
                break;
        }
        return uc1Var;
    }
}
