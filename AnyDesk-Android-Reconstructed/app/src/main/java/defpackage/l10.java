package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l10 {
    public int a;
    public int b;
    public final qd c = new qd();
    public final y6 d = new y6(20);
    public wg0 e;
    public boolean f;

    public final void a(wr0 wr0Var) {
        wr0Var.getClass();
        this.f = true;
        boolean z = wr0Var instanceof sr0;
        int i = 0;
        qd qdVar = this.c;
        y6 y6Var = this.d;
        if (z) {
            sr0 sr0Var = (sr0) wr0Var;
            wg0 wg0Var = sr0Var.e;
            int i2 = sr0Var.c;
            int i3 = sr0Var.d;
            List list = sr0Var.b;
            y6Var.J(wg0Var);
            this.e = sr0Var.f;
            int iOrdinal = sr0Var.a.ordinal();
            if (iOrdinal == 0) {
                qdVar.clear();
                this.b = i3;
                this.a = i2;
                qdVar.addAll(list);
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    return;
                }
                this.b = i3;
                qdVar.addAll(list);
                return;
            }
            this.a = i2;
            Iterator it = new u90(list.size() - 1, 0, -1).iterator();
            while (((v90) it).e) {
                qdVar.addFirst(list.get(((t90) it).nextInt()));
            }
            return;
        }
        if (!(wr0Var instanceof qr0)) {
            if (wr0Var instanceof tr0) {
                tr0 tr0Var = (tr0) wr0Var;
                y6Var.J(tr0Var.a);
                this.e = tr0Var.b;
                return;
            } else {
                if (wr0Var instanceof vr0) {
                    vr0 vr0Var = (vr0) wr0Var;
                    y6Var.J(vr0Var.b);
                    qdVar.clear();
                    this.b = 0;
                    this.a = 0;
                    qdVar.addLast(new mb1(0, vr0Var.a));
                    return;
                }
                return;
            }
        }
        qr0 qr0Var = (qr0) wr0Var;
        xg0 xg0Var = qr0Var.a;
        int i4 = qr0Var.d;
        y6Var.L(xg0Var, ug0.c);
        int iOrdinal2 = xg0Var.ordinal();
        if (iOrdinal2 == 1) {
            this.a = i4;
            int iB = qr0Var.b();
            while (i < iB) {
                qdVar.removeFirst();
                i++;
            }
            return;
        }
        if (iOrdinal2 != 2) {
            id.q("Page drop type must be prepend or append");
            return;
        }
        this.b = i4;
        int iB2 = qr0Var.b();
        while (i < iB2) {
            qdVar.removeLast();
            i++;
        }
    }

    public final List b() {
        if (!this.f) {
            return mx.c;
        }
        ArrayList arrayList = new ArrayList();
        wg0 wg0VarM = this.d.M();
        qd qdVar = this.c;
        if (qdVar.isEmpty()) {
            arrayList.add(new tr0(wg0VarM, this.e));
            return arrayList;
        }
        sr0 sr0Var = sr0.g;
        arrayList.add(new sr0(xg0.c, tm.w0(qdVar), this.a, this.b, wg0VarM, this.e));
        return arrayList;
    }
}
