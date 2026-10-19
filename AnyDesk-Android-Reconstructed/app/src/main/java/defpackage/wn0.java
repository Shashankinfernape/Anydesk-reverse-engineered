package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn0 implements z50 {
    public final /* synthetic */ int c;
    public final /* synthetic */ sn0 d;

    public /* synthetic */ wn0(sn0 sn0Var, int i) {
        this.c = i;
        this.d = sn0Var;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        boolean zContains;
        int i = this.c;
        sn0 sn0Var = this.d;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                zContains = sn0Var.b().contains(str);
                break;
            default:
                str.getClass();
                zContains = sn0Var.b().contains(str);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
