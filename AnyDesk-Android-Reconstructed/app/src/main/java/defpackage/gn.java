package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn extends f81 implements d60 {
    public fk g;
    public byte[] h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ t10[] m;
    public final /* synthetic */ ki n;
    public final /* synthetic */ v10 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(t10[] t10VarArr, ki kiVar, v10 v10Var, rq rqVar) {
        super(2, rqVar);
        this.m = t10VarArr;
        this.n = kiVar;
        this.o = v10Var;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((gn) j((rq) obj2, (kr) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        gn gnVar = new gn(this.m, this.n, this.o, rqVar);
        gnVar.l = obj;
        return gnVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[DONT_INVERT, EDGE_INSN: B:40:0x00bb->B:18:0x0078 BREAK  A[LOOP:0: B:29:0x009a->B:46:?]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:29:0x009a->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d1 -> B:18:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.ag
    public final java.lang.Object m(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn.m(java.lang.Object):java.lang.Object");
    }
}
