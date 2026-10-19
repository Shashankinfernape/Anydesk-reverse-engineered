package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class e6 extends vn0 {
    public Intent i;
    public String j;

    public static String g(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return p71.R(str, "${applicationId}", packageName);
    }

    @Override // defpackage.vn0
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e6) && super.equals(obj)) {
            Intent intent = this.i;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((e6) obj).i);
            } else {
                zFilterEquals = ((e6) obj).i == null;
            }
            if (zFilterEquals && y90.e(this.j, ((e6) obj).j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vn0
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, vv0.a);
        typedArrayObtainAttributes.getClass();
        String strG = g(context, typedArrayObtainAttributes.getString(4));
        if (this.i == null) {
            this.i = new Intent();
        }
        Intent intent = this.i;
        intent.getClass();
        intent.setPackage(strG);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.i == null) {
                this.i = new Intent();
            }
            Intent intent2 = this.i;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.i == null) {
            this.i = new Intent();
        }
        Intent intent3 = this.i;
        intent3.getClass();
        intent3.setAction(string2);
        String strG2 = g(context, typedArrayObtainAttributes.getString(2));
        if (strG2 != null) {
            Uri uri = Uri.parse(strG2);
            if (this.i == null) {
                this.i = new Intent();
            }
            Intent intent4 = this.i;
            intent4.getClass();
            intent4.setData(uri);
        }
        this.j = g(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.vn0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.i;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.j;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.vn0
    public final String toString() {
        Intent intent = this.i;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.i;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
