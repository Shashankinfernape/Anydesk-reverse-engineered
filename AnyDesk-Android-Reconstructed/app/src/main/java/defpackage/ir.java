package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ir {
    public static final ir c;
    public static final ir d;
    public static final ir e;
    public static final ir f;
    public static final ir g;
    public static final /* synthetic */ ir[] h;

    static {
        ir irVar = new ir("CPU_ACQUIRED", 0);
        c = irVar;
        ir irVar2 = new ir("BLOCKING", 1);
        d = irVar2;
        ir irVar3 = new ir("PARKING", 2);
        e = irVar3;
        ir irVar4 = new ir("DORMANT", 3);
        f = irVar4;
        ir irVar5 = new ir("TERMINATED", 4);
        g = irVar5;
        h = new ir[]{irVar, irVar2, irVar3, irVar4, irVar5};
    }

    public static ir valueOf(String str) {
        return (ir) Enum.valueOf(ir.class, str);
    }

    public static ir[] values() {
        return (ir[]) h.clone();
    }
}
