package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class wd1 {
    public final xd a;
    public final xd b;
    public final xd c;

    public wd1(xd xdVar, xd xdVar2, xd xdVar3) {
        this.a = xdVar;
        this.b = xdVar2;
        this.c = xdVar3;
    }

    public abstract xd1 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        xd xdVar = this.c;
        Class cls2 = (Class) xdVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        xdVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        xd xdVar = this.a;
        Method method = (Method) xdVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, wd1.class.getClassLoader()).getDeclaredMethod("read", wd1.class);
        xdVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        xd xdVar = this.b;
        Method method = (Method) xdVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, wd1.class);
        xdVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((xd1) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((xd1) this).e.readParcelable(xd1.class.getClassLoader());
    }

    public final yd1 h() {
        String string = ((xd1) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (yd1) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((xd1) this).e.writeInt(i);
    }

    public final void k(yd1 yd1Var) {
        if (yd1Var == null) {
            ((xd1) this).e.writeString(null);
            return;
        }
        try {
            ((xd1) this).e.writeString(b(yd1Var.getClass()).getName());
            xd1 xd1VarA = a();
            try {
                d(yd1Var.getClass()).invoke(null, yd1Var, xd1VarA);
                Parcel parcel = xd1VarA.e;
                int i = xd1VarA.i;
                if (i >= 0) {
                    int i2 = xd1VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(yd1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
