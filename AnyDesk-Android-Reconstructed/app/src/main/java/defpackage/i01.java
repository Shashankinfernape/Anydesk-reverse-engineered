package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i01 {
    public static final List a;
    public static final List b;

    static {
        List listAsList = Arrays.asList(Application.class, yz0.class);
        listAsList.getClass();
        a = listAsList;
        b = y90.J(yz0.class);
    }

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        int i = 0;
        while (true) {
            if (!(i < constructors.length)) {
                return null;
            }
            int i2 = i + 1;
            try {
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                parameterTypes.getClass();
                List listV = ae.V(parameterTypes);
                if (list.equals(listV)) {
                    return constructor;
                }
                if (list.size() == listV.size() && listV.containsAll(list)) {
                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }

    public static final ve1 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ve1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            nh0.m("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
