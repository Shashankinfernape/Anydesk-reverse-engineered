package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class af0 {
    public static final af0 c;
    public static final af0 d;
    public static final af0 e;
    public static final af0 f;
    public static final af0 g;
    public static final /* synthetic */ af0[] h;

    static {
        af0 af0Var = new af0("DESTROYED", 0);
        c = af0Var;
        af0 af0Var2 = new af0("INITIALIZED", 1);
        d = af0Var2;
        af0 af0Var3 = new af0("CREATED", 2);
        e = af0Var3;
        af0 af0Var4 = new af0("STARTED", 3);
        f = af0Var4;
        af0 af0Var5 = new af0("RESUMED", 4);
        g = af0Var5;
        h = new af0[]{af0Var, af0Var2, af0Var3, af0Var4, af0Var5};
    }

    public static af0 valueOf(String str) {
        return (af0) Enum.valueOf(af0.class, str);
    }

    public static af0[] values() {
        return (af0[]) h.clone();
    }
}
