package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class m00 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public m00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int iCompare;
        mz mzVar = (mz) obj;
        mz mzVar2 = (mz) obj2;
        int i2 = this.a;
        if (i2 == 0) {
            throw null;
        }
        if (!mzVar.d()) {
            if (!mzVar2.d()) {
                ?? C = mzVar.c();
                ?? C2 = mzVar2.c();
                if (C <= C2) {
                    if (C >= C2) {
                        int i3 = this.b;
                        if (i2 == 1) {
                            return q51.a(i2, mzVar, mzVar2, i3);
                        }
                        if (i2 != 2) {
                            i = i3 != 2 ? 1 : -1;
                            iCompare = Long.compare(mzVar.i, mzVar2.i);
                        } else {
                            if (mzVar.c()) {
                                return q51.a(1, mzVar, mzVar2, i3);
                            }
                            i = i3 != 2 ? 1 : -1;
                            iCompare = Long.compare(mzVar.g, mzVar2.g);
                        }
                        return iCompare * i;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
