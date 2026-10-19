package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq implements kr {
    public final br c;

    public pq(br brVar) {
        this.c = brVar;
    }

    @Override // defpackage.kr
    public final br f() {
        return this.c;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.c + ')';
    }
}
