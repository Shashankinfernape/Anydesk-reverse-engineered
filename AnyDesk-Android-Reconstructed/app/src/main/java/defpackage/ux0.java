package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 {
    public static final ux0 c;
    public static final /* synthetic */ ux0[] d;

    static {
        ux0 ux0Var = new ux0("LAUNCH_INITIAL_REFRESH", 0);
        c = ux0Var;
        d = new ux0[]{ux0Var, new ux0("SKIP_INITIAL_REFRESH", 1)};
    }

    public static ux0 valueOf(String str) {
        return (ux0) Enum.valueOf(ux0.class, str);
    }

    public static ux0[] values() {
        return (ux0[]) d.clone();
    }
}
