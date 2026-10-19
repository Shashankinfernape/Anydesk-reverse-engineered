package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class wy implements Serializable {
    public final int c;

    public wy(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wy) {
            return this.c == ((wy) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
