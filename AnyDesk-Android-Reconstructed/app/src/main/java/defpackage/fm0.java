package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class fm0 implements Serializable {
    public static final fm0 d = new fm0(0);
    public static final fm0 e = new fm0(1);
    public static final fm0 f = new fm0(2);
    public static final fm0 g = new fm0(4);
    public static final fm0 h = new fm0(8);
    public static final fm0 i = new fm0(16);
    public static final fm0 j = new fm0(32);
    public static final fm0 k = new fm0(64);
    public final int c;

    public fm0(int i2) {
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fm0) {
            return this.c == ((fm0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
