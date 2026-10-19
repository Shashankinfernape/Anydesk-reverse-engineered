package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements z50 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(xm0 xm0Var, wm0 wm0Var) {
        this.c = 5;
        this.d = xm0Var;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        int i = this.c;
        uc1 uc1Var = uc1.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((vm0) obj2).l((jn) obj);
                return uc1Var;
            case 1:
                return obj == ((f2) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                an0 an0Var = (an0) obj;
                an0Var.getClass();
                return new un((b50) obj2, 1, an0Var);
            case 3:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                return Boolean.valueOf(y90.e(st0Var.c, (String) obj2));
            case 4:
                return ((oj0) obj2).b(((Integer) obj).intValue());
            default:
                ((xm0) obj2).f(null);
                return uc1Var;
        }
    }

    public /* synthetic */ z(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }
}
