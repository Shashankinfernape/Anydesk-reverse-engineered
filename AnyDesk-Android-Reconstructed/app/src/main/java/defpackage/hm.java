package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class hm {
    public final int a;
    public final Method b;

    public hm(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        return this.a == hmVar.a && this.b.getName().equals(hmVar.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
