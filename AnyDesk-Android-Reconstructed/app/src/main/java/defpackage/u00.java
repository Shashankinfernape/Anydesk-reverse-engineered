package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u00 {
    public final float a;
    public final int b;

    public u00(int i, float f) {
        this.a = Math.max(0.0f, Math.min(1.0f, f));
        this.b = i;
    }

    public u00() {
        this(1, 1.0f);
    }
}
