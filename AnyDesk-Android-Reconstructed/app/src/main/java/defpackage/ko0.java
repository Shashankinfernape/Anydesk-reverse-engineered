package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ko0 extends lo0 {
    public final Class r;

    public ko0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            nh0.f(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            nh0.f(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.r = cls;
    }

    @Override // defpackage.lo0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.lo0
    public String b() {
        return this.r.getName();
    }

    @Override // defpackage.lo0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko0)) {
            return false;
        }
        return y90.e(this.r, ((ko0) obj).r);
    }

    @Override // defpackage.lo0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public ko0(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            nh0.f(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
