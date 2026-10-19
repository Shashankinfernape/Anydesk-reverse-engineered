package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class dc1 implements Serializable {
    public final int c;

    public dc1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dc1) {
            return this.c == ((dc1) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
