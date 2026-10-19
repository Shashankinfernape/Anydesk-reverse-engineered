package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xg0 {
    public static final xg0 c;
    public static final xg0 d;
    public static final xg0 e;
    public static final /* synthetic */ xg0[] f;

    static {
        xg0 xg0Var = new xg0("REFRESH", 0);
        c = xg0Var;
        xg0 xg0Var2 = new xg0("PREPEND", 1);
        d = xg0Var2;
        xg0 xg0Var3 = new xg0("APPEND", 2);
        e = xg0Var3;
        f = new xg0[]{xg0Var, xg0Var2, xg0Var3};
    }

    public static xg0 valueOf(String str) {
        return (xg0) Enum.valueOf(xg0.class, str);
    }

    public static xg0[] values() {
        return (xg0[]) f.clone();
    }
}
