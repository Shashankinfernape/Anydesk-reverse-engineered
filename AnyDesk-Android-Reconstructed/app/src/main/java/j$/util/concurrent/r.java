package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends l {
    public r e;
    public r f;
    public r g;
    public r h;
    public boolean i;

    public r(int i, Object obj, Object obj2, l lVar, r rVar) {
        super(i, obj, obj2, lVar);
        this.e = rVar;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[PHI: r8
  0x0047: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x0040, B:21:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x004d A[SYNTHETIC] */
    public final r b(int i, Object obj, Class cls) {
        r rVarB;
        if (obj == null) {
            return null;
        }
        r rVar = this;
        do {
            r rVar2 = rVar.f;
            r rVar3 = rVar.g;
            int i2 = rVar.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = rVar.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if (cls == null && (cls = ConcurrentHashMap.c(obj)) == null) {
                                rVarB = rVar3.b(i, obj, cls);
                                if (rVarB != null) {
                                    return rVarB;
                                }
                            } else {
                                int i3 = ConcurrentHashMap.g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    rVarB = rVar3.b(i, obj, cls);
                                    if (rVarB != null) {
                                        return rVarB;
                                    }
                                } else if (iCompareTo >= 0) {
                                    rVar2 = rVar3;
                                }
                            }
                        }
                        rVar = rVar2;
                    }
                }
                rVar = rVar3;
            } else {
                rVar = rVar2;
            }
        } while (rVar != null);
        return null;
    }
}
