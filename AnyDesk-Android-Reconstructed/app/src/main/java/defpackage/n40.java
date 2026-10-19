package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class n40 {
    public static final i51 b = new i51(0);
    public final /* synthetic */ t40 a;

    public n40(t40 t40Var) {
        this.a = t40Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        i51 i51Var = b;
        i51 i51Var2 = (i51) i51Var.get(classLoader);
        if (i51Var2 == null) {
            i51Var2 = new i51(0);
            i51Var.put(classLoader, i51Var2);
        }
        Class cls = (Class) i51Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        i51Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new pn(gr0.f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new pn(gr0.f("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final c40 a(String str) {
        try {
            return (c40) c(this.a.u.t.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new pn(gr0.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new pn(gr0.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new pn(gr0.f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new pn(gr0.f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
