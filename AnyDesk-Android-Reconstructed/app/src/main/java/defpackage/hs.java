package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hs {
    public static final ft a;

    static {
        String property;
        o70 o70Var;
        ft ftVar;
        int i = k81.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            us usVar = su.a;
            o70Var = li0.a;
            o70 o70Var2 = o70Var.g;
            if (o70Var == null) {
                ftVar = o70Var;
                ftVar = gs.m;
            }
        } else {
            ftVar = gs.m;
        }
        ftVar = o70Var;
        a = ftVar;
    }
}
