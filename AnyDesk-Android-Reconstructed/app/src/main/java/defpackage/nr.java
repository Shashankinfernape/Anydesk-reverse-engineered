package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nr {
    public static final nr c;
    public static final nr d;
    public static final nr e;
    public static final nr f;
    public static final /* synthetic */ nr[] g;

    static {
        nr nrVar = new nr("DEFAULT", 0);
        c = nrVar;
        nr nrVar2 = new nr("LAZY", 1);
        d = nrVar2;
        nr nrVar3 = new nr("ATOMIC", 2);
        e = nrVar3;
        nr nrVar4 = new nr("UNDISPATCHED", 3);
        f = nrVar4;
        g = new nr[]{nrVar, nrVar2, nrVar3, nrVar4};
    }

    public static nr valueOf(String str) {
        return (nr) Enum.valueOf(nr.class, str);
    }

    public static nr[] values() {
        return (nr[]) g.clone();
    }
}
