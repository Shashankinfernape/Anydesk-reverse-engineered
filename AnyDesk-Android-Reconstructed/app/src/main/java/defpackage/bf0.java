package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf0 implements ef0, kr {
    public final if0 c;
    public final br d;

    public bf0(if0 if0Var, br brVar) {
        pd0 pd0Var;
        brVar.getClass();
        this.c = if0Var;
        this.d = brVar;
        if (if0Var.d != af0.c || (pd0Var = (pd0) brVar.l(fw.f)) == null) {
            return;
        }
        pd0Var.b(null);
    }

    @Override // defpackage.kr
    public final br f() {
        return this.d;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        if0 if0Var = this.c;
        if (if0Var.d.compareTo(af0.c) <= 0) {
            if0Var.f(this);
            pd0 pd0Var = (pd0) this.d.l(fw.f);
            if (pd0Var != null) {
                pd0Var.b(null);
            }
        }
    }
}
