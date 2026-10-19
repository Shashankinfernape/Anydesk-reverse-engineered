package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fr extends sq {
    public /* synthetic */ Object f;
    public final /* synthetic */ gr g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(gr grVar, sq sqVar) {
        super(sqVar);
        this.g = grVar;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        this.g.n(this);
        return uc1.a;
    }
}
