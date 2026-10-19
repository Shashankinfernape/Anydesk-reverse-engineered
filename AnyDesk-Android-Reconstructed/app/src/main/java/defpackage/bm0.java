package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class bm0 implements Serializable {
    public final int c;

    public bm0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bm0) {
            return this.c == ((bm0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
