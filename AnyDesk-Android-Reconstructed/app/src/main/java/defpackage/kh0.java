package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class kh0 {
    public static final kh0 b = a(new Locale[0]);
    public final mh0 a;

    public kh0(mh0 mh0Var) {
        this.a = mh0Var;
    }

    public static kh0 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new kh0(new oh0(jf.e(localeArr))) : new kh0(new lh0(localeArr));
    }

    public static kh0 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = jh0.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kh0) {
            return this.a.equals(((kh0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
