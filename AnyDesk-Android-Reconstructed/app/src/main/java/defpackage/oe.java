package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oe {
    public static final oe c;
    public static final oe d;
    public static final oe e;
    public static final /* synthetic */ oe[] f;

    static {
        oe oeVar = new oe("ANY", 0);
        c = oeVar;
        oe oeVar2 = new oe("CHOICE", 1);
        d = oeVar2;
        oe oeVar3 = new oe("INTEGER", 2);
        oe oeVar4 = new oe("OBJECT_IDENTIFIER", 3);
        oe oeVar5 = new oe("OCTET_STRING", 4);
        oe oeVar6 = new oe("SEQUENCE", 5);
        e = oeVar6;
        f = new oe[]{oeVar, oeVar2, oeVar3, oeVar4, oeVar5, oeVar6, new oe("SEQUENCE_OF", 6), new oe("SET_OF", 7), new oe("BIT_STRING", 8), new oe("UTC_TIME", 9), new oe("GENERALIZED_TIME", 10), new oe("BOOLEAN", 11), new oe("UNENCODED_CONTAINER", 12)};
    }

    public static oe valueOf(String str) {
        return (oe) Enum.valueOf(oe.class, str);
    }

    public static oe[] values() {
        return (oe[]) f.clone();
    }
}
