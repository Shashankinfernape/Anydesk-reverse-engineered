package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class n11 implements Serializable {
    public static final n11 d = new n11(0);
    public final int c;

    public n11(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n11) {
            return this.c == ((n11) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
