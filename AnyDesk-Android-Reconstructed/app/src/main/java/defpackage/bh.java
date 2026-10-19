package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bh {
    public CharSequence c = null;
    public CharSequence d = null;
    public boolean a = false;
    public int b = 0;

    public bh a() {
        String strValueOf;
        if (TextUtils.isEmpty((String) this.c)) {
            id.q("Title must be set and non-empty.");
            return null;
        }
        if (!y90.I(this.b)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            int i = this.b;
            if (i == 15) {
                strValueOf = "BIOMETRIC_STRONG";
            } else if (i == 255) {
                strValueOf = "BIOMETRIC_WEAK";
            } else if (i == 32768) {
                strValueOf = "DEVICE_CREDENTIAL";
            } else if (i != 32783) {
                strValueOf = i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
            } else {
                strValueOf = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
            }
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.b;
        boolean zG = i2 != 0 ? y90.G(i2) : this.a;
        if (TextUtils.isEmpty(null) && !zG) {
            id.q("Negative text must be set and non-empty.");
            return null;
        }
        if (!TextUtils.isEmpty(null) && zG) {
            id.q("Negative text must not be set if device credential authentication is allowed.");
            return null;
        }
        String str = (String) this.c;
        String str2 = (String) this.d;
        boolean z = this.a;
        int i3 = this.b;
        bh bhVar = new bh();
        bhVar.c = str;
        bhVar.d = str2;
        bhVar.a = z;
        bhVar.b = i3;
        return bhVar;
    }
}
