package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class c50 extends vn0 {
    public String i;

    @Override // defpackage.vn0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof c50) && super.equals(obj) && y90.e(this.i, ((c50) obj).i);
    }

    @Override // defpackage.vn0
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, xv0.b);
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

    @Override // defpackage.vn0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.i;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
