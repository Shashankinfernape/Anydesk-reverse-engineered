package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn0 implements o50 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bo0 d;

    public /* synthetic */ fn0(bo0 bo0Var, int i) {
        this.c = i;
        this.d = bo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    @Override // defpackage.o50
    public final Object a() {
        boolean z;
        int i = this.c;
        bo0 bo0Var = this.d;
        switch (i) {
            case 0:
                l40 l40Var = bo0Var.f;
                if (bo0Var.g) {
                    z = bo0Var.b() > 1;
                }
                l40Var.a = z;
                o50 o50Var = l40Var.c;
                if (o50Var != null) {
                    o50Var.a();
                }
                return uc1.a;
            default:
                return new co0(bo0Var.a, bo0Var.b.r);
        }
    }
}
