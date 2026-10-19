package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class eu0 implements Serializable {
    public final int c;

    public eu0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eu0) {
            return this.c == ((eu0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
