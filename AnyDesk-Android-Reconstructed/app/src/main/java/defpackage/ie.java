package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ie {
    public static final /* synthetic */ int a = 0;

    static {
        ByteBuffer.wrap(new byte[]{5, 0});
    }

    public static byte[] a(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            id.q(gr0.e(i2, "High tag numbers not supported: "));
            return null;
        }
        int i3 = 6;
        byte b = (byte) ((i << 6) | (z ? 32 : 0) | i2);
        int length = 0;
        for (byte[] bArr3 : bArr) {
            length += bArr3.length;
        }
        int length2 = 2;
        if (length < 128) {
            bArr2 = new byte[length + 2];
            bArr2[0] = b;
            bArr2[1] = (byte) length;
        } else {
            if (length <= 255) {
                byte[] bArr4 = new byte[length + 3];
                bArr4[1] = -127;
                bArr4[2] = (byte) length;
                bArr2 = bArr4;
                i3 = 3;
            } else if (length <= 65535) {
                byte[] bArr5 = new byte[length + 4];
                bArr5[1] = -126;
                bArr5[2] = (byte) (length >> 8);
                bArr5[3] = (byte) (length & 255);
                bArr2 = bArr5;
                i3 = 4;
            } else if (length <= 16777215) {
                byte[] bArr6 = new byte[length + 5];
                bArr6[1] = -125;
                bArr6[2] = (byte) (length >> 16);
                bArr6[3] = (byte) ((length >> 8) & 255);
                bArr6[4] = (byte) (length & 255);
                bArr2 = bArr6;
                i3 = 5;
            } else {
                byte[] bArr7 = new byte[length + 6];
                bArr7[1] = -124;
                bArr7[2] = (byte) (length >> 24);
                bArr7[3] = (byte) ((length >> 16) & 255);
                bArr7[4] = (byte) ((length >> 8) & 255);
                bArr7[5] = (byte) (length & 255);
                bArr2 = bArr7;
            }
            bArr2[0] = b;
            length2 = i3;
        }
        for (byte[] bArr8 : bArr) {
            System.arraycopy(bArr8, 0, bArr2, length2, bArr8.length);
            length2 += bArr8.length;
        }
        return bArr2;
    }

    public static byte[] b(Object obj) {
        Class<?> cls = obj.getClass();
        ee eeVar = (ee) uj.n(cls);
        if (eeVar == null) {
            throw new je(cls.getName() + " not annotated with " + ee.class.getName());
        }
        oe oeVarType = eeVar.type();
        int iOrdinal = oeVarType.ordinal();
        if (iOrdinal == 1) {
            return e(obj);
        }
        if (iOrdinal == 5) {
            return f(obj, false);
        }
        if (iOrdinal == 12) {
            return f(obj, true);
        }
        throw new je("Unsupported container type: " + oeVarType);
    }

    public static ArrayList c(Object obj) throws je {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            ke keVar = (ke) field.getAnnotation(ke.class);
            if (keVar != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new je(ke.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new ge(obj, field, keVar));
                } catch (je e) {
                    throw new je("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    public static Object d(Object obj, Field field) throws je {
        try {
            return field.get(obj);
        } catch (ReflectiveOperationException e) {
            throw new je("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    public static byte[] e(Object obj) throws je {
        Class<?> cls = obj.getClass();
        ArrayList arrayListC = c(obj);
        if (arrayListC.isEmpty()) {
            throw new je("No fields annotated with " + ke.class.getName() + " in CHOICE class " + cls.getName());
        }
        int size = arrayListC.size();
        ge geVar = null;
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListC.get(i);
            i++;
            ge geVar2 = (ge) obj2;
            if (d(obj, geVar2.a) != null) {
                if (geVar != null) {
                    throw new je("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + geVar.a.getName() + ", " + geVar2.a.getName());
                }
                geVar = geVar2;
            }
        }
        if (geVar != null) {
            return geVar.a();
        }
        throw new je("No non-null fields in CHOICE class ".concat(cls.getName()));
    }

    public static byte[] f(Object obj, boolean z) throws je {
        Class<?> cls = obj.getClass();
        ArrayList arrayListC = c(obj);
        Collections.sort(arrayListC, new x9(2));
        if (arrayListC.size() > 1) {
            int size = arrayListC.size();
            ge geVar = null;
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListC.get(i);
                i++;
                ge geVar2 = (ge) obj2;
                if (geVar != null && geVar.c.index() == geVar2.c.index()) {
                    throw new je("Fields have the same index: " + cls.getName() + "." + geVar.a.getName() + " and ." + geVar2.a.getName());
                }
                geVar = geVar2;
            }
        }
        ArrayList arrayList = new ArrayList(arrayListC.size());
        int size2 = arrayListC.size();
        int length = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayListC.get(i2);
            i2++;
            ge geVar3 = (ge) obj3;
            try {
                byte[] bArrA = geVar3.a();
                if (bArrA != null) {
                    arrayList.add(bArrA);
                    length += bArrA.length;
                }
            } catch (je e) {
                throw new je("Failed to encode " + cls.getName() + "." + geVar3.a.getName(), e);
            }
        }
        if (!z) {
            return a(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
        }
        byte[] bArr = new byte[length];
        int size3 = arrayList.size();
        int length2 = 0;
        int i3 = 0;
        while (i3 < size3) {
            Object obj4 = arrayList.get(i3);
            i3++;
            byte[] bArr2 = (byte[]) obj4;
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] g(Collection collection, oe oeVar, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(hq.T(it.next(), oeVar, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, he.b);
            }
            i = 17;
        } else {
            i = 16;
        }
        return a(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }
}
