package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ne {
    public static final ne c;
    public static final ne d;
    public static final ne e;
    public static final /* synthetic */ ne[] f;

    static {
        ne neVar = new ne("NORMAL", 0);
        c = neVar;
        ne neVar2 = new ne("EXPLICIT", 1);
        d = neVar2;
        ne neVar3 = new ne("IMPLICIT", 2);
        e = neVar3;
        f = new ne[]{neVar, neVar2, neVar3};
    }

    public static ne valueOf(String str) {
        return (ne) Enum.valueOf(ne.class, str);
    }

    public static ne[] values() {
        return (ne[]) f.clone();
    }
}
