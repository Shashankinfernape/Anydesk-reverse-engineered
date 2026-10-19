package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class im {
    public static final im c = new im();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, hm hmVar, ze0 ze0Var, Class cls) {
        ze0 ze0Var2 = (ze0) map.get(hmVar);
        if (ze0Var2 == null || ze0Var == ze0Var2) {
            if (ze0Var2 == null) {
                map.put(hmVar, ze0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + hmVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ze0Var2 + ", new value " + ze0Var);
    }

    public final gm a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            gm gmVarA = (gm) map2.get(superclass);
            if (gmVarA == null) {
                gmVarA = a(superclass, null);
            }
            map.putAll(gmVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            gm gmVarA2 = (gm) map2.get(cls2);
            if (gmVarA2 == null) {
                gmVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : gmVarA2.b.entrySet()) {
                b(map, (hm) entry.getKey(), (ze0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            yq0 yq0Var = (yq0) method.getAnnotation(yq0.class);
            if (yq0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!gf0.class.isAssignableFrom(parameterTypes[0])) {
                        id.q("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ze0 ze0VarValue = yq0Var.value();
                if (parameterTypes.length > 1) {
                    if (!ze0.class.isAssignableFrom(parameterTypes[1])) {
                        id.q("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (ze0VarValue != ze0.ON_ANY) {
                        id.q("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    id.q("cannot have more than 2 params");
                    return null;
                }
                b(map, new hm(i, method), ze0VarValue, cls);
                z = true;
            }
        }
        gm gmVar = new gm(map);
        map2.put(cls, gmVar);
        this.b.put(cls, Boolean.valueOf(z));
        return gmVar;
    }
}
