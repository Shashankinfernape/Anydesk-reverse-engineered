package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 extends qg0 implements ef0 {
    public final gf0 g;
    public final /* synthetic */ vm0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(vm0 vm0Var, gf0 gf0Var, mq0 mq0Var) {
        super(vm0Var, mq0Var);
        this.h = vm0Var;
        this.g = gf0Var;
    }

    @Override // defpackage.qg0
    public final void f() {
        this.g.R().f(this);
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        gf0 gf0Var2 = this.g;
        af0 af0Var = gf0Var2.R().d;
        if (af0Var == af0.c) {
            this.h.j(this.c);
            return;
        }
        af0 af0Var2 = null;
        while (af0Var2 != af0Var) {
            b(k());
            af0Var2 = af0Var;
            af0Var = gf0Var2.R().d;
        }
    }

    @Override // defpackage.qg0
    public final boolean j(gf0 gf0Var) {
        return this.g == gf0Var;
    }

    @Override // defpackage.qg0
    public final boolean k() {
        return this.g.R().d.compareTo(af0.f) >= 0;
    }
}
