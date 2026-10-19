package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n10 extends o10 {
    public final /* synthetic */ int e;
    public final /* synthetic */ r10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n10(r10 r10Var, int i) {
        super(r10Var);
        this.e = i;
        this.f = r10Var;
    }

    @Override // defpackage.o10
    public final float a() {
        float f;
        float f2;
        int i = this.e;
        r10 r10Var = this.f;
        switch (i) {
            case 0:
                f = r10Var.h;
                f2 = r10Var.i;
                break;
            case 1:
                f = r10Var.h;
                f2 = r10Var.j;
                break;
            default:
                return r10Var.h;
        }
        return f + f2;
    }
}
