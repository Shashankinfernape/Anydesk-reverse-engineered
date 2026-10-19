package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class io0 extends lo0 {
    public final Class r;

    public io0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            nh0.f(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.lo0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.lo0
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.lo0
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.lo0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !io0.class.equals(obj.getClass())) {
            return false;
        }
        return y90.e(this.r, ((io0) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
