package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ig implements lg0 {
    public final lg0 c;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public Object g = null;

    public ig(lg0 lg0Var) {
        this.c = lg0Var;
    }

    public final void a() {
        int i = this.d;
        if (i == 0) {
            return;
        }
        lg0 lg0Var = this.c;
        if (i == 1) {
            lg0Var.n(this.e, this.f);
        } else if (i == 2) {
            lg0Var.c(this.e, this.f);
        } else if (i == 3) {
            lg0Var.b(this.g, this.e, this.f);
        }
        this.g = null;
        this.d = 0;
    }

    @Override // defpackage.lg0
    public final void b(Object obj, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.d == 3 && i <= (i4 = this.f + (i3 = this.e)) && (i5 = i + i2) >= i3 && this.g == obj) {
            this.e = Math.min(i, i3);
            this.f = Math.max(i4, i5) - this.e;
            return;
        }
        a();
        this.e = i;
        this.f = i2;
        this.g = obj;
        this.d = 3;
    }

    @Override // defpackage.lg0
    public final void c(int i, int i2) {
        int i3;
        if (this.d == 2 && (i3 = this.e) >= i && i3 <= i + i2) {
            this.f += i2;
            this.e = i;
        } else {
            a();
            this.e = i;
            this.f = i2;
            this.d = 2;
        }
    }

    @Override // defpackage.lg0
    public final void d(int i, int i2) {
        a();
        this.c.d(i, i2);
    }

    @Override // defpackage.lg0
    public final void n(int i, int i2) {
        int i3;
        if (this.d == 1 && i >= (i3 = this.e)) {
            int i4 = this.f;
            if (i <= i3 + i4) {
                this.f = i4 + i2;
                this.e = Math.min(i, i3);
                return;
            }
        }
        a();
        this.e = i;
        this.f = i2;
        this.d = 1;
    }
}
