package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum fq {
    CHUNKED_SHA256(1, "SHA-256", 32),
    CHUNKED_SHA512(2, "SHA-512", 64),
    VERITY_CHUNKED_SHA256(3, "SHA-256", 32),
    SHA256(4, "SHA-256", 32);

    public final int c;
    public final String d;
    public final int e;

    fq(int i, String str, int i2) {
        this.c = i;
        this.d = str;
        this.e = i2;
    }
}
