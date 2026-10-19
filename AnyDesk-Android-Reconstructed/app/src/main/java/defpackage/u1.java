package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends ve1 {
    public static final long h;
    public static final long i;
    public static final long j;
    public static final /* synthetic */ int k = 0;
    public final fw b;
    public z61 c;
    public final e71 d;
    public final gr e;
    public h1 f;
    public final gr g;

    static {
        int i2 = yv.e;
        aw awVar = aw.MILLISECONDS;
        long jU = hq.U(500, awVar);
        h = jU;
        i = jU;
        j = hq.U(1000, awVar);
    }

    public u1() {
        MainApplication.v().getClass();
        this.b = new fw(7);
        e71 e71VarB = ec1.b(new v1(null, false, "", px.c, null, false, false, false, null, nx.c));
        this.d = e71VarB;
        this.e = r71.e(e71VarB);
        rq rqVar = null;
        bs0 bs0Var = new bs0(new ts0(new y(2, this), null), new fw(29));
        nm nmVarW = hq.w(this);
        t10 t10Var = bs0Var.e;
        t10Var.getClass();
        int i2 = 0;
        t10 t10VarJ = lk0.J(new z10(t10Var, new ki(rqVar, nmVarW, i2), rqVar, 1));
        li liVar = new li(3, null);
        t10VarJ.getClass();
        g20 g20Var = new g20(new i20(new mi(2, null), new ji(0, new ji(5, new z10(t10VarJ, liVar, rqVar, i2)))), new ni(3, null));
        fk.a.getClass();
        int i3 = ek.b;
        xb xbVar = new xb((1 >= i3 ? 1 : i3) - 1, oh.c, kx.c, g20Var);
        v41 v41VarA = bu0.a(1, xbVar.c, (oh) xbVar.e);
        br brVar = (br) xbVar.f;
        t10 t10Var2 = (t10) xbVar.d;
        nr nrVar = y41.b != y41.a ? nr.f : nr.c;
        ih ihVar = new ih(t10Var2, v41VarA, rqVar, 6);
        br brVarK = ec1.k(nmVarW.f(), brVar, true);
        us usVar = su.a;
        if (brVarK != usVar && brVarK.l(fw.d) == null) {
            brVarK = brVarK.j(usVar);
        }
        g2 te0Var = nrVar == nr.d ? new te0(brVarK, ihVar) : new z61(brVarK, true);
        te0Var.i0(nrVar, te0Var, ihVar);
        this.g = r71.e(new z20(new bw0(v41VarA), e71VarB, new t1(this, rqVar, i2)));
        z61 z61Var = this.c;
        if (z61Var != null) {
            z61Var.b(null);
        }
        this.c = th1.B(hq.w(this), null, null, new r1(h, this, true, null), 3);
    }

    @Override // defpackage.ve1
    public final void d() {
        this.b.getClass();
        JniAdExt.I0.post(new ia0(5));
    }

    public final void e(boolean z) {
        e71 e71Var;
        v1 v1Var;
        z61 z61Var = this.c;
        if (z61Var != null) {
            z61Var.b(null);
        }
        do {
            e71Var = this.d;
            v1Var = (v1) e71Var.getValue();
        } while (!e71Var.g(v1Var, v1.a(v1Var, null, false, null, null, null, false, v1Var.g || z, false, null, null, 959)));
        h1 h1Var = this.f;
        if (h1Var != null) {
            h1Var.c();
        }
    }

    public final void f(String str) {
        e71 e71Var;
        v1 v1Var;
        v1 v1VarA;
        str.getClass();
        do {
            e71Var = this.d;
            v1Var = (v1) e71Var.getValue();
            boolean z = v1Var.f;
            Set setK = v1Var.d;
            if (!z) {
                setK = setK.contains(str) ? t11.K(setK, str) : t11.L(setK, str);
            }
            v1VarA = v1.a(v1Var, null, false, null, setK, null, false, false, false, null, null, 1015);
        } while (!e71Var.g(v1Var, v1VarA));
        if (v1VarA.f) {
            return;
        }
        z61 z61Var = this.c;
        if (z61Var != null) {
            z61Var.b(null);
        }
        this.c = th1.B(hq.w(this), null, null, new r1(j, this, false, null), 3);
    }
}
