package defpackage;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ce {
    public final Field a;
    public final ke b;
    public final oe c;
    public final int d;
    public final int e;
    public final ne f;
    public final boolean g;

    public ce(Field field, ke keVar) throws fe {
        this.a = field;
        this.b = keVar;
        oe oeVarType = keVar.type();
        this.c = oeVarType;
        me meVarCls = keVar.cls();
        this.d = r71.z(meVarCls == me.e ? keVar.tagNumber() != -1 ? me.d : me.c : meVarCls);
        this.e = keVar.tagNumber() != -1 ? keVar.tagNumber() : (oeVarType == oe.d || oeVarType == oe.c) ? -1 : r71.A(oeVarType);
        ne neVarTagging = keVar.tagging();
        this.f = neVarTagging;
        if ((neVarTagging != ne.d && neVarTagging != ne.e) || keVar.tagNumber() != -1) {
            this.g = keVar.optional();
        } else {
            throw new fe("Tag number must be specified when tagging mode is " + neVarTagging);
        }
    }

    public final void a(fj0 fj0Var, Object obj) {
        int i = fj0Var.a;
        int i2 = this.d;
        int i3 = this.e;
        if (i3 != -1) {
            int i4 = fj0Var.b;
            if (i != i2 || i4 != i3) {
                throw new de("Tag mismatch. Expected: " + r71.N(i2, i3) + ", but found " + r71.N(i, i4));
            }
        } else if (i != i2) {
            throw new de("Tag mismatch. Expected class: " + r71.O(i2) + ", but found " + r71.O(i));
        }
        if (this.f == ne.d) {
            try {
                fj0Var = new zh(0, ((ByteBuffer) fj0Var.d).slice()).b();
            } catch (jg e) {
                throw new fe("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.a;
        oe oeVar = this.c;
        try {
            int iOrdinal = oeVar.ordinal();
            if (iOrdinal != 6 && iOrdinal != 7) {
                field.set(obj, r71.n(oeVar, fj0Var, field.getType()));
            } else if (le.class.equals(field.getType())) {
                field.set(obj, r71.n(oeVar, fj0Var, field.getType()));
            } else {
                field.set(obj, d6.z(fj0Var, d6.a(field)));
            }
        } catch (ReflectiveOperationException e2) {
            throw new fe("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
