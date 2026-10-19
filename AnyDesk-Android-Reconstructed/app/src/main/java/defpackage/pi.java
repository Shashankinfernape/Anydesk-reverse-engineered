package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class pi implements xd0, Serializable {
    public transient xd0 c;
    public final Object d;
    public final Class e;
    public final String f;
    public final String g;
    public final boolean h;

    public pi(Object obj, Class cls, String str, String str2, boolean z) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.h = z;
    }

    public final em d() {
        boolean z = this.h;
        Class cls = this.e;
        if (!z) {
            return nx0.a(cls);
        }
        nx0.a.getClass();
        return new or0(cls);
    }
}
