package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nn implements rq {
    public static final nn d = new nn(0);
    public static final nn e = new nn(1);
    public final /* synthetic */ int c;

    public /* synthetic */ nn(int i) {
        this.c = i;
    }

    @Override // defpackage.rq
    public final br e() {
        switch (this.c) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return kx.c;
        }
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        switch (this.c) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.c) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
