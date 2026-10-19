package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j81 implements Serializable {
    public static final j81 d = new j81(0);
    public final int c;

    public j81(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j81) {
            return this.c == ((j81) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
