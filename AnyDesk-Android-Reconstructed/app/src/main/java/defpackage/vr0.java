package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vr0 extends wr0 {
    public final List a;
    public final wg0 b;

    public vr0(List list, wg0 wg0Var) {
        list.getClass();
        this.a = list;
        this.b = wg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:21:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.wr0
    public final java.lang.Object a(defpackage.s1 r7, defpackage.rq r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ur0
            if (r0 == 0) goto L13
            r0 = r8
            ur0 r0 = (defpackage.ur0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L1a
        L13:
            ur0 r0 = new ur0
            sq r8 = (defpackage.sq) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.k
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.util.Collection r7 = r0.j
            java.util.Iterator r1 = r0.i
            java.util.Collection r3 = r0.h
            d60 r4 = r0.g
            vr0 r5 = r0.f
            defpackage.y90.V(r8)
            goto L72
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.nh0.j(r7)
            r7 = 0
            return r7
        L38:
            defpackage.y90.V(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            java.util.List r3 = r6.a
            int r1 = defpackage.vm.c0(r3, r1)
            r8.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
            r5 = r6
        L50:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r1.next()
            r0.f = r5
            r0.g = r8
            r0.h = r7
            r0.i = r1
            r0.j = r7
            r0.m = r2
            java.lang.Object r3 = r8.f(r3, r0)
            lr r4 = defpackage.lr.c
            if (r3 != r4) goto L6f
            return r4
        L6f:
            r4 = r8
            r8 = r3
            r3 = r7
        L72:
            r7.add(r8)
            r7 = r3
            r8 = r4
            goto L50
        L78:
            java.util.List r7 = (java.util.List) r7
            wg0 r8 = r5.b
            vr0 r0 = new vr0
            r0.<init>(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr0.a(s1, rq):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return y90.e(this.a, vr0Var.a) && this.b.equals(vr0Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
        List list = this.a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(tm.j0(list));
        sb.append("\n                    |   last item: ");
        sb.append(tm.p0(list));
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.b);
        sb.append("\n                    ");
        return j71.M(sb.toString().concat("|)"));
    }
}
