package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class gf implements Serializable {
    public final int c;

    public gf(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gf) {
            return this.c == ((gf) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
