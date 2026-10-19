package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class jf0 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, ff0 ff0Var) {
        try {
            constructor.newInstance(ff0Var).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:0x013f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i;
        boolean z;
        Class<?> cls2;
        HashMap map = a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = p71.R(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = b;
            if (declaredConstructor == null) {
                im imVar = im.c;
                HashMap map3 = imVar.b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((yq0) declaredMethods[i3].getAnnotation(yq0.class)) != null) {
                                imVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && ff0.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            i = 0;
                            while (true) {
                                if (i < interfaces.length) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (arrayList != null) {
                                        break;
                                    }
                                    map2.put(cls, arrayList);
                                } else {
                                    int i4 = i + 1;
                                    cls2 = interfaces[i];
                                    if (cls2 == null) {
                                    }
                                    i = i4;
                                }
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        i = 0;
                        while (true) {
                            if (i < interfaces.length) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (arrayList != null) {
                                    break;
                                }
                                map2.put(cls, arrayList);
                            } else {
                                int i5 = i + 1;
                                try {
                                    cls2 = interfaces[i];
                                    if (cls2 == null && ff0.class.isAssignableFrom(cls2)) {
                                        cls2.getClass();
                                        if (b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        obj2.getClass();
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i = i5;
                                } catch (ArrayIndexOutOfBoundsException e3) {
                                    throw new NoSuchElementException(e3.getMessage());
                                }
                            }
                        }
                    }
                }
            } else {
                map2.put(cls, y90.J(declaredConstructor));
            }
            i2 = 2;
            break;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
