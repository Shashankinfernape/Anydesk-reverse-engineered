package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class me {
    public static final me c;
    public static final me d;
    public static final me e;
    public static final /* synthetic */ me[] f;

    static {
        me meVar = new me("UNIVERSAL", 0);
        c = meVar;
        me meVar2 = new me("APPLICATION", 1);
        me meVar3 = new me("CONTEXT_SPECIFIC", 2);
        d = meVar3;
        me meVar4 = new me("PRIVATE", 3);
        me meVar5 = new me("AUTOMATIC", 4);
        e = meVar5;
        f = new me[]{meVar, meVar2, meVar3, meVar4, meVar5};
    }

    public static me valueOf(String str) {
        return (me) Enum.valueOf(me.class, str);
    }

    public static me[] values() {
        return (me[]) f.clone();
    }
}
