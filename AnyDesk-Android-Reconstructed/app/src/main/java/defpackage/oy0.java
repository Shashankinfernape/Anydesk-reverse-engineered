package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oy0 extends ag {
    public oy0(rq rqVar) {
        super(rqVar);
        if (rqVar == null || rqVar.e() == kx.c) {
            return;
        }
        id.q("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.rq
    public final br e() {
        return kx.c;
    }
}
