package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lr {
    public static final lr c;
    public static final /* synthetic */ lr[] d;

    static {
        lr lrVar = new lr("COROUTINE_SUSPENDED", 0);
        c = lrVar;
        d = new lr[]{lrVar, new lr("UNDECIDED", 1), new lr("RESUMED", 2)};
    }

    public static lr valueOf(String str) {
        return (lr) Enum.valueOf(lr.class, str);
    }

    public static lr[] values() {
        return (lr[]) d.clone();
    }
}
