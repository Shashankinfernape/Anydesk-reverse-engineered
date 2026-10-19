package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nx0 {
    public static final ox0 a;

    static {
        ox0 ox0Var = null;
        try {
            ox0Var = (ox0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ox0Var == null) {
            ox0Var = new ox0();
        }
        a = ox0Var;
    }

    public static fm a(Class cls) {
        a.getClass();
        return new fm(cls);
    }
}
