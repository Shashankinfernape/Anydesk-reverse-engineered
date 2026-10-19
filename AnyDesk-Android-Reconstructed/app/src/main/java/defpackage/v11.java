package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v11 {
    public static final v11 c;
    public static final v11 d;
    public static final v11 e;
    public static final /* synthetic */ v11[] f;

    static {
        v11 v11Var = new v11("NONE", 0);
        c = v11Var;
        v11 v11Var2 = new v11("TELEMETRY", 1);
        d = v11Var2;
        v11 v11Var3 = new v11("SET_PASSWORD", 2);
        e = v11Var3;
        f = new v11[]{v11Var, v11Var2, v11Var3};
    }

    public static v11 valueOf(String str) {
        return (v11) Enum.valueOf(v11.class, str);
    }

    public static v11[] values() {
        return (v11[]) f.clone();
    }
}
