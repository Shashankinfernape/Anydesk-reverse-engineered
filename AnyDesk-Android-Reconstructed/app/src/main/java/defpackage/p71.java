package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p71 extends o71 {
    public static boolean N(String str, String str2) {
        return O(0, str, str2, false) >= 0;
    }

    public static final int O(int i, String str, String str2, boolean z) {
        char upperCase;
        char upperCase2;
        String str3;
        String str4;
        boolean z2;
        boolean zRegionMatches;
        str.getClass();
        if (!z) {
            return str.indexOf(str2, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        w90 w90Var = new w90(i, length, 1);
        boolean z3 = str instanceof String;
        int i2 = w90Var.d;
        if (z3) {
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    int length3 = str2.length();
                    if (z) {
                        str3 = str;
                        str4 = str2;
                        z2 = z;
                        zRegionMatches = str4.regionMatches(z2, 0, str3, i3, length3);
                    } else {
                        zRegionMatches = str2.regionMatches(0, str, i3, length3);
                        str3 = str;
                        str4 = str2;
                        z2 = z;
                    }
                    if (zRegionMatches) {
                        return i3;
                    }
                    if (i3 != i2) {
                        i3++;
                        str2 = str4;
                        z = z2;
                        str = str3;
                    }
                }
            }
        } else if (i <= i2) {
            while (true) {
                int length4 = str2.length();
                str.getClass();
                if (i >= 0 && str2.length() - length4 >= 0 && i <= str.length() - length4) {
                    for (int i4 = 0; i4 < length4; i4++) {
                        char cCharAt = str2.charAt(i4);
                        char cCharAt2 = str.charAt(i + i4);
                        if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    return i;
                }
                if (i != i2) {
                    i++;
                }
            }
        }
        return -1;
    }

    public static boolean P(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final List Q(String str) {
        yf0 yf0Var = new yf0(str);
        if (!yf0Var.hasNext()) {
            return mx.c;
        }
        Object next = yf0Var.next();
        if (!yf0Var.hasNext()) {
            return y90.J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (yf0Var.hasNext()) {
            arrayList.add(yf0Var.next());
        }
        return arrayList;
    }

    public static String R(String str, String str2, String str3) {
        str.getClass();
        int iO = O(0, str, str2, false);
        if (iO < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iO);
            sb.append(str3);
            i2 = iO + length;
            if (iO >= str.length()) {
                break;
            }
            iO = O(iO + i, str, str2, false);
        } while (iO > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static String S(String str, String str2) {
        int iO = O(0, str, str2, false);
        return iO == -1 ? str : str.substring(str2.length() + iO, str.length());
    }
}
