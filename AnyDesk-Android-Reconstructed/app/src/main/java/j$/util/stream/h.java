package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final h CONCURRENT;
    public static final h IDENTITY_FINISH;
    public static final h UNORDERED;
    public static final /* synthetic */ h[] a;

    static {
        h hVar = new h("CONCURRENT", 0);
        CONCURRENT = hVar;
        h hVar2 = new h("UNORDERED", 1);
        UNORDERED = hVar2;
        h hVar3 = new h("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = hVar3;
        a = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) a.clone();
    }
}
