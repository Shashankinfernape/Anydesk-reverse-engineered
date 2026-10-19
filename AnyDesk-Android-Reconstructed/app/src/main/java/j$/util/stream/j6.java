package j$.util.stream;

import j$.util.Collection$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class j6 extends b6 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        } else {
            i2.b("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void m() {
        ArrayList arrayList = this.d;
        Comparator comparator = this.b;
        Object[] array = arrayList.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = arrayList.listIterator();
        int i = 0;
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
        long size = this.d.size();
        n5 n5Var = this.a;
        n5Var.c(size);
        boolean z = this.c;
        ArrayList arrayList2 = this.d;
        if (z) {
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                if (n5Var.e()) {
                    break;
                } else {
                    n5Var.o(obj2);
                }
            }
        } else {
            Objects.requireNonNull(n5Var);
            Collection$EL.a(arrayList2, new j$.util.p(9, n5Var));
        }
        n5Var.m();
        this.d = null;
    }
}
