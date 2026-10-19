package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends l {
    public final l[] e;

    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        l lVarK;
        Object obj2;
        l[] lVarArr = this.e;
        while (true) {
            int length = lVarArr.length;
            if (length == 0 || (lVarK = ConcurrentHashMap.k(lVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = lVarK.a;
                if (i2 == i && ((obj2 = lVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVarK;
                }
                if (i2 >= 0) {
                    lVarK = lVarK.d;
                } else {
                    if (!(lVarK instanceof g)) {
                        return lVarK.a(i, obj);
                    }
                    lVarArr = ((g) lVarK).e;
                }
            } while (lVarK != null);
            return null;
        }
    }
}
