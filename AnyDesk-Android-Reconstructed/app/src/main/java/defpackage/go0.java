package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class go0 extends ko0 {
    public final Class s;

    public go0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            nh0.f(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.ko0, defpackage.lo0
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.ko0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        str.getClass();
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            String strName = ((Enum) obj).name();
            if (strName == null ? false : strName.equalsIgnoreCase(str)) {
                break;
            }
            i++;
        }
        Enum r5 = (Enum) obj;
        if (r5 != null) {
            return r5;
        }
        StringBuilder sbN = q51.n("Enum value ", str, " not found for type ");
        sbN.append(cls.getName());
        sbN.append('.');
        throw new IllegalArgumentException(sbN.toString());
    }
}
