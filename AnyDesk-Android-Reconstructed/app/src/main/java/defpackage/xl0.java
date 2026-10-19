package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements Serializable {
    public final int c;

    public xl0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xl0) {
            return this.c == ((xl0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
