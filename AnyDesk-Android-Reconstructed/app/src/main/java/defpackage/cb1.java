package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb1 {
    public static final cb1 b = new cb1(1);
    public static final cb1 c = new cb1(2);
    public static final cb1 d = new cb1(3);
    public static final cb1 e = new cb1(4);
    public static final cb1 f = new cb1(5);
    public final /* synthetic */ int a;

    public /* synthetic */ cb1(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }
}
