package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class au extends vn0 {
    public String i;

    @Override // defpackage.vn0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof au) && super.equals(obj) && y90.e(this.i, ((au) obj).i);
    }

    @Override // defpackage.vn0
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, xv0.a);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.i = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.vn0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
