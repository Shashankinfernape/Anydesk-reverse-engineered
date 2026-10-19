package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si implements zp0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ si(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((z50) obj).getClass().getSimpleName() + '@' + ds.s(this) + ']';
            default:
                return "DisposeOnCancel[" + ((uu) obj) + ']';
        }
    }
}
