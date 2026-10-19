package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 {
    public static final ue0 c;
    public static final /* synthetic */ ue0[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ue0 EF0;

    static {
        ue0 ue0Var = new ue0("SYNCHRONIZED", 0);
        ue0 ue0Var2 = new ue0("PUBLICATION", 1);
        ue0 ue0Var3 = new ue0("NONE", 2);
        c = ue0Var3;
        d = new ue0[]{ue0Var, ue0Var2, ue0Var3};
    }

    public static ue0 valueOf(String str) {
        return (ue0) Enum.valueOf(ue0.class, str);
    }

    public static ue0[] values() {
        return (ue0[]) d.clone();
    }
}
