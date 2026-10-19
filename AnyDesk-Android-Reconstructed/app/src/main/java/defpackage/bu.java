package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ze0.values().length];
        try {
            iArr[ze0.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ze0.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ze0.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ze0.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
