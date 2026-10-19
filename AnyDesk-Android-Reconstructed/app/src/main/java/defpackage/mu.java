package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class mu extends kt {
    public int m;

    public mu(hg1 hg1Var) {
        super(hg1Var);
        if (hg1Var instanceof y70) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.kt
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ht htVar = (ht) obj;
            htVar.a(htVar);
        }
    }
}
