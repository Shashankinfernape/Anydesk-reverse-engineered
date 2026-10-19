package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gg1 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                gg1 gg1Var = (gg1) arrayList.get(i);
                if (this.e == gg1Var.b) {
                    c(this.c, gg1Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(xf0 xf0Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        cq cqVar = (cq) ((bq) arrayList.get(0)).T;
        xf0Var.t();
        cqVar.b(xf0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((bq) arrayList.get(i2)).b(xf0Var, false);
        }
        if (i == 0 && cqVar.z0 > 0) {
            bu0.d(cqVar, xf0Var, arrayList, 0);
        }
        if (i == 1 && cqVar.A0 > 0) {
            bu0.d(cqVar, xf0Var, arrayList, 1);
        }
        try {
            xf0Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            bq bqVar = (bq) arrayList.get(i3);
            us0 us0Var = new us0(26);
            new WeakReference(bqVar);
            xf0.n(bqVar.I);
            xf0.n(bqVar.J);
            xf0.n(bqVar.K);
            xf0.n(bqVar.L);
            xf0.n(bqVar.M);
            this.d.add(us0Var);
        }
        if (i == 0) {
            iN = xf0.n(cqVar.I);
            iN2 = xf0.n(cqVar.K);
            xf0Var.t();
        } else {
            iN = xf0.n(cqVar.J);
            iN2 = xf0.n(cqVar.L);
            xf0Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, gg1 gg1Var) {
        int i2 = gg1Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            bq bqVar = (bq) obj;
            ArrayList arrayList2 = gg1Var.a;
            if (!arrayList2.contains(bqVar)) {
                arrayList2.add(bqVar);
            }
            if (i == 0) {
                bqVar.n0 = i2;
            } else {
                bqVar.o0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            string = string + " " + ((bq) obj).h0;
        }
        return string.concat(" >");
    }
}
