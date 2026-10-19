package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ux extends m2 implements tx, Serializable {
    public final Enum[] c;

    public ux(Enum[] enumArr) {
        this.c = enumArr;
    }

    @Override // defpackage.f2
    public final int a() {
        return this.c.length;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // defpackage.f2, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.c;
            if (iOrdinal < enumArr.length) {
                r0 = enumArr[iOrdinal];
            } else {
                r0 = null;
            }
        } else {
            r0 = null;
        }
        return r0 == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.c;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        id.h("index: ", i, ", size: ", length);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // defpackage.m2, java.util.List
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.c;
            if (iOrdinal < enumArr.length) {
                r2 = enumArr[iOrdinal];
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // defpackage.m2, java.util.List
    public final int lastIndexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.c;
            if (iOrdinal < enumArr.length) {
                r2 = enumArr[iOrdinal];
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }
}
