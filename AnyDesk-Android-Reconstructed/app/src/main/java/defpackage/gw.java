package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class gw implements Serializable {
    public final long c;

    public gw(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gw) {
            return this.c == ((gw) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }
}
