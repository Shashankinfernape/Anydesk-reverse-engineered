package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ge {
    public final Field a;
    public final Object b;
    public final ke c;
    public final oe d;
    public final oe e;
    public final int f;
    public final int g;
    public final ne h;
    public final boolean i;

    public ge(Object obj, Field field, ke keVar) throws je {
        this.b = obj;
        this.a = field;
        this.c = keVar;
        oe oeVarType = keVar.type();
        this.d = oeVarType;
        this.e = keVar.elementType();
        me meVarCls = keVar.cls();
        this.f = r71.z(meVarCls == me.e ? keVar.tagNumber() != -1 ? me.d : me.c : meVarCls);
        this.g = keVar.tagNumber() != -1 ? keVar.tagNumber() : (oeVarType == oe.d || oeVarType == oe.c) ? -1 : r71.A(oeVarType);
        ne neVarTagging = keVar.tagging();
        this.h = neVarTagging;
        if ((neVarTagging != ne.d && neVarTagging != ne.e) || keVar.tagNumber() != -1) {
            this.i = keVar.optional();
        } else {
            throw new je("Tag number must be specified when tagging mode is " + neVarTagging);
        }
    }

    public final byte[] a() {
        Object objD = ie.d(this.b, this.a);
        if (objD == null) {
            if (this.i) {
                return null;
            }
            throw new je("Required field not set");
        }
        byte[] bArrT = hq.T(objD, this.d, this.e);
        ne neVar = this.h;
        int iOrdinal = neVar.ordinal();
        if (iOrdinal == 0) {
            return bArrT;
        }
        int i = this.f;
        int i2 = this.g;
        if (iOrdinal == 1) {
            return ie.a(i, true, i2, bArrT);
        }
        if (iOrdinal != 2) {
            nh0.p(neVar, "Unknown tagging mode: ");
            return null;
        }
        byte b = bArrT[0];
        if ((b & 31) == 31) {
            throw new je("High-tag-number form not supported");
        }
        if (i2 >= 31) {
            throw new je(gr0.e(i2, "Unsupported high tag number: "));
        }
        byte b2 = (byte) ((b & (-32)) | i2);
        bArrT[0] = b2;
        bArrT[0] = (byte) ((b2 & 63) | (i << 6));
        return bArrT;
    }
}
