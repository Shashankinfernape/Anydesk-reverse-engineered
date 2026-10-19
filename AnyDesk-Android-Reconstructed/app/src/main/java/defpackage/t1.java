package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends f81 implements e60 {
    public final /* synthetic */ int g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Object obj, rq rqVar, int i) {
        super(3, rqVar);
        this.g = i;
        this.j = obj;
    }

    @Override // defpackage.e60
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                t1 t1Var = new t1((u1) obj4, (rq) obj3, 0);
                t1Var.h = (vs0) obj;
                t1Var.i = (v1) obj2;
                return t1Var.m(uc1Var);
            default:
                t1 t1Var2 = new t1((xg0) obj4, (rq) obj3, 1);
                t1Var2.h = (t60) obj;
                t1Var2.i = (t60) obj2;
                return t1Var2.m(uc1Var);
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        boolean zG = true;
        char c = 1;
        switch (this.g) {
            case 0:
                vs0 vs0Var = (vs0) this.h;
                v1 v1Var = (v1) this.i;
                y90.V(obj);
                Throwable th = v1Var.i;
                if (th == null) {
                    s1 s1Var = new s1(v1Var, (rq) null, 0);
                    vs0Var.getClass();
                    return new vs0(new i20(vs0Var.a, s1Var, 3), vs0Var.b, vs0Var.c, o6.h);
                }
                int i = u1.k;
                wg0 wg0Var = new wg0(new sg0(th), new ug0(false), new ug0(false));
                return new vs0(new ji(3, new vr0(mx.c, wg0Var)), vs0.d, vs0.e, new sm0(c == true ? 1 : 0, wg0Var));
            default:
                y90.V(obj);
                t60 t60Var = (t60) this.h;
                t60 t60Var2 = (t60) this.i;
                xg0 xg0Var = (xg0) this.j;
                t60Var2.getClass();
                t60Var.getClass();
                int i2 = t60Var2.a;
                int i3 = t60Var.a;
                if (i2 <= i3) {
                    zG = i2 < i3 ? false : bu0.G(t60Var2.b, t60Var.b, xg0Var);
                }
                return zG ? t60Var2 : t60Var;
        }
    }
}
