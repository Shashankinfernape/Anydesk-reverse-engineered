package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m70 implements z50 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m70(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        vn0 vn0VarC;
        int i = this.c;
        uc1 uc1Var = uc1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((o70) obj3).e.removeCallbacks((c0) obj2);
                return uc1Var;
            case 1:
                vn0 vn0Var = (vn0) obj3;
                mn0 mn0Var = ((bo0) obj2).b;
                fo0 fo0Var = (fo0) obj;
                fo0Var.getClass();
                do0 do0Var = fo0Var.a;
                do0Var.e = 0;
                do0Var.f = 0;
                if (vn0Var instanceof xn0) {
                    int i2 = vn0.h;
                    for (vn0 vn0Var2 : h11.c0(vn0Var, new a0(15))) {
                        vn0 vn0VarF = mn0Var.f();
                        if (y90.e(vn0Var2, vn0VarF != null ? vn0VarF.e : null)) {
                        }
                    }
                    int i3 = xn0.j;
                    fo0Var.b = th1.q(mn0Var.g()).d.a;
                    fo0Var.c = true;
                }
                return uc1Var;
            case 2:
                fp0 fp0Var = (fp0) obj3;
                eo0 eo0Var = (eo0) obj2;
                an0 an0Var = (an0) obj;
                an0Var.getClass();
                dn0 dn0Var = an0Var.j;
                vn0 vn0Var3 = an0Var.d;
                if (vn0Var3 == null) {
                    vn0Var3 = null;
                }
                if (vn0Var3 == null || (vn0VarC = fp0Var.c(vn0Var3, dn0Var.b(), eo0Var)) == null) {
                    return null;
                }
                return vn0VarC.equals(vn0Var3) ? an0Var : fp0Var.b().b(vn0VarC, vn0VarC.a(dn0Var.b()));
            case 3:
                ((nk0) obj3).l(((z50) obj2).h(obj));
                return uc1Var;
            default:
                nk0 nk0Var = (nk0) obj3;
                kx0 kx0Var = (kx0) obj2;
                Object objD = nk0Var.d();
                if (kx0Var.c || ((objD == null && obj != null) || (objD != null && !objD.equals(obj)))) {
                    kx0Var.c = false;
                    nk0Var.l(obj);
                }
                return uc1Var;
        }
    }
}
