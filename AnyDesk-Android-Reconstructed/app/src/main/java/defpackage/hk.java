package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class hk implements o60 {
    public final br c;
    public final int d;
    public final oh e;

    public hk(br brVar, int i, oh ohVar) {
        this.c = brVar;
        this.d = i;
        this.e = ohVar;
    }

    @Override // defpackage.t10
    public Object a(v10 v10Var, rq rqVar) {
        Object objL = hq.l(new af(v10Var, this, (rq) null, 3), rqVar);
        return objL == lr.c ? objL : uc1.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.o60
    public final t10 b(br brVar, int i, oh ohVar) {
        br brVar2 = this.c;
        br brVarJ = brVar.j(brVar2);
        oh ohVar2 = oh.c;
        oh ohVar3 = this.e;
        int i2 = this.d;
        if (ohVar == ohVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            ohVar = ohVar3;
        }
        return (y90.e(brVarJ, brVar2) && i == i2 && ohVar == ohVar3) ? this : e(brVarJ, i, ohVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(ev0 ev0Var, ih ihVar);

    public abstract hk e(br brVar, int i, oh ohVar);

    public t10 f() {
        return null;
    }

    public fk g(kr krVar) {
        int i = this.d;
        if (i == -3) {
            i = -2;
        }
        d60 ihVar = new ih(this, (rq) null, 3);
        sh shVarA = ec1.a(i, 4, this.e);
        br brVarK = ec1.k(krVar.f(), this.c, true);
        us usVar = su.a;
        if (brVarK != usVar && brVarK.l(fw.d) == null) {
            brVarK = brVarK.j(usVar);
        }
        ev0 ev0Var = new ev0(brVarK, shVarA);
        ev0Var.i0(nr.e, ev0Var, ihVar);
        return ev0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        kx kxVar = kx.c;
        br brVar = this.c;
        if (brVar != kxVar) {
            arrayList.add("context=" + brVar);
        }
        int i = this.d;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        oh ohVar = oh.c;
        oh ohVar2 = this.e;
        if (ohVar2 != ohVar) {
            arrayList.add("onBufferOverflow=" + ohVar2);
        }
        return getClass().getSimpleName() + '[' + tm.n0(arrayList, null, null, null, 62) + ']';
    }
}
