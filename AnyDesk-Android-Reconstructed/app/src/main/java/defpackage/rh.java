package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rh extends sq {
    public /* synthetic */ Object f;
    public final /* synthetic */ sh g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(sh shVar, sq sqVar) {
        super(sqVar);
        this.g = shVar;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) throws ou {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objE = this.g.E(null, 0, 0L, this);
        return objE == lr.c ? objE : new rk(objE);
    }
}
