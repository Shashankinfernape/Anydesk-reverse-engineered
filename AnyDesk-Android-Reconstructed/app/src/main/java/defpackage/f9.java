package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class f9 implements Serializable {
    public static final f9 d = new f9(0);
    public static final f9 e = new f9(1);
    public static final f9 f = new f9(2);
    public static final f9 g = new f9(4);
    public static final f9 h = new f9(8);
    public static final f9 i = new f9(16);
    public static final f9 j = new f9(32);
    public static final f9 k = new f9(3);
    public static final f9 l = new f9(60);
    public final long c;

    public f9(long j2) {
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f9) {
            return this.c == ((f9) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.c;
        return (int) (j2 ^ (j2 >>> 32));
    }
}
