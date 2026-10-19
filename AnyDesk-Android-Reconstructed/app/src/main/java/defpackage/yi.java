package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yi {
    public static final /* synthetic */ Unsafe a = b();

    public static /* synthetic */ Object a(Unsafe unsafe, Object obj, long j, u81 u81Var) {
        while (true) {
            Object objectVolatile = unsafe.getObjectVolatile(obj, j);
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            u81 u81Var2 = u81Var;
            if (unsafe2.compareAndSwapObject(obj2, j2, objectVolatile, u81Var2)) {
                return objectVolatile;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            u81Var = u81Var2;
        }
    }

    public static /* synthetic */ Unsafe b() {
        Field field;
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    break;
                }
                i++;
            }
            if (field != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
            declaredField = field;
        }
        declaredField.setAccessible(true);
        try {
            return (Unsafe) declaredField.get(null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
