package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class jo0 extends lo0 {
    public final Class r;

    public jo0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            nh0.f(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.lo0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable[]) bundle.get(str);
    }

    @Override // defpackage.lo0
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.lo0
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.lo0
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        str.getClass();
        this.r.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jo0.class.equals(obj.getClass())) {
            return false;
        }
        return y90.e(this.r, ((jo0) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
