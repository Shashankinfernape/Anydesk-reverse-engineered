package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b20 extends f81 implements d60 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b20(Object obj, k60 k60Var, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.k = obj;
        this.l = k60Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                return ((b20) j((rq) obj2, (v10) obj)).m(uc1Var);
            case 1:
                return ((b20) j((rq) obj2, (j51) obj)).m(uc1Var);
            case 2:
                return ((b20) j((rq) obj2, (v10) obj)).m(uc1Var);
            default:
                return ((b20) j((rq) obj2, (kr) obj)).m(uc1Var);
        }
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        int i = this.g;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                b20 b20Var = new b20((i20) this.k, (ki) obj2, rqVar, 0);
                b20Var.i = obj;
                return b20Var;
            case 1:
                b20 b20Var2 = new b20((ns0) obj2, rqVar, 1);
                b20Var2.i = obj;
                return b20Var2;
            case 2:
                b20 b20Var3 = new b20((ns0) obj2, rqVar, 2);
                b20Var3.i = obj;
                return b20Var3;
            default:
                b20 b20Var4 = new b20((v10) this.k, (d60) obj2, rqVar, 3);
                b20Var4.i = obj;
                return b20Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:71:0x019d  */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r2.i(r13, r12) == r7) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0082 -> B:9:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b20.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b20(ns0 ns0Var, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.l = ns0Var;
    }
}
