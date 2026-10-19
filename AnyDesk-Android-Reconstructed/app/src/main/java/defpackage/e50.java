package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e50 implements mq0, l60 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z50 d;

    public /* synthetic */ e50(z50 z50Var, int i) {
        this.c = i;
        this.d = z50Var;
    }

    @Override // defpackage.l60
    public final k60 a() {
        int i = this.c;
        z50 z50Var = this.d;
        switch (i) {
            case 0:
                return (z40) z50Var;
            default:
                return z50Var;
        }
    }

    @Override // defpackage.mq0
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        z50 z50Var = this.d;
        switch (i) {
            case 0:
                ((z40) z50Var).h(obj);
                break;
            default:
                z50Var.h(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.c;
        z50 z50Var = this.d;
        switch (i) {
            case 0:
                return (obj instanceof mq0) && (obj instanceof l60) && ((z40) z50Var) == ((l60) obj).a();
            default:
                if ((obj instanceof mq0) && (obj instanceof l60)) {
                    return z50Var.equals(((l60) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        int i = this.c;
        z50 z50Var = this.d;
        switch (i) {
            case 0:
                return ((z40) z50Var).hashCode();
            default:
                return z50Var.hashCode();
        }
    }
}
