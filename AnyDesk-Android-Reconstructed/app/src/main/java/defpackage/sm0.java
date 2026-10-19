package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sm0 extends qe0 implements o50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm0(int i, Object obj) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.o50
    public final Object a() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                wr0 wr0Var = (wr0) tm.j0(((l10) ((y7) ((tm0) obj).b.a).d).b());
                if (wr0Var != null && (wr0Var instanceof sr0)) {
                    sr0 sr0Var = (sr0) wr0Var;
                    if (sr0Var.a == xg0.c) {
                        return sr0Var;
                    }
                }
                return null;
            case 1:
                sr0 sr0Var2 = sr0.g;
                return new sr0(xg0.c, y90.J(new mb1(0, mx.c)), 0, 0, (wg0) obj, null);
            default:
                v41 v41Var = ((xe) obj).l;
                uc1 uc1Var = uc1.a;
                v41Var.p(uc1Var);
                return uc1Var;
        }
    }
}
