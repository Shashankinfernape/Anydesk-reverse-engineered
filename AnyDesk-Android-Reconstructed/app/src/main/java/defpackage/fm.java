package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements em {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List listAsList = Arrays.asList(o50.class, z50.class, d60.class, e60.class, as0.class, f60.class, g60.class, h60.class, i60.class, j60.class, p50.class, q50.class, r50.class, s50.class, t50.class, u50.class, v50.class, w50.class, x50.class, y50.class, a60.class, b60.class, c60.class);
        listAsList.getClass();
        ArrayList arrayList = new ArrayList(vm.c0(listAsList, 10));
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                um.b0();
                throw null;
            }
            arrayList.add(new st0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = mj0.Q(arrayList);
    }

    public fm(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final String a() {
        String strN;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strN2 = hq.N(cls.getName());
                return strN2 == null ? cls.getSimpleName() : strN2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strN = hq.N(componentType.getName())) != null) {
                strConcat = strN.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return p71.S(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iIndexOf = simpleName.indexOf(36, 0);
            return iIndexOf == -1 ? simpleName : simpleName.substring(iIndexOf + 1, simpleName.length());
        }
        return p71.S(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fm) && lk0.t(this).equals(lk0.t((fm) obj));
    }

    public final int hashCode() {
        return lk0.t(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
