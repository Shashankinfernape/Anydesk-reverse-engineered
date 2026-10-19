package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class az0 implements Serializable {
    public final short c;

    public az0(short s) {
        this.c = s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof az0) {
            return this.c == ((az0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
