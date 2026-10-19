package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lh0 implements mh0 {
    public static final Locale[] c = new Locale[0];
    public final Locale[] a;
    public final String b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        kh0 kh0Var = kh0.b;
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            return;
        }
        if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else if (strArrSplit.length == 1) {
            new Locale(strArrSplit[0]);
        } else {
            id.q("Can not parse language tag: [en-Latn]");
        }
    }

    public lh0(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(q51.k(i, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb.toString();
    }

    @Override // defpackage.mh0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.mh0
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lh0)) {
            return false;
        }
        Locale[] localeArr = ((lh0) obj).a;
        Locale[] localeArr2 = this.a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mh0
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.a;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.mh0
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.mh0
    public final int size() {
        return this.a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}
