package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class g70 {
    public final SparseIntArray a;
    public final SparseIntArray b;

    public g70(int i) {
        switch (i) {
            case 1:
                this.a = new SparseIntArray();
                this.b = new SparseIntArray();
                break;
            default:
                this.a = new SparseIntArray();
                this.b = new SparseIntArray();
                break;
        }
    }

    public static int a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void b() {
        this.a.clear();
    }
}
