package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ih extends f81 implements d60 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(rg0 rg0Var, Object obj, rq rqVar) {
        super(2, rqVar);
        this.g = 8;
        this.j = rg0Var;
        this.i = obj;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 1:
                return ((ih) j((rq) obj2, (v10) obj)).m(uc1Var);
            case 2:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 3:
                return ((ih) j((rq) obj2, (ev0) obj)).m(uc1Var);
            case 4:
                return ((ih) j((rq) obj2, (v10) obj)).m(uc1Var);
            case 5:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 6:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 7:
                return ((ih) j((rq) obj2, (rg0) obj)).m(uc1Var);
            case 8:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 9:
                return ((ih) j((rq) obj2, (j51) obj)).m(uc1Var);
            case 10:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 11:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 12:
                return ((ih) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 13:
                return ((ih) j((rq) obj2, (v10) obj)).m(uc1Var);
            default:
                return ((ih) j((rq) obj2, obj)).m(uc1Var);
        }
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        int i = this.g;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ih ihVar = new ih((sb) obj2, rqVar, 0);
                ihVar.i = obj;
                return ihVar;
            case 1:
                ih ihVar2 = new ih((gi) obj2, rqVar, 1);
                ihVar2.i = obj;
                return ihVar2;
            case 2:
                return new ih((t10) this.i, (gi) obj2, rqVar, 2);
            case 3:
                ih ihVar3 = new ih((hk) obj2, rqVar, 3);
                ihVar3.i = obj;
                return ihVar3;
            case 4:
                ih ihVar4 = new ih((ik) obj2, rqVar, 4);
                ihVar4.i = obj;
                return ihVar4;
            case 5:
                return new ih((t10) this.i, (e11) obj2, rqVar, 5);
            case 6:
                return new ih((t10) this.i, (v41) obj2, rqVar, 6);
            case 7:
                ih ihVar5 = new ih((t10) obj2, rqVar, 7);
                ihVar5.i = obj;
                return ihVar5;
            case 8:
                return new ih((rg0) obj2, this.i, rqVar);
            case 9:
                ih ihVar6 = new ih((bs0) obj2, rqVar, 9);
                ihVar6.i = obj;
                return ihVar6;
            case 10:
                return new ih((ns0) this.i, (j51) obj2, rqVar, 10);
            case 11:
                return new ih((ns0) this.i, (sh) obj2, rqVar, 11);
            case 12:
                return new ih((sh) this.i, (d60) obj2, rqVar, 12);
            case 13:
                ih ihVar7 = new ih((d60) obj2, rqVar, 13);
                ihVar7.i = obj;
                return ihVar7;
            default:
                ih ihVar8 = new ih((v10) obj2, rqVar, 14);
                ihVar8.i = obj;
                return ihVar8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f4, code lost:
    
        if (r0.a(r3, r10) == r7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0229, code lost:
    
        if (r0.a(r3, r10) == r7) goto L118;
     */
    @Override // defpackage.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih(Object obj, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih(Object obj, Object obj2, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.i = obj;
        this.j = obj2;
    }
}
