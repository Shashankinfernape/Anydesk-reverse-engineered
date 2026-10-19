package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr0 implements v10, l60 {
    public final /* synthetic */ j51 c;

    public yr0(j51 j51Var) {
        this.c = j51Var;
    }

    @Override // defpackage.l60
    public final k60 a() {
        return new n60(2, this.c, j51.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v10) && (obj instanceof l60)) {
            return a().equals(((l60) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        Object objC = this.c.c.c(rqVar, (vs0) obj);
        return objC == lr.c ? objC : uc1.a;
    }
}
