package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm implements AutoCloseable, kr {
    public final br c;

    public nm(br brVar) {
        brVar.getClass();
        this.c = brVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        pd0 pd0Var = (pd0) this.c.l(fw.f);
        if (pd0Var != null) {
            pd0Var.b(null);
        }
    }

    @Override // defpackage.kr
    public final br f() {
        return this.c;
    }
}
