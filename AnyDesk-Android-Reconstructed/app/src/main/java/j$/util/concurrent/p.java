package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class p {
    public l[] a;
    public l b = null;
    public o c;
    public o d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public p(l[] lVarArr, int i, int i2, int i3) {
        this.a = lVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    public final l a() {
        l[] lVarArr;
        int length;
        int i;
        o oVar;
        int i2;
        int i3;
        int i4;
        int i5;
        l lVar = this.b;
        if (lVar != null) {
            lVar = lVar.d;
        }
        while (lVar == null) {
            if (this.f >= this.g || (lVarArr = this.a) == null || (length = lVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            l lVarK = ConcurrentHashMap.k(lVarArr, i);
            if (lVarK == null || lVarK.a >= 0) {
                lVar = lVarK;
                if (this.c != null) {
                    while (true) {
                        oVar = this.c;
                        if (oVar != null) {
                            break;
                        }
                        int i6 = this.e;
                        i3 = oVar.a;
                        i4 = i6 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.e = oVar.b;
                        this.a = oVar.c;
                        oVar.c = null;
                        o oVar2 = oVar.d;
                        oVar.d = this.d;
                        this.c = oVar2;
                        this.d = oVar;
                        length = i3;
                    }
                    if (oVar == null) {
                        i2 = this.e + this.h;
                        this.e = i2;
                        if (i2 >= length) {
                            int i7 = this.f + 1;
                            this.f = i7;
                            this.e = i7;
                        }
                    }
                } else {
                    i5 = i + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i8 = this.f + 1;
                        this.f = i8;
                        this.e = i8;
                    }
                }
            } else if (lVarK instanceof g) {
                this.a = ((g) lVarK).e;
                o oVar3 = this.d;
                if (oVar3 != null) {
                    this.d = oVar3.d;
                } else {
                    oVar3 = new o();
                }
                oVar3.c = lVarArr;
                oVar3.a = length;
                oVar3.b = i;
                oVar3.d = this.c;
                this.c = oVar3;
                lVar = null;
            } else {
                lVar = lVarK instanceof q ? ((q) lVarK).f : null;
                if (this.c != null) {
                    while (true) {
                        oVar = this.c;
                        if (oVar != null) {
                            break;
                            break;
                        }
                        int i9 = this.e;
                        i3 = oVar.a;
                        i4 = i9 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                            break;
                        }
                        this.e = oVar.b;
                        this.a = oVar.c;
                        oVar.c = null;
                        o oVar4 = oVar.d;
                        oVar.d = this.d;
                        this.c = oVar4;
                        this.d = oVar;
                        length = i3;
                    }
                    if (oVar == null) {
                        i2 = this.e + this.h;
                        this.e = i2;
                        if (i2 >= length) {
                            int i10 = this.f + 1;
                            this.f = i10;
                            this.e = i10;
                        }
                    }
                } else {
                    i5 = i + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i11 = this.f + 1;
                        this.f = i11;
                        this.e = i11;
                    }
                }
            }
        }
        this.b = lVar;
        return lVar;
    }
}
