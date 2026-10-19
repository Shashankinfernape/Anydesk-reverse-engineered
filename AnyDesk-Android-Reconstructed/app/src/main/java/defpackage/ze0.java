package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 {
    private static final /* synthetic */ tx $ENTRIES;
    private static final /* synthetic */ ze0[] $VALUES;
    public static final xe0 Companion;
    public static final ze0 ON_ANY;
    public static final ze0 ON_CREATE;
    public static final ze0 ON_DESTROY;
    public static final ze0 ON_PAUSE;
    public static final ze0 ON_RESUME;
    public static final ze0 ON_START;
    public static final ze0 ON_STOP;

    static {
        ze0 ze0Var = new ze0("ON_CREATE", 0);
        ON_CREATE = ze0Var;
        ze0 ze0Var2 = new ze0("ON_START", 1);
        ON_START = ze0Var2;
        ze0 ze0Var3 = new ze0("ON_RESUME", 2);
        ON_RESUME = ze0Var3;
        ze0 ze0Var4 = new ze0("ON_PAUSE", 3);
        ON_PAUSE = ze0Var4;
        ze0 ze0Var5 = new ze0("ON_STOP", 4);
        ON_STOP = ze0Var5;
        ze0 ze0Var6 = new ze0("ON_DESTROY", 5);
        ON_DESTROY = ze0Var6;
        ze0 ze0Var7 = new ze0("ON_ANY", 6);
        ON_ANY = ze0Var7;
        ze0[] ze0VarArr = {ze0Var, ze0Var2, ze0Var3, ze0Var4, ze0Var5, ze0Var6, ze0Var7};
        $VALUES = ze0VarArr;
        $ENTRIES = new ux(ze0VarArr);
        Companion = new xe0();
    }

    public static ze0 valueOf(String str) {
        return (ze0) Enum.valueOf(ze0.class, str);
    }

    public static ze0[] values() {
        return (ze0[]) $VALUES.clone();
    }

    public final af0 a() {
        switch (ye0.a[ordinal()]) {
            case 1:
            case 2:
                return af0.e;
            case 3:
            case 4:
                return af0.f;
            case 5:
                return af0.g;
            case 6:
                return af0.c;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new pn();
        }
    }
}
