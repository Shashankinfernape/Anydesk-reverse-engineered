package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class nm0 implements Serializable {
    public static final nm0 d = new nm0(0);
    public static final nm0 e = new nm0(1);
    public static final nm0 f = new nm0(2);
    public static final nm0 g = new nm0(4);
    public final int c;

    public nm0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nm0) {
            return this.c == ((nm0) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
