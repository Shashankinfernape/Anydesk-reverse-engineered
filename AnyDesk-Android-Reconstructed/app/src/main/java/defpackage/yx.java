package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx implements k80, o80 {
    public final /* synthetic */ zx c;

    @Override // defpackage.o80
    public boolean b(String str) {
        zx zxVar = this.c;
        i8 i8Var = zxVar.h;
        if (i8Var != null) {
            return i8Var.b(str);
        }
        zxVar.b.a("GPRES: no valid injector");
        return false;
    }

    @Override // defpackage.o80
    public boolean d(String str) {
        zx zxVar = this.c;
        i8 i8Var = zxVar.h;
        if (i8Var != null) {
            return i8Var.d(str);
        }
        zxVar.b.a("AAOPM: no valid injector");
        return false;
    }

    @Override // defpackage.k80
    public void e(j11 j11Var, boolean z) {
        k80 k80Var;
        zx zxVar = this.c;
        zxVar.t();
        if (j11Var != zxVar.l || (k80Var = zxVar.j) == null) {
            return;
        }
        k80Var.e(j11Var, z);
    }

    @Override // defpackage.o80
    public boolean g(String str) {
        zx zxVar = this.c;
        i8 i8Var = zxVar.h;
        if (i8Var != null) {
            return i8Var.g(str);
        }
        zxVar.b.a("GPWES: no valid injector");
        return false;
    }

    @Override // defpackage.o80
    public boolean h(String str) {
        zx zxVar = this.c;
        i8 i8Var = zxVar.h;
        if (i8Var != null) {
            return i8Var.h(str);
        }
        zxVar.b.a("GPMES: no valid injector");
        return false;
    }

    @Override // defpackage.o80
    public boolean j(String str) {
        zx zxVar = this.c;
        i8 i8Var = zxVar.h;
        if (i8Var == null) {
            zxVar.b.a("ABOWL: no valid injector");
            return false;
        }
        boolean zJ = i8Var.j(str);
        k11 k11Var = zxVar.k;
        if (k11Var != null) {
            zJ |= i8Var.j(k11Var.a);
        }
        j11 j11Var = zxVar.l;
        return j11Var != null ? zJ | i8Var.j(j11Var.a) : zJ;
    }

    @Override // defpackage.o80
    public boolean k(String str) {
        zx zxVar = this.c;
        i8 i8Var = zxVar.h;
        if (i8Var != null) {
            return i8Var.k(str);
        }
        zxVar.b.a("GPSAW: no valid injector");
        return false;
    }
}
