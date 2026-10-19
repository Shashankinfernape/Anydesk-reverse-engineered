package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yg0 extends ve1 {
    public static final v40 c = new v40(1);
    public final x51 b = new x51(0);

    @Override // defpackage.ve1
    public final void d() {
        x51 x51Var = this.b;
        if (x51Var.f() > 0) {
            x51Var.g(0).getClass();
            id.c();
            return;
        }
        int i = x51Var.f;
        Object[] objArr = x51Var.e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        x51Var.f = 0;
        x51Var.c = false;
    }
}
