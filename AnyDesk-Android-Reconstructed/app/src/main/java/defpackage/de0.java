package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class de0 implements Serializable {
    public static final de0 d = new de0(0);
    public static final de0 e = new de0(8);
    public final int c;

    public de0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof de0) {
            return this.c == ((de0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
