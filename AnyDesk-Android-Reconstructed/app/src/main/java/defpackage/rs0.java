package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rs0 {
    public final fw a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final sh i;
    public final sh j;
    public final LinkedHashMap k;
    public final y6 l;

    public rs0(fw fwVar) {
        this.a = fwVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.i = ec1.a(-1, 6, null);
        this.j = ec1.a(-1, 6, null);
        this.k = new LinkedHashMap();
        y6 y6Var = new y6(20);
        y6Var.L(xg0.c, tg0.b);
        this.l = y6Var;
    }

    public final pt0 a(tf1 tf1Var) {
        Integer numValueOf;
        ArrayList arrayList = this.c;
        List listW0 = tm.w0(arrayList);
        if (tf1Var != null) {
            int i = tf1Var.e;
            int size = this.e;
            int i2 = -this.d;
            int size2 = (arrayList.size() - 1) - this.d;
            int i3 = i2;
            while (i3 < i) {
                size += i3 > size2 ? 100 : ((nt0) arrayList.get(this.d + i3)).c.size();
                i3++;
            }
            int i4 = size + tf1Var.f;
            if (i < i2) {
                i4 -= 100;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new pt0(listW0, numValueOf, this.a, this.e);
    }

    public final void b(qr0 qr0Var) {
        int i = qr0Var.d;
        xg0 xg0Var = qr0Var.a;
        int iB = qr0Var.b();
        ArrayList arrayList = this.c;
        if (iB > arrayList.size()) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + qr0Var.b()).toString());
        }
        this.k.remove(xg0Var);
        this.l.L(xg0Var, ug0.c);
        int iOrdinal = xg0Var.ordinal();
        ArrayList arrayList2 = this.b;
        if (iOrdinal == 1) {
            int iB2 = qr0Var.b();
            for (int i2 = 0; i2 < iB2; i2++) {
                arrayList2.remove(0);
            }
            this.d -= qr0Var.b();
            if (i == Integer.MIN_VALUE) {
                i = 0;
            }
            this.e = i;
            int i3 = this.g + 1;
            this.g = i3;
            this.i.p(Integer.valueOf(i3));
            return;
        }
        if (iOrdinal != 2) {
            id.p(xg0Var, "cannot drop ");
            return;
        }
        int iB3 = qr0Var.b();
        for (int i4 = 0; i4 < iB3; i4++) {
            arrayList2.remove(arrayList.size() - 1);
        }
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f = i;
        int i5 = this.h + 1;
        this.h = i5;
        this.j.p(Integer.valueOf(i5));
    }

    public final qr0 c(xg0 xg0Var, vf1 vf1Var) {
        xg0Var.getClass();
        vf1Var.getClass();
        ArrayList arrayList = this.c;
        if (arrayList.size() > 2) {
            int size = arrayList.size();
            int size2 = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                size2 += ((nt0) obj).c.size();
            }
            if (size2 > 500) {
                if (xg0Var == xg0.c) {
                    nh0.i(xg0Var, "Drop LoadType must be PREPEND or APPEND, but got ");
                    return null;
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 < arrayList.size()) {
                    int size3 = arrayList.size();
                    int size4 = 0;
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        size4 += ((nt0) obj2).c.size();
                    }
                    if (size4 - i3 <= 500) {
                        break;
                    }
                    int[] iArr = ps0.a;
                    int size5 = iArr[xg0Var.ordinal()] == 2 ? ((nt0) arrayList.get(i2)).c.size() : ((nt0) arrayList.get(um.Z(arrayList) - i2)).c.size();
                    if (((iArr[xg0Var.ordinal()] == 2 ? vf1Var.a : vf1Var.b) - i3) - size5 < 50) {
                        break;
                    }
                    i3 += size5;
                    i2++;
                }
                if (i2 != 0) {
                    int[] iArr2 = ps0.a;
                    return new qr0(xg0Var, iArr2[xg0Var.ordinal()] == 2 ? -this.d : (um.Z(arrayList) - this.d) - (i2 - 1), iArr2[xg0Var.ordinal()] == 2 ? (i2 - 1) - this.d : um.Z(arrayList) - this.d, (xg0Var == xg0.d ? this.e : this.f) + i3);
                }
            }
        }
        return null;
    }

    public final boolean d(int i, xg0 xg0Var, nt0 nt0Var) {
        xg0Var.getClass();
        nt0Var.getClass();
        int i2 = nt0Var.f;
        List list = nt0Var.c;
        int i3 = nt0Var.g;
        int iOrdinal = xg0Var.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                nh0.j("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                nh0.j("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(nt0Var);
            this.d = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this.e = i2;
            return true;
        }
        LinkedHashMap linkedHashMap = this.k;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                nh0.j("should've received an init before append");
                return false;
            }
            if (i == this.h) {
                arrayList.add(nt0Var);
                if (i3 == Integer.MIN_VALUE) {
                    int size = this.f - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this.f = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap.remove(xg0.e);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                nh0.j("should've received an init before prepend");
                return false;
            }
            if (i == this.g) {
                arrayList.add(0, nt0Var);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    int size2 = this.e - list.size();
                    i2 = size2 < 0 ? 0 : size2;
                }
                this.e = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap.remove(xg0.d);
                return true;
            }
        }
        return false;
    }

    public final sr0 e(nt0 nt0Var, xg0 xg0Var) {
        nt0Var.getClass();
        int iOrdinal = xg0Var.ordinal();
        int size = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                size = 0 - this.d;
            } else {
                if (iOrdinal != 2) {
                    throw new pn();
                }
                size = (this.c.size() - this.d) - 1;
            }
        }
        List listJ = y90.J(new mb1(size, nt0Var.c));
        int iOrdinal2 = xg0Var.ordinal();
        y6 y6Var = this.l;
        if (iOrdinal2 == 0) {
            sr0 sr0Var = sr0.g;
            return new sr0(xg0.c, listJ, this.e, this.f, y6Var.M(), null);
        }
        if (iOrdinal2 == 1) {
            sr0 sr0Var2 = sr0.g;
            return new sr0(xg0.d, listJ, this.e, -1, y6Var.M(), null);
        }
        if (iOrdinal2 != 2) {
            throw new pn();
        }
        sr0 sr0Var3 = sr0.g;
        return new sr0(xg0.e, listJ, -1, this.f, y6Var.M(), null);
    }
}
