package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pf extends qb1 {
    public ArrayList C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;

    @Override // defpackage.qb1
    public final void A(long j) {
        ArrayList arrayList;
        this.e = j;
        if (j < 0 || (arrayList = this.C) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).A(j);
        }
    }

    @Override // defpackage.qb1
    public final void B(uj ujVar) {
        this.G |= 8;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).B(ujVar);
        }
    }

    @Override // defpackage.qb1
    public final void C(TimeInterpolator timeInterpolator) {
        this.G |= 1;
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((qb1) this.C.get(i)).C(timeInterpolator);
            }
        }
        this.f = timeInterpolator;
    }

    @Override // defpackage.qb1
    public final void D(us0 us0Var) {
        super.D(us0Var);
        this.G |= 4;
        if (this.C != null) {
            for (int i = 0; i < this.C.size(); i++) {
                ((qb1) this.C.get(i)).D(us0Var);
            }
        }
    }

    @Override // defpackage.qb1
    public final void E() {
        this.G |= 2;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).E();
        }
    }

    @Override // defpackage.qb1
    public final void F(long j) {
        this.d = j;
    }

    @Override // defpackage.qb1
    public final String H(String str) {
        String strH = super.H(str);
        for (int i = 0; i < this.C.size(); i++) {
            strH = strH + "\n" + ((qb1) this.C.get(i)).H(str.concat("  "));
        }
        return strH;
    }

    public final void I(qb1 qb1Var) {
        this.C.add(qb1Var);
        qb1Var.k = this;
        long j = this.e;
        if (j >= 0) {
            qb1Var.A(j);
        }
        if ((this.G & 1) != 0) {
            qb1Var.C(this.f);
        }
        if ((this.G & 2) != 0) {
            qb1Var.E();
        }
        if ((this.G & 4) != 0) {
            qb1Var.D(this.x);
        }
        if ((this.G & 8) != 0) {
            qb1Var.B(null);
        }
    }

    @Override // defpackage.qb1
    public final void c() {
        super.c();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).c();
        }
    }

    @Override // defpackage.qb1
    public final void d(yb1 yb1Var) {
        View view = yb1Var.b;
        if (t(view)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                qb1 qb1Var = (qb1) obj;
                if (qb1Var.t(view)) {
                    qb1Var.d(yb1Var);
                    yb1Var.c.add(qb1Var);
                }
            }
        }
    }

    @Override // defpackage.qb1
    public final void f(yb1 yb1Var) {
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).f(yb1Var);
        }
    }

    @Override // defpackage.qb1
    public final void g(yb1 yb1Var) {
        View view = yb1Var.b;
        if (t(view)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                qb1 qb1Var = (qb1) obj;
                if (qb1Var.t(view)) {
                    qb1Var.g(yb1Var);
                    yb1Var.c.add(qb1Var);
                }
            }
        }
    }

    @Override // defpackage.qb1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final qb1 clone() {
        pf pfVar = (pf) super.clone();
        pfVar.C = new ArrayList();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            qb1 qb1VarClone = ((qb1) this.C.get(i)).clone();
            pfVar.C.add(qb1VarClone);
            qb1VarClone.k = pfVar;
        }
        return pfVar;
    }

    @Override // defpackage.qb1
    public final void l(ViewGroup viewGroup, ah ahVar, ah ahVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.d;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            qb1 qb1Var = (qb1) this.C.get(i);
            if (j > 0 && (this.D || i == 0)) {
                long j2 = qb1Var.d;
                if (j2 > 0) {
                    qb1Var.F(j2 + j);
                } else {
                    qb1Var.F(j);
                }
            }
            qb1Var.l(viewGroup, ahVar, ahVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.qb1
    public final void w(View view) {
        super.w(view);
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).w(view);
        }
    }

    @Override // defpackage.qb1
    public final qb1 x(pb1 pb1Var) {
        super.x(pb1Var);
        return this;
    }

    @Override // defpackage.qb1
    public final void y(View view) {
        super.y(view);
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((qb1) this.C.get(i)).y(view);
        }
    }

    @Override // defpackage.qb1
    public final void z() {
        ArrayList arrayList;
        if (this.C.isEmpty()) {
            G();
            m();
            return;
        }
        vb1 vb1Var = new vb1();
        vb1Var.b = this;
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((qb1) obj).a(vb1Var);
        }
        this.E = this.C.size();
        if (this.D) {
            ArrayList arrayList3 = this.C;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((qb1) obj2).z();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.C.size();
            arrayList = this.C;
            if (i3 >= size3) {
                break;
            }
            ((qb1) arrayList.get(i3 - 1)).a(new vb1((qb1) this.C.get(i3)));
            i3++;
        }
        qb1 qb1Var = (qb1) arrayList.get(0);
        if (qb1Var != null) {
            qb1Var.z();
        }
    }
}
