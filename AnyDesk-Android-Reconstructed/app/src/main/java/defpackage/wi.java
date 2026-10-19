package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi implements e60 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wi(xm0 xm0Var, wm0 wm0Var) {
        this.c = 1;
        this.d = xm0Var;
    }

    @Override // defpackage.e60
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        uc1 uc1Var = uc1.a;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((z) obj4).h((Throwable) obj);
                break;
            case 1:
                xm0 xm0Var = (xm0) obj4;
                xm0.i.set(xm0Var, null);
                xm0Var.f(null);
                break;
            default:
                ((z01) obj4).b();
                break;
        }
        return uc1Var;
    }

    public /* synthetic */ wi(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }
}
