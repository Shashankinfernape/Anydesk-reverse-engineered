package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class la {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public af1 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public h51 p;

    public static void a(la laVar, u9 u9Var) {
        if (u9Var == null) {
            return;
        }
        ArrayList arrayList = u9Var.g;
        if (u9Var.a()) {
            laVar.a.addAll(u9Var.i);
        }
        if (u9Var.b()) {
            laVar.b.addAll(u9Var.h);
        }
        int i = u9Var.a;
        int i2 = 0;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            laVar.j = new af1((j9) arrayList.get(0));
            return;
        }
        if (i == 31) {
            laVar.n = u9Var.b;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                laVar.h.add(new ja((t9) obj));
            }
            laVar.p = u9Var.f;
            return;
        }
        if (i == 2) {
            laVar.l = u9Var.b;
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                laVar.f.add(new ha((t9) obj2));
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                id.q("Unknown Signing Block Scheme Id");
                return;
            }
            laVar.o = u9Var.b;
            int size3 = arrayList.size();
            while (i2 < size3) {
                Object obj3 = arrayList.get(i2);
                i2++;
                laVar.i.add(new ka((t9) obj3));
            }
            return;
        }
        laVar.m = u9Var.b;
        int size4 = arrayList.size();
        while (i2 < size4) {
            Object obj4 = arrayList.get(i2);
            i2++;
            laVar.g.add(new ja((t9) obj4));
        }
        if (laVar.p == null) {
            laVar.p = u9Var.f;
        }
    }

    public static void b(la laVar, z7 z7Var) {
        int i = z7Var.a;
        ArrayList arrayList = (ArrayList) z7Var.c;
        if (i != 0) {
            throw new IllegalArgumentException("Unknown ApkSigResult Signing Block Scheme Id " + i);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        laVar.j = new af1((j9) arrayList.get(0));
    }

    public final void c(ea eaVar, Object... objArr) {
        this.a.add(new fa(eaVar, objArr));
    }

    public final boolean d() {
        if (!this.a.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((ga) obj).c.isEmpty()) {
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (!((ha) obj2).c.isEmpty()) {
                    return true;
                }
            }
        }
        ArrayList arrayList3 = this.g;
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (!((ja) obj3).b.isEmpty()) {
                    return true;
                }
            }
        }
        ArrayList arrayList4 = this.h;
        if (!arrayList4.isEmpty()) {
            int size4 = arrayList4.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList4.get(i4);
                i4++;
                if (!((ja) obj4).b.isEmpty()) {
                    return true;
                }
            }
        }
        af1 af1Var = this.j;
        return (af1Var == null || ((ArrayList) af1Var.d).isEmpty()) ? false : true;
    }
}
