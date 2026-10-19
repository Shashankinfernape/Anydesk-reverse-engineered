package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qg0 {
    public final mq0 c;
    public boolean d;
    public int e = -1;
    public final /* synthetic */ vm0 f;

    public qg0(vm0 vm0Var, mq0 mq0Var) {
        this.f = vm0Var;
        this.c = mq0Var;
    }

    public final void b(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        int i = z ? 1 : -1;
        vm0 vm0Var = this.f;
        int i2 = vm0Var.c;
        vm0Var.c = i + i2;
        if (!vm0Var.d) {
            vm0Var.d = true;
            while (true) {
                try {
                    int i3 = vm0Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        vm0Var.g();
                    } else if (z3) {
                        vm0Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    vm0Var.d = false;
                    throw th;
                }
            }
            vm0Var.d = false;
        }
        if (this.d) {
            vm0Var.c(this);
        }
    }

    public boolean j(gf0 gf0Var) {
        return false;
    }

    public abstract boolean k();

    public void f() {
    }
}
