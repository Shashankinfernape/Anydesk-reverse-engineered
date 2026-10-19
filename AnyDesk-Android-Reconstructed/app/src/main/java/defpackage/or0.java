package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or0 implements em {
    public final Class a;

    public or0(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof or0) {
            return this.a.equals(((or0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
