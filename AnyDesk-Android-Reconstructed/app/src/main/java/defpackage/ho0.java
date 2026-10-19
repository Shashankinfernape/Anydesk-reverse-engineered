package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 extends lo0 {
    public final Class r;

    public ho0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            nh0.f(cls, " does not implement Parcelable.");
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
        return (Parcelable[]) bundle.get(str);
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

    @Override // defpackage.lo0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ho0.class.equals(obj.getClass())) {
            return false;
        }
        return y90.e(this.r, ((ho0) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
