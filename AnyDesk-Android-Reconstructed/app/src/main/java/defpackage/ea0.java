package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends m2 {
    public final int c;
    public final int d;
    public final ArrayList e;

    public ea0(ArrayList arrayList, int i, int i2) {
        this.c = i;
        this.d = i2;
        this.e = arrayList;
    }

    @Override // defpackage.f2
    public final int a() {
        return this.e.size() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= a() || size > i) {
                id.n("Illegal attempt to access index ", i, " in ItemSnapshotList of size ", a());
                return null;
            }
        }
        return null;
    }
}
