package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class z81 implements Serializable {
    public final int c;

    public z81(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z81) {
            return this.c == ((z81) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
