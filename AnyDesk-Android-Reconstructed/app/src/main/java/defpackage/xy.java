package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xy implements Serializable {
    public final int c;

    public xy(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xy) {
            return this.c == ((xy) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
