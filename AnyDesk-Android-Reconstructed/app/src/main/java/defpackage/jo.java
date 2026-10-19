package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends sh {
    public final oh r;

    public jo(int i, oh ohVar) {
        super(i);
        this.r = ohVar;
        if (ohVar == oh.c) {
            nh0.h(nx0.a(sh.class).a(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        nh0.e(q51.k(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    public final Object N(Object obj, boolean z) {
        if (this.r != oh.e) {
            return J(obj);
        }
        Object objP = super.p(obj);
        return (!(objP instanceof qk) || (objP instanceof pk)) ? objP : uc1.a;
    }

    @Override // defpackage.sh, defpackage.c11
    public final Object c(rq rqVar, Object obj) throws Throwable {
        if (N(obj, true) instanceof pk) {
            throw t();
        }
        return uc1.a;
    }

    @Override // defpackage.sh, defpackage.c11
    public final Object p(Object obj) {
        return N(obj, false);
    }

    @Override // defpackage.sh
    public final boolean z() {
        return this.r == oh.d;
    }
}
