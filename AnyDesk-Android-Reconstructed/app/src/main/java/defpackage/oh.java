package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oh {
    public static final oh c;
    public static final oh d;
    public static final oh e;
    public static final /* synthetic */ oh[] f;

    static {
        oh ohVar = new oh("SUSPEND", 0);
        c = ohVar;
        oh ohVar2 = new oh("DROP_OLDEST", 1);
        d = ohVar2;
        oh ohVar3 = new oh("DROP_LATEST", 2);
        e = ohVar3;
        f = new oh[]{ohVar, ohVar2, ohVar3};
    }

    public static oh valueOf(String str) {
        return (oh) Enum.valueOf(oh.class, str);
    }

    public static oh[] values() {
        return (oh[]) f.clone();
    }
}
