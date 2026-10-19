package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ss0 {
    public static final ss0 e;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    static {
        sr0 sr0Var = sr0.g;
        sr0Var.getClass();
        e = new ss0(sr0Var.b, sr0Var.c, sr0Var.d);
    }

    public ss0(List list, int i, int i2) {
        list.getClass();
        this.a = new ArrayList(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((mb1) it.next()).b.size();
        }
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    public final tf1 a(int i) {
        ArrayList arrayList;
        int i2 = 0;
        int size = i - this.c;
        while (true) {
            arrayList = this.a;
            if (size < ((mb1) arrayList.get(i2)).b.size() || i2 >= um.Z(arrayList)) {
                break;
            }
            size -= ((mb1) arrayList.get(i2)).b.size();
            i2++;
        }
        return new tf1(((mb1) arrayList.get(i2)).c, size, i - this.c, ((e() - i) - this.d) - 1, c(), d());
    }

    public final Object b(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((mb1) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((mb1) arrayList.get(i2)).b.get(i);
    }

    public final int c() {
        Integer numValueOf;
        int[] iArr = ((mb1) tm.i0(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i > i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final int d() {
        Integer numValueOf;
        int[] iArr = ((mb1) tm.o0(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final int e() {
        return this.c + this.b + this.d;
    }

    public final th1 f(wr0 wr0Var) {
        wr0Var.getClass();
        boolean z = wr0Var instanceof sr0;
        ArrayList arrayList = this.a;
        if (!z) {
            if (!(wr0Var instanceof qr0)) {
                nh0.j("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            qr0 qr0Var = (qr0) wr0Var;
            int i = qr0Var.b;
            int i2 = qr0Var.d;
            w90 w90Var = new w90(i, qr0Var.c, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                mb1 mb1Var = (mb1) it.next();
                for (int i3 : mb1Var.a) {
                    if (w90Var.c <= i3 && i3 <= w90Var.d) {
                        size += mb1Var.b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i4 = this.b - size;
            this.b = i4;
            if (qr0Var.a == xg0.d) {
                int i5 = this.c;
                this.c = i2;
                return new bt0(size, i2, i5);
            }
            int i6 = this.d;
            this.d = i2;
            return new at0(this.c + i4, size, i2, i6);
        }
        sr0 sr0Var = (sr0) wr0Var;
        List list = sr0Var.b;
        Iterator it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((mb1) it2.next()).b.size();
        }
        int iOrdinal = sr0Var.a.ordinal();
        if (iOrdinal == 0) {
            nh0.j("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (iOrdinal == 1) {
            int i7 = this.c;
            arrayList.addAll(0, list);
            this.b += size2;
            this.c = sr0Var.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                zm.d0(((mb1) it3.next()).b, arrayList2);
            }
            return new ct0(arrayList2, this.c, i7);
        }
        if (iOrdinal != 2) {
            throw new pn();
        }
        int i8 = this.d;
        int i9 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += size2;
        this.d = sr0Var.d;
        int i10 = this.c + i9;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            zm.d0(((mb1) it4.next()).b, arrayList3);
        }
        return new zs0(i10, arrayList3, this.d, i8);
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b(i2));
        }
        return "[(" + this.c + " placeholders), " + tm.n0(arrayList, null, null, null, 63) + ", (" + this.d + " placeholders)]";
    }
}
