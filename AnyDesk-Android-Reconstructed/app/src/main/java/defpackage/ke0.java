package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ke0 {
    public static final ke0 c;
    public static final ke0 d;
    public static final ke0 e;
    public static final ke0 f;
    public static final ke0[] g;
    public static final /* synthetic */ ke0[] h;

    static {
        ke0 ke0Var = new ke0("UNUSED", 0);
        c = ke0Var;
        ke0 ke0Var2 = new ke0("RESTRICTED", 1);
        d = ke0Var2;
        ke0 ke0Var3 = new ke0("UNRESTRICTED", 2);
        e = ke0Var3;
        ke0 ke0Var4 = new ke0("SPECIAL", 3);
        f = ke0Var4;
        h = new ke0[]{ke0Var, ke0Var2, ke0Var3, ke0Var4};
        g = values();
    }

    public static ke0 valueOf(String str) {
        return (ke0) Enum.valueOf(ke0.class, str);
    }

    public static ke0[] values() {
        return (ke0[]) h.clone();
    }
}
