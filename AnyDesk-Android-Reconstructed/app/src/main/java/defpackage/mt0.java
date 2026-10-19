package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mt0 extends ot0 {
    public final Exception c;

    public mt0(Exception exc) {
        this.c = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt0) && this.c.equals(((mt0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return j71.M("LoadResult.Error(\n                    |   throwable: " + this.c + "\n                    |) ");
    }
}
