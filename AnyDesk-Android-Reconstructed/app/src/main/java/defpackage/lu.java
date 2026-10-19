package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lu {
    public static final lu c;
    public static final lu d;
    public static final lu e;
    public static final /* synthetic */ lu[] f;

    static {
        lu luVar = new lu("ITEM_TO_PLACEHOLDER", 0);
        c = luVar;
        lu luVar2 = new lu("PLACEHOLDER_TO_ITEM", 1);
        d = luVar2;
        lu luVar3 = new lu("PLACEHOLDER_POSITION_CHANGE", 2);
        e = luVar3;
        f = new lu[]{luVar, luVar2, luVar3};
    }

    public static lu valueOf(String str) {
        return (lu) Enum.valueOf(lu.class, str);
    }

    public static lu[] values() {
        return (lu[]) f.clone();
    }
}
