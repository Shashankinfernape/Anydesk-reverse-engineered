package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements Serializable {
    public static final dm0 d = new dm0(1);
    public static final dm0 e = new dm0(2);
    public final int c;

    public dm0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dm0) {
            return this.c == ((dm0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
