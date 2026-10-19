package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mk0 implements mq0 {
    public final vm0 c;
    public final e50 d;
    public int e = -1;

    public mk0(vm0 vm0Var, e50 e50Var) {
        this.c = vm0Var;
        this.d = e50Var;
    }

    public final void a() {
        this.c.f(this);
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        int i = this.e;
        int i2 = this.c.g;
        if (i != i2) {
            this.e = i2;
            this.d.b(obj);
        }
    }
}
