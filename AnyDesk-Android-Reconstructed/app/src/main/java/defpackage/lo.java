package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class lo implements Serializable {
    public final byte c;

    public lo(byte b) {
        this.c = b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lo) {
            return this.c == ((lo) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
