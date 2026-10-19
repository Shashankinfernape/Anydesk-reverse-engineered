package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq0 extends n60 implements o50 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.k = i4;
    }

    @Override // defpackage.o50
    public final Object a() {
        int i = this.k;
        uc1 uc1Var = uc1.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((wq0) obj).e();
                break;
            case 1:
                ((wq0) obj).e();
                break;
            case 2:
                ((bs0) obj).c.g0(Boolean.TRUE);
                break;
            case 3:
                ((bs0) obj).c.g0(Boolean.FALSE);
                break;
            default:
                ((bs0) obj).c.g0(Boolean.FALSE);
                break;
        }
        return uc1Var;
    }
}
