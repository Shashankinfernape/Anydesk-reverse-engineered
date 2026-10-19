package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class py0 implements Serializable {
    public final Throwable c;

    public py0(Throwable th) {
        th.getClass();
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py0) {
            return y90.e(this.c, ((py0) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.c + ')';
    }
}
