package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fi implements v10 {
    public final /* synthetic */ int c;
    public final Object d;

    public fi(c11 c11Var) {
        this.c = 1;
        c11Var.getClass();
        this.d = c11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r8.g(r7, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(defpackage.d90 r7, defpackage.rq r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ei
            if (r0 == 0) goto L13
            r0 = r8
            ei r0 = (defpackage.ei) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ei r0 = new ei
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.j
            r2 = 0
            r3 = 2
            r4 = 1
            lr r5 = defpackage.lr.c
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.y90.V(r8)
            goto L67
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.nh0.j(r7)
            return r2
        L31:
            d90 r7 = r0.g
            fi r1 = r0.f
            defpackage.y90.V(r8)
            goto L52
        L39:
            defpackage.y90.V(r8)
            java.lang.Object r8 = r6.d
            gi r8 = (defpackage.gi) r8
            java.lang.Object r8 = r8.b
            v41 r8 = (defpackage.v41) r8
            r0.f = r6
            r0.g = r7
            r0.j = r4
            java.lang.Object r8 = r8.i(r7, r0)
            if (r8 != r5) goto L51
            goto L66
        L51:
            r1 = r6
        L52:
            java.lang.Object r8 = r1.d
            gi r8 = (defpackage.gi) r8
            java.lang.Object r8 = r8.a
            y7 r8 = (defpackage.y7) r8
            r0.f = r2
            r0.g = r2
            r0.j = r3
            java.lang.Object r7 = r8.g(r7, r0)
            if (r7 != r5) goto L67
        L66:
            return r5
        L67:
            uc1 r7 = defpackage.uc1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi.a(d90, rq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(wr0 wr0Var, rq rqVar) {
        is0 is0Var;
        if (rqVar instanceof is0) {
            is0Var = (is0) rqVar;
            int i = is0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                is0Var.h = i - Integer.MIN_VALUE;
            } else {
                is0Var = new is0(this, rqVar);
            }
        } else {
            is0Var = new is0(this, rqVar);
        }
        Object obj = is0Var.f;
        int i2 = is0Var.h;
        try {
            if (i2 == 0) {
                y90.V(obj);
                j51 j51Var = (j51) this.d;
                is0Var.h = 1;
                Object objC = j51Var.c.c(is0Var, wr0Var);
                lr lrVar = lr.c;
                if (objC == lrVar) {
                    return lrVar;
                }
            } else {
                if (i2 != 1) {
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
            }
        } catch (pm unused) {
        }
        return uc1.a;
    }

    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) throws Throwable {
        int i = this.c;
        lr lrVar = lr.c;
        uc1 uc1Var = uc1.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return a((d90) obj, rqVar);
            case 1:
                Object objC = ((c11) obj2).c(rqVar, obj);
                return objC == lrVar ? objC : uc1Var;
            case 2:
                rg0 rg0Var = (rg0) obj2;
                Object objC0 = th1.c0(rg0Var.b, new ih(rg0Var, obj, (rq) null), rqVar);
                if (objC0 != lrVar) {
                    objC0 = uc1Var;
                }
                return objC0 == lrVar ? objC0 : uc1Var;
            case 3:
                return b((wr0) obj, rqVar);
            default:
                ((sh) obj2).p((uc1) obj);
                return uc1Var;
        }
    }

    public /* synthetic */ fi(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }
}
